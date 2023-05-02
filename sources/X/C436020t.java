package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.20t  reason: invalid class name and case insensitive filesystem */
public class C436020t extends Drawable implements Animatable, C436120u {
    public static int A09 = 4000;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final Paint A06 = new Paint(1);
    public final C41441vn A07;
    public final List A08 = new ArrayList();

    public C436020t(C41441vn r3) {
        this.A07 = r3;
        if (C89674ci.A00) {
            A09 = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
    }

    public void draw(Canvas canvas) {
        boolean z2 = this.A04;
        C41441vn r0 = this.A07;
        Bitmap bitmap = !z2 ? r0.A09 : r0.A04;
        if (bitmap == null) {
            bitmap = r0.A09;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A06);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A04;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A04 || C89674ci.A00) {
            this.A00 = 0;
            this.A04 = true;
            C41441vn r4 = this.A07;
            int i2 = r4.A00;
            int i3 = r4.A0D.A00;
            boolean z2 = true;
            if (i2 <= Math.max(i3 / 5, 1)) {
                z2 = false;
            }
            this.A05 = z2;
            r4.A0F.add(this);
            if (!r4.A0G && i3 > 1) {
                r4.A0G = true;
                r4.A00();
            }
            Iterator it = this.A08.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void stop() {
        if (this.A04) {
            this.A04 = false;
            C41441vn r4 = this.A07;
            Set set = r4.A0F;
            set.remove(this);
            if (set.isEmpty()) {
                r4.A0G = false;
                r4.A00 = 0;
                AnonymousClass4VG r3 = r4.A0B;
                synchronized (r3) {
                    r3.A00 = 0;
                    r3.A02 = null;
                    Bitmap bitmap = r3.A01;
                    if (bitmap != null) {
                        r3.A03 = null;
                        bitmap.recycle();
                        r3.A01 = null;
                    }
                }
                r4.A06 = false;
                Bitmap bitmap2 = r4.A04;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    r4.A04 = null;
                }
                r4.A03 = null;
                r4.A0A.A0J(r4.A0E);
                C436620z r2 = r4.A0C.A04;
                synchronized (r2) {
                    Iterator it = r2.A01.iterator();
                    while (it.hasNext()) {
                        if (((C1043454y) it.next()).A02 == r3) {
                            it.remove();
                        }
                    }
                }
            }
            for (AnonymousClass03Y A012 : this.A08) {
                A012.A01(this);
            }
            invalidateSelf();
        }
    }
}
