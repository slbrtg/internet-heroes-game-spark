import java.util.*;

public class Squad {
  private List<Hero> mSquadMembers = new ArrayList<Hero>();
  private String mSquadName;
  private int mSize;

  public Squad (String squadName){
    mSquadName = squadName;
    mSize = 0;
  }

  public List<Hero>  getSquadMembers(){
    return mSquadMembers;
  }

  public int getSquadSize(){
    return mSquadMembers.size();
  }

  public String getSquadName(){
    return mSquadName;
  }

  public void addHero(Hero newHero){
    if (mSize <= 2){
      mSquadMembers.add(newHero);
      mSize++;
    } else {
      System.out.println("Squad is at maximum size");
    }
  }

}
