package com.example.topcoder.string;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
public class WolfDelaymasterTest {

    private WolfDelaymaster wolfDelayMaster;
    private String valid;
    private String invalid;

    @BeforeMethod
    public void setup() {
        this.wolfDelayMaster = new WolfDelaymaster();
        this.valid = "VALID";
        this.invalid = "INVALID";
    }

    @Test
    public void testCheck0() {
        //setup
        String str = "wolf";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.valid);
    }

    @Test
    public void testCheck1() {
        //setup
        String str = "wwolfolf";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.invalid);
    }

    @Test
    public void testCheck2() {
        //setup
        String str = "wolfwwoollffwwwooolllfffwwwwoooollllffff";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.valid);
    }

    @Test
    public void testCheck3() {
        //setup
        String str = "flowolf";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.invalid);
    }

    @Test
    public void testCheck4() {
        //setup
        String str = "wlowloffowoowwofwlwwlol";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.invalid);
    }

    @Test
    public void testCheck5() {
        //setup
        String str = "loofwwwfooolffwlwoowwwwwfoofwowwollffowoo";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.invalid);
    }

    @Test
    public void testCheck6() {
        //setup
        String str = "wwwwwwwwwwwwoooooooooooollllllllllllffffffffffff";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.valid);
    }

    @Test
    public void testCheck7() {
        //setup
        String str = "wwwwwooooolllllfffffwwwwwwwooooooolllllllfffffff";

        //test
        String result = this.wolfDelayMaster.check(str);

        //verify
        assertEquals(result, this.valid);
    }
}