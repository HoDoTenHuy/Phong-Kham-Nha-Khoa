package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.YeuCauDao;
import danghuy.deptrai.entity.YeuCauEntity;
import danghuy.deptrai.pojo.YeuCauPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YeuCauService {
    @Autowired
    YeuCauDao yeuCauDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public YeuCauPojo findByID(Integer id){
        YeuCauEntity yeuCauEntity = yeuCauDao.findById(id);
        YeuCauPojo yeuCauPojo = entitytoPojo.convert(yeuCauEntity);
        return yeuCauPojo;
    }
    public void saveYeuCau(YeuCauPojo yeuCauPojo){
        yeuCauDao.saveYeuCau(convertToEntity(yeuCauPojo));
    }
    public void deleteYeuCau(Integer id){
        yeuCauDao.deleteYeuCau(id);

    }
    public YeuCauPojo updateYeuCau(Integer id, String ngayNhan){
        YeuCauPojo yeuCauPojo = entitytoPojo.convert(yeuCauDao.updateYeuCau(id, ngayNhan));
        return yeuCauPojo;
    }
    private YeuCauEntity convertToEntity(YeuCauPojo request) {
        YeuCauEntity entity = new YeuCauEntity();
        entity.setMaYeuCau(request.getMaYeuCau());
        entity.setNgayTiepNhan(request.getNgayTiepNhan());
        return entity;
    }
}
