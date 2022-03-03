package com.revature.repositories;


import com.revature.models.salesbyhour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salesbyhourRepository extends JpaRepository<salesbyhour, Integer> {
}
