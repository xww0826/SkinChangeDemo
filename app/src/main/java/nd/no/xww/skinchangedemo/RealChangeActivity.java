package nd.no.xww.skinchangedemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.app.SkinAppCompatDelegateImpl;
import android.widget.TextView;

import skin.support.SkinCompatManager;

/**
 * @author xww
 * @desciption :
 * @date 2020/2/23
 * @time 13:27
 */
public class RealChangeActivity extends AppCompatActivity {

    private TextView tv_change_skin;
    private TextView tv_skin_restore;
    private TextView tv_change_skin_red;

    /**
     * 如果项目中使用的Activity继承自AppCompatActivity，需要重载getDelegate()方法
     */
    @NonNull
    @Override
    public AppCompatDelegate getDelegate() {
        return SkinAppCompatDelegateImpl.get(this, this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_real_change);
        initView();
    }


    private void initView() {
        tv_change_skin = (TextView) findViewById(R.id.tv_change_skin);
        tv_skin_restore = (TextView) findViewById(R.id.tv_skin_restore);
        tv_change_skin_red = (TextView) findViewById(R.id.tv_change_skin_red);


        tv_change_skin.setOnClickListener(v -> {
            // 加载 assets/skins 包下的皮肤插件
            SkinCompatManager.getInstance().loadSkin("night.skin",
                    SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
        });

        tv_change_skin_red.setOnClickListener(v -> {
            // 加载 assets/skins 包下的皮肤插件
            SkinCompatManager.getInstance().loadSkin("red.skin",
                    SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
        });

        tv_skin_restore.setOnClickListener(v -> {
            // 恢复应用默认皮肤
            SkinCompatManager.getInstance().restoreDefaultTheme();
        });
    }
}
