package com.obwhatsapp.group;

import X.AnonymousClass00B;
import X.AnonymousClass15A;
import X.AnonymousClass195;
import X.AnonymousClass1D0;
import X.AnonymousClass1SP;
import X.AnonymousClass2DC;
import X.AnonymousClass5P8;
import X.AnonymousClass5P9;
import X.C003501o;
import X.C109505Sk;
import X.C15810rt;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16320sq;
import X.C17240ul;
import X.C17650vQ;
import X.C19270y9;
import X.C30341cC;
import X.C37831po;
import X.C38571r0;
import X.C78793yh;
import X.C78803yi;
import X.C798741r;
import com.facebook.redex.IDxCallbackShape373S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape374S0100000_2_I0;
import com.facebook.redex.IDxLObserverShape301S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import com.whatsapp.voipcalling.Voip;

public class GroupCallButtonController implements C003501o {
    public C78793yh A00;
    public C78803yi A01;
    public C16010sH A02;
    public C798741r A03 = C798741r.NONE;
    public AnonymousClass2DC A04;
    public C16050sL A05;
    public C37831po A06;
    public C38571r0 A07;
    public final C16040sK A08;
    public final C15900s5 A09;
    public final AnonymousClass5P8 A0A = new IDxCallbackShape373S0100000_2_I0(this, 1);
    public final AnonymousClass5P9 A0B = new IDxCallbackShape374S0100000_2_I0(this, 1);
    public final C17650vQ A0C;
    public final C16000sG A0D;
    public final AnonymousClass1D0 A0E;
    public final C15810rt A0F;
    public final C16070sO A0G;
    public final AnonymousClass195 A0H;
    public final C17240ul A0I;
    public final C16320sq A0J;
    public final C109505Sk A0K = new IDxLObserverShape301S0100000_2_I0(this, 2);
    public final AnonymousClass1SP A0L;
    public final C19270y9 A0M = new IDxCObserverShape111S0100000_2_I0(this, 6);
    public final AnonymousClass15A A0N;

    public GroupCallButtonController(C16040sK r3, C15900s5 r4, C17650vQ r5, C16000sG r6, AnonymousClass1D0 r7, C15810rt r8, C16070sO r9, AnonymousClass195 r10, C17240ul r11, C16320sq r12, AnonymousClass1SP r13, AnonymousClass15A r14) {
        this.A08 = r3;
        this.A0J = r12;
        this.A0F = r8;
        this.A09 = r4;
        this.A0N = r14;
        this.A0C = r5;
        this.A0D = r6;
        this.A0L = r13;
        this.A0I = r11;
        this.A0E = r7;
        this.A0H = r10;
        this.A0G = r9;
    }

    public int A00() {
        CallInfo callInfo = Voip.getCallInfo();
        C16050sL r1 = this.A05;
        return (r1 == null || callInfo == null || !r1.equals(callInfo.groupJid)) ? R.string.str1de3 : R.string.str1b13;
    }

    public C798741r A01() {
        return this.A03;
    }

    public void A02() {
        C798741r r0;
        C16010sH r02 = this.A02;
        if (r02 == null) {
            r0 = C798741r.NONE;
        } else {
            C16050sL r1 = this.A05;
            C15810rt r4 = this.A0F;
            if (r1 != null && !r02.A0a && r4.A02(r1) != 3) {
                AnonymousClass195 r3 = this.A0H;
                if (r3.A07(this.A05)) {
                    C38571r0 A022 = r3.A02(this.A05);
                    this.A07 = A022;
                    if (A022 != null) {
                        A05(A022.A00);
                    }
                } else {
                    C78803yi r2 = new C78803yi(this.A0B, r3, this.A05);
                    this.A01 = r2;
                    this.A0J.Acn(r2, new Void[0]);
                }
                if (this.A07 != null) {
                    r0 = C798741r.JOIN_CALL;
                } else {
                    C16050sL r32 = this.A05;
                    C15900s5 r22 = this.A09;
                    C16070sO r12 = this.A0G;
                    if (C30341cC.A0J(r22, r4, r12, this.A02, r32)) {
                        r0 = C798741r.ONE_TAP;
                    } else if (r12.A09(this.A05)) {
                        r0 = C798741r.CALL_PICKER;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.A03 = r0;
    }

    public void A03() {
        this.A0L.A02(this.A0K);
        this.A0N.A02(this.A0M);
    }

    public void A04() {
        this.A0L.A03(this.A0K);
        this.A0N.A03(this.A0M);
        C78803yi r0 = this.A01;
        if (r0 != null) {
            r0.A06(true);
            this.A01 = null;
        }
        C78793yh r02 = this.A00;
        if (r02 != null) {
            r02.A06(true);
            this.A00 = null;
        }
        this.A02 = null;
        this.A05 = null;
        this.A03 = C798741r.NONE;
        this.A06 = null;
        this.A04 = null;
    }

    public final void A05(long j2) {
        AnonymousClass1D0 r1 = this.A0E;
        C37831po A012 = r1.A01(j2);
        if (A012 != null) {
            this.A06 = A012;
        } else if (this.A00 == null) {
            C78793yh r2 = new C78793yh(this.A0A, r1, j2);
            this.A00 = r2;
            this.A0J.Acn(r2, new Void[0]);
        }
    }

    public void A06(C16010sH r4) {
        if (this.A02 != r4) {
            C78803yi r0 = this.A01;
            if (r0 != null) {
                r0.A06(true);
                this.A01 = null;
            }
            C78793yh r02 = this.A00;
            if (r02 != null) {
                r02.A06(true);
                this.A00 = null;
            }
            this.A02 = null;
            this.A05 = null;
            this.A03 = C798741r.NONE;
            this.A06 = null;
            this.A04 = null;
            this.A02 = r4;
            Jid A082 = r4.A08(C16050sL.class);
            AnonymousClass00B.A06(A082);
            this.A05 = (C16050sL) A082;
        }
    }

    public void A07(AnonymousClass2DC r1) {
        this.A04 = r1;
    }

    public boolean A08() {
        if (this.A02 == null) {
            return false;
        }
        return C30341cC.A0K(this.A0C, this.A05, Voip.getCallInfo());
    }

    public boolean A09() {
        C16010sH r5 = this.A02;
        if (r5 == null) {
            return false;
        }
        C16050sL r7 = this.A05;
        C17650vQ r2 = this.A0C;
        C17240ul r6 = this.A0I;
        return C30341cC.A0I(this.A08, this.A09, r2, this.A0D, this.A0G, r5, r6, r7);
    }
}
