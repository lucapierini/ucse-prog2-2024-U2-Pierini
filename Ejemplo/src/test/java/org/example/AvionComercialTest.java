package org.example;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {

    private AvionComercial avionComercial;
    @BeforeEach
    public void setup() {
        avionComercial = new AvionComercial(50, 10);
    }
    @Test
    public void testCalcularConsumoAvionComercialDevuelve50() {
        int consumo = avionComercial.volar(5);
        assertEquals(50, consumo);
    }

    @Test
    public void testObtenerConsumoCombustibleDevuelve10() {
        int consumo = avionComercial.getConsumoCombustible();
        assertEquals(10, consumo);
    }

}