/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import Model.GiamGia;
public interface IGiamGia_repos {
    ArrayList<GiamGia> getAll();
    
    GiamGia getGiamGiaByMa(String ma);
    
    ArrayList<GiamGia> findGG(String keyWord);

    public GiamGia add(GiamGia gg);
    
    public GiamGia update(GiamGia gg);

    public String delete(String id);

}
