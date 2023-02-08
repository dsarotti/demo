package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class CuentaTest {
    private Cuenta cuenta;

    @BeforeAll
    public void nuevaCuenta(){
        cuenta = new Cuenta();
    }
}
