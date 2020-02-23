package nd.no.xww.skinchangedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseSkinActivity implements View.OnClickListener {

    private TextView tv_clr_1;
    private TextView tv_clr_2;
    private TextView tv_clr_3;
    private TextView tv_clr_4;
    private TextView tv_clr_5;
    private TextView tv_clr_6;
    private TextView tv_clr_7;

    private TextView tv_skip_to_real_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_clr_1 = (TextView) findViewById(R.id.tv_clr_1);
        tv_clr_1.setOnClickListener(this);
        tv_clr_2 = (TextView) findViewById(R.id.tv_clr_2);
        tv_clr_2.setOnClickListener(this);
        tv_clr_3 = (TextView) findViewById(R.id.tv_clr_3);
        tv_clr_3.setOnClickListener(this);
        tv_clr_4 = (TextView) findViewById(R.id.tv_clr_4);
        tv_clr_4.setOnClickListener(this);
        tv_clr_5 = (TextView) findViewById(R.id.tv_clr_5);
        tv_clr_5.setOnClickListener(this);
        tv_clr_6 = (TextView) findViewById(R.id.tv_clr_6);
        tv_clr_6.setOnClickListener(this);
        tv_clr_7 = (TextView) findViewById(R.id.tv_clr_7);
        tv_clr_7.setOnClickListener(this);
        tv_skip_to_real_change = (TextView) findViewById(R.id.tv_skip_to_real_change);
        tv_skip_to_real_change.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String selThemeColor = "";
        switch (v.getId()) {
            case R.id.tv_skip_to_real_change:
                Intent intent = new Intent(this, RealChangeActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_clr_1:
                selThemeColor = "cyan";
                break;
            case R.id.tv_clr_2:
                selThemeColor = "yellow";
                break;
            case R.id.tv_clr_3:
                selThemeColor = "brown";
                break;
            case R.id.tv_clr_4:
                selThemeColor = "gray";
                break;
            case R.id.tv_clr_5:
                selThemeColor = "pink";
                break;
            case R.id.tv_clr_6:
                selThemeColor = "green";
                break;
            case R.id.tv_clr_7:
                selThemeColor = "blue";
                break;
        }
        final String curThemeColor = mSharedPreferences.getString("theme_color", defaultTheme);
        if (selThemeColor.equals(curThemeColor)) {
            Toast.makeText(this, selThemeColor, Toast.LENGTH_SHORT).show();
        } else {
            mSharedPreferences.edit().putString("theme_color", selThemeColor).apply();
            recreate();
        }
    }
}
