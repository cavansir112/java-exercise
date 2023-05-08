public class Booktest {
    public static void main(String[] args) {
        Book b1= new Book();
        Book b2= new Book();

        b1.id = 1;
        b1.name = "susan qadin";
        b1.author = "Elxan Elatli";
        b1.pageCount = 176;
        b1.description = "dedektiv";

        b2.id = 2;
        b2.name = "green mill";
        b2.author = "Stepen King";
        b2.pageCount = 256;
        b2.description = "roman";

        System.out.println(b1.id);
        System.out.println(b1.name);
        System.out.println(b1.author);
        System.out.println(b1.pageCount);
        System.out.println(b1.description);

        System.out.println(b2.id);
        System.out.println(b2.name);
        System.out.println(b2.author);
        System.out.println(b2.pageCount);
        System.out.println(b2.description);

    }
}
