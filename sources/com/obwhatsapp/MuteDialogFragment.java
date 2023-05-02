package com.obwhatsapp;

import X.AnonymousClass11A;
import X.AnonymousClass127;
import X.C004601z;
import X.C14870pt;
import X.C15450qv;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C15920s8;
import X.C16000sG;
import X.C16030sJ;
import X.C16220sf;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C16760tb;
import X.C18930xU;
import X.C28961Zl;
import X.C32241fu;
import X.C47662Jw;
import X.C91324fj;
import X.C94794lU;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape219S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public int A00 = 0;
    public C14870pt A01;
    public C15900s5 A02;
    public C16760tb A03;
    public AnonymousClass127 A04;
    public C16000sG A05;
    public C16440t3 A06;
    public C15860rz A07;
    public AnonymousClass11A A08;
    public C16220sf A09;
    public C16320sq A0A;
    public boolean A0B = false;

    public static MuteDialogFragment A01(C15830rv r4, int i2) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r4.getRawString());
        bundle.putInt("mute_entry_point", i2);
        muteDialogFragment.A0T(bundle);
        return muteDialogFragment;
    }

    public static MuteDialogFragment A02(Collection collection, int i2) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("jids", C16030sJ.A06(collection));
        bundle.putBoolean("mute_in_conversation_fragment", true);
        bundle.putInt("mute_entry_point", i2);
        muteDialogFragment.A0T(bundle);
        return muteDialogFragment;
    }

    public static /* synthetic */ void A03(MuteDialogFragment muteDialogFragment, List list) {
        Bundle bundle;
        C15830rv A022;
        if (list == null && (bundle = muteDialogFragment.A05) != null && (A022 = C15830rv.A02(bundle.getString("jid"))) != null) {
            muteDialogFragment.A08.A06(A022);
        }
    }

    public Dialog A1B(Bundle bundle) {
        C15830rv A022 = C15830rv.A02(A04().getString("jid"));
        ArrayList<String> stringArrayList = A04().getStringArrayList("jids");
        List A082 = stringArrayList == null ? null : C16030sJ.A08(C15830rv.class, stringArrayList);
        boolean z2 = A04().getBoolean("mute_in_conversation_fragment");
        this.A00 = ((SharedPreferences) this.A07.A01.get()).getInt("last_mute_selection", 0);
        C15900s5 r0 = this.A02;
        C15920s8 r1 = C15910s6.A0e;
        int[] iArr = r0.A05(r1) ? C47662Jw.A00 : C47662Jw.A02;
        int[] iArr2 = this.A02.A05(r1) ? C47662Jw.A01 : C47662Jw.A03;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = C28961Zl.A02(this.A02, iArr[i2], iArr2[i2]);
        }
        if (this.A00 >= length) {
            this.A00 = 0;
        }
        C32241fu r4 = new C32241fu(A0C());
        r4.A02(R.string.str0da0);
        r4.setPositiveButton(R.string.str0e87, new C91324fj(this, A022, A082, z2));
        r4.setNegativeButton(R.string.str0394, new IDxCListenerShape28S0200000_2_I0(this, 1, A082));
        boolean A0E = this.A04.A0E(C16620tM.A02, 2911);
        LayoutInflater layoutInflater = A0D().getLayoutInflater();
        if (A0E) {
            View inflate = layoutInflater.inflate(R.layout.layout03f7, (ViewGroup) null, false);
            RadioGroup radioGroup = (RadioGroup) C004601z.A0E(inflate, R.id.mute_options_radio_group);
            int dimension = (int) A03().getDimension(R.dimen.dimen0762);
            int dimension2 = (int) A03().getDimension(R.dimen.dimen0765);
            for (int i3 = 0; i3 < length; i3++) {
                RadioButton radioButton = new RadioButton(A0u());
                radioGroup.addView(radioButton);
                radioButton.setText(strArr[i3]);
                boolean z3 = false;
                if (i3 == this.A00) {
                    z3 = true;
                }
                radioButton.setChecked(z3);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                layoutParams.setMargins(0, dimension, 0, dimension);
                radioButton.setLayoutParams(layoutParams);
                if (C15450qv.A00()) {
                    radioButton.setPaddingRelative(dimension2, 0, 0, 0);
                } else {
                    radioButton.setPadding(dimension2, 0, 0, 0);
                }
            }
            radioGroup.setOnCheckedChangeListener(new C94794lU(this));
            r4.setView(inflate);
        } else {
            View inflate2 = layoutInflater.inflate(R.layout.layout03f8, (ViewGroup) null, false);
            CompoundButton compoundButton = (CompoundButton) C004601z.A0E(inflate2, R.id.mute_show_notifications);
            compoundButton.setChecked((A022 == null || !this.A09.A0Q(A022)) ? ((SharedPreferences) this.A07.A01.get()).getBoolean("last_mute_show_notifications", false) : this.A09.A07(A022.getRawString()).A0H);
            compoundButton.setOnCheckedChangeListener(new IDxCListenerShape219S0100000_2_I0(this, 0));
            r4.A05(new IDxCListenerShape127S0100000_2_I0(this, 14), strArr, this.A00);
            r4.setView(inflate2);
        }
        return r4.create();
    }

    public final void A1N(C15830rv r14, long j2) {
        C15830rv r8 = r14;
        if (r14 != null && !C16030sJ.A0G(r14) && !C16030sJ.A0R(r14)) {
            C16760tb r7 = this.A03;
            boolean z2 = this.A0B;
            long j3 = j2;
            r7.A0F(r8, A04().getInt("mute_entry_point"), j3, z2);
            C18930xU r6 = r7.A0I;
            long j4 = -1;
            if (j2 != -1) {
                j4 = r7.A0Q.A00() + (j2 - System.currentTimeMillis());
            }
            Set A0B2 = r6.A0B(r14, j4, true);
            if (r7.A1R.A0S(r14, j3, z2)) {
                r6.A0V(A0B2);
            } else {
                r6.A0U(A0B2);
            }
            if (C16030sJ.A0L(r14)) {
                Context context = r7.A0R.A00;
                Log.i("GCM: force updating push config");
                RegistrationIntentService.A03(context, (String) null, (String) null, (String) null);
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        Bundle bundle;
        C15830rv A022;
        if (A04().getString("jids") == null && (bundle = this.A05) != null && (A022 = C15830rv.A02(bundle.getString("jid"))) != null) {
            this.A08.A06(A022);
        }
    }
}
