package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2B5  reason: invalid class name */
public class AnonymousClass2B5 extends C16690tT {
    public final WeakReference A00;

    public AnonymousClass2B5(AnonymousClass2B2 r2) {
        this.A00 = new WeakReference(r2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass2B3 r0 = (AnonymousClass2B3) this.A00.get();
        if (r0 == null) {
            return null;
        }
        AnonymousClass21M A002 = r0.A0J.A00(r0.A0B);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : A002.A00.entrySet()) {
            long A01 = ((AnonymousClass21N) entry.getValue()).A01(13);
            if (A01 > 0) {
                arrayList.add(new C37851pq((UserJid) entry.getKey(), A01));
            }
        }
        Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(40));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00be, code lost:
        if (r0 != 0) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.List r13 = (java.util.List) r13
            java.lang.ref.WeakReference r0 = r12.A00
            java.lang.Object r2 = r0.get()
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            if (r2 == 0) goto L_0x00c8
            if (r13 == 0) goto L_0x00c8
            X.0rz r0 = r2.A0A
            boolean r11 = r0.A1i()
            X.3xt r3 = r2.A0Q()
            X.2Ac r5 = r3.A06
            if (r11 == 0) goto L_0x00c9
            android.widget.TextView r9 = r5.A04
            X.013 r10 = r5.A0G
            r8 = 2131755396(0x7f100184, float:1.914167E38)
            int r0 = r13.size()
            long r0 = (long) r0
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r4 = r13.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r7[r4] = r6
            java.lang.String r0 = r10.A0J(r7, r8, r0)
            r9.setText(r0)
            X.2Ad r0 = r5.A0J
            r0.A00 = r13
            r0.A01()
            android.widget.TextView r1 = r5.A03
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x004e
            r4 = 8
        L_0x004e:
            r1.setVisibility(r4)
        L_0x0051:
            r5.A00()
            android.view.ViewGroup r0 = r3.A08
            r0.requestLayout()
            android.widget.TextView r1 = r3.A05
            r6 = 0
            r0 = 8
            if (r11 == 0) goto L_0x0061
            r0 = 0
        L_0x0061:
            r1.setVisibility(r0)
            android.widget.TextView r4 = r3.A05
            X.013 r8 = r2.A0B
            java.text.NumberFormat r2 = r8.A0K()
            int r0 = r13.size()
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r4.setText(r0)
            android.view.ViewGroup r7 = r3.A0A
            r5 = 2131755396(0x7f100184, float:1.914167E38)
            int r0 = r13.size()
            long r1 = (long) r0
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            int r0 = r13.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r6] = r0
            java.lang.String r0 = r8.A0J(r4, r5, r1)
            r7.setContentDescription(r0)
            android.view.ViewGroup r0 = r3.A0A
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00b5
            android.view.ViewGroup r0 = r3.A0A
            r0.setVisibility(r6)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 120(0x78, double:5.93E-322)
            r2.setDuration(r0)
            android.view.ViewGroup r0 = r3.A0A
            r0.startAnimation(r2)
        L_0x00b5:
            if (r11 != 0) goto L_0x00c0
            int r0 = r13.size()
            r1 = 2131231916(0x7f0804ac, float:1.8079927E38)
            if (r0 == 0) goto L_0x00c3
        L_0x00c0:
            r1 = 2131231976(0x7f0804e8, float:1.8080048E38)
        L_0x00c3:
            android.widget.ImageView r0 = r3.A04
            r0.setImageResource(r1)
        L_0x00c8:
            return
        L_0x00c9:
            android.widget.TextView r1 = r5.A04
            r0 = 2131892765(0x7f121a1d, float:1.9420288E38)
            r1.setText(r0)
            android.widget.TextView r1 = r5.A03
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2B5.A0A(java.lang.Object):void");
    }
}
