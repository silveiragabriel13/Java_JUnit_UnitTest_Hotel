package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

@Test
void testNewRoom(){
    int numerodoquarto = 200;
    String nomedoquarto = "Suite Luxo";
    double valordiaria = 500;


    Room quartoluxo = new Room(numerodoquarto, nomedoquarto, valordiaria);

    assertEquals(numerodoquarto, quartoluxo.getId());
    assertEquals(nomedoquarto, quartoluxo.getName());
    assertEquals(valordiaria, quartoluxo.getPricePerDay());
} 

}