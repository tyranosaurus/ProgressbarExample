package com.estsoft.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarCircle;
    private ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        //requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);

        //setProgressBarIndeterminateVisibility(true);
        //setProgressBarVisibility(true);
        //setProgress(100);

        progressBarCircle = (ProgressBar) findViewById(R.id.progressCircle);
        progressBarCircle.setProgress(0);

        progressBarHorizontal = (ProgressBar) findViewById(R.id.progressHorizontal);
        progressBarHorizontal.setProgress(0);  // 프로그레스바 초기화







    }

    /*xml 파일에 있는 android:onClick="onButtonClick" 로 명시되있으므로
    메소드만 만들어 실행하믄 된다.*/
    public void onButtonClick( View view){
        switch (view.getId()){
            case R.id.buttonToggleProgressCircle:{
                boolean isChecked = ((ToggleButton) view).isChecked();
                progressBarCircle.setVisibility(isChecked ? View.INVISIBLE : View.VISIBLE);
                break;
            }
            case R.id.buttonProgressBarPrimaryDecrease:{
                progressBarHorizontal.incrementProgressBy(-1);
                break;
            }
            case R.id.buttonProgressBarPrimaryIncrease:{
                progressBarHorizontal.incrementProgressBy(1);
                break;
            }
            case R.id.buttonProgressBarSecondaryDecrease:{
                progressBarHorizontal.incrementSecondaryProgressBy(-1);
                break;
            }
            case R.id.buttonProgressBarSecondaryIncrease:{
                progressBarHorizontal.incrementSecondaryProgressBy(1);
                break;
            }
            default:
                break;
        }
    }

}
