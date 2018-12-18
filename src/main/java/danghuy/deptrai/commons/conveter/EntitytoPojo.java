package danghuy.deptrai.commons.conveter;

import danghuy.deptrai.entity.*;
import danghuy.deptrai.pojo.*;
import org.springframework.stereotype.Component;

@Component
public class EntitytoPojo {
    public NhanVienPojo convert(NhanVienEntity nhanVienEntity){
        NhanVienPojo nhanVienPojo = new NhanVienPojo();
        nhanVienPojo.setMaNV(nhanVienEntity.getMaNV());
        nhanVienPojo.setTenNV(nhanVienEntity.getTenNV());
        nhanVienPojo.setNgaySinh(nhanVienEntity.getNgaySinh());
        nhanVienPojo.setSoDT(nhanVienEntity.getSoDT());
        nhanVienPojo.setDiaChi(nhanVienEntity.getDiaChi());
        nhanVienPojo.setViTri(nhanVienEntity.getViTri());
        nhanVienPojo.setTrinhDo(nhanVienEntity.getTrinhDo());
        return nhanVienPojo;
    }
    public ChiTietYeuCauPojo convert(ChiTietYeuCauEntity chiTietYeuCauEntity){
        ChiTietYeuCauPojo chiTietYeuCauPojo  = new ChiTietYeuCauPojo();

        chiTietYeuCauPojo.setPhongDieuTri(chiTietYeuCauEntity.getPhongDieuTri());
        chiTietYeuCauPojo.setHinhThucDieuTri(chiTietYeuCauEntity.getHinhThucDieuTri());
        chiTietYeuCauPojo.setTinhTrangDieuTri(chiTietYeuCauEntity.getTinhTrangDieuTri());
        chiTietYeuCauPojo.setNgayTaiKham(chiTietYeuCauEntity.getNgayTaiKham());
        chiTietYeuCauPojo.setBacSyDieuTri(chiTietYeuCauEntity.getBacSyDieuTri());
        chiTietYeuCauPojo.setGhiChuChiTiet(chiTietYeuCauEntity.getGhiChuChiTiet());
        return chiTietYeuCauPojo;
    }
    public DichVuChiTietPojo convert(DichVuChiTietEntity dichVuChiTietEntity){
        DichVuChiTietPojo dichVuChiTietPojo = new DichVuChiTietPojo();
        dichVuChiTietPojo.setMaDichVuChiTiet(dichVuChiTietEntity.getMaDichVuChiTiet());

        dichVuChiTietPojo.setTenDichVuChiTiet(dichVuChiTietEntity.getTenDichVuChiTiet());
        dichVuChiTietPojo.setPhiDieuTri(dichVuChiTietEntity.getPhiDieuTri());
        dichVuChiTietPojo.setPhiPhuThu(dichVuChiTietEntity.getPhiPhuThu());
        dichVuChiTietPojo.setMoTaChiTietPhuThu(dichVuChiTietEntity.getMoTaChiTietPhuThu());
        return dichVuChiTietPojo;
    }
    public KhachHangPojo convert(KhachHangEntity khachHangEntity){
        KhachHangPojo khachHangPojo = new KhachHangPojo();
        khachHangPojo.setMaKH(khachHangEntity.getMaKH());
        khachHangPojo.setTenKH(khachHangEntity.getTenKH());
        khachHangPojo.setNgaySinh(khachHangEntity.getNgaySinh());
        khachHangPojo.setGioiTinh(khachHangEntity.getGioiTinh());
        khachHangPojo.setSoDT(khachHangEntity.getSoDT());
        khachHangPojo.setNgheNghiep(khachHangEntity.getNgheNghiep());
        return khachHangPojo;
    }
    public LoaiDichVuPojo convert(LoaiDichVuEntity loaiDichVuEntity){
        LoaiDichVuPojo loaiDichVuPojo = new LoaiDichVuPojo();
        loaiDichVuPojo.setLoaiDichVu(loaiDichVuEntity.getLoaiDichVu());
        loaiDichVuPojo.setTenLoaiDichVu(loaiDichVuEntity.getTenLoaiDichVu());
        return loaiDichVuPojo;
    }
    public YeuCauPojo convert(YeuCauEntity yeuCauEntity){
        YeuCauPojo yeuCauPojo = new YeuCauPojo();

        yeuCauPojo.setMaYeuCau(yeuCauEntity.getMaYeuCau());

        yeuCauPojo.setNgayTiepNhan(yeuCauEntity.getNgayTiepNhan());
        return yeuCauPojo;
    }
}
