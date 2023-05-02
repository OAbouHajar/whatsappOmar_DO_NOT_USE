package X;

/* renamed from: X.64H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64H implements Runnable {
    public final /* synthetic */ C112825ja A00;

    public /* synthetic */ AnonymousClass64H(C112825ja r1) {
        this.A00 = r1;
    }

    public final void run() {
        C112825ja r3 = this.A00;
        String str = r3.A0m;
        AnonymousClass00B.A06(str);
        r3.A0t.A06(AnonymousClass000.A0h(str, AnonymousClass000.A0r("onPayRequestFromNonWa; request is paid; transaction id: ")));
        r3.A07.A0g(r3.A0m, 1, 401, r3.A05.A00(), r3.A05.A00());
        r3.A05.A0K(new C1213165a(r3.A07.A0M((String) null, r3.A0m), r3));
    }
}
