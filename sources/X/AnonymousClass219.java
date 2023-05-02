package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.219  reason: invalid class name */
public final /* synthetic */ class AnonymousClass219 implements AnonymousClass218 {
    public final /* synthetic */ AnonymousClass211 A00;
    public final /* synthetic */ AnonymousClass1XP A01;
    public final /* synthetic */ AnonymousClass213 A02;
    public final /* synthetic */ C27401Rp A03;
    public final /* synthetic */ AnonymousClass210 A04;

    public /* synthetic */ AnonymousClass219(AnonymousClass211 r1, AnonymousClass1XP r2, AnonymousClass213 r3, C27401Rp r4, AnonymousClass210 r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void ASr(C62033Bj r21) {
        C27401Rp r3 = this.A03;
        AnonymousClass1XP r6 = this.A01;
        AnonymousClass211 r5 = this.A00;
        AnonymousClass210 r4 = this.A04;
        AnonymousClass213 r0 = this.A02;
        C102694zN r9 = new C102694zN(r6, r0, r3, r4);
        AnonymousClass215 r8 = r0.A06;
        AnonymousClass216 r7 = r0.A05;
        File file = r4.A07;
        AnonymousClass00B.A06(file);
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(".mp4");
        r3.A05.A01(new C43431zz(r5, r6, r7, r8, r9, r21, file, r3.A01(file, sb.toString()), r4.A02, r4.A03, r4.A0G, r4.A0D, r4.A0F), AnonymousClass1XK.A0X);
    }
}
