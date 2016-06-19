import java.util.*;
public class Dog{
  
  public Dog(Player y){
    System.out.println(y.dog_name+": WalWal");
    System.out.println("You stroke a "+y.dog_name);
    y.dog_love=y.dog_love+3;
    System.out.println("What would you like to do?");
    dog_day(y);
    System.out.println(y.dog_name+"love : "+y.dog_love);
  }
  public void dog_day(Player x){
    System.out.println("Feed -3$, +5¢½ + -> Press 1");
    System.out.println("Play With +3¢½ -> Press 2");
    System.out.println("Give free time + $Random-> Press 3");
  while(true){
      Scanner player_number = new Scanner(System.in);
      System.out.print("");
      int player_choice = player_number.nextInt();
      if (player_choice<=3 && player_choice >0){
        if (player_choice==1){
          System.out.println("eat food...");
          x.money=x.money-3;
          x.dog_love=x.dog_love+5;
          System.out.println(x.dog_name+"is seems content");
        }
        else if (player_choice==2){
          System.out.println("Play Game...");
          System.out.println("I think we make friends");
          x.dog_love=x.dog_love+3;
        }        
        else if (player_choice==3){
          System.out.println(x.dog_name+"went out");
          System.out.println("Wating..");
          int dog_random = (int)(Math.random()*3)+1;
          if(x.dog_love>=50){
            if(dog_random==3){
            System.out.println(x.dog_name+" have picked up antiques");
            System.out.println("Sell antiques +$10");
            x.money=x.money+10;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +3¢½");
            x.dog_love=x.dog_love+2;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" broke antiques");
              System.out.println("Pay one's money -$10");
              x.money=x.money-10;
            }
          }
          else if(x.dog_love>100){
            if(dog_random==3){
            System.out.println(x.dog_name+" have picked up antiques");
            System.out.println("Sell antiques +$10");
            x.money=x.money+10;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +5¢½");
            x.dog_love=x.dog_love+5;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" have picked up money");
              System.out.println("Pay one's money +$20");
              x.money=x.money+20;
            }
          }
          else if(x.dog_love<50){
            if(dog_random==3){
              System.out.println(x.dog_name+" Lost a thing");
            System.out.println("Lost -$20");
            x.money=x.money-20;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +2¢½");
            x.dog_love=x.dog_love+2;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" broke antiques");
              System.out.println("Pay one's money -$10");
              x.money=x.money-10;
            }
          }
          
        }
        else{
          continue;}
      }
      break;
    }
  }
}