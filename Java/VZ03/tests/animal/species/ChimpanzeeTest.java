package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ChimpanzeeTest {
    @Test
    public void OverallTest() {
        Chimpanzee chim= new Chimpanzee(true);
        assertTrue(chim.getName().equals("Chimpanzee"));
        assertTrue(chim.isDomestic());
        assertTrue(chim.foodConsumption()==7);
        assertTrue(chim.getBioType()== Global.LAND);
        assertTrue(chim.numberOfHands()==2);
        assertTrue(chim.numberOfLegs()==2);
        assertTrue(chim.getDietType()==Global.HERB+Global.CARN);
        assertTrue(chim.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(chim.getWeight()==70);
    }
}