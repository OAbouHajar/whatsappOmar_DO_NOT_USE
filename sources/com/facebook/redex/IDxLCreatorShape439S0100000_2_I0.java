package com.facebook.redex;

import X.AnonymousClass2BC;
import X.AnonymousClass2BD;
import X.C54552hi;
import X.C76033tA;
import com.obwhatsapp.gallery.MediaGalleryFragment;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;

public class IDxLCreatorShape439S0100000_2_I0 implements C54552hi {
    public Object A00;
    public final int A01;

    public IDxLCreatorShape439S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final AnonymousClass2BC A7S(boolean z2) {
        AnonymousClass2BD r4;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) obj;
            r4 = new C76033tA(storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A04, storageUsageMediaGalleryFragment.A07, storageUsageMediaGalleryFragment.A09, storageUsageMediaGalleryFragment.A02, storageUsageMediaGalleryFragment.A00);
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) obj;
            r4 = new AnonymousClass2BD(mediaGalleryFragment.A00, mediaGalleryFragment.A01, mediaGalleryFragment.A03, mediaGalleryFragment.A04);
        }
        r4.A02();
        return r4;
    }
}
