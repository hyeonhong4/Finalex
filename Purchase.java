import java.util.*;
public class Purchase{
  public Purchase(Player x){
    Scanner Purchase = new Scanner(System.in);
    System.out.println("What do you want to call your temple?");
    String Purchase_Name = Purchase.nextLine();
    System.out.println("A big temple generates $15 and 5 zen each turn.");
    System.out.println("A small temple generates 3 zen each turn.");
    System.out.println("Do you want a big (-$70, press 1) or small (-$30, press 2) temple?");
    
    while(true){
      Scanner temple = new Scanner(System.in);
      System.out.print("");
      int temple_choice = temple.nextInt();
    
      if(temple_choice==2){
        x.money=x.money-70;
        x.small_temple.add(Purchase_Name);
        break;
      }
      
      else if(temple_choice==1){
        x.money=x.money-30;
        x.big_temple.add(Purchase_Name);
        break;}
      
      else{
      continue;}
    }
  } 
}
