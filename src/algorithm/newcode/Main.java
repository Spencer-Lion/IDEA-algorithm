package algorithm.newcode;

import java.util.*;
import java.util.Scanner;

public class Main {

    /**
     * HJ101 输入整型数组和排序标识，对其元素按照升序或降序进行排序
     */
    public static void main(String[] args) {
        Main solution = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            Integer[] array = new Integer[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int flag = in.nextInt();
            solution.sortIntegerArray(array, flag);
            solution.output(array);
        }

    }

    public void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag) {
        // 按升序
        if (iSortFlag == 0) {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
        }
        // 按降序
        else {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
    }

    public void output(Integer[] array) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    /**
     * 返回去重后的数字的逆序
     */
    public void newInt() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        //Set中的LinkedHashSet就是有序的
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            set.add(chars[i]);
        }
//        s = "";
        StringBuilder sbr = new StringBuilder();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
//            s += it.next();
            sbr.append(it.next());
        }
        System.out.println(sbr.toString());
    }
}
