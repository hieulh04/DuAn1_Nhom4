/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Model.KhachHang;

/**
 *
 * @author nguye
 */
public class MayViewModel {

    private String maMay;
    private String tenLoaiMay;
    private double donGiaMay;
    private int trangThai;

    public MayViewModel() {
    }

    public MayViewModel(String maMay, String tenLoaiMay, double donGiaMay, int trangThai) {
        this.maMay = maMay;
        this.tenLoaiMay = tenLoaiMay;
        this.donGiaMay = donGiaMay;
        this.trangThai = trangThai;
    }

  

   

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenLoaiMay() {
        return tenLoaiMay;
    }

    public void setTenLoaiMay(String tenLoaiMay) {
        this.tenLoaiMay = tenLoaiMay;
    }

  

   
    public double getDonGiaMay() {
        return donGiaMay;
    }

    public void setDonGiaMay(double donGiaMay) {
        this.donGiaMay = donGiaMay;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public String getTrangThai(MayViewModel may){
        if(may.getTrangThai()==0){
            return "Trống";
        }else if(may.getTrangThai()==1){
            return "Đang sử dụng";
        }else{
            return "Đang bảo trì";
        }
    }

    @Override
    public String toString() {
        return "MayViewModel{" + "maMay=" + maMay + ", tenLoaiMay=" + tenLoaiMay + ", donGiaMay=" + donGiaMay + ", trangThai=" + trangThai + '}';
    }

   

   
}
