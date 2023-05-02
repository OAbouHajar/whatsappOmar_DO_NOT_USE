package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: X.1av  reason: invalid class name and case insensitive filesystem */
public class C29621av {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C29621av(String str, String str2, String str3, String str4, long j2, boolean z2) {
        this.A05 = z2;
        this.A01 = str;
        this.A04 = str2;
        this.A00 = j2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public static C29621av A00(Throwable th) {
        boolean z2;
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof OutOfMemoryError)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        Throwable th3 = th;
        while (th3.getCause() != null) {
            th3 = th3.getCause();
        }
        String obj = th3.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new C29621av(obj, "2.23.1.76", stringWriter.toString(), C17080uV.A08, 438774090, z2);
    }

    public String A01() {
        return new JSONObject().put("isOom", this.A05).put("deepestThrowable", this.A01).put("versionName", "2.23.1.76").put("mobileBuildId", 438774090).put("stacktrace", this.A03).put("sessionId", this.A02).toString();
    }
}
