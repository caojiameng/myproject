package com.hand;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model,StudentView view) {
        this.model=model;
        this.view=view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }
    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }
}
