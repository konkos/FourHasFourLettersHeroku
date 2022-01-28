package gr.konkos.FourHasFourLetters.Utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChainCalculatorTest {

    private ChainCalculator chainCalculator;

    @BeforeEach
    void init(){
        chainCalculator = new ChainCalculator();
    }

    @Test
    void chainOf4(){
        List<Response> expected = new java.util.ArrayList<>();
        expected.add(new Response("four", (long) 4));
        assertEquals(expected,chainCalculator.calculateChain((long)4));
    }

    @Test
    void chainOf3(){
        List<Response> expected = new java.util.ArrayList<>();
        expected.add(new Response("ten", (long) 10));
        expected.add(new Response("three", (long) 3));
        expected.add(new Response("five", (long) 5));
        expected.add(new Response("four", (long) 4));
        assertEquals(expected, chainCalculator.calculateChain((long) 10)
        );
    }
}