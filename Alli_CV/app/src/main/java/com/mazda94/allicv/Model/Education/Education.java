
package com.mazda94.allicv.Model.Education;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Education implements Parcelable
{

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("judul")
    @Expose
    private String judul;
    @SerializedName("data")
    @Expose
    private List<EducationData> data = new ArrayList<EducationData>();
    public final static Parcelable.Creator<Education> CREATOR = new Creator<Education>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Education createFromParcel(Parcel in) {
            Education instance = new Education();
            instance.status = ((int) in.readValue((int.class.getClassLoader())));
            instance.pesan = ((String) in.readValue((String.class.getClassLoader())));
            instance.judul = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.data, (EducationData.class.getClassLoader()));
            return instance;
        }

        public Education[] newArray(int size) {
            return (new Education[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The pesan
     */
    public String getPesan() {
        return pesan;
    }

    /**
     * 
     * @param pesan
     *     The pesan
     */
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    /**
     * 
     * @return
     *     The judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * 
     * @param judul
     *     The judul
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<EducationData> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<EducationData> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(pesan);
        dest.writeValue(judul);
        dest.writeList(data);
    }

    public int describeContents() {
        return  0;
    }

}
