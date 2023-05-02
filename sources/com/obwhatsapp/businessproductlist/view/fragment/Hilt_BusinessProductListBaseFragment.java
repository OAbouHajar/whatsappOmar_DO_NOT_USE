package com.obwhatsapp.businessproductlist.view.fragment;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass1KA;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1KV;
import X.AnonymousClass2SO;
import X.AnonymousClass2TA;
import X.AnonymousClass38V;
import X.C14710pd;
import X.C16150sX;
import X.C16320sq;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17170ue;
import X.C18630x0;
import X.C18640x1;
import X.C24511Gf;
import X.C28011Tz;
import X.C49132Rg;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;
import com.obwhatsapp.catalogsearch.view.fragment.Hilt_CatalogSearchProductListFragment;

public abstract class Hilt_BusinessProductListBaseFragment extends WaFragment implements AnonymousClass006 {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessproductlist.view.fragment.Hilt_BusinessProductListBaseFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        C17060uT r4;
        Hilt_CatalogSearchProductListFragment hilt_CatalogSearchProductListFragment;
        if (this instanceof Hilt_CatalogSearchProductListFragment) {
            Hilt_CatalogSearchProductListFragment hilt_CatalogSearchProductListFragment2 = (Hilt_CatalogSearchProductListFragment) this;
            if (!hilt_CatalogSearchProductListFragment2.A02) {
                hilt_CatalogSearchProductListFragment2.A02 = true;
                r4 = (C17060uT) hilt_CatalogSearchProductListFragment2.generatedComponent();
                hilt_CatalogSearchProductListFragment = hilt_CatalogSearchProductListFragment2;
            } else {
                return;
            }
        } else if (this instanceof Hilt_CollectionProductListFragment) {
            Hilt_CollectionProductListFragment hilt_CollectionProductListFragment = (Hilt_CollectionProductListFragment) this;
            if (!hilt_CollectionProductListFragment.A02) {
                hilt_CollectionProductListFragment.A02 = true;
                CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) hilt_CollectionProductListFragment;
                C17050uS r42 = (C17050uS) ((C17060uT) hilt_CollectionProductListFragment.generatedComponent());
                C16150sX r2 = r42.A0b;
                collectionProductListFragment.A00 = (C17070uU) r2.ABg.get();
                collectionProductListFragment.A01 = (C17080uV) r2.APK.get();
                collectionProductListFragment.A04 = (C24511Gf) r2.A3U.get();
                collectionProductListFragment.A03 = (AnonymousClass1KT) r2.A3V.get();
                collectionProductListFragment.A05 = (C28011Tz) r2.AJV.get();
                collectionProductListFragment.A06 = (C18640x1) r2.A3X.get();
                collectionProductListFragment.A07 = (C17170ue) r2.A3W.get();
                C49132Rg r3 = r42.A0Y;
                collectionProductListFragment.A01 = (AnonymousClass2SO) r3.A0y.get();
                collectionProductListFragment.A08 = r3.A1s;
                collectionProductListFragment.A0G = (C16320sq) r2.ARB.get();
                collectionProductListFragment.A0D = (AnonymousClass013) r2.AR8.get();
                collectionProductListFragment.A02 = (AnonymousClass38V) r42.A09.get();
                collectionProductListFragment.A0F = (AnonymousClass1KS) r2.AGl.get();
                collectionProductListFragment.A05 = (C18630x0) r2.A1m.get();
                collectionProductListFragment.A03 = (AnonymousClass1KA) r2.A3a.get();
                collectionProductListFragment.A04 = (C14710pd) r2.A05.get();
                collectionProductListFragment.A02 = (AnonymousClass1KV) r2.A3Y.get();
                return;
            }
            return;
        } else if (!this.A02) {
            this.A02 = true;
            r4 = (C17060uT) generatedComponent();
            hilt_CatalogSearchProductListFragment = (BusinessProductListBaseFragment) this;
        } else {
            return;
        }
        C17050uS r43 = (C17050uS) r4;
        C16150sX r32 = r43.A0b;
        hilt_CatalogSearchProductListFragment.A00 = (C17070uU) r32.ABg.get();
        hilt_CatalogSearchProductListFragment.A01 = (C17080uV) r32.APK.get();
        hilt_CatalogSearchProductListFragment.A04 = (C24511Gf) r32.A3U.get();
        hilt_CatalogSearchProductListFragment.A03 = (AnonymousClass1KT) r32.A3V.get();
        hilt_CatalogSearchProductListFragment.A05 = (C28011Tz) r32.AJV.get();
        hilt_CatalogSearchProductListFragment.A06 = (C18640x1) r32.A3X.get();
        hilt_CatalogSearchProductListFragment.A07 = (C17170ue) r32.A3W.get();
        C49132Rg r22 = r43.A0Y;
        hilt_CatalogSearchProductListFragment.A01 = (AnonymousClass2SO) r22.A0y.get();
        hilt_CatalogSearchProductListFragment.A08 = r22.A1s;
        hilt_CatalogSearchProductListFragment.A0G = (C16320sq) r32.ARB.get();
        hilt_CatalogSearchProductListFragment.A0D = (AnonymousClass013) r32.AR8.get();
        hilt_CatalogSearchProductListFragment.A02 = (AnonymousClass38V) r43.A09.get();
        hilt_CatalogSearchProductListFragment.A0F = (AnonymousClass1KS) r32.AGl.get();
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
