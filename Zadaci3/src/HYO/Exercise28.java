package HYO;

import java.util.*;

public class Exercise28 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("HYO.Hello its me");
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            pq.offer(rand.nextDouble());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(pq.poll());
        }
    }
}