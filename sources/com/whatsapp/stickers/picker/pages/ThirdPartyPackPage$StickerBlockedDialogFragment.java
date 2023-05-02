package com.whatsapp.stickers.picker.pages;

import X.AnonymousClass00B;
import X.AnonymousClass1ZW;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import com.obwhatsapp.R;

public class ThirdPartyPackPage$StickerBlockedDialogFragment extends Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment {
    public static ThirdPartyPackPage$StickerBlockedDialogFragment A01(String str) {
        Bundle A0D = C13690nt.A0D();
        ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment = new ThirdPartyPackPage$StickerBlockedDialogFragment();
        A0D.putString("sticker_pack_name", str);
        thirdPartyPackPage$StickerBlockedDialogFragment.A0T(A0D);
        return thirdPartyPackPage$StickerBlockedDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String string = A04().getString("sticker_pack_name");
        AnonymousClass00B.A06(string);
        C32241fu A00 = C32241fu.A00(A02());
        A00.A02(R.string.str16f0);
        Context A0u = A0u();
        Object[] A1b = C13680ns.A1b();
        A1b[0] = Html.escapeHtml(string);
        A00.A06(AnonymousClass1ZW.A00(A0u, A1b, R.string.str16ef));
        C13680ns.A1H(A00, this, 110, R.string.str16ee);
        C13690nt.A1H(A00, this, 111, R.string.str0394);
        return A00.create();
    }
}
