package com.brahvim.uni.sem4._1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySqlite extends JpaRepository<EntityFormReg, Long> {

	boolean existsByUsername(String p_username);

	// @Query("SELECT * FROM students WHERE id = :id")
	String getNameById(Integer id);

}
