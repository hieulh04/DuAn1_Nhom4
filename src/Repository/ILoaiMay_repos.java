package Repository;

import Model.KhachHang_Model;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface ILoaiMay_repos {

    List<KhachHang_Model> getAllDatMay();

    KhachHang_Model getDatMayByMa(String ma);

    int add(KhachHang_Model d);

    int delete(KhachHang_Model d);

    int update(KhachHang_Model d);
}
