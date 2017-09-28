package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Esta clase envia un mensaje de un usuario a otro
 * @Version 2.0
 * @author Alejandro Mechiné
 *
 *
 * <p>Conceptos aprendidos</p>
 * <ul>
 *
 *     <li>Concepto de context</li>
 *     <li>Paso de parámetros mediante el objeto @see android.os.Bundle </li>
 *     <li>Paso de mensajes entre dos actividades mediante la clase @see android.content.Intent </li>
 * </ul>
 */
public class SendMessageActivity extends AppCompatActivity {


    private EditText etxMessage;
    private EditText etxUser;
    private Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etxMessage = (EditText)findViewById(R.id.etxMessage);
        etxUser=(EditText) findViewById(R.id.etxUser);


        btnOk=(Button) findViewById(R.id.btnOk);
        //1. Registrar un Listenner o escuchador OnClickListener
        btnOk   .setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               //1.Recoger el mensaje
               //etxMessage.getText().toString();
               //2. Crear un objeto bundle y añadir el mensaje
               Bundle bundle = new Bundle();
               bundle.putString("message",etxMessage.getText().toString());
               bundle.putString("user",etxUser.getText().toString());
               //3. Crear un objeto Intent
               Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);//Tiene como destinatario un activity: Explicito; sabemos cual es el destinarario. Implicito; no sabemnos cual es el destinatario
               intent.putExtras(bundle);
               //4. Iniciar la Activity ViewMessage
               startActivity(intent);
           }
        });
    }

   /* public void getOnClick (View view)
    {
        switch (view.getId()){
            case R.id.btnOk:

                //1.Recoger el mensaje
                //etxMessage.getText().toString();
                //2. Crear un objeto bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message",etxMessage.getText().toString());
                bundle.putString("user",etxUser.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);//Tiene como destinatario un activity: Explicito; sabemos cual es el destinarario. Implicito; no sabemnos cual es el destinatario
                intent.putExtras(bundle);
                //4. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }
    }*/
}
