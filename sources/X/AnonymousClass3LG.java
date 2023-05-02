package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;

/* renamed from: X.3LG  reason: invalid class name */
public final class AnonymousClass3LG extends InsetDrawable {
    public int A00;
    public final Drawable A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3LG(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = X.C018208n.A03(r3)
            r0 = 0
            r2.<init>(r1, r0)
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LG.<init>(android.graphics.drawable.Drawable):void");
    }

    public static void A00(Drawable drawable, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        view.setBackground(drawable);
        view.setPadding(paddingLeft, 0, paddingRight, 0);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.A01;
        drawable.setBounds(bounds.left, bounds.top + this.A00, bounds.right, bounds.bottom);
        drawable.draw(canvas);
    }

    public void setTint(int i2) {
        C018208n.A0A(this.A01, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        C018208n.A04(colorStateList, this.A01);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A01;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        C018208n.A07(mode, drawable);
    }
}
