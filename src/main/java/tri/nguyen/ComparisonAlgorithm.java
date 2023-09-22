package tri.nguyen;

public class ComparisonAlgorithm {

    public static void main(String[] args) throws InterruptedException{

        long start = System.nanoTime();

        // ---------- program ----------
        // -----------------------------

        Thread.sleep(3000);


        // duration in million seconds = now - start / 10^6
        long duration = (System.nanoTime() - start) / (int) Math.pow(10, 6) ;
        System.out.println(duration + " ms");

    }


}
