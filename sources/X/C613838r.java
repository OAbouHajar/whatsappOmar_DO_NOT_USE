package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.38r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C613838r {
    public final /* synthetic */ AnonymousClass211 A00;
    public final /* synthetic */ AnonymousClass1XP A01;
    public final /* synthetic */ AnonymousClass213 A02;
    public final /* synthetic */ C27401Rp A03;
    public final /* synthetic */ AnonymousClass210 A04;
    public final /* synthetic */ C62033Bj A05;

    public /* synthetic */ C613838r(AnonymousClass211 r1, AnonymousClass1XP r2, AnonymousClass213 r3, C27401Rp r4, AnonymousClass210 r5, C62033Bj r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final void A00(File file, boolean z2) {
        C27401Rp r1 = this.A03;
        AnonymousClass213 r3 = this.A02;
        AnonymousClass1XP r6 = this.A01;
        AnonymousClass211 r5 = this.A00;
        AnonymousClass210 r0 = this.A04;
        C62033Bj r10 = this.A05;
        File file2 = file;
        if (z2 && file != null) {
            r3.A02.A04(new AnonymousClass4MO(file2, file2.getName(), C18830xK.A03(C18830xK.A01(file2), 100), file2.length()));
        }
        C102684zM r9 = new C102684zM(r6, r3, r1, r0);
        AnonymousClass215 r8 = r3.A06;
        AnonymousClass216 r7 = r3.A05;
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(UUID.randomUUID(), A0o);
        r1.A05.A01(new C43391zv(r5, r6, r7, r8, r9, r10, r1.A01(file2, AnonymousClass000.A0h(".mp4", A0o)), file2, r0.A02, r0.A03), AnonymousClass1XK.A04);
    }
}
