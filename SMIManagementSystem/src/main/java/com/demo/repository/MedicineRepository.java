package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
