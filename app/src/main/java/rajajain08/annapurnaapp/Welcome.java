package rajajain08.annapurnaapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class Welcome extends AppCompatActivity {
    public static int SI = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_welcome);





        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent i = new Intent(Welcome.this,LoginActivity.class);
                startActivity(i);


                this.finish();
            }
            private void finish(){

            }


        },SI);
    };
}