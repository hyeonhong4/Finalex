import java.util.*;
public class Dress extends Dog{
  public Dress(Player y){
    super(y);
  }
  @Override
  public void dog_day(Player x){
    System.out.println("Feed -7$, +15¢½ + -> Press 1");
    System.out.println("Have a walk +10¢½ -> Press 2");
    System.out.println("Give free time + $Random-> Press 3");
  while(true){
      Scanner player_number = new Scanner(System.in);
      System.out.print("");
      int player_choice = player_number.nextInt();
      if (player_choice<=3 && player_choice >0){
        if (player_choice==1){
          System.out.println("eat food...");
          x.money=x.money-7;
          x.dog_love=x.dog_love+15;
          System.out.println(x.dog_name+"is seems content");
        }
        else if (player_choice==2){
          System.out.println("Play walk...");
          System.out.println("I think we make friends");
          x.dog_love=x.dog_love+10;
        }        
        else if (player_choice==3){
          System.out.println(x.dog_name+"went out");
          System.out.println("Wating..");
          int dog_random = (int)(Math.random()*3)+1;
          if(x.dog_love>=50){
            if(dog_random==3){
            System.out.println(x.dog_name+" have picked up Big antiques");
            System.out.println("Sell antiques +$20");
            x.money=x.money+20;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +5¢½");
            x.dog_love=x.dog_love+5;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" broke Big antiques");
              System.out.println("Pay one's money -$20");
              x.money=x.money-20;
            }
          }
          else if(x.dog_love>100){
            if(dog_random==3){
            System.out.println(x.dog_name+" have picked up Big antiques");
            System.out.println("Sell antiques +$20");
            x.money=x.money+20;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +8¢½");
            x.dog_love=x.dog_love+8;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" have picked up many money");
              System.out.println("Pay one's money +$30");
              x.money=x.money+30;
            }
          }
          else if(x.dog_love<50){
            if(dog_random==3){
              System.out.println(x.dog_name+" Lost a thing");
            System.out.println("Lost -$30");
            x.money=x.money-30;
            }
            if(dog_random==2){
            System.out.println(x.dog_name+" was back with nothing");
            System.out.println("Happy "+x.dog_name +" +1¢½");
            x.dog_love=x.dog_love+1;
            }
            if(dog_random==1){
              System.out.println(x.dog_name+" broke Big antiques");
              System.out.println("Pay one's money -$20");
              x.money=x.money-20;
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
 