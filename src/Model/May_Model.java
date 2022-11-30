package Model;

/**
 *
 * @author hungduong
 */
public class May_Model {

    private String id;
    private LoaiMay_Model loaiMay;
    private KhachHang_Model khachHang;
    private String MaMay;
    private float donGiaMay;
    private int TrangThai;

    public May_Model() {
    }

    public May_Model(String id, LoaiMay_Model loaiMay, KhachHang_Model khachHang, String MaMay, float donGiaMay, int TrangThai) {
        this.id = id;
        this.loaiMay = loaiMay;
        this.khachHang = khachHang;
        this.MaMay = MaMay;
        this.donGiaMay = donGiaMay;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoaiMay_Model getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(LoaiMay_Model loaiMay) {
        this.loaiMay = loaiMay;
    }

    public KhachHang_Model getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang_Model khachHang) {
        this.khachHang = khachHang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public float getDonGiaMay() {
        return donGiaMay;
    }

    public void setDonGiaMay(float donGiaMay) {
        this.donGiaMay = donGiaMay;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }




}
