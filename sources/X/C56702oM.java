package X;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: X.2oM  reason: invalid class name and case insensitive filesystem */
public class C56702oM extends BaseAdapter {
    public final int A00;
    public final Context A01;
    public final AnonymousClass013 A02;
    public final /* synthetic */ AnonymousClass3BH A03;

    public C56702oM(Context context, AnonymousClass3BH r2, AnonymousClass013 r3, int i2) {
        this.A03 = r2;
        this.A01 = context;
        this.A02 = r3;
        this.A00 = i2;
    }

    public int getCount() {
        AnonymousClass3BH r6 = this.A03;
        int i2 = 0;
        if (r6.A01 == 0) {
            return 0;
        }
        C88984bP[] r4 = r6.A0S;
        int i3 = this.A00;
        int A002 = r4[i3].A00();
        int i4 = r6.A01;
        int i5 = ((A002 + i4) - 1) / i4;
        if (r6.A0Q && r4[i3].A00() > 0) {
            i2 = 1;
        }
        return i5 + i2;
    }

    public Object getItem(int i2) {
        return null;
    }

    public long getItemId(int i2) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != r4.A01) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r5 = 0
            if (r12 == 0) goto L_0x000f
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r1 = r12.getChildCount()
            X.3BH r4 = r10.A03
            int r0 = r4.A01
            if (r1 == r0) goto L_0x003b
        L_0x000f:
            X.3BH r4 = r10.A03
            android.content.Context r0 = r4.A09
            X.3N2 r12 = new X.3N2
            r12.<init>(r0, r10)
            r3 = 0
        L_0x0019:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x0034
            android.content.Context r0 = r10.A01
            X.2nu r2 = new X.2nu
            r2.<init>(r0, r4)
            int r1 = r4.A05
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            r12.addView(r2)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0034:
            r12.setClickable(r5)
            r0 = 2
            X.C004601z.A0d(r12, r0)
        L_0x003b:
            r3 = 0
        L_0x003c:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x00aa
            android.view.View r2 = r12.getChildAt(r3)
            X.2nu r2 = (X.C56562nu) r2
            int r8 = r4.A01
            int r8 = r8 * r11
            int r8 = r8 + r3
            X.4bP[] r9 = r4.A0S
            int r7 = r10.A00
            r1 = r9[r7]
            int r0 = r1.A00()
            r6 = 0
            if (r8 >= r0) goto L_0x0097
            r0 = r9[r7]
            X.0u3 r1 = r4.A0P
            int[] r0 = r0.A01(r1, r8)
            r2.setEmoji(r0)
            r0 = 2131232418(0x7f0806a2, float:1.8080945E38)
            r2.setBackgroundResource(r0)
            r0 = 1
            r2.setClickable(r0)
            android.view.View$OnClickListener r0 = r4.A0C
            r2.setOnClickListener(r0)
            r0 = r9[r7]
            int[] r1 = r0.A01(r1, r8)
            if (r1 == 0) goto L_0x008a
            boolean r0 = X.C62153Bw.A02(r1)
            if (r0 == 0) goto L_0x008a
            com.facebook.redex.IDxCListenerShape178S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape178S0100000_2_I1
            r1.<init>(r10, r5)
        L_0x0084:
            r2.setOnLongClickListener(r1)
        L_0x0087:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x008a:
            boolean r0 = X.C62153Bw.A03(r1)
            if (r0 == 0) goto L_0x00a3
            r0 = 1
            com.facebook.redex.IDxCListenerShape178S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape178S0100000_2_I1
            r1.<init>(r10, r0)
            goto L_0x0084
        L_0x0097:
            r2.setEmoji(r6)
            r2.setBackground(r6)
            r2.setOnClickListener(r6)
            r2.setClickable(r5)
        L_0x00a3:
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L_0x0087
        L_0x00aa:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56702oM.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
