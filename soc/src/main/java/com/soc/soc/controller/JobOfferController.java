package com.soc.soc.controller;


import com.soc.soc.model.Company;
import com.soc.soc.model.JobOffer;
import com.soc.soc.repository.CompanyRepository;
import com.soc.soc.repository.JobOfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class JobOfferController {

    private final JobOfferRepository jobOfferRepo;
    private final CompanyRepository companyRepo;

    @QueryMapping
    public List<JobOffer> getAllJobOffers(){
        return jobOfferRepo.findAll();
    }

    @QueryMapping
    public JobOffer getJobOfferById(@Argument Long id){
        return jobOfferRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public Company getCompanyById(@Argument Long id ){
        return companyRepo.findById(id).orElse(null);
    }

    @SchemaMapping
    public JobOffer getJobOfferByCompany(Company company){
        return jobOfferRepo.findByCompany(company);
    }



}
