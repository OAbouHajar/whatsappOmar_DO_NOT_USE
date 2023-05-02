package com.obwhatsapp.ephemeral;

import X.AnonymousClass02C;
import X.C004601z;
import X.C119755yz;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C17120uZ;
import X.C32241fu;
import X.C40491uD;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ChangeEphemeralSettingsDialog extends Hilt_ChangeEphemeralSettingsDialog {
    public C17120uZ A00;

    public static void A01(AnonymousClass02C r3, int i2, int i3) {
        ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog = new ChangeEphemeralSettingsDialog();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("from_settings", i2);
        A0D.putInt("entry_point", i3);
        changeEphemeralSettingsDialog.A0T(A0D);
        changeEphemeralSettingsDialog.A1G(r3, "group_ephemeral_settings_dialog");
    }

    public Dialog A1B(Bundle bundle) {
        int i2;
        View inflate = A0D().getLayoutInflater().inflate(R.layout.layout0235, (ViewGroup) null, false);
        RadioGroup radioGroup = (RadioGroup) C004601z.A0E(inflate, R.id.disappearing_messages_settings_dialog_radio_group);
        TextView A0L = C13680ns.A0L(inflate, R.id.disappearing_messages_settings_dialog_title);
        int i3 = A04().getInt("from_settings", 0);
        int i4 = A04().getInt("entry_point", 0);
        C14710pd r1 = this.A04;
        if (i4 == 2) {
            C40491uD.A05(radioGroup, r1, i3, true, true);
            i2 = R.string.str0719;
        } else {
            C40491uD.A05(radioGroup, r1, i3, false, false);
            i2 = R.string.str080f;
        }
        C13680ns.A1F(A0L, this, i2);
        for (int i5 = 0; i5 < radioGroup.getChildCount(); i5++) {
            View childAt = radioGroup.getChildAt(i5);
            if (childAt instanceof RadioButton) {
                ((TextView) childAt).setTextSize(0, A03().getDimension(R.dimen.dimen0311));
            }
        }
        radioGroup.setOnCheckedChangeListener(new C119755yz(this));
        C32241fu A002 = C32241fu.A00(A02());
        A002.setView(inflate);
        return A002.create();
    }
}
