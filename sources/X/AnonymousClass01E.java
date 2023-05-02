package X;

import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* renamed from: X.01E  reason: invalid class name */
public class AnonymousClass01E {
    public static void A00() {
        try {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
                Thread thread = (Thread) next.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                sb.append("name=");
                sb.append(thread.getName());
                sb.append(" state=");
                sb.append(thread.getState());
                sb.append(" tid=");
                sb.append(thread.getId());
                sb.append(10);
                sb.append(Log.stackTraceStartPhrase());
                for (StackTraceElement obj : stackTraceElementArr) {
                    sb.append("    at ");
                    sb.append(obj.toString());
                    sb.append(10);
                }
                sb.append("### end stack trace");
                sb.append(10);
                Log.log(3, sb.toString());
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static boolean A01() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
