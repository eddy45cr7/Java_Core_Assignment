public class Address implements java.io.Serializable {
    String city;
    String state;
    int pinCode;
    String country;

    Address(String ci,String st,int pi,String co){
        city = ci;
        state = st;
        pinCode = pi;
        country = co;
    }
}