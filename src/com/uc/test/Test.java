package com.uc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("111");
		s.add("222");
		s.add("333");
		s.add("111");
		s.add("222");
		s.add("333");
		s.add("555");
		s.add("444");
		s.add("333");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Set<String> uniqueSet = new HashSet<String>(s);
		for (String temp : uniqueSet) {
			
			map.put(temp, Collections.frequency(s, temp));

	}
        //这里将map.entrySet()转换成list

        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {

            //降序排序

            public int compare(Entry<String, Integer> o1,

                    Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());

            }
  

        });
        int n =3;
        int i=0;
        for(Map.Entry<String,Integer> mapping:list){ 
//        	i++;
//        	if(i>n){break;}
            System.out.println(mapping.getKey()+":"+mapping.getValue()); 

       } 

		
	}

}
