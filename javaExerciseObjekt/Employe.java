public class Employe {
    int id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    public Employe (int id){
        this.id = id;
    }

    public Employe(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
//
    public Employe(String phone, int salary){
        this.phone = phone;
        this.salary = salary;
    }

    public Employe(String address){
        this.address = address;

    }

}
