package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0C5  reason: invalid class name */
public class AnonymousClass0C5 extends BaseAdapter {
    public int A00 = -1;
    public C016607w A01;
    public boolean A02;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    public AnonymousClass0C5(LayoutInflater layoutInflater, C016607w r3, int i2, boolean z2) {
        this.A05 = z2;
        this.A04 = layoutInflater;
        this.A01 = r3;
        this.A03 = i2;
        A01();
    }

    /* renamed from: A00 */
    public C07290av getItem(int i2) {
        ArrayList A052;
        boolean z2 = this.A05;
        C016607w r0 = this.A01;
        if (z2) {
            r0.A06();
            A052 = r0.A08;
        } else {
            A052 = r0.A05();
        }
        int i3 = this.A00;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C07290av) A052.get(i2);
    }

    public void A01() {
        C016607w r0 = this.A01;
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
        ArrayList A052;
        boolean z2 = this.A05;
        C016607w r0 = this.A01;
        if (z2) {
            r0.A06();
            A052 = r0.A08;
        } else {
            A052 = r0.A05();
        }
        int i2 = this.A00;
        int size = A052.size();
        return i2 >= 0 ? size - 1 : size;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r5 == r1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r4 = 0
            if (r8 != 0) goto L_0x000b
            android.view.LayoutInflater r1 = r6.A04
            int r0 = r6.A03
            android.view.View r8 = r1.inflate(r0, r9, r4)
        L_0x000b:
            X.0av r0 = r6.getItem(r7)
            int r5 = r0.getGroupId()
            int r0 = r7 + -1
            if (r0 < 0) goto L_0x0044
            X.0av r0 = r6.getItem(r0)
            int r1 = r0.getGroupId()
        L_0x001f:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.07w r0 = r6.A01
            boolean r0 = r0.A0H()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            r0 = 1
            if (r5 != r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.setGroupDividerEnabled(r0)
            r1 = r8
            X.0lE r1 = (X.C12950lE) r1
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x003c
            r3.setForceShowIcon(r2)
        L_0x003c:
            X.0av r0 = r6.getItem(r7)
            r1.AII(r0, r4)
            return r8
        L_0x0044:
            r1 = r5
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
