package com.mazda94.allicv.View;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mazda94.allicv.Adapter.EduAdapter;
import com.mazda94.allicv.Adapter.ExperienceAdapter;
import com.mazda94.allicv.Adapter.ProjectAdapter;
import com.mazda94.allicv.Model.Education.EducationData;
import com.mazda94.allicv.Model.Experiences.ExperienceData;
import com.mazda94.allicv.Model.Profile.Data;
import com.mazda94.allicv.Model.Profile.Profile;
import com.mazda94.allicv.Model.Project.ProjectData;
import com.mazda94.allicv.Presenter.HomeInterface;
import com.mazda94.allicv.Presenter.HomePresenter;
import com.mazda94.allicv.R;
import com.mazda94.allicv.Support.Helper;

import java.util.List;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class Home extends AppCompatActivity implements HomeInterface {
    private static final String TAG = Home.class.getSimpleName();
    private Home context = Home.this;
    private Helper helper;
    private View view;
    private RecyclerView rvEducation, rvExperience, rvProject;
    private List<EducationData> educationData;
    private List<ExperienceData> experienceData;
    private List<ProjectData> projectData;
    private EduAdapter.ItemClickListener eduListener;
    private ExperienceAdapter.ItemClickListener expListener;
    private ProjectAdapter.ItemClickListener proListener;
    private ShimmerLayout shimmerEdu, shimmerExp, shimmerProfile, shimmerProject;
    private Profile profile;
    TextView fullname;
    TextView origin;
    TextView nationality;
    TextView aboutUs;
    TextView dateBirth;
    TextView hobby;
    TextView address;
    LinearLayout layoutShimmer;
    TextView welcomeMessage;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );
        helper = new Helper();
        HomePresenter presenter = new HomePresenter( this, context );
        presenter.getData();
        presenter.welcomeMessage();

        shimmerEdu = findViewById( R.id.shimmer );
        shimmerExp = findViewById( R.id.shimmer_exp );
        shimmerProject = findViewById( R.id.shimmer_project);
        shimmerEdu.startShimmerAnimation();
        shimmerExp.startShimmerAnimation();
        shimmerProject.startShimmerAnimation();

        rvEducation = findViewById( R.id.rv_education );
        rvExperience = findViewById( R.id.rv_experiences );
        rvProject = findViewById( R.id.rv_project);
        rvEducation.setLayoutManager( new LinearLayoutManager( Home.this, RecyclerView.HORIZONTAL, false ) );
        rvExperience.setLayoutManager( new LinearLayoutManager( Home.this, RecyclerView.HORIZONTAL, false ) );
        rvProject.setLayoutManager( new GridLayoutManager( Home.this, 2, RecyclerView.VERTICAL, false ) );

        findViewById( R.id.card_profile ).setOnClickListener( v -> {
            presenter.getProfileData();
            view = getLayoutInflater().inflate( R.layout.dialog_profile, null );
            view.findViewById( R.id.small_img ).setClipToOutline( true );

            layoutShimmer = view.findViewById( R.id.shimmer_layout );
            shimmerProfile = view.findViewById( R.id.shimmer_profile );
            fullname = view.findViewById( R.id.full_name );
            origin = view.findViewById( R.id.origin );
            nationality = view.findViewById( R.id.nation );
            aboutUs = view.findViewById( R.id.about_us );
            dateBirth = view.findViewById( R.id.date_birth );
            hobby = view.findViewById( R.id.hobby );
            address = view.findViewById( R.id.address );

            helper.showFullDialog( context, view );
            shimmerProfile.startShimmerAnimation();

        } );
        findViewById( R.id.card_skill ).setOnClickListener( v -> {
            view = getLayoutInflater().inflate( R.layout.dialog_skill, null );
            helper.showFullDialog( context, view );
        } );

        eduListener = (v, position) -> {
            Log.d( TAG, "onCreate: " + educationData.get( position ).getNama() );
        };

        expListener = (v, position) -> {
            Log.d( TAG, "onCreate: " + experienceData.get( position ).getJabatan() );
        };

        proListener = (v, position) -> {
            Log.d( TAG, "onCreate: " + projectData.get( position ).getDeskripsi() );
        };
    }

    @Override
    public void onSuccesGetData(List<EducationData> educations, List<ExperienceData> experiences, List<ProjectData> projectData) {
        shimmerEdu.stopShimmerAnimation();
        shimmerEdu.setVisibility( View.GONE );
        shimmerExp.stopShimmerAnimation();
        shimmerExp.setVisibility( View.GONE );
        shimmerProject.stopShimmerAnimation();
        shimmerProject.setVisibility( View.GONE );

        EduAdapter eduAdapter = new EduAdapter( educations, context, eduListener );
        eduAdapter.notifyDataSetChanged();
        rvEducation.setAdapter( eduAdapter );
        this.educationData = educations;

        ExperienceAdapter expAdapter = new ExperienceAdapter( experiences, context, expListener );
        expAdapter.notifyDataSetChanged();
        rvExperience.setAdapter( expAdapter );
        this.experienceData = experiences;

        ProjectAdapter projectAdapter = new ProjectAdapter( projectData, context, proListener );
        projectAdapter.notifyDataSetChanged();
        rvProject.setAdapter( projectAdapter );
        this.projectData = projectData;
    }

    @Override
    public void getTime(String message) {
        Log.d( TAG, "getTime: " + message );
        welcomeMessage = findViewById( R.id.welcome_message );
        welcomeMessage.setText( message );
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onGetDataProfile(Profile profile) {
        shimmerProfile.stopShimmerAnimation();
        shimmerProfile.setVisibility( View.GONE );
        layoutShimmer.setVisibility( View.GONE );
        this.profile = profile;
        Data data = profile.getData();
        fullname.setText( data.getNamaLengkap() );
        origin.setText( data.getAsal() );
        nationality.setText( data.getKewarganegaraan() );
        aboutUs.setText( data.getTentangSaya() );
        dateBirth.setText( data.getTempatLahir().concat( ", " + data.getTanggalLahir() ) );
        hobby.setText( String.join( ", ", data.getHobi() ) );
        address.setText( data.getAlamat() );
    }
}