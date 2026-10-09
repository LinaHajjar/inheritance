package abstractClass;

public abstract class Member {
    private String name;
    private int memberId;


    public Member (String name, int memberId){
        this.name=name;
        this.memberId=memberId;
    }


    //abstracte metoder som SKAL defineres i subklasserne
    public abstract int getMaksBookinger();
    public abstract String type();
    public abstract int getPrice();


}
