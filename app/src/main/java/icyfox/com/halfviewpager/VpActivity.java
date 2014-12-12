package icyfox.com.halfviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;


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
        adapter = new VPAdapter(this);
        vp.setAdapter(adapter);
        vp.setPageMargin(-width);
    }

}
