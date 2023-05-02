package X;

import android.content.Context;

/* renamed from: X.5uq  reason: invalid class name and case insensitive filesystem */
public class C118535uq {
    public static C16980tz A0B;
    public static C114565ny A0C;
    public static C114515nt A0D;
    public final C16300so A00;
    public final C17190ug A01;
    public final C112245iB A02;
    public final AnonymousClass69M A03;
    public final C18490wm A04;
    public final C18300wT A05;
    public final C224918d A06;
    public final C18280wR A07;
    public final C16320sq A08;
    public final C118985vj A09;
    public final C116525rW A0A;

    public C118535uq(C16300so r18, C14870pt r19, C16040sK r20, C16980tz r21, C17190ug r22, AnonymousClass60V r23, AnonymousClass69M r24, C18340wX r25, AnonymousClass4XO r26, C18490wm r27, C18300wT r28, C18310wU r29, C224918d r30, AnonymousClass61W r31, C18280wR r32, C16320sq r33, C118985vj r34) {
        this.A00 = r18;
        C16320sq r14 = r33;
        this.A08 = r14;
        C17190ug r6 = r22;
        this.A01 = r6;
        C18280wR r13 = r32;
        this.A07 = r13;
        this.A05 = r28;
        this.A09 = r34;
        this.A06 = r30;
        this.A04 = r27;
        AnonymousClass69M r8 = r24;
        this.A03 = r8;
        Context context = r21.A00;
        A0B = r21;
        if (C116525rW.A02 == null) {
            synchronized (C116525rW.class) {
                if (C116525rW.A02 == null) {
                    C116525rW.A02 = new C116525rW();
                    C116525rW.A01 = r34;
                }
            }
        }
        C116525rW r0 = C116525rW.A02;
        this.A0A = r0;
        String A062 = r20.A06();
        AnonymousClass00B.A06(A062);
        AnonymousClass00B.A06(r0);
        this.A02 = new C112245iB(context, r19, r6, r23, r8, r25, r26, r29, r31, r13, r14, A062, r0);
    }

    public synchronized void A00() {
        C18280wR r8 = this.A07;
        C116525rW r10 = this.A0A;
        C16300so r3 = this.A00;
        boolean A1P = AnonymousClass000.A1P(this.A05.A01().getBoolean("payments_sandbox", false) ? 1 : 0);
        AnonymousClass69M r5 = this.A03;
        C112245iB r4 = this.A02;
        C118985vj r9 = this.A09;
        C114565ny r2 = new C114565ny(r3, r4, r5, this.A04, this.A06, r8, r9, r10, A1P);
        A0C = r2;
        C13700nu.A0W(r2, this.A08);
    }
}
