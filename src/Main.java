//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Member member1=new Member("Lina", 1);
        Member member2=new Premium("Andreas", 2);
        Student member3=new Student("Maria", 3, "EK");
        Member student=new Student("Aya", 12);

        Member pensionist=new Pensionist("anders", 21, "AP pension");

        System.out.println(member1.getName()+ ": "+ member1.getMemberId() + "\nprice: "+ member1.getPrice()+ " . Maks antal bookinger: " + member1.getMaksBookinger());
        System.out.println("du er en: "+ member1.type()+ " member");

        System.out.println(member2.getName()+ ": "+ member2.getMemberId() + "\nprice: "+ member2.getPrice()+ " . Maks antal bookinger: " + member2.getMaksBookinger());
        System.out.println("du er en: "+ member2.type()+ " member");

        System.out.println(member3.getName()+ ": "+ member3.getMemberId() + "\nprice: "+ member3.getPrice()+ " . Maks antal bookinger: " + member3.getMaksBookinger() + "\nSchool: " + member3.getSchool());
        System.out.println("du er en: "+ member3.type()+ " member");

        System.out.println(student.getName()+ ": "+ student.getMemberId() + "\nprice: "+ student.getPrice()+ " . Maks antal bookinger: " + student.getMaksBookinger());
        System.out.println("du er en: "+ student.type()+ " member");

        System.out.println(pensionist.getName()+ ": "+ pensionist.getMemberId() + "\nprice: "+ pensionist.getPrice()+ " . Maks antal bookinger: " + pensionist.getMaksBookinger());
        System.out.println("du er en: "+ pensionist.type()+ " member");

    }
}