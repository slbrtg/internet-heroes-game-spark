import java.util.*;

public class Hero {
  private int mAttack;
  private int mDefense;
  private int mHealth;
  private String mSpecialAttack;
  private String mWeakness;
  private String mName;

  public Hero(String specialAttack, String weakness, String name){
    mAttack = 20;
    mDefense = 10;
    mHealth = 100;
    mSpecialAttack = specialAttack;
    mWeakness = weakness;
    mName = name;
  }

  public int getAttack(){
    return mAttack;
  }

  public int getDefense(){
    return mDefense;
  }

  public int getHealth(){
    return mHealth;
  }

  public String getName(){
    return mName;
  }

  public String specialAttack(){
    return mSpecialAttack;
  }

  public String weakness(){
    return mWeakness;
  }

  public void attacks(Hero opponent){
    opponent.mHealth -= mAttack;
  }

  public void defends(){
    mHealth += 6;
  }
}
