import java.util.*;

public class PersonTester
{
    
    public static boolean testPerson(){
        Name name1 = new Name("Yaroslav", "Borys", "Mayewsky");
        MyDate date1 = new MyDate(13, 1, 1978);
        Address address1 = new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA");
        String [] interests1 = {"singing", "dancing", "computer science", "art"};

        Person person1 = new Person(name1, date1, address1, 123456789, interests1);

        Name name2 = new Name("Yaroslav", "Borys", "Mayewsky");
        MyDate date2 = new MyDate(13, 1, 1978);
        Address address2 = new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA");
        String [] interests2 = {"singing", "dancing", "computer science", "art"};

        Person person2 = new Person(name2, date2, address2, 987654321, interests2);

        Name name3 = new Name("Yaroslav", "Volodymyr", "Mayewsky");
        MyDate date3 = new MyDate(13, 1, 1978);
        Address address3 = new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA");
        String [] interests3 = {"singing", "dancing", "computer science", "art"};

        Person person3 = new Person(name3, date3, address3, 111111111, interests3);

        boolean success = true;

        if(!person1.getName().equals(name1)){
            success = false;
            System.out.println("name variable or accessor method not set up correctly!");
        }
        if(!person1.getBirthDay().equals(date1)){
            success = false;
            System.out.println("birthDay variable or accessor method not set up correctly!");
        }
        if(!person1.getHomeAddress().equals(address1)){
            success = false;
            System.out.println("address variable or accessor method not set up correctly!");
        }
        if(person1.getSocSecNumber() != 123456789){
            success = false;
            System.out.println("socialSecurityNumber variable or accessor method not set up correctly!");
        }
        String [] interests4 = person1.getInterests();
        if(interests4.length != interests1.length){
            success = false;
            System.out.println("interests variable or accessor method not set up correctly!");
        }else{
            for(int i = 0; i < interests4.length; i++){
                if(!interests1[i].equals(interests4[i])){
                    success = false;
                    System.out.println("interests variable or accessor method not set up correctly!");
                }
            }
        }

        if(!person1.equals(person1)){
            success = false;
            System.out.println("False negative for equals");
        }
        if(person1.equals(person2)){
            success = false;
            System.out.println("False positive for equals");
        }
        if(person1.equals(person3)){
            success = false;
            System.out.println("False positive for equals");
        }

        if(person1.compareTo(person2) != 0){
            success = false;
            System.out.println("compareTo does not recognise people with same name");
        }
        if(person1.compareTo(person3) >= 0){
            success = false;
            System.out.println("compareTo not working properly");
        }
        if(person3.compareTo(person1) <= 0){
            success = false;
            System.out.println("compareTo not working properly");
        }

        return success;
    }

