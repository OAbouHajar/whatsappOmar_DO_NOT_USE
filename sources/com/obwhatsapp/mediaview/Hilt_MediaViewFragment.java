package com.obwhatsapp.mediaview;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass10B;
import X.AnonymousClass10C;
import X.AnonymousClass10G;
import X.AnonymousClass10X;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass12W;
import X.AnonymousClass156;
import X.AnonymousClass1A9;
import X.AnonymousClass1BU;
import X.AnonymousClass1G1;
import X.AnonymousClass1H9;
import X.AnonymousClass1HE;
import X.AnonymousClass1N7;
import X.AnonymousClass1P7;
import X.AnonymousClass1P8;
import X.AnonymousClass2TA;
import X.AnonymousClass4I6;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15800rs;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16210se;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16480t8;
import X.C16490t9;
import X.C16500tA;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17090uW;
import X.C17120uZ;
import X.C17140ub;
import X.C17180uf;
import X.C17190ug;
import X.C17220uj;
import X.C17240ul;
import X.C18030w2;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18930xU;
import X.C19150xq;
import X.C19410yO;
import X.C19610yi;
import X.C19820z3;
import X.C19980zJ;
import X.C19990zK;
import X.C208811y;
import X.C209212c;
import X.C215914r;
import X.C216114t;
import X.C217915l;
import X.C226818w;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C23231Az;
import X.C23651Cv;
import X.C24961Hy;
import X.C25791Ld;
import X.C49132Rg;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_MediaViewFragment extends MediaViewBaseFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1T();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A1T()
            r3.A1S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.Hilt_MediaViewFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1T();
        A1S();
    }

    public void A1S() {
        if (!this.A02) {
            this.A02 = true;
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r3.A0b;
            mediaViewFragment.A00 = (C17070uU) r2.ABg.get();
            mediaViewFragment.A01 = (C17080uV) r2.APK.get();
            mediaViewFragment.A0g = (C16440t3) r2.AP2.get();
            mediaViewFragment.A0Q = (C23651Cv) r2.A1k.get();
            mediaViewFragment.A0y = (C14710pd) r2.A05.get();
            mediaViewFragment.A0I = (C14870pt) r2.AB3.get();
            mediaViewFragment.A1E = (C19990zK) r2.AEZ.get();
            mediaViewFragment.A0G = (C16300so) r2.A5p.get();
            mediaViewFragment.A0K = (C16040sK) r2.ADr.get();
            mediaViewFragment.A0L = (AnonymousClass10X) r2.ALc.get();
            mediaViewFragment.A0h = (C16980tz) r2.AQB.get();
            mediaViewFragment.A0D = (C23101Am) r2.A0N.get();
            mediaViewFragment.A0J = (C17090uW) r2.ADM.get();
            mediaViewFragment.A0m = (C14730pf) r2.ANy.get();
            mediaViewFragment.A1F = (C17190ug) r2.AEu.get();
            mediaViewFragment.A0H = (C208811y) r2.A6K.get();
            mediaViewFragment.A1I = (C18290wS) r2.AIB.get();
            mediaViewFragment.A0Z = (C23181Au) r2.A53.get();
            mediaViewFragment.A0F = (AnonymousClass1G1) r2.AJl.get();
            mediaViewFragment.A11 = (C17240ul) r2.ABK.get();
            mediaViewFragment.A1Q = (AnonymousClass1N7) r2.AKY.get();
            mediaViewFragment.A12 = (C217915l) r2.AOG.get();
            mediaViewFragment.A0o = (C226818w) r2.A6A.get();
            mediaViewFragment.A0W = (C17030uP) r2.APp.get();
            mediaViewFragment.A0a = (C15800rs) r2.A5c.get();
            mediaViewFragment.A1b = (C23201Aw) r2.AK6.get();
            mediaViewFragment.A1H = (C18090w8) r2.AI6.get();
            mediaViewFragment.A0P = (C17180uf) r2.A2n.get();
            mediaViewFragment.A1S = (AnonymousClass1BU) r2.ANA.get();
            mediaViewFragment.A0V = (AnonymousClass156) r2.ADH.get();
            mediaViewFragment.A0n = (C19820z3) r2.A7p.get();
            mediaViewFragment.A0i = (C17120uZ) r2.AQT.get();
            mediaViewFragment.A0O = (C24961Hy) r2.A2l.get();
            mediaViewFragment.A0X = (C16080sP) r2.AQ9.get();
            mediaViewFragment.A0d = (AnonymousClass12W) r2.AEM.get();
            mediaViewFragment.A0p = (C216114t) r2.A5O.get();
            mediaViewFragment.A1a = (C16320sq) r2.ARB.get();
            mediaViewFragment.A1X = (C23231Az) r2.A0r.get();
            mediaViewFragment.A10 = (C16490t9) r2.AQz.get();
            mediaViewFragment.A0M = (C15900s5) r2.ALm.get();
            mediaViewFragment.A0R = (C18930xU) r2.AOL.get();
            mediaViewFragment.A0N = (C16760tb) r2.APV.get();
            C49132Rg r32 = r3.A0Y;
            mediaViewFragment.A0z = r32.A0I();
            mediaViewFragment.A0E = (C19980zJ) r2.A0P.get();
            mediaViewFragment.A15 = (AnonymousClass1P7) r2.ADc.get();
            mediaViewFragment.A0T = (C16000sG) r2.A4x.get();
            mediaViewFragment.A0x = (C18030w2) r2.A6W.get();
            mediaViewFragment.A1T = (C17220uj) r2.A9x.get();
            mediaViewFragment.A1Y = (AnonymousClass1A9) r2.AE7.get();
            mediaViewFragment.A0e = (AnonymousClass01V) r2.AOi.get();
            mediaViewFragment.A0l = (AnonymousClass013) r2.AR8.get();
            mediaViewFragment.A0U = (C17140ub) r2.A4y.get();
            mediaViewFragment.A0q = (C16460t6) r2.A5k.get();
            mediaViewFragment.A0t = (C19150xq) r2.AFC.get();
            mediaViewFragment.A1G = C16150sX.A0x(r2);
            mediaViewFragment.A1R = (C16210se) r2.AQr.get();
            mediaViewFragment.A0r = (AnonymousClass10B) r2.AD5.get();
            mediaViewFragment.A0s = (C16480t8) r2.AEF.get();
            mediaViewFragment.A1Z = (C25791Ld) r2.AFY.get();
            mediaViewFragment.A0f = (AnonymousClass1H9) r2.AOj.get();
            mediaViewFragment.A0Y = (AnonymousClass120) r2.A4z.get();
            mediaViewFragment.A18 = (C215914r) r2.ADy.get();
            C16150sX r33 = r32.A1s;
            mediaViewFragment.A16 = new AnonymousClass4I6((C16440t3) r33.AP2.get(), (C16490t9) r33.AQz.get());
            mediaViewFragment.A1K = (AnonymousClass121) r2.AJY.get();
            mediaViewFragment.A0w = (C16500tA) r2.AMF.get();
            mediaViewFragment.A0u = (AnonymousClass10G) r2.AN1.get();
            mediaViewFragment.A1V = C16150sX.A19(r2);
            mediaViewFragment.A0j = (C16260sj) r2.AQe.get();
            mediaViewFragment.A0k = (C15860rz) r2.AQh.get();
            mediaViewFragment.A1A = (C209212c) r2.AE1.get();
            mediaViewFragment.A0v = (C19410yO) r2.A4T.get();
            mediaViewFragment.A0c = (AnonymousClass10C) r2.AN0.get();
            mediaViewFragment.A17 = (AnonymousClass1HE) r2.ALb.get();
            mediaViewFragment.A1J = (C17020u3) r2.AMG.get();
            mediaViewFragment.A0b = (C19610yi) r2.AEq.get();
            mediaViewFragment.A19 = (AnonymousClass1P8) r2.ADz.get();
            mediaViewFragment.A0S = (C18260wP) r2.A4p.get();
        }
    }

    public final void A1T() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
