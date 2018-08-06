package com.example.puneeth.mygrocer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        CardView checkListNew = (CardView)findViewById(R.id.create_new_checklist);
        CardView checkListLoad = (CardView)findViewById(R.id.load_existing_checklist);
        CardView checkoutOrder = (CardView)findViewById(R.id.checkout_order);
        CardView checkStatus = (CardView)findViewById(R.id.check_status);

        final Intent checkListNewi = new Intent(this, CheckListNew.class);
        checkListNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(checkListNewi);

            }
        });

    }
}
