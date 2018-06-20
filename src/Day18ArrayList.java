import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day18ArrayList {
    public static void main(String[] args) {
//        learnArrayList();

//        ArrayList<Integer> values = createList(5, 200);
//        System.out.println("initial values = " + values);
//
////        duplicateList(values);
//        maxToEnd(values);
//
//        System.out.println("values = " + values);

        ArrayList<String> words = createWordList();
        System.out.println("words contains " + words);

//        int len = maxLength(words);
//        System.out.println("highest # of chars = " + len);

        removeStartWith(words, 'c');
        System.out.println("words contains " + words);
    }

    public static void learnArrayList() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(29);
        nums.add(54);
        nums.add(2);

        System.out.println("nums contains = " + nums);
        System.out.println("# of elements = " + nums.size());
    }

    // this method should create a list of 'numElements' number of ints
    // where each int is a random number between 1 and 'high'
    // e.g. createList(3,15) might return [13, 1, 9]
    public static ArrayList<Integer> createList(int numElements, int high) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numElements; i++) {
            list.add(new Random().nextInt(high) + 1);
        }
        return list;
    }

    // duplicates a list of Integers by appending each element in the list
    // to the end of the list
    // e.g. [1,2,3] ==> [1,2,3,1,2,3]
    public static void duplicateList(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
//            list.add(list.get(i));
//        }
        list.addAll(list);
    }

    // this method moves the max value in a list of Integers to the end
    // e.g. [1,29,54,2] ==> [1,29,2,54]
    public static void maxToEnd(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int x : list) {
            max = Math.max(max, x);
        }
        list.remove(list.indexOf(max));
        list.add(max);
    }

    // this method returns a list of Strings
    public static ArrayList<String> createWordList() {
        ArrayList<String> list = new ArrayList<String>();
        Scanner words = new Scanner("carrots,cabbage,red peppers,celery");
        words.useDelimiter(",");
        while (words.hasNext()) {
            list.add(words.next());
        }
        return list;
    }

    // this method returns the length of the longest String
    // e.g. ["hi", "hello", "hola", "yo"] ==> 5
    public static int maxLength(ArrayList<String> list) {
        int max = Integer.MIN_VALUE;
        for (String s : list)
            max = Math.max(max, s.length());
        return max;
    }

    // remove all elements in list that begin with specified char
    public static void removeStartWith(ArrayList<String> list, char c) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).charAt(0) == c) {
                list.remove(i);
            }
        }
    }
}

// Helpful translation from array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
//
// new operations:
//     list.remove(i);     --remove the ith value
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all value
//     list.contains(x)    --returns T/F if x is in the list