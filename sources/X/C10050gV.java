package X;

/* renamed from: X.0gV  reason: invalid class name and case insensitive filesystem */
public class C10050gV implements Runnable {
    public final /* synthetic */ C10650hT A00;
    public final /* synthetic */ AnonymousClass0H9 A01;

    public C10050gV(C10650hT r1, AnonymousClass0H9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C10650hT r6 = this.A00;
        AnonymousClass0H9 r3 = r6.A04;
        if (!r3.isCancelled()) {
            try {
                AnonymousClass0RE r5 = (AnonymousClass0RE) this.A01.get();
                if (r5 != null) {
                    C06530Wm A002 = C06530Wm.A00();
                    String str = C10650hT.A06;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("Updating notification for ");
                    A002.A02(str, AnonymousClass000.A0h(r6.A03.A0G, A0o));
                    r3.A08(r6.A01.Ady(r6.A00, r5, r6.A02.A01.A08));
                    return;
                }
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append("Worker was marked important (");
                A0o2.append(r6.A03.A0G);
                throw AnonymousClass000.A0V(AnonymousClass000.A0h(") but did not provide ForegroundInfo", A0o2));
            } catch (Throwable th) {
                r3.A0A(th);
            }
        }
    }
}
