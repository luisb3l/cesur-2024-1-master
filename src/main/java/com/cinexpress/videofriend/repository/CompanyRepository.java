package com.cinexpress.videofriend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinexpress.videofriend.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
