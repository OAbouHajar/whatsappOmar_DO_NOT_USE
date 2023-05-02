package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.animated.webp.WebPImage;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1vn  reason: invalid class name and case insensitive filesystem */
public class C41441vn {
    public int A00;
    public int A01;
    public long A02;
    public Bitmap A03;
    public Bitmap A04;
    public Canvas A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final Bitmap A09;
    public final C14870pt A0A;
    public final AnonymousClass4VG A0B;
    public final AnonymousClass20p A0C;
    public final C83974It A0D;
    public final Runnable A0E = new RunnableRunnableShape15S0100000_I0_14(this);
    public final Set A0F = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean A0G;

    public C41441vn(Bitmap bitmap, WebPImage webPImage, C14870pt r11, AnonymousClass20p r12, String str, int i2, int i3) {
        this.A0A = r11;
        this.A0C = r12;
        this.A09 = bitmap;
        this.A0D = new C83974It(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A08 = i2;
        this.A07 = i3;
        this.A0B = new AnonymousClass4VG(bitmap, webPImage, str, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = r15.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r15 = this;
            r11 = r15
            boolean r0 = r15.A0G
            if (r0 == 0) goto L_0x0140
            X.4It r6 = r15.A0D
            int r5 = r6.A00
            r4 = 1
            if (r5 <= r4) goto L_0x0140
            java.util.Set r7 = r15.A0F
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0140
            long r13 = android.os.SystemClock.uptimeMillis()
            long r2 = r15.A02
            int r0 = r15.A01
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0137
            android.graphics.Bitmap r3 = r15.A03
            if (r3 == 0) goto L_0x003c
            android.graphics.Bitmap r1 = r15.A04
            if (r1 == 0) goto L_0x002e
            r0 = 0
            r1.eraseColor(r0)
        L_0x002e:
            boolean r0 = r3.isRecycled()
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            r0 = 0
            r15.A03 = r0
        L_0x003c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            java.util.Iterator r1 = r2.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            X.20u r0 = (X.C436120u) r0
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x0045
        L_0x0057:
            android.graphics.Bitmap r0 = r15.A04
            if (r0 != 0) goto L_0x006e
            int r2 = r15.A08
            int r1 = r15.A07
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r15.A04 = r1
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r15.A05 = r0
        L_0x006e:
            android.graphics.Canvas r2 = r15.A05
            if (r2 != 0) goto L_0x007b
            android.graphics.Bitmap r0 = r15.A04
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r15.A05 = r2
        L_0x007b:
            r1 = 0
            r0 = 0
            r2.drawBitmap(r3, r0, r0, r1)
            goto L_0x0039
        L_0x0081:
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x00c0
            java.util.Iterator r9 = r2.iterator()
        L_0x0089:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r3 = r9.next()
            X.20u r3 = (X.C436120u) r3
            X.20t r3 = (X.C436020t) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0089
            int r0 = r3.A00
            int r2 = r0 + 1
            r3.A00 = r2
            boolean r1 = r3.A05
            int r0 = r3.A01
            if (r1 == 0) goto L_0x00a9
            int r0 = r0 + 1
        L_0x00a9:
            if (r2 >= r0) goto L_0x00b9
            long r7 = android.os.SystemClock.uptimeMillis()
            long r0 = r3.A02
            long r7 = r7 - r0
            int r0 = X.C436020t.A09
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
        L_0x00b9:
            r3.stop()
            goto L_0x0089
        L_0x00bd:
            r0 = 0
            r15.A06 = r0
        L_0x00c0:
            int r0 = r15.A00
            int r12 = r0 + 1
            int r12 = r12 % r5
            r15.A00 = r12
            if (r12 != 0) goto L_0x00cb
            r15.A06 = r4
        L_0x00cb:
            r15.A02 = r13
            int[] r0 = r6.A01
            r0 = r0[r12]
            r15.A01 = r0
            long r0 = (long) r0
            long r13 = r13 + r0
            X.20p r1 = r15.A0C
            X.4VG r10 = r15.A0B
            X.54y r9 = new X.54y
            r9.<init>(r10, r11, r12, r13)
            X.20z r8 = r1.A04
            monitor-enter(r8)
            java.util.PriorityQueue r7 = r8.A01     // Catch:{ all -> 0x0132 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0132 }
        L_0x00e7:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x010b
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0132 }
            X.54y r3 = (X.C1043454y) r3     // Catch:{ all -> 0x0132 }
            int r2 = r3.A00     // Catch:{ all -> 0x0132 }
            int r0 = r9.A00     // Catch:{ all -> 0x0132 }
            if (r2 < r0) goto L_0x00e7
            X.4VG r2 = r3.A02     // Catch:{ all -> 0x0132 }
            X.4VG r0 = r9.A02     // Catch:{ all -> 0x0132 }
            if (r2 != r0) goto L_0x00e7
            long r4 = r9.A01     // Catch:{ all -> 0x0132 }
            long r2 = r3.A01     // Catch:{ all -> 0x0132 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            r6.remove()     // Catch:{ all -> 0x0132 }
            goto L_0x00e7
        L_0x010b:
            r7.add(r9)     // Catch:{ all -> 0x0134 }
            r8.notifyAll()     // Catch:{ all -> 0x0134 }
            monitor-exit(r8)
            X.20r r0 = r1.A00
            if (r0 != 0) goto L_0x014f
            X.0pd r5 = r1.A02
            X.0pt r4 = r1.A01
            X.1QP r6 = r1.A03
            X.4FG r7 = new X.4FG
            r7.<init>(r1)
            X.20r r3 = new X.20r
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A00 = r3
            monitor-enter(r8)
            r8.A00 = r3     // Catch:{ all -> 0x0134 }
            monitor-exit(r8)
            X.20r r0 = r1.A00
            r0.start()
            return
        L_0x0132:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0137:
            X.0pt r1 = r15.A0A
            java.lang.Runnable r0 = r15.A0E
            long r2 = r2 - r13
            r1.A0L(r0, r2)
            return
        L_0x0140:
            r0 = 0
            r15.A0G = r0
            android.graphics.Bitmap r1 = r15.A04
            r0 = 0
            if (r1 == 0) goto L_0x014d
            r1.recycle()
            r15.A04 = r0
        L_0x014d:
            r15.A03 = r0
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41441vn.A00():void");
    }

    public void finalize() {
        this.A0B.finalize();
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            bitmap.recycle();
            this.A04 = null;
        }
        super.finalize();
    }
}
