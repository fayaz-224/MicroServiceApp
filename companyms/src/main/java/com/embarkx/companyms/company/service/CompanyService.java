package com.embarkx.companyms.company.service;

import com.embarkx.companyms.company.dto.ReviewMessage;
import com.embarkx.companyms.company.entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);

    public void updateCompanyRating(ReviewMessage reviewMessage);
}
