/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.May_Model;
import ViewModel.MayViewModel;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IMayService {

    List<MayViewModel> getAllCH();

    May_Model getCHByMa(String ma);

    int add(May_Model m);

    int update(May_Model m);

    int delete(May_Model m);
    
    int updateKH(May_Model m);
}
