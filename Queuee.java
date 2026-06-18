package DS_and_Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);



    }
}