    public static void main(String [] arg){
        int numPeople = 12;
        ArrayList<Name> names = new ArrayList<Name>();
        ArrayList<MyDate> dates = new ArrayList<MyDate>();
        ArrayList<Address> addresses = new ArrayList<Address>();
        ArrayList<Integer> socialSecNums = new ArrayList<Integer>();
        ArrayList<String []> interests = new ArrayList<String []>();
        //{"Becoming President", "gaming", "painting", "gardening", "sewing", "cartography", "dancing"}; 

        for(int i = 0; i < 13; i++){
            socialSecNums.add((int)(Math.random() * 1000000000));
        }

        names.add(new Name("Justin", "Drew", "Bieber"));
        dates.add(new MyDate(1, 3, 1994));
        addresses.add(new Address(3001, "Arrowhead Lane", "Los Angeles", "CA", 900689270, "USA"));
        String [] a = {"singing", "dancing"};
        interests.add(a);

        names.add(new Name("Dippy", "Goofy", "Dawg"));
        dates.add(new MyDate(3, 9, 1932));
        addresses.add(new Address(3, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] b = {"goofing around"};
        interests.add(b);
        
        names.add(new Name("Bill", "Henry", "Gates"));
        dates.add(new MyDate(28, 10, 1955));
        addresses.add(new Address(1835, "73rd Ave", "Seattle", "WA", 981017463, "USA"));
        String [] c = {"computer science", "business", "philanthropy"};
        interests.add(c);

        names.add(new Name("Melinda", "Ann", "Gates"));
        dates.add(new MyDate(15, 9, 1964));
        addresses.add(new Address(1835, "73rd Ave", "Seattle", "WA", 981017463, "USA"));
        String [] d = {"computer science", "business", "philanthropy"};
        interests.add(d);

        names.add(new Name("Yaroslav", "Borys", "Mayewsky"));
        dates.add(new MyDate(13, 1, 1978));
        addresses.add(new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA"));
        String [] z = {"singing", "dancing", "computer science", "art"};
        interests.add(z);

        names.add(new Name("Mickey", "Fauntleroy", "Mouse"));
        dates.add(new MyDate(18, 11, 1928));
        addresses.add(new Address(1, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] e = {"dancing", "comedy", "cheese"};
        interests.add(e);
        

        names.add(new Name("Minerva", "Minnie", "Mouse"));
        dates.add(new MyDate(18, 11, 1928));
        addresses.add(new Address(2, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] f = {"singing", "comedy", "hair bows", "cheese"};
        interests.add(f);
        
        names.add(new Name("Stuart", "Little", "Mouse"));
        dates.add(new MyDate(22, 1, 1945));
        addresses.add(new Address(1900, "5th Ave", true, 128, "New York", "NY", 100228374, "USA"));
        String [] g = {"cooking", "hiking"};
        interests.add(g);
        
        names.add(new Name("Barack", "Hussein", "Obama"));
        dates.add(new MyDate(4, 9, 1961));
        addresses.add(new Address(1600, "Pennsylvania Ave NW", "Washington", "DC", 205000000, "USA"));
        String [] h = {"law", "politics", "basketball"};
        interests.add(h);
        
        names.add(new Name("Michelle", "LaVaughn-Robinson", "Obama"));
        dates.add(new MyDate(17, 1, 1964));
        addresses.add(new Address(1600, "Pennsylvania Ave NW", "Washington", "DC", 205000000, "USA"));
        String [] i = {"politics", "medicine", "fitness"};
        interests.add(i);
        
        names.add(new Name("Donald", "John", "Trump"));
        dates.add(new MyDate(14, 6, 1946));
        addresses.add(new Address(725, "5th Ave", true, 666, "New York", "NY", 100223742, "USA"));
        String [] j = {"money", "politics", "beauty pagents"};
        interests.add(j);

        names.add(new Name("Melania", "the 3rd wife", "Trump"));
        dates.add(new MyDate(26, 4, 1970));
        addresses.add(new Address(725, "5th Ave", true, 666, "New York", "NY", 100223742, "USA"));
        String [] k = {"modeling"};
        interests.add(k);
        
        
        System.out.println("\n\n=========Testing toString===========\n");
        Person [] peeps = new Person[numPeople];
        for(int n = 0; n < numPeople; n++){
            peeps[n] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
            System.out.println(peeps[n]);
            System.out.println();
        }
        
        System.out.println("\n\n=========Testing equals===========\n");
        
        System.out.print("Is " + peeps[2].getName() + " the same as " + peeps[2].getName() + "?  ");
        if(peeps[2].equals(peeps[2])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        System.out.print("Is " + peeps[2].getName() + " the not the same as " + peeps[3].getName() + "?  ");
        if(!peeps[2].equals(peeps[3])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        System.out.println("\n\n=========Testing compareTo===========\n");
        
        System.out.print("Does " + peeps[2].getName() + " come before " + peeps[3].getName() + "?  ");
        if(peeps[2].compareTo(peeps[3]) < 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        System.out.print("Does " + peeps[2].getName() + " come after " + peeps[1].getName() + "?  ");
        if(peeps[2].compareTo(peeps[1]) > 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}