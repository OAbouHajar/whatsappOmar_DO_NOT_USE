package com.obwhatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass1DV;
import X.AnonymousClass1JA;
import X.AnonymousClass5DY;
import X.C001000l;
import X.C004601z;
import X.C13680ns;
import X.C15220qW;
import X.C15450qv;
import X.C18450wi;
import X.C434920f;
import X.C67503bn;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;

public final class CallRatingBottomSheet extends BottomSheetDialogFragment {
    public View A00;
    public WaButton A01;
    public WaTextView A02;
    public NonDraggableBottomSheetBehaviour A03;
    public final C15220qW A04 = new AnonymousClass1DV(new AnonymousClass5DY(this));

    public void A0q() {
        super.A0q();
        ViewParent parent = A06().getParent();
        if (parent != null) {
            BottomSheetBehavior.A00((View) parent).A0M(3);
            return;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type android.view.View");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout00d5, viewGroup);
        if (inflate == null) {
            return null;
        }
        for (View A18 : AnonymousClass1JA.A0R(C004601z.A0E(inflate, R.id.close_button), C004601z.A0E(inflate, R.id.not_now_button))) {
            C13680ns.A18(A18, this, 44);
        }
        this.A02 = C13680ns.A0S(inflate, R.id.title_text);
        this.A00 = C004601z.A0E(inflate, R.id.bottom_sheet);
        WaButton waButton = (WaButton) C004601z.A0E(inflate, R.id.submit_button);
        C13680ns.A18(waButton, this, 45);
        this.A01 = waButton;
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(C004601z.A0E(inflate, R.id.bottom_sheet));
        if (A002 != null) {
            NonDraggableBottomSheetBehaviour nonDraggableBottomSheetBehaviour = (NonDraggableBottomSheetBehaviour) A002;
            nonDraggableBottomSheetBehaviour.A0M(3);
            nonDraggableBottomSheetBehaviour.A0J = true;
            nonDraggableBottomSheetBehaviour.A0O(true);
            nonDraggableBottomSheetBehaviour.A0N = false;
            nonDraggableBottomSheetBehaviour.A00 = false;
            this.A03 = nonDraggableBottomSheetBehaviour;
            Dialog dialog = this.A03;
            if (dialog != null) {
                C434920f.A02(R.color.color0792, dialog);
            }
            C15220qW r3 = this.A04;
            C13680ns.A1N(A0H(), ((CallRatingViewModel) r3.getValue()).A0A, this, 50);
            C13680ns.A1N(A0H(), ((CallRatingViewModel) r3.getValue()).A08, this, 49);
            C13680ns.A1N(A0H(), ((CallRatingViewModel) r3.getValue()).A09, this, 51);
            return inflate;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour<@[FlexibleNullability] android.view.View?>");
    }

    public void A13() {
        super.A13();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
    }

    public void A17(Bundle bundle) {
        C001000l A0C;
        super.A17(bundle);
        A1E(0, R.style.style00f3);
        if (!C15450qv.A03() || (A0C = A0C()) == null || A0C.getWindow() != null) {
        }
    }

    public Dialog A1B(Bundle bundle) {
        return new C67503bn(A02(), (CallRatingViewModel) this.A04.getValue(), A19());
    }
}
