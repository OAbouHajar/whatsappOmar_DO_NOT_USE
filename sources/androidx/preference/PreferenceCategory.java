package androidx.preference;

import X.AnonymousClass00T;
import X.AnonymousClass031;
import X.AnonymousClass0Fp;
import X.AnonymousClass0WL;
import X.C014907d;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.obwhatsapp.R;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, (AttributeSet) null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C014907d.A00(context, R.attr.attr03df, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Deprecated
    public void A0G(AnonymousClass031 r8) {
        AnonymousClass0WL A01;
        if (Build.VERSION.SDK_INT < 28 && (A01 = r8.A01()) != null) {
            r8.A0J(AnonymousClass0WL.A01(A01.A04(), A01.A05(), A01.A02(), A01.A03(), true, A01.A06()));
        }
    }

    public boolean A0N() {
        return false;
    }

    public boolean A0O() {
        return !super.A0N();
    }

    public void A0R(AnonymousClass0Fp r6) {
        TextView textView;
        super.A0R(r6);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            r6.A0H.setAccessibilityHeading(true);
        } else if (i2 < 21) {
            TypedValue typedValue = new TypedValue();
            Context context = this.A05;
            if (context.getTheme().resolveAttribute(R.attr.attr00e6, typedValue, true) && (textView = (TextView) r6.A07(16908310)) != null && textView.getCurrentTextColor() == AnonymousClass00T.A00(context, R.color.color064a)) {
                textView.setTextColor(typedValue.data);
            }
        }
    }
}
