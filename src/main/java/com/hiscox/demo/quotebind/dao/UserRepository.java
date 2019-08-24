package com.hiscox.demo.quotebind.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiscox.demo.quotebind.model.Product;
import com.hiscox.demo.quotebind.model.User;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}