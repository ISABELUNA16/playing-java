package com.example.ejer04;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActividadPrincipal extends Activity {

	private EditText etValor1;
	private EditText etValor2;
	private TextView tvResultado1;
	private RadioButton rbSuma1, rbResta1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_actividad_principal);
		
		etValor1 =(EditText)findViewById(R.id.etValor1);
		etValor2 =(EditText)findViewById(R.id.etValor2);
		rbSuma1 =(RadioButton)findViewById(R.id.rbSuma1);
		rbResta1 =(RadioButton)findViewById(R.id.rbResta1);
		
		
	}
	

		public void operar(View view){
			String valor1 = etValor1.getText().toString();
			String valor2 = etValor2.getText().toString();
			
			
			int nro1 = Integer.parseInt(valor1);
			int nro2 = Integer.parseInt(valor2);
			
			if (rbSuma1.isChecked()==true){
				int suma= nro1 + nro2;
				String resu=String.valueOf(suma);
				tvResultado1.setText(resu);
				
			}
			else if(rbResta1.isChecked()==true){
				
				int resta= nro1 - nro2;
				String resu=String.valueOf(resta);
				tvResultado1.setText(resu);
			}
			
		}
		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad_principal, menu);
		return true;
	}

}
