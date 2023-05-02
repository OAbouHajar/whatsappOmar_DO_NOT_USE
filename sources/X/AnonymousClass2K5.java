package X;

import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import java.util.Collections;

/* renamed from: X.2K5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2K5 implements Runnable {
    public final /* synthetic */ C43241zg A00;
    public final /* synthetic */ C16760tb A01;
    public final /* synthetic */ AnonymousClass1XQ A02;
    public final /* synthetic */ C16730tY A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    public /* synthetic */ AnonymousClass2K5(C43241zg r1, C16760tb r2, AnonymousClass1XQ r3, C16730tY r4, byte[] bArr, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A07 = bArr;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
    }

    public final void run() {
        AnonymousClass1XP r9;
        C16760tb r6 = this.A01;
        byte[] bArr = this.A07;
        C43241zg r7 = this.A00;
        AnonymousClass1XQ r3 = this.A02;
        C16730tY r4 = this.A03;
        boolean z2 = this.A04;
        boolean z3 = this.A05;
        boolean z4 = this.A06;
        C16870tm A0F = r7.A00().A0F();
        if (bArr == null && A0F != null && A0F.A04()) {
            bArr = A0F.A07();
        }
        for (C16740tZ A0d : Collections.unmodifiableList(r7.A01)) {
            r6.A0e.A0d(A0d, 1);
        }
        AnonymousClass1HE r8 = r6.A16;
        AnonymousClass1XJ r10 = new AnonymousClass1XJ((Integer) null, true, r7.A04(), r7.A03());
        if (r4 == null || (r9 = r8.A01(r4)) == null) {
            r9 = (AnonymousClass1XP) r3;
        }
        r8.A0S.execute(new RunnableRunnableShape8S0200000_I0_6(r8, 21, r7));
        C47542Jk r62 = new C47542Jk(r7, r8, r9, r10, bArr, z3, z4, z2, true);
        C28831Xx r0 = r8.A0P;
        if (r0 != null) {
            r0.execute(r62);
        } else {
            r8.A0O.Acl(r62);
        }
    }
}
