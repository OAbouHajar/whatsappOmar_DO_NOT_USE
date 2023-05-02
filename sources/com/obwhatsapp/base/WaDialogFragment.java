package com.obwhatsapp.base;

import X.AnonymousClass013;
import X.C005702l;
import X.C06490Wi;
import X.C14710pd;
import X.C16620tM;
import X.C17070uU;
import X.C17080uV;
import X.C45902Bo;
import X.C54472hZ;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class WaDialogFragment extends Hilt_WaDialogFragment {
    public int A00 = -1;
    public C17070uU A01;
    public AnonymousClass013 A02;
    public C17080uV A03;
    public C14710pd A04;

    public void A0o(boolean z2) {
        C54472hZ.A02(this, this.A01, this.A03, this.A0j, z2);
        super.A0o(z2);
    }

    public void A0q() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        super.A0q();
        Dialog dialog = this.A03;
        if (dialog instanceof C005702l) {
            C005702l r4 = (C005702l) dialog;
            A1K(r4.A00.A0G);
            C06490Wi r2 = r4.A00;
            A1K(r2.A0E);
            A1K(r2.A0F);
            Button button = r2.A0G;
            if (!(button == null || (text3 = button.getText()) == null)) {
                button.setContentDescription(text3);
            }
            Button button2 = r2.A0E;
            if (!(button2 == null || (text2 = button2.getText()) == null)) {
                button2.setContentDescription(text2);
            }
            Button button3 = r2.A0F;
            if (!(button3 == null || (text = button3.getText()) == null)) {
                button3.setContentDescription(text);
            }
            View findViewById = r4.findViewById(16908299);
            if (findViewById != null) {
                if (A1L()) {
                    C45902Bo.A03(findViewById);
                } else {
                    C45902Bo.A04(findViewById);
                }
            }
            if (this.A00 != -1) {
                r2.A0E.setTextColor(A03().getColor(this.A00));
            }
        }
    }

    public final void A1K(Button button) {
        C14710pd r2;
        if (button != null && button.getText() != null) {
            CharSequence text = button.getText();
            if (!(this.A02 == null || (r2 = this.A04) == null || r2.A0E(C16620tM.A02, 1963))) {
                text = text.toString().toUpperCase(AnonymousClass013.A00(this.A02.A00));
            }
            button.setText(text);
        }
    }

    public boolean A1L() {
        return false;
    }
}
