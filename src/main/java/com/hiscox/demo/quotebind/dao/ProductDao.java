package com.hiscox.demo.quotebind.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hiscox.demo.quotebind.model.Product;

@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Product> getAllProducts(){
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Product.class).setFetchMode("availableIndustries.id", FetchMode.JOIN);
		return criteria.list();
	}
}
