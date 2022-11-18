/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.DichVu;
import ViewModel.DichVu_View;
import java.util.List;

/**
 *
 * @author LE HUU HIEU
 */
public interface IDichVu_service {
    List<DichVu_View> getALllDV();

    DichVu getDVByMa(String ma);

    List<DichVu> findNV(String keyWord);

    int add(DichVu dv);

    int delete(DichVu dv);

    int update(DichVu dv);
}
