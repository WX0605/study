package com.torres.study.fastjsonTest;

import com.alibaba.fastjson.JSON;
import com.torres.study.fastjsonTest.bean.Course;
import com.torres.study.fastjsonTest.bean.Student;
import com.torres.study.fastjsonTest.bean.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author torres
 * @Description: java bean 转Json str (序列化)
 * @date 2018/8/10
 */
public class JsonBeanToJsonStr {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTeacherAge(20);
        teacher.setTeacherName("torres");

        Course course = new Course();
        course.setCode(10010);
        course.setCourseName("math");
        teacher.setCourse(course);

        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        student1.setStudentAge(13);
        student1.setStudentName("wade");
        Student student2 = new Student();
        student2.setStudentAge(13);
        student2.setStudentName("james");
        students.add(student1);
        students.add(student2);

        teacher.setStudents(students);
        //序列化
        String text = JSON.toJSONString(teacher);

        System.out.println("--text-->"+text);
    }


}
