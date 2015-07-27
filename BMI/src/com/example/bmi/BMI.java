package com.example.bmi;
/*BMI 公式為
 * 
 * 體重(公斤)/身高平方(公尺平方)
 * 
 * */
public class BMI {

	
	public static double BmiNumber(double w ,double h){
		
		
	h = h / 100;
	return	w / (Math.pow(h, 2));
	}
}
