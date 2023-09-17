
public class NameTester
{
    public static String [] firstNames = {"Yaro", "Borys", "Austin", "Eli", "Chase","Jesus", "Sebastian","Jason", "Levi", "Xavier", "Ian", "Colton"};
    public static String [] lastNames = {"Mayewsky", "Bluto", "Mozart", "Lincoln", "Roosevelt"};
    
    public static void main(String [] arg){
        Name [] names = new Name[15];
        names[0] = new Name("Yaro", "Borys", "Mayewsky");
        names[1] = new Name("Yaro", "Borys", "Mayewsky");
        for(int n = 2; n < names.length; n++){
            names[n] = getRandomName();
        }
        for(int n = 0; n < names.length; n++){
            System.out.println("Name " + (n+1) + " : " + names[n]);
        }
        for(int n = 1; n < names.length; n++){
            System.out.print("Does name " + (n+1) + " equal name 1? ");
            if(names[n].equals(names[0])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        for(int n = 1; n < names.length; n++){
            System.out.print("Does name " + (n+1) + " come before name 1? ");
            if(names[n].compareTo(names[0]) < 0){
                System.out.println("YES");
            }else if(names[n].compareTo(names[0]) > 0){
                System.out.println("NO");
            }else{
                System.out.println("They are the same");
            }
        }

    }
    public static Name getRandomName(){
        String first, middle, last;
        if(Math.random() > .5){
            last = lastNames[(int)(Math.random() * lastNames.length)];
        }else{
            last = "Mayewsky";
        }
        if(Math.random() > .5){
            middle = firstNames[(int)(Math.random() * firstNames.length)];
        }else{
            middle = "Borys";
        }
        if(Math.random() > .5){
            first = firstNames[(int)(Math.random() * firstNames.length)];
        }else{
            first = "Yaro";
        }
        return new Name(first, middle, last);
    }
        
}
