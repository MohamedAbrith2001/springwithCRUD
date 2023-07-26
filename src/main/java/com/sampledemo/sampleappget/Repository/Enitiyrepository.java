package com.sampledemo.sampleappget.Repository;

import com.sampledemo.sampleappget.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Enitiyrepository extends JpaRepository<Student, Integer> {

}
