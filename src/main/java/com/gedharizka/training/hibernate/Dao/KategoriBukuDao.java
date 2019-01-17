package com.gedharizka.training.hibernate.Dao;

import com.gedharizka.training.hibernate.entity.KategoriBuku;
import org.hibernate.Session;

import java.util.List;

public class KategoriBukuDao {
    private final Session session;

    public KategoriBukuDao(Session session){
        this.session=session;
    }

    public List<KategoriBuku> findAll(){
        return this.session.createQuery("form KategoriBuku").getResultList();
    }

    public KategoriBuku save(KategoriBuku kategori){
        Integer primaryKey =(Integer) this.session.save(kategori);
        return this.findById(primaryKey);
    }

    public void save(List<KategoriBuku>list){
        for (KategoriBuku kategori : list){
            this.session.save(kategori);
        }
    }
    public KategoriBuku findById (Integer id ){
        return this.session.find(KategoriBuku.class, id);
    }
}
