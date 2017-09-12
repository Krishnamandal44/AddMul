package com.example.addmul;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Next extends Activity {
	double mul ,sum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nextx);
		final Button btback=(Button)findViewById(R.id.btback);
		double dval=(Double)getIntent().getExtras().getDouble("addresult");
		double dval2=(Double)getIntent().getExtras().getDouble("mulresult");		
		Toast.makeText(Next.this,(String.valueOf(dval)),2000).show();
		Toast.makeText(Next.this,(String.valueOf(dval2)),2000).show(); 
		btback.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Next.this,MainActivity.class);	
				startActivity(i);
				// TODO Auto-generated method stub
			
			}
		});
		
	}
}
