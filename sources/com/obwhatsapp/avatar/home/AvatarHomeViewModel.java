package com.obwhatsapp.avatar.home;

import X.AnonymousClass027;
import X.AnonymousClass2WH;
import X.AnonymousClass2WI;
import X.AnonymousClass2WP;
import X.AnonymousClass2WR;
import X.AnonymousClass2WS;
import X.AnonymousClass2WT;
import X.AnonymousClass2WU;
import X.AnonymousClass4NR;
import X.AnonymousClass5F2;
import X.AnonymousClass5F5;
import X.AnonymousClass5F6;
import X.C003401n;
import X.C18450wi;
import X.C211613a;
import X.C211913d;
import X.C26141Mm;
import X.C27121Qn;
import X.C30801cy;
import android.graphics.Bitmap;
import com.facebook.redex.IDxEListenerShape288S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;

public final class AvatarHomeViewModel extends C003401n {
    public final AnonymousClass027 A00 = new AnonymousClass027(AnonymousClass2WU.A00);
    public final IDxEListenerShape288S0100000_2_I0 A01;
    public final C26141Mm A02;
    public final AnonymousClass4NR A03;
    public final C27121Qn A04;
    public final C211913d A05;
    public final C211613a A06;
    public final C30801cy A07 = new C30801cy();

    public AvatarHomeViewModel(C26141Mm r4, AnonymousClass4NR r5, C27121Qn r6, C211913d r7, C211613a r8) {
        C18450wi.A0H(r8, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r4, 3);
        C18450wi.A0H(r7, 5);
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        IDxEListenerShape288S0100000_2_I0 iDxEListenerShape288S0100000_2_I0 = new IDxEListenerShape288S0100000_2_I0(this, 0);
        this.A01 = iDxEListenerShape288S0100000_2_I0;
        r8.A01(1);
        r7.A02(iDxEListenerShape288S0100000_2_I0);
        r4.A00(new AnonymousClass5F2(this));
    }

    public static final /* synthetic */ void A01(Bitmap bitmap, AvatarHomeViewModel avatarHomeViewModel) {
        AnonymousClass027 r5 = avatarHomeViewModel.A00;
        AnonymousClass2WH r1 = (AnonymousClass2WH) r5.A01();
        if (r1 instanceof AnonymousClass2WP) {
            AnonymousClass2WP r12 = (AnonymousClass2WP) r1;
            r5.A0B(new AnonymousClass2WP(new AnonymousClass2WR(bitmap), r12.A03, r12.A01, true));
        }
    }

    public static final /* synthetic */ void A02(AvatarHomeViewModel avatarHomeViewModel) {
        AnonymousClass027 r5 = avatarHomeViewModel.A00;
        AnonymousClass2WH r1 = (AnonymousClass2WH) r5.A01();
        if (r1 instanceof AnonymousClass2WP) {
            AnonymousClass2WP r12 = (AnonymousClass2WP) r1;
            r5.A0B(new AnonymousClass2WP(AnonymousClass2WS.A00, r12.A03, r12.A01, false));
        }
    }

    public static final /* synthetic */ void A03(AvatarHomeViewModel avatarHomeViewModel, boolean z2) {
        AnonymousClass027 r3 = avatarHomeViewModel.A00;
        Object A012 = r3.A01();
        if (!z2) {
            avatarHomeViewModel.A06.A02(1);
            r3.A0B(new AnonymousClass2WI(false));
        } else if ((A012 instanceof AnonymousClass2WI) || C18450wi.A0R(A012, AnonymousClass2WU.A00)) {
            avatarHomeViewModel.A06.A02(4);
            r3.A0B(new AnonymousClass2WP(AnonymousClass2WT.A00, false, false, false));
            AnonymousClass4NR r5 = avatarHomeViewModel.A03;
            AnonymousClass5F5 r4 = new AnonymousClass5F5(avatarHomeViewModel);
            r5.A02.Aco(new RunnableRunnableShape3S0300000_I1(r5, new AnonymousClass5F6(avatarHomeViewModel), r4, 39));
        }
    }

    public void A04() {
        this.A05.A03(this.A01);
        this.A06.A00(1);
        AnonymousClass4NR r3 = this.A03;
        r3.A02.Aco(new RunnableRunnableShape19S0100000_I1_2(r3, 9));
    }
}
