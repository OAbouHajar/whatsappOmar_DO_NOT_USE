package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.39j  reason: invalid class name and case insensitive filesystem */
public abstract class C615539j {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Handler A04;
    public final Vibrator A05;
    public final View A06;
    public final ViewGroup A07;
    public final Runnable A08;
    public final Runnable A09;

    public C615539j(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup) {
        this.A04 = handler;
        this.A07 = viewGroup;
        this.A03 = rectF;
        this.A05 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint A052 = C13700nu.A05();
        Resources resources = this.A01;
        A052.setColor(resources.getColor(A00()));
        A052.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.dimen051b));
        C13690nt.A0y(A052);
        this.A02 = A052;
        C64113Mu r4 = new C64113Mu(viewGroup.getContext(), this);
        r4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r4.setVisibility(4);
        this.A06 = r4;
        viewGroup.addView(r4, 0);
        this.A09 = new C1045055q(r4, 0.0f, 1.0f, 0);
        this.A08 = new C1045055q(r4, 1.0f, 0.0f, 4);
    }

    public int A00() {
        return R.color.color0746;
    }

    public int A01() {
        return 3;
    }

    public Path A02() {
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C604932o r5 = (C604932o) this;
        PointF pointF = r5.A02;
        if (pointF == null || (i2 = r5.A01) == -1) {
            return null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                float f7 = pointF.y - pointF.x;
                RectF rectF = r5.A03;
                float f8 = rectF.left;
                float f9 = f7 + f8;
                float f10 = rectF.top;
                if (f9 >= f10) {
                    f10 = f9;
                } else {
                    f8 = f10 - f7;
                }
                f4 = rectF.right;
                f6 = f7 + f4;
                f5 = rectF.bottom;
                if (f6 > f5) {
                    f4 = f5 - f7;
                }
            } else if (i2 == 2) {
                f2 = pointF.x;
                RectF rectF2 = r5.A03;
                f3 = rectF2.top;
                f5 = rectF2.bottom;
                f4 = f2;
            } else if (i2 != 3) {
                return null;
            } else {
                float f11 = pointF.y + pointF.x;
                RectF rectF3 = r5.A03;
                f2 = rectF3.left;
                float f12 = f11 - f2;
                f3 = rectF3.bottom;
                if (f12 <= f3) {
                    f3 = f12;
                } else {
                    f2 = f11 - f3;
                }
                f4 = rectF3.right;
                f6 = f11 - f4;
                f5 = rectF3.top;
                if (f6 < f5) {
                    f4 = f11 - f5;
                }
            }
            f5 = f6;
        } else {
            RectF rectF4 = r5.A03;
            f2 = rectF4.left;
            f3 = pointF.y;
            f4 = rectF4.right;
            f5 = f3;
        }
        Path A0I = AnonymousClass000.A0I();
        A0I.rewind();
        A0I.moveTo(f2, f3);
        A0I.lineTo(f4, f5);
        return A0I;
    }

    public void A03() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A04() {
        Vibrator vibrator;
        Handler handler = this.A04;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A05) != null) {
            try {
                vibrator.vibrate(3);
            } catch (NullPointerException e2) {
                Log.e("Vibrator is broken on this device.", e2);
            }
        }
        this.A00 = true;
    }
}
