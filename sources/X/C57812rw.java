package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.redex.IDxLListenerShape369S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.2rw  reason: invalid class name and case insensitive filesystem */
public class C57812rw extends AnonymousClass0IT {
    public static Bitmap A07;
    public boolean A00;
    public final Context A01;
    public final Rect A02 = AnonymousClass000.A0J();
    public final RectF A03;
    public final C50302Yu A04;
    public final C56332nT A05;
    public final AnonymousClass1US A06;

    public C57812rw(AnonymousClass074 r6, C50302Yu r7, AnonymousClass1US r8) {
        super(r6);
        Context context = r6.A0P;
        this.A01 = context;
        this.A03 = AnonymousClass000.A0K();
        this.A06 = r8;
        this.A04 = r7;
        this.A00 = C06540Wn.A01(r8.A09.doubleValue());
        this.A01 = C06540Wn.A00(r8.A08.doubleValue());
        int A002 = C87594Xo.A00(context, 30.0f);
        Bitmap bitmap = A07;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact);
            A07 = bitmap;
        }
        C56332nT r1 = new C56332nT(context, bitmap, A002);
        this.A05 = r1;
        r1.A04(r1.A0G);
        r1.A0B = false;
        r1.A03();
        String str = this.A06.A0C;
        if (str != null) {
            this.A04.A00(new IDxLListenerShape369S0100000_2_I1(this, 2), str, C87594Xo.A00(this.A01, 30.0f));
        }
    }

    public int A00(float f2, float f3) {
        return this.A03.contains(f2, f3) ? 1 : 0;
    }

    public void A05() {
        this.A00 = true;
    }

    public void A0D(Canvas canvas) {
        C06540Wn r11 = this.A0A;
        double d2 = this.A00;
        double d3 = this.A01;
        float[] fArr = this.A0C;
        r11.A08(fArr, d2, d3);
        float f2 = fArr[0];
        float f3 = fArr[1];
        C56332nT r6 = this.A05;
        Rect bounds = r6.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Rect rect = this.A02;
        float f4 = (float) (height >> 1);
        rect.set(Math.round(f2 - r6.A01()), Math.round(f3 - f4), Math.round(f2 + (((float) width) - r6.A01())), Math.round(f3 + f4));
        r11.A08(fArr, this.A00, this.A01);
        float width2 = (float) rect.width();
        float height2 = (float) rect.height();
        float f5 = (float) rect.left;
        float f6 = (float) rect.top;
        this.A03.set(f5, f6, width2 + f5, height2 + f6);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f5, f6);
        r6.draw(canvas2);
        canvas2.restore();
    }
}
