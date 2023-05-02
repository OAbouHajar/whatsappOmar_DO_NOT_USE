package com.obwhatsapp.payments;

import X.AnonymousClass173;
import X.AnonymousClass1GO;
import X.AnonymousClass1MA;
import X.AnonymousClass1TV;
import X.AnonymousClass1Vo;
import X.AnonymousClass1Vt;
import X.AnonymousClass1W1;
import X.AnonymousClass1W9;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.AnonymousClass2HK;
import X.AnonymousClass3AZ;
import X.C14880pu;
import X.C16460t6;
import X.C16740tZ;
import X.C18340wX;
import X.C28371Vv;
import X.C28381Vw;
import X.C28401Vy;
import X.C28411Vz;
import X.C35491m1;
import X.C53282fS;
import X.C53302fU;
import X.C53312fV;
import X.C53342fY;
import X.C53352fZ;
import X.C53372fb;
import X.C53392fd;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IDxRCallbackShape7S0300000_1_I0 extends AnonymousClass2HA {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape7S0300000_1_I0(Context context, C18340wX r2, C14880pu r3, Object obj, Object obj2, Object obj3, int i2) {
        super(context, r2, r3);
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public void A03(AnonymousClass2HJ r3) {
        int i2 = this.A03;
        Object obj = this.A01;
        if (i2 != 0) {
            ((AnonymousClass1TV) obj).AWC(r3);
        } else {
            ((C53372fb) obj).A00(r3);
        }
    }

    public void A04(AnonymousClass2HJ r3) {
        int i2 = this.A03;
        Object obj = this.A01;
        if (i2 != 0) {
            ((AnonymousClass1TV) obj).AWI(r3);
        } else {
            ((C53372fb) obj).A00(r3);
        }
    }

    public void A05(C28371Vv r21) {
        AnonymousClass1Vt r0;
        C28371Vv r2 = r21;
        if (this.A03 != 0) {
            try {
                C28371Vv A0K = r2.A0K("account").A0K("pay");
                String A0M = A0K.A0M("currency");
                String A0M2 = A0K.A0M("amount");
                AnonymousClass1MA r22 = (AnonymousClass1MA) this.A00;
                AnonymousClass173 r5 = r22.A04;
                C28401Vy A002 = !TextUtils.isEmpty(A0M2) ? C28401Vy.A00(A0M2, ((C35491m1) r5.A01(A0M)).A01) : null;
                C16460t6 r3 = r22.A03;
                C16740tZ A003 = C16460t6.A00(r3, (C28381Vw) this.A02);
                if (A003 == null || (r0 = A003.A0L) == null) {
                    A04(new AnonymousClass2HJ());
                    return;
                }
                UserJid userJid = r0.A0E;
                UserJid userJid2 = r0.A0D;
                C28411Vz A012 = r5.A01(A0M);
                AnonymousClass1Vt r52 = A003.A0L;
                AnonymousClass1Vt A013 = AnonymousClass1W1.A01(A012, A002, userJid, userJid2, A0M, (String) null, r52.A0G, 3, 0, r52.A04, r52.A01, 0, r52.A05);
                A013.A06(A003.A0L.A0K);
                r3.A0O(A013, A003.A11);
                ((AnonymousClass1TV) this.A01).AWJ(new AnonymousClass2HK());
            } catch (AnonymousClass1W9 unused) {
                A04(new AnonymousClass2HJ());
            }
        } else {
            try {
                C53372fb r53 = (C53372fb) this.A01;
                AnonymousClass3AZ r32 = new AnonymousClass3AZ(((C53352fZ) this.A00).A00, r2, (C53392fd) this.A02);
                AnonymousClass1GO r8 = r53.A01;
                C53312fV r23 = r53.A02;
                String str = r53.A03;
                C53342fY r7 = r53.A00;
                try {
                    C53302fU r6 = new C53302fU(r8.A09, r23, r32, str);
                    C53282fS r54 = r8.A0G;
                    long j2 = r6.A08.A01;
                    C53302fU r33 = (C53302fU) r54.A02.get(Long.valueOf(j2));
                    if (r33 != null) {
                        r6.A02 = r33.A02;
                        r6.A00 = r33.A00;
                        r6.A01 = r33.A01;
                    }
                    r54.A02(r6, j2);
                    if (r7 != null) {
                        r7.A00(r6);
                    }
                } catch (Exception e2) {
                    Log.e("PAY: PaymentIncentiveManager/processSuccessfulGetOfferDetails : Error while parsing ", e2);
                    r8.A05();
                    if (r7 != null) {
                        Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                        r7.A00.AQQ();
                    }
                }
            } catch (AnonymousClass1W9 e3) {
                Log.e(AnonymousClass1Vo.A01("GetIncentiveOffer", e3.getMessage()));
                ((C53372fb) this.A01).A00(new AnonymousClass2HJ());
            }
        }
    }
}
