package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass0PG;
import X.C005302h;
import X.C06700Xi;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set A00 = new HashSet();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    public static MultiSelectListPreferenceDialogFragmentCompat A01(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.A0T(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }

    public void A17(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A17(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1J();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = multiSelectListPreference.A02) == null) {
                throw AnonymousClass000.A0V("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            Set set = this.A00;
            set.clear();
            set.addAll(multiSelectListPreference.A00);
            this.A01 = false;
            this.A02 = charSequenceArr;
        } else {
            Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
    }

    public void A1L(C005302h r6) {
        int length = this.A03.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.A00.contains(this.A03[i2].toString());
        }
        CharSequence[] charSequenceArr = this.A02;
        C06700Xi r0 = new C06700Xi(this);
        AnonymousClass0PG r1 = r6.A01;
        r1.A0M = charSequenceArr;
        r1.A09 = r0;
        r1.A0N = zArr;
        r1.A0K = true;
    }

    public void A1M(boolean z2) {
        if (z2 && this.A01) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1J();
            Set set = this.A00;
            multiSelectListPreference.A0Q(set);
            multiSelectListPreference.A0S(set);
        }
        this.A01 = false;
    }
}
