/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import static Repository.MayRepository.getAllMay;
import Ulti.JDBC_Helper;
import ViewModel.HoaDon;
import ViewModel.MayViewModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nguye
 */
public class HoaDonRepository {

    public static List<HoaDon> getAllHD() {
        List<HoaDon> list = new ArrayList<>();
        ResultSet rs;
        String sql = "select ngaytao,tongtien from hoadonct ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {

                Date ngayTao = rs.getDate(1);
                Double tongTien = rs.getDouble(2);

                HoaDon hd = new HoaDon(ngayTao, tongTien);
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
public static HoaDon getHDByNgay(Date ngaytao) {
    HoaDon hd = null;
        ResultSet rs;
        String sql = "select ngaytao,tongtien from hoadonct where ngaytao=?";

        rs = JDBC_Helper.selectTongQuat(sql,ngaytao);
        try {
            while (rs.next()) {

                Date ngayTao = rs.getDate(1);
                Double tongTien = rs.getDouble(2);

                 hd = new HoaDon(ngayTao, tongTien);
               
            }
            return hd;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list = getAllHD();

        System.out.println(list.toString());
    }
}
