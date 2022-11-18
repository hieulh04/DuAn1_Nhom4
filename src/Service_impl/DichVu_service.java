/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_impl;

import Model.DichVu;
import Repository_impl.DichVu_repos;
import Service.IDichVu_service;
import ViewModel.DichVu_View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LE HUU HIEU
 */
public class DichVu_service implements IDichVu_service{
    DichVu_repos repos= new DichVu_repos();
    

    @Override
    public List<DichVu_View> getALllDV() {
        List<DichVu> list = repos.getALllDV();
        List<DichVu_View> view = new ArrayList<>();
        int stt = 1;
        for (DichVu dv : list) {
            view.add(new DichVu_View(stt,dv.getMaDV(),dv.getTenDV(),dv.getSoLuong(),dv.getGiaBan(),dv.getDonVi(),dv.getHinh(),dv.getDanhMuc()));
            stt++;
            System.out.println(dv.getMaDV());
        }
        return view;
    }

    @Override
    public DichVu getDVByMa(String ma) {
        return repos.getDVByMa(ma);
    }

    @Override
    public List<DichVu> findNV(String keyWord) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(DichVu dv) {
        return repos.add(dv);
    }

    @Override
    public int delete(DichVu dv) {
        return repos.delete(dv);
    }

    @Override
    public int update(DichVu dv) {
        return repos.update(dv);
    }
    
}
