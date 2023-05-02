package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0C4  reason: invalid class name */
public class AnonymousClass0C4 extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ AnonymousClass0ZT A01;

    public AnonymousClass0C4(AnonymousClass0ZT r2) {
        this.A01 = r2;
        A01();
    }

    /* renamed from: A00 */
    public C07290av getItem(int i2) {
        C016607w r0 = this.A01.A04;
        r0.A06();
        ArrayList arrayList = r0.A08;
        int i3 = this.A00;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C07290av) arrayList.get(i2);
    }

    public void A01() {
        C016607w r0 = this.A01.A04;
        C07290av r4 = r0.A04;
        if (r4 != null) {
            r0.A06();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == r4) {
                    this.A00 = i2;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        C016607w r0 = this.A01.A04;
        r0.A06();
        int size = r0.A08.size();
        return this.A00 >= 0 ? size - 1 : size;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A01.A01.inflate(R.layout.layout0010, viewGroup, false);
        }
        ((C12950lE) view).AII(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
