package com.obwhatsapp.biz.product.view.fragment;

import X.AnonymousClass3K2;
import X.AnonymousClass4KA;
import X.C005702l;
import X.C14870pt;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape247S0100000_2_I1;
import com.obwhatsapp.R;

public class ProductReportReasonDialogFragment extends Hilt_ProductReportReasonDialogFragment {
    public int A00 = -1;
    public C14870pt A01;
    public final AnonymousClass4KA[] A02 = {new AnonymousClass4KA(this, "no-match", R.string.str03dc), new AnonymousClass4KA(this, "spam", R.string.str03e0), new AnonymousClass4KA(this, "illegal", R.string.str03da), new AnonymousClass4KA(this, "scam", R.string.str03df), new AnonymousClass4KA(this, "knockoff", R.string.str03db), new AnonymousClass4KA(this, "other", R.string.str03dd)};

    public Dialog A1B(Bundle bundle) {
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        AnonymousClass4KA[] r4 = this.A02;
        int length = r4.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i2 = 0; i2 < length; i2++) {
            charSequenceArr[i2] = A0J(r4[i2].A00);
        }
        A0R.A05(new IDxCListenerShape128S0100000_2_I1(this, 22), charSequenceArr, this.A00);
        A0R.A02(R.string.str03d8);
        A0R.setPositiveButton(R.string.str170e, (DialogInterface.OnClickListener) null);
        C005702l create = A0R.create();
        create.setOnShowListener(new IDxSListenerShape247S0100000_2_I1(this, 0));
        return create;
    }
}
