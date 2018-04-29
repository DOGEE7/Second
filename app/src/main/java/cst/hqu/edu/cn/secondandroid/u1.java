package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class u1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u1);
        final LinearLayout root = (LinearLayout)findViewById(R.id.linearLayout);

        final Button bnhor = (Button) findViewById(R.id.bnhor);
        bnhor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        Button bnver = (Button) findViewById(R.id.bnver);
        bnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setOrientation(LinearLayout.VERTICAL);
            }
        });

        Button bnleft = (Button) findViewById(R.id.bnleft);
        bnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setGravity(View.FOCUS_LEFT);
            }
        });

        Button bnreturn = (Button) findViewById(R.id.bnreturn);
        bnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(u1.this,SecondAndroidActivity.class);
                startActivity(intent);
            }
        });

    }
}
