package com.soc.soc.repository;

import com.soc.soc.model.Company;
import com.soc.soc.model.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
    JobOffer findByCompany(Company company);
}
