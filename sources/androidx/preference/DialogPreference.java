package androidx.preference;

import X.AnonymousClass01A;
import X.AnonymousClass02v;
import X.AnonymousClass0NL;
import X.C014907d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;

public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C014907d.A00(context, R.attr.attr0141, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A02, i2, i3);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.A03 = string;
        if (string == null) {
            this.A03 = this.A0H;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.A02 = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.A05 = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.A04 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public void A07() {
        DialogFragment A012;
        AnonymousClass02v r4 = this.A0F.A04;
        if (r4 != null) {
            AnonymousClass01A r42 = (AnonymousClass01A) r4;
            if (r42.A0G().A0B("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    A012 = EditTextPreferenceDialogFragmentCompat.A01(this.A0L);
                } else if (this instanceof ListPreference) {
                    A012 = ListPreferenceDialogFragmentCompat.A01(this.A0L);
                } else if (this instanceof MultiSelectListPreference) {
                    A012 = MultiSelectListPreferenceDialogFragmentCompat.A01(this.A0L);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot display dialog for an unknown Preference type: ");
                    sb.append(getClass().getSimpleName());
                    sb.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(sb.toString());
                }
                A012.A0W(r42, 0);
                A012.A1G(r42.A0G(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }
}
