package X;

/* renamed from: X.3Gd  reason: invalid class name and case insensitive filesystem */
public class C63103Gd implements C19550yc {
    public final AnonymousClass4EL A00;
    public final C17190ug A01;

    public C63103Gd(AnonymousClass4EL r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C16050sL r15, boolean z2) {
        C17190ug r7 = this.A01;
        String A02 = r7.A02();
        C35081lL[] r3 = new C35081lL[1];
        boolean A03 = C35081lL.A03("state", z2 ? "on" : "off", r3);
        C28371Vv r4 = new C28371Vv(new C28371Vv("group_join", r3), "membership_approval_mode", (C35081lL[]) null);
        C35081lL[] r32 = new C35081lL[4];
        C35081lL.A02("xmlns", "w:g2", r32, A03 ? 1 : 0);
        C35081lL.A02("id", A02, r32, 1);
        C35081lL.A02("type", "set", r32, 2);
        r7.A0G(this, C28371Vv.A03(r15, r4, r32, 3), A02, 337, 20000);
    }

    public void APb(String str) {
        C17240ul.A01(1008, (Object) null);
        C17240ul.A01(3012, (Object) null);
    }

    public void AQe(C28371Vv r5, String str) {
        int i2;
        C28371Vv A0J = r5.A0J("error");
        int i3 = -2;
        if (A0J != null) {
            i3 = A0J.A0A("code", -2);
        }
        if (i3 != -2) {
            if (i3 == -1) {
                C17240ul.A01(1008, (Object) null);
            } else if (i3 != 400) {
                i2 = 3010;
                if (i3 != 401) {
                    i2 = 3011;
                    if (i3 != 403) {
                        if (!(i3 == 404 || i3 == 500)) {
                            return;
                        }
                    }
                }
                C17240ul.A01(i2, (Object) null);
            }
        }
        i2 = 3012;
        C17240ul.A01(i2, (Object) null);
    }

    public void AYG(C28371Vv r1, String str) {
    }
}
