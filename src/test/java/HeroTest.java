import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true(){
    Hero testHero = new Hero("h4x","internet troll", "pwn3d1337");
    assertEquals(true, testHero instanceof Hero);
  }

  @Test
  public void Hero_verifiesDamageToOpponent_true(){
    Hero testHero1 = new Hero("h4x","internet troll", "pwn3d1337");
    Hero testHero2 = new Hero("botnet","being 12", "w0lfF1r3");
    testHero1.attacks(testHero2);
    assertEquals(80, testHero2.getHealth());
  }

  @Test
  public void Hero_verifiesDefendNegatesDamage_true(){
    Hero testHero1 = new Hero("h4x","internet troll", "pwn3d1337");
    Hero testHero2 = new Hero("botnet","being 12", "w0lfF1r3");
    testHero2.defends();
    testHero1.attacks(testHero2);
    assertEquals(86, testHero2.getHealth());
  }

}
