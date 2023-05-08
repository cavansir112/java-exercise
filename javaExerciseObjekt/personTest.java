public class personTest {
    public static void main(String[] args) {

        Person p1= new Person();
        Person p2=new Person();

        p1.name = "adil";
        p2.name = "kamil";

        p1.surname = "Memmedov";
        p2.surname = "Zamanli";

        p1.id = 1;
        p2.id = 2;

        p1.phone = "050 303-12-30";
        p2.phone = "055 660-44-43";

        p1.age = 20;
        p2.age = 30;

        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p1.surname);
        System.out.println(p1.age);
        System.out.println(p1.phone);

        System.out.println(p2.id);
        System.out.println(p2.name);
        System.out.println(p2.surname);
        System.out.println(p2.age);
        System.out.println(p2.phone);

    }
}
