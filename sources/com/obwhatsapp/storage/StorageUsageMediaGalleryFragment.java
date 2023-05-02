package com.obwhatsapp.storage;

import X.AnonymousClass00B;
import X.AnonymousClass1PD;
import X.AnonymousClass1YG;
import X.AnonymousClass2BE;
import X.AnonymousClass2BF;
import X.C004601z;
import X.C15830rv;
import X.C16300so;
import X.C16460t6;
import X.C16480t8;
import X.C16500tA;
import X.C16730tY;
import X.C18940xV;
import X.C19150xq;
import X.C19980zJ;
import X.C25791Ld;
import X.C54502hd;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;

public class StorageUsageMediaGalleryFragment extends Hilt_StorageUsageMediaGalleryFragment {
    public int A00;
    public C19980zJ A01;
    public C16300so A02;
    public C16460t6 A03;
    public C16480t8 A04;
    public C19150xq A05;
    public C16500tA A06;
    public C15830rv A07;
    public AnonymousClass1PD A08;
    public C25791Ld A09;
    public final C18940xV A0A = new IDxMObserverShape73S0100000_1_I0(this, 10);

    public static StorageUsageMediaGalleryFragment A01(String str, int i2) {
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("storage_media_gallery_fragment_gallery_type", i2);
        bundle.putString("storage_media_gallery_fragment_jid", str);
        bundle.putInt("sort_type", 2);
        storageUsageMediaGalleryFragment.A0T(bundle);
        return storageUsageMediaGalleryFragment;
    }

    public void A0n(Bundle bundle) {
        this.A0V = true;
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            int i2 = bundle2.getInt("storage_media_gallery_fragment_gallery_type", 0);
            this.A00 = i2;
            if (i2 == 0) {
                C15830rv A022 = C15830rv.A02(bundle2.getString("storage_media_gallery_fragment_jid"));
                AnonymousClass00B.A06(A022);
                this.A07 = A022;
            } else {
                C004601z.A0E(this.A0A, R.id.no_media_text).setVisibility(8);
            }
        }
        C004601z.A0p(this.A08, true);
        C004601z.A0p(A06().findViewById(R.id.no_media), true);
        A1I(false);
        this.A05.A02(this.A0A);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout0598, viewGroup, false);
    }

    public void A12() {
        super.A12();
        this.A05.A03(this.A0A);
    }

    public boolean A1M(AnonymousClass2BF r5, C54502hd r6) {
        C16730tY r3 = ((AnonymousClass2BE) r5).A03;
        boolean A1K = A1K();
        AnonymousClass1YG r0 = (AnonymousClass1YG) A0D();
        if (A1K) {
            r6.setChecked(r0.Agy(r3));
            return true;
        }
        r0.Ag8(r3);
        r6.setChecked(true);
        return true;
    }
}
