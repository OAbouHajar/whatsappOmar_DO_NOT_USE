package X;

import android.util.Log;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0V5  reason: invalid class name */
public abstract class AnonymousClass0V5 {
    public boolean A00 = false;
    public boolean A01 = false;
    public final ViewGroup A02;
    public final ArrayList A03 = AnonymousClass000.A0u();
    public final ArrayList A04 = AnonymousClass000.A0u();

    public AnonymousClass0V5(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static AnonymousClass0V5 A01(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AnonymousClass0V5) {
            return (AnonymousClass0V5) tag;
        }
        C02790Ey r1 = new C02790Ey(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, r1);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0241, code lost:
        r12 = r0.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0243, code lost:
        if (r12 != null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0245, code lost:
        r12 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0249, code lost:
        r16 = r11.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0250, code lost:
        if (r14 >= r16) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0252, code lost:
        r21.put(r11.get(r14), r12.get(r14));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0262, code lost:
        r14 = new X.AnonymousClass00N();
        r6.A08(r18.A0A, r14);
        X.AnonymousClass05D.A00(r11, r14);
        X.AnonymousClass05D.A00(r14.keySet(), r21);
        r13 = new X.AnonymousClass00N();
        r6.A08(r19.A0A, r13);
        X.AnonymousClass05D.A00(r12, r13);
        X.AnonymousClass05D.A00(r21.values(), r13);
        r15 = r21.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0294, code lost:
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0296, code lost:
        if (r15 < 0) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a6, code lost:
        if (r13.containsKey(r21.A02[(r15 << 1) + 1]) != false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a8, code lost:
        r21.A06(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ae, code lost:
        X.C02790Ey.A00(r14, r21.keySet());
        X.C02790Ey.A00(r13, r21.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c0, code lost:
        if (r21.isEmpty() == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c2, code lost:
        r23.clear();
        r22.clear();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02cb, code lost:
        X.C06870Yf.A00(r2, new X.C10400h4(r13, r6, r5, r9));
        r23.addAll(r14.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e0, code lost:
        if (r11.isEmpty() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e2, code lost:
        r10 = (android.view.View) r14.get(r11.get(0));
        r3.A08(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ef, code lost:
        r22.addAll(r13.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02fc, code lost:
        if (r12.isEmpty() != false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02fe, code lost:
        r12 = (android.view.View) r13.get(r12.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0308, code lost:
        if (r12 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030a, code lost:
        X.C06870Yf.A00(r2, new X.C10410h5(r24, r12, r6, r3));
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0316, code lost:
        r3.A0A(r0, r1, r23);
        r3.A0D(r1, (java.lang.Object) null, (java.lang.Object) null, r1, (java.util.ArrayList) null, (java.util.ArrayList) null, r22);
        r0 = java.lang.Boolean.TRUE;
        r4.put(r9, r0);
        r4.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020f, code lost:
        if (r0 != null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        if (r13 == null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0215, code lost:
        r13 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0219, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021e, code lost:
        if (r12 >= r13.size()) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0220, code lost:
        r16 = r11.indexOf(r13.get(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022c, code lost:
        if (r16 == -1) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022e, code lost:
        r11.set(r16, r14.get(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0238, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023b, code lost:
        r0 = r19.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023f, code lost:
        if (r0 == null) goto L_0x0245;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r39 = this;
            r8 = r39
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0014
            android.view.ViewGroup r0 = r8.A02
            boolean r0 = X.C004601z.A0t(r0)
            r7 = 0
            if (r0 != 0) goto L_0x0015
            r8.A03()
            r8.A01 = r7
        L_0x0014:
            return
        L_0x0015:
            java.util.ArrayList r0 = r8.A03
            r25 = r0
            monitor-enter(r25)
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0638
            java.util.ArrayList r5 = r8.A04     // Catch:{ all -> 0x063a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r0.<init>(r5)     // Catch:{ all -> 0x063a }
            r5.clear()     // Catch:{ all -> 0x063a }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x063a }
        L_0x002e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x063a }
            X.0S3 r3 = (X.AnonymousClass0S3) r3     // Catch:{ all -> 0x063a }
            r0 = 2
            boolean r0 = X.AnonymousClass02C.A02(r0)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x063a }
            java.lang.String r0 = "SpecialEffectsController: Cancelling operation "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r1)     // Catch:{ all -> 0x063a }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x063a }
        L_0x0050:
            r3.A02()     // Catch:{ all -> 0x063a }
            boolean r0 = r3.A03     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x002e
            r5.add(r3)     // Catch:{ all -> 0x063a }
            goto L_0x002e
        L_0x005b:
            r8.A05()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r0 = r25
            r1.<init>(r0)     // Catch:{ all -> 0x063a }
            r25.clear()     // Catch:{ all -> 0x063a }
            r5.addAll(r1)     // Catch:{ all -> 0x063a }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x063a }
        L_0x006f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x063a }
            X.0S3 r0 = (X.AnonymousClass0S3) r0     // Catch:{ all -> 0x063a }
            r0.A01()     // Catch:{ all -> 0x063a }
            goto L_0x006f
        L_0x007f:
            boolean r2 = r8.A01     // Catch:{ all -> 0x063a }
            r6 = r8
            X.0Ey r6 = (X.C02790Ey) r6     // Catch:{ all -> 0x063a }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x063a }
            r4 = 0
            r9 = r4
        L_0x008a:
            r5 = r4
        L_0x008b:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x063a }
            X.0S3 r4 = (X.AnonymousClass0S3) r4     // Catch:{ all -> 0x063a }
            X.01A r0 = r4.A04     // Catch:{ all -> 0x063a }
            android.view.View r0 = r0.A0A     // Catch:{ all -> 0x063a }
            X.0Kg r3 = X.C03890Kg.A01(r0)     // Catch:{ all -> 0x063a }
            X.0Kg r0 = r4.A01     // Catch:{ all -> 0x063a }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x063a }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00b1
            X.0Kg r0 = X.C03890Kg.VISIBLE     // Catch:{ all -> 0x063a }
            if (r3 != r0) goto L_0x008b
            if (r9 != 0) goto L_0x008b
            r9 = r4
            goto L_0x008b
        L_0x00b1:
            X.0Kg r0 = X.C03890Kg.VISIBLE     // Catch:{ all -> 0x063a }
            if (r3 == r0) goto L_0x008b
            goto L_0x008a
        L_0x00b6:
            java.util.ArrayList r29 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r28 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r27 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r0 = r27
            r0.<init>(r1)     // Catch:{ all -> 0x063a }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x063a }
        L_0x00c9:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r4 = r11.next()     // Catch:{ all -> 0x063a }
            X.0S3 r4 = (X.AnonymousClass0S3) r4     // Catch:{ all -> 0x063a }
            X.024 r0 = new X.024     // Catch:{ all -> 0x063a }
            r0.<init>()     // Catch:{ all -> 0x063a }
            r4.A01()     // Catch:{ all -> 0x063a }
            java.util.HashSet r10 = r4.A06     // Catch:{ all -> 0x063a }
            r10.add(r0)     // Catch:{ all -> 0x063a }
            X.0Eq r1 = new X.0Eq     // Catch:{ all -> 0x063a }
            r1.<init>(r0, r4, r2)     // Catch:{ all -> 0x063a }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x063a }
            X.024 r3 = new X.024     // Catch:{ all -> 0x063a }
            r3.<init>()     // Catch:{ all -> 0x063a }
            r4.A01()     // Catch:{ all -> 0x063a }
            r10.add(r3)     // Catch:{ all -> 0x063a }
            r0 = 0
            if (r2 == 0) goto L_0x00fe
            if (r4 != r9) goto L_0x0101
        L_0x00fc:
            r0 = 1
            goto L_0x0101
        L_0x00fe:
            if (r4 != r5) goto L_0x0101
            goto L_0x00fc
        L_0x0101:
            X.0Ep r1 = new X.0Ep     // Catch:{ all -> 0x063a }
            r1.<init>(r3, r4, r2, r0)     // Catch:{ all -> 0x063a }
            r0 = r28
            r0.add(r1)     // Catch:{ all -> 0x063a }
            X.0gp r1 = new X.0gp     // Catch:{ all -> 0x063a }
            r0 = r27
            r1.<init>(r6, r4, r0)     // Catch:{ all -> 0x063a }
            java.util.List r0 = r4.A07     // Catch:{ all -> 0x063a }
            r0.add(r1)     // Catch:{ all -> 0x063a }
            goto L_0x00c9
        L_0x0118:
            java.util.HashMap r4 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x063a }
            java.util.Iterator r12 = r28.iterator()     // Catch:{ all -> 0x063a }
            r3 = 0
        L_0x0121:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0190
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x063a }
            X.0Ep r11 = (X.C02730Ep) r11     // Catch:{ all -> 0x063a }
            boolean r0 = r11.A01()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0121
            java.lang.Object r2 = r11.A01     // Catch:{ all -> 0x063a }
            X.0WS r1 = r11.A02(r2)     // Catch:{ all -> 0x063a }
            java.lang.Object r10 = r11.A00     // Catch:{ all -> 0x063a }
            X.0WS r0 = r11.A02(r10)     // Catch:{ all -> 0x063a }
            if (r1 == 0) goto L_0x0146
            if (r0 == 0) goto L_0x0147
            if (r1 == r0) goto L_0x0147
            goto L_0x0150
        L_0x0146:
            r1 = r0
        L_0x0147:
            if (r3 != 0) goto L_0x014b
            r3 = r1
            goto L_0x0121
        L_0x014b:
            if (r1 == 0) goto L_0x0121
            if (r3 == r1) goto L_0x0121
            goto L_0x0170
        L_0x0150:
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x063a }
            X.0S3 r0 = r11.A01     // Catch:{ all -> 0x063a }
            X.01A r0 = r0.A04     // Catch:{ all -> 0x063a }
            r1.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x063a }
            r1.append(r2)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " which uses a different Transition  type than its shared element transition "
            java.lang.String r0 = X.AnonymousClass000.A0e(r10, r0, r1)     // Catch:{ all -> 0x063a }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x063a }
            goto L_0x018f
        L_0x0170:
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x063a }
            X.0S3 r0 = r11.A01     // Catch:{ all -> 0x063a }
            X.01A r0 = r0.A04     // Catch:{ all -> 0x063a }
            r1.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x063a }
            r1.append(r2)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " which uses a different Transition  type than other Fragments."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x063a }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x063a }
        L_0x018f:
            throw r0     // Catch:{ all -> 0x063a }
        L_0x0190:
            if (r3 != 0) goto L_0x01ad
            java.util.Iterator r3 = r28.iterator()     // Catch:{ all -> 0x063a }
        L_0x0196:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0503
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x063a }
            X.0QI r2 = (X.AnonymousClass0QI) r2     // Catch:{ all -> 0x063a }
            X.0S3 r1 = r2.A01     // Catch:{ all -> 0x063a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x063a }
            r4.put(r1, r0)     // Catch:{ all -> 0x063a }
            r2.A00()     // Catch:{ all -> 0x063a }
            goto L_0x0196
        L_0x01ad:
            android.view.ViewGroup r2 = r6.A02     // Catch:{ all -> 0x063a }
            android.content.Context r1 = r2.getContext()     // Catch:{ all -> 0x063a }
            android.view.View r26 = new android.view.View     // Catch:{ all -> 0x063a }
            r0 = r26
            r0.<init>(r1)     // Catch:{ all -> 0x063a }
            android.graphics.Rect r24 = X.AnonymousClass000.A0J()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r23 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r22 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            X.00N r21 = new X.00N     // Catch:{ all -> 0x063a }
            r21.<init>()     // Catch:{ all -> 0x063a }
            java.util.Iterator r17 = r28.iterator()     // Catch:{ all -> 0x063a }
            r1 = 0
            r10 = 0
            r20 = 0
        L_0x01d3:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x033a
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x063a }
            X.0Ep r0 = (X.C02730Ep) r0     // Catch:{ all -> 0x063a }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x01d3
            if (r9 == 0) goto L_0x01d3
            if (r5 == 0) goto L_0x01d3
            java.lang.Object r0 = r3.A02(r0)     // Catch:{ all -> 0x063a }
            java.lang.Object r1 = r3.A03(r0)     // Catch:{ all -> 0x063a }
            X.01A r0 = r5.A04     // Catch:{ all -> 0x063a }
            r19 = r0
            X.0PD r0 = r0.A0C     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x01fb
            java.util.ArrayList r11 = r0.A0C     // Catch:{ all -> 0x063a }
            if (r11 != 0) goto L_0x01ff
        L_0x01fb:
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
        L_0x01ff:
            X.01A r0 = r9.A04     // Catch:{ all -> 0x063a }
            r18 = r0
            X.0PD r0 = r0.A0C     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x020b
            java.util.ArrayList r14 = r0.A0C     // Catch:{ all -> 0x063a }
            if (r14 != 0) goto L_0x0211
        L_0x020b:
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0215
        L_0x0211:
            java.util.ArrayList r13 = r0.A0D     // Catch:{ all -> 0x063a }
            if (r13 != 0) goto L_0x0219
        L_0x0215:
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
        L_0x0219:
            r12 = 0
        L_0x021a:
            int r0 = r13.size()     // Catch:{ all -> 0x063a }
            if (r12 >= r0) goto L_0x023b
            java.lang.Object r0 = r13.get(r12)     // Catch:{ all -> 0x063a }
            int r16 = r11.indexOf(r0)     // Catch:{ all -> 0x063a }
            r0 = -1
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0238
            java.lang.Object r0 = r14.get(r12)     // Catch:{ all -> 0x063a }
            r15 = r0
            r0 = r16
            r11.set(r0, r15)     // Catch:{ all -> 0x063a }
        L_0x0238:
            int r12 = r12 + 1
            goto L_0x021a
        L_0x023b:
            r0 = r19
            X.0PD r0 = r0.A0C     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0245
            java.util.ArrayList r12 = r0.A0D     // Catch:{ all -> 0x063a }
            if (r12 != 0) goto L_0x0249
        L_0x0245:
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
        L_0x0249:
            int r16 = r11.size()     // Catch:{ all -> 0x063a }
            r14 = 0
        L_0x024e:
            r0 = r16
            if (r14 >= r0) goto L_0x0262
            java.lang.Object r0 = r11.get(r14)     // Catch:{ all -> 0x063a }
            java.lang.Object r15 = r12.get(r14)     // Catch:{ all -> 0x063a }
            r13 = r21
            r13.put(r0, r15)     // Catch:{ all -> 0x063a }
            int r14 = r14 + 1
            goto L_0x024e
        L_0x0262:
            X.00N r14 = new X.00N     // Catch:{ all -> 0x063a }
            r14.<init>()     // Catch:{ all -> 0x063a }
            r0 = r18
            android.view.View r0 = r0.A0A     // Catch:{ all -> 0x063a }
            r6.A08(r0, r14)     // Catch:{ all -> 0x063a }
            X.AnonymousClass05D.A00(r11, r14)     // Catch:{ all -> 0x063a }
            java.util.Set r13 = r14.keySet()     // Catch:{ all -> 0x063a }
            r0 = r21
            X.AnonymousClass05D.A00(r13, r0)     // Catch:{ all -> 0x063a }
            X.00N r13 = new X.00N     // Catch:{ all -> 0x063a }
            r13.<init>()     // Catch:{ all -> 0x063a }
            r0 = r19
            android.view.View r0 = r0.A0A     // Catch:{ all -> 0x063a }
            r6.A08(r0, r13)     // Catch:{ all -> 0x063a }
            X.AnonymousClass05D.A00(r12, r13)     // Catch:{ all -> 0x063a }
            java.util.Collection r0 = r21.values()     // Catch:{ all -> 0x063a }
            X.AnonymousClass05D.A00(r0, r13)     // Catch:{ all -> 0x063a }
            int r15 = r21.size()     // Catch:{ all -> 0x063a }
        L_0x0294:
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x02ae
            r0 = r21
            java.lang.Object[] r0 = r0.A02     // Catch:{ all -> 0x063a }
            int r16 = r15 << 1
            int r16 = r16 + 1
            r0 = r0[r16]     // Catch:{ all -> 0x063a }
            boolean r0 = r13.containsKey(r0)     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0294
            r0 = r21
            r0.A06(r15)     // Catch:{ all -> 0x063a }
            goto L_0x0294
        L_0x02ae:
            java.util.Set r0 = r21.keySet()     // Catch:{ all -> 0x063a }
            X.C02790Ey.A00(r14, r0)     // Catch:{ all -> 0x063a }
            java.util.Collection r0 = r21.values()     // Catch:{ all -> 0x063a }
            X.C02790Ey.A00(r13, r0)     // Catch:{ all -> 0x063a }
            boolean r0 = r21.isEmpty()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x02cb
            r23.clear()     // Catch:{ all -> 0x063a }
            r22.clear()     // Catch:{ all -> 0x063a }
            r1 = 0
            goto L_0x01d3
        L_0x02cb:
            X.0h4 r0 = new X.0h4     // Catch:{ all -> 0x063a }
            r0.<init>(r13, r6, r5, r9)     // Catch:{ all -> 0x063a }
            X.C06870Yf.A00(r2, r0)     // Catch:{ all -> 0x063a }
            java.util.Collection r15 = r14.values()     // Catch:{ all -> 0x063a }
            r0 = r23
            r0.addAll(r15)     // Catch:{ all -> 0x063a }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x02ef
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x063a }
            java.lang.Object r10 = r14.get(r0)     // Catch:{ all -> 0x063a }
            android.view.View r10 = (android.view.View) r10     // Catch:{ all -> 0x063a }
            r3.A08(r10, r1)     // Catch:{ all -> 0x063a }
        L_0x02ef:
            java.util.Collection r11 = r13.values()     // Catch:{ all -> 0x063a }
            r0 = r22
            r0.addAll(r11)     // Catch:{ all -> 0x063a }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0316
            java.lang.Object r0 = r12.get(r7)     // Catch:{ all -> 0x063a }
            java.lang.Object r12 = r13.get(r0)     // Catch:{ all -> 0x063a }
            android.view.View r12 = (android.view.View) r12     // Catch:{ all -> 0x063a }
            if (r12 == 0) goto L_0x0316
            X.0h5 r11 = new X.0h5     // Catch:{ all -> 0x063a }
            r0 = r24
            r11.<init>(r0, r12, r6, r3)     // Catch:{ all -> 0x063a }
            X.C06870Yf.A00(r2, r11)     // Catch:{ all -> 0x063a }
            r20 = 1
        L_0x0316:
            r11 = r26
            r0 = r23
            r3.A0A(r11, r1, r0)     // Catch:{ all -> 0x063a }
            r32 = 0
            r34 = r1
            r35 = r32
            r36 = r32
            r30 = r3
            r31 = r1
            r33 = r32
            r37 = r22
            r30.A0D(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x063a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x063a }
            r4.put(r9, r0)     // Catch:{ all -> 0x063a }
            r4.put(r5, r0)     // Catch:{ all -> 0x063a }
            goto L_0x01d3
        L_0x033a:
            java.util.ArrayList r19 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            java.util.Iterator r18 = r28.iterator()     // Catch:{ all -> 0x063a }
            r13 = 0
            r17 = 0
        L_0x0345:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x03fe
            java.lang.Object r11 = r18.next()     // Catch:{ all -> 0x063a }
            X.0Ep r11 = (X.C02730Ep) r11     // Catch:{ all -> 0x063a }
            boolean r0 = r11.A01()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0362
            X.0S3 r12 = r11.A01     // Catch:{ all -> 0x063a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x063a }
            r4.put(r12, r0)     // Catch:{ all -> 0x063a }
        L_0x035e:
            r11.A00()     // Catch:{ all -> 0x063a }
            goto L_0x0345
        L_0x0362:
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x063a }
            java.lang.Object r12 = r3.A02(r0)     // Catch:{ all -> 0x063a }
            X.0S3 r15 = r11.A01     // Catch:{ all -> 0x063a }
            if (r1 == 0) goto L_0x0373
            if (r15 == r9) goto L_0x0370
            if (r15 != r5) goto L_0x0373
        L_0x0370:
            r16 = 1
            goto L_0x0375
        L_0x0373:
            r16 = 0
        L_0x0375:
            if (r12 != 0) goto L_0x037f
            if (r16 != 0) goto L_0x0345
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x063a }
            r4.put(r15, r0)     // Catch:{ all -> 0x063a }
            goto L_0x035e
        L_0x037f:
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            X.01A r11 = r15.A04     // Catch:{ all -> 0x063a }
            android.view.View r0 = r11.A0A     // Catch:{ all -> 0x063a }
            r6.A07(r0, r14)     // Catch:{ all -> 0x063a }
            if (r16 == 0) goto L_0x0395
            r0 = r22
            if (r15 != r9) goto L_0x0392
            r0 = r23
        L_0x0392:
            r14.removeAll(r0)     // Catch:{ all -> 0x063a }
        L_0x0395:
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x03ac
            r0 = r26
            r3.A07(r0, r12)     // Catch:{ all -> 0x063a }
        L_0x03a0:
            X.0Kg r11 = r15.A01     // Catch:{ all -> 0x063a }
            X.0Kg r0 = X.C03890Kg.VISIBLE     // Catch:{ all -> 0x063a }
            if (r11 != r0) goto L_0x03ed
            r0 = r19
            r0.addAll(r14)     // Catch:{ all -> 0x063a }
            goto L_0x03e5
        L_0x03ac:
            r3.A0E(r12, r14)     // Catch:{ all -> 0x063a }
            r32 = r12
            r34 = r13
            r36 = r13
            r37 = r13
            r30 = r3
            r31 = r12
            r33 = r13
            r35 = r14
            r30.A0D(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x063a }
            X.0Kg r0 = r15.A01     // Catch:{ all -> 0x063a }
            X.0Kg r13 = X.C03890Kg.GONE     // Catch:{ all -> 0x063a }
            if (r0 != r13) goto L_0x03a0
            r0 = r27
            r0.remove(r15)     // Catch:{ all -> 0x063a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r13.<init>(r14)     // Catch:{ all -> 0x063a }
            android.view.View r0 = r11.A0A     // Catch:{ all -> 0x063a }
            r13.remove(r0)     // Catch:{ all -> 0x063a }
            android.view.View r0 = r11.A0A     // Catch:{ all -> 0x063a }
            r3.A09(r0, r12, r13)     // Catch:{ all -> 0x063a }
            X.0g6 r0 = new X.0g6     // Catch:{ all -> 0x063a }
            r0.<init>(r6, r14)     // Catch:{ all -> 0x063a }
            X.C06870Yf.A00(r2, r0)     // Catch:{ all -> 0x063a }
            goto L_0x03a0
        L_0x03e5:
            if (r20 == 0) goto L_0x03f0
            r0 = r24
            r3.A06(r0, r12)     // Catch:{ all -> 0x063a }
            goto L_0x03f0
        L_0x03ed:
            r3.A08(r10, r12)     // Catch:{ all -> 0x063a }
        L_0x03f0:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x063a }
            r4.put(r15, r0)     // Catch:{ all -> 0x063a }
            r13 = 0
            r0 = r17
            java.lang.Object r17 = r3.A05(r0, r12, r13)     // Catch:{ all -> 0x063a }
            goto L_0x0345
        L_0x03fe:
            r0 = r17
            java.lang.Object r10 = r3.A04(r0, r13, r1)     // Catch:{ all -> 0x063a }
            java.util.Iterator r14 = r28.iterator()     // Catch:{ all -> 0x063a }
        L_0x0408:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x045d
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x063a }
            X.0Ep r13 = (X.C02730Ep) r13     // Catch:{ all -> 0x063a }
            boolean r0 = r13.A01()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0408
            java.lang.Object r11 = r13.A01     // Catch:{ all -> 0x063a }
            X.0S3 r12 = r13.A01     // Catch:{ all -> 0x063a }
            if (r1 == 0) goto L_0x0426
            if (r12 == r9) goto L_0x0424
            if (r12 != r5) goto L_0x0426
        L_0x0424:
            r0 = 1
            goto L_0x0427
        L_0x0426:
            r0 = 0
        L_0x0427:
            if (r11 != 0) goto L_0x042b
            if (r0 == 0) goto L_0x0408
        L_0x042b:
            boolean r0 = X.C004601z.A0u(r2)     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0450
            r0 = 2
            boolean r0 = X.AnonymousClass02C.A02(r0)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x063a }
            r11.append(r2)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " has not been laid out. Completing operation "
            java.lang.String r11 = X.AnonymousClass000.A0e(r12, r0, r11)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)     // Catch:{ all -> 0x063a }
        L_0x044c:
            r13.A00()     // Catch:{ all -> 0x063a }
            goto L_0x0408
        L_0x0450:
            X.01A r12 = r12.A04     // Catch:{ all -> 0x063a }
            X.024 r11 = r13.A00     // Catch:{ all -> 0x063a }
            X.0g7 r0 = new X.0g7     // Catch:{ all -> 0x063a }
            r0.<init>(r13, r6)     // Catch:{ all -> 0x063a }
            r3.A0C(r11, r12, r10, r0)     // Catch:{ all -> 0x063a }
            goto L_0x0408
        L_0x045d:
            boolean r0 = X.C004601z.A0u(r2)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0503
            r9 = 4
            int r5 = r19.size()     // Catch:{ all -> 0x063a }
        L_0x0468:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x0476
            r0 = r19
            android.view.View r0 = X.AnonymousClass000.A0N(r0, r5)     // Catch:{ all -> 0x063a }
            r0.setVisibility(r9)     // Catch:{ all -> 0x063a }
            goto L_0x0468
        L_0x0476:
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            int r12 = r22.size()     // Catch:{ all -> 0x063a }
            r11 = 0
        L_0x047f:
            if (r11 >= r12) goto L_0x0495
            r0 = r22
            android.view.View r5 = X.AnonymousClass000.A0N(r0, r11)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = X.C004601z.A0L(r5)     // Catch:{ all -> 0x063a }
            r9.add(r0)     // Catch:{ all -> 0x063a }
            r0 = 0
            X.C004601z.A0n(r5, r0)     // Catch:{ all -> 0x063a }
            int r11 = r11 + 1
            goto L_0x047f
        L_0x0495:
            r3.A0B(r2, r10)     // Catch:{ all -> 0x063a }
            int r10 = r22.size()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            r11 = 0
        L_0x04a1:
            if (r11 >= r10) goto L_0x04db
            r0 = r23
            android.view.View r13 = X.AnonymousClass000.A0N(r0, r11)     // Catch:{ all -> 0x063a }
            java.lang.String r12 = X.C004601z.A0L(r13)     // Catch:{ all -> 0x063a }
            r5.add(r12)     // Catch:{ all -> 0x063a }
            if (r12 == 0) goto L_0x04d8
            r0 = 0
            X.C004601z.A0n(r13, r0)     // Catch:{ all -> 0x063a }
            r0 = r21
            java.lang.Object r14 = r0.get(r12)     // Catch:{ all -> 0x063a }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x063a }
            r13 = 0
        L_0x04bf:
            if (r13 >= r10) goto L_0x04d8
            java.lang.Object r0 = r9.get(r13)     // Catch:{ all -> 0x063a }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x04d5
            r0 = r22
            android.view.View r0 = X.AnonymousClass000.A0N(r0, r13)     // Catch:{ all -> 0x063a }
            X.C004601z.A0n(r0, r12)     // Catch:{ all -> 0x063a }
            goto L_0x04d8
        L_0x04d5:
            int r13 = r13 + 1
            goto L_0x04bf
        L_0x04d8:
            int r11 = r11 + 1
            goto L_0x04a1
        L_0x04db:
            X.0hD r0 = new X.0hD     // Catch:{ all -> 0x063a }
            r11 = r0
            r12 = r3
            r13 = r22
            r14 = r9
            r15 = r23
            r16 = r5
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x063a }
            X.C06870Yf.A00(r2, r0)     // Catch:{ all -> 0x063a }
            int r2 = r19.size()     // Catch:{ all -> 0x063a }
        L_0x04f2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0500
            r0 = r19
            android.view.View r0 = X.AnonymousClass000.A0N(r0, r2)     // Catch:{ all -> 0x063a }
            r0.setVisibility(r7)     // Catch:{ all -> 0x063a }
            goto L_0x04f2
        L_0x0500:
            r3.A0F(r1, r15, r13)     // Catch:{ all -> 0x063a }
        L_0x0503:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x063a }
            boolean r17 = r4.containsValue(r0)     // Catch:{ all -> 0x063a }
            android.view.ViewGroup r5 = r6.A02     // Catch:{ all -> 0x063a }
            android.content.Context r3 = r5.getContext()     // Catch:{ all -> 0x063a }
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x063a }
            java.util.Iterator r16 = r29.iterator()     // Catch:{ all -> 0x063a }
            r15 = 0
        L_0x0518:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x063a }
            java.lang.String r9 = "FragmentManager"
            r14 = 2
            if (r0 == 0) goto L_0x05a2
            java.lang.Object r12 = r16.next()     // Catch:{ all -> 0x063a }
            X.0Eq r12 = (X.C02740Eq) r12     // Catch:{ all -> 0x063a }
            boolean r0 = r12.A01()     // Catch:{ all -> 0x063a }
            if (r0 != 0) goto L_0x0563
            X.0Tt r0 = r12.A02(r3)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0563
            android.animation.Animator r2 = r0.A00     // Catch:{ all -> 0x063a }
            if (r2 != 0) goto L_0x053b
            r10.add(r12)     // Catch:{ all -> 0x063a }
            goto L_0x0518
        L_0x053b:
            X.0S3 r11 = r12.A01     // Catch:{ all -> 0x063a }
            X.01A r13 = r11.A04     // Catch:{ all -> 0x063a }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x063a }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x063a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0567
            boolean r0 = X.AnonymousClass02C.A02(r14)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0563
            java.lang.String r0 = "Ignoring Animator set on "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x063a }
            r1.append(r13)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " as this Fragment was involved in a Transition."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x063a }
            android.util.Log.v(r9, r0)     // Catch:{ all -> 0x063a }
        L_0x0563:
            r12.A00()     // Catch:{ all -> 0x063a }
            goto L_0x0518
        L_0x0567:
            X.0Kg r1 = r11.A01     // Catch:{ all -> 0x063a }
            X.0Kg r0 = X.C03890Kg.GONE     // Catch:{ all -> 0x063a }
            r24 = 0
            if (r1 != r0) goto L_0x0576
            r24 = 1
            r0 = r27
            r0.remove(r11)     // Catch:{ all -> 0x063a }
        L_0x0576:
            android.view.View r1 = r13.A0A     // Catch:{ all -> 0x063a }
            r5.startViewTransition(r1)     // Catch:{ all -> 0x063a }
            X.09m r0 = new X.09m     // Catch:{ all -> 0x063a }
            r20 = r5
            r21 = r12
            r22 = r6
            r23 = r11
            r18 = r0
            r19 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x063a }
            r2.addListener(r0)     // Catch:{ all -> 0x063a }
            r2.setTarget(r1)     // Catch:{ all -> 0x063a }
            r2.start()     // Catch:{ all -> 0x063a }
            X.024 r1 = r12.A00     // Catch:{ all -> 0x063a }
            com.facebook.redex.IDxCListenerShape96S0200000_I1 r0 = new com.facebook.redex.IDxCListenerShape96S0200000_I1     // Catch:{ all -> 0x063a }
            r0.<init>(r2, r7, r6)     // Catch:{ all -> 0x063a }
            r1.A03(r0)     // Catch:{ all -> 0x063a }
            r15 = 1
            goto L_0x0518
        L_0x05a2:
            java.util.Iterator r12 = r10.iterator()     // Catch:{ all -> 0x063a }
        L_0x05a6:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0619
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x063a }
            X.0Eq r10 = (X.C02740Eq) r10     // Catch:{ all -> 0x063a }
            X.0S3 r11 = r10.A01     // Catch:{ all -> 0x063a }
            X.01A r2 = r11.A04     // Catch:{ all -> 0x063a }
            java.lang.String r1 = "Ignoring Animation set on "
            if (r17 == 0) goto L_0x05d4
            boolean r0 = X.AnonymousClass02C.A02(r14)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x05d0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x063a }
            r1.append(r2)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " as Animations cannot run alongside Transitions."
        L_0x05c9:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x063a }
            android.util.Log.v(r9, r0)     // Catch:{ all -> 0x063a }
        L_0x05d0:
            r10.A00()     // Catch:{ all -> 0x063a }
            goto L_0x05a6
        L_0x05d4:
            if (r15 == 0) goto L_0x05e6
            boolean r0 = X.AnonymousClass02C.A02(r14)     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x05d0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x063a }
            r1.append(r2)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " as Animations cannot run alongside Animators."
            goto L_0x05c9
        L_0x05e6:
            android.view.View r4 = r2.A0A     // Catch:{ all -> 0x063a }
            X.0Tt r0 = r10.A02(r3)     // Catch:{ all -> 0x063a }
            android.view.animation.Animation r2 = r0.A01     // Catch:{ all -> 0x063a }
            X.0Kg r1 = r11.A01     // Catch:{ all -> 0x063a }
            X.0Kg r0 = X.C03890Kg.REMOVED     // Catch:{ all -> 0x063a }
            if (r1 == r0) goto L_0x0605
            r4.startAnimation(r2)     // Catch:{ all -> 0x063a }
            r10.A00()     // Catch:{ all -> 0x063a }
        L_0x05fa:
            X.024 r1 = r10.A00     // Catch:{ all -> 0x063a }
            X.0ax r0 = new X.0ax     // Catch:{ all -> 0x063a }
            r0.<init>(r4, r5, r10, r6)     // Catch:{ all -> 0x063a }
            r1.A03(r0)     // Catch:{ all -> 0x063a }
            goto L_0x05a6
        L_0x0605:
            r5.startViewTransition(r4)     // Catch:{ all -> 0x063a }
            X.0Bz r1 = new X.0Bz     // Catch:{ all -> 0x063a }
            r1.<init>(r4, r5, r2)     // Catch:{ all -> 0x063a }
            X.0Yx r0 = new X.0Yx     // Catch:{ all -> 0x063a }
            r0.<init>(r4, r5, r10, r6)     // Catch:{ all -> 0x063a }
            r1.setAnimationListener(r0)     // Catch:{ all -> 0x063a }
            r4.startAnimation(r1)     // Catch:{ all -> 0x063a }
            goto L_0x05fa
        L_0x0619:
            java.util.Iterator r3 = r27.iterator()     // Catch:{ all -> 0x063a }
        L_0x061d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0633
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x063a }
            X.0S3 r2 = (X.AnonymousClass0S3) r2     // Catch:{ all -> 0x063a }
            X.01A r0 = r2.A04     // Catch:{ all -> 0x063a }
            android.view.View r1 = r0.A0A     // Catch:{ all -> 0x063a }
            X.0Kg r0 = r2.A01     // Catch:{ all -> 0x063a }
            r0.A02(r1)     // Catch:{ all -> 0x063a }
            goto L_0x061d
        L_0x0633:
            r27.clear()     // Catch:{ all -> 0x063a }
            r8.A01 = r7     // Catch:{ all -> 0x063a }
        L_0x0638:
            monitor-exit(r25)     // Catch:{ all -> 0x063a }
            return
        L_0x063a:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x063a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0V5.A02():void");
    }

    public void A03() {
        String str;
        String str2;
        ViewGroup viewGroup = this.A02;
        boolean A0t = C004601z.A0t(viewGroup);
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A05();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0S3) it.next()).A01();
            }
            Iterator it2 = new ArrayList(this.A04).iterator();
            while (it2.hasNext()) {
                AnonymousClass0S3 r4 = (AnonymousClass0S3) it2.next();
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("SpecialEffectsController: ");
                    if (A0t) {
                        str2 = "";
                    } else {
                        StringBuilder A0o2 = AnonymousClass000.A0o();
                        A0o2.append("Container ");
                        A0o2.append(viewGroup);
                        str2 = AnonymousClass000.A0h(" is not attached to window. ", A0o2);
                    }
                    A0o.append(str2);
                    Log.v("FragmentManager", AnonymousClass000.A0e(r4, "Cancelling running operation ", A0o));
                }
                r4.A02();
            }
            Iterator it3 = new ArrayList(arrayList).iterator();
            while (it3.hasNext()) {
                AnonymousClass0S3 r42 = (AnonymousClass0S3) it3.next();
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0o3 = AnonymousClass000.A0o();
                    A0o3.append("SpecialEffectsController: ");
                    if (A0t) {
                        str = "";
                    } else {
                        StringBuilder A0o4 = AnonymousClass000.A0o();
                        A0o4.append("Container ");
                        A0o4.append(viewGroup);
                        str = AnonymousClass000.A0h(" is not attached to window. ", A0o4);
                    }
                    A0o3.append(str);
                    Log.v("FragmentManager", AnonymousClass000.A0e(r42, "Cancelling pending operation ", A0o3));
                }
                r42.A02();
            }
        }
    }

    public void A04() {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A05();
            this.A00 = false;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AnonymousClass0S3 r3 = (AnonymousClass0S3) arrayList.get(size);
                C03890Kg A012 = C03890Kg.A01(r3.A04.A0A);
                C03890Kg r1 = r3.A01;
                C03890Kg r0 = C03890Kg.VISIBLE;
                if (r1 == r0 && A012 != r0) {
                    AnonymousClass0PD r02 = r3.A04.A0C;
                    this.A00 = r02 == null ? false : r02.A0E;
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            AnonymousClass0S3 r2 = (AnonymousClass0S3) it.next();
            if (r2.A00 == C03650Ji.ADDING) {
                r2.A03(C03650Ji.NONE, C03890Kg.A00(r2.A04.A06().getVisibility()));
            }
        }
    }

    public final void A06(AnonymousClass0WQ r7, C03650Ji r8, C03890Kg r9) {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            AnonymousClass024 r5 = new AnonymousClass024();
            AnonymousClass01A r4 = r7.A02;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    AnonymousClass0S3 r2 = new AnonymousClass0S3(r5, r7, r8, r9);
                    arrayList.add(r2);
                    C09830g9 r0 = new C09830g9(r2, this);
                    List list = r2.A07;
                    list.add(r0);
                    list.add(new C09840gA(r2, this));
                    break;
                }
                AnonymousClass0S3 r1 = (AnonymousClass0S3) it.next();
                if (r1.A04.equals(r4) && !r1.A02) {
                    r1.A03(r8, r9);
                    break;
                }
            }
        }
    }
}
