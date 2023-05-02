package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil$Api14Utils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1dx  reason: invalid class name and case insensitive filesystem */
public class C31321dx extends C31181de {
    public final File A00;
    public final Map A01 = new HashMap();
    public final Set A02;

    public C31321dx(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.A02 = A00("", str);
        this.A00 = new File(str);
    }

    public C31321dx(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.A02 = A00(lastIndexOf > 0 ? name.substring(0, lastIndexOf) : name, file.getAbsolutePath());
        this.A00 = file;
    }

    public static Set A00(String str, String str2) {
        HashSet hashSet = new HashSet();
        String A002 = SysUtil$Api14Utils.A00();
        if (A002 != null) {
            for (String str3 : A002.split(":")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".apk!/");
                if (str3.contains(sb.toString())) {
                    hashSet.add(str3);
                }
            }
        }
        if (hashSet.isEmpty()) {
            String[] A022 = C31331dy.A02();
            if (!TextUtils.isEmpty(str2) && A022.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("!/lib/");
                sb2.append(A022[0]);
                String obj = sb2.toString();
                if (obj != null) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(this.A02.toString());
        sb.append(']');
        return sb.toString();
    }
}
