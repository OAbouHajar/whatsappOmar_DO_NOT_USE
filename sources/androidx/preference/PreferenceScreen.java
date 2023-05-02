package androidx.preference;

import X.C014907d;
import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.R;

public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C014907d.A00(context, R.attr.attr03e5, 16842891));
    }

    public void A07() {
        if (this.A06 == null && this.A0K == null) {
            this.A02.size();
        }
    }

    public boolean A0W() {
        return false;
    }
}
