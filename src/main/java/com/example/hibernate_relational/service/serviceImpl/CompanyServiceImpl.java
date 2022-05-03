package com.example.hibernate_relational.service.serviceImpl;

import com.example.hibernate_relational.entity.Company;
import com.example.hibernate_relational.entity.Person;
import com.example.hibernate_relational.exception.ShowException;
import com.example.hibernate_relational.repository.CompanyDao;
import com.example.hibernate_relational.repository.repositoryImpl.CompanyDaoImpl;
import com.example.hibernate_relational.service.CompanyService;
import org.hibernate.HibernateError;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {
    CompanyDao companyDao = new CompanyDaoImpl();

    public CompanyServiceImpl() {
    }

    @Override
    public boolean addCompany(Company company) {
        boolean isAdded = false;
        try {
            companyDao.addCompany(company);
            isAdded = true;
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isAdded;
    }

    @Override
    public boolean updateCompany(Company company) {
        boolean isUpdated = false;
        System.out.println("Это ДЗ");
        return isUpdated;
    }

    @Override
    public boolean deleteCompany(int id) {
        boolean isDeleted = false;
        try {
            if (companyDao.deleteCompany(id))
                isDeleted = true;
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isDeleted;
    }

    @Override
    public List<Company> showCompanies() {
        List<Company> companies = null;
        try {
            companies = companyDao.showCompanies();
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return companies;
    }

    @Override
    public Company findCompanyById(int id) {
        Company company = null;
        try {
            company = companyDao.findCompanyById(id);
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return company;
    }

    @Override
    public Company findCompanyByName(String name) {
        Company company = null;
        try {
            company = companyDao.findCompanyByName(name);
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return company;

    }
}
