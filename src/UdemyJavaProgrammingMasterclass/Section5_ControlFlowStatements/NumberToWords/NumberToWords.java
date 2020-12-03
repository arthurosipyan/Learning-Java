package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.NumberToWords;

public class NumberToWords {
    public static void numberToWords(int number){
        int places = getDigitCount(number);

        if(places < 1){
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);

        while (places > 0){
            places--;
            int current = reversedNumber % 10;

            switch(current){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
            }

            reversedNumber /= 10;
        }
    }

    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 0;

        while(number > 0){
            count++;
            number /= 10;
        }

        return count > 0 ? count : 1;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(2121));
        System.out.println(reverse(4321));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
