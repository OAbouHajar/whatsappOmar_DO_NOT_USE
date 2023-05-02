package X;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4cL  reason: invalid class name and case insensitive filesystem */
public final class C89504cL {
    public static String A00(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (!(th2 instanceof UnknownHostException)) {
                    th2 = th2.getCause();
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                } else {
                    str2 = "UnknownHostException (no network)";
                    break;
                }
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append("\n  ");
        A0q.append(str2.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  "));
        return AnonymousClass3K3.A0p(A0q, 10);
    }

    public static void A01(String str, String str2, Throwable th) {
        Log.e(str, A00(str2, th));
    }

    public static void A02(String str, String str2, Throwable th) {
        Log.w(str, A00(str2, th));
    }
}
