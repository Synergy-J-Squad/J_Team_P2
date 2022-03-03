package com.revature.repositories;

import com.revature.models.topsellingcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface topsellingcategoryRepository extends JpaRepository<topsellingcategory, Integer> {
}
