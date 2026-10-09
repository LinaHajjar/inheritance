public class Pensionist extends Member{
    String pensionNavn;


    public Pensionist(String name, int memberId, String pensionNavn){
        super(name, memberId);
        this.pensionNavn=pensionNavn;
    }

    public String type(){
        return "Pensionist";
    }

}
