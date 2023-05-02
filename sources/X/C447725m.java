package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.25m  reason: invalid class name and case insensitive filesystem */
public class C447725m extends C447825n {
    public boolean A00 = true;
    public final AnonymousClass013 A01;

    public C447725m(Drawable drawable, AnonymousClass013 r3) {
        super(drawable, r3.A0T());
        this.A01 = r3;
    }

    public static C447725m A00(Context context, AnonymousClass013 r2, int i2) {
        return new C447725m(AnonymousClass00T.A04(context, i2), r2);
    }

    public static void A01(Context context, ImageView imageView, AnonymousClass013 r3, int i2) {
        imageView.setImageDrawable(new C447725m(AnonymousClass00T.A04(context, i2), r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A01.A0T() == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r3) {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            X.013 r0 = r2.A01
            boolean r0 = r0.A0T()
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            r2.A00 = r1
            r2.invalidateSelf()
        L_0x0017:
            super.draw(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447725m.draw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A01.A0T() == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getPadding(android.graphics.Rect r3) {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            X.013 r0 = r2.A01
            boolean r0 = r0.A0T()
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            r2.A00 = r1
            r2.invalidateSelf()
        L_0x0017:
            boolean r0 = super.getPadding(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447725m.getPadding(android.graphics.Rect):boolean");
    }
}
