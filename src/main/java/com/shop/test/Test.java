package com.shop.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //File filePath = new File("C:\\MunishData\\mp\\nxdial\\main\\"
		 */// );
		// String[] files = filePath.list();
		List<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(1);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(3);
		arr.add(2);
		List<Integer> arrTemp = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j) && !arrTemp.contains(arr.get(j)))
					arrTemp.add(arr.get(j));
			}
		}

		System.out.println(arrTemp.size());
	}

}
