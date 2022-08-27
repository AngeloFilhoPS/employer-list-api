package com.angelo.marcio.employerList.repository;

import com.angelo.marcio.employerList.domain.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployerRepository extends JpaRepository <Employer, UUID> {

    

}
