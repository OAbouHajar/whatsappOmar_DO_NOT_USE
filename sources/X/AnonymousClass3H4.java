package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.3H4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3H4 implements AnonymousClass5QP {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C26171Mp A01;
    public final /* synthetic */ AnonymousClass3H7 A02;

    public /* synthetic */ AnonymousClass3H4(Resources resources, C26171Mp r2, AnonymousClass3H7 r3) {
        this.A01 = r2;
        this.A00 = resources;
        this.A02 = r3;
    }

    public final void AXl(Drawable drawable) {
        C26171Mp r8 = this.A01;
        Resources resources = this.A00;
        AnonymousClass3H7 r7 = this.A02;
        if (drawable instanceof C436020t) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getBounds().width(), drawable.getBounds().height(), Bitmap.Config.ARGB_8888);
                if (createBitmap != null) {
                    C436020t r11 = (C436020t) drawable;
                    new Canvas(createBitmap).drawBitmap(r11.A07.A09, (Rect) null, r11.getBounds(), r11.A06);
                    AnonymousClass3Q4 r1 = r8.A04;
                    AnonymousClass00B.A06(r1);
                    r1.A05(new BitmapDrawable(resources, createBitmap), 0);
                }
            } catch (OutOfMemoryError unused) {
            }
            AnonymousClass3Q4 r2 = r8.A04;
            AnonymousClass00B.A06(r2);
            r2.A05((Drawable) null, 3);
            return;
        }
        AnonymousClass3Q4 r0 = r8.A04;
        AnonymousClass00B.A06(r0);
        r0.A05(drawable, 0);
        r7.A04(false);
        r8.A02.A06();
    }
}
