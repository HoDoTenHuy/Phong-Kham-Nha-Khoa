package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.NhanVienDao;
import danghuy.deptrai.entity.NhanVienEntity;
import danghuy.deptrai.pojo.NhanVienPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
    @Autowired
    NhanVienDao nhanVienDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public NhanVienPojo findByID(Integer id){
        NhanVienEntity nhanVienEntity = nhanVienDao.findById(id);
        NhanVienPojo nhanVienPojo = entitytoPojo.convert(nhanVienEntity);
       return nhanVienPojo;
    }
    public  void saveNhanVien(NhanVienPojo nhanVienPojo){
        nhanVienDao.saveNhanVien(convertToEntity(nhanVienPojo));
    }
    public void deleteNhanVien(Integer id){
        nhanVienDao.deleteNhanVien(id);

    }
    public NhanVienPojo findByName(String name){
        NhanVienPojo nhanVienPojo = entitytoPojo.convert(nhanVienDao.findByName(name));
        return nhanVienPojo;
    }
    public NhanVienPojo updateNhanVien(Integer id, String name){
        NhanVienPojo nhanVienPojo = entitytoPojo.convert(nhanVienDao.updateNhanVien(id, name));
        return nhanVienPojo;
    }
    private NhanVienEntity convertToEntity(NhanVienPojo request) {
        NhanVienEntity entity = new NhanVienEntity();
        entity.setMaNV(request.getMaNV());
        entity.setTenNV(request.getTenNV());
        entity.setNgaySinh(request.getNgaySinh());
        entity.setSoDT(request.getSoDT());
        entity.setDiaChi(request.getDiaChi());
        entity.setViTri(request.getViTri());
        entity.setTrinhDo(request.getTrinhDo());
        return entity;
    }
}
