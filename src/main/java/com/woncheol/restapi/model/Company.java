package com.woncheol.restapi.model;


public class Company {
	int companyNo;
    String companyName;
    String address;
    //String endDate;
    //List <Department> departmentList;

    public int getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(int companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }

//    public List<Department> getDepartmentList() {
//        return departmentList;
//    }
//
//    public void setDepartmentList(List<Department> departmentList) {
//        this.departmentList = departmentList;
//    }
}
