package com.example.ejer06;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadPrincipal extends Activity {
	
	
	private EditText etNombre, etEdad;
	private TextView tvResultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_principal);
		
		etNombre=(EditText)findViewById(R.id.etNombre);
		etEdad=(EditText)findViewById(R.id.etEdad);
		tvResultado=(TextView)findViewById(R.id.tvResultado);
		
	}

	
	public void procesar(View view){
		//Capturar el nombre del TextField y asignar a nombre.
		String nombre=etNombre.getText().toString();
		//Capturar la edad del TextField y asignar a miEdad.
		String miEdad=etEdad.getText().toString();
		//Comvertir un String a integer y asignar a edad.
		int edad=Integer.parseInt(miEdad);
		String estado="";
		//Condicionando la edad
		if(edad>25 && edad<=60){
		estado=" Es Ud. un(a) Adulto";
		}
		else if(edad>17 && edad<=25){
		estado=" Es Ud. un(a) Joven";
		}
		else if(edad>12 && edad<=17){
		estado=" Es Ud. un(a) Adolescente";
		}
		else if(edad>0 && edad<=12){
		estado=" Es Ud. un(a) Niño(a)";
		}
		else{
		estado=" Ud. es un(a) Adulto(a) Mayor";
		}
		//mostrar en tvResul el nombre y el estado en base a su edad
		tvResultado.setText("Hola "+nombre+estado);
		
		
	
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad_principal, menu);
		return true;
	}

}
