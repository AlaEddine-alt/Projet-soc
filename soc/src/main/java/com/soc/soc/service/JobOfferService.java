package com.soc.soc.service;


import com.soc.soc.model.JobOffer;
import com.soc.soc.repository.JobOfferRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobOfferService {

    private final JobOfferRepository jobOfferRepository;

    public JobOfferService(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    public JobOffer getJobOfferById(Long id) {
        Optional<JobOffer> jobOffer = jobOfferRepository.findById(id);
        return jobOffer.orElse(null);
    }
}
