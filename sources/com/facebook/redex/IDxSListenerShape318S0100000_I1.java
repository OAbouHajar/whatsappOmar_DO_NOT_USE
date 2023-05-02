package com.facebook.redex;

import X.AnonymousClass0CV;
import X.AnonymousClass0ZW;
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;

public class IDxSListenerShape318S0100000_I1 implements AdapterView.OnItemSelectedListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape318S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        AnonymousClass0CV r1;
        if (this.A01 != 0) {
            if (i2 >= 0) {
                ListPreference listPreference = (ListPreference) this.A00;
                String charSequence = listPreference.A04[i2].toString();
                if (!charSequence.equals(listPreference.A01)) {
                    listPreference.A0Q(charSequence);
                    listPreference.A0U(charSequence);
                }
            }
        } else if (i2 != -1 && (r1 = ((AnonymousClass0ZW) this.A00).A0B) != null) {
            r1.A0B = false;
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
