package mx.tec.lab_4_moviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class activity_4 extends AppCompatActivity {

    float px,px2,py,py2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public boolean onTouchEvent(MotionEvent e){

        switch(e.getAction()){

            case MotionEvent.ACTION_DOWN:
                px = e.getX();
                py = e.getY();
                break;

            case MotionEvent.ACTION_UP:
                px2 = e.getX();
                py2 = e.getY();


                if(px < px2){

                    Intent i = new Intent(activity_4.this, activity_3.class);
                    startActivity(i);
                }
                if(px > px2){

                    Intent i = new Intent(activity_4.this, MainActivity.class);
                    startActivity(i);
                }

                break;
        }
        return false;
    }
}
