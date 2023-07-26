package com.sampledemo.sampleappget.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Stu_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;
    @Column(name = "St_mark")
    private int mark;
    @Column(name = "St_name")
    private String name;
}
