package com.gitdemo;

public class App {

	
	public static  String addData(String data) {
		return data=="Aswin"? "in Add Data"+data:"ASWIN NOT HERE";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IN mAIN");
		addData("Aswin Kumar");
	}

}
