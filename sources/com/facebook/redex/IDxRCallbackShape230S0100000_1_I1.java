package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass4M5;
import X.C13680ns;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16060sN;
import X.C16300so;
import X.C17240ul;
import X.C17780vd;
import X.C19550yc;
import X.C28371Vv;
import X.C30361cE;
import X.C30371cF;
import X.C30641ci;
import X.C34451kH;
import X.C39291sE;
import X.C53262fQ;
import X.C82664Dr;
import X.C87974Zk;
import android.text.TextUtils;
import android.util.Pair;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;

public class IDxRCallbackShape230S0100000_1_I1 implements C19550yc {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape230S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void APb(String str) {
        if (this.A01 != 0) {
            Log.i("groupchatinfo/getgroupdescription/delivery fail");
            return;
        }
        Log.w(C13680ns.A0h("JoinSubgroupProtocolHelper/onDeliveryFailure iqid=", str));
        ((C87974Zk) this.A00).A00.A00.A00.A06(0);
    }

    public void AQe(C28371Vv r5, String str) {
        Object obj;
        if (this.A01 != 0) {
            Log.i("groupchatinfo/getgroupdescription/error");
            return;
        }
        Log.e("JoinSubgroupProtocolHelper/onError");
        Pair A012 = C34451kH.A01(r5);
        if (!(A012 == null || (obj = A012.first) == null)) {
            Log.e(AnonymousClass000.A0g("JoinSubgroupProtocolHelper/onError: ", obj));
            int A0D = AnonymousClass000.A0D(A012.first);
            if (!(A0D == 304 || A0D == 409 || A0D == 419 || A0D == 426 || A0D == 500 || A0D == 400 || A0D == 401)) {
                switch (A0D) {
                    case 403:
                    case 404:
                    case 405:
                        break;
                }
            }
            AnonymousClass4M5 r1 = ((C87974Zk) this.A00).A00;
            C82664Dr r0 = r1.A00;
            C16050sL r3 = r1.A03;
            r0.A00.A06(A0D);
            if (A0D == 409) {
                r1.A02.A04.A0l.A0A(r3, "subgroup_conflict_recovery", 3);
                return;
            }
            return;
        }
        ((C87974Zk) this.A00).A00.A00.A00.A06(-1);
    }

    public void AYG(C28371Vv r13, String str) {
        if (this.A01 != 0) {
            Log.i("groupchatinfo/getgroupdescription/success");
            C28371Vv A0H = r13.A0H();
            C17780vd r2 = (C17780vd) this.A00;
            C16300so r1 = r2.A00;
            C16060sN r7 = (C16060sN) r13.A0F(r1, C16050sL.class, "from");
            if (r7 != null) {
                C17240ul r5 = (C17240ul) r2.A04.get();
                C30371cF A04 = C53262fQ.A04(r1, A0H, A0H.A0J(FacebookFacade.RequestParameter.DESCRIPTION));
                C16000sG r22 = r5.A0E;
                C16010sH A09 = r22.A09(r7);
                if (A09 != null) {
                    String str2 = A09.A0H.A02;
                    String str3 = A04.A02;
                    if (!TextUtils.equals(str2, str3)) {
                        Log.i("groupmgr/onGroupDescription/changed");
                        C16010sH A0A = r22.A0A(r7);
                        if (str3 != null) {
                            A0A.A0H = A04;
                        }
                        r22.A06.A0J(A0A);
                        r22.A04.A00(A0A);
                        C39291sE A06 = r5.A0y.A06((C30361cE) null, r7, (C30641ci) null, 27, A04.A00 * 1000);
                        A06.A0k(str3);
                        A06.A0b(A04.A01);
                        C17240ul.A01(3006, A06);
                        return;
                    }
                    return;
                }
                Log.w("groupmgr/onGroupDescription/new group");
                return;
            }
            return;
        }
        C28371Vv A0J = r13.A0J("membership_approval_request");
        ((C87974Zk) this.A00).A00.A01.A00.A07(AnonymousClass000.A1V(A0J) ? 1 : 0);
    }
}
