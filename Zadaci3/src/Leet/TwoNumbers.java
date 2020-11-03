package Leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(7);
        list2.add(7);

        List<Integer> listResult = new ArrayList<>();
        String firstNumber ="";
        String secondNumber="";
        for(int i = list1.size()-1;i>=0;i--){
            System.out.println(list1.get(i));
            firstNumber = firstNumber + list1.get(i);
        }
        for(int i = list2.size()-1;i>=0;i--){
            secondNumber =secondNumber + list2.get(i);
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        Integer result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        System.out.println(result);

        while (result > 0){
            int number = result%10;
            listResult.add(number);
            result = result/10;
        }

        for(int i = 0;i<listResult.size();i++){
            System.out.println(listResult.get(i));
        }
    }
}
