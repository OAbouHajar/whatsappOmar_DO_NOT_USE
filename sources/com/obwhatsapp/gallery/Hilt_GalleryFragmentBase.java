package com.obwhatsapp.gallery;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass0y0;
import X.AnonymousClass10B;
import X.AnonymousClass17N;
import X.AnonymousClass1PD;
import X.AnonymousClass2TA;
import X.C14870pt;
import X.C16150sX;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16500tA;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17250um;
import X.C19150xq;
import X.C19980zJ;
import X.C25711Kv;
import X.C25791Ld;
import X.C26081Mg;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_GalleryFragmentBase extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.Hilt_GalleryFragmentBase.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (this instanceof Hilt_LinksGalleryFragment) {
            Hilt_LinksGalleryFragment hilt_LinksGalleryFragment = (Hilt_LinksGalleryFragment) this;
            if (!hilt_LinksGalleryFragment.A02) {
                hilt_LinksGalleryFragment.A02 = true;
                LinksGalleryFragment linksGalleryFragment = (LinksGalleryFragment) hilt_LinksGalleryFragment;
                C16150sX r2 = ((C17050uS) ((C17060uT) hilt_LinksGalleryFragment.generatedComponent())).A0b;
                linksGalleryFragment.A00 = (C17070uU) r2.ABg.get();
                linksGalleryFragment.A01 = (C17080uV) r2.APK.get();
                linksGalleryFragment.A03 = (C16440t3) r2.AP2.get();
                linksGalleryFragment.A0E = (C16320sq) r2.ARB.get();
                linksGalleryFragment.A05 = (AnonymousClass013) r2.AR8.get();
                linksGalleryFragment.A06 = (C16460t6) r2.A5k.get();
                linksGalleryFragment.A08 = (C19150xq) r2.AFC.get();
                linksGalleryFragment.A09 = (AnonymousClass0y0) r2.AFR.get();
                linksGalleryFragment.A04 = (C16260sj) r2.AQe.get();
                linksGalleryFragment.A05 = (C17250um) r2.A7e.get();
                linksGalleryFragment.A00 = (C19980zJ) r2.A0P.get();
                linksGalleryFragment.A04 = (C26081Mg) r2.AIY.get();
                linksGalleryFragment.A03 = (AnonymousClass17N) r2.ADN.get();
                linksGalleryFragment.A02 = (AnonymousClass10B) r2.AD5.get();
                linksGalleryFragment.A06 = (C25791Ld) r2.AFY.get();
            }
        } else if (this instanceof Hilt_DocumentsGalleryFragment) {
            Hilt_DocumentsGalleryFragment hilt_DocumentsGalleryFragment = (Hilt_DocumentsGalleryFragment) this;
            if (!hilt_DocumentsGalleryFragment.A02) {
                hilt_DocumentsGalleryFragment.A02 = true;
                DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) hilt_DocumentsGalleryFragment;
                C16150sX r22 = ((C17050uS) ((C17060uT) hilt_DocumentsGalleryFragment.generatedComponent())).A0b;
                documentsGalleryFragment.A00 = (C17070uU) r22.ABg.get();
                documentsGalleryFragment.A01 = (C17080uV) r22.APK.get();
                documentsGalleryFragment.A03 = (C16440t3) r22.AP2.get();
                documentsGalleryFragment.A0E = (C16320sq) r22.ARB.get();
                documentsGalleryFragment.A05 = (AnonymousClass013) r22.AR8.get();
                documentsGalleryFragment.A06 = (C16460t6) r22.A5k.get();
                documentsGalleryFragment.A08 = (C19150xq) r22.AFC.get();
                documentsGalleryFragment.A09 = (AnonymousClass0y0) r22.AFR.get();
                documentsGalleryFragment.A04 = (C16260sj) r22.AQe.get();
                documentsGalleryFragment.A06 = (AnonymousClass1PD) r22.AEP.get();
                documentsGalleryFragment.A02 = (C14870pt) r22.AB3.get();
                documentsGalleryFragment.A01 = (C16300so) r22.A5p.get();
                documentsGalleryFragment.A00 = (C19980zJ) r22.A0P.get();
                documentsGalleryFragment.A04 = (AnonymousClass10B) r22.AD5.get();
                documentsGalleryFragment.A05 = (C16500tA) r22.AMF.get();
                documentsGalleryFragment.A03 = (C25711Kv) r22.A7J.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this;
            C16150sX r23 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            galleryFragmentBase.A00 = (C17070uU) r23.ABg.get();
            galleryFragmentBase.A01 = (C17080uV) r23.APK.get();
            galleryFragmentBase.A03 = (C16440t3) r23.AP2.get();
            galleryFragmentBase.A0E = (C16320sq) r23.ARB.get();
            galleryFragmentBase.A05 = (AnonymousClass013) r23.AR8.get();
            galleryFragmentBase.A06 = (C16460t6) r23.A5k.get();
            galleryFragmentBase.A08 = (C19150xq) r23.AFC.get();
            galleryFragmentBase.A09 = (AnonymousClass0y0) r23.AFR.get();
            galleryFragmentBase.A04 = (C16260sj) r23.AQe.get();
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
