package X;

/* renamed from: X.0Eq  reason: invalid class name and case insensitive filesystem */
public class C02740Eq extends AnonymousClass0QI {
    public C05980Tt A00;
    public boolean A01;
    public boolean A02 = false;

    public C02740Eq(AnonymousClass024 r2, AnonymousClass0S3 r3, boolean z2) {
        super(r2, r3);
        this.A01 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092 A[SYNTHETIC, Splitter:B:46:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05980Tt A02(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0007
            X.0Tt r4 = r8.A00
            return r4
        L_0x0007:
            X.0S3 r0 = r8.A01
            X.01A r7 = r0.A04
            X.0Kg r1 = r0.A01
            X.0Kg r0 = X.C03890Kg.VISIBLE
            r3 = 1
            boolean r6 = X.AnonymousClass000.A1Y(r1, r0)
            boolean r1 = r8.A01
            X.0PD r0 = r7.A0C
            if (r0 != 0) goto L_0x00c5
            r2 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x00b4
            if (r6 == 0) goto L_0x00ae
            if (r0 == 0) goto L_0x00c2
            int r5 = r0.A04
        L_0x0023:
            r0 = 0
            r7.A0N(r0, r0, r0, r0)
            android.view.ViewGroup r0 = r7.A0B
            r4 = 0
            if (r0 == 0) goto L_0x003a
            r1 = 2131366978(0x7f0a1442, float:1.8353865E38)
            java.lang.Object r0 = r0.getTag(r1)
            if (r0 == 0) goto L_0x003a
            android.view.ViewGroup r0 = r7.A0B
            r0.setTag(r1, r4)
        L_0x003a:
            android.view.ViewGroup r0 = r7.A0B
            if (r0 == 0) goto L_0x0049
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0049
        L_0x0044:
            r8.A00 = r4
            r8.A02 = r3
            return r4
        L_0x0049:
            if (r5 != 0) goto L_0x005a
            if (r2 == 0) goto L_0x0044
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 == r0) goto L_0x007d
            r0 = 4099(0x1003, float:5.744E-42)
            if (r2 == r0) goto L_0x0074
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r0) goto L_0x006b
            r5 = -1
        L_0x005a:
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r5)
            java.lang.String r0 = "anim"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L_0x0092
            goto L_0x0086
        L_0x006b:
            r5 = 2130837508(0x7f020004, float:1.7279972E38)
            if (r6 == 0) goto L_0x005a
            r5 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x005a
        L_0x0074:
            r5 = 2130837510(0x7f020006, float:1.7279976E38)
            if (r6 == 0) goto L_0x005a
            r5 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x005a
        L_0x007d:
            r5 = 2130837512(0x7f020008, float:1.727998E38)
            if (r6 == 0) goto L_0x005a
            r5 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x005a
        L_0x0086:
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)     // Catch:{ NotFoundException -> 0x00c9, RuntimeException -> 0x0092 }
            if (r0 == 0) goto L_0x0044
            X.0Tt r1 = new X.0Tt     // Catch:{ NotFoundException -> 0x00c9, RuntimeException -> 0x0092 }
            r1.<init>((android.view.animation.Animation) r0)     // Catch:{ NotFoundException -> 0x00c9, RuntimeException -> 0x0092 }
            goto L_0x009d
        L_0x0092:
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r9, r5)     // Catch:{ RuntimeException -> 0x009f }
            if (r0 == 0) goto L_0x0044
            X.0Tt r1 = new X.0Tt     // Catch:{ RuntimeException -> 0x009f }
            r1.<init>((android.animation.Animator) r0)     // Catch:{ RuntimeException -> 0x009f }
        L_0x009d:
            r4 = r1
            goto L_0x0044
        L_0x009f:
            r0 = move-exception
            if (r2 != 0) goto L_0x00cb
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)
            if (r0 == 0) goto L_0x0044
            X.0Tt r4 = new X.0Tt
            r4.<init>((android.view.animation.Animation) r0)
            goto L_0x0044
        L_0x00ae:
            if (r0 == 0) goto L_0x00c2
            int r5 = r0.A05
            goto L_0x0023
        L_0x00b4:
            if (r6 == 0) goto L_0x00bc
            if (r0 == 0) goto L_0x00c2
            int r5 = r0.A01
            goto L_0x0023
        L_0x00bc:
            if (r0 == 0) goto L_0x00c2
            int r5 = r0.A02
            goto L_0x0023
        L_0x00c2:
            r5 = 0
            goto L_0x0023
        L_0x00c5:
            int r2 = r0.A03
            goto L_0x001b
        L_0x00c9:
            r0 = move-exception
            throw r0
        L_0x00cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02740Eq.A02(android.content.Context):X.0Tt");
    }
}
