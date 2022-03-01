public class Student implements java.io.Serializable {
    String firstName;
    String dateOfBirth;
    Address address = null;

    Student(String n,String d,String ci,String st,int pi,String co){
        firstName = n;
        dateOfBirth = d;
        address = new Address(ci,st,pi,co);
    }
}