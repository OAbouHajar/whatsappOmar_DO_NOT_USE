package com.obwhatsapp.gallery;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C16150sX;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C23651Cv;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_GalleryTabHostFragment extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.Hilt_GalleryTabHostFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this;
            C16150sX r2 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            galleryTabHostFragment.A00 = (C17070uU) r2.ABg.get();
            galleryTabHostFragment.A01 = (C17080uV) r2.APK.get();
            galleryTabHostFragment.A07 = (C16440t3) r2.AP2.get();
            galleryTabHostFragment.A0A = (C14710pd) r2.A05.get();
            galleryTabHostFragment.A06 = (C23651Cv) r2.A1k.get();
            galleryTabHostFragment.A08 = (C16980tz) r2.AQB.get();
            galleryTabHostFragment.A0B = (C16320sq) r2.ARB.get();
            galleryTabHostFragment.A09 = (AnonymousClass013) r2.AR8.get();
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
