package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.52H  reason: invalid class name */
public class AnonymousClass52H implements AnonymousClass5QW {
    public Layout A7Q(TextPaint textPaint, CharSequence charSequence, int i2) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
    }
}
