package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0eR  reason: invalid class name and case insensitive filesystem */
public class C08830eR implements C13580mc {
    public long A00;
    public ColorFilter A01;
    public Rect A02;
    public C13580mc A03;
    public C08840eS A04;
    public boolean A05 = false;
    public final C12890l8 A06;
    public final Runnable A07 = new C09700fw(this);
    public final ScheduledExecutorService A08;

    public C08830eR(C12890l8 r2, C13580mc r3, C08840eS r4, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r2;
        this.A08 = scheduledExecutorService;
    }

    public final synchronized void A00() {
        if (!this.A05) {
            this.A05 = true;
            this.A08.schedule(this.A07, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public boolean A8G(Canvas canvas, Drawable drawable, int i2) {
        this.A00 = this.A06.now();
        boolean A1O = AnonymousClass000.A1O(this.A03.A8G(canvas, drawable, i2) ? 1 : 0);
        A00();
        return A1O;
    }

    public int ACR(int i2) {
        return this.A03.ACR(i2);
    }

    public int ACq() {
        return this.A03.ACq();
    }

    public int ACr() {
        return this.A03.ACr();
    }

    public void AdX(int i2) {
        this.A03.AdX(i2);
    }

    public void Adc(Rect rect) {
        this.A03.Adc(rect);
        this.A02 = rect;
    }

    public void Adg(ColorFilter colorFilter) {
        this.A03.Adg(colorFilter);
        this.A01 = colorFilter;
    }

    public int getFrameCount() {
        return this.A03.getFrameCount();
    }

    public int getLoopCount() {
        return this.A03.getLoopCount();
    }
}
