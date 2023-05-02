package com.whatsapp.voipcalling;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass1OL;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C16300so;
import X.C16340ss;
import X.C17050uS;
import X.C17060uT;
import X.C17160ud;
import X.C17200uh;
import X.C17240ul;
import X.C19380yL;
import X.C216014s;
import X.C23111An;
import X.C25781Lc;
import X.C49582Tw;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public abstract class Hilt_VoipCallControlBottomSheetV2 extends BottomSheetDialogFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1K();
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
            r3.A1K()
            r3.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.Hilt_VoipCallControlBottomSheetV2.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1K();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this;
            C17050uS r4 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r12 = r4.A0b;
            AnonymousClass01J r3 = r12.A05;
            voipCallControlBottomSheetV2.A0W = (C14710pd) r3.get();
            voipCallControlBottomSheetV2.A0N = (C23111An) r12.AQ3.get();
            AnonymousClass01J r10 = r12.AMr;
            voipCallControlBottomSheetV2.A0Y = (C216014s) r10.get();
            AnonymousClass01J r5 = r12.ABK;
            voipCallControlBottomSheetV2.A0X = (C17240ul) r5.get();
            AnonymousClass01J r9 = r12.A4x;
            voipCallControlBottomSheetV2.A0Q = (C16000sG) r9.get();
            AnonymousClass01J r8 = r12.AOi;
            voipCallControlBottomSheetV2.A0S = (AnonymousClass01V) r8.get();
            AnonymousClass01J r7 = r12.AQ9;
            voipCallControlBottomSheetV2.A0R = (C16080sP) r7.get();
            AnonymousClass01J r6 = r12.AR8;
            voipCallControlBottomSheetV2.A0V = (AnonymousClass013) r6.get();
            voipCallControlBottomSheetV2.A0G = (AnonymousClass1OL) r12.AQ4.get();
            AnonymousClass01J r1 = r12.AQh;
            voipCallControlBottomSheetV2.A0U = (C15860rz) r1.get();
            voipCallControlBottomSheetV2.A0T = (C19380yL) r12.AQd.get();
            Context context = r12.AS2.A00;
            C16340ss.A01(context);
            r3.get();
            r1.get();
            C49582Tw r13 = new C49582Tw(context, (C17160ud) r12.A4t.get(), (C17200uh) r12.A52.get());
            r13.A01 = (C16300so) r12.A5p.get();
            r13.A0A = (C216014s) r10.get();
            r13.A03 = (C16000sG) r9.get();
            r13.A05 = (AnonymousClass01V) r8.get();
            r13.A04 = (C16080sP) r7.get();
            r13.A06 = (AnonymousClass013) r6.get();
            r13.A07 = (C17240ul) r5.get();
            r13.A09 = new C25781Lc();
            voipCallControlBottomSheetV2.A0I = r13;
            voipCallControlBottomSheetV2.A0M = r4.A0Y.A0B();
        }
    }

    public final void A1K() {
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
