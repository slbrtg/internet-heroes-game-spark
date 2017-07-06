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

  @Test
  public void Squad_checksIfSquadArrayIsFull_string(){
    Squad testSquad = new Squad("CIA");
    Hero testHero1  = new Hero("stuxnet", "getting rekt", "CIA Agent");
    Hero testHero2  = new Hero("stuxnet", "getting rekt", "CIA Agent");
    Hero testHero3 = new Hero("stuxnet", "getting rekt", "CIA Agent");
    Hero testHero4 = new Hero("stuxnet", "getting rekt", "CIA Agent");


    testSquad.addHero(testHero1);
    testSquad.addHero(testHero2);
    testSquad.addHero(testHero3);
    assertEquals("Squad is at maximum size", testSquad.addHero(testHero4));
  }

}
