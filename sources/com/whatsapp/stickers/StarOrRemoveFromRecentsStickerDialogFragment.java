package com.whatsapp.stickers;

import X.AnonymousClass00B;
import X.AnonymousClass1CX;
import X.C001000l;
import X.C13690nt;
import X.C16320sq;
import X.C18930xU;
import X.C212613k;
import X.C32241fu;
import X.C34151jm;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.redex.IDxCListenerShape1S0110000_2_I1;
import com.obwhatsapp.R;

public class StarOrRemoveFromRecentsStickerDialogFragment extends Hilt_StarOrRemoveFromRecentsStickerDialogFragment {
    public C18930xU A00;
    public C212613k A01;
    public C212613k A02;
    public C34151jm A03;
    public AnonymousClass1CX A04;
    public C16320sq A05;

    public static StarOrRemoveFromRecentsStickerDialogFragment A01(C34151jm r3, boolean z2) {
        StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = new StarOrRemoveFromRecentsStickerDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("sticker", r3);
        A0D.putBoolean("avatar_sticker", z2);
        starOrRemoveFromRecentsStickerDialogFragment.A0T(A0D);
        return starOrRemoveFromRecentsStickerDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        Bundle A042 = A04();
        Parcelable parcelable = A042.getParcelable("sticker");
        AnonymousClass00B.A06(parcelable);
        this.A03 = (C34151jm) parcelable;
        IDxCListenerShape1S0110000_2_I1 iDxCListenerShape1S0110000_2_I1 = new IDxCListenerShape1S0110000_2_I1(this, 5, A042.getBoolean("avatar_sticker", false));
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01(R.string.str16c1);
        A002.setPositiveButton(R.string.str16c0, iDxCListenerShape1S0110000_2_I1);
        A002.A0B(iDxCListenerShape1S0110000_2_I1, R.string.str16bc);
        A002.setNegativeButton(R.string.str0394, iDxCListenerShape1S0110000_2_I1);
        return A002.create();
    }
}
