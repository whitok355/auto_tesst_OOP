package src.hw.studyGroup;


import src.hw.student.Student;
import src.hw.teacher.Teacher;

import java.util.List;

public class StudyGroup {
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    private Teacher teacher;
    private List<Student> students;



}
