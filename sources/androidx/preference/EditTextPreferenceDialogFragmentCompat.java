package androidx.preference;

import X.AnonymousClass000;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText A00;
    public CharSequence A01;

    public static EditTextPreferenceDialogFragmentCompat A01(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.A0T(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A01);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A01 = bundle == null ? ((EditTextPreference) A1J()).A00 : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    public void A1K(View view) {
        super.A1K(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A00 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A00.setText(this.A01);
            EditText editText2 = this.A00;
            editText2.setSelection(editText2.getText().length());
            A1J();
            return;
        }
        throw AnonymousClass000.A0V("Dialog view must contain an EditText with id @android:id/edit");
    }

    public void A1M(boolean z2) {
        if (z2) {
            String obj = this.A00.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) A1J();
            editTextPreference.A0Q(obj);
            editTextPreference.A0S(obj);
        }
    }

    public boolean A1N() {
        return true;
    }
}
