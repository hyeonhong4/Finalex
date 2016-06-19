import java.util.*;
public class Temple{
  public Temple(Player x){
    System.out.println("You have $"+x.money+" and "+x.zen+" Zen points");
    System.out.println("What would you like to do?");
    System.out.println("Meditate 0$ -> Press 1");
    System.out.println("Help Someone -10$ -> Press 2");
    System.out.println("Work at Company +$50, -30 Zen -> Press 3");
    System.out.println("Purchase Temple -> Press 4");
    if(x.dog==0){
      System.out.println("Buy Dog -$30 -> Press 5");
    }
    if(x.dog>=1){
      System.out.println("Take care of "+x.dog_name+" -> Press 5");
    }
    if(x.dog==1){
      System.out.println("Dress up Dog -$30 -> Press 6");
    }
    
    while(true){
      Scanner player_number = new Scanner(System.in);
      System.out.print("");
      int player_choice = player_number.nextInt();
      if (player_choice<=6 && player_choice >0){
        if (player_choice==1){
          x.zen=x.zen+1;
        }
        else if (player_choice==2){
          x.money=x.money-10;
          x.zen=x.zen+5;
        }        
        else if (player_choice==3){
          x.money=x.money+50;
          x.zen=x.zen-30;
        }
        else if (player_choice==4){
          Purchase collect = new Purchase(x);
        }
        else if (player_choice==5){
          if(x.dog==0){
            System.out.println("You Go Pet Shop and Buy Dog");
            x.dog=x.dog+1;
            Scanner dog_name = new Scanner(System.in);
            System.out.println("What do you want to call your Dog?");
            String dogname = dog_name.nextLine();
            x.dog_name=dogname;
            x.money=x.money-30;
          }
          else{
            x.dog_choice++;
            break;
          }
        }
        else if (player_choice==6 && x.dog==1){
          System.out.println(x.dog_name+" Dress Up!");
          x.money=x.money-30;
          x.dog++;
        }
        else{
          continue;}
      }
      break;
    }
  }}
