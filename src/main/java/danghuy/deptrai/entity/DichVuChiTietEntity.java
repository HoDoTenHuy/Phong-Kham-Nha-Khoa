package danghuy.deptrai.entity;

import javax.persistence.*;

@Entity
@Table(name = "dich_vu_chi_tiet")
public class DichVuChiTietEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDichVuChiTiet;

    /*@Column(name = "loaiDichVu")
    private int loaiDichVu_id; // ma loai dich vu*/

    private String tenDichVuChiTiet;
    private String phiDieuTri;
    private String phiPhuThu;
    private String moTaChiTietPhuThu;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loaiDichVu")
    private LoaiDichVuEntity loaiDichVuEntitiy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maDVChiTiet")
    private ChiTietYeuCauEntity chiTietYeuCauEntity;

    public DichVuChiTietEntity(String tenDichVuChiTiet, String phiDieuTri, String phiPhuThu, String moTaChiTietPhuThu, LoaiDichVuEntity loaiDichVuEntitiy) {
        this.tenDichVuChiTiet = tenDichVuChiTiet;
        this.phiDieuTri = phiDieuTri;
        this.phiPhuThu = phiPhuThu;
        this.moTaChiTietPhuThu = moTaChiTietPhuThu;
        this.loaiDichVuEntitiy = loaiDichVuEntitiy;
    }

    public DichVuChiTietEntity() {
    }

    public LoaiDichVuEntity getLoaiDichVuEntitiy() {
        return loaiDichVuEntitiy;
    }

    public void setLoaiDichVuEntitiy(LoaiDichVuEntity loaiDichVuEntitiy) {
        this.loaiDichVuEntitiy = loaiDichVuEntitiy;
    }

    public int getMaDichVuChiTiet() {
        return maDichVuChiTiet;
    }

    public void setMaDichVuChiTiet(int maDichVuChiTiet) {
        this.maDichVuChiTiet = maDichVuChiTiet;
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
