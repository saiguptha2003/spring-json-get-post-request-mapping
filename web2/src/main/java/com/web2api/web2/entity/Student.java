package com.web2api.web2.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//import static org.apache.coyote.http11.Constants.a;
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    private String email;
    private String dob;
    private Integer age;
    public Student(long a,String b,String c,String d,Integer age) {
        this.id = a;
        this.name = b;
        this.email = c;
        this.dob = d;
        this.age = age;

    }

    public Student() {

    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
