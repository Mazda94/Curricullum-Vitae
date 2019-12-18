
package com.mazda94.allicv.Model.Profile;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Profile implements Parcelable
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
    private Data data;
    public final static Parcelable.Creator<Profile> CREATOR = new Creator<Profile>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Profile createFromParcel(Parcel in) {
            Profile instance = new Profile();
            instance.status = ((int) in.readValue((int.class.getClassLoader())));
            instance.pesan = ((String) in.readValue((String.class.getClassLoader())));
            instance.judul = ((String) in.readValue((String.class.getClassLoader())));
            instance.data = ((Data) in.readValue((Data.class.getClassLoader())));
            return instance;
        }

        public Profile[] newArray(int size) {
            return (new Profile[size]);
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
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(pesan);
        dest.writeValue(judul);
        dest.writeValue(data);
    }

    public int describeContents() {
        return  0;
    }

}
