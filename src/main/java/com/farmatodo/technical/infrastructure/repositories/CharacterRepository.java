package com.farmatodo.technical.infrastructure.repositories;

import com.farmatodo.technical.domain.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, String>, JpaSpecificationExecutor<Character> {
}
