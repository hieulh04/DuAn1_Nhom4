/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class HoaDonMay {
    private String id;
    private String maHD;
    private String thoigianbd;
    private String thoigiankt;
    private double thanhtien;

    public HoaDonMay() {
    }

    public HoaDonMay(String maHD, String thoigianbd, String thoigiankt) {
        this.maHD = maHD;
        this.thoigianbd = thoigianbd;
        this.thoigiankt = thoigiankt;
    }

    public HoaDonMay(String thoigianbd, String thoigiankt, double thanhtien) {
        this.thoigianbd = thoigianbd;
        this.thoigiankt = thoigiankt;
        this.thanhtien = thanhtien;
    }

    public HoaDonMay(String id, String maHD) {
        this.id = id;
        this.maHD = maHD;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getThoigianbd() {
        return thoigianbd;
    }

    public void setThoigianbd(String thoigianbd) {
        this.thoigianbd = thoigianbd;
    }

    public String getThoigiankt() {
        return thoigiankt;
    }

    public void setThoigiankt(String thoigiankt) {
        this.thoigiankt = thoigiankt;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
