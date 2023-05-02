package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.0UF  reason: invalid class name */
public class AnonymousClass0UF {
    public Paint A00;
    public Paint A01;
    public AnonymousClass0UX A02;
    public AnonymousClass0UX A03;
    public AnonymousClass0f0 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final /* synthetic */ AnonymousClass0XJ A08;

    public AnonymousClass0UF(AnonymousClass0UF r4, AnonymousClass0XJ r5) {
        this.A08 = r5;
        this.A05 = r4.A05;
        this.A06 = r4.A06;
        this.A00 = new Paint(r4.A00);
        this.A01 = new Paint(r4.A01);
        AnonymousClass0UX r1 = r4.A03;
        if (r1 != null) {
            this.A03 = new AnonymousClass0UX(r1);
        }
        AnonymousClass0UX r12 = r4.A02;
        if (r12 != null) {
            this.A02 = new AnonymousClass0UX(r12);
        }
        this.A07 = r4.A07;
        try {
            this.A04 = (AnonymousClass0f0) r4.A04.clone();
        } catch (CloneNotSupportedException e2) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e2);
            this.A04 = AnonymousClass0f0.A00();
        }
    }

    public AnonymousClass0UF(AnonymousClass0XJ r5) {
        this.A08 = r5;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setFlags(385);
        this.A00.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        Paint paint3 = new Paint();
        this.A01 = paint3;
        paint3.setFlags(385);
        this.A01.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.A01;
        this.A04 = AnonymousClass0f0.A00();
    }
}
