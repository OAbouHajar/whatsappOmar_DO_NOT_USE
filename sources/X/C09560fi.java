package X;

/* renamed from: X.0fi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09560fi implements Runnable {
    public final /* synthetic */ AnonymousClass0d5 A00;

    public /* synthetic */ C09560fi(AnonymousClass0d5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0d5 r6 = this.A00;
        if (r6.A00 == 0) {
            r6.A00 = 1;
            C06530Wm A002 = C06530Wm.A00();
            String str = AnonymousClass0d5.A0C;
            StringBuilder A0r = AnonymousClass000.A0r("onAllConstraintsMet for ");
            AnonymousClass0R5 r7 = r6.A08;
            A002.A02(str, AnonymousClass000.A0f(r7, A0r));
            C08060cy r3 = r6.A06;
            if (r3.A04.A04((AnonymousClass0OP) null, r6.A05)) {
                AnonymousClass0UY r5 = r3.A07;
                synchronized (r5.A01) {
                    C06530Wm.A00().A02(AnonymousClass0UY.A04, AnonymousClass000.A0e(r7, "Starting timer for ", AnonymousClass000.A0o()));
                    r5.A00(r7);
                    C10060gW r32 = new C10060gW(r7, r5);
                    r5.A03.put(r7, r32);
                    r5.A02.put(r7, r6);
                    ((C08040cw) r5.A00).A00.postDelayed(r32, 600000);
                }
                return;
            }
            r6.A00();
            return;
        }
        C06530Wm.A00().A02(AnonymousClass0d5.A0C, AnonymousClass000.A0f(r6.A08, AnonymousClass000.A0r("Already started work for ")));
    }
}
