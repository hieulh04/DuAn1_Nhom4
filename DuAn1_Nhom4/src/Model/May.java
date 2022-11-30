/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class May {
    private String id ;
    private LoaiMay loaiMay;
    private String maMay;
    private int trangThai;

    public May() {
    }

    public May(String id, LoaiMay loaiMay, String maMay, int trangThai) {
        this.id = id;
        this.loaiMay = loaiMay;
        this.maMay = maMay;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoaiMay getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(LoaiMay loaiMay) {
        this.loaiMay = loaiMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "May{" + "id=" + id + ", loaiMay=" + loaiMay + ", maMay=" + maMay + ", trangThai=" + trangThai + '}';
    }

   
    
    
}
