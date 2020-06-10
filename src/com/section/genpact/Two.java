package com.section.genpact;

import java.util.ArrayList;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        System.out.println(add(null));
        System.out.println(add(""));
        System.out.println(add("0"));
        System.out.println(add("10,100"));
        System.out.println(add("10"));
        System.out.println(add("1,2"));
        System.out.println(add("1\n2,3"));
        System.out.println(add("//;\n1;2"));
        System.out.println(add("//*|%\n1*2%3*1001"));
        System.out.println(add("1,2,-3,-4"));
        System.out.println(add("//;\n1;-2;-4"));

    }

    public static String prepareString(List<Integer> nums){
        String s = "";
        for(int i = 0;i != nums.size(); ++i){
            s += nums.get(i);
            if(i < nums.size()-1)
                s += ",";
        }
        return s;
    }
    public static String add(String number) {
        if(number == null || "".equals(number)) return 0 + "";
        String temp = "";
        List<String> list = new ArrayList<>();
        //System.out.println(number.toCharArray());
        boolean isNegativeChar = false;
        for(char ch: number.toCharArray()){
            if('-' == ch){
                isNegativeChar = true;
                continue;
            }

            if(Character.isDigit(ch)){
                temp += ch;
            }else if(temp.length() > 0){
                if(isNegativeChar) temp = "-" + temp;
                list.add(temp);
                temp = "";
                isNegativeChar = false;
            }else{
                isNegativeChar = false;
            }
        }
        if(temp.length() > 0) {
            if(isNegativeChar) temp = "-" + temp;
            list.add(temp);
        }
        List<Integer> integers = new ArrayList<>();
        for(String strNumber: list){
            integers.add(Integer.parseInt(strNumber));
        }
        List<Integer> negatives = new ArrayList<>();
        for(Integer i: integers){
            if(i < 0)negatives.add(i);
        }

        if(!negatives.isEmpty()){
            throw new RuntimeException("negatives not allowed:" + prepareString(negatives));
        }
        int sum = 0;
        for(Integer i : integers){
            if(i <= 1000)sum += i;
        }

        //System.out.println(list);
        //System.out.println("***********");
        return sum+"";
    }
}
