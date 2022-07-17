package com.test.demo.repo;

import com.test.demo.entity.StringDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringRepo extends JpaRepository<StringDataEntity, Long> {

}
