import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   public static void main(String args[]){
       String loged_in = "" ;
       String Username1;
       String Password1;
       String Username2;
       String Password2;
       ArrayList<String> foods = new ArrayList<String>();
       foods.add("roast beef");
       foods.add("spageti");
       foods.add("chicken");

       Username1 ="erfan";
       Password1= "1234";
       Username2= "saeed";
       Password2= "56789";

       Person erfan = new Person(Username1 , Password1);
       erfan.setPermision(0);

       Person saeed = new Person(Username2 , Password2);
       saeed.setPermision(0);

       Scanner Input1=new Scanner(System.in);
       System.out.println("Enter Username:");
       String username = Input1.next();

       Scanner Input2=new Scanner(System.in);
       System.out.println("Enter Password:");
       String password = Input2.next();

       long systemTime=0;
       if((username.equals(erfan.getUsername()) && password.equals(erfan.getPassword()))|| username.equals(saeed.getUsername()) && password.equals(saeed.getPassword())) {
           System.out.print("Acsses Generate...Welcome!");
           loged_in = username;
           systemTime=System.nanoTime();
           Boolean online =  Boolean.TRUE ;
           while (online){
               Scanner Input3=new Scanner(System.in);
               String aaa=Input3.next();

               if(aaa.equalsIgnoreCase("Exit")){
                   long estimatedTime=System.nanoTime();
                   long dif = (estimatedTime - systemTime);
                   Duration duration=Duration.ofNanos(dif);
                   online = false;
                   System.out.print(duration.getSeconds());
               }
               else if (aaa.equalsIgnoreCase("Permision")){
                   Integer out = 0 ;
                   if (loged_in.equalsIgnoreCase(erfan.getUsername())){
                       out = erfan.getPermision();
                       erfan.setPermision(erfan.getPermision() + 1);
                   }
                   else if (loged_in.equalsIgnoreCase(saeed.getUsername())) {
                       out = saeed.getPermision();
                       saeed.setPermision(saeed.getPermision() + 1);
                   }
                   if(aaa.equalsIgnoreCase("reserve")){
                       System.out.println(foods);
                       Scanner Input4=new Scanner(System.in);
                       Integer bbb=Input4.nextInt();
                       if (loged_in.equalsIgnoreCase(erfan.getUsername())){
                           erfan.setFood(foods.get(bbb));
                           System.out.println(foods);
                       }
                       else if (loged_in.equalsIgnoreCase(saeed.getUsername())) {
                           saeed.setFood(foods.get(bbb));
                       }


                   }

                   if ( out < 3 ){
                       System.out.println("you have permision to take a day off");

                   }
                   else {
                       System.out.println("you cannot use this it anymore...");}}}

       } else if(username.equals(erfan.getUsername()) || username.equals(saeed.getUsername())){
           System.out.print("Invalid password");
       } else if(password.equals(erfan.getPassword()) || password.equals(saeed.getPassword())) {
       System.out.print("Invalid User");
       }else{
           System.out.print("User & pass are invalid...!");
       }

           }
       }

