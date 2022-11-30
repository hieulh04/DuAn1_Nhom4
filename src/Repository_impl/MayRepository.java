/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Ulti.JDBC_Helper;
import ViewModel.MayViewModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nguye
 */
public class MayRepository {

    public static List<MayViewModel> getAllMay() {
        List<MayViewModel> list = new ArrayList<>();
        ResultSet rs;
        String sql = "select mamay,tenloaimay,dongiamay,trangthai from may "
                + "join loaimay on loaimay.id=may.idlm";
        rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                String mamay = rs.getString(1);

                String tenloaiMay = rs.getString(2);
                Double donGia = rs.getDouble(3);
                int trangThai = rs.getInt(4);

                MayViewModel may = new MayViewModel(mamay, tenloaiMay, donGia, trangThai);
                list.add(may);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public static MayViewModel getMayByMa(String ma) {
        MayViewModel may = null;
        ResultSet rs;
        String sql = "select mamay,tenloaimay,dongiamay,trangthai from may "
                + "join loaimay on loaimay.id=may.idlm"
                + " where mamay=?";
        rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                String mamay = rs.getString("mamay");

                String tenLM = rs.getString("tenloaimay");
                Double donGia = rs.getDouble("dongiamay");
                int trangThai = rs.getInt("trangthai");

                may = new MayViewModel(mamay, tenLM, donGia, trangThai);

            }
            return may;
        } catch (Exception e) {
            return null;
        }
    }

    public static int Update(MayViewModel x) {
        String sql = 
                 " declare @idlm uniqueidentifier"
             + " set @idlm = (select id from loaimay where tenloaimay=?) " 
             + "update loaimay set dongiamay=? where id=@idlm ";
        return JDBC_Helper.Update(sql,x.getTenLoaiMay(), x.getDonGiaMay());
    }

    public static int Insert(MayViewModel x) {
        String sql = " declare @idlm uniqueidentifier\n"
                + "set @idlm = (select id from loaimay where tenloaimay=?)"
                + "insert into  may(mamay,idlm,trangthai) values(?,@idlm,?)";
        return JDBC_Helper.Update(sql, x.getTenLoaiMay(), x.getMaMay(), x.getTrangThai());
    }

    public static int Delete(MayViewModel x) {
        String sql = "delete from may where mamay=?";
        return JDBC_Helper.Update(sql, x.getMaMay());
    }
    public static boolean checkRong(JTextField txt,String mss){
         if(txt.getText().equals("")){
             JOptionPane.showMessageDialog(null, mss);
             txt.requestFocus();
             return true;
             
         }
         return false;
     }
    public static void main(String[] args) {
        List list = new ArrayList();
        list = getAllMay();

        System.out.println(list.toString());
    }
}
