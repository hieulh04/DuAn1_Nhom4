/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.iplm;

import Repository.HoaDonRepository;
import ViewModel.HoaDon;
import java.util.Date;
import java.util.List;
import serviceduan.HoaDonService;

/**
 *
 * @author nguye
 */
public class HoaDonServiceIplm implements HoaDonService{

    @Override
    public List<HoaDon> getAllHD() {
        return HoaDonRepository.getAllHD();
    }

    @Override
    public HoaDon getHDByNgayTao(Date ngayTao) {
        return HoaDonRepository.getHDByNgay(ngayTao);
    }

    

    
    
}
