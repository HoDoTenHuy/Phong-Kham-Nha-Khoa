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
    /*@Column(name = "maKH")
    private int khachHang_id; // ma khach hang cua bang khach hang*/
    /*@Column(name = "maNVTiepNhan")
    private int nhanVien_id; // ma nhan vien tiep nhan*/
    private String ngayTiepNhan;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "khach_hang",
            joinColumns = {@JoinColumn(name = "maKH")},
            inverseJoinColumns = {@JoinColumn(name = "maKH")})
    private Set<KhachHangEntity> khachHangEntities = new HashSet<KhachHangEntity>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "nhan_vien",
            joinColumns = {@JoinColumn(name = "maNVTiepNhan")},
            inverseJoinColumns = {@JoinColumn(name = "maNV")})
    private Set<NhanVienEntity> nhanVienEntities = new HashSet<NhanVienEntity>();

    public YeuCauEntity(String ngayTiepNhan, Set<KhachHangEntity> khachHangEntities, Set<NhanVienEntity> nhanVienEntities) {
        this.ngayTiepNhan = ngayTiepNhan;
        this.khachHangEntities = khachHangEntities;
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

    public Set<KhachHangEntity> getKhachHangEntities() {
        return khachHangEntities;
    }

    public void setKhachHangEntities(Set<KhachHangEntity> khachHangEntities) {
        this.khachHangEntities = khachHangEntities;
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
