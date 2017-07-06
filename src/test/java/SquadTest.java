import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SquadTest{
  @Test
  public void Squad_setsAndGetsName_true(){
    Squad testSquad = new Squad("CIA");
    assertEquals(true, testSquad instanceof Squad);
  }

  @Test
  public void Squad_addsHeroesToSquadArray_true(){
    Squad testSquad = new Squad("CIA");
    Hero testHero  = new Hero("stuxnet", "getting rekt", "CIA Agent");
    testSquad.addHero(testHero);
    assertEquals(1, testSquad.getSquadSize());
  }
}
