package androidx.preference;

import X.AnonymousClass000;
import X.C005302h;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape124S0100000_I1;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    public static ListPreferenceDialogFragmentCompat A01(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.A0T(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }

    public void A17(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A17(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A1J();
            if (listPreference.A03 == null || listPreference.A04 == null) {
                throw AnonymousClass000.A0V("ListPreference requires an entries array and an entryValues array.");
            }
            this.A00 = listPreference.A0S(listPreference.A01);
            this.A01 = listPreference.A03;
            charSequenceArray = listPreference.A04;
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
    }

    public void A1L(C005302h r5) {
        r5.A05(new IDxCListenerShape124S0100000_I1(this, 1), this.A01, this.A00);
        r5.A09((DialogInterface.OnClickListener) null, (CharSequence) null);
    }

    public void A1M(boolean z2) {
        int i2;
        if (z2 && (i2 = this.A00) >= 0) {
            String charSequence = this.A02[i2].toString();
            ListPreference listPreference = (ListPreference) A1J();
            listPreference.A0Q(charSequence);
            listPreference.A0U(charSequence);
        }
    }
}
