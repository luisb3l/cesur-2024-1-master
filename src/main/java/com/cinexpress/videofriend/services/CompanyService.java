package com.cinexpress.videofriend.services;

import com.cinexpress.videofriend.models.Company;

public interface CompanyService {
    Company createCompany(Company company);
    void deleteCompany(Long id);
    Company getCompanyById(Long id);
    Company updateCompany(Long id, Company company);
}
