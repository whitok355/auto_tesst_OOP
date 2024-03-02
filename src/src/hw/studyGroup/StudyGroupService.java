package src.hw.studyGroup;

import src.hw.student.Student;
import src.hw.teacher.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup formingStudyGroup(Teacher teacher, List<Student> students){
        return new StudyGroup(teacher, students);
    }
}
