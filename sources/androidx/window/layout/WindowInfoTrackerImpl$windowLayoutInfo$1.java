package androidx.window.layout;

import X.AnonymousClass1UD;
import X.AnonymousClass1UF;
import X.AnonymousClass1UG;
import X.AnonymousClass1UJ;
import X.AnonymousClass22M;
import X.AnonymousClass5VH;
import X.C05370Qr;
import X.C07980co;
import X.C107065Gg;
import X.C109135Qv;
import X.C18450wi;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "listener", "$this$flow", "listener"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends AnonymousClass1UD implements AnonymousClass1UJ {
    public final /* synthetic */ Activity $activity;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C07980co this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(Activity activity, C07980co r2, AnonymousClass1UG r3) {
        super(r3);
        this.this$0 = r2;
        this.$activity = activity;
    }

    public static final AnonymousClass5VH A00() {
        return new C107065Gg();
    }

    public static final void A02(C05370Qr r0, AnonymousClass5VH r1) {
        C18450wi.A0C(r0);
        r1.Ah5(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a A[Catch:{ all -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = X.C106185Cw.A01()
            int r0 = r9.label
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r6) goto L_0x0022
            if (r0 != r7) goto L_0x001b
            java.lang.Object r1 = r9.L$2
            X.0Ut r1 = (X.C06210Ut) r1
            java.lang.Object r4 = r9.L$1
            X.04N r4 = (X.AnonymousClass04N) r4
            java.lang.Object r5 = r9.L$0
            X.5Qv r5 = (X.C109135Qv) r5
            goto L_0x004f
        L_0x001b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0V(r0)
            throw r1
        L_0x0022:
            java.lang.Object r1 = r9.L$2
            X.0Ut r1 = (X.C06210Ut) r1
            java.lang.Object r4 = r9.L$1
            X.04N r4 = (X.AnonymousClass04N) r4
            java.lang.Object r5 = r9.L$0
            X.5Qv r5 = (X.C109135Qv) r5
            goto L_0x0061
        L_0x002f:
            X.C813747x.A00(r10)
            java.lang.Object r5 = r9.L$0
            X.5Qv r5 = (X.C109135Qv) r5
            X.5VH r3 = A00()
            X.0b1 r4 = new X.0b1
            r4.<init>(r3)
            X.0co r0 = r9.this$0
            X.0lT r2 = r0.A00
            android.app.Activity r1 = r9.$activity
            X.0hr r0 = X.C10890hr.A00
            r2.Abc(r1, r4, r0)
            X.0Ut r1 = r3.AJy()     // Catch:{ all -> 0x008b }
            goto L_0x0052
        L_0x004f:
            X.C813747x.A00(r10)     // Catch:{ all -> 0x008b }
        L_0x0052:
            r9.L$0 = r5     // Catch:{ all -> 0x008b }
            r9.L$1 = r4     // Catch:{ all -> 0x008b }
            r9.L$2 = r1     // Catch:{ all -> 0x008b }
            r9.label = r6     // Catch:{ all -> 0x008b }
            java.lang.Object r10 = r1.A02(r9)     // Catch:{ all -> 0x008b }
            if (r10 != r8) goto L_0x0064
            goto L_0x007f
        L_0x0061:
            X.C813747x.A00(r10)     // Catch:{ all -> 0x008b }
        L_0x0064:
            boolean r0 = X.AnonymousClass000.A1X(r10)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.A01()     // Catch:{ all -> 0x008b }
            X.0Qr r0 = (X.C05370Qr) r0     // Catch:{ all -> 0x008b }
            r9.L$0 = r5     // Catch:{ all -> 0x008b }
            r9.L$1 = r4     // Catch:{ all -> 0x008b }
            r9.L$2 = r1     // Catch:{ all -> 0x008b }
            r9.label = r7     // Catch:{ all -> 0x008b }
            java.lang.Object r0 = r5.A8L(r0, r9)     // Catch:{ all -> 0x008b }
            if (r0 != r8) goto L_0x0052
            goto L_0x0080
        L_0x007f:
            return r8
        L_0x0080:
            return r8
        L_0x0081:
            X.0co r0 = r9.this$0
            X.0lT r0 = r0.A00
            r0.AhC(r4)
            X.22M r0 = X.AnonymousClass22M.A00
            return r0
        L_0x008b:
            r1 = move-exception
            X.0co r0 = r9.this$0
            X.0lT r0 = r0.A00
            r0.AhC(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.A04(java.lang.Object):java.lang.Object");
    }

    public final AnonymousClass1UG A05(Object obj, AnonymousClass1UG r5) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.$activity, this.this$0, r5);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* renamed from: A06 */
    public final Object AIV(AnonymousClass1UG r3, C109135Qv r4) {
        return ((AnonymousClass1UF) A05(r4, r3)).A04(AnonymousClass22M.A00);
    }
}
