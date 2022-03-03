package com.revature.repositories;

import com.revature.models.highesttraffic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface highesttrafficRepository extends JpaRepository<highesttraffic,Integer> {
}
