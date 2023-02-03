package com.example.bms.bms23.repository;

import com.example.bms.bms23.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {

}
