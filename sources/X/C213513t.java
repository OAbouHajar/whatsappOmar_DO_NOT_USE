package X;

import com.facebook.redex.IDxRCallbackShape49S0200000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.13t  reason: invalid class name and case insensitive filesystem */
public abstract class C213513t {
    public final C16300so A00;
    public final C17190ug A01;

    public C213513t(C16300so r1, C17190ug r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass4MF A00(C28371Vv r4) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C28371Vv A0K = r4.A0K("encryption_metadata");
        C28371Vv A0K2 = A0K.A0K("encrypted_key");
        C28371Vv A0K3 = A0K.A0K("nonce");
        C28371Vv A0K4 = A0K.A0K("encrypted_data");
        C28371Vv A0K5 = A0K.A0K("auth_tag");
        byte[] bArr4 = A0K2.A01;
        if (bArr4 != null && (bArr = A0K3.A01) != null && (bArr2 = A0K4.A01) != null && (bArr3 = A0K5.A01) != null) {
            return new AnonymousClass4MF(bArr4, bArr2, bArr3, bArr);
        }
        throw new AnonymousClass1W9("encryption_metadata inner node data missing");
    }

    public void A01(AnonymousClass5SX r16, Object obj, int i2) {
        C32461gQ r2;
        C32461gQ r5;
        C28371Vv A012;
        Object obj2 = obj;
        C17190ug r8 = this.A01;
        String A02 = r8.A02();
        int i3 = i2;
        if (this instanceof C213413s) {
            AnonymousClass4MF r3 = (AnonymousClass4MF) obj2;
            r2 = new C32461gQ("iq");
            r2.A02(new C35081lL("smax_id", i3));
            r2.A02(new C35081lL("id", A02));
            r2.A02(new C35081lL("xmlns", "fb:graphql"));
            r2.A02(new C35081lL("type", "get"));
            r2.A02(new C35081lL((Jid) C34791ks.A00, "to"));
            C32461gQ r6 = new C32461gQ("auth_metadata");
            r6.A02(new C35081lL("timestamp", ((C213413s) this).A00.A00() / 1000));
            r6.A02(new C35081lL("version", "1"));
            r2.A03(r6.A01());
            r5 = new C32461gQ("encryption_metadata");
            r5.A02(new C35081lL("version", "1"));
            r5.A02(new C35081lL("algorithm", "rsa2048"));
            C32461gQ r1 = new C32461gQ("encrypted_key");
            r1.A01 = r3.A01;
            r5.A03(r1.A01());
            C32461gQ r12 = new C32461gQ("encrypted_data");
            r12.A01 = r3.A00;
            r5.A03(r12.A01());
            C32461gQ r13 = new C32461gQ("nonce");
            r13.A01 = r3.A02;
            r5.A03(r13.A01());
            C32461gQ r14 = new C32461gQ("auth_tag");
            r14.A01 = r3.A03;
            A012 = r14.A01();
        } else {
            AnonymousClass4MF r32 = (AnonymousClass4MF) obj2;
            C18450wi.A0H(A02, 1);
            r2 = new C32461gQ("iq");
            r2.A02(new C35081lL("smax_id", i3));
            r2.A02(new C35081lL("id", A02));
            r2.A02(new C35081lL("xmlns", "fb:graphql"));
            r2.A02(new C35081lL("type", "get"));
            r2.A02(new C35081lL((Jid) C34791ks.A00, "to"));
            C32461gQ r7 = new C32461gQ("auth_metadata");
            r7.A02(new C35081lL("timestamp", ((AnonymousClass140) this).A00.A00() / 1000));
            r7.A02(new C35081lL("version", 1));
            r2.A03(r7.A01());
            r5 = new C32461gQ("encryption_metadata");
            r5.A02(new C35081lL("version", 1));
            r5.A02(new C35081lL("algorithm", "rsa2048"));
            C32461gQ r15 = new C32461gQ("encrypted_key");
            byte[] bArr = null;
            r15.A01 = r32 == null ? null : r32.A01;
            r5.A03(r15.A01());
            C32461gQ r17 = new C32461gQ("encrypted_data");
            r17.A01 = r32 == null ? null : r32.A00;
            r5.A03(r17.A01());
            C32461gQ r18 = new C32461gQ("nonce");
            r18.A01 = r32 == null ? null : r32.A02;
            r5.A03(r18.A01());
            C32461gQ r0 = new C32461gQ("auth_tag");
            if (r32 != null) {
                bArr = r32.A03;
            }
            r0.A01 = bArr;
            A012 = r0.A01();
        }
        r5.A03(A012);
        r2.A03(r5.A01());
        r8.A0G(new IDxRCallbackShape49S0200000_2_I0(r16, 0, this), r2.A01(), A02, 264, 32000);
    }
}
