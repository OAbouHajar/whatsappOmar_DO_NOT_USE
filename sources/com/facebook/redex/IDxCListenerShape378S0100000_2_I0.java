package com.facebook.redex;

import X.AnonymousClass1yR;
import X.AnonymousClass1yT;
import X.AnonymousClass5PP;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;

public class IDxCListenerShape378S0100000_2_I0 implements AnonymousClass5PP {
    public Object A00;
    public final int A01;

    public IDxCListenerShape378S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AWv() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((StorageUsageGalleryActivity) obj).A37();
        } else {
            ((AnonymousClass1yR) ((AnonymousClass1yT) obj)).A00.A00();
        }
    }
}
