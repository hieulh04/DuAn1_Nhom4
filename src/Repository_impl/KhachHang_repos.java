package Repository_impl;

import Model.KhachHang_Model;
import Repository.IKhachHang_repos;
import java.sql.*;
import java.util.List;
import Ulti.JDBC_Helper;
import java.util.ArrayList;

/**
 *
 * @author hung duong
 */
public class KhachHang_repos implements IKhachHang_repos {

    private List<KhachHang_Model> ds;

    public KhachHang_repos() {
        this.ds = new ArrayList<>();
    }

    final String INSERT_SQL = "INSERT INTO KhachHang (MaKH,HoTen,NgaySinh, GioiTinh,DiaChi,Sdt) VALUES (?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE KhachHang SET HoTen = ?,NgaySinh = ?, GioiTinh = ?,DiaChi = ?, Sdt = ? WHERE MaKH = ?";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    final String SELECT_BY_Ma = "SELECT * FROM KhachHang  WHERE MaKH = ?";
    final String SELECT_BY_Ma_hoTen = "SELECT * FROM KhachHang WHERE HoTen like CONCAT('%',?, '%') or MaKH like CONCAT('%',?, '%')";
    final String SELECT_ALL_SQL = "SELECT * FROM KhachHang ORDER BY MaKH";
    final String SELECT_ALL_SQL_Join = "SELECT TenLoaiMay,DonGiaMay,"
            + "May.Id,May.IdLM,May.MaMay,May.TrangThai,"
            + "KhachHang.Id, KhachHang.IdMay,MaKH, HoTen,NgaySinh,GioiTinh,DiaChi,Sdt "
            + "FROM KhachHang JOIN May ON KhachHang.IdMay = May.Id JOIN LoaiMay ON LoaiMay.Id = May.IdLM ORDER BY MaKH";

    @Override
    public int add(KhachHang_Model d) {
        return JDBC_Helper.Update(INSERT_SQL, d.getMaKH(), d.getHoTen(), d.getNgaySinh(), d.getGioiTinh(), d.getDiaChi(), d.getSdt());
    }

    @Override
    public int delete(KhachHang_Model d) {
        return JDBC_Helper.Update(DELETE_SQL, d.getMaKH());
    }

    @Override
    public int update(KhachHang_Model d) {
        return JDBC_Helper.Update(UPDATE_SQL, d.getHoTen(), d.getNgaySinh(), d.getGioiTinh(), d.getDiaChi(), d.getSdt(), d.getMaKH());
    }

    @Override
    public List<KhachHang_Model> getAllKH() {
        return getSelectSQL(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang_Model getKHByMa(String ma) {
        KhachHang_Model kh = null;
        ResultSet rs = JDBC_Helper.Query(SELECT_BY_Ma, ma);
        try {
            while (rs.next()) {
                kh = new KhachHang_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7));
            }
            return kh;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public List<KhachHang_Model> findKH(String keyWord) {
        List<KhachHang_Model> lst = new ArrayList<>();
        try {
            ResultSet rs = JDBC_Helper.Query(SELECT_BY_Ma_hoTen, keyWord, keyWord);
            while (rs.next()) {
                lst.add(new KhachHang_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

    private List<KhachHang_Model> getSelectSQL(String sql, Object... args) {
        try {
            ResultSet rs = JDBC_Helper.Query(sql);
            ds.clear();
            while (rs.next()) {
                this.ds.add(new KhachHang_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return this.ds;
    }

    @Override
    public String getKhachHangByTen(String ma) {
        List<KhachHang_Model> lst = getSelectSQL(SELECT_BY_Ma, ma);
        for (KhachHang_Model x : lst) {
            if (x.getMaKH().equalsIgnoreCase(ma)) {
                return x.getHoTen();
            }
        }
        return "";
    }

}
