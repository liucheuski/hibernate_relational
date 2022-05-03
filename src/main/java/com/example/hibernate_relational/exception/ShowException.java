package com.example.hibernate_relational.exception;

import org.hibernate.HibernateError;

public class ShowException {
    public static void showNotice(HibernateError e) {
        System.out.println("Exception: " + e);
    }
}
