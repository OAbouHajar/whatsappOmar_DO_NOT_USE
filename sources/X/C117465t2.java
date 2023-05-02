package X;

/* renamed from: X.5t2  reason: invalid class name and case insensitive filesystem */
public class C117465t2 {
    public final AnonymousClass2HJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C117465t2(C28371Vv r5) {
        String A0N = r5.A0N("owner-name", (String) null);
        AnonymousClass00B.A06(A0N);
        this.A04 = A0N;
        String A0N2 = r5.A0N("business-name", (String) null);
        AnonymousClass00B.A06(A0N2);
        this.A02 = A0N2;
        String A0N3 = r5.A0N("verify-type", (String) null);
        AnonymousClass00B.A06(A0N3);
        this.A05 = A0N3;
        this.A01 = r5.A0N("bank-name", (String) null);
        C28371Vv A0J = r5.A0J("merchant");
        AnonymousClass00B.A06(A0J);
        String A0N4 = A0J.A0N("credential-id", (String) null);
        AnonymousClass00B.A06(A0N4);
        this.A03 = A0N4;
        if (r5.A0N("error-code", (String) null) != null) {
            AnonymousClass2HJ A0N5 = C110115dX.A0N();
            this.A00 = A0N5;
            int A002 = C29501aj.A00(r5.A0N("error-code", (String) null), 0);
            String A0N6 = r5.A0N("error-text", (String) null);
            A0N5.A00 = A002;
            A0N5.A08 = A0N6;
        }
    }
}
