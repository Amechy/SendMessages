package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {


    private EditText etxMessage;
    private EditText etxUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etxMessage = (EditText)findViewById(R.id.etxMessage);
        etxUser=(EditText) findViewById(R.id.etxUser);
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
                bundle.putString("user",etxUser.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);//Tiene como destinatario un activity: Explicito; sabemos cual es el destinarario. Implicito; no sabemnos cual es el destinatario
                intent.putExtras(bundle);
                //4. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }
    }
}
