package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;

@Component
public class YeuCauPojo {
    private int maYeuCau;
    private int khachHang_id; // ma khach hang cua bang khach hang
    private int nhanVien_id; // ma nhan vien tiep nhan
    private String ngayTiepNhan;


    public YeuCauPojo(int maYeuCau, int khachHang_id, int nhanVien_id, String ngayTiepNhan) {
        this.maYeuCau = maYeuCau;
        this.khachHang_id = khachHang_id;
        this.nhanVien_id = nhanVien_id;
        this.ngayTiepNhan = ngayTiepNhan;
    }

    public YeuCauPojo() {
    }

    public int getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(int maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public int getKhachHang_id() {
        return khachHang_id;
    }

    public void setKhachHang_id(int khachHang_id) {
        this.khachHang_id = khachHang_id;
    }

    public int getNhanVien_id() {
        return nhanVien_id;
    }

    public void setNhanVien_id(int nhanVien_id) {
        this.nhanVien_id = nhanVien_id;
    }

    public String getNgayTiepNhan() {
        return ngayTiepNhan;
    }

    public void setNgayTiepNhan(String ngayTiepNhan) {
        this.ngayTiepNhan = ngayTiepNhan;
    }
}
