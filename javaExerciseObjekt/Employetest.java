public class Employetest {
    public static void main(String[] args){

        Employe e1 = new Employe(1);
        Employe e2 = new Employe("Nihad","Memmedov");
        Employe e3 = new Employe("Baki.seh nerimanov ray. nizami.kuc ev 13");
        Employe e4 = new Employe("051 344-23-24",555);

        System.out.println(e1.id);
        System.out.println(e2.name);
        System.out.println(e2.surname);
        System.out.println(e4.phone);
        System.out.println(e2.salary + "AZN");
        System.out.println(e3.address);
//        System.out.println(e2.);
//        System.out.println(e2.);
//
//        System.out.println(e3.id);
//        System.out.println(e3.);
//        System.out.println(e3.);
//        System.out.println(e3.);





    }
}
