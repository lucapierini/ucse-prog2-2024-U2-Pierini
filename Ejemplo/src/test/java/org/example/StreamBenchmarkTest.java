package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class StreamBenchmarkTest {
    StreamBenchmarkToTest streamBenchmarkToTest;

    @BeforeEach
    void setUp() {
    streamBenchmarkToTest = new StreamBenchmarkToTest();
    }
    @Test
    void testCreateListSizeDeberiaDevolver10000000() {
        List<Integer> listaCreada = streamBenchmarkToTest.createList();
        Assertions.assertEquals(10000000, listaCreada.size());
    }

    @Test
    void testWorkListSequentialDeberiaDevolverQueNoEstaVacia() {
        List<Integer> listaResultanteSecuencial = streamBenchmarkToTest.workListSequential(streamBenchmarkToTest.createList());
        Assertions.assertFalse(listaResultanteSecuencial.isEmpty());
    }

    @Test
    void testWorkListParallelDeberiaDevolverQueNoEstaVacia() {
        List<Integer> listaResultanteParalela = streamBenchmarkToTest.workListParallel(streamBenchmarkToTest.createList());
        Assertions.assertFalse(listaResultanteParalela.isEmpty());
    }
}