package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass05J;
import X.AnonymousClass29B;
import X.C86144Rj;
import com.obwhatsapp.gallery.MediaGalleryActivity;

public class IDxDListenerShape341S0100000_2_I1 implements AnonymousClass29B {
    public Object A00;
    public final int A01;

    public IDxDListenerShape341S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void APW() {
        if (this.A01 != 0) {
            AnonymousClass01A r1 = ((AnonymousClass01A) this.A00).A0D;
            if (r1 instanceof AnonymousClass29B) {
                ((AnonymousClass29B) r1).APW();
                return;
            }
            return;
        }
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
        C86144Rj r0 = mediaGalleryActivity.A0F;
        if (r0 != null) {
            r0.A04.clear();
        }
        AnonymousClass05J r02 = mediaGalleryActivity.A06;
        if (r02 != null) {
            r02.A05();
        }
    }
}
