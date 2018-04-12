package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondAndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_android_layout);
        Button bn1 = (Button) findViewById(R.id.bn1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (SecondAndroidActivity.this,u1.class);
                startActivity(intent);
            }
        });

        Button bn2 = (Button) findViewById(R.id.bn2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (SecondAndroidActivity.this,u2.class);
                startActivity(intent);
            }
        });

        Button bn3 = (Button) findViewById(R.id.bn3);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (SecondAndroidActivity.this,u3.class);
                startActivity(intent);
            }
        });

        Button bn4 = (Button) findViewById(R.id.bn4);
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (SecondAndroidActivity.this,u4.class);
                startActivity(intent);
            }
        });

        Button bn5= (Button) findViewById(R.id.bn5);
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("u5","Are you ok?");
                Intent intent  = new Intent (SecondAndroidActivity.this,u5.class);

                startActivity(intent);
            }
        });


    }
}
