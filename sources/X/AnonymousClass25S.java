package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.25S  reason: invalid class name */
public class AnonymousClass25S {
    public C447025e A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C16180sb A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;
    public final C17250um A05;
    public final C18210wK A06;
    public final AnonymousClass1QO A07;
    public final AnonymousClass1MF A08;
    public final C18840xL A09;
    public final C446625a A0A = new C446625a(this);
    public final AtomicInteger A0B = new AtomicInteger();

    public AnonymousClass25S(C16180sb r3, C16980tz r4, AnonymousClass013 r5, C17250um r6, C18210wK r7, AnonymousClass1QO r8, AnonymousClass1MF r9, C18840xL r10) {
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[SYNTHETIC, Splitter:B:29:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[Catch:{ all -> 0x00ef, all -> 0x00f3, IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb A[Catch:{ all -> 0x00ef, all -> 0x00f3, IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:59:0x00f3=Splitter:B:59:0x00f3, B:53:0x00eb=Splitter:B:53:0x00eb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ android.graphics.Bitmap A00(X.C16750ta r14, X.C446725b r15, X.AnonymousClass25S r16, java.io.File r17, int[] r18) {
        /*
            X.25V r0 = r15.A03
            int r4 = r0.AG6()
            android.view.View r0 = r15.A00
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x001e:
            if (r4 != 0) goto L_0x005b
            r8 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "MessageThumbsThread/ getting thumb for 0 size"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0028:
            r0 = 0
            r10 = 4
            r6 = 1
            r12 = 0
            r13 = 0
            r7 = r18
            if (r18 == 0) goto L_0x006b
            r2 = r16
            X.0wK r2 = r2.A06
            java.lang.String r3 = r14.A0I
            if (r3 == 0) goto L_0x0059
            X.1OJ r2 = r2.A0J
            X.1f1 r2 = r2.A02(r3, r6)
            if (r2 == 0) goto L_0x0059
        L_0x0042:
            if (r2 == 0) goto L_0x0100
            long r4 = r2.A0A
            r9 = 0
        L_0x0047:
            int r2 = r7.length
            if (r9 >= r2) goto L_0x006d
            r2 = r18[r9]
            long r2 = (long) r2
            long r2 = r2 + r0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x006d
            r2 = r18[r9]
            long r2 = (long) r2
            long r0 = r0 + r2
            int r9 = r9 + 1
            goto L_0x0047
        L_0x0059:
            r2 = 0
            goto L_0x0042
        L_0x005b:
            double r2 = (double) r4
            double r2 = r2 / r0
            int r8 = (int) r2
            goto L_0x0028
        L_0x005f:
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = r0 + r2
            goto L_0x001e
        L_0x006b:
            r6 = 0
            goto L_0x007a
        L_0x006d:
            r2 = r18[r13]
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x006b
            boolean r2 = r15.A05
            if (r2 == 0) goto L_0x007a
            r10 = 16
        L_0x007a:
            r3 = r17
            if (r18 != 0) goto L_0x0084
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            goto L_0x009a
        L_0x0084:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            X.1q7 r2 = new X.1q7     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            byte[] r0 = X.C17970vw.A04     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            X.044 r1 = new X.044     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
        L_0x009a:
            r2 = 2
            X.25c r0 = new X.25c     // Catch:{ all -> 0x00ef }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00ef }
            X.25d r4 = X.C37741pe.A04(r12, r0, r1, r13)     // Catch:{ all -> 0x00ef }
            android.graphics.Bitmap r12 = r4.A02     // Catch:{ all -> 0x00ef }
            int r0 = r14.A06     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00b9
            int r0 = r14.A08     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00b9
            int r0 = r4.A00     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00b9
            int r0 = r4.A01     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00b9
            X.C17970vw.A0M(r14, r3)     // Catch:{ all -> 0x00ef }
        L_0x00b9:
            if (r12 == 0) goto L_0x00eb
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x00ef }
            X.03o r3 = new X.03o     // Catch:{ all -> 0x00ef }
            r3.<init>(r0)     // Catch:{ all -> 0x00ef }
            r0 = 1
            int r0 = r3.A07(r0)     // Catch:{ all -> 0x00ef }
            android.graphics.Matrix r17 = X.C17970vw.A08(r0)     // Catch:{ all -> 0x00ef }
            if (r17 == 0) goto L_0x00e4
            int r15 = r12.getWidth()     // Catch:{ all -> 0x00ef }
            int r16 = r12.getHeight()     // Catch:{ all -> 0x00ef }
            r14 = 0
            r18 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00ef }
            if (r12 == r0) goto L_0x00e3
            r12.recycle()     // Catch:{ all -> 0x00ef }
        L_0x00e3:
            r12 = r0
        L_0x00e4:
            if (r6 == 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00eb
            com.whatsapp.filter.FilterUtils.blurNative(r12, r10, r2)     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            r1.close()     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
            return r12
        L_0x00ef:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            throw r0     // Catch:{ IOException -> 0x0100, OutOfMemoryError -> 0x00f4 }
        L_0x00f4:
            r1 = move-exception
            boolean r0 = X.C29601at.A01()
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "MessageThumbsThread/bitmap-decode/OutOfMemory avoided"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0100:
            return r12
        L_0x0101:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25S.A00(X.0ta, X.25b, X.25S, java.io.File, int[]):android.graphics.Bitmap");
    }

    public synchronized void A01(View view, C16740tZ r14, AnonymousClass25Z r15, AnonymousClass25V r16, Object obj, boolean z2) {
        View view2;
        C446725b r4;
        C16740tZ r6 = r14;
        synchronized (this) {
            LinkedBlockingDeque linkedBlockingDeque = this.A0A.A00;
            Iterator it = linkedBlockingDeque.iterator();
            while (true) {
                view2 = view;
                if (!it.hasNext()) {
                    break;
                }
                C446725b r2 = (C446725b) it.next();
                if (r2.A00 == view) {
                    linkedBlockingDeque.remove(r2);
                }
            }
            Iterator it2 = linkedBlockingDeque.iterator();
            while (true) {
                Object obj2 = obj;
                if (it2.hasNext()) {
                    C446725b r3 = (C446725b) it2.next();
                    if (r3.A01.A11.equals(r14.A11) && r3.A04.equals(obj2) && r3.A00 == view) {
                        break;
                    }
                } else {
                    AnonymousClass25Z r7 = r15;
                    AnonymousClass25V r8 = r16;
                    boolean z3 = z2;
                    if (r14 instanceof C16730tY) {
                        C16730tY r62 = (C16730tY) r6;
                        C16750ta r42 = r62.A02;
                        if (r42 != null) {
                            if (!r42.A0P || r42.A0F == null || r42.A03()) {
                                r42.A0W = false;
                            } else if (!r42.A0W) {
                                r42.A0W = true;
                                this.A01.post(new RunnableRunnableShape16S0100000_I0_15(r15, 9));
                            }
                            if (r42.A0F != null || (r62 instanceof C38641rB) || (r62 instanceof C38681rF) || (r62 instanceof C38711rI)) {
                                if (!(r62 instanceof C39001rl)) {
                                    r4 = new C446725b(view2, r62, r7, r8, this, obj2, z3);
                                }
                            }
                        }
                    } else if ((r14 instanceof C30581cc) && r14.A0U != null) {
                        r4 = new C446725b(view2, r6, r7, r8, this, obj2, z3);
                    }
                    linkedBlockingDeque.offer(r4);
                    if (this.A00 == null) {
                        C447025e r43 = new C447025e(this.A02, this.A04, this.A05, this.A09, this);
                        this.A00 = r43;
                        r43.start();
                    }
                }
            }
        }
    }
}
