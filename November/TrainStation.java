package November;

//链接：https://www.nowcoder.com/questionTerminal/97ba57c35e9f4749826dc3befaeae109
//       来源：牛客网

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TrainStation {

    private static List<Integer> enterSequence = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            List<Integer> trainArray = new ArrayList<>();
//            List<Integer> enterSequence = new ArrayList<>();
            enterSequence.clear();
            for (int index=0; index<num; index++) {
                int train = scanner.nextInt();
                trainArray.add(train);
                enterSequence.add(train);
            }

            Collections.sort(trainArray);

            arrangeSelect(trainArray, new ArrayList<Integer>(), trainArray.size());
        }
    }
    private static  <E> void arrangeSelect(List<E> data, List<E> target, int k) {
        List<E> copyData;
        List<E> copyTarget;
        if(target.size() == k) {
            if (legal(target)) {
                /*for(E i : target) {
                    System.out.print(i);
                }*/
                for (int index=0; index<target.size()-1; index++) {
                    System.out.print(target.get(index));
                    System.out.print(" ");
                }
                System.out.println(target.get(target.size()-1));
            }
        }

        for(int i=0; i<data.size(); i++) {
            copyData = new ArrayList<E>(data);
            copyTarget = new ArrayList<E>(target);

            copyTarget.add(copyData.get(i));
            copyData.remove(i);

            arrangeSelect(copyData, copyTarget,k);
        }
    }

    private static <E> boolean legal(List<E> target) {
        Stack<E> stack = new Stack<>();
        Iterator iterator = enterSequence.iterator();
        int index=0;
        while (iterator.hasNext()) {
            stack.push((E) iterator.next());
            while (!stack.isEmpty() && stack.peek() == target.get(index)) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}