package com.revature.repositories;

import com.revature.models.mostpopular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mostpopularRepository extends JpaRepository<mostpopular,Integer> {
}
