import java.awt.*;

public class AddressTester
{
    public static void main(String [] arg){
        Address [] addresses = new Address [6];
        
        addresses[0] = new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA");
        
        addresses[1] = new Address(986, "Glowood Drive", true, 227, "Pittsburgh", "PA", 152271214, "USA");
        
        addresses[2] = new Address(986, "Glowood Drive", true, 228, "Pittsburgh", "PA", 152271214, "USA");

        addresses[3] = new Address(986, "Glowood Drive", true, 227, "Richmond", "VA", 152271214, "USA");
        
        addresses[4] = new Address(986, "Glowood Drive", "Pittsburgh", "PA", 152271214, "USA");
        
        addresses[5] = new Address(986, "Glowood Drive", true, 227, "Pittsburgh", "PA", 152271214, "USA");
        for(int n = 0; n < addresses.length; n++){
            System.out.println("     Address " + (n+1));
            System.out.println(addresses[n]);
            System.out.println();
        }
        for(int n = 2; n < addresses.length; n++){
            System.out.print("Does address " + (n+1) + " equal address 2? ");
            if(addresses[n].equals(addresses[1])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
