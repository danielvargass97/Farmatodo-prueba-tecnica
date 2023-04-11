package com.farmatodo.technical.infrastructure.repositories;

import com.farmatodo.technical.domain.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, String>, JpaSpecificationExecutor<Episode> {
}
