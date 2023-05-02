package X;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Ae  reason: invalid class name and case insensitive filesystem */
public class C61753Ae {
    public static final AtomicInteger A0E = new AtomicInteger(0);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C89994dK A05;
    public C613538o A06;
    public C15780rq A07;
    public AnonymousClass3AI A08;
    public C85034Mv A09;
    public final Context A0A;
    public final C63753Lj A0B = new C63753Lj(Looper.getMainLooper(), this);
    public final C83344Gh A0C;
    public final Object A0D;

    public C61753Ae(Context context, C83344Gh r4, Object obj) {
        A0E.incrementAndGet();
        this.A01 = -1;
        this.A03 = 0;
        this.A00 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = context;
        this.A0C = r4;
        this.A0D = obj;
    }

    public final void A00() {
        AnonymousClass3AI r2;
        String str;
        String str2;
        synchronized (this) {
            C83344Gh r1 = this.A0C;
            AnonymousClass4CF r0 = (AnonymousClass4CF) this.A05.A04;
            r1.A00 = r0;
            C14910pz r12 = r1.A01;
            AnonymousClass4O3 r22 = r0.A00;
            C62003Bg.A02("Committing Variables and Bound tree is only supported from the UI Thread");
            r12.A02 = r22;
            r12.A08 = r22.A06;
            C14990q7 r6 = (C14990q7) r12.A07.get();
            Iterator it = r12.A0G.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("onCommit");
            }
            if (r6 != null) {
                for (C84254Jv r13 : r22.A03) {
                    C31201dg r02 = r13.A01;
                    Object A052 = C62183Bz.A05(r6, r02);
                    if (A052 == null) {
                        str = "BloksTreeManager";
                        str2 = "Binding was targeting a controller but the returned controller was null";
                    } else {
                        int i2 = r02.A01;
                        int i3 = r13.A00;
                        Object obj = r13.A02;
                        if (i2 == 13688) {
                            AnonymousClass3EX r4 = (AnonymousClass3EX) A052;
                            if (obj == null) {
                                str = "ViewTransformsBindControllerOverride";
                                str2 = "Trying to set null value for a view transform property";
                            } else {
                                r4.AdZ((C14990q7) null, obj, i3);
                            }
                        } else {
                            Object[] A1b = C13680ns.A1b();
                            AnonymousClass000.A1M(A1b, i2, 0);
                            throw AnonymousClass000.A0T(String.format("No implementation bound to key: %s", A1b));
                        }
                    }
                    C29691b2.A00(str, str2);
                }
            }
            r2 = this.A05.A02;
            this.A08 = r2;
        }
        C85034Mv r14 = this.A09;
        if (r14 != null && r14.A01 != r2) {
            r14.A01 = r2;
            r14.A03.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r2 = r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (r13 <= r1.A00) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r1.A00 = r13;
        r1.A05 = r2;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        if (r1.A06 != r8) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        r1.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r18 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        r18[0] = r1.A05.A02.A03.A04.width();
        r18[1] = r1.A05.A02.A03.A04.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
        r2 = r1.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fc, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r17, int[] r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            X.3AI r5 = r1.A08
            r3 = r19
            r4 = r17
            if (r5 == 0) goto L_0x0047
            int r2 = r5.A01
            com.facebook.rendercore.RenderTreeNode r0 = r5.A03
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.width()
            boolean r0 = X.AnonymousClass4Xc.A01(r2, r4, r0)
            if (r0 == 0) goto L_0x0047
            int r2 = r5.A00
            com.facebook.rendercore.RenderTreeNode r0 = r5.A03
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.height()
            boolean r0 = X.AnonymousClass4Xc.A01(r2, r3, r0)
            if (r0 == 0) goto L_0x0047
            if (r18 == 0) goto L_0x0046
            r2 = 0
            X.3AI r0 = r1.A08
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.width()
            r18[r2] = r0
            r2 = 1
            X.3AI r0 = r1.A08
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.height()
            r18[r2] = r0
        L_0x0046:
            return
        L_0x0047:
            monitor-enter(r1)
            r1.A04 = r4     // Catch:{ all -> 0x012a }
            r1.A02 = r3     // Catch:{ all -> 0x012a }
            X.4dK r0 = r1.A05     // Catch:{ all -> 0x012a }
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0078
            X.3AI r5 = r0.A02     // Catch:{ all -> 0x012a }
            int r2 = r5.A01     // Catch:{ all -> 0x012a }
            com.facebook.rendercore.RenderTreeNode r0 = r5.A03     // Catch:{ all -> 0x012a }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x012a }
            int r0 = r0.width()     // Catch:{ all -> 0x012a }
            boolean r0 = X.AnonymousClass4Xc.A01(r2, r4, r0)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0078
            int r2 = r5.A00     // Catch:{ all -> 0x012a }
            com.facebook.rendercore.RenderTreeNode r0 = r5.A03     // Catch:{ all -> 0x012a }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x012a }
            int r0 = r0.height()     // Catch:{ all -> 0x012a }
            boolean r0 = X.AnonymousClass4Xc.A01(r2, r3, r0)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0078
            if (r18 == 0) goto L_0x0078
            goto L_0x0109
        L_0x0078:
            X.0rq r0 = r1.A07     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x007e
            goto L_0x0102
        L_0x007e:
            X.38o r2 = r1.A06     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x0098
            int r0 = r2.A02     // Catch:{ all -> 0x012a }
            boolean r0 = X.AnonymousClass4Xc.A00(r0, r4)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0098
            int r0 = r2.A00     // Catch:{ all -> 0x012a }
            boolean r0 = X.AnonymousClass4Xc.A00(r0, r3)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0098
            X.38o r8 = r1.A06     // Catch:{ all -> 0x012a }
            int r13 = r8.A01     // Catch:{ all -> 0x012a }
        L_0x0096:
            monitor-exit(r1)     // Catch:{ all -> 0x012a }
            goto L_0x00b2
        L_0x0098:
            int r13 = r1.A03     // Catch:{ all -> 0x012a }
            int r0 = r13 + 1
            r1.A03 = r0     // Catch:{ all -> 0x012a }
            android.content.Context r9 = r1.A0A     // Catch:{ all -> 0x012a }
            X.0rq r11 = r1.A07     // Catch:{ all -> 0x012a }
            java.lang.Object r12 = r1.A0D     // Catch:{ all -> 0x012a }
            X.4dK r10 = r1.A05     // Catch:{ all -> 0x012a }
            int r14 = r1.A04     // Catch:{ all -> 0x012a }
            int r15 = r1.A02     // Catch:{ all -> 0x012a }
            X.38o r8 = new X.38o     // Catch:{ all -> 0x012a }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x012a }
            r1.A06 = r8     // Catch:{ all -> 0x012a }
            goto L_0x0096
        L_0x00b2:
            X.4dK r2 = r8.A00()
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x0127 }
            if (r13 <= r0) goto L_0x00c1
            r1.A00 = r13     // Catch:{ all -> 0x0127 }
            r1.A05 = r2     // Catch:{ all -> 0x0127 }
            r3 = 1
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            X.38o r2 = r1.A06     // Catch:{ all -> 0x0127 }
            r0 = 0
            if (r2 != r8) goto L_0x00c9
            r1.A06 = r0     // Catch:{ all -> 0x0127 }
        L_0x00c9:
            if (r18 == 0) goto L_0x00e7
            X.4dK r0 = r1.A05     // Catch:{ all -> 0x0127 }
            X.3AI r0 = r0.A02     // Catch:{ all -> 0x0127 }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03     // Catch:{ all -> 0x0127 }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x0127 }
            int r0 = r0.width()     // Catch:{ all -> 0x0127 }
            r18[r6] = r0     // Catch:{ all -> 0x0127 }
            X.4dK r0 = r1.A05     // Catch:{ all -> 0x0127 }
            X.3AI r0 = r0.A02     // Catch:{ all -> 0x0127 }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03     // Catch:{ all -> 0x0127 }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x0127 }
            int r0 = r0.height()     // Catch:{ all -> 0x0127 }
            r18[r7] = r0     // Catch:{ all -> 0x0127 }
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x0046
            boolean r0 = X.C62003Bg.A03()
            if (r0 == 0) goto L_0x00f4
            r1.A00()
            return
        L_0x00f4:
            X.3Lj r2 = r1.A0B
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x0046
            r2.sendEmptyMessage(r1)
            return
        L_0x0102:
            if (r18 == 0) goto L_0x0125
            r18[r6] = r6     // Catch:{ all -> 0x012a }
            r18[r7] = r6     // Catch:{ all -> 0x012a }
            goto L_0x0125
        L_0x0109:
            X.4dK r0 = r1.A05     // Catch:{ all -> 0x012a }
            X.3AI r0 = r0.A02     // Catch:{ all -> 0x012a }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03     // Catch:{ all -> 0x012a }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x012a }
            int r0 = r0.width()     // Catch:{ all -> 0x012a }
            r18[r6] = r0     // Catch:{ all -> 0x012a }
            X.4dK r0 = r1.A05     // Catch:{ all -> 0x012a }
            X.3AI r0 = r0.A02     // Catch:{ all -> 0x012a }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03     // Catch:{ all -> 0x012a }
            android.graphics.Rect r0 = r0.A04     // Catch:{ all -> 0x012a }
            int r0 = r0.height()     // Catch:{ all -> 0x012a }
            r18[r7] = r0     // Catch:{ all -> 0x012a }
        L_0x0125:
            monitor-exit(r1)     // Catch:{ all -> 0x012a }
            return
        L_0x0127:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0127 }
            throw r0
        L_0x012a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61753Ae.A01(int, int[], int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r1 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r9 <= r12.A00) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r12.A00 = r9;
        r12.A05 = r1;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r12.A06 != r4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r12.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        r2 = r12.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C15780rq r13) {
        /*
            r12 = this;
            r2 = 0
            r3 = r12
            r1 = -1
            monitor-enter(r3)
            int r0 = r12.A01     // Catch:{ all -> 0x0066 }
            if (r0 > r1) goto L_0x005f
            X.4dK r6 = r12.A05     // Catch:{ all -> 0x0066 }
            r12.A01 = r1     // Catch:{ all -> 0x0066 }
            r7 = r13
            r12.A07 = r13     // Catch:{ all -> 0x0066 }
            int r10 = r12.A04     // Catch:{ all -> 0x0066 }
            if (r10 == r1) goto L_0x005d
            int r11 = r12.A02     // Catch:{ all -> 0x0066 }
            if (r11 == r1) goto L_0x005d
            int r9 = r12.A03     // Catch:{ all -> 0x0066 }
            int r0 = r9 + 1
            r12.A03 = r0     // Catch:{ all -> 0x0066 }
            android.content.Context r5 = r12.A0A     // Catch:{ all -> 0x0066 }
            java.lang.Object r8 = r12.A0D     // Catch:{ all -> 0x0066 }
            X.38o r4 = new X.38o     // Catch:{ all -> 0x0066 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0066 }
            r12.A06 = r4     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            X.4dK r1 = r4.A00()
            monitor-enter(r3)
            int r0 = r12.A00     // Catch:{ all -> 0x005a }
            if (r9 <= r0) goto L_0x0038
            r12.A00 = r9     // Catch:{ all -> 0x005a }
            r12.A05 = r1     // Catch:{ all -> 0x005a }
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.38o r0 = r12.A06     // Catch:{ all -> 0x005a }
            if (r0 != r4) goto L_0x003f
            r12.A06 = r2     // Catch:{ all -> 0x005a }
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x004b
            boolean r0 = X.C62003Bg.A03()
            if (r0 == 0) goto L_0x004c
            r12.A00()
        L_0x004b:
            return
        L_0x004c:
            X.3Lj r2 = r12.A0B
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x004b
            r2.sendEmptyMessage(r1)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            throw r0
        L_0x005d:
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            return
        L_0x005f:
            java.lang.String r0 = "Setting an unversioned tree after calling setVersionedTree is not supported. If this RenderState takes its version from a parent tree make sure to always call setVersionedTree"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61753Ae.A02(X.0rq):void");
    }
}
