package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass1GE;
import X.AnonymousClass1yP;
import X.AnonymousClass22O;
import X.C15830rv;
import X.C16040sK;
import X.C16740tZ;
import X.C28881Zb;
import X.C34331k5;
import X.C38841rV;
import X.C39721sx;
import X.C42171xL;
import X.C615139f;
import X.C86094Re;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.jid.UserJid;

public class ViewOnClickCListenerShape0S0500000_I1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public ViewOnClickCListenerShape0S0500000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    public void A06(View view) {
        UserJid userJid;
        if (this.A05 != 0) {
            AnonymousClass1yP A012 = AnonymousClass22O.A01(((C615139f) this.A00).A03);
            if (A012 != null) {
                C42171xL r0 = (C42171xL) this.A02;
                String str = r0.A03;
                String str2 = r0.A02;
                C16740tZ r2 = (C16740tZ) this.A03;
                A012.AID(r2, r2.A11, (C86094Re) this.A01, str, str2, (Bitmap[]) this.A04, r0.A01);
                return;
            }
            return;
        }
        C38841rV r8 = (C38841rV) this.A03;
        C39721sx r7 = r8.A02;
        if (r7 == null) {
            if (r8.A11.A02) {
                C16040sK r02 = (C16040sK) this.A02;
                r02.A0B();
                C28881Zb r03 = r02.A01;
                AnonymousClass00B.A06(r03);
                userJid = (UserJid) r03.A0E;
            } else {
                userJid = (UserJid) this.A04;
            }
            AnonymousClass00B.A06(userJid);
            double d2 = r8.A00;
            double d3 = r8.A01;
            long j2 = r8.A0I;
            r7 = new C39721sx(userJid);
            r7.A00 = d2;
            r7.A01 = d3;
            r7.A05 = j2;
        }
        Context context = (Context) this.A00;
        C15830rv r1 = r8.A11.A00;
        AnonymousClass00B.A06(r1);
        boolean A052 = ((AnonymousClass1GE) this.A01).A05(context);
        Intent A002 = C34331k5.A00(r1, r7);
        A002.setClassName(context.getPackageName(), A052 ? "com.obwhatsapp.location.GroupChatLiveLocationsActivity2" : "com.obwhatsapp.location.GroupChatLiveLocationsActivity");
        context.startActivity(A002);
    }
}
