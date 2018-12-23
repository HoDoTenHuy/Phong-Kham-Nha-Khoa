package danghuy.deptrai.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "yeu_cau")
public class YeuCauEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maYeuCau;
    private String ngayTiepNhan;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maKH")
    private KhachHangEntity khachHangEntity;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "nhan_vien",
            joinColumns = {@JoinColumn(name = "maNVTiepNhan")},
            inverseJoinColumns = {@JoinColumn(name = "maNV")})
    private Set<NhanVienEntity> nhanVienEntities = new HashSet<NhanVienEntity>();

    @OneToOne(mappedBy = "yeuCauEntity", cascade = CascadeType.ALL)
    private ChiTietYeuCauEntity chiTietYeuCauEntity;


    public YeuCauEntity(String ngayTiepNhan, KhachHangEntity khachHangEntity, Set<NhanVienEntity> nhanVienEntities) {
        this.ngayTiepNhan = ngayTiepNhan;
        this.khachHangEntity = khachHangEntity;
        this.nhanVienEntities = nhanVienEntities;
    }

    public YeuCauEntity() {
    }

    public Set<NhanVienEntity> getNhanVienEntities() {
        return nhanVienEntities;
    }

    public void setNhanVienEntities(Set<NhanVienEntity> nhanVienEntities) {
        this.nhanVienEntities = nhanVienEntities;
    }

    public KhachHangEntity getKhachHangEntity() {
        return khachHangEntity;
    }

    public void setKhachHangEntities(KhachHangEntity khachHangEntity) {
        this.khachHangEntity = khachHangEntity;
    }

    public int getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(int maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public String getNgayTiepNhan() {
        return ngayTiepNhan;
    }

    public void setNgayTiepNhan(String ngayTiepNhan) {
        this.ngayTiepNhan = ngayTiepNhan;
    }
}
