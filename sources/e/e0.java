package e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: XFMFile */
public final class e0 extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    public static final Paint f1626h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1627a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1628b;

    /* renamed from: c  reason: collision with root package name */
    public final Picasso.LoadedFrom f1629c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f1630d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1631e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1632f;

    /* renamed from: g  reason: collision with root package name */
    public int f1633g = MotionEventCompat.ACTION_MASK;

    public e0(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z2, boolean z3) {
        super(context.getResources(), bitmap);
        this.f1627a = z3;
        this.f1628b = context.getResources().getDisplayMetrics().density;
        this.f1629c = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY && !z2) {
            this.f1630d = drawable;
            this.f1632f = true;
            this.f1631e = SystemClock.uptimeMillis();
        }
    }

    public static void a(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z2, boolean z3) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new e0(context, bitmap, drawable, loadedFrom, z2, z3));
    }

    public static void b(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            boolean r0 = r6.f1632f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x001c
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f1631e
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0020
            r6.f1632f = r1
            r0 = 0
            r6.f1630d = r0
        L_0x001c:
            super.draw(r7)
            goto L_0x0038
        L_0x0020:
            android.graphics.drawable.Drawable r2 = r6.f1630d
            if (r2 == 0) goto L_0x0027
            r2.draw(r7)
        L_0x0027:
            int r2 = r6.f1633g
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            super.setAlpha(r0)
            super.draw(r7)
            int r0 = r6.f1633g
            super.setAlpha(r0)
        L_0x0038:
            boolean r0 = r6.f1627a
            if (r0 == 0) goto L_0x007c
            android.graphics.Paint r0 = f1626h
            r2 = -1
            r0.setColor(r2)
            float r2 = r6.f1628b
            r3 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r5 = (float) r1
            r4.moveTo(r5, r5)
            int r3 = r3 + r1
            float r3 = (float) r3
            r4.lineTo(r3, r5)
            r4.lineTo(r5, r3)
            r7.drawPath(r4, r0)
            com.squareup.picasso.Picasso$LoadedFrom r3 = r6.f1629c
            int r3 = r3.f1562a
            r0.setColor(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r3.moveTo(r5, r5)
            int r2 = r2 + r1
            float r1 = (float) r2
            r3.lineTo(r1, r5)
            r3.lineTo(r5, r1)
            r7.drawPath(r3, r0)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.draw(android.graphics.Canvas):void");
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1630d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i2) {
        this.f1633g = i2;
        Drawable drawable = this.f1630d;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1630d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
