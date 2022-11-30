/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author daoqu
 */
public class KhachHang_Model {

    private String id;
    private String MaKH;
    private String HoTen;
    private Date ngaySinh;
    private int gioiTinh;
    private String diaChi;
    private String sdt;

    public KhachHang_Model() {
    }

    public KhachHang_Model(String id, String MaKH, String HoTen, Date ngaySinh, int gioiTinh, String diaChi, String sdt) {
        this.id = id;
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public KhachHang_Model(String MaKH, String HoTen, Date ngaySinh, int gioiTinh, String diaChi, String sdt) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return MaKH +"-"+ HoTen;
    }
}
