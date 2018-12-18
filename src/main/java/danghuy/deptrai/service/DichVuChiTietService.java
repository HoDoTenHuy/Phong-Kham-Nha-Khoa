package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.DichVuChiTietDao;
import danghuy.deptrai.entity.DichVuChiTietEntity;
import danghuy.deptrai.pojo.DichVuChiTietPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DichVuChiTietService {
    @Autowired
    DichVuChiTietDao dichVuChiTietDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public DichVuChiTietPojo findByID(Integer id){
        DichVuChiTietEntity dichVuChiTietEntity = dichVuChiTietDao.findById(id);
        DichVuChiTietPojo dichVuChiTietPojo = entitytoPojo.convert(dichVuChiTietEntity);
        return dichVuChiTietPojo;
    }
    public void saveDVChiTiet(DichVuChiTietPojo dichVuChiTietPojo){
        dichVuChiTietDao.saveDVChiTiet(convertToEntity(dichVuChiTietPojo));
    }
    public void deleteDVChiTiet(Integer id){
        dichVuChiTietDao.deleteDVChiTiet(id);

    }
    public DichVuChiTietPojo findByName(String name){
        DichVuChiTietPojo dichVuChiTietPojo = entitytoPojo.convert(dichVuChiTietDao.findByName(name));
        return dichVuChiTietPojo;
    }
    public DichVuChiTietPojo updateDVChiTiet(Integer id, String name){
        DichVuChiTietPojo dichVuChiTietPojo = entitytoPojo.convert(dichVuChiTietDao.updateDVChiTiet(id, name));
        return dichVuChiTietPojo;
    }
    private DichVuChiTietEntity convertToEntity(DichVuChiTietPojo request) {
        DichVuChiTietEntity entity = new DichVuChiTietEntity();
        entity.setMaDichVuChiTiet(request.getMaDichVuChiTiet());
        entity.setTenDichVuChiTiet(request.getTenDichVuChiTiet());
        entity.setPhiDieuTri(request.getPhiDieuTri());
        entity.setPhiPhuThu(request.getPhiPhuThu());
        entity.setMoTaChiTietPhuThu(request.getMoTaChiTietPhuThu());
        return entity;
    }
}
