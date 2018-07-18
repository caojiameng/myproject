package com.hand;

public class TOPatterDemo {
    public static void main(String[] args){
        StudentBO studentBO = new StudentBO();

        //输出所有学生
        for (StudentVO studentVO : studentBO.getAllStudents()){
            System.out.println("Student: [RollNo :"+studentVO.getRollNo()+",Name:"+studentVO.getName()+ "]");
        }

        //更新学生
        StudentVO student = studentBO.getAllStudents().get(0);
        student.setName("Mich");
        studentBO.updateStudent(student);
        //获取学生
        studentBO.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
