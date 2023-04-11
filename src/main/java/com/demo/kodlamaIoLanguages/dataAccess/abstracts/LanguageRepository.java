package com.demo.kodlamaIoLanguages.dataAccess.abstracts;

import com.demo.kodlamaIoLanguages.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
