package com.march.rtk.repositories;

import com.march.rtk.models.ASO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ASORepository extends JpaRepository<ASO, Integer> {
}
