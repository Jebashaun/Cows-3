
public class MyDateTester
{
    public static void main(String [] arg){
        MyDate [] dates = new MyDate[15];
        dates[0] = new MyDate(15, 4, 1978);
        dates[1] = new MyDate(15, 4, 1978);
        for(int n = 2; n < dates.length; n++){
            dates[n] = getRandomDate();
        }
        for(int n = 0; n < dates.length; n++){
            System.out.println("Date " + (n+1) + " : " + dates[n]);
        }
        for(int n = 1; n < dates.length; n++){
            System.out.print("Does date " + (n+1) + " equal date 1? ");
            if(dates[n].equals(dates[0])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        for(int n = 1; n < dates.length; n++){
            System.out.print("Does date " + (n+1) + " come before date 1? ");
            if(dates[n].compareTo(dates[0]) < 0){
                System.out.println("YES");
            }else if(dates[n].compareTo(dates[0]) > 0){
                System.out.println("NO");
            }else{
                System.out.println("They are the same");
            }
        }

    }
    public static MyDate getRandomDate(){
        int day;
        int month;
        int year;
        if(Math.random() > .5){
            year = 1950 + (int)(Math.random()*66);
        }else{
            year = 1978;
        }
        if(Math.random() > .5){
            month = 1 + (int)(Math.random()*11);
        }else{
            month = 4;
        }
        if(Math.random() > .5){
            day = 1 + (int)(Math.random()*30);
        }else{
            day = 15;
        }
        return new MyDate(day, month, year);
    }
}
