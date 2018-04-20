package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class u3 extends AppCompatActivity {
    int []images = new int[]{
            R.drawable.ele,
            R.drawable.fox,
            R.drawable.gf,
            R.drawable.mon,
            R.drawable.pig
    };
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3);
        final ImageView image = new ImageView(this);
        FrameLayout main = (FrameLayout)findViewById(R.id.main);
        main.addView(image);
        image.setImageResource(images[++currentImage % images.length]);


        Button bnreturn = (Button) findViewById(R.id.bnreturn);
        bnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(u3.this,SecondAndroidActivity.class);
                startActivity(intent);
            }
        });
    }
}
