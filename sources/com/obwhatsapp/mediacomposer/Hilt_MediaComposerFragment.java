package com.obwhatsapp.mediacomposer;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass14W;
import X.AnonymousClass1A9;
import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass1P7;
import X.AnonymousClass1PD;
import X.AnonymousClass1PJ;
import X.AnonymousClass1QT;
import X.AnonymousClass2TA;
import X.AnonymousClass2Yn;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C16150sX;
import X.C16180sb;
import X.C16300so;
import X.C16320sq;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17250um;
import X.C19610yi;
import X.C23061Ai;
import X.C23651Cv;
import X.C26051Md;
import X.C26211Mt;
import X.C26221Mu;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_MediaComposerFragment extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.Hilt_MediaComposerFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        C17060uT r2;
        Hilt_GifComposerFragment hilt_GifComposerFragment;
        if (this instanceof Hilt_VideoComposerFragment) {
            Hilt_VideoComposerFragment hilt_VideoComposerFragment = (Hilt_VideoComposerFragment) this;
            if (!hilt_VideoComposerFragment.A02) {
                hilt_VideoComposerFragment.A02 = true;
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) hilt_VideoComposerFragment;
                C17050uS r3 = (C17050uS) ((C17060uT) hilt_VideoComposerFragment.generatedComponent());
                C16150sX r22 = r3.A0b;
                videoComposerFragment.A00 = (C17070uU) r22.ABg.get();
                videoComposerFragment.A01 = (C17080uV) r22.APK.get();
                videoComposerFragment.A09 = (C14710pd) r22.A05.get();
                videoComposerFragment.A03 = (C14870pt) r22.AB3.get();
                videoComposerFragment.A0L = (C23061Ai) r22.AC0.get();
                videoComposerFragment.A02 = (C16300so) r22.A5p.get();
                videoComposerFragment.A0N = (C16320sq) r22.ARB.get();
                videoComposerFragment.A08 = (C17250um) r22.A7e.get();
                videoComposerFragment.A04 = (C15900s5) r22.ALm.get();
                videoComposerFragment.A0E = (C26211Mt) r22.AKr.get();
                videoComposerFragment.A0A = (AnonymousClass1P7) r22.ADc.get();
                videoComposerFragment.A05 = (AnonymousClass01V) r22.AOi.get();
                videoComposerFragment.A0M = (AnonymousClass1A9) r22.AE7.get();
                videoComposerFragment.A07 = (AnonymousClass013) r22.AR8.get();
                videoComposerFragment.A0H = C16150sX.A0x(r22);
                videoComposerFragment.A0J = (AnonymousClass14W) r22.ANc.get();
                videoComposerFragment.A0K = (AnonymousClass1CX) r22.ANk.get();
                videoComposerFragment.A0G = (AnonymousClass1PJ) r22.AMB.get();
                videoComposerFragment.A06 = (C15860rz) r22.AQh.get();
                videoComposerFragment.A0F = (C26221Mu) r22.AMA.get();
                videoComposerFragment.A0I = (AnonymousClass1MF) r22.ANa.get();
                videoComposerFragment.A0C = (AnonymousClass2Yn) r3.A0Z.A01.get();
                videoComposerFragment.A0K = (AnonymousClass1PD) r22.AEP.get();
                videoComposerFragment.A0G = (AnonymousClass1QT) r22.APE.get();
                videoComposerFragment.A0F = (C19610yi) r22.AEq.get();
            }
        } else if (this instanceof Hilt_ImageComposerFragment) {
            Hilt_ImageComposerFragment hilt_ImageComposerFragment = (Hilt_ImageComposerFragment) this;
            if (!hilt_ImageComposerFragment.A02) {
                hilt_ImageComposerFragment.A02 = true;
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) hilt_ImageComposerFragment;
                C17050uS r32 = (C17050uS) ((C17060uT) hilt_ImageComposerFragment.generatedComponent());
                C16150sX r23 = r32.A0b;
                imageComposerFragment.A00 = (C17070uU) r23.ABg.get();
                imageComposerFragment.A01 = (C17080uV) r23.APK.get();
                imageComposerFragment.A09 = (C14710pd) r23.A05.get();
                imageComposerFragment.A03 = (C14870pt) r23.AB3.get();
                imageComposerFragment.A0L = (C23061Ai) r23.AC0.get();
                imageComposerFragment.A02 = (C16300so) r23.A5p.get();
                imageComposerFragment.A0N = (C16320sq) r23.ARB.get();
                imageComposerFragment.A08 = (C17250um) r23.A7e.get();
                imageComposerFragment.A04 = (C15900s5) r23.ALm.get();
                imageComposerFragment.A0E = (C26211Mt) r23.AKr.get();
                imageComposerFragment.A0A = (AnonymousClass1P7) r23.ADc.get();
                imageComposerFragment.A05 = (AnonymousClass01V) r23.AOi.get();
                imageComposerFragment.A0M = (AnonymousClass1A9) r23.AE7.get();
                imageComposerFragment.A07 = (AnonymousClass013) r23.AR8.get();
                imageComposerFragment.A0H = C16150sX.A0x(r23);
                imageComposerFragment.A0J = (AnonymousClass14W) r23.ANc.get();
                imageComposerFragment.A0K = (AnonymousClass1CX) r23.ANk.get();
                imageComposerFragment.A0G = (AnonymousClass1PJ) r23.AMB.get();
                imageComposerFragment.A06 = (C15860rz) r23.AQh.get();
                imageComposerFragment.A0F = (C26221Mu) r23.AMA.get();
                imageComposerFragment.A0I = (AnonymousClass1MF) r23.ANa.get();
                imageComposerFragment.A0C = (AnonymousClass2Yn) r32.A0Z.A01.get();
                imageComposerFragment.A02 = (C23651Cv) r23.A1k.get();
                imageComposerFragment.A01 = (C16180sb) r23.A8b.get();
                imageComposerFragment.A03 = (C26051Md) r23.AAb.get();
            }
        } else {
            if (this instanceof Hilt_GifComposerFragment) {
                Hilt_GifComposerFragment hilt_GifComposerFragment2 = (Hilt_GifComposerFragment) this;
                if (!hilt_GifComposerFragment2.A02) {
                    hilt_GifComposerFragment2.A02 = true;
                    r2 = (C17060uT) hilt_GifComposerFragment2.generatedComponent();
                    hilt_GifComposerFragment = hilt_GifComposerFragment2;
                } else {
                    return;
                }
            } else if (!this.A02) {
                this.A02 = true;
                r2 = (C17060uT) generatedComponent();
                hilt_GifComposerFragment = (MediaComposerFragment) this;
            } else {
                return;
            }
            C17050uS r24 = (C17050uS) r2;
            C16150sX r33 = r24.A0b;
            hilt_GifComposerFragment.A00 = (C17070uU) r33.ABg.get();
            hilt_GifComposerFragment.A01 = (C17080uV) r33.APK.get();
            hilt_GifComposerFragment.A09 = (C14710pd) r33.A05.get();
            hilt_GifComposerFragment.A03 = (C14870pt) r33.AB3.get();
            hilt_GifComposerFragment.A0L = (C23061Ai) r33.AC0.get();
            hilt_GifComposerFragment.A02 = (C16300so) r33.A5p.get();
            hilt_GifComposerFragment.A0N = (C16320sq) r33.ARB.get();
            hilt_GifComposerFragment.A08 = (C17250um) r33.A7e.get();
            hilt_GifComposerFragment.A04 = (C15900s5) r33.ALm.get();
            hilt_GifComposerFragment.A0E = (C26211Mt) r33.AKr.get();
            hilt_GifComposerFragment.A0A = (AnonymousClass1P7) r33.ADc.get();
            hilt_GifComposerFragment.A05 = (AnonymousClass01V) r33.AOi.get();
            hilt_GifComposerFragment.A0M = (AnonymousClass1A9) r33.AE7.get();
            hilt_GifComposerFragment.A07 = (AnonymousClass013) r33.AR8.get();
            hilt_GifComposerFragment.A0H = C16150sX.A0x(r33);
            hilt_GifComposerFragment.A0J = (AnonymousClass14W) r33.ANc.get();
            hilt_GifComposerFragment.A0K = (AnonymousClass1CX) r33.ANk.get();
            hilt_GifComposerFragment.A0G = (AnonymousClass1PJ) r33.AMB.get();
            hilt_GifComposerFragment.A06 = (C15860rz) r33.AQh.get();
            hilt_GifComposerFragment.A0F = (C26221Mu) r33.AMA.get();
            hilt_GifComposerFragment.A0I = (AnonymousClass1MF) r33.ANa.get();
            hilt_GifComposerFragment.A0C = (AnonymousClass2Yn) r24.A0Z.A01.get();
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
