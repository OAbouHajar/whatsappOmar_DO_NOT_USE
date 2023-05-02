package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.10q  reason: invalid class name and case insensitive filesystem */
public class C205610q {
    public final C16300so A00;
    public final C16980tz A01;
    public final C16490t9 A02;

    public C205610q(C16300so r1, C16980tz r2, C16490t9 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static void A00(Context context, String str, String str2, Map map, Map map2) {
        if (str != null && map.containsKey(str)) {
            A01(context, (File) map.get(str), "tombstone", str2, map2);
        }
    }

    public static boolean A01(Context context, File file, String str, String str2, Map map) {
        try {
            File A04 = AnonymousClass1XI.A04(file, new File(context.getCacheDir(), "crash_upload"), file.getName());
            StringBuilder sb = new StringBuilder();
            if (A04 == null) {
                sb.append(str2);
                sb.append("/compress/empty; exit");
                Log.w(sb.toString());
                return false;
            }
            sb.append(str2);
            sb.append("/upload/attachment file: ");
            sb.append(A04.getAbsolutePath());
            Log.i(sb.toString());
            map.put(str, A04.getPath());
            return true;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("/compress/fail; exit");
            Log.w(sb2.toString(), e2);
            return false;
        }
    }

    public void A02(HashSet hashSet, Map map, boolean z2) {
        this.A00.A04(hashSet, map, z2, false, false, false);
        for (String file : map.values()) {
            File file2 = new File(file);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }
}
