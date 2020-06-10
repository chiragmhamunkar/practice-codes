package com.section.crisil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrisilTest2 {
    public static void main(String[] args) {
        test2();
    }

    public static void test2(){
        List<Integer> input = Arrays.asList(3, 4, 10, 2, 1, 9);
        int mini = input.get(0);
        int ans = -1;
        for(int i = 1; i!= input.size(); ++i){
            if(input.get(i) > mini){
                ans = Math.max(ans, input.get(i) - mini);
            }else{
                mini = Math.min(mini, input.get(i));
            }
        }
        System.out.println(ans);


    }


    public static void test1(){
        List<Integer> input = Arrays.asList(1 ,1 ,1 ,1);
        //Arrays.asList(1 ,2 ,2 ,1) ==> 3;
        List<List<Integer>> subLists = new ArrayList<>();

        for(int l = 1; l <= input.size(); ++l){
            for(int i = 0; i != input.size() - l + 1; ++i){
                subLists.add(input.subList(i, i+l));
            }
        }

        int ct = 0;
        for(List<Integer> subList: subLists){
            if(subList.get(0) == 1 && subList.get(subList.size()-1) == 1)
                ct += 1;
        }

        System.out.println(ct);
    }



    //
}
