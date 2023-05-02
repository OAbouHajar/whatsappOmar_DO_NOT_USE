package X;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: X.08T  reason: invalid class name */
public class AnonymousClass08T {
    public static PrecomputedText.Params A00(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void A01(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    public static String[] A02(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
}
