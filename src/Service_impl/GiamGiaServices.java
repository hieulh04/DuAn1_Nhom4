/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.GiamGia;
import Repository.IGiamGia_repos;
import Repository_impl.GiamGia_repos;
import ViewModel.QLGiamGia;
import java.util.ArrayList;

public class GiamGiaServices implements IGiamGiaServices {

    private IGiamGia_repos _IIGiamGia_repos;
    private ArrayList<QLGiamGia> ds;

    public GiamGiaServices() {
        _IIGiamGia_repos = new GiamGia_repos();
        this.ds = new ArrayList<>();

    }

    @Override
    public ArrayList<QLGiamGia> getGiamGia() {
        ArrayList<GiamGia> gg = _IIGiamGia_repos.getAll();
        ds.clear();
        for (GiamGia d : gg) {
            this.ds.add(new QLGiamGia(d.getId(), d.getMa(), d.getTen(), d.getNgayBatDau(), d.getNgayKetThuc(), d.getMucLuc(), d.getTrangThai()));
        }
        return this.ds;
    }

    @Override
    public boolean getGiamGiaByMa(String ma) {
        GiamGia x = _IIGiamGia_repos.getGiamGiaByMa(ma);
        if (x == null) {
            return false;
        }
        return true;
    }

    @Override
    public QLGiamGia addGiamGia(QLGiamGia gg) {
        gg.setId(null);
        GiamGia x = _IIGiamGia_repos.add(new GiamGia(gg.getId(), gg.getMa(), gg.getTen(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getMucLuc(), gg.getTrangThai()));
        return new QLGiamGia(x.getId(), x.getMa(), x.getTen(), x.getNgayBatDau(), x.getNgayKetThuc(), x.getMucLuc(), x.getTrangThai());
    }

    @Override
    public QLGiamGia upadteGiamGiaById(QLGiamGia gg) {
        GiamGia x = _IIGiamGia_repos.update(new GiamGia(gg.getId(), gg.getMa(), gg.getTen(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getMucLuc(), gg.getTrangThai()));
        return new QLGiamGia(x.getId(), x.getMa(), x.getTen(), x.getNgayBatDau(), x.getNgayKetThuc(), x.getMucLuc(), x.getTrangThai());
    }

    @Override
    public String deleteGiamGiaById(String id) {
        return _IIGiamGia_repos.delete(id);
    }

//    @Override
//    public ArrayList<QLGiamGia> findGG() {
////        ArrayList<GiamGia> gg = .getAll();
//        ds.clear();
//        for (GiamGia d : gg) {
//            this.ds.add(new QLGiamGia(d.getId(), d.getMa(), d.getTen(), d.getNgayBatDau(), d.getNgayKetThuc(), d.getMucLuc(), d.getTrangThai()));
//        }
//        return this.ds;
//    }

}
