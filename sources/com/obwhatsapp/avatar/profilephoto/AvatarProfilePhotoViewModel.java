package com.obwhatsapp.avatar.profilephoto;

import X.AnonymousClass00T;
import X.AnonymousClass027;
import X.AnonymousClass121;
import X.AnonymousClass1JA;
import X.AnonymousClass3Io;
import X.AnonymousClass41F;
import X.AnonymousClass4NS;
import X.AnonymousClass4Q3;
import X.AnonymousClass5F9;
import X.C003401n;
import X.C14870pt;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C18450wi;
import X.C211613a;
import X.C211913d;
import X.C212213g;
import X.C26141Mm;
import X.C30801cy;
import X.C43201zV;
import X.C440222l;
import X.C70803hl;
import X.C70813hm;
import X.C70833ho;
import X.C82454Cw;
import X.C89304bw;
import com.facebook.redex.IDxEListenerShape288S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape1S0310000_I1;
import com.obwhatsapp.R;
import java.util.List;
import java.util.NoSuchElementException;

public final class AvatarProfilePhotoViewModel extends C003401n {
    public final AnonymousClass027 A00;
    public final IDxEListenerShape288S0100000_2_I0 A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final AnonymousClass4Q3 A04;
    public final C82454Cw A05;
    public final C16440t3 A06;
    public final C26141Mm A07;
    public final AnonymousClass4NS A08;
    public final C211913d A09;
    public final C211613a A0A;
    public final AnonymousClass121 A0B;
    public final C30801cy A0C = new C30801cy();
    public final C16320sq A0D;
    public final List A0E;

    public AvatarProfilePhotoViewModel(C14870pt r23, C16040sK r24, AnonymousClass4Q3 r25, C82454Cw r26, C16440t3 r27, C26141Mm r28, AnonymousClass4NS r29, C211913d r30, C211613a r31, AnonymousClass121 r32, C16320sq r33) {
        C16440t3 r13 = r27;
        C18450wi.A0H(r13, 1);
        C14870pt r15 = r23;
        C18450wi.A0H(r15, 2);
        C16040sK r14 = r24;
        C18450wi.A0H(r14, 3);
        C16320sq r0 = r33;
        C18450wi.A0H(r0, 4);
        C211613a r12 = r31;
        C18450wi.A0H(r12, 5);
        AnonymousClass121 r9 = r32;
        C18450wi.A0H(r9, 6);
        C26141Mm r11 = r28;
        C18450wi.A0H(r11, 7);
        C211913d r10 = r30;
        C18450wi.A0H(r10, 8);
        this.A06 = r13;
        this.A02 = r15;
        this.A03 = r14;
        this.A0D = r0;
        this.A0A = r12;
        this.A0B = r9;
        this.A07 = r11;
        this.A09 = r10;
        this.A05 = r26;
        AnonymousClass4Q3 r92 = r25;
        this.A04 = r92;
        this.A08 = r29;
        C440222l r17 = C440222l.A00;
        this.A00 = new AnonymousClass027(new C89304bw((C70833ho) null, (C70803hl) null, r17, r17, false, false, false));
        this.A0E = AnonymousClass1JA.A0R(r92.A00(R.color.color0488, R.color.color0493, R.string.str1bf9, true), r92.A00(R.color.color048b, R.color.color0496, R.string.str1bf4, false), r92.A00(R.color.color048c, R.color.color0497, R.string.str1bf5, false), r92.A00(R.color.color048d, R.color.color0498, R.string.str1bfa, false), r92.A00(R.color.color048e, R.color.color0499, R.string.str1bf7, false), r92.A00(R.color.color048f, R.color.color049a, R.string.str1bf8, false), r92.A00(R.color.color0490, R.color.color049b, R.string.str1bf6, false));
        IDxEListenerShape288S0100000_2_I0 iDxEListenerShape288S0100000_2_I0 = new IDxEListenerShape288S0100000_2_I0(this, 1);
        this.A01 = iDxEListenerShape288S0100000_2_I0;
        r10.A02(iDxEListenerShape288S0100000_2_I0);
        List A0R = AnonymousClass1JA.A0R(new C70813hm(Integer.valueOf(AnonymousClass00T.A00(this.A04.A00.A00.getApplicationContext(), R.color.color0493)), true), new C70813hm((Integer) null, false), new C70813hm((Integer) null, false), new C70813hm((Integer) null, false), new C70813hm((Integer) null, false));
        List<C70833ho> list = this.A0E;
        for (C70833ho r142 : list) {
            if (r142.A03) {
                this.A00.A0B(new C89304bw(r142, (C70803hl) null, A0R, list, false, true, false));
                if (r11.A01()) {
                    A06(false, 0);
                    return;
                } else {
                    this.A0C.A0B(AnonymousClass41F.AVATAR_EDITOR);
                    return;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void A04() {
        this.A09.A03(this.A01);
        ((C43201zV) ((C212213g) this.A08.A03.get()).A02.A00.getValue()).A03(false);
    }

    public final void A05(boolean z2) {
        AnonymousClass027 r0 = this.A00;
        Object A012 = r0.A01();
        C18450wi.A0F(A012);
        C18450wi.A0B(A012);
        C89304bw r1 = (C89304bw) A012;
        if (z2) {
            r0.A09(new C89304bw(r1.A00, r1.A01, r1.A03, r1.A02, false, r1.A05, r1.A04));
            this.A0C.A09(AnonymousClass41F.CLOSE_SCREEN);
            return;
        }
        r0.A09(new C89304bw(r1.A00, r1.A01, r1.A03, r1.A02, false, r1.A05, true));
    }

    public final void A06(boolean z2, int i2) {
        AnonymousClass4NS r4 = this.A08;
        r4.A02.Aco(new RunnableRunnableShape1S0310000_I1(r4, new AnonymousClass3Io(this, i2), new AnonymousClass5F9(this), z2));
    }
}
