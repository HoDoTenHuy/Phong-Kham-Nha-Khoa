package danghuy.deptrai.dao;

import danghuy.deptrai.entity.ChiTietYeuCauEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChiTietYeuCauDao {
    @Autowired
    SessionFactory sessionFactory;

    public void saveChiTietYC(ChiTietYeuCauEntity chiTietYeuCauEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(chiTietYeuCauEntity);
    }
    public ChiTietYeuCauEntity updateChiTietYC(Integer id, String ngayTaiKham){
        Session session = sessionFactory.getCurrentSession().getSession();
        ChiTietYeuCauEntity chiTietYeuCauEntity = new ChiTietYeuCauEntity();
        chiTietYeuCauEntity = session.find(ChiTietYeuCauEntity.class, id);
        chiTietYeuCauEntity.setNgayTaiKham(ngayTaiKham);
        session.update(chiTietYeuCauEntity);
        return chiTietYeuCauEntity;
    }
    public void deleteChiTietYC(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        ChiTietYeuCauEntity chiTietYeuCauEntity = new ChiTietYeuCauEntity();
        chiTietYeuCauEntity = session.find(ChiTietYeuCauEntity.class, id);
        session.delete(chiTietYeuCauEntity);
    }
    public ChiTietYeuCauEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        ChiTietYeuCauEntity chiTietYeuCauEntity = new ChiTietYeuCauEntity();
        chiTietYeuCauEntity = session.get(ChiTietYeuCauEntity.class, id);
        return chiTietYeuCauEntity;
    }
}
