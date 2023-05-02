package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.4Rk  reason: invalid class name and case insensitive filesystem */
public class C86154Rk {
    public final char A00;
    public final char A01;
    public final int A02;
    public final int A03;
    public final DecimalFormat A04;

    public C86154Rk(String str, Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);
        this.A04 = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        this.A00 = decimalFormatSymbols.getDecimalSeparator();
        this.A01 = decimalFormatSymbols.getGroupingSeparator();
        decimalFormat.applyPattern(str);
        decimalFormat.setGroupingUsed(false);
        int indexOf = str.indexOf(46);
        indexOf = indexOf == -1 ? str.length() : indexOf;
        int lastIndexOf = str.lastIndexOf(44, indexOf - 1);
        int i2 = (indexOf - lastIndexOf) - 1;
        this.A02 = i2;
        int lastIndexOf2 = str.lastIndexOf(44, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            this.A03 = i2;
        } else {
            this.A03 = (lastIndexOf - lastIndexOf2) - 1;
        }
    }

    public final String A00(String str) {
        int lastIndexOf = str.lastIndexOf(this.A00);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        int i2 = lastIndexOf - 1;
        while (i2 > 0 && Character.isDigit(str.charAt(i2 - 1))) {
            i2--;
        }
        int i3 = i2 + 1;
        StringBuilder A0r = AnonymousClass000.A0r(str.substring(0, i3));
        while (i3 < lastIndexOf) {
            int i4 = (lastIndexOf - i3) - this.A02;
            if (i4 == 0 || (i4 > 0 && i4 % this.A03 == 0)) {
                A0r.append(this.A01);
            }
            A0r.append(str.charAt(i3));
            i3++;
        }
        return AnonymousClass000.A0h(str.substring(lastIndexOf), A0r);
    }
}
