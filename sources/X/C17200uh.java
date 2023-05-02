package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.util.List;

/* renamed from: X.0uh  reason: invalid class name and case insensitive filesystem */
public class C17200uh {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C17160ud A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final AnonymousClass120 A05;
    public final AnonymousClass152 A06;
    public final C16980tz A07;
    public final AnonymousClass013 A08;
    public final C15810rt A09;
    public final C218115n A0A;
    public final C17240ul A0B;

    public C17200uh(C14870pt r1, C16040sK r2, C17160ud r3, C16000sG r4, C16080sP r5, AnonymousClass120 r6, AnonymousClass152 r7, C16980tz r8, AnonymousClass013 r9, C15810rt r10, C218115n r11, C17240ul r12) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A09 = r10;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
        this.A06 = r7;
    }

    public static Bitmap A00(Bitmap bitmap, float f2, int i2) {
        int i3 = i2;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f3 = (float) i3;
        RectF rectF = new RectF(0.0f, 0.0f, f3, f3);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        if (f2 == 0.0f) {
            canvas.drawRect(rectF, paint);
        } else if (f2 > 0.0f) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        } else if (f2 == -2.14748365E9f) {
            canvas.drawPath(C37741pe.A03(rectF), paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF rectF2 = new RectF(0.0f, 0.0f, f3, f3);
        int width = (bitmap.getWidth() - bitmap.getHeight()) >> 1;
        canvas.drawBitmap(bitmap, width > 0 ? new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight()) : new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width), rectF2, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap A01(List list, float f2) {
        Rect rect;
        RectF rectF;
        int i2;
        List<Bitmap> list2 = list;
        boolean z2 = false;
        if (list2.size() > 1) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Insufficient number of bitmaps to combine", z2);
        if (list2.size() == 1) {
            return (Bitmap) list2.get(0);
        }
        int i3 = 0;
        int i4 = 0;
        for (Bitmap bitmap : list2) {
            if (i3 < bitmap.getWidth()) {
                i3 = bitmap.getWidth();
            }
            if (i4 < bitmap.getHeight()) {
                i4 = bitmap.getHeight();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f3 = (float) i3;
        float f4 = (float) i4;
        RectF rectF2 = new RectF(0.0f, 0.0f, f3, f4);
        Paint paint = new Paint();
        paint.setColor(-1);
        float f5 = f2;
        if (f2 != 0.0f) {
            if (f2 > 0.0f) {
                canvas.drawRoundRect(rectF2, f5, f5, paint);
            } else {
                canvas.drawArc(rectF2, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        if (list2.size() == 2) {
            Rect rect2 = new Rect(((int) (((double) i3) * 0.25d)) + 1, 0, ((int) (0.75f * f3)) - 1, i4);
            float f6 = 0.5f * f3;
            canvas.drawBitmap((Bitmap) list2.get(0), rect2, new RectF(0.0f, 0.0f, f6 - 2.0f, f4), paint);
            canvas.drawBitmap((Bitmap) list2.get(1), rect2, new RectF(f6 + 2.0f, 0.0f, f3, f4), paint);
        } else {
            if (list2.size() == 3) {
                int i5 = ((int) (((double) i3) * 0.25d)) + 1;
                int i6 = ((int) (0.75f * f3)) - 1;
                float f7 = f3 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(0), new Rect(i5, 0, i6, i4), new RectF(0.0f, 0.0f, f7 - 2.0f, f4), paint);
                double d2 = (double) i4;
                rect = new Rect(i5, ((int) (d2 * 0.25d)) + 1, i6, ((int) (d2 * 0.75d)) - 1);
                float f8 = f7 + 2.0f;
                float f9 = f4 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(f8, 0.0f, f3, f9 - 2.0f), paint);
                rectF = new RectF(f8, f9 + 2.0f, f3, f4);
                i2 = 2;
            } else if (list2.size() == 4) {
                double d3 = (double) i4;
                rect = new Rect(((int) (((double) i3) * 0.25d)) + 1, ((int) (d3 * 0.25d)) + 1, ((int) (0.75f * f3)) - 1, ((int) (d3 * 0.75d)) - 1);
                float f10 = f3 * 0.5f;
                float f11 = f10 - 2.0f;
                float f12 = 0.5f * f4;
                float f13 = f12 - 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(0), rect, new RectF(0.0f, 0.0f, f11, f13), paint);
                float f14 = f12 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(0.0f, f14, f11, f4), paint);
                float f15 = f10 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(2), rect, new RectF(f15, 0.0f, f3, f13), paint);
                rectF = new RectF(f15, f14, f3, f4);
                i2 = 3;
            }
            canvas.drawBitmap((Bitmap) list2.get(i2), rect, rectF, paint);
            return createBitmap;
        }
        return createBitmap;
    }

    public static C17200uh A21() {
        return (C17200uh) yo.mSingletonC.A52.get();
    }

    public Bitmap A02(Context context, C16010sH r6, int i2, int i3) {
        int min = Math.min(i2, i3);
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            i4 = -1;
        }
        float f2 = (float) i4;
        Bitmap bitmap = (Bitmap) this.A05.A02.A01().A00(r6.A0C(f2, min));
        return (bitmap != null || !r6.A0Z || min <= 0) ? bitmap : this.A06.A01(context, r6, f2, min);
    }

    public AnonymousClass2Ao A03(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen074a);
        return new AnonymousClass2Ao(this, str, yo.setSQPC(resources.getDimension(R.dimen.dimen0748)), dimensionPixelSize, true);
    }

    public AnonymousClass2Ao A04(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen074a);
        return new AnonymousClass2Ao(this, str, yo.setSQPC(resources.getDimension(R.dimen.dimen0748)), dimensionPixelSize, false);
    }

    public AnonymousClass2Ao A05(String str, float f2, int i2) {
        return new AnonymousClass2Ao(this, str, f2, i2, false);
    }
}
