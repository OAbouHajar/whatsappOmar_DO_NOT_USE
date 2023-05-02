package androidx.preference;

import X.AnonymousClass0Fp;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.facebook.redex.IDxSListenerShape318S0100000_I1;
import com.obwhatsapp.R;

public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02 = new IDxSListenerShape318S0100000_I1(this, 1);
    public final ArrayAdapter A03;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.attr015b, 0);
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.A03;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public void A04() {
        super.A04();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public void A07() {
        this.A00.performClick();
    }

    public void A0R(AnonymousClass0Fp r6) {
        int i2;
        Spinner spinner = (Spinner) r6.A0H.findViewById(R.id.spinner);
        this.A00 = spinner;
        spinner.setAdapter(this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = this.A01;
        CharSequence[] charSequenceArr = this.A04;
        if (str != null && charSequenceArr != null) {
            i2 = charSequenceArr.length;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    if (charSequenceArr[i2].equals(str)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            spinner2.setSelection(i2);
            super.A0R(r6);
        }
        i2 = -1;
        spinner2.setSelection(i2);
        super.A0R(r6);
    }

    public void A0V(CharSequence[] charSequenceArr) {
        this.A03 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.A03;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.A03;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
