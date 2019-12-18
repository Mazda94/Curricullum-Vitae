
package com.mazda94.allicv.Model.Profile;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Data implements Parcelable
{

    @SerializedName("nama_lengkap")
    @Expose
    private String namaLengkap;
    @SerializedName("tempat_lahir")
    @Expose
    private String tempatLahir;
    @SerializedName("tanggal_lahir")
    @Expose
    private String tanggalLahir;
    @SerializedName("kewarganegaraan")
    @Expose
    private String kewarganegaraan;
    @SerializedName("asal")
    @Expose
    private String asal;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("hobi")
    @Expose
    private List<String> hobi = new ArrayList<String>();
    @SerializedName("tentang_saya")
    @Expose
    private String tentangSaya;
    public final static Parcelable.Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            Data instance = new Data();
            instance.namaLengkap = ((String) in.readValue((String.class.getClassLoader())));
            instance.tempatLahir = ((String) in.readValue((String.class.getClassLoader())));
            instance.tanggalLahir = ((String) in.readValue((String.class.getClassLoader())));
            instance.kewarganegaraan = ((String) in.readValue((String.class.getClassLoader())));
            instance.asal = ((String) in.readValue((String.class.getClassLoader())));
            instance.alamat = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.hobi, (java.lang.String.class.getClassLoader()));
            instance.tentangSaya = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The namaLengkap
     */
    public String getNamaLengkap() {
        return namaLengkap;
    }

    /**
     * 
     * @param namaLengkap
     *     The nama_lengkap
     */
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    /**
     * 
     * @return
     *     The tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * 
     * @param tempatLahir
     *     The tempat_lahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * 
     * @return
     *     The tanggalLahir
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * 
     * @param tanggalLahir
     *     The tanggal_lahir
     */
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * 
     * @return
     *     The kewarganegaraan
     */
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    /**
     * 
     * @param kewarganegaraan
     *     The kewarganegaraan
     */
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    /**
     * 
     * @return
     *     The asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * 
     * @param asal
     *     The asal
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }

    /**
     * 
     * @return
     *     The alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * 
     * @param alamat
     *     The alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * 
     * @return
     *     The hobi
     */
    public List<String> getHobi() {
        return hobi;
    }

    /**
     * 
     * @param hobi
     *     The hobi
     */
    public void setHobi(List<String> hobi) {
        this.hobi = hobi;
    }

    /**
     * 
     * @return
     *     The tentangSaya
     */
    public String getTentangSaya() {
        return tentangSaya;
    }

    /**
     * 
     * @param tentangSaya
     *     The tentang_saya
     */
    public void setTentangSaya(String tentangSaya) {
        this.tentangSaya = tentangSaya;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(namaLengkap);
        dest.writeValue(tempatLahir);
        dest.writeValue(tanggalLahir);
        dest.writeValue(kewarganegaraan);
        dest.writeValue(asal);
        dest.writeValue(alamat);
        dest.writeList(hobi);
        dest.writeValue(tentangSaya);
    }

    public int describeContents() {
        return  0;
    }

}
