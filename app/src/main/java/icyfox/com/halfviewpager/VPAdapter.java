package icyfox.com.halfviewpager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by icyfox on 2014/12/12.
 */
public class VPAdapter extends PagerAdapter {

    List<View> views;

    int[] colors = {Color.CYAN, Color.MAGENTA, Color.WHITE, Color.YELLOW, Color.RED};

    public VPAdapter(Activity activity){
        views = new ArrayList<View>();

        for (int i=0;i<colors.length;i++){
            View v = activity.getLayoutInflater().inflate(R.layout.view, null);
            v.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            v.setBackgroundColor(colors[i]);
            views.add(v);
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public float getPageWidth(int position) {
        if (position == 0 || position == colors.length - 1)
        {
            return 1f;
        }
        return 0.9f;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position), 0);
        return views.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }
}
