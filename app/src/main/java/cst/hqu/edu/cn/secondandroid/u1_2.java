package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u1_2);


        Button bnhor = (Button) findViewById(R.id.bnhor);
        bnhor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (u1_2.this,u1_1.class);
                startActivity(intent);
            }
        });

        Button bnver = (Button) findViewById(R.id.bnver);
        bnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (u1_2.this,u1_2.class);
                startActivity(intent);
            }
        });

        Button bnleft = (Button) findViewById(R.id.bnleft);
        bnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (u1_2.this,u1_3.class);
                startActivity(intent);
            }
        });

        Button bnreturn = (Button) findViewById(R.id.bnreturn);
        bnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(u1_2.this,SecondAndroidActivity.class);
                startActivity(intent);
            }
        });

    }
}
