package X;

import com.facebook.redex.IDxNFunctionShape136S0100000_2_I0;
import java.util.List;

/* renamed from: X.2BM  reason: invalid class name */
public final class AnonymousClass2BM implements C19550yc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2BH A01;
    public final /* synthetic */ AnonymousClass2BI A02;
    public final /* synthetic */ AnonymousClass2BL A03;

    public AnonymousClass2BM(AnonymousClass2BH r1, AnonymousClass2BI r2, AnonymousClass2BL r3, int i2) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r5, String str) {
        String A0N;
        C18450wi.A0H(r5, 1);
        List<C28371Vv> A0O = r5.A0O("error");
        C18450wi.A0B(A0O);
        for (C28371Vv r2 : A0O) {
            if (!(r2 == null || (A0N = r2.A0N("code", (String) null)) == null)) {
                this.A01.AQR(Integer.parseInt(A0N));
            }
        }
    }

    public void AYG(C28371Vv r26, String str) {
        C28371Vv r7 = r26;
        C18450wi.A0H(r7, 1);
        AnonymousClass2BL r4 = this.A03;
        AnonymousClass2BI r2 = this.A02;
        C16300so r14 = r2.A00;
        C28371Vv.A06(r7, "iq");
        C28371Vv r15 = r4.A00;
        Class<String> cls = String.class;
        C32271fx.A01((C16300so) null, r7, cls, -9007199254740991L, 9007199254740991L, "result", new String[]{"type"}, false);
        Class<C16050sL> cls2 = C16050sL.class;
        C16300so r17 = r14;
        C28371Vv r18 = r7;
        Class<C16050sL> cls3 = cls2;
        C32271fx.A01(r17, r18, cls3, -9007199254740991, 9007199254740991, C32271fx.A01(r14, r15, cls2, -9007199254740991, 9007199254740991, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        Object A012 = C32271fx.A01((C16300so) null, r15, cls, -9007199254740991, 9007199254740991, (Object) null, new String[]{"id"}, false);
        C32271fx.A01((C16300so) null, r7, cls, -9007199254740991, 9007199254740991, A012, new String[]{"id"}, true);
        C32271fx.A02(r7, new IDxNFunctionShape136S0100000_2_I0(r14, 0), new String[]{"group"});
        AnonymousClass2BH r3 = this.A01;
        C53262fQ.A07(r14, r2.A01, r7, this.A00);
        r3.onSuccess();
    }
}
