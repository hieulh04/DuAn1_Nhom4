/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModel.QLGiamGia;
import java.util.ArrayList;
public interface IGiamGiaServices {
    
    ArrayList<QLGiamGia> getGiamGia();
//    ArrayList<QLGiamGia> findGG();
    boolean getGiamGiaByMa(String ma);
    QLGiamGia addGiamGia(QLGiamGia gg);
    QLGiamGia upadteGiamGiaById(QLGiamGia gg);
    String deleteGiamGiaById(String id);
}
