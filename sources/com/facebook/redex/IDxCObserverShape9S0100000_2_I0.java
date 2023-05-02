package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2BC;
import X.C13680ns;
import X.C49122Rd;
import android.database.ContentObserver;
import android.os.Handler;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;

public class IDxCObserverShape9S0100000_2_I0 extends ContentObserver {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCObserverShape9S0100000_2_I0(C49122Rd r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCObserverShape9S0100000_2_I0(Handler handler, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(handler);
        this.A00 = mediaGalleryFragmentBase;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z2) {
        if (this.A01 != 0) {
            super.onChange(z2);
            ((C49122Rd) this.A00).A0G.A09.post(new RunnableRunnableShape19S0100000_I1_2(this, 2));
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("mediagalleryfragmentbase/onchange ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
        AnonymousClass2BC r0 = mediaGalleryFragmentBase.A0H;
        if (r0 != null) {
            if (!z2) {
                r0.AcE();
                mediaGalleryFragmentBase.A1F();
            }
            mediaGalleryFragmentBase.A00 = mediaGalleryFragmentBase.A0H.getCount();
        }
        mediaGalleryFragmentBase.A06.A01();
    }
}
