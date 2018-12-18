package danghuy.deptrai.dao;

import danghuy.deptrai.entity.DichVuChiTietEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DichVuChiTietDao {
    @Autowired
    SessionFactory sessionFactory;


    public DichVuChiTietEntity findByName(String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        String hql = "FROM DichVuChiTietEntity WHERE tenDichVuChiTiet = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        DichVuChiTietEntity dichVuChiTietEntity = (DichVuChiTietEntity) query.getSingleResult();
        return dichVuChiTietEntity;
    }
    public void saveDVChiTiet(DichVuChiTietEntity dichVuChiTietEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(dichVuChiTietEntity);
    }
    public DichVuChiTietEntity updateDVChiTiet(Integer id, String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        DichVuChiTietEntity dichVuChiTietEntity = new DichVuChiTietEntity();
        dichVuChiTietEntity = session.find(DichVuChiTietEntity.class, id);
        dichVuChiTietEntity.setTenDichVuChiTiet(name);
        session.update(dichVuChiTietEntity);
        return dichVuChiTietEntity;
    }
    public void deleteDVChiTiet(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        DichVuChiTietEntity dichVuChiTietEntity = new DichVuChiTietEntity();
        dichVuChiTietEntity = session.find(DichVuChiTietEntity.class, id);
        session.delete(dichVuChiTietEntity);
    }
    public DichVuChiTietEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        DichVuChiTietEntity dichVuChiTietEntity = new DichVuChiTietEntity();
        dichVuChiTietEntity = session.get(DichVuChiTietEntity.class, id);
        return dichVuChiTietEntity;
    }
}
