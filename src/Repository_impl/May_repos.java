package Repository_impl;

import Model.KhachHang_Model;
import Model.LoaiMay_Model;
import Model.May_Model;
import Repository.IMay_repos;
import Ulti.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hung duong
 */
public class May_repos implements IMay_repos {

    private List<May_Model> ds;

    public May_repos() {
        this.ds = new ArrayList<>();
    }

    final String INSERT_SQL = "INSERT INTO May (MaKH,HoTen,NgaySinh, GioiTinh,DiaChi,Sdt) VALUES (?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE KhachHang SET IdKH = ?,IdLM = ?,DonGiaMay = ?, TrangThai = ? WHERE MaMay = ?";
    final String UPDATE_SQL_KH = "UPDATE May SET IdKH = ? WHERE MaMay = ?";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    final String SELECT_BY_Ma = "SELECT * FROM KhachHang  WHERE MaKH = ?";
    final String SELECT_BY_Ma_hoTen = "SELECT * FROM KhachHang WHERE HoTen like CONCAT('%',?, '%') or MaKH like CONCAT('%',?, '%')";
    final String SELECT_ALL_SQL = "SELECT * FROM May ORDER BY MaMay";
    final String SELECT_ALL_SQL_Join = "SELECT May.Id,May.IdKH, May.IdLM,MaMay,DonGiaMay,TrangThai,MaLoai,TenLoaiMay,MaKH,HoTen,NgaySinh,GioiTinh,DiaChi,Sdt FROM May JOIN KhachHang ON May.IdKH = KhachHang.Id JOIN LoaiMay ON LoaiMay.Id = May.IdLM";

    @Override
    public List<May_Model> getAllMay() {

        ResultSet rs = JDBC_Helper.Query(SELECT_ALL_SQL_Join);
        try {
            while (rs.next()) {
                LoaiMay_Model lm = new LoaiMay_Model(rs.getString(7), rs.getString(8));
                KhachHang_Model kh = new KhachHang_Model(rs.getString(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14));
                float dg = rs.getFloat(5);
                May_Model m = new May_Model(rs.getString(1), lm, kh, rs.getString(4), dg, rs.getInt(6));
                ds.add(m);
            }
            return ds;
        } catch (SQLException ex) {
            Logger.getLogger(May_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public May_Model getMayByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(May_Model m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(May_Model m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(May_Model m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int updateKH(May_Model m) {
        return JDBC_Helper.Update(UPDATE_SQL_KH, m.getKhachHang().getId(), m.getMaMay());
    }

}
