package X;

import android.os.Build;
import com.squareup.picasso.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ha  reason: invalid class name and case insensitive filesystem */
public class C24721Ha {
    public boolean A00;
    public final AnonymousClass01D A01;
    public final Map A02 = new HashMap();

    public C24721Ha(AnonymousClass01D r2) {
        this.A01 = r2;
    }

    public synchronized Object A00(String str) {
        Map map;
        if (!this.A00) {
            String A0N = ((C15860rz) this.A01.get()).A0N();
            Map map2 = this.A02;
            map2.put("device_id", A0N);
            map2.put("app_build", BuildConfig.BUILD_TYPE);
            map2.put("release_channel", BuildConfig.BUILD_TYPE);
            map2.put("app_version", "2.23.1.76");
            map2.put("os_version", Build.VERSION.RELEASE);
            map2.put("platform", "android");
            this.A00 = true;
        }
        map = this.A02;
        if (map.containsKey(str)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" has not been set on UserInfo");
            throw new IllegalArgumentException(sb.toString());
        }
        return map.get(str);
    }
}
