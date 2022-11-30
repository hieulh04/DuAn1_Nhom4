/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository_impl;

import Model.HDDichvu;
import Model.HoaDonChiTiet;
import Model.HoaDonMay;
import Repository.IHDChiTiet_repos;
import Ulti.JDBC_Helper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author daoqu
 */
public class HoaDonChiTietRepos implements IHDChiTiet_repos {

    @Override
    public List<HoaDonChiTiet> getAllHDCT() {
        List<HoaDonChiTiet> ls = new ArrayList<>();
        String sql = "  select tg_batdau,tg_ketthuc,HoaDonMay.ThanhTien,HDDichVu.ThanhTien  from HoaDonCT\n"
                + "  inner join HoaDonMay on HoaDonCT.IdHD=HoaDonMay.Id\n"
                + "  inner join HDDichVu on HoaDonCT.IdDV=HDDichVu.Id";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                HoaDonMay h = new HoaDonMay(rs.getString(1), rs.getString(2), rs.getDouble(3));
                HDDichvu d = new HDDichvu(rs.getDouble(4));
                ls.add(new HoaDonChiTiet(h, d));
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public HoaDonChiTiet getHDCTByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(HoaDonChiTiet hd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(HoaDonChiTiet hd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(HoaDonChiTiet hd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
