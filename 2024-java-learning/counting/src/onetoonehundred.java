public class onetoonehundred {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int number = i;
            if(number % 2 == 0){/// This code is how the code decides that the number is even or odd, so if a number mod is 2 is 0 the number is even
                System.out.println(number + " is even.");
            } else{
                System.out.println(number + " is odd.");
            }
        }
    }
}
