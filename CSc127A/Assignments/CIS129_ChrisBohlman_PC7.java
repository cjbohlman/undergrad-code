/*************************************************************************
 *  Compilation:  javac CIS129_ChrisBohlman_PC7.java
 *  Execution:    java CIS129_ChrisBohlman_PC7
 *  author: Chris Bohlman
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class CIS129_ChrisBohlman_PC7 {

    /// attributes
    private String name;
    private String address;
    private int age;
    private int phoneNumber;
    /// methods
    public String getName() {return name;}
    public String getAddress() {return address;}
    public int getAge() {return age;}
    public int getPhone() {return phoneNumber;}
    
    //setters
    public void setName(String n) {name = n;}
    public void setAddress(String ad) {address = ad;}
    public void setPhone(int p) {phoneNumber = p;}
    public void setAge(int ag) {age = ag;}
   
    //constructor
    public CIS129_ChrisBohlman_PC7(String n, String ad, int ag, int p) {
    n= name;
    ad = address;
    ag = age;
    p = phoneNumber;
    }
   
      //instances
      CIS129_ChrisBohlman_PC7 myPersonalInfo = new CIS129_ChrisBohlman_PC7( );
      
      CIS129_ChrisBohlman_PC7 parentPersonalInfo = new CIS129_ChrisBohlman_PC7( );
      
      CIS129_ChrisBohlman_PC7 friendPersonalInfo = new CIS129_ChrisBohlman_PC7( );
    
    
}


