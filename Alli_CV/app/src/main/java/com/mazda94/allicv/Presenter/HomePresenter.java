package com.mazda94.allicv.Presenter;

import android.content.Context;
import android.os.CountDownTimer;

import com.google.gson.Gson;
import com.mazda94.allicv.Model.Education.Education;
import com.mazda94.allicv.Model.Experiences.Experience;
import com.mazda94.allicv.Model.Profile.Profile;
import com.mazda94.allicv.Model.Project.Project;
import com.mazda94.allicv.Support.Helper;

import java.util.Date;

public class HomePresenter {
    private HomeInterface homeInterface;
    private Context context;
    private Helper helper;

    public HomePresenter(HomeInterface homeInterface, Context context) {
        this.homeInterface = homeInterface;
        this.context = context;
        helper = new Helper();
    }

    public void getData() {
        Education education = new Gson().fromJson( helper.getAssets( context, "education.json" ), Education.class );
        Experience experience = new Gson().fromJson( helper.getAssets( context, "experience.json" ), Experience.class );
        Project project = new Gson().fromJson( helper.getAssets( context, "project.json" ), Project.class );
        new CountDownTimer( 3000, 1000 ) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                homeInterface.onSuccesGetData( education.getData(), experience.getData(), project.getData() );
            }
        }.start();
    }

    public void getProfileData() {
        Profile profile = new Gson().fromJson( helper.getAssets( context, "profile.json" ), Profile.class );
        new CountDownTimer( 3000, 1000 ) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                homeInterface.onGetDataProfile( profile );
            }
        }.start();
    }

    public void welcomeMessage() {
        if (new Date().getHours() > 0 && new Date().getHours() < 12) {
            homeInterface.getTime( "Selamat Pagi, Recruiter . . ." );
        } else if (new Date().getHours() >= 12 && new Date().getHours() < 18) {
            homeInterface.getTime( "Selamat Sore, Recruiter . . ." );
        } else if (new Date().getHours() >= 18 && new Date().getHours() < 24) {
            homeInterface.getTime( "Selamat Malam, Recruiter . . ." );
        }
    }
}
