package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import com.facebook.redex.IDxBCreatorShape47S0000000_I1;
import com.obwhatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0Wt  reason: invalid class name */
public final class AnonymousClass0Wt {
    public static float A00 = 1.0f;
    public static long A01;
    public static Context A02;
    public static final float A03 = (((float) Math.sqrt(3.0d)) / 2.0f);
    public static final HashMap A04 = new HashMap(16);

    public static C04660Nk A00() {
        StringBuilder A0r = AnonymousClass000.A0r("hue_");
        A0r.append(240.0f);
        return A02(new IDxBCreatorShape47S0000000_I1(0), A0r.toString());
    }

    public static C04660Nk A01(Bitmap bitmap) {
        return new C04660Nk(bitmap.copy(bitmap.getConfig(), false));
    }

    public static C04660Nk A02(C12840l3 r13, String str) {
        C04660Nk r3;
        Bitmap createBitmap;
        HashMap hashMap = A04;
        Reference reference = (Reference) hashMap.get(str);
        if (reference == null || (r3 = (C04660Nk) reference.get()) == null) {
            if (((IDxBCreatorShape47S0000000_I1) r13).A00 != 0) {
                createBitmap = BitmapFactory.decodeResource(A02.getResources(), R.drawable.ic_map_pin);
            } else {
                Paint paint = new Paint(1);
                float f2 = A00 * 10.0f;
                int round = Math.round(2.0f * f2);
                int round2 = Math.round(3.0f * f2);
                createBitmap = Bitmap.createBitmap(round + 10, round2 + 10, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                float[] fArr = {240.0f, 1.0f, 1.0f};
                int HSVToColor = Color.HSVToColor(fArr);
                fArr[2] = 0.8f;
                int HSVToColor2 = Color.HSVToColor(fArr);
                fArr[2] = 0.5f;
                int HSVToColor3 = Color.HSVToColor(fArr);
                paint.setColor(HSVToColor);
                float f3 = 5.0f + f2;
                float f4 = (float) (round2 + 5);
                A03(canvas, paint, f3, f4, f2);
                paint.setColor(HSVToColor3);
                canvas.drawCircle(f3, f3, f2 / 2.5f, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(A00);
                paint.setColor(HSVToColor2);
                A03(canvas, paint, f3, f4, f2);
            }
            if (createBitmap == null) {
                return null;
            }
            r3 = new C04660Nk(createBitmap);
            hashMap.put(str, new WeakReference(r3));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = A01;
        if (j2 >= 600000 || j2 == 0) {
            A01 = uptimeMillis;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Reference) AnonymousClass000.A0z(it).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        return r3;
    }

    public static void A03(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        Path A0I = AnonymousClass000.A0I();
        float f5 = 2.0f * f4;
        float f6 = f3 - f5;
        A0I.moveTo(f2, f6);
        A0I.arcTo(new RectF(f2 - f4, f6 - f4, f2 + f4, f6 + f4), 30.0f, -240.0f, true);
        A0I.lineTo(f2, f5 + f6);
        AnonymousClass000.A11(canvas, paint, A0I, f2 + (A03 * f4), f6 + (f4 * 0.5f));
    }
}
