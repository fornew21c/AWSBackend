package com.woncheol.restapi.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.woncheol.restapi.model.Company;

import java.util.List;

@Repository
@Mapper
public interface CompanyDao {
	List<Company> getCompanyList();
}
