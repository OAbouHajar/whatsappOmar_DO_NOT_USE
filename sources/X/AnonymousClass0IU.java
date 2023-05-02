package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: X.0IU  reason: invalid class name */
public class AnonymousClass0IU extends AnonymousClass0VB {
    public float A00;
    public C06060Ub A01;
    public final float A02;
    public final Paint A03;
    public final Rect A04 = AnonymousClass000.A0J();
    public final RectF A05 = AnonymousClass000.A0K();
    public final RectF A06 = AnonymousClass000.A0K();
    public final Drawable A07;
    public final AnonymousClass0KX A08;

    public AnonymousClass0IU(Drawable drawable, AnonymousClass074 r6, AnonymousClass0KX r7, C06060Ub r8) {
        super(r6);
        Paint paint = new Paint();
        this.A03 = paint;
        this.A01 = r8;
        this.A07 = drawable;
        float f2 = this.A05;
        this.A02 = (48.0f * f2) / 2.0f;
        this.A00 = (float) ((int) (f2 * 8.0f));
        this.A03 = 5;
        this.A02 = 4.0f;
        this.A08 = r7 == null ? AnonymousClass0KX.BOTTOM_RIGHT : r7;
        paint.setColor(-1);
        paint.setAlpha(178);
    }

    public int A00(float f2, float f3) {
        if (this.A05.contains(f2, f3)) {
            return 2;
        }
        return AnonymousClass000.A1O(this.A06.contains(f2, f3) ? 1 : 0) ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        r3 = (((float) (r3.getHeight() - r4.height())) - r5) - ((float) r6.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
        r2 = r7.A05;
        r2.set(r4);
        r2.offsetTo(r1, r3);
        r4.offsetTo((int) r1, (int) r3);
        r5 = r2.centerX();
        r4 = r2.centerY();
        r3 = r7.A06;
        r2 = r7.A02;
        r3.set(r5 - r2, r4 - r2, r5 + r2, r4 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0076, code lost:
        r3 = r3 + ((float) r6.A06);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r7 = this;
            X.074 r6 = r7.A09
            X.09W r3 = r6.A0R
            android.graphics.Rect r4 = r7.A04
            android.graphics.drawable.Drawable r0 = r7.A07
            int r2 = r0.getIntrinsicWidth()
            int r0 = r0.getIntrinsicHeight()
            r1 = 0
            r4.set(r1, r1, r2, r0)
            X.0KX r0 = r7.A08
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0065;
                case 2: goto L_0x007b;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r1 = r3.getWidth()
            int r0 = r4.width()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r5 = r7.A00
            float r1 = r1 - r5
            int r0 = r6.A05
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x002e:
            int r2 = r3.getHeight()
            int r0 = r4.height()
            int r2 = r2 - r0
            float r3 = (float) r2
            float r3 = r3 - r5
            int r0 = r6.A04
            float r0 = (float) r0
            float r3 = r3 - r0
        L_0x003d:
            android.graphics.RectF r2 = r7.A05
            r2.set(r4)
            r2.offsetTo(r1, r3)
            int r1 = (int) r1
            int r0 = (int) r3
            r4.offsetTo(r1, r0)
            float r5 = r2.centerX()
            float r4 = r2.centerY()
            android.graphics.RectF r3 = r7.A06
            float r2 = r7.A02
            float r1 = r5 - r2
            float r0 = r4 - r2
            float r5 = r5 + r2
            float r4 = r4 + r2
            r3.set(r1, r0, r5, r4)
            return
        L_0x0060:
            float r3 = r7.A00
            float r1 = (float) r1
            float r1 = r1 + r3
            goto L_0x0076
        L_0x0065:
            int r1 = r3.getWidth()
            int r0 = r4.width()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r3 = r7.A00
            float r1 = r1 - r3
            int r0 = r6.A05
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x0076:
            int r0 = r6.A06
            float r0 = (float) r0
            float r3 = r3 + r0
            goto L_0x003d
        L_0x007b:
            float r5 = r7.A00
            float r0 = (float) r1
            float r1 = r5 + r0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IU.A03():void");
    }

    public boolean A0B(float f2, float f3) {
        int i2;
        AnonymousClass074 r4 = this.A09;
        AnonymousClass0YG A022 = r4.A02();
        AnonymousClass09W r1 = r4.A0R;
        C06060Ub r3 = this.A01;
        Context context = this.A08;
        int width = r1.getWidth();
        int height = r1.getHeight();
        Resources resources = r4.A0P.getResources();
        String str = C007803p.A04;
        AnonymousClass0Y6 r5 = new AnonymousClass0Y6(r1.A0N.A02);
        r5.A04 = "InfoButtonDrawable.java";
        AnonymousClass020 r11 = A022.A03;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(r11.A00);
        A0o.append(",");
        A0o.append(r11.A01);
        r5.A02 = A0o.toString();
        r5.A0B = String.valueOf((int) A022.A02);
        int i3 = 2;
        if (resources.getDisplayMetrics().density < 1.5f) {
            i3 = 1;
        }
        float f4 = resources.getDisplayMetrics().density;
        if (f4 < 1.5f) {
            i2 = 1;
        } else {
            i2 = 3;
            if (f4 < 2.5f) {
                i2 = 2;
            }
        }
        Uri.Builder buildUpon = AnonymousClass0C8.getStaticMapBaseUrl().buildUpon();
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(width / i3);
        A0o2.append("x");
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("size", AnonymousClass000.A0l(A0o2, height / i3)).appendQueryParameter("scale", String.valueOf(i3)).appendQueryParameter("marker_scale", String.valueOf(i2)).appendQueryParameter("language", str);
        String str2 = r5.A05;
        if (str2 == null) {
            str2 = "jpg";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("format", str2);
        String str3 = r5.A0A;
        if (str3 != null) {
            appendQueryParameter2.appendQueryParameter("visible", str3);
        }
        String str4 = r5.A03;
        if (str4 != null) {
            appendQueryParameter2.appendQueryParameter("circle", str4);
        }
        String str5 = r5.A06;
        if (str5 != null) {
            appendQueryParameter2.appendQueryParameter("markers", str5);
        }
        String str6 = r5.A07;
        if (str6 != null) {
            appendQueryParameter2.appendQueryParameter("path", str6);
        }
        String str7 = r5.A02;
        if (str7 != null) {
            appendQueryParameter2.appendQueryParameter("center", str7);
        }
        String str8 = r5.A0B;
        if (str8 != null) {
            appendQueryParameter2.appendQueryParameter("zoom", str8);
        }
        int size = r5.A0C.size();
        for (int i4 = 0; i4 < size; i4++) {
            StringBuilder A0r = AnonymousClass000.A0r("marker_list[");
            A0r.append(i4);
            String A0h = AnonymousClass000.A0h("]", A0r);
            String A0n = AnonymousClass000.A0n(r5.A0C, i4);
            if (A0n != null) {
                appendQueryParameter2.appendQueryParameter(A0h, A0n);
            }
        }
        String str9 = r5.A09;
        if (str9 != null) {
            appendQueryParameter2.appendQueryParameter("theme", str9);
        }
        String str10 = r5.A04;
        if (str10 == null) {
            str10 = "StaticMapView.java";
        }
        appendQueryParameter2.appendQueryParameter("_nc_client_caller", str10);
        String str11 = r5.A08;
        if (str11 != null) {
            appendQueryParameter2.appendQueryParameter("_nc_client_id", str11);
        }
        r3.A00(context, appendQueryParameter2.build(), r4.A0U.A00);
        return true;
    }

    public void A0D(Canvas canvas) {
        Drawable drawable = this.A07;
        Rect rect = this.A04;
        drawable.setBounds(rect);
        canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), this.A03);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }
}
