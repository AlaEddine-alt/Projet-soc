package com.soc.soc.service;


import com.soc.soc.model.Company;
import com.soc.soc.model.JobOffer;
import com.soc.soc.repository.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobOfferService {
    @Autowired
   JobOfferRepository jobOfferRepository;

    public List<JobOffer> getAllJobOffers() {
        return jobOfferRepository.findAll();
    }

    public JobOffer getJobOfferById(Long id) {
        Optional<JobOffer> jobOffer = jobOfferRepository.findById(id);
        return jobOffer.orElse(null);
    }
    public JobOffer createJobOffer(JobOffer jobOffer) {
        return jobOfferRepository.save(jobOffer);
    }

    public Company getCompanyByJobOffer(JobOffer jobOffer)
    {
        return jobOffer.company;

    }



}
