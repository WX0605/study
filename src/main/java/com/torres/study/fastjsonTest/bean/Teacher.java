package com.torres.study.fastjsonTest.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/10
 */
@Getter
@Setter
@ToString
public class Teacher {
    private String teacherName;
    private Integer teacherAge;
    private Course course;
    private List<Student> students;
}
