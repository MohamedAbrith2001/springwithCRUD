package com.sampledemo.sampleappget.Service;


import com.sampledemo.sampleappget.Entity.Student;
import com.sampledemo.sampleappget.Repository.Enitiyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
    @Autowired
    private Enitiyrepository enitiyrepository;


    public Student savedetails(Student student) {
        return enitiyrepository.save(student);

    }

    public List<Student> getdetails(){
        return  enitiyrepository.findAll();
    }

    public Student updatestudent(Student student) {
        Student updatedata = enitiyrepository.findById(student.getId()).orElse(null);

        if (updatedata!=null) {
            updatedata.setMark(student.getMark());
            updatedata.setName(student.getName());
            enitiyrepository.save(updatedata);

        }
        return updatedata;
    }
    public String deletestudent (int id) {
        enitiyrepository.deleteById(id);
        return "deleted"+id;
    }
}
