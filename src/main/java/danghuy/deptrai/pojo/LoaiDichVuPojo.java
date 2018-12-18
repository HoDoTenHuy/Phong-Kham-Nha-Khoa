package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;

@Component
public class LoaiDichVuPojo {
    private int loaiDichVu;
    private String tenLoaiDichVu;

    public LoaiDichVuPojo(int loaiDichVu, String tenLoaiDichVu) {
        this.loaiDichVu = loaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public LoaiDichVuPojo() {
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
