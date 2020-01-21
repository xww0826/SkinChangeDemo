package nd.no.xww.skinchangedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author xww
 * @desciption :
 * @date 2020/1/21
 * @time 13:51
 */
public abstract class BaseSkinActivity extends AppCompatActivity {

    private static final String TAG = "BaseSkinActivity";

    protected SharedPreferences mSharedPreferences;

    protected final int SKIN_CHANGE_TAG = 0x0001;

    protected String defaultTheme = "cyan";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setFullTheme();
        super.onCreate(savedInstanceState);
    }

    private void setFullTheme() {
        mSharedPreferences = getSharedPreferences("app_theme", MODE_PRIVATE);
        final String themeColor = mSharedPreferences.getString("theme_color", defaultTheme);
        switch (themeColor) {
            case "cyan":
                setTheme(R.style.AppTheme_cyan);
                break;
            case "yellow":
                setTheme(R.style.AppTheme_yellow);
                break;
            case "brown":
                setTheme(R.style.AppTheme_brown);
                break;
            case "gray":
                setTheme(R.style.AppTheme_grey);
                break;
            case "pink":
                setTheme(R.style.AppTheme_pink);
                break;
            case "green":
                setTheme(R.style.AppTheme_green);
                break;
            case "blue":
                setTheme(R.style.AppTheme_blue);
                break;
            default:
                setTheme(R.style.AppTheme_cyan);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SKIN_CHANGE_TAG) {
            recreate();
        }
    }
}
