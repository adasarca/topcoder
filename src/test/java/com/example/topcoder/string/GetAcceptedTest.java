package com.example.topcoder.string;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
public class GetAcceptedTest {

    private GetAccepted getAccepted;

    @BeforeMethod
    public void setup() {
        this.getAccepted = new GetAccepted();
    }

    @Test
    public void testAnswer0() {
        //setup
        String question = "Do you want to get accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "True.");
    }

    @Test
    public void testAnswer1() {
        //setup
        String question = "Do you not want to get accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "False.");
    }

    @Test
    public void testAnswer2() {
        //setup
        String question = "Do you want to not get accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "False.");
    }

    @Test
    public void testAnswer3() {
        //setup
        String question = "Do you want to get not not accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "True.");
    }

    @Test
    public void testAnswer4() {
        //setup
        String question = "Do you not want to not get not not not accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "False.");
    }

    @Test
    public void testAnswer5() {
        //setup
        String question = "Do you want to get not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "False.");
    }

    @Test
    public void testAnswer6() {
        //setup
        String question = "Do you not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not not want to get accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "False.");
    }

    @Test
    public void testAnswer7() {
        //setup
        String question = "Do you not not not not not not not not not not not not not not not not not not not not want to not not not not not not not not not not not not not not not not not not not not not not not not not not get not not not not not not accepted?";

        //test
        String answer = this.getAccepted.answer(question);

        //verify
        assertEquals(answer, "True.");
    }
}