package com.web2api.web2.repository;
//import web2.entity.Student;
import com.web2api.web2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepository extends JpaRepository<Student,String> {
}
