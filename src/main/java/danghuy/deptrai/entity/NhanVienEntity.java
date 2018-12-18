package danghuy.deptrai.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "nhan_vien")
public class NhanVienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maNV;
    private String tenNV;
    private String ngaySinh;
    private String soDT;
    private String diaChi;
    private String viTri;
    private String trinhDo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "yeu_cau",
            joinColumns = {@JoinColumn(name = "maNV")},
            inverseJoinColumns = {@JoinColumn(name = "maNVTiepNhan")})
    private Set<YeuCauEntity> yeuCauEntities = new HashSet<YeuCauEntity>();

    public NhanVienEntity(String tenNV, String ngaySinh, String soDT, String diaChi, String viTri, String trinhDo) {
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
    }

    public NhanVienEntity(){
    }

    public NhanVienEntity(String tenNV, String ngaySinh, String soDT, String diaChi,
                          String viTri, String trinhDo, Set<YeuCauEntity> yeuCauEntities) {
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
        this.yeuCauEntities = yeuCauEntities;
    }

    public Set<YeuCauEntity> getYeuCauEntities() {
        return yeuCauEntities;
    }

    public void setYeuCauEntities(Set<YeuCauEntity> yeuCauEntities) {
        this.yeuCauEntities = yeuCauEntities;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
}
