package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.52v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1038152v implements AnonymousClass1WE {
    public final /* synthetic */ C35361lo A00;
    public final /* synthetic */ AnonymousClass1XP A01;
    public final /* synthetic */ C47222Ic A02;
    public final /* synthetic */ C18270wQ A03;
    public final /* synthetic */ CountDownLatch A04;

    public /* synthetic */ C1038152v(C35361lo r1, AnonymousClass1XP r2, C47222Ic r3, C18270wQ r4, CountDownLatch countDownLatch) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = countDownLatch;
    }

    public final void accept(Object obj) {
        C18270wQ r11 = this.A03;
        AnonymousClass1XP r1 = this.A01;
        C35361lo r10 = this.A00;
        C47222Ic r9 = this.A02;
        CountDownLatch countDownLatch = this.A04;
        if (AnonymousClass000.A0D(obj) == 0) {
            AnonymousClass1XS r12 = r1.A0H;
            if (r12.A00() != null) {
                C31761ez r13 = ((AnonymousClass21B) r12.A00()).A02;
                if (r13.A00() != null) {
                    byte[] bArr = r13.A00().A01;
                    long j2 = r13.A00().A00;
                    String A05 = r13.A05();
                    String A042 = r13.A04();
                    String A032 = r13.A03();
                    boolean A0C = r11.A04.A0C(1084);
                    r10.A08 = bArr;
                    r10.A00 = j2;
                    r10.A04 = A05;
                    r10.A03 = A042;
                    r10.A02 = A032;
                    r10.A07 = A0C;
                    r9.A00 = 1;
                    countDownLatch.countDown();
                }
            }
        }
        r9.A01 = 3;
        countDownLatch.countDown();
    }
}
