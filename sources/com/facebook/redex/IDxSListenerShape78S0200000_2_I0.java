package com.facebook.redex;

import X.AnonymousClass0LL;
import X.AnonymousClass2Ra;
import X.AnonymousClass3MF;
import X.AnonymousClass4MW;
import X.C004601z;
import X.C49112Rc;
import X.C57102q8;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import com.obwhatsapp.backup.google.PromptDialogFragment;

public class IDxSListenerShape78S0200000_2_I0 implements DialogInterface.OnShowListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSListenerShape78S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A02) {
            case 0:
                ((RoundedBottomSheetDialogFragment) this.A00).A1M(AnonymousClass0LL.A00((Dialog) this.A01, R.id.design_bottom_sheet));
                return;
            case 1:
                TextView textView = (TextView) ((Dialog) this.A01).getWindow().findViewById(16908299);
                textView.setMovementMethod(new AnonymousClass3MF());
                C004601z.A0j(textView, new C57102q8(textView, ((PromptDialogFragment) this.A00).A01));
                return;
            default:
                C49112Rc r2 = ((AnonymousClass2Ra) this.A00).A0Q;
                r2.A0H.setFont(((AnonymousClass4MW) this.A01).A02);
                r2.A03();
                return;
        }
    }
}
