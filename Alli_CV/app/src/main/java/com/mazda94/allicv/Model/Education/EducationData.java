
package com.mazda94.allicv.Model.Education;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EducationData implements Parcelable
{

    @SerializedName("id_education")
    @Expose
    private int idEducation;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("tingkat")
    @Expose
    private String tingkat;
    @SerializedName("mulai")
    @Expose
    private int mulai;
    @SerializedName("lulus")
    @Expose
    private int lulus;
    @SerializedName("img")
    @Expose
    private String img;
    public final static Parcelable.Creator<EducationData> CREATOR = new Creator<EducationData>() {


        @SuppressWarnings({
            "unchecked"
        })
        public EducationData createFromParcel(Parcel in) {
            EducationData instance = new EducationData();
            instance.idEducation = ((int) in.readValue((int.class.getClassLoader())));
            instance.nama = ((String) in.readValue((String.class.getClassLoader())));
            instance.tingkat = ((String) in.readValue((String.class.getClassLoader())));
            instance.mulai = ((int) in.readValue((int.class.getClassLoader())));
            instance.lulus = ((int) in.readValue((int.class.getClassLoader())));
            instance.img = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public EducationData[] newArray(int size) {
            return (new EducationData[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The idEducation
     */
    public int getIdEducation() {
        return idEducation;
    }

    /**
     * 
     * @param idEducation
     *     The id_education
     */
    public void setIdEducation(int idEducation) {
        this.idEducation = idEducation;
    }

    /**
     * 
     * @return
     *     The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama
     *     The nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return
     *     The tingkat
     */
    public String getTingkat() {
        return tingkat;
    }

    /**
     * 
     * @param tingkat
     *     The tingkat
     */
    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    /**
     * 
     * @return
     *     The mulai
     */
    public int getMulai() {
        return mulai;
    }

    /**
     * 
     * @param mulai
     *     The mulai
     */
    public void setMulai(int mulai) {
        this.mulai = mulai;
    }

    /**
     * 
     * @return
     *     The lulus
     */
    public int getLulus() {
        return lulus;
    }

    /**
     * 
     * @param lulus
     *     The lulus
     */
    public void setLulus(int lulus) {
        this.lulus = lulus;
    }

    /**
     * 
     * @return
     *     The img
     */
    public String getImg() {
        return img;
    }

    /**
     * 
     * @param img
     *     The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(idEducation);
        dest.writeValue(nama);
        dest.writeValue(tingkat);
        dest.writeValue(mulai);
        dest.writeValue(lulus);
        dest.writeValue(img);
    }

    public int describeContents() {
        return  0;
    }

}
