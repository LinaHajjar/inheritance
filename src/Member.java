import java.util.ArrayList;

public class Member { //a member is a normal/basic member
    private String name;
    private int memberId;
    private double price;


    public Member (String name, int memberId){
        this.name=name;
        this.memberId=memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public double getPrice(){
        return 149;
    }

    public int getMaksBookinger(){
        return 2;
    }


    public String type(){
        return "Basic";
    }


}
