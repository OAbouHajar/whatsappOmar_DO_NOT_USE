package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.3Nn  reason: invalid class name and case insensitive filesystem */
public class C64283Nn extends BaseAdapter {
    public final ArrayList A00;

    public C64283Nn(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i2) {
        return this.A00.get(i2);
    }

    public long getItemId(int i2) {
        return 0;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        return (View) getItem(i2);
    }
}
