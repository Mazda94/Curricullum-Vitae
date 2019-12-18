
package com.mazda94.allicv.Model.Project;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ProjectData implements Parcelable
{

    @SerializedName("project_name")
    @Expose
    private String projectName;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("project_owner")
    @Expose
    private String projectOwner;
    @SerializedName("deskripsi")
    @Expose
    private String deskripsi;
    @SerializedName("teknologi")
    @Expose
    private List<String> teknologi = new ArrayList<String>();
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("screenshoot")
    @Expose
    private List<Object> screenshoot = new ArrayList<Object>();
    public final static Parcelable.Creator<ProjectData> CREATOR = new Creator<ProjectData>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ProjectData createFromParcel(Parcel in) {
            ProjectData instance = new ProjectData();
            instance.projectName = ((String) in.readValue((String.class.getClassLoader())));
            instance.platform = ((String) in.readValue((String.class.getClassLoader())));
            instance.projectOwner = ((String) in.readValue((String.class.getClassLoader())));
            instance.deskripsi = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.teknologi, (java.lang.String.class.getClassLoader()));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.screenshoot, (java.lang.Object.class.getClassLoader()));
            return instance;
        }

        public ProjectData[] newArray(int size) {
            return (new ProjectData[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     * @param projectName
     *     The project_name
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 
     * @return
     *     The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * @param platform
     *     The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 
     * @return
     *     The projectOwner
     */
    public String getProjectOwner() {
        return projectOwner;
    }

    /**
     * 
     * @param projectOwner
     *     The project_owner
     */
    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    /**
     * 
     * @return
     *     The deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * 
     * @param deskripsi
     *     The deskripsi
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    /**
     * 
     * @return
     *     The teknologi
     */
    public List<String> getTeknologi() {
        return teknologi;
    }

    /**
     * 
     * @param teknologi
     *     The teknologi
     */
    public void setTeknologi(List<String> teknologi) {
        this.teknologi = teknologi;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The screenshoot
     */
    public List<Object> getScreenshoot() {
        return screenshoot;
    }

    /**
     * 
     * @param screenshoot
     *     The screenshoot
     */
    public void setScreenshoot(List<Object> screenshoot) {
        this.screenshoot = screenshoot;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(projectName);
        dest.writeValue(platform);
        dest.writeValue(projectOwner);
        dest.writeValue(deskripsi);
        dest.writeList(teknologi);
        dest.writeValue(status);
        dest.writeList(screenshoot);
    }

    public int describeContents() {
        return  0;
    }

}
