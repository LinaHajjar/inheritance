public class Student extends Member{

    public Student (String name, int memberId){
        super(name, memberId);
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
}
