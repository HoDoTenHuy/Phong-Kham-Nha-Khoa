package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;

@Component
public class NhanVienPojo {
    private int maNV;
    private String tenNV;
    private String ngaySinh;
    private String soDT;
    private String diaChi;
    private String viTri;
    private String trinhDo;


    public NhanVienPojo(int maNV, String tenNV, String ngaySinh, String soDT, String diaChi,
                        String viTri, String trinhDo) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
    }

    public NhanVienPojo() {
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
