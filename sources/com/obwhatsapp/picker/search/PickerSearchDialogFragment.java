package com.obwhatsapp.picker.search;

import X.AnonymousClass1yX;
import X.AnonymousClass3H7;
import X.C001000l;
import X.C13680ns;
import X.C41791wf;
import X.C434920f;
import X.C47572Jn;
import X.C810446p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxKListenerShape224S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;

public abstract class PickerSearchDialogFragment extends Hilt_PickerSearchDialogFragment {
    public AnonymousClass3H7 A00;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C001000l A0C = A0C();
        if (!(A0C instanceof AnonymousClass1yX)) {
            return null;
        }
        ((AnonymousClass1yX) A0C).AUl(this);
        return null;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style01e2);
    }

    public Dialog A1B(Bundle bundle) {
        Dialog A1B = super.A1B(bundle);
        C434920f.A02(R.color.color06b4, A1B);
        A1B.setOnKeyListener(new IDxKListenerShape224S0100000_2_I1(this, 3));
        return A1B;
    }

    public void A1M() {
        if (this instanceof ExpressionsSearchDialogFragment) {
            ExpressionsSearchDialogFragment expressionsSearchDialogFragment = (ExpressionsSearchDialogFragment) this;
            ExpressionSearchViewModel expressionSearchViewModel = expressionsSearchDialogFragment.A08;
            C810446p.A00(expressionSearchViewModel.A05, expressionSearchViewModel.A06);
            expressionsSearchDialogFragment.A1C();
            return;
        }
        A1C();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C47572Jn r0;
        super.onDismiss(dialogInterface);
        AnonymousClass3H7 r2 = this.A00;
        if (r2 != null) {
            r2.A07 = false;
            if (r2.A06 && (r0 = r2.A00) != null) {
                r0.A06();
            }
            r2.A03 = null;
            C41791wf r02 = r2.A08;
            r02.A00 = null;
            C13680ns.A1T(r02.A02);
            this.A00 = null;
        }
    }
}
