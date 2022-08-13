package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("-----------Push up started-------------");

        for (int i = 0; i < 30; i++) {
            System.out.print("\rpush-up " + (i+1));

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\n-----------Push ups completed-------------");

        for (int i = 0; i < 30; i++) {

            System.out.print("\rPull-up " + (i+1));

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\n-----------Pull ups completed-------------");

    }

    public static void sleep(double seconds){ //custom method

        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */