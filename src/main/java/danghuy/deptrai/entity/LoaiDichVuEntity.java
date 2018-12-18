package danghuy.deptrai.entity;

import javax.persistence.*;

@Entity
@Table(name = "loai_dich_vu")
public class LoaiDichVuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loaiDichVu;
    private String tenLoaiDichVu;

    public LoaiDichVuEntity() {
    }

    public LoaiDichVuEntity(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public int getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(int loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }
}
