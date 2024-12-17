package com.soc.soc.controller;


import com.soc.soc.model.Company;
import com.soc.soc.model.JobOffer;
import com.soc.soc.service.CompanyService;
import com.soc.soc.service.JobOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
 import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JobOfferController {
    @Autowired
    JobOfferService jobOfferService ;
    @Autowired
    CompanyService companyService;

    @QueryMapping
    public List<JobOffer> getAllJobOffers(){
        return jobOfferService.getAllJobOffers();
    }

    @QueryMapping
    public JobOffer getJobOfferById(@Argument Long id){
        return jobOfferService.getJobOfferById(id);
    }

    @QueryMapping
    public Company getCompanyById(@Argument Long id ){
        return companyService.getCompanyById(id);
    }

    @SchemaMapping
    public Company getJobOfferByCompany(JobOffer jobOffer){
        return jobOfferService.getCompanyByJobOffer(jobOffer);
    }





}
