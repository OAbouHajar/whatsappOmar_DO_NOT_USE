package com.whatsapp.stickers.store;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass14W;
import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14870pt;
import X.C16040sK;
import X.C16150sX;
import X.C16320sq;
import X.C16490t9;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C19980zJ;
import X.C211613a;
import X.C213013o;
import X.C214714f;
import X.C26141Mm;
import X.C27121Qn;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_StickerStoreTabFragment extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.Hilt_StickerStoreTabFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (this instanceof Hilt_StickerStoreMyTabFragment) {
            Hilt_StickerStoreMyTabFragment hilt_StickerStoreMyTabFragment = (Hilt_StickerStoreMyTabFragment) this;
            if (!hilt_StickerStoreMyTabFragment.A02) {
                hilt_StickerStoreMyTabFragment.A02 = true;
                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) hilt_StickerStoreMyTabFragment;
                C17050uS r2 = (C17050uS) ((C17060uT) hilt_StickerStoreMyTabFragment.generatedComponent());
                C16150sX r3 = r2.A0b;
                stickerStoreMyTabFragment.A00 = (C17070uU) r3.ABg.get();
                stickerStoreMyTabFragment.A01 = (C17080uV) r3.APK.get();
                stickerStoreMyTabFragment.A08 = (C14710pd) r3.A05.get();
                stickerStoreMyTabFragment.A05 = (C14870pt) r3.AB3.get();
                stickerStoreMyTabFragment.A06 = (C16040sK) r3.ADr.get();
                stickerStoreMyTabFragment.A07 = (AnonymousClass013) r3.AR8.get();
                stickerStoreMyTabFragment.A0E = (AnonymousClass14W) r3.ANc.get();
                stickerStoreMyTabFragment.A09 = (C26141Mm) r3.A10.get();
                stickerStoreMyTabFragment.A0A = (C27121Qn) r3.A1H.get();
                stickerStoreMyTabFragment.A0F = (AnonymousClass1CX) r3.ANk.get();
                stickerStoreMyTabFragment.A0G = (C214714f) r3.ANe.get();
                stickerStoreMyTabFragment.A0D = (AnonymousClass1MF) r3.ANa.get();
                stickerStoreMyTabFragment.A0B = (C213013o) r3.AN8.get();
                stickerStoreMyTabFragment.A0C = r3.A1e();
                stickerStoreMyTabFragment.A04 = (C16320sq) r3.ARB.get();
                stickerStoreMyTabFragment.A02 = r2.A0Y.A0c();
            }
        } else if (this instanceof Hilt_StickerStoreFeaturedTabFragment) {
            Hilt_StickerStoreFeaturedTabFragment hilt_StickerStoreFeaturedTabFragment = (Hilt_StickerStoreFeaturedTabFragment) this;
            if (!hilt_StickerStoreFeaturedTabFragment.A02) {
                hilt_StickerStoreFeaturedTabFragment.A02 = true;
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) hilt_StickerStoreFeaturedTabFragment;
                C16150sX r22 = ((C17050uS) ((C17060uT) hilt_StickerStoreFeaturedTabFragment.generatedComponent())).A0b;
                stickerStoreFeaturedTabFragment.A00 = (C17070uU) r22.ABg.get();
                stickerStoreFeaturedTabFragment.A01 = (C17080uV) r22.APK.get();
                stickerStoreFeaturedTabFragment.A08 = (C14710pd) r22.A05.get();
                stickerStoreFeaturedTabFragment.A05 = (C14870pt) r22.AB3.get();
                stickerStoreFeaturedTabFragment.A06 = (C16040sK) r22.ADr.get();
                stickerStoreFeaturedTabFragment.A07 = (AnonymousClass013) r22.AR8.get();
                stickerStoreFeaturedTabFragment.A0E = (AnonymousClass14W) r22.ANc.get();
                stickerStoreFeaturedTabFragment.A09 = (C26141Mm) r22.A10.get();
                stickerStoreFeaturedTabFragment.A0A = (C27121Qn) r22.A1H.get();
                stickerStoreFeaturedTabFragment.A0F = (AnonymousClass1CX) r22.ANk.get();
                stickerStoreFeaturedTabFragment.A0G = (C214714f) r22.ANe.get();
                stickerStoreFeaturedTabFragment.A0D = (AnonymousClass1MF) r22.ANa.get();
                stickerStoreFeaturedTabFragment.A0B = (C213013o) r22.AN8.get();
                stickerStoreFeaturedTabFragment.A0C = r22.A1e();
                stickerStoreFeaturedTabFragment.A03 = (C16490t9) r22.AQz.get();
                stickerStoreFeaturedTabFragment.A02 = (C19980zJ) r22.A0P.get();
                stickerStoreFeaturedTabFragment.A04 = (C211613a) r22.A1E.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) this;
            C16150sX r23 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            stickerStoreTabFragment.A00 = (C17070uU) r23.ABg.get();
            stickerStoreTabFragment.A01 = (C17080uV) r23.APK.get();
            stickerStoreTabFragment.A08 = (C14710pd) r23.A05.get();
            stickerStoreTabFragment.A05 = (C14870pt) r23.AB3.get();
            stickerStoreTabFragment.A06 = (C16040sK) r23.ADr.get();
            stickerStoreTabFragment.A07 = (AnonymousClass013) r23.AR8.get();
            stickerStoreTabFragment.A0E = (AnonymousClass14W) r23.ANc.get();
            stickerStoreTabFragment.A09 = (C26141Mm) r23.A10.get();
            stickerStoreTabFragment.A0A = (C27121Qn) r23.A1H.get();
            stickerStoreTabFragment.A0F = (AnonymousClass1CX) r23.ANk.get();
            stickerStoreTabFragment.A0G = (C214714f) r23.ANe.get();
            stickerStoreTabFragment.A0D = (AnonymousClass1MF) r23.ANa.get();
            stickerStoreTabFragment.A0B = (C213013o) r23.AN8.get();
            stickerStoreTabFragment.A0C = r23.A1e();
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
