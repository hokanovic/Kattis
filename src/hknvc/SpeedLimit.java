package hknvc;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        while (total != -1) {
            int ackTime = 0;
            int ackDist = 0;
            for (int i = 0; i < total; i++) {
                int newDist = scanner.nextInt();
                int newTime = scanner.nextInt();
                int deltaTime = (newTime - ackTime);
                ackDist += deltaTime * newDist;
                ackTime = newTime;
            }
            System.out.println(ackDist + " miles");
            total = scanner.nextInt();
        }
    }
}
