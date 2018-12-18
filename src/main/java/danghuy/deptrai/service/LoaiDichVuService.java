package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.LoaiDichVuDao;
import danghuy.deptrai.entity.LoaiDichVuEntity;
import danghuy.deptrai.pojo.LoaiDichVuPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiDichVuService {
    @Autowired
    LoaiDichVuDao loaiDichVuDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public LoaiDichVuPojo findByID(Integer id){
        LoaiDichVuEntity loaiDichVuEntity = loaiDichVuDao.findById(id);
        LoaiDichVuPojo loaiDichVuPojo = entitytoPojo.convert(loaiDichVuEntity);
        return loaiDichVuPojo;
    }
    public void saveLoaiDV(LoaiDichVuPojo loaiDichVuPojo){
        loaiDichVuDao.saveLoaiDichVu(convertToEntity(loaiDichVuPojo));
    }
    public void deleteLoaiDV(Integer id){
        loaiDichVuDao.deleteLoaiDV(id);

    }
    public LoaiDichVuPojo findByName(String name){
        LoaiDichVuPojo loaiDichVuPojo = entitytoPojo.convert(loaiDichVuDao.findByName(name));
        return loaiDichVuPojo;
    }
    public LoaiDichVuPojo updateLoaiDV(Integer id, String name){
        LoaiDichVuPojo loaiDichVuPojo = entitytoPojo.convert(loaiDichVuDao.updateLoaiDV(id, name));
        return loaiDichVuPojo;
    }
    private LoaiDichVuEntity convertToEntity(LoaiDichVuPojo request) {
        LoaiDichVuEntity entity = new LoaiDichVuEntity();
        entity.setLoaiDichVu(request.getLoaiDichVu());
        entity.setTenLoaiDichVu(request.getTenLoaiDichVu());
        return entity;
    }
}
