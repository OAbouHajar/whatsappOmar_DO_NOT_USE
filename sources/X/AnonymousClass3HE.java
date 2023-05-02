package X;

import android.view.View;

/* renamed from: X.3HE  reason: invalid class name */
public class AnonymousClass3HE implements AnonymousClass25V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2DL A01;

    public AnonymousClass3HE(AnonymousClass2DL r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public int AG6() {
        return (int) (((float) this.A00) * C13680ns.A01(this.A01));
    }

    public /* synthetic */ void ARJ() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        if (r1 != 29) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AfV(android.graphics.Bitmap r7, android.view.View r8, X.C16740tZ r9) {
        /*
            r6 = this;
            r3 = r8
            X.2zq r3 = (X.C60032zq) r3
            if (r7 != 0) goto L_0x00a2
            r2 = 0
            r3.A02 = r2
            byte r1 = r9.A10
            r5 = 1
            if (r1 == r5) goto L_0x0083
            r0 = 2
            if (r1 == r0) goto L_0x0049
            r0 = 3
            if (r1 == r0) goto L_0x0045
            r0 = 9
            if (r1 == r0) goto L_0x0093
            r0 = 13
            if (r1 == r0) goto L_0x0045
            r0 = 23
            if (r1 == r0) goto L_0x0083
            r0 = 25
            if (r1 == r0) goto L_0x0083
            r0 = 26
            if (r1 == r0) goto L_0x0093
            r0 = 28
            if (r1 == r0) goto L_0x0045
            r0 = 29
            if (r1 == r0) goto L_0x0045
        L_0x002f:
            r3.setImageResource(r2)
        L_0x0032:
            X.2DL r0 = r6.A01
            java.util.HashSet r2 = r0.A0R
            X.1Vw r1 = r9.A11
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0044
            r2.add(r1)
            X.C13680ns.A11(r8)
        L_0x0044:
            return
        L_0x0045:
            r2 = 2131232139(0x7f08058b, float:1.8080379E38)
            goto L_0x002f
        L_0x0049:
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r0]
            android.content.Context r1 = r8.getContext()
            r0 = 2131101049(0x7f060579, float:1.7814497E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4[r2] = r0
            android.content.Context r1 = r8.getContext()
            r0 = 2131231346(0x7f080272, float:1.807877E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00T.A04(r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131167190(0x7f0707d6, float:1.7948647E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r0.<init>(r2, r1)
            r4[r5] = r0
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r4)
            r3.setImageDrawable(r0)
            goto L_0x0032
        L_0x0083:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r3.setScaleType(r0)
            X.2DL r0 = r6.A01
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A05(r0, r3, r8)
            goto L_0x009e
        L_0x0093:
            android.content.Context r1 = r8.getContext()
            r0 = r9
            X.1rA r0 = (X.C38631rA) r0
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Y6.A00(r1, r0)
        L_0x009e:
            r3.setImageDrawable(r0)
            goto L_0x0032
        L_0x00a2:
            r3.setImageBitmap(r7)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HE.AfV(android.graphics.Bitmap, android.view.View, X.0tZ):void");
    }

    public /* synthetic */ void Afm(View view) {
    }
}
