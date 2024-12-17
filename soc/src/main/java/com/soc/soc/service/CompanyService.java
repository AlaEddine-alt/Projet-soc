package com.soc.soc.service;


import com.soc.soc.model.Company;
import com.soc.soc.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CompanyService {
    @Autowired
     CompanyRepository companyRepository;

    public Company getCompanyById(Long id)
    {
        return companyRepository.findById(id).orElse(null);
    }



}
