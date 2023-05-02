package X;

import android.content.Context;

/* renamed from: X.4cV  reason: invalid class name and case insensitive filesystem */
public final class C89594cV {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r2 = r3.getResources().getDimension(com.obwhatsapp.R.dimen.dimen0895);
        r1 = r3.getResources();
        r0 = com.obwhatsapp.R.dimen.dimen0892;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r1 = r3.getResources();
        r0 = com.obwhatsapp.R.dimen.dimen0894;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r2 = r1.getDimension(r0);
        r1 = r3.getResources();
        r0 = com.obwhatsapp.R.dimen.dimen0895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return new android.graphics.PointF(r2, r1.getDimension(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.PointF A00(android.content.Context r3, X.C801342r r4, X.C800242g r5) {
        /*
            r0 = 0
            X.C18450wi.A0H(r5, r0)
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x001f;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0011:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0052;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r0, r0)
            return r1
        L_0x001f:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0052;
                case 2: goto L_0x005a;
                case 3: goto L_0x005a;
                case 4: goto L_0x002c;
                default: goto L_0x0026;
            }
        L_0x0026:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x002c:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167377(0x7f070891, float:1.7949026E38)
            float r2 = r1.getDimension(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167380(0x7f070894, float:1.7949032E38)
            goto L_0x006c
        L_0x003f:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167381(0x7f070895, float:1.7949034E38)
            float r2 = r1.getDimension(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167378(0x7f070892, float:1.7949028E38)
            goto L_0x006c
        L_0x0052:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167380(0x7f070894, float:1.7949032E38)
            goto L_0x0061
        L_0x005a:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167379(0x7f070893, float:1.794903E38)
        L_0x0061:
            float r2 = r1.getDimension(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167381(0x7f070895, float:1.7949034E38)
        L_0x006c:
            float r0 = r1.getDimension(r0)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89594cV.A00(android.content.Context, X.42r, X.42g):android.graphics.PointF");
    }

    public static final AnonymousClass4QW A01(Context context, C800242g r2) {
        float f2 = A02(r2).A00(context).A01;
        switch (r2.ordinal()) {
            case 0:
                return new C79383zp(f2);
            case 1:
            case 2:
                return new C79413zs(f2);
            case 3:
                return new C79403zr(f2);
            case 4:
                return new C79393zq(f2);
            default:
                throw new AnonymousClass2Xe();
        }
    }

    public static final C801842w A02(C800242g r0) {
        switch (r0.ordinal()) {
            case 0:
                return C801842w.EXTRA_SMALL;
            case 1:
                return C801842w.SMALL;
            case 2:
                return C801842w.MEDIUM;
            case 3:
                return C801842w.LARGE;
            case 4:
                return C801842w.EXTRA_LARGE;
            default:
                throw new AnonymousClass2Xe();
        }
    }
}
