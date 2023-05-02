package com.whatsapp.stickers;

import X.AnonymousClass1CX;
import X.AnonymousClass3K2;
import X.C001000l;
import X.C32241fu;
import X.C34151jm;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;

public class RemoveStickerFromFavoritesDialogFragment extends Hilt_RemoveStickerFromFavoritesDialogFragment {
    public C34151jm A00;
    public AnonymousClass1CX A01;

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        this.A00 = (C34151jm) A04().getParcelable("sticker");
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01(R.string.str16be);
        return AnonymousClass3K2.A0O(new IDxCListenerShape128S0100000_2_I1(this, 106), A002, R.string.str16bd);
    }
}
