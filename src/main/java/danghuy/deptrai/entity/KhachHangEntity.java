package danghuy.deptrai.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "khach_hang")
public class KhachHangEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maKH;
    private String tenKH;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String soDT;
    private String ngheNghiep;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "khachHangEntity")
    private Set<YeuCauEntity> yeuCauEntities = new HashSet<YeuCauEntity>();

    public KhachHangEntity() {
    }

    public KhachHangEntity(String tenKH, String ngaySinh, String gioiTinh, String diaChi, String soDT, String ngheNghiep) {
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.ngheNghiep = ngheNghiep;
    }

    public KhachHangEntity(String tenKH, String ngaySinh, String gioiTinh, String diaChi, String soDT,
                           String ngheNghiep, Set<YeuCauEntity> yeuCauEntities) {
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.ngheNghiep = ngheNghiep;
        this.yeuCauEntities = yeuCauEntities;
    }

    public Set<YeuCauEntity> getYeuCauEntities() {
        return yeuCauEntities;
    }

    public void setYeuCauEntities(Set<YeuCauEntity> yeuCauEntities) {
        this.yeuCauEntities = yeuCauEntities;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
}
