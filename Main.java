package Seminar_4_HW;

// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();
        teacherController.create("ttt", "ttt", "ttt");
        teacherController.create("Ftt", "Ftt", "Ftt");
        teacherController.create("TTT", "TTT", "TTT");
        teacherController.create("tff", "tff", "tff");
        teacherController.sendConsole();
    }
}
