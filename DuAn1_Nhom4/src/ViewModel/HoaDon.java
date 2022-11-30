/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class HoaDon {

   
    private Date ngayTao;
    private double tongTien;

    public HoaDon() {
    }

    public HoaDon(Date ngayTao, double tongTien) {
      
        this.ngayTao = ngayTao;

        this.tongTien = tongTien;
    }

   

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + ", ngayTao=" + ngayTao + ",  tongTien=" + tongTien + '}';
    }

}
