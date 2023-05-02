package com.obwhatsapp.contact.photos;

import X.AnonymousClass05T;
import X.AnonymousClass2Ao;
import X.C001300o;
import X.C011405n;

public class ContactPhotos$LoaderLifecycleEventObserver implements AnonymousClass05T {
    public final AnonymousClass2Ao A00;

    public ContactPhotos$LoaderLifecycleEventObserver(AnonymousClass2Ao r1) {
        this.A00 = r1;
    }

    public void AXa(C011405n r2, C001300o r3) {
        if (r2 == C011405n.ON_DESTROY) {
            this.A00.A00();
            r3.getLifecycle().A01(this);
        }
    }
}
