package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2HJ;
import X.AnonymousClass3K4;
import X.AnonymousClass4QV;
import X.AnonymousClass50C;
import X.AnonymousClass5u7;
import X.AnonymousClass5wR;
import X.AnonymousClass5wX;
import X.C004101u;
import X.C110105dW;
import X.C116425rM;
import X.C117535t9;
import X.C117915tl;
import X.C119345ww;
import X.C1222268t;
import X.C1223569g;
import X.C18310wU;
import X.C28371Vv;
import X.C32461gQ;
import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.Collections;
import java.util.List;

public class IDxTCallbackShape11S0400000_3_I1 implements C1222268t {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxTCallbackShape11S0400000_3_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public void AQW(AnonymousClass2HJ r3) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass5u7) this.A02).A00(r3);
                return;
            case 1:
                ((C1223569g) this.A01).AQX(r3, (Integer) this.A02);
                return;
            default:
                ((PinBottomSheetDialogFragment) this.A03).A1N();
                ((C119345ww) this.A00).A02();
                return;
        }
    }

    public void AYC(String str) {
        String str2 = str;
        switch (this.A04) {
            case 0:
                C117535t9 r12 = (C117535t9) this.A00;
                Object[] objArr = new Object[0];
                byte[] A002 = AnonymousClass5wR.A00(Boolean.TRUE, str2, "RECOVERACCOUNT", (String) null, (byte[]) null, objArr, C110105dW.A03(r12.A06.A01));
                AnonymousClass50C r6 = ((C117915tl) this.A03).A00;
                C116425rM r2 = new C116425rM(Long.valueOf(Long.parseLong(r6.A04)), r6.A05, r6.A03, r6.A8P(A002, C004101u.A0E(16)));
                Object obj = this.A02;
                C18310wU r14 = r12.A02;
                String A022 = r14.A08.A02();
                AnonymousClass4QV r62 = new AnonymousClass4QV(A022);
                C32461gQ A0X = C110105dW.A0X();
                C32461gQ A0S = AnonymousClass3K4.A0S("account");
                C32461gQ.A00(A0S, "action", "recover-account");
                C32461gQ A0S2 = AnonymousClass3K4.A0S("pin");
                C28371Vv r1 = r2.A00;
                A0S2.A05(r1, AnonymousClass000.A0u());
                List list = Collections.EMPTY_LIST;
                A0S2.A07(r1, list, AnonymousClass000.A0u());
                AnonymousClass3K4.A0s(A0S2, A0S);
                AnonymousClass3K4.A0s(A0S, A0X);
                A0X.A05(r62.A00, AnonymousClass000.A0u());
                r62.A00(A0X, list);
                r14.A0G(new IDxRCallbackShape20S0200000_3_I1((Context) this.A01, r12.A01, r12.A00, obj, r12, 1), A0X.A01(), A022, 0);
                return;
            case 1:
                AnonymousClass5wX r4 = (AnonymousClass5wX) this.A00;
                Object[] objArr2 = new Object[0];
                String str3 = str2;
                AnonymousClass5wX.A00(r4, (C1223569g) this.A01, ((C117915tl) this.A03).A01(AnonymousClass5wR.A00(Boolean.TRUE, str3, "AUTH", (String) null, (byte[]) null, objArr2, C110105dW.A03(r4.A0O.A01))), C110105dW.A0f(r4.A02, r4.A04));
                return;
            default:
                ((C119345ww) this.A00).A06((PinBottomSheetDialogFragment) this.A03, ((C117915tl) this.A01).A01(AnonymousClass5wR.A00(Boolean.TRUE, str2, "AUTH", (String) null, (byte[]) null, new Object[0], C110105dW.A03(((AnonymousClass5wR) this.A02).A01))));
                return;
        }
    }
}
