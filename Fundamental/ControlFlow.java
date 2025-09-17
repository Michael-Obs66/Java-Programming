public class ControlFlow {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }

        // Loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        int day = 3;
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }
    }
}
