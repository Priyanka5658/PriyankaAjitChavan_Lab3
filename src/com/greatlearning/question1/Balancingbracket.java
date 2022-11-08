package com.greatlearning.question1;

import java.util.Stack;

public class Balancingbracket {
	
	public static void main(String[] args) {
		String input = "([[{}]])";
		boolean result = isBalancedStringExp(input);
		if(result) {
			System.out.println("The entered string has balanced brackets");
		}else {
			System.out.println("THe entered string do  ot contain balanced brackets");
			
		}
	}

	private static boolean isBalancedStringExp(String input) {
		Stack<Character> data = new Stack<Character>();
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{') {
				data.push(ch);
				continue;
				}
			if(data.isEmpty()) {
				return false;
				}
			char matchCh = data.pop();
			switch(ch) {
			case ')':
				if(matchCh != '('){
					return false;
				}
				break;
				case ']':
					if(matchCh != '['){	
						return false;
					}
					break;
				case '}':
					if(matchCh != '{'){
						return false;
					}
					break;
			}
		}
		return data.isEmpty();
	}
}
