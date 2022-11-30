/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serviceduan;

import ViewModel.MayViewModel;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author nguye
 */
public interface MayService {
    List<MayViewModel> getAllMay();
    MayViewModel getMayByMa(String ma);
    int delete(MayViewModel x);
    int insert(MayViewModel x);
    int update(MayViewModel x);
      boolean checkRong(JTextField txt,String mss);
}
