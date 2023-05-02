package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass0Fp;
import X.AnonymousClass0NL;
import X.AnonymousClass0Z8;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.R;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final AnonymousClass0Z8 A02 = new AnonymousClass0Z8(this);

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.attr04d8, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A0C, R.attr.attr04d8, 0);
        this.A01 = AnonymousClass000.A0b(obtainStyledAttributes, 7, 0);
        if (this.A02) {
            A04();
        }
        this.A00 = AnonymousClass000.A0b(obtainStyledAttributes, 6, 1);
        if (!this.A02) {
            A04();
        }
        this.A01 = AnonymousClass000.A0b(obtainStyledAttributes, 9, 3);
        A04();
        this.A00 = AnonymousClass000.A0b(obtainStyledAttributes, 8, 4);
        A04();
        AnonymousClass000.A10(obtainStyledAttributes, this, 5);
    }

    public void A0E(View view) {
        super.A0E(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0U(view.findViewById(R.id.switchWidget));
            A0S(view.findViewById(16908304));
        }
    }

    public void A0R(AnonymousClass0Fp r2) {
        super.A0R(r2);
        A0U(r2.A07(R.id.switchWidget));
        A0S(r2.A07(16908304));
    }

    public final void A0U(View view) {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }
}
