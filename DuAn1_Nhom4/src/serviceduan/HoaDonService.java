/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serviceduan;

import ViewModel.HoaDon;
import ViewModel.MayViewModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nguye
 */
public interface HoaDonService {
     List<HoaDon> getAllHD();
     HoaDon getHDByNgayTao(Date ngayTao);
}
