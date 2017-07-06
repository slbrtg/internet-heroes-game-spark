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

  public String addHero(Hero newHero){
    if (mSize <= 2){
      mSquadMembers.add(newHero);
      mSize++;
      return "Successfully added hero";
    } else {
      return "Squad is at maximum size";
    }
  }

}
