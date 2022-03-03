package com.revature.repositories;

import com.revature.models.CleanData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanDataRepository extends JpaRepository<CleanData, Integer> {
}
