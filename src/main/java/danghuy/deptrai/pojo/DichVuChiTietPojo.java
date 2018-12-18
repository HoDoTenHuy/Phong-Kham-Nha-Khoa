package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;

@Component
public class DichVuChiTietPojo {
    private int maDichVuChiTiet;
    private int loaiDichVu_id; // ma loai dich vu
    private String tenDichVuChiTiet;
    private String phiDieuTri;
    private String phiPhuThu;
    private String moTaChiTietPhuThu;

    public DichVuChiTietPojo(int maDichVuChiTiet, int loaiDichVu_id, String tenDichVuChiTiet, String phiDieuTri, String phiPhuThu, String moTaChiTietPhuThu) {
        this.maDichVuChiTiet = maDichVuChiTiet;
        this.loaiDichVu_id = loaiDichVu_id;
        this.tenDichVuChiTiet = tenDichVuChiTiet;
        this.phiDieuTri = phiDieuTri;
        this.phiPhuThu = phiPhuThu;
        this.moTaChiTietPhuThu = moTaChiTietPhuThu;
    }

    public DichVuChiTietPojo() {
    }

    public int getMaDichVuChiTiet() {
        return maDichVuChiTiet;
    }

    public void setMaDichVuChiTiet(int maDichVuChiTiet) {
        this.maDichVuChiTiet = maDichVuChiTiet;
    }

    public int getLoaiDichVu_id() {
        return loaiDichVu_id;
    }

    public void setLoaiDichVu_id(int loaiDichVu_id) {
        this.loaiDichVu_id = loaiDichVu_id;
    }

    public String getTenDichVuChiTiet() {
        return tenDichVuChiTiet;
    }

    public void setTenDichVuChiTiet(String tenDichVuChiTiet) {
        this.tenDichVuChiTiet = tenDichVuChiTiet;
    }

    public String getPhiDieuTri() {
        return phiDieuTri;
    }

    public void setPhiDieuTri(String phiDieuTri) {
        this.phiDieuTri = phiDieuTri;
    }

    public String getPhiPhuThu() {
        return phiPhuThu;
    }

    public void setPhiPhuThu(String phiPhuThu) {
        this.phiPhuThu = phiPhuThu;
    }

    public String getMoTaChiTietPhuThu() {
        return moTaChiTietPhuThu;
    }

    public void setMoTaChiTietPhuThu(String moTaChiTietPhuThu) {
        this.moTaChiTietPhuThu = moTaChiTietPhuThu;
    }
}
