package src.hw.studyGroup;


import src.hw.student.Student;
import src.hw.teacher.Teacher;

import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService;
    public void createStudyGroup(Teacher teacher, List<Student> students){
        studyGroupService.formingStudyGroup(teacher, students);
    }
}
