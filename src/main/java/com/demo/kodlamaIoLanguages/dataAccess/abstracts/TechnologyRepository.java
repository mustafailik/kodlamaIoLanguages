package com.demo.kodlamaIoLanguages.dataAccess.abstracts;

import com.demo.kodlamaIoLanguages.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
}
