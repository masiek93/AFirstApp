package com.tomaszbartnik.firstapp;

import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.horizontal:
                        group.setOrientation(LinearLayout.HORIZONTAL);
                        break;
                    case R.id.vertical:
                        group.setOrientation(LinearLayout.VERTICAL);
                        break;
                }
            }
        });
    }

    public void onClick (View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
/*        Toast.makeText(this, "Button 1 pressed",
                Toast.LENGTH_LONG).show();*/
    }

    public void onClickButton2 (View view) {
        ImageView imageView = (ImageView) findViewById(R.id.myicon);
        imageView.setImageResource(R.drawable.ic_tethering);
    }
    public void onClickButton3 (View view) {
        ImageView imageView = (ImageView) findViewById(R.id.myicon);
        imageView.setImageResource(R.drawable.ic_offline);
    }
}
