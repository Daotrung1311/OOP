public class Exercise16 {
    public static void main(String[] args) {
        if(args.length != 3){
            return;
        }
        System.out.println(args[0]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean res = !(a == b && b == c);
        System.out.println(res);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
