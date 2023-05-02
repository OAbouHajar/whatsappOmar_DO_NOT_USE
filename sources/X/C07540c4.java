package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.obwhatsapp.R;

/* renamed from: X.0c4  reason: invalid class name and case insensitive filesystem */
public final class C07540c4 implements C12460kR {
    public static C07540c4 A00;

    public /* bridge */ /* synthetic */ CharSequence Aau(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.A00) ? editTextPreference.A05.getString(R.string.str1d28) : editTextPreference.A00;
    }
}
