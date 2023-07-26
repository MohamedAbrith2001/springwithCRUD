package com.sampledemo.sampleappget.Controller;

import com.sampledemo.sampleappget.Entity.Student;
import com.sampledemo.sampleappget.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studencontroller {
    @Autowired
    private Studentservice studentservice;

    @PostMapping ("/addstudents")
    public Student postdetail(@RequestBody Student student) {
        return studentservice.savedetails(student);
    }
    @GetMapping ("/getstudent")
    public List<Student> getdetail(){
        return studentservice.getdetails();
    }
    @PutMapping ("/updatedata")
    public Student updatedatails(@RequestBody Student student) {
        return studentservice.updatestudent(student);
    }
    @DeleteMapping("/deletestudent/{id}")
    public String delete(@PathVariable int id ) {
        return studentservice.deletestudent(id);
    }

}
