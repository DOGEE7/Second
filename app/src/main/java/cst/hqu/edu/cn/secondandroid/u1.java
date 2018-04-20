package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class u1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u1);
        final LinearLayout layout = (LinearLayout)findViewById(R.id.linearLayout);
        final Button bnhor = (Button) findViewById(R.id.bnhor);
        bnhor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        Button bnver = (Button) findViewById(R.id.bnver);
        bnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setOrientation(LinearLayout.VERTICAL);
            }
        });

        Button bnleft = (Button) findViewById(R.id.bnleft);
        bnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//此处相当于布局文件中的Android:layout_gravity属性
                lp.gravity = Gravity.LEFT;
//                layout.setOrientation(LinearLayout.VERTICAL);
//                layout.setGravity(LinearLayout.SCROLLBAR_POSITION_LEFT);
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
