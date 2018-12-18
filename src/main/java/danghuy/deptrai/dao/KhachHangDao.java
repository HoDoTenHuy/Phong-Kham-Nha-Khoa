package danghuy.deptrai.dao;

import danghuy.deptrai.entity.KhachHangEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KhachHangDao {
    @Autowired
    SessionFactory sessionFactory;
    public KhachHangEntity findByName(String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        String hql = "FROM KhachHangEntity WHERE tenKH = :tenKH";
        Query query = session.createQuery(hql);
        query.setParameter("tenKH", name);
        KhachHangEntity khachHangEntity = (KhachHangEntity) query.getSingleResult();
        return khachHangEntity;
    }
    public void saveKhachHang(KhachHangEntity khachHangEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(khachHangEntity);
    }
    public KhachHangEntity updateKhachHang(Integer id, String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        KhachHangEntity khachHangEntity = new KhachHangEntity();
        khachHangEntity = session.find(KhachHangEntity.class, id);
        khachHangEntity.setTenKH(name);
        session.update(khachHangEntity);
        return khachHangEntity;
    }
    public void deleteKhachHang(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        KhachHangEntity khachHangEntity = new KhachHangEntity();
        khachHangEntity = session.find(KhachHangEntity.class, id);
        session.delete(khachHangEntity);
    }
    public KhachHangEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        KhachHangEntity khachHangEntity = new KhachHangEntity();
        khachHangEntity = session.get(KhachHangEntity.class, id);
        return khachHangEntity;
    }
}
