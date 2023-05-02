package com.obwhatsapp.storage;

import X.AnonymousClass006;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public abstract class Hilt_StorageUsageGallerySortBottomSheet extends BottomSheetDialogFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1J();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r5) {
        /*
            r4 = this;
            r3 = 1
            r4.A0V = r3
            android.content.ContextWrapper r0 = r4.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r5) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r4.A1J()
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0023
            r4.A02 = r3
            r4.generatedComponent()
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.storage.Hilt_StorageUsageGallerySortBottomSheet.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1J();
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A1J() {
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
