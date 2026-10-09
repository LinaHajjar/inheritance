import java.lang.classfile.Attribute;

public class Student extends Member{

    String school;

    public Student (String name, int memberId){
        super(name, memberId);
    }

    public Student(String name, int memberId, String school){ //overload
        super(name, memberId);
        this.school=school;

    }

    @Override
    public double getPrice(){
        return 100;
    }

    @Override
    public int getMaksBookinger(){
        return 3;
    }

    @Override
    public String type(){
        return "Student";
    }

    public String getSchool() {
        return school;
    }
}
