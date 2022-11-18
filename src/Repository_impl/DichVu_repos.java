/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository_impl;

import Model.DichVu;
import Repository.IDichVu_repos;
import Ulti.JDBC_Helper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author LE HUU HIEU
 */
public class DichVu_repos implements IDichVu_repos {

    final String INSERT_SQL = "INSERT INTO [DichVu]([MaDV],[TenDV],[SoLuong],[GiaBan],[DonVi],[Hinh],[DanhMuc]) VALUES(?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [DichVu] SET [TenDV] =? ,[SoLuong] =? ,[GiaBan] =? ,[DonVi] = ?,[Hinh] =? ,[DanhMuc] =? WHERE [MaDV] = ?";
    final String DELETE_SQL = "DELETE FROM [DichVu] WHERE MaDV = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [DichVu]  WHERE MaDV = ?";
    final String SELECT_BY_SQL_2 = "SELECT * FROM DichVu WHERE TenDV = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM DichVu";

    @Override
    public List<DichVu> getALllDV() {
        List<DichVu> list = new ArrayList<>();
        ResultSet rs = JDBC_Helper.Query(SELECT_ALL_SQL);
        try {
            while (rs.next()) {
                list.add(new DichVu(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getFloat(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public DichVu getDVByMa(String ma) {
        DichVu dv = null;
        ResultSet rs = JDBC_Helper.Query(SELECT_BY_SQL,ma);
        try {
            while (rs.next()) {                
                dv = new DichVu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
            return dv;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public List<DichVu> findNV(String keyWord) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(DichVu dv) {
        return JDBC_Helper.Update(INSERT_SQL, dv.getMaDV(),dv.getTenDV(),dv.getSoLuong(),dv.getGiaBan(),dv.getDonVi(),dv.getHinh(),dv.getDanhMuc());
    }

    @Override
    public int delete(DichVu dv) {
        return JDBC_Helper.Update(DELETE_SQL, dv.getMaDV());
    }

    @Override
    public int update(DichVu dv) {
        return JDBC_Helper.Update(UPDATE_SQL,dv.getTenDV(),dv.getSoLuong(),dv.getGiaBan(),dv.getDonVi(),dv.getHinh(),dv.getDanhMuc(),dv.getMaDV());
    }
    
}
