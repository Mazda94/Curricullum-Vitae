package com.mazda94.allicv.Presenter;

import com.mazda94.allicv.Model.Education.EducationData;
import com.mazda94.allicv.Model.Experiences.ExperienceData;
import com.mazda94.allicv.Model.Profile.Profile;
import com.mazda94.allicv.Model.Project.ProjectData;

import java.util.List;

public interface HomeInterface {
    void onSuccesGetData(List<EducationData> educations, List<ExperienceData> data, List<ProjectData> projectData);

    void getTime(String message);

    void onGetDataProfile(Profile profile);
}
