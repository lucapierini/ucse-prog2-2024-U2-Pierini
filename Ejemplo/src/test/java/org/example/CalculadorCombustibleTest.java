package org.example;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadorCombustibleTest {
    private CalculadorCombustible calculadorCombustible ;

    @BeforeEach
    public void setup() {
        calculadorCombustible = CalculadorCombustible.getInstance();
    }
    @Test
    public void testCalcularCombustibleAvionPrivadoDevuelve2500() {
        AvionPrivado avionPrivado = new AvionPrivado(3000, 50);
        int consumo = calculadorCombustible.calcularCombustible(avionPrivado, 20);
        assertEquals(2500, consumo);
    }

    @Test
    public void testCalcularCombustibleAvionComercialDevuelve500() {
        AvionComercial avionComercial = new AvionComercial(600, 10);
        int consumo = calculadorCombustible.calcularCombustible(avionComercial, 50);
        assertEquals(500, consumo);
    }

    @Test
    public void testCheckearInstancia() {
        CalculadorCombustible calculadorCombustible2 = CalculadorCombustible.getInstance();
        assertEquals(calculadorCombustible, calculadorCombustible2);
    }
}
