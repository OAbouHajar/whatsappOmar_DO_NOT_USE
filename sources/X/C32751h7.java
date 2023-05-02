package X;

import android.content.Context;
import android.util.Log;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1h7  reason: invalid class name and case insensitive filesystem */
public final class C32751h7 implements C32761h8 {
    public static AtomicReference A09 = new AtomicReference((Object) null);
    public C32741h6 A00;
    public C32781hA A01;
    public MmapBufferManager A02;
    public C32721h1[] A03;
    public C32721h1[] A04;
    public final C32791hC A05;
    public final Object A06 = new Object();
    public final Random A07;
    public volatile C32771h9 A08;

    public C32751h7(Context context, C32741h6 r8, File file, C32721h1[] r10) {
        this.A00 = r8;
        this.A08 = null;
        this.A01 = new C32781hA(context, file);
        this.A07 = new Random();
        this.A05 = new C32791hC();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C32721h1 r1 : r10) {
            if (r1 instanceof C32711h0) {
                arrayList.add(r1);
            } else {
                arrayList2.add(r1);
            }
        }
        this.A03 = (C32721h1[]) arrayList2.toArray(new C32721h1[arrayList2.size()]);
        this.A04 = (C32721h1[]) arrayList.toArray(new C32721h1[arrayList.size()]);
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    File file3 = new File(file, file2);
                    if (file3.isDirectory()) {
                        A00(file3);
                    } else {
                        file3.delete();
                    }
                }
            }
            file.delete();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.io.File r9, java.lang.String r10, java.util.zip.ZipOutputStream r11) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r10)
            java.io.File r8 = r0.getAbsoluteFile()
            java.net.URI r7 = r9.toURI()
            java.lang.String[] r6 = r8.list()
            int r5 = r6.length
            r4 = 0
        L_0x0013:
            if (r4 >= r5) goto L_0x0073
            r0 = r6[r4]
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0066
            java.net.URI r0 = r2.toURI()
            java.net.URI r0 = r7.relativize(r0)
            java.lang.String r1 = r0.getPath()
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L_0x0059
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x006e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x006e }
            r3.<init>(r0)     // Catch:{ all -> 0x006e }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0069 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            r11.putNextEntry(r0)     // Catch:{ all -> 0x0069 }
        L_0x004a:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0069 }
            if (r1 <= 0) goto L_0x0055
            r0 = 0
            r11.write(r2, r0, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x004a
        L_0x0055:
            r3.close()     // Catch:{ all -> 0x006e }
            goto L_0x0063
        L_0x0059:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0066
            A01(r9, r1, r11)
            goto L_0x0066
        L_0x0063:
            r11.closeEntry()
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0069:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            r11.closeEntry()
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32751h7.A01(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    public final void A02(C32841hK r6) {
        for (Buffer deallocateBuffer : r6.A0F) {
            if (!this.A02.deallocateBuffer(deallocateBuffer)) {
                StringBuilder sb = new StringBuilder("Could not release memory for buffer for trace: ");
                sb.append(r6.A0D);
                Log.e("Profilo/TraceOrchestrator", sb.toString());
            }
        }
    }

    public void AZ4(C32841hK r5, int i2) {
        String str;
        IllegalStateException th;
        try {
            this.A05.AZ4(r5, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Trace is aborted with code: ");
            switch (i2) {
                case 1:
                    str = "unknown";
                    break;
                case 2:
                    str = "controller_init";
                    break;
                case 3:
                    str = "missed_event";
                    break;
                case 4:
                    str = "timeout";
                    break;
                case 5:
                    str = "new_start";
                    break;
                case 6:
                    str = "condition_not_met";
                    break;
                case 8:
                    str = "writer_exception";
                    break;
                case 9:
                    str = "logout";
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder("UNKNOWN REASON ");
                    sb2.append(i2);
                    str = sb2.toString();
                    break;
            }
            sb.append(str);
            Log.w("Profilo/TraceOrchestrator", sb.toString());
            C32671gw r2 = C32671gw.A0A;
            if (r2 != null) {
                r2.A04(r5.A06, i2);
                File file = r5.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                        }
                    }
                    A00(file);
                }
                A02(r5);
                return;
            }
            th = new IllegalStateException("No TraceControl when cleaning up aborted trace");
            throw th;
        } catch (Exception e2) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e2);
        } catch (Throwable th3) {
            A02(r5);
            throw th3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AZ5(X.C32841hK r19) {
        /*
            r18 = this;
            r4 = r18
            r5 = r19
            X.1hC r6 = r4.A05     // Catch:{ all -> 0x027e }
            r6.AZ5(r5)     // Catch:{ all -> 0x027e }
            java.io.File r7 = r5.A0A     // Catch:{ all -> 0x027e }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x027a
            boolean r0 = r7.isDirectory()     // Catch:{ all -> 0x027e }
            r1 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.String[] r0 = r7.list()     // Catch:{ all -> 0x027e }
            int r0 = r0.length     // Catch:{ all -> 0x027e }
            if (r0 <= r1) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            r9 = 0
            if (r1 == 0) goto L_0x00b9
            java.lang.String r2 = ".zip.tmp"
            boolean r0 = r7.isDirectory()     // Catch:{ all -> 0x027e }
            r8 = 0
            if (r0 == 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            r1.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x027e }
            r1.append(r0)     // Catch:{ all -> 0x027e }
            r1.append(r2)     // Catch:{ all -> 0x027e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r7.getParent()     // Catch:{ all -> 0x027e }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x027e }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x027e }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0077 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0077 }
            r0 = 262144(0x40000, float:3.67342E-40)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0077 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0077 }
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0072 }
            r1.<init>(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "."
            A01(r7, r0, r1)     // Catch:{ all -> 0x006d }
            r1.flush()     // Catch:{ all -> 0x006d }
            r1.finish()     // Catch:{ all -> 0x006d }
            r1.close()     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0077 }
            r8 = r3
            goto L_0x007a
        L_0x006d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            r3.delete()     // Catch:{ all -> 0x027e }
        L_0x007a:
            java.lang.String r2 = "yyyy-MM-dd'T'HH-mm-ss"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x027e }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x027e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x027e }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x027e }
            r0.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r1.format(r0)     // Catch:{ all -> 0x027e }
            java.io.File r2 = r8.getParentFile()     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            r1.<init>()     // Catch:{ all -> 0x027e }
            r1.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x027e }
            r1.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x027e }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x027e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x027e }
            boolean r0 = r8.renameTo(r1)     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x00b5
            r8 = r1
        L_0x00b5:
            A00(r7)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d0
        L_0x00b9:
            java.io.File[] r1 = r7.listFiles()     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x027a
            int r0 = r1.length     // Catch:{ all -> 0x027e }
            if (r0 == 0) goto L_0x027a
            r8 = r1[r9]     // Catch:{ all -> 0x027e }
            if (r8 != 0) goto L_0x00d0
            goto L_0x027a
        L_0x00c8:
            r2 = move-exception
            java.lang.String r1 = "Profilo/TraceOrchestrator"
            java.lang.String r0 = "failed to delete directory"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x027e }
        L_0x00d0:
            boolean r0 = r6.A60(r5, r8)     // Catch:{ all -> 0x027e }
            if (r0 != 0) goto L_0x00df
            java.lang.String r1 = "Profilo/TraceOrchestrator"
            java.lang.String r0 = "Not allowed to upload."
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x027e }
            goto L_0x027a
        L_0x00df:
            monitor-enter(r4)     // Catch:{ all -> 0x027e }
            int r0 = r5.A03     // Catch:{ all -> 0x0277 }
            r0 = r0 & 3
            if (r0 == 0) goto L_0x00e7
            r9 = 1
        L_0x00e7:
            X.1hA r2 = r4.A01     // Catch:{ all -> 0x0277 }
            java.lang.String r7 = r8.getName()     // Catch:{ all -> 0x0277 }
            r0 = 46
            int r1 = r7.lastIndexOf(r0)     // Catch:{ all -> 0x0277 }
            r3 = 0
            r0 = -1
            if (r1 == r0) goto L_0x00fb
            java.lang.String r7 = r7.substring(r3, r1)     // Catch:{ all -> 0x0277 }
        L_0x00fb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0277 }
            r1.<init>()     // Catch:{ all -> 0x0277 }
            r1.append(r7)     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = ".log"
            r1.append(r0)     // Catch:{ all -> 0x0277 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0277 }
            if (r9 == 0) goto L_0x011c
            java.lang.String r1 = "override-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0277 }
            r0.<init>(r1)     // Catch:{ all -> 0x0277 }
            r0.append(r7)     // Catch:{ all -> 0x0277 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0277 }
        L_0x011c:
            java.io.File r11 = r2.A05     // Catch:{ all -> 0x0277 }
            boolean r0 = r11.isDirectory()     // Catch:{ all -> 0x0277 }
            r17 = 1
            if (r0 != 0) goto L_0x0140
            boolean r0 = r11.mkdirs()     // Catch:{ all -> 0x0277 }
            if (r0 != 0) goto L_0x0140
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            int r0 = r1.A01     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x0277 }
        L_0x0134:
            X.4Nx r7 = r2.A02     // Catch:{ all -> 0x0277 }
            X.4Nx r0 = new X.4Nx     // Catch:{ all -> 0x0277 }
            r0.<init>()     // Catch:{ all -> 0x0277 }
            r2.A02 = r0     // Catch:{ all -> 0x0277 }
            monitor-exit(r4)     // Catch:{ all -> 0x0277 }
            goto L_0x025f
        L_0x0140:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0277 }
            r0.<init>(r11, r7)     // Catch:{ all -> 0x0277 }
            boolean r0 = r8.renameTo(r0)     // Catch:{ all -> 0x0277 }
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x01fd
            int r0 = r1.A00     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0277 }
        L_0x0153:
            java.io.File r8 = r2.A06     // Catch:{ all -> 0x0277 }
            long r0 = r2.A01     // Catch:{ all -> 0x0277 }
            r7 = 2
            java.io.FilenameFilter[] r13 = new java.io.FilenameFilter[r7]     // Catch:{ all -> 0x0277 }
            java.io.FilenameFilter r16 = X.C32781hA.A07     // Catch:{ all -> 0x0277 }
            r13[r3] = r16     // Catch:{ all -> 0x0277 }
            java.io.FilenameFilter r15 = X.C32781hA.A08     // Catch:{ all -> 0x0277 }
            r13[r17] = r15     // Catch:{ all -> 0x0277 }
            boolean r9 = r11.exists()     // Catch:{ all -> 0x0277 }
            if (r9 != 0) goto L_0x0183
            boolean r9 = r11.isDirectory()     // Catch:{ all -> 0x0277 }
            if (r9 != 0) goto L_0x0183
        L_0x016e:
            int r10 = r2.A00     // Catch:{ all -> 0x0277 }
            java.io.FilenameFilter[] r11 = new java.io.FilenameFilter[r7]     // Catch:{ all -> 0x0277 }
            r11[r3] = r16     // Catch:{ all -> 0x0277 }
            r11[r17] = r15     // Catch:{ all -> 0x0277 }
            boolean r0 = r8.exists()     // Catch:{ all -> 0x0277 }
            if (r0 != 0) goto L_0x0205
            boolean r0 = r8.isDirectory()     // Catch:{ all -> 0x0277 }
            if (r0 != 0) goto L_0x0205
            goto L_0x0134
        L_0x0183:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0277 }
            r10.<init>()     // Catch:{ all -> 0x0277 }
            r12 = 0
        L_0x0189:
            r9 = r13[r12]     // Catch:{ all -> 0x0277 }
            java.io.File[] r9 = r11.listFiles(r9)     // Catch:{ all -> 0x0277 }
            if (r9 != 0) goto L_0x019b
            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0277 }
        L_0x0193:
            r10.addAll(r9)     // Catch:{ all -> 0x0277 }
            int r12 = r12 + 1
            if (r12 < r7) goto L_0x0189
            goto L_0x01a0
        L_0x019b:
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x0277 }
            goto L_0x0193
        L_0x01a0:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0277 }
            long r13 = r13 - r0
            java.util.Iterator r12 = r10.iterator()     // Catch:{ all -> 0x0277 }
        L_0x01a9:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x0277 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ all -> 0x0277 }
            long r10 = r9.lastModified()     // Catch:{ all -> 0x0277 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a9
            java.lang.String r1 = r9.getName()     // Catch:{ all -> 0x0277 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0277 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0277 }
            boolean r0 = r9.renameTo(r0)     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x01ce
            r0 = 1
            goto L_0x01eb
        L_0x01ce:
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            int r0 = r1.A03     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x0277 }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r9.delete()     // Catch:{ all -> 0x0277 }
            if (r0 != 0) goto L_0x01ea
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            int r0 = r1.A02     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A02 = r0     // Catch:{ all -> 0x0277 }
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x01f6
            int r0 = r1.A05     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A05 = r0     // Catch:{ all -> 0x0277 }
            goto L_0x01a9
        L_0x01f6:
            int r0 = r1.A04     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x0277 }
            goto L_0x01a9
        L_0x01fd:
            int r0 = r1.A03     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A03 = r0     // Catch:{ all -> 0x0277 }
            goto L_0x0153
        L_0x0205:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0277 }
            r9.<init>()     // Catch:{ all -> 0x0277 }
            r1 = 0
        L_0x020b:
            r0 = r11[r1]     // Catch:{ all -> 0x0277 }
            java.io.File[] r0 = r8.listFiles(r0)     // Catch:{ all -> 0x0277 }
            if (r0 != 0) goto L_0x021d
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0277 }
        L_0x0215:
            r9.addAll(r0)     // Catch:{ all -> 0x0277 }
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x020b
            goto L_0x0222
        L_0x021d:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0277 }
            goto L_0x0215
        L_0x0222:
            int r0 = r9.size()     // Catch:{ all -> 0x0277 }
            if (r0 <= r10) goto L_0x0134
            com.facebook.redex.IDxComparatorShape183S0100000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape183S0100000_2_I0     // Catch:{ all -> 0x0277 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0277 }
            java.util.Collections.sort(r9, r0)     // Catch:{ all -> 0x0277 }
            int r0 = r9.size()     // Catch:{ all -> 0x0277 }
            int r0 = r0 - r10
            java.util.List r0 = r9.subList(r3, r0)     // Catch:{ all -> 0x0277 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0277 }
        L_0x023d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0277 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0277 }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x0277 }
            X.4Nx r1 = r2.A02     // Catch:{ all -> 0x0277 }
            if (r0 == 0) goto L_0x0258
            int r0 = r1.A06     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ all -> 0x0277 }
            goto L_0x023d
        L_0x0258:
            int r0 = r1.A04     // Catch:{ all -> 0x0277 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ all -> 0x0277 }
            goto L_0x023d
        L_0x025f:
            r6.AZ1(r5)     // Catch:{ all -> 0x027e }
            int r3 = r7.A02     // Catch:{ all -> 0x027e }
            int r0 = r7.A03     // Catch:{ all -> 0x027e }
            int r3 = r3 + r0
            int r0 = r7.A01     // Catch:{ all -> 0x027e }
            int r3 = r3 + r0
            int r0 = r7.A04     // Catch:{ all -> 0x027e }
            int r3 = r3 + r0
            int r2 = r7.A06     // Catch:{ all -> 0x027e }
            int r1 = r7.A05     // Catch:{ all -> 0x027e }
            int r0 = r7.A00     // Catch:{ all -> 0x027e }
            r6.AZ0(r3, r2, r1, r0)     // Catch:{ all -> 0x027e }
            goto L_0x027a
        L_0x0277:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0277 }
            throw r0     // Catch:{ all -> 0x027e }
        L_0x027a:
            r4.A02(r5)
            return
        L_0x027e:
            r0 = move-exception
            r4.A02(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32751h7.AZ5(X.1hK):void");
    }

    public void AZ6(C32841hK r3, Throwable th) {
        Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A05.AZ6(r3, th);
        AZ4(r3, 8);
    }

    public void AZ7(C32841hK r2) {
        this.A05.AZ7(r2);
    }
}
