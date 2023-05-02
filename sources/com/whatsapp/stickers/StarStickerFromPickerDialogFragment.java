package com.whatsapp.stickers;

import X.AnonymousClass00B;
import X.AnonymousClass01Z;
import X.AnonymousClass1CX;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C16320sq;
import X.C32241fu;
import X.C34151jm;
import X.C55532jo;
import X.C608836m;
import X.C91544g5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.Collections;

public class StarStickerFromPickerDialogFragment extends Hilt_StarStickerFromPickerDialogFragment {
    public AnonymousClass01Z A00;
    public C55532jo A01;
    public C34151jm A02;
    public AnonymousClass1CX A03;
    public C16320sq A04;

    public static StarStickerFromPickerDialogFragment A01(C34151jm r3) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("sticker", r3);
        starStickerFromPickerDialogFragment.A0T(A0D);
        return starStickerFromPickerDialogFragment;
    }

    public static StarStickerFromPickerDialogFragment A02(C34151jm r3, int i2) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("sticker", r3);
        A0D.putInt("position", i2);
        starStickerFromPickerDialogFragment.A0T(A0D);
        return starStickerFromPickerDialogFragment;
    }

    public static /* synthetic */ void A03(StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment) {
        C34151jm r6 = starStickerFromPickerDialogFragment.A02;
        if (r6.A0F == null) {
            starStickerFromPickerDialogFragment.A03.A0F(Collections.singleton(r6));
            return;
        }
        C55532jo r2 = starStickerFromPickerDialogFragment.A01;
        Integer valueOf = starStickerFromPickerDialogFragment.A04().containsKey("position") ? Integer.valueOf(starStickerFromPickerDialogFragment.A04().getInt("position")) : null;
        starStickerFromPickerDialogFragment.A04.Ack(new C608836m(starStickerFromPickerDialogFragment.A00, r2, starStickerFromPickerDialogFragment.A03), C13690nt.A0I(r6, valueOf));
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A01 = (C55532jo) context;
        } catch (ClassCastException unused) {
        }
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        Parcelable parcelable = A04().getParcelable("sticker");
        AnonymousClass00B.A06(parcelable);
        this.A02 = (C34151jm) parcelable;
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01(R.string.str16c1);
        String A0J = A0J(R.string.str16c0);
        A002.A09(new IDxCListenerShape128S0100000_2_I1(this, 107), A0J);
        C13690nt.A1E(A002);
        C005702l create = A002.create();
        create.setOnShowListener(new C91544g5(create, A0J));
        return create;
    }
}
