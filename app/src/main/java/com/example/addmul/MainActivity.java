package com.example.addmul;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	double mul ,sum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText num1=(EditText)findViewById(R.id.num1);
		final EditText num2=(EditText)findViewById(R.id.num2);
		final Button btadd=(Button)findViewById(R.id.btadd);
		final Button btmul=(Button)findViewById(R.id.btmul);
		final TextView result=(TextView)findViewById(R.id.result);
		final Button btnext=(Button)findViewById(R.id.btnext);
		
		btadd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				double no1 = Double.parseDouble(num1.getText().toString());
		        double no2 = Double.parseDouble(num2.getText().toString());
		        sum = no1 + no2;
		        result.setText(Double.toString(sum));
		        
		        Toast.makeText(MainActivity.this,(String.valueOf(sum)),2000).show();
			}
		});
		btmul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v2) 
			{
				double no1 = Double.parseDouble(num1.getText().toString());
		        double no2 = Double.parseDouble(num2.getText().toString());
		        mul = no1 * no2;
		        result.setText(Double.toString(mul));
		        Toast.makeText(MainActivity.this,(String.valueOf(mul)),2000).show();
				
			}
		});
		btnext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v3) {
				Intent i=new Intent(MainActivity.this,Next.class);
				i.putExtra("addresult", sum);
				i.putExtra("mulresult", mul);
				startActivity(i);
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

}
