package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1Bv  reason: invalid class name and case insensitive filesystem */
public class C23401Bv extends C16300so implements C19400yN {
    public C18000vz A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C23391Bu A02;
    public final C16040sK A03;
    public final C17130ua A04;
    public final C18260wP A05;
    public final AnonymousClass01V A06;
    public final C16980tz A07;
    public final C15860rz A08;
    public final C16490t9 A09;
    public final AnonymousClass12X A0A;
    public final C17670vS A0B;
    public final C18160wF A0C;
    public final C17660vR A0D;
    public final C16320sq A0E;

    public C23401Bv(C23391Bu r3, C16040sK r4, C17130ua r5, C18260wP r6, AnonymousClass01V r7, C16980tz r8, C15860rz r9, C16490t9 r10, AnonymousClass12X r11, C17670vS r12, C18160wF r13, C17660vR r14, C16320sq r15) {
        this.A07 = r8;
        this.A03 = r4;
        this.A0D = r14;
        this.A0E = r15;
        this.A04 = r5;
        this.A09 = r10;
        this.A0C = r13;
        this.A06 = r7;
        this.A0B = r12;
        this.A08 = r9;
        this.A05 = r6;
        this.A02 = r3;
        this.A0A = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0047, code lost:
        com.whatsapp.util.Log.w("app/CrashLogs/copyFileToCache: Could not close stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x004f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0051, code lost:
        com.whatsapp.util.Log.w("app/CrashLogs/copyFileToCache: Could not close stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0056, code lost:
        if (r5 == null) goto L_0x0060;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0042 A[SYNTHETIC, Splitter:B:33:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC, Splitter:B:38:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r3 = "app/CrashLogs/copyFileToCache: Could not close stream"
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002e }
        L_0x0011:
            int r1 = r5.read(r2)     // Catch:{ IOException -> 0x002e }
            if (r1 <= 0) goto L_0x001c
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ IOException -> 0x002e }
            goto L_0x0011
        L_0x001c:
            r5.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0024:
            r4.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            return r8
        L_0x002d:
            return r8
        L_0x002e:
            r1 = move-exception
            goto L_0x003b
        L_0x0030:
            r1 = move-exception
            r4 = r6
            goto L_0x0058
        L_0x0033:
            r1 = move-exception
            r4 = r6
            goto L_0x003b
        L_0x0036:
            r1 = move-exception
            throw r1
        L_0x0038:
            r1 = move-exception
            r4 = r6
            r5 = r6
        L_0x003b:
            java.lang.String r0 = "app/CrashLogs/copyFileToCache: Could not copy file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x004a:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ IOException -> 0x0050 }
            return r6
        L_0x0050:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0054:
            return r6
        L_0x0055:
            r1 = move-exception
            if (r5 == 0) goto L_0x0060
        L_0x0058:
            r5.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0060:
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch:{ IOException -> 0x0066 }
            throw r1
        L_0x0066:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x006a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Bv.A00(java.io.File, java.io.File):java.io.File");
    }

    public static String A01(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final File A05() {
        File file = new File(this.A07.A00.getCacheDir(), "Crashes");
        file.mkdirs();
        return file;
    }

    public final File A06(File file, long j2) {
        File A052 = A05();
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append(".log");
        return A00(file, new File(A052, sb.toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[Catch:{ IOException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083 A[Catch:{ IOException -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A07(java.util.Map r8) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0007
            return r8
        L_0x0007:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.File r1 = r7.A05()     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            r3 = 24
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = 0
        L_0x0024:
            int r2 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0047
            boolean r0 = r6.mkdirs()     // Catch:{ IOException -> 0x008b }
            if (r0 != 0) goto L_0x0047
            java.io.File r1 = r7.A05()     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = r2
            goto L_0x0024
        L_0x0047:
            if (r2 > r1) goto L_0x0083
            java.util.Set r0 = r8.entrySet()     // Catch:{ IOException -> 0x008b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x008b }
        L_0x0051:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r4.next()     // Catch:{ IOException -> 0x008b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x008b }
            java.lang.Object r3 = r0.getKey()     // Catch:{ IOException -> 0x008b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x008b }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x008b }
            java.lang.String r1 = r2.getName()     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = A00(r2, r0)     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x008b }
            r5.put(r3, r0)     // Catch:{ IOException -> 0x008b }
            goto L_0x0051
        L_0x0083:
            java.lang.String r1 = "max retries reached while creating attachment temp directory"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x008b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x008b }
            throw r0     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Bv.A07(java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0219, code lost:
        if (r8.A06.nextInt(r7.A00) == 0) goto L_0x021b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C29491ai r20, java.lang.String r21, java.lang.String r22, java.util.Map r23, boolean r24) {
        /*
            r19 = this;
            X.1ah r6 = new X.1ah
            r6.<init>()
            r3 = r21
            r6.A02 = r3
            r17 = r22
            r0 = r17
            r6.A01 = r0
            r18 = r20
            if (r24 == 0) goto L_0x003e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StackTraceElement[] r5 = r18.getStackTrace()
            int r4 = r5.length
            r2 = 0
            r1 = 0
        L_0x001f:
            if (r2 >= r4) goto L_0x0038
            r0 = r5[r2]
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            java.lang.String r0 = "\n"
            r7.append(r0)
            int r1 = r1 + 1
            r0 = 15
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0038:
            java.lang.String r0 = r7.toString()
            r6.A00 = r0
        L_0x003e:
            r4 = r19
            X.0t9 r1 = r4.A09
            X.00F r0 = X.C16470t7.DEFAULT_SAMPLING_RATE
            r1.A0A(r6, r0)
            X.1Bu r8 = r4.A02
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            boolean r0 = r0.equals(r3)
            r11 = 1
            if (r0 != 0) goto L_0x021b
            monitor-enter(r8)
            android.content.SharedPreferences r5 = r8.A00     // Catch:{ all -> 0x029f }
            if (r5 != 0) goto L_0x0061
            X.0u3 r1 = r8.A05     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "critical_event_client_prefs"
            android.content.SharedPreferences r5 = r1.A00(r0)     // Catch:{ all -> 0x029f }
            r8.A00 = r5     // Catch:{ all -> 0x029f }
        L_0x0061:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x01e9
            r2 = 230176001(0xdb83501, float:1.1352636E-30)
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "build_version"
            r0 = -1
            int r0 = r5.getInt(r1, r0)     // Catch:{ all -> 0x029f }
            java.lang.String r5 = "critical_event_client_config"
            if (r2 == r0) goto L_0x0099
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch:{ all -> 0x029f }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "CriticalEventConfigManager/updateConfigFromAbProp/clearing client config due to app upgrade "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            r0.append(r2)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x029f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
        L_0x0099:
            X.0pd r2 = r8.A04     // Catch:{ all -> 0x029f }
            r1 = 414(0x19e, float:5.8E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x029f }
            java.lang.String r2 = r2.A06(r0, r1)     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences r1 = r8.A00     // Catch:{ all -> 0x029f }
            java.lang.String r0 = ""
            java.lang.String r15 = r1.getString(r5, r0)     // Catch:{ all -> 0x029f }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r6.<init>()     // Catch:{ all -> 0x029f }
            java.lang.String r14 = ";"
            java.lang.String[] r13 = r2.split(r14)     // Catch:{ all -> 0x029f }
            int r12 = r13.length     // Catch:{ all -> 0x029f }
            if (r12 <= 0) goto L_0x00f9
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029f }
            r9 = 3888000000(0xe7be2c00, double:1.920927231E-314)
            long r0 = r0 + r9
            r10 = 0
        L_0x00c4:
            r7 = r13[r10]     // Catch:{ all -> 0x029f }
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ all -> 0x029f }
            int r9 = r7.length     // Catch:{ all -> 0x029f }
            r2 = 2
            if (r9 != r2) goto L_0x00f4
            r9 = 0
            r2 = r7[r9]     // Catch:{ all -> 0x029f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x029f }
            if (r2 != 0) goto L_0x00f4
            r2 = r7[r11]     // Catch:{ all -> 0x029f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x029f }
            if (r2 != 0) goto L_0x00f4
            r9 = r7[r9]     // Catch:{ all -> 0x029f }
            r7 = r7[r11]     // Catch:{ all -> 0x029f }
            r2 = -1
            int r7 = X.C29501aj.A00(r7, r2)     // Catch:{ all -> 0x029f }
            if (r7 < r11) goto L_0x00f4
            X.1ak r2 = new X.1ak     // Catch:{ all -> 0x029f }
            r2.<init>(r7, r9, r0)     // Catch:{ all -> 0x029f }
            r6.add(r2)     // Catch:{ all -> 0x029f }
        L_0x00f4:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00f9
            goto L_0x00c4
        L_0x00f9:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r2.<init>()     // Catch:{ all -> 0x029f }
            java.lang.String[] r13 = r15.split(r14)     // Catch:{ all -> 0x029f }
            int r12 = r13.length     // Catch:{ all -> 0x029f }
            if (r12 <= 0) goto L_0x0152
            r10 = 0
        L_0x0106:
            r1 = r13[r10]     // Catch:{ all -> 0x029f }
            java.lang.String r0 = ":"
            java.lang.String[] r14 = r1.split(r0)     // Catch:{ all -> 0x029f }
            int r1 = r14.length     // Catch:{ all -> 0x029f }
            r0 = 3
            if (r1 != r0) goto L_0x014d
            r1 = 0
            r0 = r14[r1]     // Catch:{ all -> 0x029f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x014d
            r0 = r14[r11]     // Catch:{ all -> 0x029f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x014d
            r15 = 2
            r0 = r14[r15]     // Catch:{ all -> 0x029f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x014d
            r9 = r14[r1]     // Catch:{ all -> 0x029f }
            r1 = r14[r11]     // Catch:{ all -> 0x029f }
            r0 = -1
            int r7 = X.C29501aj.A00(r1, r0)     // Catch:{ all -> 0x029f }
            if (r7 < r11) goto L_0x014d
            r14 = r14[r15]     // Catch:{ all -> 0x029f }
            r0 = -1
            long r0 = X.C29501aj.A01(r14, r0)     // Catch:{ all -> 0x029f }
            r15 = 1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x014d
            X.1ak r14 = new X.1ak     // Catch:{ all -> 0x029f }
            r14.<init>(r7, r9, r0)     // Catch:{ all -> 0x029f }
            r2.add(r14)     // Catch:{ all -> 0x029f }
        L_0x014d:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x0152
            goto L_0x0106
        L_0x0152:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r10.<init>()     // Catch:{ all -> 0x029f }
            r8.A02 = r10     // Catch:{ all -> 0x029f }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r12.<init>()     // Catch:{ all -> 0x029f }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x029f }
        L_0x0162:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x029f }
            X.1ak r0 = (X.C29511ak) r0     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x029f }
            r12.add(r0)     // Catch:{ all -> 0x029f }
            goto L_0x0162
        L_0x0174:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r9.<init>()     // Catch:{ all -> 0x029f }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r7.<init>()     // Catch:{ all -> 0x029f }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x029f }
        L_0x0182:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x019d
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x029f }
            X.1ak r2 = (X.C29511ak) r2     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x029f }
            boolean r0 = r12.contains(r1)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0182
            r7.add(r2)     // Catch:{ all -> 0x029f }
            r9.add(r1)     // Catch:{ all -> 0x029f }
            goto L_0x0182
        L_0x019d:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x029f }
        L_0x01a1:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x029f }
            X.1ak r2 = (X.C29511ak) r2     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x029f }
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x01a1
            r7.add(r2)     // Catch:{ all -> 0x029f }
            r9.add(r1)     // Catch:{ all -> 0x029f }
            goto L_0x01a1
        L_0x01bc:
            r10.addAll(r7)     // Catch:{ all -> 0x029f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r2.<init>()     // Catch:{ all -> 0x029f }
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x029f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x029f }
        L_0x01ca:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x029f }
            r2.append(r0)     // Catch:{ all -> 0x029f }
            goto L_0x01ca
        L_0x01d8:
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x029f }
            android.content.SharedPreferences$Editor r0 = r1.putString(r5, r0)     // Catch:{ all -> 0x029f }
            r0.apply()     // Catch:{ all -> 0x029f }
        L_0x01e9:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x029f }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x029f }
            monitor-exit(r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x01f3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r7 = r9.next()
            X.1ak r7 = (X.C29511ak) r7
            java.lang.String r0 = r7.A02
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x01f3
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r7.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f3
            java.util.Random r1 = r8.A06
            int r0 = r7.A00
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x02a2
        L_0x021b:
            java.lang.String r1 = "UNCAUGHT EXCEPTION"
            r0 = r18
            com.whatsapp.util.Log.e(r1, r0)
            X.AnonymousClass01E.A00()
            java.lang.String r6 = r18.getMessage()
            monitor-enter(r8)
            java.util.Set r7 = r8.A01     // Catch:{ all -> 0x029f }
            if (r7 != 0) goto L_0x0257
            X.0pd r2 = r8.A04     // Catch:{ all -> 0x029f }
            r1 = 426(0x1aa, float:5.97E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r2.A06(r0, r1)     // Catch:{ all -> 0x029f }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x029f }
            r7.<init>()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = ";"
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x029f }
            int r3 = r5.length     // Catch:{ all -> 0x029f }
            r2 = 0
        L_0x0245:
            if (r2 >= r3) goto L_0x0255
            r1 = r5[r2]     // Catch:{ all -> 0x029f }
            int r0 = r1.length()     // Catch:{ all -> 0x029f }
            if (r0 <= 0) goto L_0x0252
            r7.add(r1)     // Catch:{ all -> 0x029f }
        L_0x0252:
            int r2 = r2 + 1
            goto L_0x0245
        L_0x0255:
            r8.A01 = r7     // Catch:{ all -> 0x029f }
        L_0x0257:
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x029f }
            monitor-exit(r8)
            java.util.Iterator r1 = r7.iterator()
        L_0x025f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0272
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x025f
            return
        L_0x0272:
            X.0sq r2 = r4.A0E     // Catch:{ Exception -> 0x0281 }
            r1 = 48
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ Exception -> 0x0281 }
            r3 = r23
            r0.<init>(r4, r1, r3)     // Catch:{ Exception -> 0x0281 }
            r2.Acl(r0)     // Catch:{ Exception -> 0x0281 }
            return
        L_0x0281:
            r3 = move-exception
            java.lang.String r0 = "crashlogs/upload/failed"
            com.whatsapp.util.Log.e(r0, r3)
            r2 = 1
            java.lang.String r0 = "wa-worker-error-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.A0A(r0, r2)
            return
        L_0x029f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x02a2:
            java.lang.String r0 = "CRITICAL EVENT = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ":"
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Bv.A08(X.1ai, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        if (r7 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b5 A[SYNTHETIC, Splitter:B:20:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C29521al r9) {
        /*
            r8 = this;
            java.io.File r2 = r8.A05()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r3 = r9.A00
            r1.append(r3)
            java.lang.String r0 = ".crash"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r7 = 0
            r0 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009e }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x009e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            r7.<init>()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.util.Map r0 = r9.A04     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
        L_0x0034:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            goto L_0x0034
        L_0x004e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            r2.<init>()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r1 = r9.A02     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "logFilePath"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r1 = r9.A01     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "fromParam"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            boolean r1 = r9.A06     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "forcedUpload"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            boolean r1 = r9.A05     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "detailedException"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r1 = r9.A03     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "tagsString"
            org.json.JSONObject r1 = r2.put(r0, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r1 = r1.put(r0, r7)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = "timeMillis"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            r6.write(r0)     // Catch:{ Exception -> 0x009b, all -> 0x0098 }
            r6.close()     // Catch:{ IOException -> 0x00b9 }
            return
        L_0x0098:
            r1 = move-exception
            r7 = r6
            goto L_0x00c1
        L_0x009b:
            r2 = move-exception
            r7 = r6
            goto L_0x009f
        L_0x009e:
            r2 = move-exception
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r1.append(r0)     // Catch:{ all -> 0x00be }
            r1.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00be }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00be }
            if (r7 == 0) goto L_0x00bd
            r7.close()     // Catch:{ IOException -> 0x00b9 }
            return
        L_0x00b9:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00bd:
            return
        L_0x00be:
            r1 = move-exception
            if (r7 == 0) goto L_0x00c9
        L_0x00c1:
            r7.close()     // Catch:{ IOException -> 0x00c5 }
            throw r1
        L_0x00c5:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00c9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Bv.A09(X.1al):void");
    }

    public final void A0A(String str, boolean z2) {
        if (z2) {
            C29481ah r2 = new C29481ah();
            r2.A02 = "crash-log-upload-failure";
            r2.A01 = str;
            this.A09.A0A(r2, C16470t7.DEFAULT_SAMPLING_RATE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if ("log_files_upload".equals(r7) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.Map r31, boolean r32, boolean r33) {
        /*
            r27 = this;
            java.lang.String r6 = "report_source"
            r3 = 0
            r1 = r27
            r4 = r32
            java.lang.String r0 = "mp4_failure"
            r7 = r30
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0254 }
            r16 = 1
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "log_files_upload"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x0254 }
            r2 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.lang.String r0 = "crashlog"
            r12 = r29
            java.lang.String r5 = r1.A02(r12, r0, r2)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = "no_upload"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0254 }
            if (r0 == 0) goto L_0x0030
            if (r32 != 0) goto L_0x0030
            return r3
        L_0x0030:
            X.1am r8 = new X.1am     // Catch:{ IOException -> 0x0254 }
            r8.<init>(r1, r4)     // Catch:{ IOException -> 0x0254 }
            X.0vS r11 = r1.A0B     // Catch:{ IOException -> 0x0254 }
            java.lang.String r21 = "https://crashlogs.whatsapp.net/wa_clb_data"
            X.0vR r10 = r1.A0D     // Catch:{ IOException -> 0x0254 }
            java.lang.String r22 = r10.A00()     // Catch:{ IOException -> 0x0254 }
            X.0ua r9 = r1.A04     // Catch:{ IOException -> 0x0254 }
            r2 = 0
            r23 = 6
            X.1ao r0 = new X.1ao     // Catch:{ IOException -> 0x0254 }
            r24 = 0
            r25 = 0
            r26 = 0
            r17 = r0
            r18 = r9
            r19 = r8
            r20 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r9 = "access_token"
            java.lang.String r8 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r0.A06(r9, r8)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r8 = "exception_and_logs"
            boolean r8 = r8.equals(r5)     // Catch:{ IOException -> 0x0254 }
            if (r8 == 0) goto L_0x0083
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0254 }
            r8 = r28
            r9.<init>(r8)     // Catch:{ IOException -> 0x0254 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0254 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r19 = "file"
            java.lang.String r20 = r9.getName()     // Catch:{ IOException -> 0x0254 }
            r21 = 0
            long r23 = r9.length()     // Catch:{ IOException -> 0x0254 }
            r18 = r8
            r17.A05(r18, r19, r20, r21, r23)     // Catch:{ IOException -> 0x0254 }
        L_0x0083:
            java.util.Set r8 = r31.entrySet()     // Catch:{ IOException -> 0x0254 }
            java.util.Iterator r13 = r8.iterator()     // Catch:{ IOException -> 0x0254 }
        L_0x008b:
            boolean r8 = r13.hasNext()     // Catch:{ IOException -> 0x0254 }
            if (r8 == 0) goto L_0x00bf
            java.lang.Object r8 = r13.next()     // Catch:{ IOException -> 0x0254 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x0254 }
            java.lang.Object r9 = r8.getKey()     // Catch:{ IOException -> 0x0254 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0254 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x0254 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0254 }
            java.io.File r11 = new java.io.File     // Catch:{ IOException -> 0x0254 }
            r11.<init>(r8)     // Catch:{ IOException -> 0x0254 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0254 }
            r8.<init>(r11)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r20 = r11.getName()     // Catch:{ IOException -> 0x0254 }
            r21 = 0
            long r23 = r11.length()     // Catch:{ IOException -> 0x0254 }
            r18 = r8
            r19 = r9
            r17.A05(r18, r19, r20, r21, r23)     // Catch:{ IOException -> 0x0254 }
            goto L_0x008b
        L_0x00bf:
            java.lang.String r8 = "from_jid"
            r0.A07(r8, r12)     // Catch:{ IOException -> 0x0254 }
            boolean r8 = r7.isEmpty()     // Catch:{ IOException -> 0x0254 }
            if (r8 != 0) goto L_0x00d0
            java.lang.String r8 = "tags"
            r0.A07(r8, r7)     // Catch:{ IOException -> 0x0254 }
        L_0x00d0:
            java.lang.String r9 = "true"
            if (r32 == 0) goto L_0x00da
            java.lang.String r7 = "forced"
            r0.A07(r7, r9)     // Catch:{ IOException -> 0x0254 }
        L_0x00da:
            if (r33 == 0) goto L_0x00e1
            java.lang.String r7 = "detailed"
            r0.A07(r7, r9)     // Catch:{ IOException -> 0x0254 }
        L_0x00e1:
            X.0rz r7 = r1.A08     // Catch:{ IOException -> 0x0254 }
            r17 = r7
            X.01D r12 = r7.A01     // Catch:{ IOException -> 0x0254 }
            java.lang.Object r7 = r12.get()     // Catch:{ IOException -> 0x0254 }
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ IOException -> 0x0254 }
            java.lang.String r8 = "voip_call_id"
            java.lang.String r11 = r7.getString(r8, r2)     // Catch:{ IOException -> 0x0254 }
            if (r11 == 0) goto L_0x00fb
            java.lang.String r7 = "call_id"
            r0.A07(r7, r11)     // Catch:{ IOException -> 0x0254 }
        L_0x00fb:
            java.lang.Object r11 = r12.get()     // Catch:{ IOException -> 0x0254 }
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11     // Catch:{ IOException -> 0x0254 }
            java.lang.String r7 = "voip_call_ab_test_bucket"
            java.lang.String r12 = r11.getString(r7, r2)     // Catch:{ IOException -> 0x0254 }
            if (r12 == 0) goto L_0x010f
            java.lang.String r11 = "abtest_bucket"
            r0.A07(r11, r12)     // Catch:{ IOException -> 0x0254 }
        L_0x010f:
            boolean r11 = r17.A1d()     // Catch:{ IOException -> 0x0254 }
            if (r11 == 0) goto L_0x011a
            java.lang.String r11 = "md_opt_in"
            r0.A07(r11, r9)     // Catch:{ IOException -> 0x0254 }
        L_0x011a:
            java.lang.String r11 = "exception_only"
            boolean r5 = r11.equals(r5)     // Catch:{ IOException -> 0x0254 }
            if (r5 == 0) goto L_0x0127
            java.lang.String r5 = "exception_only_upload"
            r0.A07(r5, r9)     // Catch:{ IOException -> 0x0254 }
        L_0x0127:
            java.lang.String r13 = "build_id"
            r11 = 438774090(0x1a27294a, double:2.16783204E-315)
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0254 }
            r0.A07(r13, r5)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r5 = "fb.running_sapienz"
            java.lang.String r5 = X.C004101u.A01(r5)     // Catch:{ IOException -> 0x0254 }
            boolean r5 = r5.equals(r9)     // Catch:{ IOException -> 0x0254 }
            if (r5 == 0) goto L_0x018f
            java.lang.String r5 = "fb.report_source"
            java.lang.String r5 = X.C004101u.A01(r5)     // Catch:{ IOException -> 0x0254 }
            r0.A07(r6, r5)     // Catch:{ IOException -> 0x0254 }
            X.0tz r5 = r1.A07     // Catch:{ IOException -> 0x0254 }
            android.content.Context r9 = r5.A00     // Catch:{ IOException -> 0x0254 }
            java.lang.String r5 = "errorreporting"
            java.io.File r11 = r9.getDir(r5, r3)     // Catch:{ IOException -> 0x0254 }
            boolean r5 = r11.exists()     // Catch:{ IOException -> 0x0254 }
            if (r5 == 0) goto L_0x018f
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0254 }
            r9.<init>(r11, r6)     // Catch:{ IOException -> 0x0254 }
            boolean r5 = r9.exists()     // Catch:{ IOException -> 0x0254 }
            if (r5 == 0) goto L_0x018f
            java.lang.String r5 = "report_source_ref.txt"
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0254 }
            r6.<init>(r9, r5)     // Catch:{ IOException -> 0x0254 }
            boolean r5 = r6.exists()     // Catch:{ IOException -> 0x0254 }
            if (r5 == 0) goto L_0x018f
            java.lang.String r9 = X.AnonymousClass1XI.A06(r6)     // Catch:{ IOException -> 0x0254 }
            if (r9 == 0) goto L_0x018f
            boolean r5 = r9.isEmpty()     // Catch:{ IOException -> 0x0254 }
            if (r5 != 0) goto L_0x018f
            java.lang.String r5 = "report_source_ref="
            boolean r5 = r9.startsWith(r5)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r6 = "report_source_ref"
            if (r5 == 0) goto L_0x018c
            r5 = 18
            java.lang.String r9 = r9.substring(r5)     // Catch:{ IOException -> 0x0254 }
        L_0x018c:
            r0.A07(r6, r9)     // Catch:{ IOException -> 0x0254 }
        L_0x018f:
            X.01V r5 = r1.A06     // Catch:{ IOException -> 0x0254 }
            android.app.ActivityManager r5 = r5.A03()     // Catch:{ IOException -> 0x0254 }
            if (r5 != 0) goto L_0x019f
            java.lang.String r5 = "memorydumpuploadservice/get-upload-params am=null"
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ IOException -> 0x0254 }
            r6 = 16
            goto L_0x01a3
        L_0x019f:
            int r6 = r5.getMemoryClass()     // Catch:{ IOException -> 0x0254 }
        L_0x01a3:
            r5 = 230176001(0xdb83501, float:1.1352636E-30)
            X.0tz r11 = r1.A07     // Catch:{ IOException -> 0x0254 }
            java.lang.String r9 = X.C003901s.A00()     // Catch:{ IOException -> 0x0254 }
            r10.A01(r11, r9)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r14 = "2.23.1.76"
            java.lang.String r13 = "Whatsapp"
            java.lang.String r12 = "Main Process"
            java.lang.String r10 = "1"
            java.lang.String r11 = "android_hprof_extras"
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ IOException -> 0x0254 }
            r9.<init>()     // Catch:{ IOException -> 0x0254 }
            java.lang.String r15 = "app_version_code"
            r9.put(r15, r5)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r15 = "brand"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x0205 }
            r9.put(r15, r5)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "memclass"
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r6 = "model"
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0205 }
            r9.put(r6, r5)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r6 = "android_version"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0205 }
            r9.put(r6, r5)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "app_version_name"
            r9.put(r5, r14)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "app"
            r9.put(r5, r13)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "process_name"
            r9.put(r5, r12)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "uid"
            r9.put(r5, r10)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = "dump_cause"
            r9.putOpt(r5, r2)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r6 = "platform_abi"
            java.lang.String r5 = X.AnonymousClass1U8.A02()     // Catch:{ JSONException -> 0x0205 }
            r9.put(r6, r5)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r5 = r9.toString()     // Catch:{ JSONException -> 0x0205 }
            goto L_0x0218
        L_0x0205:
            r10 = move-exception
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ IOException -> 0x0254 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0254 }
            java.lang.String r5 = r10.getMessage()     // Catch:{ IOException -> 0x0254 }
            r6[r3] = r5     // Catch:{ IOException -> 0x0254 }
            java.lang.String r5 = "{ 'error' : '%s' }"
            java.lang.String r5 = java.lang.String.format(r9, r5, r6)     // Catch:{ IOException -> 0x0254 }
        L_0x0218:
            r0.A07(r11, r5)     // Catch:{ IOException -> 0x0254 }
            int r5 = r0.A02(r2)     // Catch:{ IOException -> 0x0254 }
            if (r5 <= 0) goto L_0x023c
            r0 = 400(0x190, float:5.6E-43)
            if (r5 >= r0) goto L_0x023c
            android.content.SharedPreferences$Editor r0 = r17.A0K()     // Catch:{ IOException -> 0x0254 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch:{ IOException -> 0x0254 }
            r0.apply()     // Catch:{ IOException -> 0x0254 }
            android.content.SharedPreferences$Editor r0 = r17.A0K()     // Catch:{ IOException -> 0x0254 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)     // Catch:{ IOException -> 0x0254 }
            r0.apply()     // Catch:{ IOException -> 0x0254 }
            return r16
        L_0x023c:
            r16 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0254 }
            r2.<init>()     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = "upload-response-"
            r2.append(r0)     // Catch:{ IOException -> 0x0254 }
            r2.append(r5)     // Catch:{ IOException -> 0x0254 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0254 }
            r1.A0A(r0, r4)     // Catch:{ IOException -> 0x0254 }
            return r16
        L_0x0254:
            r2 = move-exception
            java.lang.String r0 = "app/CrashLogs/uploadCrashData: could not upload crash data"
            com.whatsapp.util.Log.w(r0, r2)
            java.lang.String r0 = "io-error"
            r1.A0A(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Bv.A0B(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):boolean");
    }

    public String AGT() {
        return "CrashLogsImpl";
    }

    public void AMc() {
        this.A01.post(new RunnableRunnableShape8S0100000_I0_7(this, 24));
    }
}
