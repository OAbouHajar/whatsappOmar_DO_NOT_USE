package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.5B4  reason: invalid class name */
public class AnonymousClass5B4 extends ThreadLocal {
    public final /* synthetic */ String A00;

    public AnonymousClass5B4(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
