package org.example;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Ejercicio4 {
        public static void main(String[] args) throws Exception {
            CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());

            CompletableFuture<Object> anyFutures = CompletableFuture.anyOf(future1, future2, future3, future4);

            System.out.println("La primer tarea en terminar fue: " + anyFutures.get());
        }

        private static int generateRandomNumberAndSleep() {
            int randomNumber = ThreadLocalRandom.current().nextInt(100, 501);
            try {
                TimeUnit.MILLISECONDS.sleep(randomNumber);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return randomNumber;
        }
}
