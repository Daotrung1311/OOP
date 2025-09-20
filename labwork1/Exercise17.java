public class Exercise17 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers: a and b");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite number of solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("Root: x = " + x);
        }
    }
}
