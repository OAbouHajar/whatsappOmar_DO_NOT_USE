package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.redex.IDxLListenerShape369S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2rx  reason: invalid class name and case insensitive filesystem */
public class C57822rx extends AnonymousClass0IT {
    public static Bitmap A0E;
    public static Bitmap A0F;
    public Bitmap A00;
    public Bitmap A01;
    public View.OnClickListener A02;
    public C109245Rg A03 = new IDxLListenerShape369S0100000_2_I1(this, 1);
    public final Context A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final Rect A08 = AnonymousClass000.A0J();
    public final RectF A09;
    public final C50302Yu A0A;
    public final C56332nT A0B;
    public final C93714je A0C;
    public final AnonymousClass1US A0D;

    public C57822rx(AnonymousClass074 r7, C50302Yu r8, C93714je r9, AnonymousClass1US r10) {
        super(r7);
        this.A0C = r9;
        this.A09 = AnonymousClass000.A0K();
        this.A07 = C13700nu.A05();
        this.A0D = r10;
        Context context = r7.A0P;
        this.A04 = context;
        this.A0A = r8;
        this.A06 = C13700nu.A06(1);
        this.A05 = C13700nu.A06(1);
        this.A01 = C06540Wn.A00(r10.A08.doubleValue());
        this.A00 = C06540Wn.A01(r10.A09.doubleValue());
        C18450wi.A0H(context, 0);
        int A002 = C87594Xo.A00(context, 120.0f);
        Bitmap bitmap = A0E;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact);
            A0E = bitmap;
        }
        C56332nT r1 = new C56332nT(context, bitmap, A002);
        this.A0B = r1;
        r1.A0A = false;
        r1.A04(r1.A0G);
        r1.A03();
        Paint paint = this.A06;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A05;
        C13690nt.A0y(paint2);
        Context context2 = this.A04;
        paint2.setColor(context2.getResources().getColor(R.color.color0099));
        paint2.setStrokeWidth((float) C87594Xo.A00(context2, 1.0f));
        this.A07.setStyle(Paint.Style.FILL_AND_STROKE);
        List list = this.A0D.A0I;
        paint.setColor(context2.getResources().getColor(C52602e7.A00(list.isEmpty() ? "" : ((C93414j9) C13690nt.A0Z(list)).A02)));
        this.A0A.A00(new IDxLListenerShape369S0100000_2_I1(this, 0), this.A0D.A02(), C87594Xo.A00(this.A04, 24.0f));
    }

    public int A00(float f2, float f3) {
        return this.A09.contains(f2, f3) ? 1 : 0;
    }

    public boolean A0B(float f2, float f3) {
        View.OnClickListener onClickListener = this.A02;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick((View) null);
        return true;
    }

    public void A0D(Canvas canvas) {
        Rect rect;
        int round;
        int round2;
        int round3;
        String str;
        C06540Wn r11 = this.A0A;
        double d2 = this.A00;
        double d3 = this.A01;
        float[] fArr = this.A0C;
        r11.A08(fArr, d2, d3);
        float f2 = fArr[0];
        float f3 = fArr[1];
        C93714je r4 = this.A0C;
        if (r4.A01) {
            C56332nT r8 = this.A0B;
            Rect bounds = r8.getBounds();
            int width = bounds.width();
            int height = bounds.height();
            rect = this.A08;
            round = Math.round(f2 - r8.A01());
            round2 = Math.round(f3 - ((float) height));
            round3 = Math.round(f2 + (((float) width) - r8.A01()));
        } else {
            rect = this.A08;
            float A002 = (float) (C87594Xo.A00(this.A04, 24.0f) >> 1);
            round = Math.round(f2 - A002);
            round2 = Math.round(f3 - A002);
            round3 = Math.round(f2 + A002);
            f3 += A002;
        }
        rect.set(round, round2, round3, Math.round(f3));
        r11.A08(fArr, this.A00, this.A01);
        Canvas canvas2 = canvas;
        if (r4.A01) {
            int i2 = rect.left;
            int i3 = rect.top;
            float width2 = (float) rect.width();
            float height2 = (float) rect.height();
            RectF rectF = this.A09;
            float f4 = (float) i2;
            float f5 = (float) i3;
            C56332nT r6 = this.A0B;
            rectF.set(f4, f5, (width2 + f4) - r6.A02(), height2 + f5);
            canvas2.save();
            canvas2.translate(f4, f5);
            if (this.A00 == null && (str = this.A0D.A0C) != null) {
                this.A00 = C43201zV.A07;
                C50302Yu r3 = this.A0A;
                Context context = this.A04;
                C18450wi.A0H(context, 0);
                r3.A00(this.A03, str, C87594Xo.A00(context, 120.0f));
            }
            r6.draw(canvas2);
        } else {
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            float f6 = (float) centerX;
            float width3 = ((float) rect.width()) / 2.0f;
            float f7 = (float) centerY;
            float height3 = ((float) rect.height()) / 2.0f;
            this.A09.set(f6 - width3, f7 - height3, width3 + f6, height3 + f7);
            canvas2.save();
            canvas2.translate(f6, f7);
            Context context2 = this.A04;
            int A003 = C87594Xo.A00(context2, 24.0f) >> 1;
            int A004 = C87594Xo.A00(context2, 6.0f);
            int A005 = C87594Xo.A00(context2, 1.0f);
            canvas2.drawCircle(0.0f, 0.0f, (float) A003, this.A06);
            canvas2.drawCircle(0.0f, 0.0f, (float) (A003 - A005), this.A05);
            if (this.A01 != null) {
                RectF A0K = AnonymousClass000.A0K();
                float f8 = (float) (A003 - A004);
                A0K.left -= f8;
                A0K.right = f8;
                A0K.top -= f8;
                A0K.bottom = f8;
                canvas2.drawBitmap(this.A01, (Rect) null, A0K, this.A07);
            }
        }
        canvas2.restore();
    }
}
