package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.3Aj  reason: invalid class name and case insensitive filesystem */
public class C61803Aj {
    public Bitmap A00;
    public final Rect A01 = AnonymousClass000.A0J();
    public final Rect A02 = AnonymousClass000.A0J();
    public final Rect A03;
    public final C41981x0 A04;
    public final C85654Pj A05;
    public final C805244e A06;
    public final boolean A07;
    public final int[] A08;
    public final C85074Na[] A09;

    public C61803Aj(Rect rect, C85654Pj r8, C805244e r9, boolean z2) {
        int length;
        int i2;
        this.A06 = r9;
        this.A05 = r8;
        C41981x0 r5 = r8.A00;
        this.A04 = r5;
        int[] frameDurations = r5.getFrameDurations();
        this.A08 = frameDurations;
        int i3 = 0;
        while (true) {
            length = frameDurations.length;
            if (i3 >= length) {
                break;
            }
            if (frameDurations[i3] < 11) {
                frameDurations[i3] = 100;
            }
            i3++;
        }
        int i4 = 0;
        do {
            i2 = i4;
            i4++;
        } while (i2 < length);
        for (int i5 = 0; i5 < length; i5++) {
        }
        this.A03 = A00(rect, r5);
        this.A07 = z2;
        this.A09 = new C85074Na[r5.getFrameCount()];
        for (int i6 = 0; i6 < this.A04.getFrameCount(); i6++) {
            this.A09[i6] = this.A04.getFrameInfo(i6);
        }
    }

    public static Rect A00(Rect rect, C41981x0 r5) {
        int min;
        int min2;
        if (rect == null) {
            min = r5.getWidth();
            min2 = r5.getHeight();
        } else {
            min = Math.min(rect.width(), r5.getWidth());
            min2 = Math.min(rect.height(), r5.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public int A01() {
        return this.A04.getFrameCount();
    }

    public int A02() {
        return this.A04.getHeight();
    }

    public int A03() {
        return this.A04.getLoopCount();
    }

    public int A04() {
        return this.A04.getWidth();
    }

    public int A05(int i2) {
        return this.A08[i2];
    }

    public C61803Aj A06(Rect rect) {
        if (A00(rect, this.A04).equals(this.A03)) {
            return this;
        }
        return new C61803Aj(rect, this.A05, this.A06, this.A07);
    }

    public final synchronized void A07(int i2, int i3) {
        synchronized (this) {
            Bitmap bitmap = this.A00;
            if (bitmap != null && (bitmap.getWidth() < i2 || this.A00.getHeight() < i3)) {
                Bitmap bitmap2 = this.A00;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.A00 = null;
                }
            }
            Bitmap bitmap3 = this.A00;
            if (bitmap3 == null) {
                bitmap3 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.A00 = bitmap3;
            }
            bitmap3.eraseColor(0);
        }
    }

    public void A08(Canvas canvas, int i2) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        C41981x0 r6 = this.A04;
        C41991x1 frame = r6.getFrame(i2);
        try {
            if (r6.doesRenderSupportScaling()) {
                Rect rect = this.A03;
                double width2 = ((double) rect.width()) / ((double) r6.getWidth());
                double height2 = ((double) rect.height()) / ((double) r6.getHeight());
                int round = (int) Math.round(((double) frame.getWidth()) * width2);
                int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                synchronized (this) {
                    try {
                        int width3 = rect.width();
                        int height3 = rect.height();
                        A07(width3, height3);
                        frame.renderFrame(round, round2, this.A00);
                        Rect rect2 = this.A02;
                        rect2.set(0, 0, width3, height3);
                        Rect rect3 = this.A01;
                        rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                        canvas.drawBitmap(this.A00, rect2, rect3, (Paint) null);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else {
                if (this.A07) {
                    float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                    width = (int) (((float) frame.getWidth()) / max);
                    height = (int) (((float) frame.getHeight()) / max);
                    xOffset = (int) (((float) frame.getXOffset()) / max);
                    yOffset = (int) (((float) frame.getYOffset()) / max);
                } else {
                    width = frame.getWidth();
                    height = frame.getHeight();
                    xOffset = frame.getXOffset();
                    yOffset = frame.getYOffset();
                }
                synchronized (this) {
                    try {
                        A07(width, height);
                        frame.renderFrame(width, height, this.A00);
                        canvas.save();
                        canvas.translate((float) xOffset, (float) yOffset);
                        canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                        }
                        throw th;
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }
}
