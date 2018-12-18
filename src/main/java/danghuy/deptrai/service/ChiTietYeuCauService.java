package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.ChiTietYeuCauDao;
import danghuy.deptrai.entity.ChiTietYeuCauEntity;
import danghuy.deptrai.pojo.ChiTietYeuCauPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietYeuCauService {
    @Autowired
    ChiTietYeuCauDao chiTietYeuCauDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public ChiTietYeuCauPojo findByID(Integer id){
        ChiTietYeuCauEntity chiTietYeuCauEntity = chiTietYeuCauDao.findById(id);
        ChiTietYeuCauPojo chiTietYeuCauPojo = entitytoPojo.convert(chiTietYeuCauEntity);
        return chiTietYeuCauPojo;
    }
    public void saveChiTietYC(ChiTietYeuCauPojo chiTietYeuCauPojo){
        chiTietYeuCauDao.saveChiTietYC(convertToEntity(chiTietYeuCauPojo));
    }
    public void deleteChiTietYC(Integer id){
        chiTietYeuCauDao.deleteChiTietYC(id);

    }
    public ChiTietYeuCauPojo updateChiTietYC(Integer id, String ngayTaiKham){
        ChiTietYeuCauPojo chiTietYeuCauPojo =
                entitytoPojo.convert(chiTietYeuCauDao.updateChiTietYC(id, ngayTaiKham));
        return chiTietYeuCauPojo;
    }
    private ChiTietYeuCauEntity convertToEntity(ChiTietYeuCauPojo request) {
        ChiTietYeuCauEntity entity = new ChiTietYeuCauEntity();
        entity.setPhongDieuTri(request.getPhongDieuTri());
        entity.setHinhThucDieuTri(request.getHinhThucDieuTri());
        entity.setTinhTrangDieuTri(request.getTinhTrangDieuTri());
        entity.setNgayTaiKham(request.getNgayTaiKham());
        entity.setBacSyDieuTri(request.getBacSyDieuTri());
        entity.setGhiChuChiTiet(request.getGhiChuChiTiet());
        return entity;
    }
}
