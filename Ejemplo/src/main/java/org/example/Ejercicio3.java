package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Ejercicio3 {
        public static void main(String[] args) throws Exception {
            CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());
            CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> generateRandomNumberAndSleep());

            CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3, future4);

            CompletableFuture<Integer> sumFuture = allFutures.thenApply(v ->
                    future1.join() + future2.join() + future3.join() + future4.join()
            );

            System.out.println("La suma de los números generados es: " + sumFuture.get());
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
