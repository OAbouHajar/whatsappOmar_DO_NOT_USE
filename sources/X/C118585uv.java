package X;

/* renamed from: X.5uv  reason: invalid class name and case insensitive filesystem */
public class C118585uv {
    public C117575tD A00;
    public AnonymousClass1Vo A01 = AnonymousClass1Vo.A00("BrazilNetworkManager", "onboarding", "BR");
    public boolean A02;
    public boolean A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C18260wP A06;
    public final C16440t3 A07;
    public final C16980tz A08;
    public final AnonymousClass160 A09;
    public final C17190ug A0A;
    public final C111995hm A0B;
    public final C119315wt A0C;
    public final C18340wX A0D;
    public final C18300wT A0E;
    public final C18310wU A0F;
    public final C119285wq A0G;
    public final C118335uW A0H;

    public C118585uv(C14870pt r4, C16040sK r5, C18260wP r6, C16440t3 r7, C16980tz r8, AnonymousClass160 r9, C17190ug r10, C111995hm r11, C119315wt r12, C18340wX r13, C18300wT r14, C18310wU r15, C119285wq r16, C118335uW r17) {
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = r10;
        this.A0E = r14;
        this.A0F = r15;
        this.A0H = r17;
        this.A0C = r12;
        this.A0D = r13;
        this.A06 = r6;
        this.A0G = r16;
        this.A0B = r11;
    }

    public void A00(String str) {
        C117575tD r3 = this.A00;
        if (r3 == null) {
            String A062 = this.A0E.A06();
            if (A062 == null) {
                this.A01.A06("No wallet Id stored on client, ELO node cannot be inserted in request");
            }
            r3 = new C117575tD((String) null, str, A062, 5);
            this.A00 = r3;
        }
        r3.A02 = str;
    }
}
