import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] mass = new int[size];
//    // Task_1
//     showArrays(createRandomArray(10));
//    // Task_2
//      mass = createRandomArray(size);
//      showArrays(mass);
//      System.out.println("______________");
//     showArraysReverse(mass);
//    //Task_3
//      showArrays(createRandomArray(100));
//    //Task_4
//     showArraysPositiveNumbers(createArray(size));
//    //Task_5
//      mass =createArray(size);
//      System.out.println(amountOfNegativeNumbers(mass));
//    //Task_6
//      showAmountOfPositiveAndNegativeNumbers(createArray(size));
//    // Task_7
//       showMinimumAndMaximumNumberInArrays(findMinimumAndMaximumNumberInArrays(createRandomArray(100)));
//    // Task_8
//       showEvenAndOddNumberAmongMinAndMaxInArrays(findEvenAndOddNumberAmongMinAndMaxInArrays(createRandomArray(100)));
//    // Task_9
//       showArrays(createCharArray("Rakutin Sergey"));
//    // Task_10
//       writeFullName();
//    // Task_11
//        changeArrayMultiplicityThree(createArray(30));
//    // Task_12
//    // он и так всегда соответствует реальному количеству хранимых элементов
//        writeFullName();
//    // Task_13
//      showArrays(sortingBubbleAscending(createRandomArray(10)));
//       showArrays(sortingBubbleDescending(createRandomArray(10)));
//      showArrays(sortingInsertionAscending(createRandomArray(10)));
//      showArrays(sortingInsertionDescending(createRandomArray(10)));
//       showArrays(sortingChoiceAscending(createRandomArray(10)));
//       showArrays(sortingChoiceDescending(createRandomArray(10)));
//     showArrays(sortingFastAscending(createRandomArray(10)));
//      showArrays(sortingFastDescending(createRandomArray(10)));
//    // Task_14
//       showArrays(findNumberInTheRangeFromTo(60,70, createArray(100)));


    }

    //create array
    public static int[] createArray(int size) {
        int[] mass = new int[size];
        for (int i = 1; i < mass.length; i++) {
            mass[i] = i;
        }
        return mass;
    }

    //create char array
    public static char[] createCharArray(String s) {
        char[] mass = new char[s.length()];
        System.out.println("String length =" + s.length());
        char symbol;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            mass[i] = symbol;
        }
        System.out.println("Array length result =" + mass.length);
        return mass;
    }

    //create random(999 numbers) array
    public static int[] createRandomArray(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 999);
        }
        return mass;
    }

    //arrays show reverse
    public static void showArraysReverse(int[] mass) {

        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.println(mass[i]);
        }
    }

    // arrays show
    public static void showArrays(int[] mass) {
        for (int i : mass) {
            System.out.println(i);
        }
    }    // arrays char show

    public static void showArrays(char[] mass) {
        for (char с : mass) {
            System.out.print(с);
        }
        System.out.println();
    }

    // arrays show positive numbers
    public static void showArraysPositiveNumbers(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0 && mass[i] != 0) {
                System.out.println(mass[i]);
            } else {
                continue;
            }
        }
    }

    // arrays show negative numbers
    public static void showArraysNegativeNumbers(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0 && mass[i] != 0) {
                System.out.println(mass[i]);
            } else {
                continue;
            }
        }
    }

    // amount Of Negative Numbers in array
    public static int amountOfNegativeNumbers(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0 && mass[i] != 0) {
                result = result + 1;
            } else {
                continue;
            }
        }
        return result;
    }

    // amount Of Positive Numbers in array
    public static int amountOfPositiveNumbers(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0 && mass[i] != 0) {
                result = result + 1;
            } else {
                continue;
            }
        }
        return result;
    }

    //  show amount Of Positive and Negative Numbers in array
    public static void showAmountOfPositiveAndNegativeNumbers(int[] mass) {
        System.out.println("Negative numbers in array =" + amountOfNegativeNumbers(mass));
        System.out.println("Positive numbers in array =" + amountOfPositiveNumbers(mass));
    }

    //  show Max and Min Numbers in array
    public static void showMinimumAndMaximumNumberInArrays(int[] mass) {
        if (mass.length == 2) {
            System.out.println("Maximum numbers in array =" + mass[0]);
            System.out.println("Minimum numbers in array =" + mass[1]);
        } else {
            System.out.println("Massive error formate");
        }
    }

    // find Max and Min Numbers in array
    public static int[] findMinimumAndMaximumNumberInArrays(int[] mass) {
        int[] array = new int[2];
        array[0] = Arrays.stream(mass).max().orElse(0);
        array[1] = Arrays.stream(mass).min().orElse(0);
        return array;
    }

    // find Even and odd number among Max and Min Numbers in array
    public static int[] findEvenAndOddNumberAmongMinAndMaxInArrays(int[] mass) {
        int[] resultArray = new int[4];
        resultArray[0] = Arrays.stream(mass).filter((n) -> n % 2 == 0).max().getAsInt();
        resultArray[1] = Arrays.stream(mass).filter((n) -> n % 2 == 0 && n != 0).min().getAsInt();
        resultArray[2] = Arrays.stream(mass).filter((n) -> n % 2 != 0).max().getAsInt();
        resultArray[3] = Arrays.stream(mass).filter((n) -> n % 2 != 0 && n != 0).min().getAsInt();
        return resultArray;
    }

    // show find Even and odd number among Max and Min Numbers in array
    public static void showEvenAndOddNumberAmongMinAndMaxInArrays(int[] mass) {
        System.out.println("Maximum among Even number in the array=" + mass[0]);
        System.out.println("Minimum among Even number in the array=" + mass[1]);
        System.out.println("___________________________________________");
        System.out.println("Maximum among Odd number in the array=" + mass[2]);
        System.out.println("Minimum among Odd number in the array=" + mass[3]);
    }

    // Write Full Name into create and show
    public static void writeFullName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        showArrays(createCharArray(fullName));
        scan.close();
    }

    //change Array Multiplicity Three
    public static void changeArrayMultiplicityThree(int[] mass) {
        int[] array = Arrays.stream(mass).filter((n) -> n % 3 != 0 && n != 0).toArray();
        showArrays(array);
    }

    //find items in the range from to ( and show)
    public static int[] findNumberInTheRangeFromTo(int from, int to, int[] mass) {
        int[] array = Arrays.stream(mass).filter((n) -> n >= from && n <= to).toArray();
        return array;
    }

    // bubble sorting ascending
    public static int[] sortingBubbleAscending(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }

    // bubble sorting Descending
    public static int[] sortingBubbleDescending(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass.length - 1; j > i; j--) {
                if (mass[j] > mass[j - 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j - 1];
                    mass[j - 1] = tmp;
                }
            }
        }
        return mass;
    }

    //insertion sorting Ascending
    public static int[] sortingInsertionAscending(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            int tmp = mass[i];
            int position = i - 1;
            while (position >= 0 && mass[position] > tmp) {
                mass[position + 1] = mass[position];
                position--;
            }
            mass[position + 1] = tmp;
        }
        return mass;
    }

    //insertion sorting Descending
    public static int[] sortingInsertionDescending(int[] mass) {
        for (int k = 1; k < mass.length; k++) {
            int tmp = mass[k];
            int location = k - 1;
            while (location >= 0 && mass[location] < tmp) {
                mass[location + 1] = mass[location];
                location--;
            }
            mass[location + 1] = tmp;
        }
        return mass;
    }

    //choice sorting Ascending
    public static int[] sortingChoiceAscending(int[] mass) {
        for (int min = 0; min < mass.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < mass.length; j++) {
                if (mass[j] < mass[least]) {
                    least = j;
                }
            }
            int tmp = mass[min];
            mass[min] = mass[least];
            mass[least] = tmp;
        }
        return mass;
    }

    public static int[] sortingChoiceDescending(int[] mass) {

        for (int min = 0; min < mass.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < mass.length; j++) {
                if (mass[j] > mass[least]) {
                    least = j;
                }
            }
            int tmp = mass[min];
            mass[min] = mass[least];
            mass[least] = tmp;
        }
        return mass;
    }

    // fast sorting Ascending
    public static int[] sortingFastAscending(int[] mass) {
        Arrays.sort(mass); //arrays.sort = fast sort (if use primitives)
        return mass;
    }

    // fast sorting Descending
    public static int[] sortingFastDescending(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] * -1;
        }
        Arrays.sort(mass);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] * -1;
        }
        return mass;
    }

}

