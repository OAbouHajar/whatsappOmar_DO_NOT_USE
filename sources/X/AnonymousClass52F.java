package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.52F  reason: invalid class name */
public class AnonymousClass52F implements AnonymousClass5SA {
    public Layout A7P(TextView textView, CharSequence charSequence, int i2) {
        Layout layout = textView.getLayout();
        return StaticLayout.Builder.obtain(AnonymousClass1ZW.A02(charSequence), 0, charSequence.length(), textView.getPaint(), i2).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }

    public void Aef(TextView textView) {
        textView.setBreakStrategy(0);
    }
}
