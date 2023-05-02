package com.obwhatsapp.text;

import X.AnonymousClass1ZW;
import X.C41651wK;
import android.text.Editable;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;

public class IDxWAdapterShape23S0200000_2_I1 extends C41651wK {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxWAdapterShape23S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A02 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        boolean A0E = AnonymousClass1ZW.A0E(editable.toString());
        View view = (View) this.A01;
        boolean z2 = true;
        if (A0E) {
            z2 = false;
        }
        view.setEnabled(z2);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (1 - this.A02 != 0) {
            super.onTextChanged(charSequence, i2, i3, i4);
            return;
        }
        StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
        Runnable runnable = stickerSearchDialogFragment.A0D;
        if (runnable != null) {
            stickerSearchDialogFragment.A05.removeCallbacks(runnable);
        }
        View view = (View) this.A01;
        RunnableRunnableShape3S0300000_I1 runnableRunnableShape3S0300000_I1 = new RunnableRunnableShape3S0300000_I1(this, charSequence, view, 38);
        stickerSearchDialogFragment.A0D = runnableRunnableShape3S0300000_I1;
        stickerSearchDialogFragment.A05.postDelayed(runnableRunnableShape3S0300000_I1, 500);
        view.setVisibility(0);
    }
}
