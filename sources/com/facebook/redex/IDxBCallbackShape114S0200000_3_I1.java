package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1Z7;
import X.AnonymousClass2HJ;
import X.AnonymousClass5x7;
import X.AnonymousClass68N;
import X.C110655eb;
import X.C117655tL;
import X.C30801cy;
import X.C39931tI;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public class IDxBCallbackShape114S0200000_3_I1 implements AnonymousClass68N {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxBCallbackShape114S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void ARo(AnonymousClass2HJ r9, List list) {
        JSONArray A002;
        if (this.A02 != 0) {
            C110655eb r7 = (C110655eb) this.A00;
            C39931tI r6 = (C39931tI) this.A01;
            C30801cy A012 = C110655eb.A01(r7);
            if (r9 == null) {
                JSONArray A003 = AnonymousClass5x7.A00(list);
                C117655tL r4 = new C117655tL(4);
                HashMap A0x = AnonymousClass000.A0x();
                r4.A07 = A0x;
                A0x.put("update", "1");
                HashMap hashMap = r4.A07;
                AnonymousClass00B.A06(A003);
                hashMap.put("banks", A003.toString());
                String str = r6.A02;
                if (TextUtils.isEmpty(str)) {
                    str = r7.A0B.A07();
                }
                r4.A07.put("business_name", str);
                r4.A06 = "brpay_m_payout_info";
                A012.A0B(r4);
                return;
            }
            C117655tL r0 = new C117655tL(7);
            r0.A04 = r9;
            A012.A0B(r0);
            return;
        }
        AnonymousClass1Z7 r3 = (AnonymousClass1Z7) this.A01;
        if (r9 != null || (A002 = AnonymousClass5x7.A00(list)) == null) {
            r3.A00("on_failure");
            return;
        }
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("banks", A002.toString());
        r3.A01("on_success", A0x2);
    }
}
