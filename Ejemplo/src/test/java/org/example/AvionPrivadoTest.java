package org.example;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AvionPrivadoTest {

    private AvionPrivado avionPrivado= new AvionPrivado(200, 50);

    @Test
    public void testCalcularConsumoAvionPrivadoDevuelve250() {
        int consumo = avionPrivado.volar(5);
        assertEquals(350, consumo);
    }

    @Test
    public void testObtenerConsumoCombustibleDevuelve50() {
        int consumo = avionPrivado.getConsumoCombustible();
        assertEquals(50, consumo);
    }
}
