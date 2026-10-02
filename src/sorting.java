import java.util.*;

public class sorting {
    public static void mathProblem() {
        String mathP;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your math problem>> ");
        mathP = input.nextLine();
        StringBuilder x = new StringBuilder();
        List<Object> num = new ArrayList<>();

        String usedSign = "";
        if (Objects.equals(mathP, "")) {
            System.out.println("Please enter a number and try again");
        } else {
            for (int i = 0; i <= mathP.length() - 1; i++) {
                char c = mathP.charAt(i);
                if (Character.isDigit(c)) {
                    x.append(c);
                } else {
                    if (x.length() > 0) {
                        num.add(Integer.parseInt(x.toString()));
                        num.add(String.valueOf(c));
                        x.setLength(0);
                        usedSign = String.valueOf(mathP.charAt(i));
                    } else {
                        num.add(String.valueOf(c));
                    }
                }
            }
            System.out.println(num);
        }


    }

    public static void main(String[] args) {
        mathProblem();
    }
}