package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.KhachHangDao;
import danghuy.deptrai.entity.KhachHangEntity;
import danghuy.deptrai.pojo.KhachHangPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangService {
    @Autowired
    KhachHangDao khachHangDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public KhachHangPojo findByID(Integer id){
        KhachHangEntity khachHangEntity = khachHangDao.findById(id);
        KhachHangPojo khachHangPojo = entitytoPojo.convert(khachHangEntity);
        return khachHangPojo;
    }
    public void saveKhachHang(KhachHangPojo khachHangPojo){
        khachHangDao.saveKhachHang(convertToEntity(khachHangPojo));
    }
    public void deleteKhachHang(Integer id){
        khachHangDao.deleteKhachHang(id);

    }
    public KhachHangPojo findByName(String name){
        KhachHangPojo khachHangPojo = entitytoPojo.convert(khachHangDao.findByName(name));
        return khachHangPojo;
    }
    public KhachHangPojo updateKhachHang(Integer id, String name){
        KhachHangPojo khachHangPojo = entitytoPojo.convert(khachHangDao.updateKhachHang(id, name));
        return khachHangPojo;
    }
    private KhachHangEntity convertToEntity(KhachHangPojo request) {
        KhachHangEntity entity = new KhachHangEntity();
        entity.setMaKH(request.getMaKH());
        entity.setTenKH(request.getTenKH());
        entity.setNgaySinh(request.getNgaySinh());
        entity.setSoDT(request.getSoDT());
        entity.setDiaChi(request.getDiaChi());
        entity.setGioiTinh(request.getGioiTinh());
        entity.setNgheNghiep(request.getNgheNghiep());
        return entity;
    }
}
