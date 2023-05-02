package X;

import java.util.Map;

/* renamed from: X.56I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56I implements Runnable {
    public final /* synthetic */ AnonymousClass1JD A00;
    public final /* synthetic */ C35001lD A01;
    public final /* synthetic */ C118755vC A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public /* synthetic */ AnonymousClass56I(AnonymousClass1JD r1, C35001lD r2, C118755vC r3, String str, String str2, Map map) {
        this.A00 = r1;
        this.A03 = str;
        this.A05 = map;
        this.A04 = str2;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass1JD r0 = this.A00;
        String str = this.A03;
        Map map = this.A05;
        String str2 = this.A04;
        AnonymousClass1JD.A00(r0, this.A01, this.A02, str, str2, map);
    }
}
