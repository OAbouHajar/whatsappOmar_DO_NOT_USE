package X;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1Zh  reason: invalid class name and case insensitive filesystem */
public class C28941Zh {
    public static final List A02 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBAN", "FBAV", "FBLC", "FBSV"}));
    public static final List A03 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBBR", "FBBD", "FBBV", "FBCA", "FBPN", "FBDM"}));
    public String A00;
    public final Map A01;

    public C28941Zh() {
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        hashMap.put("FBBR", Build.BOARD);
        hashMap.put("FBBD", Build.BRAND);
        hashMap.put("FBDM", Resources.getSystem().getDisplayMetrics().toString());
        hashMap.put("FBSV", Build.VERSION.RELEASE);
        hashMap.put("FBCA", String.format((Locale) null, "%s:%s", new Object[]{Build.CPU_ABI, Build.CPU_ABI2}));
    }

    public String A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str == null) {
            return "null";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt < ' ' || charAt > '~') {
                sb.append("&#");
                sb.append(Integer.toString(charAt));
                str2 = ";";
            } else {
                sb.append(charAt);
            }
            sb.append(str2);
        }
        return sb.toString().replace("/", "-").replace(";", "-");
    }
}
