package auto_tesst_OOP;


public class Controller {
    private final StudentGroupService groupService = new StudentGroupService();
    private final FlowService flowService = new FlowService();

    public void removeStudentByFIO(){
        groupService.removeStudentByFIO("Ivanov", "Ivan");
    }

    public void sortSudentList(){
        
        groupService.getSortedStudentList();
    }

    public void getSortedByFIO(){
        groupService.getSortedByFIO();
    }

    public void getSortFlow(){
        flowService.getSortedFlow();
    }

}
