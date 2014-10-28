package com.example.logindemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends Activity {
	EditText et1,et2;
    Button btn;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.secondxml);
		super.onCreate(savedInstanceState);
		et1=(EditText) findViewById(R.id.editText1);
		et2=(EditText) findViewById(R.id.editText2);
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent result = new Intent();
				result.putExtra("reback", et1.getText().toString()+et2.getText().toString());
				setResult(RESULT_OK, result);
				finish();

			}
		});
	}
    
}
