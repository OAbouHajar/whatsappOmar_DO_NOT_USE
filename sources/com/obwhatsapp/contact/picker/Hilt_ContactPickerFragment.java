package com.obwhatsapp.contact.picker;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass127;
import X.AnonymousClass151;
import X.AnonymousClass156;
import X.AnonymousClass18R;
import X.AnonymousClass19Y;
import X.AnonymousClass1A9;
import X.AnonymousClass1BI;
import X.AnonymousClass1BJ;
import X.AnonymousClass1BU;
import X.AnonymousClass1BZ;
import X.AnonymousClass1G1;
import X.AnonymousClass1L1;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.AnonymousClass1MX;
import X.AnonymousClass1ND;
import X.AnonymousClass1PD;
import X.AnonymousClass1QZ;
import X.AnonymousClass2TA;
import X.AnonymousClass4QT;
import X.C14710pd;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16220sf;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16510tB;
import X.C16760tb;
import X.C16900tq;
import X.C17020u3;
import X.C17030uP;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17130ua;
import X.C17140ub;
import X.C17180uf;
import X.C17190ug;
import X.C17200uh;
import X.C17210ui;
import X.C17220uj;
import X.C17240ul;
import X.C17250um;
import X.C18160wF;
import X.C18260wP;
import X.C18290wS;
import X.C19230xz;
import X.C19600yh;
import X.C19740yv;
import X.C19820z3;
import X.C19980zJ;
import X.C206210w;
import X.C217915l;
import X.C220316j;
import X.C220516l;
import X.C224618a;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C24901Hs;
import X.C25501Ka;
import X.C25681Ks;
import X.C25781Lc;
import X.C26001Ly;
import X.C26021Ma;
import X.C26081Mg;
import X.C26091Mh;
import X.C26101Mi;
import X.C49132Rg;
import X.C49352Sp;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import X.C82234Ca;
import X.C85944Qp;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_ContactPickerFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
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
            r3.A1A()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.Hilt_ContactPickerFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r2 = r3.A0b;
            contactPickerFragment.A00 = (C17070uU) r2.ABg.get();
            contactPickerFragment.A01 = (C17080uV) r2.APK.get();
            contactPickerFragment.A1E = (C16440t3) r2.AP2.get();
            contactPickerFragment.A1d = (C14710pd) r2.A05.get();
            contactPickerFragment.A1y = (AnonymousClass1PD) r2.AEP.get();
            contactPickerFragment.A0P = (C14870pt) r2.AB3.get();
            contactPickerFragment.A0Q = (C16040sK) r2.ADr.get();
            contactPickerFragment.A0S = (AnonymousClass10X) r2.ALc.get();
            contactPickerFragment.A24 = (C16320sq) r2.ARB.get();
            contactPickerFragment.A1P = (C15810rt) r2.A43.get();
            contactPickerFragment.A0K = (C23101Am) r2.A0N.get();
            AnonymousClass01J r5 = r2.AQz;
            contactPickerFragment.A1f = (C16490t9) r5.get();
            contactPickerFragment.A0U = (C17130ua) r2.AN9.get();
            contactPickerFragment.A1b = (C17250um) r2.A7e.get();
            contactPickerFragment.A0T = (C15900s5) r2.ALm.get();
            contactPickerFragment.A1V = (AnonymousClass11G) r2.ANN.get();
            contactPickerFragment.A0V = (AnonymousClass1BJ) r2.AOm.get();
            contactPickerFragment.A0X = (C16760tb) r2.APV.get();
            contactPickerFragment.A26 = (AnonymousClass1QZ) r2.APn.get();
            contactPickerFragment.A21 = (C18160wF) r2.A5o.get();
            C49132Rg r4 = r3.A0Y;
            contactPickerFragment.A1e = r4.A0I();
            contactPickerFragment.A0t = (C17200uh) r2.A52.get();
            contactPickerFragment.A1n = (C17190ug) r2.AEu.get();
            contactPickerFragment.A1g = (C17240ul) r2.ABK.get();
            contactPickerFragment.A0L = (C19980zJ) r2.A0P.get();
            contactPickerFragment.A0m = (C16000sG) r2.A4x.get();
            contactPickerFragment.A1w = (C17220uj) r2.A9x.get();
            contactPickerFragment.A23 = (AnonymousClass1A9) r2.AE7.get();
            contactPickerFragment.A1m = C16150sX.A0r(r2);
            contactPickerFragment.A1D = (AnonymousClass01V) r2.AOi.get();
            contactPickerFragment.A0r = (C16080sP) r2.AQ9.get();
            contactPickerFragment.A1p = (C18290wS) r2.AIB.get();
            contactPickerFragment.A1H = (AnonymousClass013) r2.AR8.get();
            contactPickerFragment.A1T = (C26081Mg) r2.AIY.get();
            contactPickerFragment.A0a = (AnonymousClass01Y) r2.A1w.get();
            contactPickerFragment.A0o = (C17140ub) r2.A4y.get();
            contactPickerFragment.A16 = (C23181Au) r2.A53.get();
            contactPickerFragment.A0M = (AnonymousClass1G1) r2.AJl.get();
            contactPickerFragment.A13 = (AnonymousClass1BI) r2.ACt.get();
            contactPickerFragment.A1o = C16150sX.A0x(r2);
            contactPickerFragment.A1s = new C25781Lc();
            contactPickerFragment.A1z = (C25681Ks) r2.A0Q.get();
            contactPickerFragment.A1r = (C16220sf) r2.A3y.get();
            contactPickerFragment.A0Y = (C19740yv) r2.AQi.get();
            contactPickerFragment.A1k = (C217915l) r2.AOG.get();
            contactPickerFragment.A0g = (AnonymousClass127) r2.A3z.get();
            contactPickerFragment.A17 = (C19230xz) r2.A5B.get();
            contactPickerFragment.A0h = (AnonymousClass1L3) r2.A4N.get();
            contactPickerFragment.A1X = (C26091Mh) r2.A61.get();
            contactPickerFragment.A1O = (C26001Ly) r2.A65.get();
            contactPickerFragment.A0l = (AnonymousClass19Y) r2.A4r.get();
            contactPickerFragment.A1j = C49132Rg.A01(r4);
            contactPickerFragment.A1S = (C16900tq) r2.AFT.get();
            contactPickerFragment.A0q = (C17030uP) r2.APp.get();
            contactPickerFragment.A1F = (C16260sj) r2.AQe.get();
            contactPickerFragment.A1G = (C15860rz) r2.AQh.get();
            contactPickerFragment.A1u = C16150sX.A17(r2);
            contactPickerFragment.A0i = (AnonymousClass1L4) r2.A4K.get();
            contactPickerFragment.A0j = C16150sX.A0K(r2);
            contactPickerFragment.A19 = (C220316j) r2.A5C.get();
            contactPickerFragment.A1C = (C15800rs) r2.A5c.get();
            contactPickerFragment.A1Q = (AnonymousClass151) r2.AAn.get();
            contactPickerFragment.A1v = (AnonymousClass1L1) r2.ANR.get();
            contactPickerFragment.A0e = C16150sX.A0I(r2);
            contactPickerFragment.A20 = new AnonymousClass4QT((C16490t9) r5.get());
            contactPickerFragment.A1B = (AnonymousClass1BZ) r2.A5N.get();
            contactPickerFragment.A22 = (C16510tB) r2.A8S.get();
            contactPickerFragment.A25 = (C23201Aw) r2.AK6.get();
            contactPickerFragment.A0c = (C17180uf) r2.A2n.get();
            contactPickerFragment.A1Z = (AnonymousClass1MX) r2.A6V.get();
            contactPickerFragment.A0d = (C17210ui) r2.A73.get();
            contactPickerFragment.A1R = (C16070sO) r2.ABY.get();
            C16150sX r52 = r4.A1s;
            contactPickerFragment.A1K = new C85944Qp((C16440t3) r52.AP2.get(), C16150sX.A0a(r52));
            contactPickerFragment.A1q = (C17020u3) r2.AMG.get();
            contactPickerFragment.A1t = (AnonymousClass1BU) r2.ANA.get();
            contactPickerFragment.A0k = (C18260wP) r2.A4p.get();
            contactPickerFragment.A0p = (AnonymousClass156) r2.ADH.get();
            contactPickerFragment.A1N = (C24901Hs) r2.ADg.get();
            contactPickerFragment.A1c = (C26101Mi) r2.AQU.get();
            contactPickerFragment.A15 = (C206210w) r2.A4v.get();
            contactPickerFragment.A1A = (C19600yh) r2.A5F.get();
            contactPickerFragment.A1i = (AnonymousClass18R) r2.ABZ.get();
            contactPickerFragment.A14 = (C220516l) r2.A4u.get();
            contactPickerFragment.A0N = (C49352Sp) r4.A1G.get();
            contactPickerFragment.A1Y = (AnonymousClass1ND) r2.A2y.get();
            contactPickerFragment.A0b = (C25501Ka) r2.A2i.get();
            contactPickerFragment.A1a = (C224618a) r2.A79.get();
            contactPickerFragment.A1M = (C26021Ma) r2.A63.get();
            contactPickerFragment.A0O = (C82234Ca) r3.A0J.get();
            contactPickerFragment.A1J = (C19820z3) r2.A7p.get();
        }
    }

    public final void A1A() {
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
