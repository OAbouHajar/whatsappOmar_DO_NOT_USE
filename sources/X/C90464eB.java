package X;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: X.4eB  reason: invalid class name and case insensitive filesystem */
public final class C90464eB {
    public static final C90464eB A06 = new C90464eB((Typeface) null, -1, -16777216, 0, 0, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Typeface A05;

    public C90464eB(Typeface typeface, int i2, int i3, int i4, int i5, int i6) {
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A01 = i6;
        this.A05 = typeface;
    }

    public static C90464eB A00(CaptioningManager.CaptionStyle captionStyle) {
        if (AnonymousClass3C1.A01 >= 21) {
            return A01(captionStyle);
        }
        return new C90464eB(captionStyle.getTypeface(), captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor);
    }

    public static C90464eB A01(CaptioningManager.CaptionStyle captionStyle) {
        return new C90464eB(captionStyle.getTypeface(), captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : -1, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : -16777216, captionStyle.hasWindowColor() ? captionStyle.windowColor : 0, captionStyle.hasEdgeType() ? captionStyle.edgeType : 0, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : -1);
    }
}
