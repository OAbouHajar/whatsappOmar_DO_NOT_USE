package X;

/* renamed from: X.56R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56R implements Runnable {
    public final /* synthetic */ AnonymousClass4WX A00;
    public final /* synthetic */ AnonymousClass1JL A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass56R(AnonymousClass4WX r1, AnonymousClass1JL r2, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = num;
    }

    public final void run() {
        AnonymousClass1JL r4 = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        AnonymousClass4WX r3 = this.A00;
        String str3 = this.A05;
        String str4 = this.A06;
        String str5 = this.A07;
        Integer num = this.A02;
        C18450wi.A0J(str, str2);
        C18290wS r0 = r4.A04;
        r0.A06();
        C30671cl A002 = AnonymousClass160.A00(str, r0.A09.A0B());
        if (A002 != null) {
            r4.A02.A0K(new AnonymousClass3I7(A002, r3, r4, num, str2, str3, str4, str5));
        }
    }
}
