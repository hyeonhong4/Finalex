import java.util.*;
public class Player{
  int money;
  int zen;
  ArrayList big_temple;
  ArrayList small_temple;
  int dog;
  String dog_name;
  int dog_choice;
  int dog_love;
  int write;
  int day;
  String name;
  
  public Player(String name,int money, int zen,ArrayList big_temple,ArrayList small_temple,int dog,String dog_name, int dog_choice,int dog_love,int write,int day){
    this.name=name;
    this.money=money;
    this.zen=zen;
    this.small_temple=small_temple;
    this.big_temple=big_temple;
    this.dog=dog;
    this.dog_name=dog_name;
    this.dog_choice=dog_choice;
    this.dog_love=dog_love;
    this.write=write;
    this.day=day;
  
  }
}

