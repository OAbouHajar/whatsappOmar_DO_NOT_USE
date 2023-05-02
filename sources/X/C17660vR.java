package X;

import android.os.Build;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.0vR  reason: invalid class name and case insensitive filesystem */
public class C17660vR {
    public static final String A06 = "2.23.1.76".replace(' ', '_');
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final C16980tz A04;
    public final AnonymousClass013 A05;

    public C17660vR(C16980tz r1, AnonymousClass013 r2) {
        this.A04 = r1;
        this.A05 = r2;
    }

    public synchronized String A00() {
        String str;
        str = this.A00;
        if (str == null) {
            str = A01(this.A04, "2.23.1.76");
            this.A00 = str;
        }
        return str;
    }

    public final String A01(C16980tz r12, String str) {
        String str2;
        String str3;
        String str4 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(' ', '_'));
        String obj = sb.toString();
        String replace = "Android".replace(' ', '_');
        synchronized (this) {
        }
        String replace2 = r12.A00.getString(R.string.str1bd4).replace(' ', '_');
        try {
            str2 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/release", e2);
            str2 = str4;
        }
        try {
            str3 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/manufacturer", e3);
            str3 = str4;
        }
        try {
            str4 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e4) {
            Log.e("app/user-agent/model", e4);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace2);
        sb2.append("/");
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(replace);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" Device/");
        sb2.append(str3);
        sb2.append("-");
        sb2.append(str4);
        sb2.append("");
        return sb2.toString();
    }

    public final String A02(Map map) {
        C28941Zh r5 = new C28941Zh();
        r5.A00 = A00();
        Map map2 = r5.A01;
        map2.put("FBAN", "OBWhatsAppAndroid");
        map2.put("FBAV", A06);
        map2.put("FBBV", "230176001");
        Object A07 = this.A05.A07();
        if (map != null && map.containsKey(A07) && (A07 = map.get(A07)) == null) {
            A07 = "en_US";
        }
        map2.put("FBLC", A07);
        map2.put("FBPN", this.A04.A00.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append(r5.A00);
        sb.append(" [");
        for (Object next : C28941Zh.A02) {
            sb.append(String.format((Locale) null, "%s/%s;", new Object[]{next, r5.A00((String) map2.get(next))}));
        }
        for (Object next2 : C28941Zh.A03) {
            sb.append(String.format((Locale) null, "%s/%s;", new Object[]{next2, r5.A00((String) map2.get(next2))}));
        }
        sb.append("]");
        return sb.toString();
    }
}
