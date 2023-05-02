package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass0Fp;
import X.AnonymousClass0NL;
import X.AnonymousClass0Z6;
import X.C014907d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.obwhatsapp.R;

public class CheckBoxPreference extends TwoStatePreference {
    public final AnonymousClass0Z6 A00;

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C014907d.A00(context, R.attr.attr00b4, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.A00 = new AnonymousClass0Z6(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A01, i2, i3);
        this.A01 = AnonymousClass000.A0b(obtainStyledAttributes, 5, 0);
        if (this.A02) {
            A04();
        }
        this.A00 = AnonymousClass000.A0b(obtainStyledAttributes, 4, 1);
        if (!this.A02) {
            A04();
        }
        AnonymousClass000.A10(obtainStyledAttributes, this, 3);
    }

    public void A0E(View view) {
        super.A0E(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0U(view.findViewById(16908289));
            A0S(view.findViewById(16908304));
        }
    }

    public void A0R(AnonymousClass0Fp r2) {
        super.A0R(r2);
        A0U(r2.A07(16908289));
        A0S(r2.A07(16908304));
    }

    public final void A0U(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }
}
