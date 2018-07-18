package com.hand;

public class Dispathcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispathcher(){
        studentView = new StudentView();
        homeView= new HomeView();
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }

    public HomeView getHomeView() {
        return homeView;
    }

    public void setHomeView(HomeView homeView) {
        this.homeView = homeView;
    }
    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
