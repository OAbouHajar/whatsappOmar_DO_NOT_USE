package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Hp  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Hp implements Runnable {
    public final /* synthetic */ C27101Ql A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass22J A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass3Hp(C27101Ql r1, String str, AnonymousClass22J r3, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
        this.A03 = z2;
        this.A04 = z3;
    }

    public final void run() {
        C27101Ql r6 = this.A00;
        String str = this.A01;
        AnonymousClass22J r4 = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        C18450wi.A0H(str, 1);
        C214013y r7 = r6.A07;
        C19500yX r2 = r7.A00;
        r2.ALE(354170068);
        r7.A01("start_download");
        r2.AKi(354170068, C78063x2.A00.A00, str);
        String str2 = "";
        C37771pi A002 = C214814g.A00("meta-avatar", "Avatars", "Meta", "", str2, "", "", C440222l.A00);
        AtomicBoolean atomicBoolean = r6.A0F;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            r7.A00(AnonymousClass42P.CANCEL);
            r4.AIU(Boolean.FALSE);
            return;
        }
        r6.A00.set(A002.A0F);
        AnonymousClass22J r10 = r4;
        C37771pi r9 = A002;
        C27101Ql r8 = r6;
        r6.A01.A0K(new AnonymousClass563(r8, r9, r10, z2, z3));
    }
}
