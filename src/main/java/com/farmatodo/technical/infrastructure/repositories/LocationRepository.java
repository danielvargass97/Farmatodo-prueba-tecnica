package com.farmatodo.technical.infrastructure.repositories;

import com.farmatodo.technical.domain.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, String>, JpaSpecificationExecutor<Location> {
}
