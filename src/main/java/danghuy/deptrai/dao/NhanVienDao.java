package danghuy.deptrai.dao;

import danghuy.deptrai.entity.NhanVienEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NhanVienDao {
    @Autowired
    SessionFactory sessionFactory;


    public  NhanVienEntity findByName(String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        String hql = "FROM NhanVienEntity WHERE tenNV = :tenNV";
        Query query = session.createQuery(hql);
        query.setParameter("tenNV", name);
        NhanVienEntity nhanVienEntity = (NhanVienEntity)query.getSingleResult();
        return nhanVienEntity;
    }
    public void saveNhanVien(NhanVienEntity nhanVienEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(nhanVienEntity);
    }
    public NhanVienEntity updateNhanVien(Integer id, String name){
        Session session = sessionFactory.getCurrentSession().getSession();
        NhanVienEntity nhanVienEntity = new NhanVienEntity();
        nhanVienEntity = session.find(NhanVienEntity.class, id);
        nhanVienEntity.setTenNV(name);
        session.update(nhanVienEntity);
        return nhanVienEntity;
    }
    public void deleteNhanVien(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        NhanVienEntity nhanVienEntity = new NhanVienEntity();
        nhanVienEntity = session.find(NhanVienEntity.class, id);
        session.delete(nhanVienEntity);
    }
    public NhanVienEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        NhanVienEntity nhanVienEntity = new NhanVienEntity();
        nhanVienEntity = session.get(NhanVienEntity.class, id);
        return nhanVienEntity;
    }
}
