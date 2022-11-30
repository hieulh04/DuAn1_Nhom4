/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class LoaiMay {

    private String id;
    private String tenLoaiMay;
    private double donGiaMay;

    public LoaiMay() {
    }

    public LoaiMay(String id, String tenLoaiMay, double donGiaMay) {
        this.id = id;
        this.tenLoaiMay = tenLoaiMay;
        this.donGiaMay = donGiaMay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "LoaiMay{" + "id=" + id + ", tenLoaiMay=" + tenLoaiMay + ", donGiaMay=" + donGiaMay + '}';
    }
    
    
}
