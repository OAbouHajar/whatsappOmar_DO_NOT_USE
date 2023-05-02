package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass06L;
import X.AnonymousClass0Fp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExpandButton extends Preference {
    public long A00;

    public ExpandButton(Context context, List list, long j2) {
        super(context, (AttributeSet) null);
        this.A01 = R.layout.layout0276;
        Context context2 = this.A05;
        Drawable A01 = AnonymousClass06L.A01(context2, R.drawable.ic_arrow_down_24dp);
        if (this.A07 != A01) {
            this.A07 = A01;
            this.A00 = 0;
            A04();
        }
        this.A00 = R.drawable.ic_arrow_down_24dp;
        A0A(R.string.str1cb8);
        if (999 != this.A02) {
            this.A02 = 999;
            A05();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.A0H;
            boolean z2 = preference instanceof PreferenceGroup;
            if (z2 && !TextUtils.isEmpty(charSequence2)) {
                A0u.add(preference);
            }
            if (A0u.contains(preference.A0E)) {
                if (z2) {
                    A0u.add(preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    Object[] objArr = new Object[2];
                    AnonymousClass000.A1E(charSequence, charSequence2, objArr);
                    charSequence = context2.getString(R.string.str1dc5, objArr);
                }
            }
        }
        A0I(charSequence);
        this.A00 = j2 + SearchActionVerificationClientService.MS_TO_NS;
    }

    public long A00() {
        return this.A00;
    }

    public void A0R(AnonymousClass0Fp r2) {
        super.A0R(r2);
        r2.A00 = false;
    }
}
