package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.52G  reason: invalid class name */
public class AnonymousClass52G implements AnonymousClass5SA {
    public Layout A7P(TextView textView, CharSequence charSequence, int i2) {
        Layout layout = textView.getLayout();
        return new StaticLayout(AnonymousClass1ZW.A02(charSequence), textView.getPaint(), i2, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
    }

    public void Aef(TextView textView) {
    }
}
