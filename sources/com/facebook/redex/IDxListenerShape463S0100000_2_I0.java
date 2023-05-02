package com.facebook.redex;

import X.AnonymousClass5PY;
import com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment;

public class IDxListenerShape463S0100000_2_I0 implements AnonymousClass5PY {
    public Object A00;
    public final int A01;

    public IDxListenerShape463S0100000_2_I0(StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment, int i2) {
        this.A01 = i2;
        this.A00 = storageUsageDeleteMessagesDialogFragment;
    }

    public final void AOO(boolean z2) {
        int i2 = this.A01;
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = (StorageUsageDeleteMessagesDialogFragment) this.A00;
        if (i2 != 0) {
            storageUsageDeleteMessagesDialogFragment.A05 = z2;
        } else {
            storageUsageDeleteMessagesDialogFragment.A06 = z2;
        }
    }
}
