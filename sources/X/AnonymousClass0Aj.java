package X;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.0Aj  reason: invalid class name */
public class AnonymousClass0Aj extends Drawable implements Animatable {
    public static final C04340Me A0F = new C04340Me();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public DrawableProperties A08;
    public C13580mc A09;
    public AnonymousClass0PX A0A;
    public final Runnable A0B;
    public volatile C12210k1 A0C;
    public volatile C04340Me A0D;
    public volatile boolean A0E;

    public AnonymousClass0Aj() {
        this((C13580mc) null);
    }

    public AnonymousClass0Aj(C13580mc r3) {
        this.A03 = 8;
        this.A0D = A0F;
        this.A0B = new C09710fx(this);
        this.A09 = r3;
        this.A0A = new AnonymousClass0PX(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r9 = r19
            X.0mc r8 = r9.A09
            if (r8 == 0) goto L_0x007a
            X.0PX r7 = r9.A0A
            if (r7 == 0) goto L_0x007a
            long r5 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x00e9
            long r0 = r9.A07
            long r5 = r5 - r0
            r2 = 0
            long r5 = r5 + r2
        L_0x0018:
            long r13 = r7.A00()
            r11 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            r4 = 0
        L_0x0023:
            X.0lh r10 = r7.A01
            int r0 = r10.ACR(r4)
            long r0 = (long) r0
            long r2 = r2 + r0
            int r4 = r4 + 1
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
        L_0x0031:
            int r1 = r4 + -1
        L_0x0033:
            r4 = 0
            r0 = -1
            if (r1 != r0) goto L_0x003f
            int r0 = r8.getFrameCount()
            int r1 = r0 + -1
            r9.A0E = r4
        L_0x003f:
            r0 = r20
            boolean r0 = r8.A8G(r0, r9, r1)
            if (r0 == 0) goto L_0x00a5
            r9.A01 = r1
        L_0x0049:
            long r17 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r9.A0E
            r15 = -1
            if (r0 == 0) goto L_0x0078
            long r0 = r9.A07
            long r17 = r17 - r0
            long r13 = r7.A00()
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            int r0 = r10.getLoopCount()
            if (r0 == 0) goto L_0x007b
            long r0 = r7.A00()
            long r7 = r17 / r0
            int r0 = r10.getLoopCount()
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
        L_0x0076:
            r9.A0E = r4
        L_0x0078:
            r9.A04 = r5
        L_0x007a:
            return
        L_0x007b:
            long r7 = r17 % r13
            int r3 = r10.getFrameCount()
            r2 = 0
        L_0x0082:
            if (r2 >= r3) goto L_0x0091
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0091
            int r0 = r10.ACR(r2)
            long r0 = (long) r0
            long r11 = r11 + r0
            int r2 = r2 + 1
            goto L_0x0082
        L_0x0091:
            long r11 = r11 - r7
            long r17 = r17 + r11
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            long r3 = r9.A03
            long r3 = r3 + r17
            long r1 = r9.A07
            long r1 = r1 + r3
            java.lang.Runnable r0 = r9.A0B
            r9.scheduleSelf(r0, r1)
            goto L_0x0078
        L_0x00a5:
            int r0 = r9.A00
            int r3 = r0 + 1
            r9.A00 = r3
            r1 = 2
            X.0lv r0 = X.AnonymousClass0X1.A00
            boolean r0 = r0.AJ7(r1)
            if (r0 == 0) goto L_0x0049
            java.lang.Class<X.0Aj> r2 = X.AnonymousClass0Aj.class
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "Dropped a frame. Count: %s"
            X.AnonymousClass0X1.A02(r2, r1, r0)
            goto L_0x0049
        L_0x00c0:
            X.0lh r10 = r7.A01
            int r0 = r10.getLoopCount()
            if (r0 == 0) goto L_0x00d6
            long r3 = r5 / r13
            int r0 = r10.getLoopCount()
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
            r1 = -1
            goto L_0x0033
        L_0x00d6:
            long r11 = r5 % r13
            r4 = 0
            r2 = 0
        L_0x00db:
            int r0 = r10.ACR(r4)
            long r0 = (long) r0
            long r2 = r2 + r0
            int r4 = r4 + 1
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
            goto L_0x0031
        L_0x00e9:
            long r0 = r9.A04
            r2 = 0
            long r5 = java.lang.Math.max(r0, r2)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Aj.draw(android.graphics.Canvas):void");
    }

    public int getIntrinsicHeight() {
        C13580mc r0 = this.A09;
        return r0 == null ? super.getIntrinsicHeight() : r0.ACq();
    }

    public int getIntrinsicWidth() {
        C13580mc r0 = this.A09;
        return r0 == null ? super.getIntrinsicWidth() : r0.ACr();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A0E;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C13580mc r0 = this.A09;
        if (r0 != null) {
            r0.Adc(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        if (!this.A0E) {
            long j2 = (long) i2;
            if (this.A04 != j2) {
                this.A04 = j2;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public void setAlpha(int i2) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setAlpha(i2);
        C13580mc r0 = this.A09;
        if (r0 != null) {
            r0.AdX(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setColorFilter(colorFilter);
        C13580mc r0 = this.A09;
        if (r0 != null) {
            r0.Adg(colorFilter);
        }
    }

    public void start() {
        C13580mc r0;
        if (!this.A0E && (r0 = this.A09) != null && r0.getFrameCount() > 1) {
            this.A0E = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A06;
            this.A04 = uptimeMillis - this.A05;
            this.A01 = this.A02;
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.A0E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A06 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A04;
            this.A02 = this.A01;
            this.A0E = false;
            this.A07 = 0;
            this.A04 = -1;
            this.A01 = -1;
            unscheduleSelf(this.A0B);
        }
    }
}
