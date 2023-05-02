package com.obwhatsapp.payments.actions;

import X.AnonymousClass000;
import X.AnonymousClass1W5;
import X.AnonymousClass1W9;
import X.AnonymousClass2HJ;
import X.AnonymousClass3K2;
import X.AnonymousClass4XO;
import X.AnonymousClass68S;
import X.C110115dX;
import X.C110615eX;
import X.C112195i6;
import X.C112215i8;
import X.C112285iF;
import X.C112485iZ;
import X.C116215r0;
import X.C116455rP;
import X.C117365ss;
import X.C14870pt;
import X.C16300so;
import X.C18340wX;
import X.C28371Vv;
import X.C32271fx;
import X.C53872gR;
import android.content.Context;
import android.util.Base64;
import com.facebook.redex.IDxNFunctionShape44S0200000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class IDxNCallbackShape9S0300000_3_I1 extends C112485iZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape9S0300000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C112195i6 r12, C116215r0 r13, C116455rP r14) {
        super(context, r9, r10, r11, "get-purpose-limiting-key");
        this.A00 = r12;
        this.A01 = r13;
        this.A02 = r14;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape9S0300000_3_I1(Context context, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, AnonymousClass68S r12, C112285iF r13, Integer num) {
        super(context, r9, r10, r11, "upi-send-to-vpa");
        this.A00 = r13;
        this.A01 = r12;
        this.A02 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxNCallbackShape9S0300000_3_I1(Context context, C14870pt r9, C53872gR r10, C18340wX r11, AnonymousClass4XO r12, C112215i8 r13, C110615eX r14) {
        super(context, r9, r11, r12, "deregister-alias");
        this.A00 = r13;
        this.A02 = r14;
        this.A01 = r10;
    }

    public void A03(AnonymousClass2HJ r4) {
        switch (this.A03) {
            case 0:
                ((C112215i8) this.A00).A03.AKK(r4, 23);
                super.A03(r4);
                ((C110615eX) this.A02).A05((C53872gR) this.A01, r4);
                return;
            case 1:
                return;
            default:
                super.A03(r4);
                ((C112285iF) this.A00).A06.A07(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((AnonymousClass68S) this.A01).AUT(r4);
                return;
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        switch (this.A03) {
            case 0:
                ((C112215i8) this.A00).A03.AKK(r4, 23);
                super.A04(r4);
                ((C110615eX) this.A02).A05((C53872gR) this.A01, r4);
                return;
            case 1:
                return;
            default:
                super.A04(r4);
                ((C112285iF) this.A00).A06.A07(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((AnonymousClass68S) this.A01).AUT(r4);
                return;
        }
    }

    public void A05(C28371Vv r33) {
        IllegalStateException illegalStateException;
        C28371Vv A0J;
        C28371Vv r3 = r33;
        switch (this.A03) {
            case 0:
                C112215i8 r5 = (C112215i8) this.A00;
                r5.A03.AKK((AnonymousClass2HJ) null, 23);
                super.A05(r3);
                C28371Vv A0X = C110115dX.A0X(r3);
                if (A0X != null && (A0J = A0X.A0J("alias")) != null) {
                    C110615eX r2 = (C110615eX) this.A02;
                    try {
                        r2.A05(C112485iZ.A01(A0J), (AnonymousClass2HJ) null);
                        return;
                    } catch (AnonymousClass1W9 unused) {
                        r5.A04.A05("onDeregisterVpaAlias/onResponseSuccess/corrupt stream exception");
                        r2.A05((C53872gR) null, new AnonymousClass2HJ(500));
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                try {
                    C16300so r7 = ((C112195i6) this.A00).A01;
                    C28371Vv.A06(r3, "iq");
                    C28371Vv r12 = ((C116455rP) this.A02).A00;
                    Class<String> cls = String.class;
                    Long A0X2 = AnonymousClass3K2.A0X();
                    Long A0Y = AnonymousClass3K2.A0Y();
                    Object A012 = C32271fx.A01((C16300so) null, r12, cls, A0X2, A0Y, (Object) null, new String[]{"account", "action"}, false);
                    C28371Vv r17 = r3;
                    Class<String> cls2 = cls;
                    Long l2 = A0X2;
                    Long l3 = A0Y;
                    C32271fx.A01((C16300so) null, r17, cls2, l2, l3, A012, new String[]{"account", "action"}, true);
                    Class<Long> cls3 = Long.class;
                    C28371Vv r25 = r3;
                    Long l4 = A0Y;
                    Long A0Z = AnonymousClass3K2.A0Z();
                    C32271fx.A01((C16300so) null, r25, cls3, A0Z, l4, (Object) null, new String[]{"account", "expiry-ts"}, false);
                    Class<String> cls4 = cls;
                    C32271fx.A01((C16300so) null, r25, cls4, AnonymousClass3K2.A0a(), 10000L, (Object) null, new String[]{"account", "purpose-enc-certificate"}, false);
                    C32271fx.A01((C16300so) null, r17, cls2, l2, l3, (Object) null, new String[]{"account", "signature"}, false);
                    C32271fx.A03(r3, new IDxNFunctionShape44S0200000_3_I1(r7, r12, 3), new String[0]);
                    int intValue = ((Number) C32271fx.A01((C16300so) null, r25, cls3, A0X2, l4, (Object) null, new String[]{"account", "key-version"}, false)).intValue();
                    long longValue = ((Number) C32271fx.A01((C16300so) null, r25, cls3, A0Z, l4, (Object) null, new String[]{"account", "server-ts"}, false)).longValue();
                    C117365ss r4 = new C117365ss(Base64.decode((String) C32271fx.A01((C16300so) null, r25, cls4, A0X2, A0Y, (Object) null, new String[]{"account", "data"}, false), 8), intValue, longValue);
                    IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C116215r0) this.A01).A00;
                    AnonymousClass1W5 A002 = AnonymousClass1W5.A00();
                    AtomicBoolean atomicBoolean = A002.A00;
                    if (!atomicBoolean.get()) {
                        r4.A01 = A002.A02;
                        if (!atomicBoolean.get()) {
                            r4.A00 = A002.A01;
                            indiaUpiSendPaymentActivity.A0R = r4;
                            return;
                        }
                        illegalStateException = AnonymousClass000.A0V("key has been destroyed");
                    } else {
                        illegalStateException = AnonymousClass000.A0V("key has been destroyed");
                    }
                    throw illegalStateException;
                } catch (AnonymousClass1W9 unused2) {
                    Log.e("CorruptStreamException when parsing UPIGetPurposeLimitingKeyResponseSuccess");
                    return;
                }
            default:
                super.A05(r3);
                ((C112285iF) this.A00).A06.A0A((Integer) this.A02, "upi-send-to-vpa", 2);
                ((AnonymousClass68S) this.A01).AUT((AnonymousClass2HJ) null);
                return;
        }
    }
}
