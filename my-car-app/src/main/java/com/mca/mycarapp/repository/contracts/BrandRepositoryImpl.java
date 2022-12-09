package com.mca.mycarapp.repository.contracts;

import com.mca.mycarapp.models.Brand;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static com.mca.mycarapp.util.Constants.ErrorMessages.BRAND_NOT_FOUND;

@Repository
public class BrandRepositoryImpl implements BrandRepository{

    private final SessionFactory sessionFactory;

    @Autowired
    public BrandRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Brand brand) {
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.persist(brand);
            session.getTransaction().commit();
        }


    }

    @Override
    public void update(Brand brand) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.merge(brand);
            session.getTransaction().commit();

        }
    }

    @Override
    public void delete(Brand brand) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.remove(brand);
            session.getTransaction().commit();
        }
    }

    @Override
    public Brand getById(int id) {
        try(Session session = sessionFactory.openSession()){
            Brand brand = session.get(Brand.class, id);
            if (brand == null){
                throw new EntityNotFoundException(String.format(BRAND_NOT_FOUND, id));
            }
            return brand;
        }
    }

    @Override
    public List<Brand> getAll() {
        try(Session session = sessionFactory.openSession()){
            Query<Brand> query = session.createQuery("from Brand order by name", Brand.class);
            return query.list();
        }
    }

    @Override
    public List<Brand> filterByName(String name) {
        if(name.isEmpty()){
            return getAll();
        }
        try (Session session = sessionFactory.openSession()){
            String hql = "FROM Brand B WHERE B.name = :name";
            Query query = session.createQuery(hql);
            List result = query.list();

            return result;
        }
    }

}
