package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {


    private EditText etxMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etxMessage = (EditText)findViewById(R.id.etxMessage);
    }

    public void getOnClick (View view)
    {
        switch (view.getId()){
            case R.id.btnOk:

                //1.Recoger el mensaje
                 //etxMessage.getText().toString();
                //2. Crear un objeto bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message",etxMessage.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent();//Tiene como destinatario un activity: Explicito; sabemos cual es el destinarario. Implicito; no sabemnos cual es el destinatario

                //4. Iniciar la Activity ViewMessage
        }
    }
}
