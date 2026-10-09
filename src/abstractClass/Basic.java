package abstractClass;

public class Basic extends Member {

    public Basic (String name, int memberId){
        super(name, memberId);
    }


    public int getMaksBookinger(){
        return 0;
    }

    public String type(){
        return "Lina";
    }

    public int getPrice(){
        return 149;
    }


}
