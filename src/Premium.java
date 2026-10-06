public class Premium extends Member{

    public Premium (String name, int memberId){
        super(name, memberId);
    }

    @Override
    public double getPrice(){
        return 349;
    }



    @Override
    public int getMaksBookinger(){
        return 5;
    }

    @Override
    public String type(){
        return "Premium";
    }


}
