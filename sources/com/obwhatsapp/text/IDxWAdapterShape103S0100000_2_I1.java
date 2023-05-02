package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass22J;
import X.C17020u3;
import X.C18450wi;
import X.C41651wK;
import X.C45922Bq;
import X.C614739b;
import android.os.Handler;
import android.text.Editable;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment;
import com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment;
import com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;

public class IDxWAdapterShape103S0100000_2_I1 extends C41651wK {
    public Object A00;
    public final int A01;

    public IDxWAdapterShape103S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        if (2 - this.A01 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        C18450wi.A0H(editable, 0);
        GroupJoinRequestReasonBottomSheetFragment groupJoinRequestReasonBottomSheetFragment = (GroupJoinRequestReasonBottomSheetFragment) this.A00;
        String obj = editable.toString();
        String str2 = "";
        if (obj != null) {
            if (obj.contains("⠀")) {
                obj = obj.replace("⠀", " ");
            }
            str2 = obj.trim();
        }
        C18450wi.A0B(str2);
        groupJoinRequestReasonBottomSheetFragment.A08 = str2;
        WaButton waButton = groupJoinRequestReasonBottomSheetFragment.A01;
        if (waButton != null) {
            AnonymousClass01V r1 = groupJoinRequestReasonBottomSheetFragment.A04;
            if (r1 != null) {
                C17020u3 r0 = groupJoinRequestReasonBottomSheetFragment.A07;
                if (r0 != null) {
                    waButton.setEnabled(C45922Bq.A0B(r1, r0, str2));
                    return;
                }
                str = "sharedPreferencesFactory";
            } else {
                str = "systemServices";
            }
            throw C18450wi.A03(str);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        RunnableRunnableShape1S0201000_I1 runnableRunnableShape1S0201000_I1;
        switch (this.A01) {
            case 0:
                C18450wi.A0H(charSequence, 0);
                ((AnonymousClass22J) this.A00).AIU(charSequence);
                return;
            case 1:
                C614739b r5 = (C614739b) this.A00;
                if (r5.A0I == 2) {
                    int length = charSequence.length();
                    RunnableRunnableShape1S0201000_I1 runnableRunnableShape1S0201000_I12 = r5.A05;
                    if (runnableRunnableShape1S0201000_I12 == null) {
                        runnableRunnableShape1S0201000_I1 = new RunnableRunnableShape1S0201000_I1(new RunnableRunnableShape18S0100000_I1_1((Object) r5, 20), length, new RunnableRunnableShape18S0100000_I1_1((Object) r5, 21), 6);
                        r5.A05 = runnableRunnableShape1S0201000_I1;
                    } else {
                        r5.A0L.A0J(runnableRunnableShape1S0201000_I12);
                        runnableRunnableShape1S0201000_I1 = r5.A05;
                        runnableRunnableShape1S0201000_I1.A00 = length;
                    }
                    r5.A0L.A0L(runnableRunnableShape1S0201000_I1, 275);
                    return;
                }
                return;
            case 3:
                C18450wi.A0H(charSequence, 0);
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
                confirmDateOfBirthBottomSheetFragment.A1D(confirmDateOfBirthBottomSheetFragment.A1E(charSequence.toString()));
                return;
            case 4:
                C18450wi.A0H(charSequence, 0);
                ((ConfirmLegalNameBottomSheetFragment) this.A00).A1C(AnonymousClass000.A1Q(charSequence.length()));
                return;
            case 5:
                ExpressionSearchViewModel expressionSearchViewModel = ((ExpressionsSearchDialogFragment) this.A00).A08;
                Handler handler = expressionSearchViewModel.A00;
                if (handler != null) {
                    Runnable runnable = expressionSearchViewModel.A07;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_2 = new RunnableRunnableShape14S0200000_I1_2(expressionSearchViewModel, 39, charSequence);
                    expressionSearchViewModel.A07 = runnableRunnableShape14S0200000_I1_2;
                    expressionSearchViewModel.A00.postDelayed(runnableRunnableShape14S0200000_I1_2, 500);
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i2, i3, i4);
                return;
        }
    }
}
