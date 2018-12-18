package danghuy.deptrai.dao;

import danghuy.deptrai.entity.YeuCauEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class YeuCauDao {
    @Autowired
    SessionFactory sessionFactory;


    public void saveYeuCau(YeuCauEntity yeuCauEntity){
        Session session = sessionFactory.getCurrentSession().getSession();
        session.save(yeuCauEntity);
    }
    public YeuCauEntity updateYeuCau(Integer id, String ngayNhan){
        Session session = sessionFactory.getCurrentSession().getSession();
        YeuCauEntity yeuCauEntity = new YeuCauEntity();
        yeuCauEntity = session.find(YeuCauEntity.class, id);
        yeuCauEntity.setNgayTiepNhan(ngayNhan);
        session.update(yeuCauEntity);
        return yeuCauEntity;
    }
    public void deleteYeuCau(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        YeuCauEntity yeuCauEntity = new YeuCauEntity();
        yeuCauEntity = session.find(YeuCauEntity.class, id);
        session.delete(yeuCauEntity);
    }
    public YeuCauEntity findById(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        YeuCauEntity yeuCauEntity = new YeuCauEntity();
        yeuCauEntity = session.get(YeuCauEntity.class, id);
        return yeuCauEntity;
    }
}
