package org.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@State(Scope.Benchmark)
public class StreamBenchmark {
    private List<Integer> numbers;
    @Setup(Level.Trial)
    public void setup() {
        int size = 10000000;
        Random random = new Random();
        numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1, 50000));
        }
    }
    @Benchmark
    public void streamFilter() {
        List<Integer> resultSecuencial = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
    @Benchmark
    public void paralellStreamFilter() {
        List<Integer> resultParalelo = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StreamBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}