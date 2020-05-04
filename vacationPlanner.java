import java.util.Scanner;

public class vacationPlanner {
    public static void main(String[] arg){
       intro();
       budget();
       time();
       kmToMiles();

    }
    public static void intro(){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to vacational planner");
        System.out.println("wht is your name");
        String name=input.next();
        System.out.println("nice to meet you "+name+", where are you travelling to:");
        String place=input.next();
        System.out.println("great! "+place+" sounds like a great place");




    }
    public static void budget(){
        Scanner input=new Scanner(System.in);
        System.out.println("how many days are you going to spend travellig: ");
        int days=input.nextInt();
        System.out.println("how much money in usd are planning to spend on trip");
        int money=input.nextInt();
        System.out.println("what is the three letter currency symbol of the country you are planning to vist:");
        String currency=input.next();
        System.out.println("how many "+currency+ " is one usd");
        double currencyconverter=input.nextDouble();
        System.out.println("");
        System.out.println("");
        int hours=days*24;
        int minutes=hours*60;
        System.out.println("if you are travelling for "+days+" days that is same as "+hours+" hours and "+minutes+" minutes");
        int perDay=money/days;
        System.out.println("if you are planning to spend "+money+" then per day you can spend "+perDay+" dollars");
        double total=money*currencyconverter;
        double mxcPerDay=total/days;
        System.out.println("your total budjet in "+currency+" is "+total+" which per day is "+mxcPerDay);
        System.out.println("**********");









    }
    public static void time(){
        Scanner input=new Scanner(System.in);
        System.out.println("what is the difference in hours between your house and destination: ");
        int difference=input.nextInt();
        int timemid=24 % 12+difference;
        int noon=12+difference;
        System.out.println("that means if it is midnight at home it will be "+timemid+" at your destination");
        System.out.println("if it is noon at your home then "+noon+" at your destination");

    }
    public static void kmToMiles(){
        Scanner input=new Scanner(System.in);
        System.out.println("what is the square area of your destination country in km :");
        double km=input.nextDouble();
        double mile=km*0.621371;
        System.out.println("in miles it would be "+mile);
    }
}
