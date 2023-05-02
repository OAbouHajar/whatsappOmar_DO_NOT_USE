package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2Hf  reason: invalid class name and case insensitive filesystem */
public final class C47032Hf {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public C47032Hf(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public static C47032Hf A00(String str) {
        String str2 = "000";
        String str3 = str2;
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                try {
                    str2 = String.format(Locale.US, "%03d", new Object[]{Integer.valueOf(matcher.group(2))});
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("mccmnc/parse mnc not parseable as integer: ");
                    sb.append(matcher.group(2));
                    Log.e(sb.toString(), e2);
                }
            }
        }
        return new C47032Hf(str3, str2);
    }

    public static String A01(String str, String str2) {
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                StringBuilder sb = new StringBuilder();
                sb.append(group);
                sb.append("-");
                sb.append(group2);
                return sb.toString();
            }
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C47032Hf.class != obj.getClass()) {
            return false;
        }
        C47032Hf r5 = (C47032Hf) obj;
        return TextUtils.equals(this.A00, r5.A00) && TextUtils.equals(this.A01, r5.A01);
    }

    public int hashCode() {
        String str = this.A00;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (hashCode * 31) + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MccMnc<");
        sb.append(this.A00);
        sb.append(",");
        sb.append(this.A01);
        sb.append(">");
        return sb.toString();
    }
}
