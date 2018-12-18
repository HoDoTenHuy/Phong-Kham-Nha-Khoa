package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;

@Component
public class ChiTietYeuCauPojo {
    private int maYeuCau;
    private int maDVChiTiet;
    private String phongDieuTri;
    private String hinhThucDieuTri;
    private String tinhTrangDieuTri;
    private String ngayTaiKham;
    private String bacSyDieuTri;
    private String ghiChuChiTiet;

    public ChiTietYeuCauPojo(int maYeuCau, int maDVChiTiet, String phongDieuTri, String hinhThucDieuTri,
                             String tinhTrangDieuTri, String ngayTaiKham, String bacSyDieuTri, String ghiChuChiTiet) {
        this.maYeuCau = maYeuCau;
        this.maDVChiTiet = maDVChiTiet;
        this.phongDieuTri = phongDieuTri;
        this.hinhThucDieuTri = hinhThucDieuTri;
        this.tinhTrangDieuTri = tinhTrangDieuTri;
        this.ngayTaiKham = ngayTaiKham;
        this.bacSyDieuTri = bacSyDieuTri;
        this.ghiChuChiTiet = ghiChuChiTiet;
    }

    public ChiTietYeuCauPojo() {
    }

    public int getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(int maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public int getMaDVChiTiet() {
        return maDVChiTiet;
    }

    public void setMaDVChiTiet(int maDVChiTiet) {
        this.maDVChiTiet = maDVChiTiet;
    }

    public String getPhongDieuTri() {
        return phongDieuTri;
    }

    public void setPhongDieuTri(String phongDieuTri) {
        this.phongDieuTri = phongDieuTri;
    }

    public String getHinhThucDieuTri() {
        return hinhThucDieuTri;
    }

    public void setHinhThucDieuTri(String hinhThucDieuTri) {
        this.hinhThucDieuTri = hinhThucDieuTri;
    }

    public String getTinhTrangDieuTri() {
        return tinhTrangDieuTri;
    }

    public void setTinhTrangDieuTri(String tinhTrangDieuTri) {
        this.tinhTrangDieuTri = tinhTrangDieuTri;
    }

    public String getNgayTaiKham() {
        return ngayTaiKham;
    }

    public void setNgayTaiKham(String ngayTaiKham) {
        this.ngayTaiKham = ngayTaiKham;
    }

    public String getBacSyDieuTri() {
        return bacSyDieuTri;
    }

    public void setBacSyDieuTri(String bacSyDieuTri) {
        this.bacSyDieuTri = bacSyDieuTri;
    }

    public String getGhiChuChiTiet() {
        return ghiChuChiTiet;
    }

    public void setGhiChuChiTiet(String ghiChuChiTiet) {
        this.ghiChuChiTiet = ghiChuChiTiet;
    }
}
