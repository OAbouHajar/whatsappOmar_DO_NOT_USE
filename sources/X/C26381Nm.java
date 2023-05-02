package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Nm  reason: invalid class name and case insensitive filesystem */
public class C26381Nm implements C18540wr {
    public final C16180sb A00;

    public C26381Nm(C16180sb r1) {
        this.A00 = r1;
    }

    public static long[] A00(File file) {
        long j2;
        long j3;
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = jArr[0] + file2.length();
                    j2 = jArr[1];
                    j3 = 1;
                } else if (file2.isDirectory()) {
                    long[] A002 = A00(file2);
                    jArr[0] = jArr[0] + A002[0];
                    j2 = jArr[1];
                    j3 = A002[1];
                }
                jArr[1] = j2 + j3;
            }
        } else {
            StringBuilder sb = new StringBuilder("mediafoldersize listedFiles is null for folder ");
            sb.append(file);
            Log.w(sb.toString());
        }
        return jArr;
    }

    public void AUu(C75983t2 r7) {
        C16180sb r5 = this.A00;
        File file = r5.A05().A0A;
        C16180sb.A04(file, false);
        if (file.exists() && file.isDirectory()) {
            try {
                long[] A002 = A00(file);
                r7.A0t = Long.valueOf(A002[0]);
                r7.A0s = Long.valueOf(A002[1]);
                File file2 = r5.A05().A0N;
                if (!file2.exists() || !file2.isDirectory()) {
                    Log.e("fieldstathelpers/update-media-folder-fieldstats/error/video-folder-does-not-exist");
                    return;
                }
                long[] A003 = A00(file2);
                r7.A19 = Long.valueOf(A003[0]);
                r7.A18 = Long.valueOf(A003[1]);
            } catch (StackOverflowError e2) {
                Log.e("fieldstathelpers/update-media-folder-fieldstats/error/stackoverflow", e2);
            } catch (OutOfMemoryError e3) {
                Log.e("fieldstathelpers/update-media-folder-fieldstats/error/outofmemory", e3);
            }
        }
    }
}
