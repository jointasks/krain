package com.jointasks.krain.tests;

import com.jointasks.krain.model.Account;
import com.jointasks.krain.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

public class HibernateTest {


    private static SessionFactory sessionFactory;

    @BeforeClass
    public static void init() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Test
    public void testAddAccount() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Account a = new Account();
        a.setUsername("zhangsan");
        session.save(a);

        session.getTransaction().commit();
    }
}
