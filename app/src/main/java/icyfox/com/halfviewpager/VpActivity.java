package icyfox.com.halfviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

/**
 * 本项目更改了ViewPager的样式
 * ViewPager的左右会各去掉10%的部分，显示前后的页面
 */
public class VpActivity extends Activity {

    private ViewPager vp;
    private VPAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp);

        int width = getWindowManager().getDefaultDisplay().getWidth() / 10;

        vp = (ViewPager) findViewById(R.id.pager);
        vp.setOffscreenPageLimit(5);
        vp.setPageMargin(- width); //为了显示左侧的10%
        adapter = new VPAdapter(this);
        vp.setAdapter(adapter);

    }

}
