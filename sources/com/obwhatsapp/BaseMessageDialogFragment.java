package com.obwhatsapp;

import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C001000l;
import X.C005302h;
import X.C14550pN;
import X.C18450wi;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.mediaview.MediaViewFragment;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseMessageDialogFragment extends Hilt_BaseMessageDialogFragment {
    public void A0q() {
        if (A04().getInt("secondary_action_color_res", -1) != -1) {
            this.A00 = A04().getInt("secondary_action_color_res", -1);
        }
        super.A0q();
    }

    public final Dialog A1B(Bundle bundle) {
        C32241fu r5 = new C32241fu(A0D());
        r5.A07(true);
        if (this instanceof LegacyMessageDialogFragment) {
            CharSequence charSequence = A04().getCharSequence("title");
            if (charSequence == null) {
                charSequence = A1Q("title_res", "title_params_values", "title_params_types");
            }
            r5.setTitle(charSequence);
        } else if (A04().getInt("title_res") != 0) {
            r5.A02(A04().getInt("title_res"));
        }
        A1S(r5);
        A1R(r5);
        return r5.create();
    }

    public void A1G(AnonymousClass02C r2, String str) {
        C18450wi.A0H(r2, 0);
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }

    public final int A1N() {
        return A04().getInt("id", -1);
    }

    public final int A1O() {
        return A04().getInt("primary_action_text_id_res");
    }

    public final int A1P() {
        return A04().getInt("secondary_action_text_res");
    }

    public final CharSequence A1Q(String str, String str2, String str3) {
        int i2 = A04().getInt(str);
        if (i2 == 0) {
            return null;
        }
        ArrayList<String> stringArrayList = A04().getStringArrayList(str2);
        if (stringArrayList == null) {
            return A0J(i2);
        }
        ArrayList<Integer> integerArrayList = A04().getIntegerArrayList(str3);
        int i3 = 0;
        if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int size = stringArrayList.size();
        Object[] objArr = new Object[size];
        int size2 = stringArrayList.size();
        while (i3 < size2) {
            int i4 = i3 + 1;
            Number number = integerArrayList.get(i3);
            if (number == null || number.intValue() != 1) {
                objArr[i3] = stringArrayList.get(i3);
            } else {
                String str4 = stringArrayList.get(i3);
                C18450wi.A0B(str4);
                objArr[i3] = Long.valueOf(Long.parseLong(str4));
            }
            i3 = i4;
        }
        return A0K(i2, Arrays.copyOf(objArr, size));
    }

    public void A1R(C005302h r5) {
        LegacyMessageDialogFragment legacyMessageDialogFragment = (LegacyMessageDialogFragment) this;
        if (legacyMessageDialogFragment.A1O() == 0 || legacyMessageDialogFragment.A00 == null) {
            r5.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(legacyMessageDialogFragment, 11));
            return;
        }
        r5.setPositiveButton(legacyMessageDialogFragment.A1O(), legacyMessageDialogFragment.A00);
        if (legacyMessageDialogFragment.A1P() != 0 && legacyMessageDialogFragment.A01 != null) {
            r5.setNegativeButton(legacyMessageDialogFragment.A1P(), legacyMessageDialogFragment.A01);
        }
    }

    public void A1S(C005302h r4) {
        if (A04().getInt("message_res") != 0) {
            r4.A06(A1Q("message_res", "message_params_values", "message_params_types"));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18450wi.A0H(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass01A r2 = this.A0D;
        if (r2 != null && (r2 instanceof MediaViewFragment)) {
            MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r2;
            if (A1N() == 101) {
                mediaViewBaseFragment.A1F();
                return;
            }
        }
        C001000l A0C = A0C();
        if (A0C instanceof C14550pN) {
            ((C14550pN) A0C).A2S(A1N());
        }
    }
}
