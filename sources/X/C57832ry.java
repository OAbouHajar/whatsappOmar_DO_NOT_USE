package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.2ry  reason: invalid class name and case insensitive filesystem */
public class C57832ry extends AnonymousClass0IT {
    public View.OnClickListener A00;
    public final Rect A01 = AnonymousClass000.A0J();
    public final RectF A02;
    public final C56332nT A03;
    public final C93714je A04;

    public C57832ry(Bitmap bitmap, AnonymousClass074 r6, C93714je r7) {
        super(r6);
        float f2;
        Context context = r6.A0P;
        this.A02 = AnonymousClass000.A0K();
        this.A04 = r7;
        AnonymousClass1US r3 = r7.A03;
        if (r3 != null) {
            this.A00 = C06540Wn.A01(r3.A09.doubleValue());
            this.A01 = C06540Wn.A00(r3.A08.doubleValue());
        }
        if (r7.A01) {
            C18450wi.A0H(context, 0);
            f2 = 120.0f;
        } else {
            C18450wi.A0H(context, 0);
            f2 = 54.0f;
        }
        C56332nT r1 = new C56332nT(context, bitmap, C87594Xo.A00(context, f2));
        this.A03 = r1;
        r1.A0A = !r7.A01;
        r1.A04(r1.A0G);
    }

    public int A00(float f2, float f3) {
        return this.A02.contains(f2, f3) ? 1 : 0;
    }

    public boolean A0B(float f2, float f3) {
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick((View) null);
        return true;
    }

    public void A0D(Canvas canvas) {
        C06540Wn r9 = this.A0A;
        double d2 = this.A00;
        double d3 = this.A01;
        float[] fArr = this.A0C;
        r9.A08(fArr, d2, d3);
        float f2 = fArr[0];
        float f3 = fArr[1];
        C56332nT r5 = this.A03;
        Rect bounds = r5.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Rect rect = this.A01;
        rect.set(Math.round(f2 - r5.A01()), Math.round(f3 - ((float) height)), Math.round(f2 + (((float) width) - r5.A01())), Math.round(f3));
        r9.A08(fArr, this.A00, this.A01);
        float width2 = (float) rect.width();
        float height2 = (float) rect.height();
        float f4 = (float) rect.left;
        float f5 = (float) rect.top;
        this.A02.set(f4, f5, (width2 + f4) - r5.A02(), height2 + f5);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f4, f5);
        r5.draw(canvas2);
        canvas2.restore();
    }

    public void A0E() {
        AnonymousClass1US r0 = this.A04.A03;
        if (r0 != null) {
            this.A03.A09 = r0.A0E;
        }
        C56332nT r2 = this.A03;
        r2.A0A = true;
        Context context = this.A09.A0P;
        C18450wi.A0H(context, 0);
        r2.A04 = C87594Xo.A00(context, 54.0f);
        r2.A03();
        A02();
    }
}
