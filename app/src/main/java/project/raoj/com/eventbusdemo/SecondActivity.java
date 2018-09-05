package project.raoj.com.eventbusdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

/**
 * class: SecondActivity
 * describe:
 * author: raoj
 * date: 2018-09-05-16:44
 */
public class SecondActivity extends AppCompatActivity {

    private String TAG = "SecondActivity";

    private Button mButton2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButton2 = (Button) findViewById(R.id.btn2);
        jumpActivity();
    }

    private void jumpActivity() {
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"按钮2，EventBus传递消息");
                EventBus.getDefault().post(new MessageEvent("欢迎大家浏览我写的博客"));
                finish();
            }
        });
    }

}
