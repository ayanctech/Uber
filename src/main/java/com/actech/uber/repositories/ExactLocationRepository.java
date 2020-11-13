package com.actech.uber.repositories;

import com.actech.uber.model.ExactLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExactLocationRepository extends JpaRepository<ExactLocation, Long> {
}
