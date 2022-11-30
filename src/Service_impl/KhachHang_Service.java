package Service_impl;

import Model.KhachHang_Model;
import Repository.IKhachHang_repos;
import Repository_impl.KhachHang_repos;
import ViewModel.KhachHang_View;
import java.util.ArrayList;
import java.util.List;
import Service.IKhachHangService;

/**
 *
 * @author hung duong
 */
public class KhachHang_Service implements IKhachHangService {

    private IKhachHang_repos repos;

    public KhachHang_Service() {
        this.repos = new KhachHang_repos();
    }

    @Override
    public List<KhachHang_View> getALllDM() {
        List<KhachHang_Model> list = repos.getAllKH();
        List<KhachHang_View> view = new ArrayList<>();
        view.clear();
        int stt = 1;
        for (KhachHang_Model x : list) {
            view.add(new KhachHang_View(stt, x.getMaKH(), x.getHoTen(), x.getNgaySinh(), x.getGioiTinh(), x.getDiaChi(), x.getSdt()));
            stt++;
        }
        return view;
    }

    @Override
    public int add(KhachHang_Model d) {
        return repos.add(d);
    }

    @Override
    public int delete(KhachHang_Model d) {
        return repos.delete(d);
    }

    @Override
    public int update(KhachHang_Model d) {
        return repos.update(d);
    }

    @Override
    public KhachHang_Model getDMByMa(String ma) {
        return repos.getKHByMa(ma);
    }

    @Override
    public List<KhachHang_View> findKH(String keyWord) {
        List<KhachHang_Model> list = repos.findKH(keyWord);
        List<KhachHang_View> view = new ArrayList<>();
        view.clear();
        int stt = 1;
        for (KhachHang_Model x : list) {
            view.add(new KhachHang_View(stt, x.getMaKH(), x.getHoTen(), x.getNgaySinh(), x.getGioiTinh(), x.getDiaChi(), x.getSdt()));
            stt++;
        }
        return view;
    }

}
