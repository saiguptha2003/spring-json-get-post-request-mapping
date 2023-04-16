package com.web2api.web2.Controller;

import com.web2api.web2.entity.Student;
import com.web2api.web2.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-service")
public class StudentController {
    @Autowired
    private studentrepository ser;
    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student s){
        Student savestudent=ser.save(s);
        return new ResponseEntity<String>("employ saved ",HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> GetAllStudent(@RequestBody Student s){
        List<Student> savestudent=ser.findAll();
        return new ResponseEntity<>(savestudent,HttpStatus.CREATED);
    }
}
