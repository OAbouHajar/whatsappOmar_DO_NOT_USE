package X;

import com.facebook.redex.IDxRCallbackShape48S0200000_1_I0;

/* renamed from: X.14E  reason: invalid class name */
public abstract class AnonymousClass14E {
    public final int A00;
    public final C16300so A01;
    public final C17190ug A02;
    public final String A03;

    public AnonymousClass14E(C16300so r1, C17190ug r2, String str, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
        this.A03 = str;
    }

    public final void A00(AnonymousClass5SZ r14) {
        C32461gQ r5;
        C16440t3 r0;
        C17190ug r6 = this.A02;
        String A022 = r6.A02();
        C32461gQ r2 = new C32461gQ("iq");
        r2.A02(new C35081lL("smax_id", this.A00));
        r2.A02(new C35081lL("id", A022));
        r2.A02(new C35081lL("xmlns", this.A03));
        r2.A02(new C35081lL("type", "get"));
        r2.A02(new C35081lL("to", "s.whatsapp.net"));
        if (this instanceof AnonymousClass14F) {
            C32461gQ r1 = new C32461gQ("supported_certificates");
            r1.A08("rsa2048");
            r2.A03(r1.A01());
            r5 = new C32461gQ("auth_metadata");
            r0 = ((AnonymousClass14F) this).A00;
        } else if (this instanceof AnonymousClass14G) {
            AnonymousClass14G r3 = (AnonymousClass14G) this;
            r3.A01.A01("fetch_certificate");
            r2.A03(new C32461gQ("password_pem").A01());
            r2.A03(new C32461gQ("payload_enc_certificates").A01());
            r5 = new C32461gQ("timestamp");
            r5.A08(String.valueOf(r3.A00.A00() / 1000));
            r2.A03(r5.A01());
            r6.A0G(new IDxRCallbackShape48S0200000_1_I0(r14, 1, this), r2.A01(), A022, 264, 32000);
        } else {
            C32461gQ r12 = new C32461gQ("supported_certificates");
            r12.A08("rsa2048");
            r2.A03(r12.A01());
            C32461gQ r13 = new C32461gQ("fetch_password_pem");
            r13.A08("true");
            r2.A03(r13.A01());
            r5 = new C32461gQ("auth_metadata");
            r0 = ((AnonymousClass14D) this).A00;
        }
        r5.A02(new C35081lL("timestamp", r0.A00() / 1000));
        r5.A02(new C35081lL("version", 1));
        r2.A03(r5.A01());
        r6.A0G(new IDxRCallbackShape48S0200000_1_I0(r14, 1, this), r2.A01(), A022, 264, 32000);
    }
}
