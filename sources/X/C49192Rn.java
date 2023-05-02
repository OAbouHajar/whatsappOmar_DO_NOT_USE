package X;

import android.widget.BaseAdapter;
import org.apache.commons.io.FileUtils;

/* renamed from: X.2Rn  reason: invalid class name and case insensitive filesystem */
public abstract class C49192Rn extends BaseAdapter {
    public long getItemId(int i2) {
        return ((long) i2) * FileUtils.ONE_KB;
    }

    public int getItemViewType(int i2) {
        Object item = getItem(i2);
        if (item instanceof C56022kp) {
            return 1;
        }
        if (item instanceof C101354xB) {
            return 2;
        }
        return item instanceof AnonymousClass4x9 ? 3 : 0;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }
}
