package practica1.josesanchez.facci.serviciosautomovil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

public class Datos extends AppCompatActivity {

        EditText et_rut, et_password;    //CREACIÓN DE VARIABLES
        TextView tv_registrar;
        private Button btn_log;


        @Override
        protected void onCreate(Bundle savedInstanceState) {   //AQUI CREO UN PROTECT VOID ONCREATE QUE HACE GUARDAR Y ENVIAR LOS DATOS DEL ACTIVITY
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_datos);

            tv_registrar = (TextView) findViewById(R.id.tv_registrar);   //AQUI DIGO QUE LAS VARIABLES SEAN IGUAL AL TEXTO QUE ESTOY TOMANDO EN EL ACTIVIVY
            et_rut = (EditText) findViewById(R.id.TextV_CORREO);
            et_password = (EditText) findViewById(R.id.TextV_password);
            btn_log = (Button) findViewById(R.id.Btn_iniciar);


            tv_registrar.setOnClickListener(new View.OnClickListener() {//AQUI DIGO QUE AL HACER CLIC EN EL TEXT ABRA EL LA CLASE REGISTRO
                @Override
                public void onClick(View v) {
                    Intent intentReg = new Intent(Datos.this, Registro.class);
                    Datos.this.startActivity(intentReg);
                }
            });   //


        }
    }
