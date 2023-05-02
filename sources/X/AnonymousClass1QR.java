package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1QR  reason: invalid class name */
public class AnonymousClass1QR extends C26061Me {
    public final SparseArray A00 = new SparseArray();
    public final AnonymousClass1QQ A01;
    public final Set A02 = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1QR(X.C16300so r17, X.C17130ua r18, X.C18260wP r19, X.C16440t3 r20, X.C16980tz r21, X.C17120uZ r22, X.C15860rz r23, X.C26041Mc r24, X.C14710pd r25, X.C16490t9 r26, X.C19950zG r27, X.C213013o r28, X.C17670vS r29, X.AnonymousClass1QQ r30, X.C16320sq r31) {
        /*
            r16 = this;
            r13 = r28
            r12 = r27
            r11 = r26
            r15 = r31
            r3 = r18
            r2 = r17
            r14 = r29
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.A00 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.A02 = r0
            r0 = r30
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.<init>(X.0so, X.0ua, X.0wP, X.0t3, X.0tz, X.0uZ, X.0rz, X.1Mc, X.0pd, X.0t9, X.0zG, X.13o, X.0vS, X.1QQ, X.0sq):void");
    }

    public Map A04(String str, String str2, String str3, String str4, int i2) {
        Map A04 = super.A04(str, str2, str3, (String) null, i2);
        A04.put("id", Integer.toString(i2));
        return A04;
    }

    public final File A0D(String str, int i2, boolean z2) {
        File filesDir = this.A08.A00.getFilesDir();
        StringBuilder sb = new StringBuilder("downloadable/doodle_emoji_");
        sb.append(i2);
        sb.append("_");
        sb.append(str);
        sb.append(z2 ? "_temp" : "");
        return new File(filesDir, sb.toString());
    }

    public synchronized void A0E(int i2) {
        AnonymousClass20T A022;
        if (!this.A02.contains(Integer.valueOf(i2)) && (A022 = A02()) != null) {
            A0F(i2, A022.A04(i2));
        }
    }

    public final synchronized void A0F(int i2, String str) {
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                File A0D = A0D(str, i2, false);
                if (!A0D.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DoodleEmojiManager/loadFilePaths subdirectory for bundle=");
                    sb.append(i2);
                    sb.append(" hash=");
                    sb.append(str);
                    sb.append(" doesn't exist");
                    Log.e(sb.toString());
                } else {
                    String[] list = A0D.list();
                    if (list == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DoodleEmojiManager/loadFilePaths no files found in ");
                        sb2.append(A0D.toString());
                        Log.e(sb2.toString());
                    } else {
                        String absolutePath = A0D.getAbsolutePath();
                        for (String str2 : list) {
                            int parseInt = Integer.parseInt(str2.split("\\.")[0].split("e")[1]);
                            SparseArray sparseArray = this.A00;
                            if (!AnonymousClass1XI.A08(str2).equals("obi")) {
                                if (sparseArray.indexOfKey(parseInt) >= 0) {
                                    continue;
                                }
                            } else if (!this.A01.A01(parseInt, 0)) {
                                continue;
                            }
                            sparseArray.put(parseInt, new File(absolutePath, str2));
                        }
                        this.A02.add(Integer.valueOf(i2));
                    }
                }
            }
        }
    }
}
