package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.1t1  reason: invalid class name and case insensitive filesystem */
public class C39761t1 {
    public static final boolean A02;
    public final DecimalFormat A00;
    public final C86154Rk A01;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 24) {
            z2 = true;
        }
        A02 = z2;
    }

    public C39761t1(String str, Locale locale) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new C86154Rk(str, locale);
        }
    }

    public Number A00(String str) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            AnonymousClass00B.A06(decimalFormat);
            return decimalFormat.parse(str);
        }
        C86154Rk r0 = this.A01;
        AnonymousClass00B.A06(r0);
        return r0.A04.parse(str.replace(String.valueOf(r0.A01), ""));
    }

    public String A01(double d2) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            AnonymousClass00B.A06(decimalFormat);
            return decimalFormat.format(d2);
        }
        C86154Rk r1 = this.A01;
        AnonymousClass00B.A06(r1);
        return r1.A00(r1.A04.format(d2));
    }

    public String A02(BigDecimal bigDecimal) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            AnonymousClass00B.A06(decimalFormat);
            return decimalFormat.format(bigDecimal);
        }
        C86154Rk r1 = this.A01;
        AnonymousClass00B.A06(r1);
        return r1.A00(r1.A04.format(bigDecimal));
    }

    public void A03(int i2) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            AnonymousClass00B.A06(decimalFormat);
            decimalFormat.setMinimumFractionDigits(i2);
            decimalFormat.setMaximumFractionDigits(i2);
            return;
        }
        C86154Rk r0 = this.A01;
        AnonymousClass00B.A06(r0);
        java.text.DecimalFormat decimalFormat2 = r0.A04;
        decimalFormat2.setMinimumFractionDigits(i2);
        decimalFormat2.setMaximumFractionDigits(i2);
    }
}
