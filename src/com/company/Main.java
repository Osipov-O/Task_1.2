package com.company;


public class Main {

    public static void main(String[] args) {
	double a=3.5;
	double b=5;
	double c=4.5;
	double rez=0;

	rez = ((b+Math.sqrt(b*b+4*a*c))/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
	System.out.println(rez);


    }
}
