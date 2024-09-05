package com.Mastan.project.Assignment.repository;


import com.Mastan.project.Assignment.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer> {


}
