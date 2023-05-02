package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.07T  reason: invalid class name */
public class AnonymousClass07T {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public AnonymousClass07T(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static AnonymousClass07T A00(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new AnonymousClass07T(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = X.AnonymousClass08E.A00(r3.A01, (r1 = r2.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList A01(int r4) {
        /*
            r3 = this;
            android.content.res.TypedArray r2 = r3.A02
            boolean r0 = r2.hasValue(r4)
            if (r0 == 0) goto L_0x0018
            r0 = 0
            int r1 = r2.getResourceId(r4, r0)
            if (r1 == 0) goto L_0x0018
            android.content.Context r0 = r3.A01
            android.content.res.ColorStateList r0 = X.AnonymousClass08E.A00(r0, r1)
            if (r0 == 0) goto L_0x0018
            return r0
        L_0x0018:
            android.content.res.ColorStateList r0 = r2.getColorStateList(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07T.A01(int):android.content.res.ColorStateList");
    }

    public Drawable A02(int i2) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return typedArray.getDrawable(i2);
        }
        return AnonymousClass06L.A02().A05(this.A01, resourceId);
    }

    public Drawable A03(int i2) {
        int resourceId;
        Drawable A06;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        AnonymousClass06K A012 = AnonymousClass06K.A01();
        Context context = this.A01;
        synchronized (A012) {
            A06 = A012.A00.A06(context, resourceId, true);
        }
        return A06;
    }

    public void A04() {
        this.A02.recycle();
    }
}
