package com.torres.study.fastjsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.torres.study.fastjsonTest.bean.Course;
import com.torres.study.fastjsonTest.bean.Student;
import com.torres.study.fastjsonTest.bean.Teacher;
import com.torres.study.fastjsonTest.constants.CommonConstant;
import java.util.ArrayList;
import java.util.List;


/**
 * @author torres
 * @Description: json字符串转 java bean (反序列化)
 * @date 2018/8/10
 */
public class JsonStrToJavaBean {
    /**
     * json字符串-简单对象与JavaBean_obj之间的转换
     */
    public static void testJSONStrToJavaBeanObj(){

        Student student = JSON.parseObject(CommonConstant.JSON_OBJ_STR, new TypeReference<Student>() {});
        //Student student1 = JSONObject.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});//因为JSONObject继承了JSON，所以这样也是可以的

        System.out.println(student.getStudentName()+":"+student.getStudentAge());

    }

    /**
     * json字符串-数组类型与JavaBean_List之间的转换
     */
    public static void testJSONStrToJavaBeanList(){

        ArrayList<Student> students = JSON.parseObject(CommonConstant.JSON_ARRAY_STR, new TypeReference<ArrayList<Student>>() {});
        //ArrayList<Student> students1 = JSONArray.parseObject(JSON_ARRAY_STR, new TypeReference<ArrayList<Student>>() {});//因为JSONArray继承了JSON，所以这样也是可以的

        for (Student student : students) {
            System.out.println(student.getStudentName()+":"+student.getStudentAge());
        }
    }

    /**
     * 复杂json格式字符串与JavaBean_obj之间的转换
     */
    public static void testComplexJSONStrToJavaBean(){

        Teacher teacher = JSON.parseObject(CommonConstant.COMPLEX_JSON_STR, new TypeReference<Teacher>() {});
        //Teacher teacher = JSON.parseObject(CommonConstant.COMPLEX_JSON_STR, Teacher.class); //也可以这样使用
        //Teacher teacher1 = JSON.parseObject(COMPLEX_JSON_STR, new TypeReference<Teacher>() {});//因为JSONObject继承了JSON，所以这样也是可以的
        String teacherName = teacher.getTeacherName();
        Integer teacherAge = teacher.getTeacherAge();
        Course course = teacher.getCourse();
        List<Student> students = teacher.getStudents();
        System.out.println("----students---->"+students);


    }

    public static void main(String[] args) {
        testComplexJSONStrToJavaBean();
    }



}
