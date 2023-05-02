package X;

import android.content.Context;
import com.facebook.redex.IDxNFunctionShape138S0100000_3_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5iX  reason: invalid class name and case insensitive filesystem */
public class C112465iX extends C112485iZ {
    public final /* synthetic */ C1222668x A00;
    public final /* synthetic */ C118805vH A01;
    public final /* synthetic */ AnonymousClass5w9 A02;
    public final /* synthetic */ Integer A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112465iX(Context context, C14870pt r8, C18340wX r9, AnonymousClass4XO r10, C1222668x r11, C118805vH r12, AnonymousClass5w9 r13, Integer num) {
        super(context, r8, r9, r10, "upi-get-vpa");
        this.A01 = r12;
        this.A02 = r13;
        this.A03 = num;
        this.A00 = r11;
    }

    public void A03(AnonymousClass2HJ r1) {
        super.A03(r1);
        A06(r1);
    }

    public void A04(AnonymousClass2HJ r1) {
        super.A04(r1);
        A06(r1);
    }

    public void A05(C28371Vv r29) {
        Class<String> cls = String.class;
        try {
            AnonymousClass5w9 r1 = this.A02;
            C28371Vv r3 = r29;
            C28371Vv.A06(r3, "iq");
            Long A0X = AnonymousClass3K2.A0X();
            Long A0Y = AnonymousClass3K2.A0Y();
            Class<String> cls2 = cls;
            String[] strArr = {"account", "action"};
            C32271fx.A01((C16300so) null, r3, cls2, A0X, A0Y, "upi-get-vpa", strArr, false);
            String[] strArr2 = {"account", "version"};
            C32271fx.A01((C16300so) null, r3, cls2, A0X, A0Y, "1", strArr2, false);
            String[] strArr3 = {"account", "user"};
            Long A0a = AnonymousClass3K2.A0a();
            C28371Vv r20 = r3;
            Class<String> cls3 = cls;
            Object A012 = C32271fx.A01((C16300so) null, r20, cls3, A0a, 200L, (Object) null, new String[]{"account", "vpa"}, false);
            Object A002 = C32271fx.A00((C16300so) null, r20, cls3, A0a, 1000L, (Object) null, new String[]{"account", "user-name"}, false);
            String A06 = C32271fx.A06(r3, C115705qB.A01, new String[]{"account", "nodal"});
            String A062 = C32271fx.A06(r3, C115705qB.A00, new String[]{"account", "nodal-allowed"});
            String A063 = C32271fx.A06(r3, C115705qB.A02, new String[]{"account", "notif-allowed"});
            C32271fx.A03(r3, new IDxNFunctionShape138S0100000_3_I1(r1.A00, 2), new String[0]);
            C111765hN r7 = new C111765hN();
            r7.A05 = (UserJid) C32271fx.A01((C16300so) null, r3, UserJid.class, A0X, A0Y, (Object) null, strArr3, false);
            r7.A02 = C110105dW.A0J(C110105dW.A0L(), cls, A012, "upiHandle");
            r7.A03 = (String) C32271fx.A01((C16300so) null, r20, cls3, A0a, 100L, (Object) null, new String[]{"account", "vpa-id"}, false);
            r7.A01 = C110105dW.A0J(C110105dW.A0L(), cls, A002, "accountHolderName");
            boolean equals = A06.equals("1");
            r7.A04 = equals;
            r7.A05 = A062.equals("1");
            r7.A06 = A063.equals("1");
            if (equals) {
                r7.A02 = null;
                r7.A03 = null;
            }
            C118805vH r5 = this.A01;
            C42511xv A013 = r5.A07.A01();
            C13700nu.A0W(new C111745hL(A013, r7), A013.A03);
            r5.A09.A0A(this.A03, "upi-get-vpa", 2);
            C1222668x r0 = this.A00;
            if (r0 != null) {
                r0.AP5(r7);
            }
        } catch (AnonymousClass1W9 unused) {
            Log.w("PAY: IndiaUpiContactActions : invalid node");
            A06(C110115dX.A0N());
        }
    }

    public final void A06(AnonymousClass2HJ r4) {
        this.A01.A09.A07(r4, this.A03, "upi-get-vpa");
        C1222668x r0 = this.A00;
        if (r0 != null) {
            r0.AQW(r4);
        }
    }
}
