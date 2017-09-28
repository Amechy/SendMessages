package com.example.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewMessage;
    private TextView txvViewUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        txvViewMessage=(TextView) findViewById(R.id.txvViewMessage);
        txvViewUser=(TextView)findViewById(R.id.txvViewUser);

        txvViewMessage.setText(getIntent().getExtras().getString("message"));

        String viewUser=String.format(getResources().getString(R.string.txvViewUser), getIntent().getExtras().getString("user"));
        txvViewUser.setText(viewUser);




    }

}
