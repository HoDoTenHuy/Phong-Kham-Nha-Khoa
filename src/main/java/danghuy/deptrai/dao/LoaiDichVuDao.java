package danghuy.deptrai.dao;

import danghuy.deptrai.entity.LoaiDichVuEntity;
import danghuy.deptrai.entity.YeuCauEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoaiDichVuDao {
    @Autowired
    SessionFactory sessionFactory;


    public LoaiDichVuEntity findByName(String tenLoaiDV){
        Session session = sessionFactory.getCurrentSession().getSession();
        String hql = "FROM LoaiDichVuEntity WHERE tenLoaiDichVu = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", tenLoaiDV);
        LoaiDichVuEntity loaiDichVuEntity = (LoaiDichVuEntity) query.getSingleResult();
        return loaiDichVuEntity;
    }
    public void saveLoaiDichVu(LoaiDichVuEntity loaiDichVuEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(loaiDichVuEntity);
    }
    public LoaiDichVuEntity updateLoaiDV(Integer id, String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        LoaiDichVuEntity loaiDichVuEntity = new LoaiDichVuEntity();
        loaiDichVuEntity = session.find(LoaiDichVuEntity.class, id);
        loaiDichVuEntity.setTenLoaiDichVu(name);
        session.update(loaiDichVuEntity);
        return loaiDichVuEntity;
    }
    public void deleteLoaiDV(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        LoaiDichVuEntity loaiDichVuEntity = new LoaiDichVuEntity();
        loaiDichVuEntity = session.find(LoaiDichVuEntity.class, id);
        session.delete(loaiDichVuEntity);
    }
    public LoaiDichVuEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        LoaiDichVuEntity loaiDichVuEntity = new LoaiDichVuEntity();
        loaiDichVuEntity = session.get(LoaiDichVuEntity.class, id);
        return loaiDichVuEntity;
    }
}
