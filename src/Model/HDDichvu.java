/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class HDDichvu {
    private String id;
    private String mahd;
    private double thanhtien;

    public HDDichvu(String id, String mahd, double thanhtien) {
        this.id = id;
        this.mahd = mahd;
        this.thanhtien = thanhtien;
    }

    public HDDichvu(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public HDDichvu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
