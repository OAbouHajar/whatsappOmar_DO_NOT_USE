package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import com.obwhatsapp.R;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2RK  reason: invalid class name */
public final class AnonymousClass2RK {
    public static int A00(C28331Vq r1) {
        if (r1 == null) {
            return 1;
        }
        if (r1.A01()) {
            return 3;
        }
        return !r1.A02() ? 1 : 2;
    }

    public static SpannableString A01(Context context, C93694jc r3, C39651sq r4, AnonymousClass013 r5, BigDecimal bigDecimal, Date date) {
        if (bigDecimal == null || r4 == null) {
            return new SpannableString(context.getString(R.string.str0109));
        }
        String A03 = r4.A03(r5, bigDecimal, true);
        return (r3 == null || !r3.A00(date)) ? new SpannableString(A03) : A02(A03, r4.A03(r5, r3.A01, true));
    }

    public static SpannableString A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("  ");
        sb.append(str);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StrikethroughSpan(), str2.length() + 1, spannableString.length(), 33);
        return spannableString;
    }

    public static boolean A03(Locale locale) {
        String upperCase = locale.getCountry().toUpperCase();
        return upperCase.equalsIgnoreCase(Locale.UK.getCountry()) || upperCase.equalsIgnoreCase(Locale.US.getCountry());
    }
}
