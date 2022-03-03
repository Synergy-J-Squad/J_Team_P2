package com.revature.repositories;

import com.revature.models.topselling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface topsellingRepository extends JpaRepository<topselling,Integer> {

}
