package com.example.bmi;
/*BMI ������
 * 
 * �魫(����)/��������(���إ���)
 * 
 * */
public class BMI {

	
	public static double BmiNumber(double w ,double h){
		
		
	h = h / 100;
	return	w / (Math.pow(h, 2));
	}
}
