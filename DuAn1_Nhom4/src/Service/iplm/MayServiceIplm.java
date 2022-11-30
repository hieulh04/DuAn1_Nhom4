/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.iplm;

import Repository.MayRepository;
import ViewModel.MayViewModel;
import java.util.List;
import javax.swing.JTextField;
import serviceduan.MayService;

/**
 *
 * @author nguye
 */
public class MayServiceIplm implements MayService {

    @Override
    public List<MayViewModel> getAllMay() {
        return MayRepository.getAllMay();
    }

    @Override
    public MayViewModel getMayByMa(String ma) {
        return MayRepository.getMayByMa(ma);
    }

    @Override
    public int delete(MayViewModel x) {
        return MayRepository.Delete(x);
    }

    @Override
    public int insert(MayViewModel x) {
        return MayRepository.Insert(x);
    }

    @Override
    public int update(MayViewModel x) {
        return MayRepository.Update(x);
    }

    @Override
    public boolean checkRong(JTextField txt, String mss) {
        return MayRepository.checkRong(txt, mss);
    }

}
