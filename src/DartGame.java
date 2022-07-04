import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {
        // A region - where x and y coordinates are both positive and x+y is smaller than 1
        // B region - where x and y coordinates are both positive and x+y is bigger than 1
        // C region - where x coordinate is negative and y coordinate is positive
        // D region - where x and y coordinates are both negative and x is smaller than y
        // E region - where x and y coordinates are both negative and x is bigger than y
        // F region - where x coordinate is positive and y coordinate is negative
        // Unbounded region - x = y (D-E), x + y = 1 (A-B)

        Scanner scn = new Scanner(System.in);
        System.out.print("How many darts will be thrown? ");
        int thrownDartCount = scn.nextInt();
        double xAxis, yAxis;
        double countA = 0, countB = 0, countC = 0, countD = 0,
               countE = 0, countF = 0, countUndecided = 0, countTotal = 0;
        scn.close();

        for(int count = 1; count <= thrownDartCount; count++) {
            System.out.print("\nDart #" + count + "\n");
            xAxis = Math.round(((Math.random() * 20) - 10)) / 10.0;
            yAxis = Math.round(((Math.random() * 20) - 10)) / 10.0;
            System.out.print("Coordinates: (" + xAxis + ", " + yAxis + ")\n");

            if (isRegionA(xAxis, yAxis)){
                countA++;
                System.out.print("Region: A\n");
            }else if (isRegionB(xAxis, yAxis)){
                countB++;
                System.out.print("Region: B\n");
            }else if (isRegionC(xAxis, yAxis)){
                countC++;
                System.out.print("Region: C\n");
            }else if (isRegionD(xAxis, yAxis)){
                countD++;
                System.out.print("Region: D\n");
            }else if (isRegionE(xAxis, yAxis)){
                countE++;
                System.out.print("Region: E\n");
            }else if (isRegionF(xAxis, yAxis)){
                countF++;
                System.out.print("Region: F\n");
            }else{
                countUndecided++;
                System.out.print("Region: Undecided\n");
            }
            countTotal++;
        }
        showResults(countA, countB, countC, countD, countE, countF, countUndecided, countTotal);
    }

    public static boolean isRegionA(double xAxis, double yAxis){
        return xAxis > 0 && yAxis > 0 && xAxis + yAxis < 1;
    }

    public static boolean isRegionB(double xAxis, double yAxis){
        return xAxis > 0 && yAxis > 0 && xAxis + yAxis > 1;
    }

    public static boolean isRegionC(double xAxis, double yAxis){
        return xAxis < 0 && yAxis > 0;
    }

    public static boolean isRegionD(double xAxis, double yAxis){
        return yAxis < 0 && xAxis < yAxis;
    }

    public static boolean isRegionE(double xAxis, double yAxis){
        return xAxis < 0 && xAxis > yAxis;
    }

    public static boolean isRegionF(double xAxis, double yAxis){
        return xAxis > 0 && yAxis < 0;
    }

    public static void showResults(double a, double b, double c, double d, double e, double f, double u, double t){
        System.out.print("\nRegion statistics:\n");
        System.out.printf("A: %d " + dartOrDarts(a) + " (%.2f%s)\n", (int) a, ((a/t) * 100), '%');
        System.out.printf("B: %d " + dartOrDarts(b) + " (%.2f%s)\n", (int) b, ((b/t) * 100), '%');
        System.out.printf("C: %d " + dartOrDarts(c) + " (%.2f%s)\n", (int) c, ((c/t) * 100), '%');
        System.out.printf("D: %d " + dartOrDarts(d) + " (%.2f%s)\n", (int) d, ((d/t) * 100), '%');
        System.out.printf("E: %d " + dartOrDarts(e) + " (%.2f%s)\n", (int) e, ((e/t) * 100), '%');
        System.out.printf("F: %d " + dartOrDarts(f) + " (%.2f%s)\n", (int) f, ((f/t) * 100), '%');
        System.out.printf("Undecided: %d " + dartOrDarts(u) + " (%.2f%s)\n", (int) u, ((u/t) * 100), '%');
    }

    // Instead of using a switch case, singular/plural version of 'dart' will be determined here
    public static String dartOrDarts(double n){
        String str = "darts";
        if (n == 1.0)
            str = "dart";
        return str;
    }
}