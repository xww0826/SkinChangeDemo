package nd.no.xww.skinchangedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * @author xww
 * @desciption :
 * @date 2020/1/21
 * @time 14:29
 */
public class OtherActivity extends BaseSkinActivity {

    private TextView tv_start;

    private static final String TAG = "OtherActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other);
        initView();
    }

    private void initView() {
        tv_start = (TextView) findViewById(R.id.tv_start);
        tv_start.setOnClickListener(v -> startActivityForResult(new Intent(OtherActivity.this, MainActivity.class), SKIN_CHANGE_TAG));

    }
}
