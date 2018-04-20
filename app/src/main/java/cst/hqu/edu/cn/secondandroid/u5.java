package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class u5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5);
        Button bnreturn = (Button) findViewById(R.id.bnreturn);
        bnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(u5.this,SecondAndroidActivity.class);
                startActivity(intent);
            }
        });
    }
}
