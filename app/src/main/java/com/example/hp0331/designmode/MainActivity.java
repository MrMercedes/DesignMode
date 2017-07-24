package com.example.hp0331.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp0331.designmode.Behavioral.template.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Client client1 = new Client();
        client1.main(null);
    }
}
