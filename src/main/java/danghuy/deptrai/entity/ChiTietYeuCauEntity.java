package danghuy.deptrai.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chi_tiet_yeu_cau")
public class ChiTietYeuCauEntity {
    private String phongDieuTri;
    private String hinhThucDieuTri;
    private String tinhTrangDieuTri;
    private String ngayTaiKham;
    private String bacSyDieuTri;
    private String ghiChuChiTiet;
    @EmbeddedId
    private Pk pk;

    @Embeddable
    public static class Pk implements Serializable{
        private static final long serialVersionUID = 1L;
        @Column(name = "maYeuCau")
        private int maYeuCau;
        @Column(name = "maDVChiTiet")
        private int maDVChiTiet;

        @Override
        public String toString() {
            return "Pk{" +
                    "maYeuCau=" + maYeuCau +
                    ", maDVChiTiet=" + maDVChiTiet +
                    '}';
        }
        public static long getSerialVersionUID() {
            return serialVersionUID;
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
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "maDichVuChiTiet")
    private Set<DichVuChiTietEntity> dichVuChiTietEntitySet = new HashSet<DichVuChiTietEntity>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maYeuCau")
    private YeuCauEntity yeuCauEntity;

    public ChiTietYeuCauEntity() {
    }

    public ChiTietYeuCauEntity(String phongDieuTri, String hinhThucDieuTri, String tinhTrangDieuTri, String ngayTaiKham,
                               String bacSyDieuTri, String ghiChuChiTiet) {
        this.phongDieuTri = phongDieuTri;
        this.hinhThucDieuTri = hinhThucDieuTri;
        this.tinhTrangDieuTri = tinhTrangDieuTri;
        this.ngayTaiKham = ngayTaiKham;
        this.bacSyDieuTri = bacSyDieuTri;
        this.ghiChuChiTiet = ghiChuChiTiet;
    }

    public Set<DichVuChiTietEntity> getDichVuChiTietEntitySet() {
        return dichVuChiTietEntitySet;
    }

    public void setDichVuChiTietEntitySet(Set<DichVuChiTietEntity> dichVuChiTietEntitySet) {
        this.dichVuChiTietEntitySet = dichVuChiTietEntitySet;
    }

    public YeuCauEntity getYeuCauEntity() {
        return yeuCauEntity;
    }

    public void setYeuCauEntity(YeuCauEntity yeuCauEntity) {
        this.yeuCauEntity = yeuCauEntity;
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
