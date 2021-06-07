package com.problems.dsa;

public class StackExample {
	
	private int size;
	private int[] stackArray;
	private int top;
	
	

	public StackExample(int s)
	{
		size = s;
		stackArray = new int[size];
		top = -1;
		
	}
	
	public void push(int a)
	{
		stackArray[++top]=a;
	}
	
	public int pop()
	{
		return stackArray[top--];
	}
	
	public int peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull() {
	      return (top == size - 1);
	   }
	
	public static void main(String[] args)
	{
		StackExample s1 = new StackExample(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
// 		s1.pop();
		s1.peek();
		
		while(!s1.isEmpty())
		{
			long value = s1.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		
	}

}
