package auto_tesst_OOP;

public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private String middleName;
    private int age; 
    private Integer studentId;

    public Student(String firstName, String lastName, String middleName, int age, int studentId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.studentId = studentId;
    }

    //region

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMiddleName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }
    public int getId(){
        return this.studentId;
    }


    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setMiddleName(String newMiddleName){
        this.middleName = newMiddleName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setId(int newId){
        this.studentId = newId;
    }
    //endregion

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }


}
