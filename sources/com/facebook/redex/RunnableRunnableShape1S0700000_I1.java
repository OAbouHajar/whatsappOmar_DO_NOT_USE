package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass127;
import X.AnonymousClass28T;
import X.AnonymousClass2HX;
import X.AnonymousClass3GQ;
import X.AnonymousClass4UI;
import X.AnonymousClass5SY;
import X.C102524z5;
import X.C13690nt;
import X.C14870pt;
import X.C16050sL;
import X.C16300so;
import X.C17190ug;
import X.C17230uk;
import X.C18450wi;
import X.C214113z;
import X.C28371Vv;
import X.C35081lL;
import com.obwhatsapp.group.GroupChatInfoActivity;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.StatusLine;

public class RunnableRunnableShape1S0700000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public RunnableRunnableShape1S0700000_I1(C16300so r2, C14870pt r3, AnonymousClass127 r4, C17230uk r5, GroupChatInfoActivity groupChatInfoActivity, C16050sL r7, C17190ug r8) {
        this.A07 = 0;
        this.A03 = r7;
        this.A04 = r3;
        this.A02 = r2;
        this.A06 = r8;
        this.A00 = r4;
        this.A01 = r5;
        this.A05 = C13690nt.A0h(groupChatInfoActivity);
    }

    public RunnableRunnableShape1S0700000_I1(AnonymousClass28T r2, AnonymousClass5SY r3, AnonymousClass4UI r4, C214113z r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate, int i2) {
        this.A07 = i2;
        if (2 - i2 != 0) {
            C18450wi.A0J(r5, x509Certificate);
            C18450wi.A0H(r2, 3);
        } else {
            C18450wi.A0J(r5, x509Certificate);
        }
        C18450wi.A0K(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }

    public RunnableRunnableShape1S0700000_I1(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, AnonymousClass2HX r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 1;
        C18450wi.A0I(r4, 1, x509Certificate);
        C18450wi.A0K(r2, r3);
        this.A06 = r4;
        this.A00 = r5;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A02 = r2;
        this.A05 = r3;
    }

    public void run() {
        switch (this.A07) {
            case 0:
                C16050sL r1 = (C16050sL) this.A03;
                C16050sL A022 = ((C17230uk) this.A01).A02(r1);
                AnonymousClass00B.A06(A022);
                C16300so r4 = (C16300so) this.A02;
                C17190ug r10 = (C17190ug) this.A06;
                C102524z5 r3 = new C102524z5(this);
                List singletonList = Collections.singletonList(r1);
                String A023 = r10.A02();
                int size = singletonList.size();
                C28371Vv[] r7 = new C28371Vv[size];
                for (int i2 = 0; i2 < size; i2 = C28371Vv.A01(singletonList.get(i2), new C35081lL[1], r7, i2)) {
                }
                C35081lL[] r2 = new C35081lL[1];
                C35081lL.A02("unlink_type", "sub_group", r2, 0);
                r10.A0A(new AnonymousClass3GQ(r4, r3), C28371Vv.A02(A022, new C28371Vv("unlink", r2, r7), A023), A023, StatusLine.HTTP_PERM_REDIRECT, 32000);
                return;
            case 1:
                PublicKey publicKey = (PublicKey) this.A04;
                Integer num = (Integer) this.A03;
                ((C214113z) this.A06).AaV((AnonymousClass5SY) this.A02, (AnonymousClass4UI) this.A05, (AnonymousClass2HX) this.A00, num, publicKey, (X509Certificate) this.A01);
                return;
            case 2:
                AnonymousClass28T r12 = (AnonymousClass28T) this.A06;
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer num2 = (Integer) this.A03;
                AnonymousClass5SY r22 = (AnonymousClass5SY) this.A00;
                AnonymousClass4UI r32 = (AnonymousClass4UI) this.A02;
                ((C214113z) this.A05).AaX(r12, r22, r32, num2, publicKey2, (X509Certificate) this.A01);
                return;
            default:
                AnonymousClass28T r23 = (AnonymousClass28T) this.A06;
                PublicKey publicKey3 = (PublicKey) this.A04;
                Integer num3 = (Integer) this.A03;
                ((C214113z) this.A05).AaY(r23, (AnonymousClass5SY) this.A00, (AnonymousClass4UI) this.A02, num3, publicKey3, (X509Certificate) this.A01);
                return;
        }
    }
}
