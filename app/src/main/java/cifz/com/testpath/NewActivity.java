package cifz.com.testpath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by wangzhen on 2018/2/22.
 */

public class NewActivity extends AppCompatActivity {
    public static final String TAG = "LifeMethod";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_new);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Log.e(TAG,"onCreate2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy2");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG,"onSaveInstanceState2");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG,"onRestoreInstanceState2");
    }
}
