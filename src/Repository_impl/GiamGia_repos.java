/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository_impl;

import Repository.*;
import java.util.ArrayList;
import java.sql.*;
import Model.GiamGia;
import Ulti.JDBC_Helper;

public class GiamGia_repos implements IGiamGia_repos {

    final String SELECT_ALL = " SELECT * FROM GiamGia";
    final String INSERT_SQL = "INSERT INTO GiamGia(Ma,Ten,NgayBatDau,NgayKetThuc,MucGiamGia,TrangThai) VALUES(?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE GiamGia Set Ten = ?,NgayBatDau = ?,NgayKetThuc = ?,MucGiamGia = ?,TrangThai = ? WHERE Ma = ? ";
    final String DELETE_SQL = "DELETE FROM GiamGia WHERE Id = ?";
    final String SELECT_BY_SQL = "SELECT * FROM GiamGia WHERE Ma = ?";
    final String SELECT_BY_Ma_hoTen = "SELECT * FROM GiamGia WHERE Ten like CONCAT('%',?, '%') or Ma like CONCAT('%',?, '%')";
    private ArrayList<GiamGia> ds;

    public GiamGia_repos() {
        this.ds = new ArrayList<>();
    }

    private ArrayList<GiamGia> getSelectSQL(String sql, Object... args) {
        try {
            ResultSet rs = JDBC_Helper.Query(sql, args);
            ds.clear();
            while (rs.next()) {
                this.ds.add(new GiamGia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.ds;
    }

    @Override
    public ArrayList<GiamGia> getAll() {
        return getSelectSQL(SELECT_ALL);
    }

    @Override
    public GiamGia getGiamGiaByMa(String ma) {
        GiamGia gg = null;
        try {
            gg = getSelectSQL(SELECT_BY_SQL, ma).get(0);
        } catch (Exception e) {
            return null;
        }
        return gg;
    }

    @Override
    public GiamGia add(GiamGia gg) {
        JDBC_Helper.Update(INSERT_SQL, gg.getMa(), gg.getTen(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getMucLuc(), gg.getTrangThai());
        return gg;
    }

    @Override
    public GiamGia update(GiamGia gg) {
        JDBC_Helper.Update(UPDATE_SQL, gg.getTen(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getMucLuc(), gg.getTrangThai(), gg.getMa());
        return gg;
    }

    @Override
    public String delete(String id) {
        JDBC_Helper.Update(DELETE_SQL, id);
        return id;
    }

    @Override
    public ArrayList<GiamGia> findGG(String keyWord) {
        ArrayList<GiamGia> lst = new ArrayList<>();
        try {
            ResultSet rs = JDBC_Helper.Query(SELECT_BY_Ma_hoTen, keyWord, keyWord);
            while (rs.next()) {
                lst.add(new GiamGia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getInt(7)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

}
