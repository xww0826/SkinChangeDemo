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
public class AnotherActivity extends BaseSkinActivity {

    private TextView tv_skip;

    private static final String TAG = "OtherActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_another);
        initView();
    }

    private void initView() {
        tv_skip = (TextView) findViewById(R.id.tv_skip);
        tv_skip.setOnClickListener(v -> startActivityForResult(new Intent(AnotherActivity.this, OtherActivity.class), SKIN_CHANGE_TAG));
    }
}
