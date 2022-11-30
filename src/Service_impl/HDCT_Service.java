/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_impl;

import Model.HoaDonChiTiet;
import Repository_impl.HoaDonChiTietRepos;
import ViewModel.HoaDonCT;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daoqu
 */
public class HDCT_Service {
    HoaDonChiTietRepos hd=new HoaDonChiTietRepos();
    public List<HoaDonCT> getHDCTGetAll(){
        List<HoaDonChiTiet>ls=hd.getAllHDCT();
        List<HoaDonCT>lshd=new ArrayList<>();
        for (HoaDonChiTiet x : ls) {
            lshd.add(new HoaDonCT( x.getIdHoaDonMay().getThoigianbd(), x.getIdHoaDonMay().getThoigiankt(), x.getIdHoaDonMay().getThanhtien(),
                    x.getIdHDDichvu().getThanhtien()));
        
        }
        return lshd;
    }
}
