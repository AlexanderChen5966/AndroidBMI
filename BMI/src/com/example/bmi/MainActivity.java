/*第零個專案
 * 
 * 
 * 主要是練習 TextView EditView Button功能
 * 
 * 以及將BMI計算函式抽離
 * 
 * */

package com.example.bmi;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText heightEdt,weightEdt;
	private Button bmiBtn;
	private TextView bmiResult,bmiSuggest;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		initHandler();
	}

	private void initView() {
		// TODO Auto-generated method stub
		bmiBtn = (Button)findViewById(R.id.bmi_button);
		bmiResult = (TextView)findViewById(R.id.resultTextView);
		bmiSuggest = (TextView)findViewById(R.id.suggestTextView);
		heightEdt = (EditText)findViewById(R.id.heightEdt);
		weightEdt = (EditText)findViewById(R.id.weightEdt);

	}

	private void initHandler() {
		// TODO Auto-generated method stub
		bmiBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 DecimalFormat nf = new DecimalFormat("0.00");
				 double height = Double.parseDouble(heightEdt.getText().toString());
				 double weight = Double.parseDouble(weightEdt.getText().toString());
				 
				 double bmi = new BMI().BmiNumber(weight, height);
				 bmiResult.setText("BMI值為:"+ nf.format(bmi));
				 
				 if(bmi > 25){
					 
					 bmiSuggest.setText(R.string.bmi_heavy);
				 
				 }else if(bmi < 19){
					 
					 bmiSuggest.setText(R.string.bmi_light);

					 
				 }else{
				
					 bmiSuggest.setText(R.string.bmi_balance);
					 
				 }
				 
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
