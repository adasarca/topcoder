package com.example.topcoder.string;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
public class BuffaloBuffaloTest {

    private BuffaloBuffalo buffaloBuffalo;
    private String good;
    private String notGood;

    @BeforeMethod
    public void setup() {
        this.buffaloBuffalo = new BuffaloBuffalo();
        this.good = "Good";
        this.notGood = "Not good";
    }

    @Test
    public void testCheck0() {
        //setup
        String s = "buffalo buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.good);
    }

    @Test
    public void testCheck1() {
        //setup
        String s = "buffalobuffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.notGood);
    }

    @Test
    public void testCheck2() {
        //setup
        String s = "buffalo buffalo buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.good);
    }

    @Test
    public void testCheck3() {
        //setup
        String s = "buf falo buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.notGood);
    }

    @Test
    public void testCheck4() {
        //setup
        String s = "cow";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.notGood);
    }

    @Test
    public void testCheck5() {
        //setup
        String s = "buffalo  buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.notGood);
    }

    @Test
    public void testCheck6() {
        //setup
        String s = "buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.good);
    }

    @Test
    public void testCheck7() {
        //setup
        String s = "lllflfu ubbbubfafollo falabab bbbfubalalafubflblaloalblaluf uo fufloll oaalulb auofobfuboll oouul ofauluuboabbbbbaoal a f bfl afuoaufb bbubf lubbblf l foaulofuofuobbaboo auullafuu llalloob auubfabl bal blfloabufuabolaulbfu a ulbo l a uffobla lbufofo oloaofufllabl fboolbobbala ffu olffooo ufb bf ulloobubbffaoubboauboufu bb oauf ooobua f lallbfabff olu foffufuoaba fol alfll l f bf uaa bulla blbblallualflaaao ffalbbboofaalo auf l boafalllau u buaa ob b ffuafaooffb buauflfuuufaa fou aub fafllloo aaafuouaffbaoaublf ua laolab fflafuofo bllaoulo ablu ufbau lb boaobuuf uoobuflufbf uf bolab oab faffla uabalufulo ualoobuaolf uafb bolauauualfbo fbbo oluolblu oaaoafbfloua uallb ullb lfbaluba a obualfbu flub lu l fbfu aufluob ofaauubauu oufuul obllaoflbbof f faoabbuuaffluafbaauaoblbaa a ufa aub uualu uo ful fbllu";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.notGood);
    }

    @Test
    public void testCheck8() {
        //setup
        String s = "buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo buffalo";

        //test
        String result = this.buffaloBuffalo.check(s);

        //verify
        assertEquals(result, this.good);
    }
}