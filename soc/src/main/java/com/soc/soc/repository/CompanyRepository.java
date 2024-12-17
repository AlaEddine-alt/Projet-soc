package com.soc.soc.repository;

import com.soc.soc.model.Company;
import com.soc.soc.model.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
