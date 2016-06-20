import java.util.*;
public class Final{
  public static void main(String[] args){
    ArrayList small_temple = new ArrayList();
    ArrayList big_temple = new ArrayList();
    int game_loop=1;
    int zen=0;
    int money=100;
    int dog=0;
    String dog_name="blank";
    int dog_choice=0;
    int dog_love=53;
    int write=0;
    int day=1;
    Scanner player = new Scanner(System.in);
    System.out.println("What Your name?");
    String name = player.nextLine();
    Player p1 = new Player(name,money,zen,big_temple,small_temple,dog,dog_name,dog_choice,dog_love,write,day);
    
    while(game_loop==1){
      
      System.out.println("Boss: "+p1.name+" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.");
      System.out.println("Boss: "+p1.name+" you get 30day.");
      System.out.println("Master monk : Money > 0  , Zen >= 100 , Small Temple >= 2 , Big Temple >= 1 ");
      
      for(int i = 1 ; i<31; i++){
        System.out.println(i+" days");
                
        thief(p1);
        
        Temple p2 = new Temple(p1);
        
        if(p1.dog_choice==1){
          
          if(p1.dog==1){
            Dog p1_dog = new Dog(p1);
          }
          
          if(p1.dog==2){
            Dress p1_dress = new Dress(p1);
          }
          p1.dog_choice=0;
        }
        
        if(p1.dog>=1){
          p1.dog_love=p1.dog_love-3;
        }  
        
        System.out.println("Collecting from all temples...");
        collect(p1);
        System.out.println("Done collecting from temples...");
        
        if(p1.money > 0 && p1.zen >= 100 && p1.big_temple.size() > 0 && p1.small_temple.size() > 1){
          System.out.println("You Monk Master!"+i+"turn!");
          break;
        }
        p1.day++;
      }  
    }
    
    if(p1.money > 0 && p1.zen >= 100 && p1.big_temple.size() > 0 && p1.small_temple.size() > 1){
      System.out.println("Congretion!");
    }
    
    else{
      System.out.println("Game Over");
    }
    
    Scanner tem = new Scanner(System.in);
    System.out.println("ReGame? < Press 1");
    game_loop = tem.nextInt();
  }
  
  
  public static void thief(Player x){
    if(x.dog>0){
      System.out.println(x.dog_name+" love : "+x.dog_love);
    }
    
    if(x.dog==0 && x.day%3==0){
      System.out.println("A thief broke in the temple.");
      System.out.println(x.name+" money -$30");
      x.money=x.money-30;
      System.out.println("If you trying to stop a thief, I recommend buying a dog.");
    }
    
    if(x.dog>=1 && x.day%3==0){
      System.out.println("A thief broke in the temple.");
      System.out.println(x.dog_name+": WalWal!");
      System.out.println(x.dog_name+" Shooed away the thieves!");
    }
    
    if(x.dog_love<0){
      System.out.println("You Dog Escape!");
      System.out.println("You Zen -50!!");
      x.zen=x.zen-50;
      x.dog=0;
      x.dog_love=47;
    }
  }
  
  public static void collect(Player x){
    
    for(int j=0;j<x.small_temple.size();j++){
      x.zen=x.zen+3;
      System.out.println("Collecting 3 Zen from "+x.small_temple.get(j));
    }
    
    for(int j=0;j<x.big_temple.size();j++){
      x.money=x.money+15;
      x.zen=x.zen+5;
      System.out.println("Collecting $15 and 5 Zen from "+x.big_temple.get(j));
    }
  }
}
