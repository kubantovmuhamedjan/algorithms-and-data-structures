package DS_and_Algorithm;

public class executeTime {
    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();

        Thread.sleep(3000);

        long duration = (System.nanoTime() - start) /1000000    ;
        System.out.println(duration + "ms");
    }
}
