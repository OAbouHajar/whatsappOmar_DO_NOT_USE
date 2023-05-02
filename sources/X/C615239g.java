package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.39g  reason: invalid class name and case insensitive filesystem */
public class C615239g {
    public Typeface A00;
    public boolean A01 = false;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ColorStateList A09;
    public final ColorStateList A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final String A0D;

    public C615239g(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C53362fa.A0F);
        this.A05 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A0A = C53402fe.A00(context, obtainStyledAttributes, 3);
        this.A0B = C53402fe.A00(context, obtainStyledAttributes, 4);
        this.A0C = C53402fe.A00(context, obtainStyledAttributes, 5);
        this.A07 = obtainStyledAttributes.getInt(2, 0);
        this.A08 = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.A06 = obtainStyledAttributes.getResourceId(i3, 0);
        this.A0D = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.A09 = C53402fe.A00(context, obtainStyledAttributes, 6);
        this.A02 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A03 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A04 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void A00() {
        if (this.A00 == null) {
            String str = this.A0D;
            int i2 = this.A07;
            Typeface create = Typeface.create(str, i2);
            this.A00 = create;
            if (create == null) {
                int i3 = this.A08;
                Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
                this.A00 = typeface;
                if (typeface != null) {
                    this.A00 = Typeface.create(typeface, i2);
                }
            }
        }
    }

    public void A01(Context context, TextPaint textPaint, C017508g r9) {
        A02(context, textPaint, r9);
        ColorStateList colorStateList = this.A0A;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.A04;
        float f3 = this.A02;
        float f4 = this.A03;
        ColorStateList colorStateList2 = this.A09;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r8, android.text.TextPaint r9, X.C017508g r10) {
        /*
            r7 = this;
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0011
            r7.A00()
            r1 = r8
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            r7.A01 = r0
        L_0x0011:
            android.graphics.Typeface r0 = r7.A00
            r7.A03(r0, r9)
        L_0x0016:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x001f
            android.graphics.Typeface r0 = r7.A00
            r7.A03(r0, r9)
        L_0x001f:
            return
        L_0x0020:
            int r4 = r7.A06     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            X.3P2 r3 = new X.3P2     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            r3.<init>(r9, r10, r7)     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            boolean r0 = r8.isRestricted()     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            if (r0 == 0) goto L_0x0032
            r0 = -4
            r3.A00(r0)     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            goto L_0x0016
        L_0x0032:
            android.util.TypedValue r2 = new android.util.TypedValue     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            r2.<init>()     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            r5 = 0
            r6 = 0
            X.AnonymousClass00X.A03(r1, r2, r3, r4, r5, r6)     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0016, Exception -> 0x003d }
            goto L_0x0016
        L_0x003d:
            r2 = move-exception
            java.lang.String r0 = "Error loading font "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.A0D
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "TextAppearance"
            android.util.Log.d(r0, r1, r2)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615239g.A02(android.content.Context, android.text.TextPaint, X.08g):void");
    }

    public void A03(Typeface typeface, TextPaint textPaint) {
        int style = (typeface.getStyle() ^ -1) & this.A07;
        textPaint.setFakeBoldText(AnonymousClass000.A1O(style & 1));
        float f2 = 0.0f;
        if ((style & 2) != 0) {
            f2 = -0.25f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.A05);
    }
}
