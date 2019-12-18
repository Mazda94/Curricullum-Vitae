
package com.mazda94.allicv.Model.Experiences;

import javax.annotation.Generated;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ExperienceData implements Parcelable
{

    @SerializedName("id_experience")
    @Expose
    private int idExperience;
    @SerializedName("nama_perusahaan")
    @Expose
    private String namaPerusahaan;
    @SerializedName("jabatan")
    @Expose
    private String jabatan;
    @SerializedName("mulai")
    @Expose
    private int mulai;
    @SerializedName("berakhir")
    @Expose
    private int berakhir;
    @SerializedName("logo_perusahaan")
    @Expose
    private String logoPerusahaan;
    public final static Parcelable.Creator<ExperienceData> CREATOR = new Creator<ExperienceData>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ExperienceData createFromParcel(Parcel in) {
            ExperienceData instance = new ExperienceData();
            instance.idExperience = ((int) in.readValue((int.class.getClassLoader())));
            instance.namaPerusahaan = ((String) in.readValue((String.class.getClassLoader())));
            instance.jabatan = ((String) in.readValue((String.class.getClassLoader())));
            instance.mulai = ((int) in.readValue((int.class.getClassLoader())));
            instance.berakhir = ((int) in.readValue((int.class.getClassLoader())));
            instance.logoPerusahaan = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public ExperienceData[] newArray(int size) {
            return (new ExperienceData[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The idExperience
     */
    public int getIdExperience() {
        return idExperience;
    }

    /**
     * 
     * @param idExperience
     *     The id_experience
     */
    public void setIdExperience(int idExperience) {
        this.idExperience = idExperience;
    }

    /**
     * 
     * @return
     *     The namaPerusahaan
     */
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    /**
     * 
     * @param namaPerusahaan
     *     The nama_perusahaan
     */
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    /**
     * 
     * @return
     *     The jabatan
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * 
     * @param jabatan
     *     The jabatan
     */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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
     *     The berakhir
     */
    public int getBerakhir() {
        return berakhir;
    }

    /**
     * 
     * @param berakhir
     *     The berakhir
     */
    public void setBerakhir(int berakhir) {
        this.berakhir = berakhir;
    }

    /**
     * 
     * @return
     *     The logoPerusahaan
     */
    public String getLogoPerusahaan() {
        return logoPerusahaan;
    }

    /**
     * 
     * @param logoPerusahaan
     *     The logo_perusahaan
     */
    public void setLogoPerusahaan(String logoPerusahaan) {
        this.logoPerusahaan = logoPerusahaan;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(idExperience);
        dest.writeValue(namaPerusahaan);
        dest.writeValue(jabatan);
        dest.writeValue(mulai);
        dest.writeValue(berakhir);
        dest.writeValue(logoPerusahaan);
    }

    public int describeContents() {
        return  0;
    }

}
