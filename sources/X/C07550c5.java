package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.obwhatsapp.R;

/* renamed from: X.0c5  reason: invalid class name and case insensitive filesystem */
public final class C07550c5 implements C12460kR {
    public static C07550c5 A00;

    public /* bridge */ /* synthetic */ CharSequence Aau(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.A0T()) ? listPreference.A05.getString(R.string.str1d28) : listPreference.A0T();
    }
}
