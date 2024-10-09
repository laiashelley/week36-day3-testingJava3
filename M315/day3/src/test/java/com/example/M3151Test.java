package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class M3151Test {


    @BeforeEach
    public void beforeEach(){
        System.out.println("Ejecutando antes...");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Ejecutando después...");
    }


    @Test
    @Order(2)
    public void multiTest(){
        int resultado = M3151.multiplicar(10,3);
        assertEquals(30, resultado);
    }


    @Test
    @Order(1)
    public void diviTest(){
        int resultado = M3151.dividir(4,2);
        assertEquals(2, resultado);
    }


}
