package com.example.ejer05;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadPrincipal extends Activity {
	
	
	private TextView tvResul;
	private EditText etValor1, etValor2;
	private CheckBox chUno, chDos;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_principal);
		
		etValor1=(EditText)findViewById(R.id.etValor1);
		etValor2=(EditText)findViewById(R.id.etValor2);
		tvResul=(TextView)findViewById(R.id.tvResul);
		chUno=(CheckBox)findViewById(R.id.chUno);
		chDos=(CheckBox)findViewById(R.id.chDos);
		
		
		
	}

	public void procesar(View view){
		String valor1=etValor1.getText().toString();
		String valor2=etValor2.getText().toString();
		int nro1=Integer.parseInt(valor1);
		int nro2=Integer.parseInt(valor2);
		String resu="";
		if (chUno.isChecked()==true) {
		int suma=nro1+nro2;
		resu="La suma es: "+ suma;
		}
		if (chDos.isChecked()==true) {
		int resta=nro1-nro2;
		resu=resu + " La resta es: "+ resta;
		}
		tvResul.setText(resu);
		}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad_principal, menu);
		return true;
	}

}
