package com.woncheol.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woncheol.restapi.model.Company;
import com.woncheol.restapi.model.Department;
import com.woncheol.restapi.dao.CompanyDao;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyDao companyDao;


    public List<Company> getCompanyList() {

        List<Company> companyList = companyDao.getCompanyList();

        for (Company company : companyList)
        {
            Department department = new Department();
            department.setCompanyNo(company.getCompanyNo());
            
        }

        return companyList;
    }
}
