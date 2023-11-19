package com.in60minutes.repository;

import com.in60minutes.entity.Deportment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeportmentRepo extends JpaRepository<Deportment,Long> {
}
