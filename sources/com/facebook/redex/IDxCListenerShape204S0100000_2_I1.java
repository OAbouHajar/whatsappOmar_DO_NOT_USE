package com.facebook.redex;

import X.AnonymousClass2Sy;
import X.AnonymousClass3K2;
import X.AnonymousClass5RN;
import X.C59172uy;
import X.C59182uz;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;

public class IDxCListenerShape204S0100000_2_I1 implements AnonymousClass5RN {
    public Object A00;
    public final int A01;

    public IDxCListenerShape204S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ANC() {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                AnonymousClass3K2.A0y(((C59172uy) obj).A05);
                return;
            case 1:
                AnonymousClass3K2.A0y(((EmojiEditTextBottomSheetDialogFragment) obj).A0A);
                return;
            default:
                AnonymousClass3K2.A0y(((C59182uz) obj).A01);
                return;
        }
    }

    public void AQH(int[] iArr) {
        WaEditText waEditText;
        int i2;
        int i3 = this.A01;
        Object obj = this.A00;
        switch (i3) {
            case 0:
                AnonymousClass2Sy.A08(((C59172uy) obj).A05, iArr, 0);
                return;
            case 1:
                EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = (EmojiEditTextBottomSheetDialogFragment) obj;
                waEditText = emojiEditTextBottomSheetDialogFragment.A0A;
                i2 = emojiEditTextBottomSheetDialogFragment.A04;
                break;
            default:
                C59182uz r0 = (C59182uz) obj;
                waEditText = r0.A01;
                i2 = r0.A0B;
                break;
        }
        AnonymousClass2Sy.A08(waEditText, iArr, i2);
    }
}
