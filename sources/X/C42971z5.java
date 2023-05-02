package X;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1z5  reason: invalid class name and case insensitive filesystem */
public final class C42971z5 {
    public static int A00(AnonymousClass01V r6) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int A01 = C31111dU.A01();
        if (A01 >= 1) {
            int i4 = 2008;
            if (A01 != 1) {
                i4 = 2012;
                if (A01 <= 3) {
                    i4 = 2011;
                }
            }
            arrayList.add(Integer.valueOf(i4));
        }
        long A00 = (long) C31111dU.A00();
        if (A00 != -1) {
            if (A00 <= 528000) {
                i3 = 2008;
            } else if (A00 <= 620000) {
                i3 = 2009;
            } else if (A00 <= 1020000) {
                i3 = 2010;
            } else if (A00 <= 1220000) {
                i3 = 2011;
            } else if (A00 <= 1520000) {
                i3 = 2012;
            } else {
                i3 = 2014;
                if (A00 <= 2020000) {
                    i3 = 2013;
                }
            }
            arrayList.add(Integer.valueOf(i3));
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager A03 = r6.A03();
        if (A03 == null) {
            Log.w("deviceinfo/get-total-memory am=null");
        } else {
            A03.getMemoryInfo(memoryInfo);
            long j2 = memoryInfo.totalMem;
            if (j2 > 0) {
                if (j2 <= 201326592) {
                    i2 = 2008;
                } else if (j2 <= 304087040) {
                    i2 = 2009;
                } else if (j2 <= 536870912) {
                    i2 = 2010;
                } else if (j2 <= FileUtils.ONE_GB) {
                    i2 = 2011;
                } else if (j2 <= 1610612736) {
                    i2 = 2012;
                } else {
                    i2 = 2014;
                    if (j2 <= 2147483648L) {
                        i2 = 2013;
                    }
                }
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        int size = arrayList.size() & 1;
        int size2 = arrayList.size() >> 1;
        if (size == 1) {
            return ((Number) arrayList.get(size2)).intValue();
        }
        int i5 = size2 - 1;
        return ((Number) arrayList.get(i5)).intValue() + ((((Number) arrayList.get(i5 + 1)).intValue() - ((Number) arrayList.get(i5)).intValue()) >> 1);
    }

    public static int A01(AnonymousClass01V r4, C17020u3 r5) {
        SharedPreferences A00 = r5.A00(AnonymousClass01S.A07);
        int i2 = A00.getInt("year_class_cached_value_pref", -1);
        if (i2 != -1) {
            return i2;
        }
        int A002 = A00(r4);
        A00.edit().putInt("year_class_cached_value_pref", A002).apply();
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (X.C31111dU.A00() < 1800000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.AnonymousClass01V r7, X.C17020u3 r8) {
        /*
            java.lang.String r0 = X.AnonymousClass01S.A07
            android.content.SharedPreferences r6 = r8.A00(r0)
            java.lang.String r5 = "year_class_cached_value_2016_pref"
            r1 = -1
            int r0 = r6.getInt(r5, r1)
            if (r0 != r1) goto L_0x009a
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            android.app.ActivityManager r0 = r7.A03()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "deviceinfo/get-total-memory am=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0020:
            int r7 = A00(r7)
        L_0x0024:
            android.content.SharedPreferences$Editor r0 = r6.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r7)
            r0.apply()
            return r7
        L_0x0030:
            r0.getMemoryInfo(r1)
            long r3 = r1.totalMem
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            r1 = 805306368(0x30000000, double:3.97874211E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004e
            int r1 = X.C31111dU.A01()
            r0 = 1
            r7 = 2010(0x7da, float:2.817E-42)
            if (r1 > r0) goto L_0x0024
            r7 = 2009(0x7d9, float:2.815E-42)
            goto L_0x0024
        L_0x004e:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            r7 = 2012(0x7dc, float:2.82E-42)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0063
            int r1 = X.C31111dU.A00()
            r0 = 1300000(0x13d620, float:1.821688E-39)
            if (r1 >= r0) goto L_0x0024
            r7 = 2011(0x7db, float:2.818E-42)
            goto L_0x0024
        L_0x0063:
            r1 = 1610612736(0x60000000, double:7.957484216E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            int r1 = X.C31111dU.A00()
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 >= r0) goto L_0x0097
            goto L_0x0024
        L_0x0074:
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            r1 = 3221225472(0xc0000000, double:1.591496843E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0089
            r7 = 2014(0x7de, float:2.822E-42)
            goto L_0x0024
        L_0x0089:
            r1 = 5368709120(0x140000000, double:2.6524947387E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r7 = 2016(0x7e0, float:2.825E-42)
            if (r0 > 0) goto L_0x0024
            r7 = 2015(0x7df, float:2.824E-42)
            goto L_0x0024
        L_0x0097:
            r7 = 2013(0x7dd, float:2.821E-42)
            goto L_0x0024
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42971z5.A02(X.01V, X.0u3):int");
    }
}
