package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1j6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C33751j6 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C16490t9 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C33751j6(Context context, C16490t9 r2, boolean z2) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = z2;
    }

    public final void run() {
        C29171a9 r4;
        C16490t9 r0 = this.A01;
        Context context = this.A00;
        boolean z2 = this.A02;
        AnonymousClass1CK r7 = r0.A0I;
        r7.A08();
        File file = new File(context.getFilesDir(), "wam.wam");
        boolean z3 = false;
        if (!z2) {
            z3 = true;
        }
        int length = C48722Ot.A00.length - 1;
        C29171a9 r42 = new C29171a9((C15860rz) null, (AnonymousClass1CI) null, r7, file, length, 3, 0, z3, false);
        r0.A01 = r42;
        C226318r r1 = r0.A0H;
        r0.A06 = new C29161a8(r1, r42);
        r0.A0K.countDown();
        C29171a9 r43 = new C29171a9((C15860rz) null, (AnonymousClass1CI) null, r7, new File(context.getFilesDir(), "wamrealtime.wam"), length, 8, 1, true, false);
        r0.A03 = r43;
        r0.A05 = new C29161a8(r1, r43);
        r0.A0M.countDown();
        boolean z4 = r0.A0Q;
        File filesDir = context.getFilesDir();
        if (z4) {
            r4 = new C29171a9(r0.A0D, r0.A0G, r7, new File(filesDir, "wamdit3.wam"), length, 2, 2, true, true);
        } else {
            r4 = new C29171a9((C15860rz) null, (AnonymousClass1CI) null, r7, new File(filesDir, "wamprivatestats.wam"), length, 3, 2, true, false);
        }
        r0.A02 = r4;
        r0.A04 = new C29161a8(r1, r4);
        r0.A0L.countDown();
    }
}
