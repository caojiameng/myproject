package com.hand;

import java.util.ArrayList;
import java.util.List;
//创建实现了上述接口的实体类
public class StudentDaoImpl implements StudentDao {
    List<Student> students;
    //列表当作一个数据库

    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
    }

    //从数据库中检索学生名单
    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student:Roll No"+student.getRollNo()+",updated in the database");
    }

    public void deleteStuednt(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student:Roll No"+ student.getRollNo()+",deleted from database");
    }
}
