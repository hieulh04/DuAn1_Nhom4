/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author daoqu
 */
public class HoaDonCT {
    private String tgbd;
    private String tgkt;
    private double tienmay;
    private double tiendv;
    
    public HoaDonCT() {
    }

    public HoaDonCT(String tgbd, String tgkt, double tienmay, double tiendv) {
        this.tgbd = tgbd;
        this.tgkt = tgkt;
        this.tienmay = tienmay;
        this.tiendv = tiendv;
    }

    public String getTgbd() {
        return tgbd;
    }

    public void setTgbd(String tgbd) {
        this.tgbd = tgbd;
    }

    public String getTgkt() {
        return tgkt;
    }

    public void setTgkt(String tgkt) {
        this.tgkt = tgkt;
    }

    public double getTienmay() {
        return tienmay;
    }

    public void setTienmay(double tienmay) {
        this.tienmay = tienmay;
    }

    public double getTiendv() {
        return tiendv;
    }

    public void setTiendv(double tiendv) {
        this.tiendv = tiendv;
    }

    
}
