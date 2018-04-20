package cst.hqu.edu.cn.secondandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class u3 extends AppCompatActivity {
    int[] imageIds = new int[]{
            R.drawable.pig,
            R.drawable.gf,
            R.drawable.ele,
            R.drawable.fox,
            R.drawable.mon
    };
    private AdapterViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3);
        flipper =(AdapterViewFlipper)findViewById(R.id.fliper);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imageIds.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = new ImageView(u3.this);
                imageView.setImageResource(imageIds[position]);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));;
                return imageView;
            }
        };
        flipper.setAdapter(adapter);
        flipper.startFlipping();
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
