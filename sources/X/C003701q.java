package X;

import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.lang.Thread;

/* renamed from: X.01q  reason: invalid class name and case insensitive filesystem */
public class C003701q {
    public static volatile C20020zN A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r2, java.lang.Throwable r3) {
        /*
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = "crash_sentinel"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x001f }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x001f }
            r0.createNewFile()     // Catch:{ Exception -> 0x001f }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x001f }
            A02(r1, r3)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x0025
        L_0x001a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001e }
        L_0x001e:
            throw r0     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            r1 = move-exception
            java.lang.String r0 = "Unable to create crash sentinel file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x002f }
        L_0x0025:
            X.0zN r0 = A00
            if (r0 == 0) goto L_0x002e
            X.0zN r0 = A00
            r0.A03()
        L_0x002e:
            return
        L_0x002f:
            r1 = move-exception
            X.0zN r0 = A00
            if (r0 == 0) goto L_0x0039
            X.0zN r0 = A00
            r0.A03()
        L_0x0039:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003701q.A00(android.content.Context, java.lang.Throwable):void");
    }

    public static void A01(C20020zN r0) {
        A00 = r0;
    }

    public static void A02(FileOutputStream fileOutputStream, Throwable th) {
        fileOutputStream.write(C29621av.A00(th).A01().getBytes());
    }

    public static void A03(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        try {
            Log.e("UNCAUGHT EXCEPTION", th);
            C20020zN r2 = A00;
            if (r2 != null) {
                Throwable th2 = th;
                while (true) {
                    if (!(th2 instanceof OutOfMemoryError)) {
                        th2 = th2.getCause();
                        if (th2 == null) {
                            break;
                        }
                    } else {
                        r2.A02();
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            Log.flush();
            uncaughtExceptionHandler.uncaughtException(thread, th);
            throw th3;
        }
        Log.flush();
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
