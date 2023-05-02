package X;

import android.content.ContentValues;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1NG  reason: invalid class name */
public class AnonymousClass1NG {
    public static final int A0E = 1000;
    public static final int A0F = 131072;
    public static final String A0G = "import/complete/all";
    public static final String A0H = "import/complete/enc_metadata";
    public static final String A0I = "import/complete/file_list";
    public static final String A0J = "import/complete/files";
    public static final String A0K = "import/metadata/data_id";
    public static final String A0L = "import/metadata/key";
    public static final String A0M = "import/metadata/key-jid";
    public static final String A0N = "import/metadata/key/account_hash";
    public static final String A0O = "import/metadata/key/proto_version";
    public static final String A0P = "import/metadata/key/server_salt";
    public static final String A0Q = "import/metadata/scheme";
    public static final String A0R = "import/metadata/source_id";
    public static final String A0S = "migration/prefetcher";
    public static final String A0T = "xpm/file-prefetcher";
    public final C16300so A00;
    public final C16040sK A01;
    public final C16980tz A02;
    public final AnonymousClass1NJ A03;
    public final AnonymousClass1NR A04;
    public final AnonymousClass1NS A05;
    public final AnonymousClass1NT A06;
    public final AnonymousClass1NQ A07;
    public final AnonymousClass1NI A08;
    public final C18810xI A09;
    public final AnonymousClass1NP A0A;
    public final C16350st A0B;
    public final AnonymousClass01D A0C;
    public final AtomicBoolean A0D = new AtomicBoolean(false);

    public AnonymousClass1NG(C16300so r3, C16040sK r4, C16980tz r5, C18810xI r6, AnonymousClass1NP r7, AnonymousClass1NI r8, C16350st r9, AnonymousClass01D r10, AnonymousClass1NQ r11, AnonymousClass1NJ r12, AnonymousClass1NR r13, AnonymousClass1NS r14, AnonymousClass1NT r15) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A08 = r8;
        this.A09 = r6;
        this.A0A = r7;
        this.A0C = r10;
        this.A0B = r9;
        this.A03 = r12;
        this.A07 = r11;
        this.A04 = r13;
        this.A05 = r14;
        this.A06 = r15;
    }

    private OutputStream A00(OutputStream outputStream, String str, String str2) {
        if (str2 == null) {
            return outputStream;
        }
        String A002 = this.A06.A00(A0L);
        if (A002 != null) {
            byte[] decode = Base64.decode(A002, 2);
            byte[] decode2 = Base64.decode(str2, 2);
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, new SecretKeySpec(decode, "AES"), new IvParameterSpec(decode2));
                return new CipherOutputStream(outputStream, instance);
            } catch (GeneralSecurityException e2) {
                StringBuilder sb = new StringBuilder("Failed to decrypt: ");
                sb.append(str);
                throw new AnonymousClass40S(sb.toString(), e2, 105);
            }
        } else {
            throw new IOException("Cannot create decryption stream due to a missing key.");
        }
    }

    private void A01() {
        A0I("migration/messages_export.zip");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        if (r8 == null) goto L_0x0158;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0158 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x015d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0185 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0025=Splitter:B:8:0x0025, B:79:0x0185=Splitter:B:79:0x0185} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.os.CancellationSignal r18, byte[] r19) {
        /*
            r17 = this;
            r12 = r17
            X.1NQ r0 = r12.A07
            X.1NS r0 = r0.A00
            X.0tf r4 = r0.A00()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prefetched_files"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x0186 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017f }
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x017f }
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0186 }
            r4.close()
            X.1NQ r0 = r12.A07
            int r2 = r0.A00()
            int r4 = r3 - r2
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); pending="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ", moved="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", total="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NJ r0 = r12.A03     // Catch:{ OperationCanceledException -> 0x015e }
            X.54M r16 = r0.A02()     // Catch:{ OperationCanceledException -> 0x015e }
            X.1NQ r0 = r12.A07     // Catch:{ all -> 0x0159 }
            r1 = 1000(0x3e8, float:1.401E-42)
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x0159 }
            X.0tf r9 = r0.A00()     // Catch:{ all -> 0x0159 }
            X.0tg r7 = r9.A02     // Catch:{ all -> 0x0154 }
            java.lang.String r6 = "SELECT   file._id, file.remote_file_path, file.file_size, file.required,  enc.enc_iv FROM prefetched_files AS file LEFT JOIN encrypted_files AS enc ON file.remote_file_path =   enc.remote_file_path WHERE file.prefetched = 0 ORDER BY   file.required DESC , file._id ASC  LIMIT ?"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0154 }
            r2 = 0
            long r0 = (long) r1     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0154 }
            r5[r2] = r0     // Catch:{ all -> 0x0154 }
            android.database.Cursor r8 = r7.A08(r6, r5)     // Catch:{ all -> 0x0154 }
            r9.close()     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "remote_file_path"
            int r11 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "enc_iv"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "required"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            X.1NR r0 = r12.A04     // Catch:{ all -> 0x014d }
            r0.A04(r4, r3)     // Catch:{ all -> 0x014d }
            r15 = 0
        L_0x0093:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0146
            r2 = r18
            r2.throwIfCanceled()     // Catch:{ all -> 0x014d }
            java.lang.String r14 = r8.getString(r11)     // Catch:{ all -> 0x014d }
            java.lang.String r1 = r8.getString(r10)     // Catch:{ all -> 0x014d }
            int r0 = r8.getInt(r9)     // Catch:{ all -> 0x014d }
            r7 = 0
            if (r0 == 0) goto L_0x00ae
            r7 = 1
        L_0x00ae:
            r0 = r19
            r12.A0H(r2, r14, r1, r0)     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c1 }
            int r4 = r4 + 1
            X.1NI r1 = r12.A08     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c1 }
            java.lang.String r0 = "prefetched/file/success"
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c1 }
            r0.incrementAndGet()     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c1 }
            goto L_0x012e
        L_0x00c1:
            r6 = move-exception
            int r15 = r15 + 1
            X.1NI r1 = r12.A08     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "prefetched/file/failed"
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A00(r0)     // Catch:{ all -> 0x0142 }
            r0.incrementAndGet()     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); failed to import file "
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            r1.append(r14)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0142 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0142 }
            X.0so r5 = r12.A00     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "xpm-file-prefetcher-import-failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            r1.append(r14)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            r1.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0142 }
            r5.A03(r2, r0, r6)     // Catch:{ all -> 0x0142 }
            A03(r14, r6)     // Catch:{ all -> 0x0142 }
            if (r7 != 0) goto L_0x013c
            X.1NQ r0 = r12.A07     // Catch:{ all -> 0x0142 }
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x0142 }
            X.0tf r13 = r0.A01()     // Catch:{ all -> 0x0142 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0137 }
            r7.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "prefetched"
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0137 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0137 }
            X.0tg r6 = r13.A02     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = "prefetched_files"
            java.lang.String r2 = "remote_file_path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0137 }
            r0 = 0
            r1[r0] = r14     // Catch:{ all -> 0x0137 }
            r6.A00(r5, r7, r2, r1)     // Catch:{ all -> 0x0137 }
            r13.close()     // Catch:{ all -> 0x0142 }
        L_0x012e:
            X.1NR r1 = r12.A04     // Catch:{ all -> 0x014d }
            int r0 = r15 + r4
            r1.A04(r0, r3)     // Catch:{ all -> 0x014d }
            goto L_0x0093
        L_0x0137:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x013b }
        L_0x013b:
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x013c:
            X.40S r0 = new X.40S     // Catch:{ all -> 0x0142 }
            r0.<init>(r6)     // Catch:{ all -> 0x0142 }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            goto L_0x0150
        L_0x0144:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014d }
        L_0x0146:
            r8.close()     // Catch:{ all -> 0x0159 }
            r16.close()     // Catch:{ OperationCanceledException -> 0x015e }
            return
        L_0x014d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0158
        L_0x0150:
            r8.close()     // Catch:{ all -> 0x0158 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0158 }
        L_0x0158:
            throw r0     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x015d }
        L_0x015d:
            throw r0     // Catch:{ OperationCanceledException -> 0x015e }
        L_0x015e:
            r2 = move-exception
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); cancelled after "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has been imported."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            throw r2
        L_0x017f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0185
            r1.close()     // Catch:{ all -> 0x0185 }
        L_0x0185:
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x018a }
        L_0x018a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A02(android.os.CancellationSignal, byte[]):void");
    }

    public static void A03(String str, Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            Throwable cause = th.getCause();
            if (cause instanceof AEADBadTagException) {
                StringBuilder sb = new StringBuilder("Failed to decrypt: ");
                sb.append(str);
                throw new AnonymousClass40S(sb.toString(), cause, 104);
            }
        }
    }

    public File A04() {
        return new File(this.A02.A00.getFilesDir(), A0S);
    }

    public File A05(String str) {
        File canonicalFile = A04().getCanonicalFile();
        File canonicalFile2 = new File(canonicalFile, str).getCanonicalFile();
        for (File parentFile = canonicalFile2.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (canonicalFile.equals(parentFile)) {
                return canonicalFile2;
            }
        }
        StringBuilder sb = new StringBuilder("Remote path '");
        sb.append(str);
        sb.append("' escaped prefetch sandbox: '");
        sb.append(canonicalFile2);
        sb.append("'");
        throw new SecurityException(sb.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A06(java.lang.String r11) {
        /*
            r10 = this;
            X.1NQ r0 = r10.A07
            X.AnonymousClass00B.A06(r11)
            X.1NS r0 = r0.A00
            X.0tf r2 = r0.A00()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "SELECT prefetched_file_path, prefetched FROM prefetched_files WHERE remote_file_path = ?"
            r9 = 1
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x00ce }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x00ce }
            android.database.Cursor r3 = r4.A08(r3, r1)     // Catch:{ all -> 0x00ce }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0095
            int r0 = r3.getCount()     // Catch:{ all -> 0x00c7 }
            if (r0 > r9) goto L_0x00ac
            java.lang.String r0 = "prefetched"
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "prefetched_file_path"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            long r7 = r3.getLong(r4)     // Catch:{ all -> 0x00c7 }
            r4 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r6 = 0
            if (r0 != 0) goto L_0x003d
            r6 = 1
        L_0x003d:
            r4 = 1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            r9 = 0
        L_0x0044:
            java.lang.String r4 = r3.getString(r1)     // Catch:{ all -> 0x00c7 }
            if (r9 == 0) goto L_0x0076
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0076
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c7 }
            r1.<init>(r4)     // Catch:{ all -> 0x00c7 }
            r3.close()     // Catch:{ all -> 0x00ce }
            r2.close()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0062
            return r1
        L_0x0062:
            java.lang.String r1 = "Not found in file prefetcher sandbox: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "File was not prefetched: "
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            r1.append(r11)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = ", prefetch failed: "
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            r1.append(r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c7 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c7 }
            goto L_0x00c6
        L_0x0095:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Unknown remote file: "
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            r1.append(r11)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c7 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c7 }
            goto L_0x00c6
        L_0x00ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Multiple prefetched files match: "
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x00c7 }
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c7 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c7 }
        L_0x00c6:
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            if (r3 == 0) goto L_0x00cd
            r3.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A06(java.lang.String):java.io.File");
    }

    public void A07() {
        this.A06.A02(A0G);
    }

    public void A08() {
        this.A0D.get();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A09() {
        /*
            r5 = this;
            X.1NT r4 = r5.A06
            monitor-enter(r4)
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x0048 }
            X.1NQ r0 = r4.A04     // Catch:{ all -> 0x0048 }
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x0048 }
            X.0tf r3 = r0.A01()     // Catch:{ all -> 0x0048 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "properties"
            r1 = 0
            r2.A01(r0, r1, r1)     // Catch:{ all -> 0x0043 }
            r3.close()     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)
            X.1NS r2 = r5.A05
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0040 }
            X.1NV r0 = r2.A00     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ all -> 0x003d }
            r2.A00 = r1     // Catch:{ all -> 0x003d }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "migration_prefetcher.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "FilePrefetcher/removeDatabase/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0040 }
            monitor-exit(r2)
            java.io.File r0 = r5.A04()
            X.AnonymousClass1XI.A0D(r0)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A09():void");
    }

    public void A0A(CancellationSignal cancellationSignal) {
        String str;
        Log.i("xpm/file-prefetcher/importEncryptionKey(); ");
        C16040sK r0 = this.A01;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        if (r02 != null) {
            String rawString = r02.getRawString();
            String A002 = this.A06.A00(A0M);
            if (!rawString.equals(A002)) {
                StringBuilder sb = new StringBuilder("xpm/file-prefetcher/importEncryptionKey(); key was cached for a different jid, removing (old jid: ");
                sb.append(A002);
                sb.append(") ");
                Log.i(sb.toString());
                this.A09.A04.A00.clear();
                this.A06.A01(A0M, (String) null);
                this.A06.A01(A0L, (String) null);
            }
            if (this.A06.A00(A0L) != null) {
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key has already been fetched from the server, skipping.";
            } else {
                String A003 = this.A06.A00(A0O);
                String A004 = this.A06.A00(A0N);
                String A005 = this.A06.A00(A0P);
                if (A003 == null || A004 == null || A005 == null) {
                    StringBuilder sb2 = new StringBuilder("Missing key identifier: version=");
                    sb2.append(A003);
                    sb2.append(", account_hash=");
                    sb2.append(A004);
                    sb2.append(", server_salt=");
                    sb2.append(A005);
                    throw new AnonymousClass40R(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("xpm/file-prefetcher/importEncryptionKey(); key, version=");
                sb3.append(A003);
                sb3.append(", account_hash=");
                sb3.append(A004);
                sb3.append(", server_salt=");
                sb3.append(A005);
                Log.i(sb3.toString());
                C37881pt A012 = this.A09.A01(cancellationSignal, A003, A004, A005);
                this.A06.A01(A0L, A012.A03);
                this.A06.A01(A0M, A012.A01.getRawString());
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key imported successfully";
            }
            Log.i(str);
            return;
        }
        throw new AnonymousClass40S(301, "Cannot identify current logged in user.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        if (this.A06.A02(A0J)) {
            Log.i("xpm/file-prefetcher/importAllFiles(); file were already imported, skipping.");
            return;
        }
        byte[] bArr = new byte[131072];
        while (this.A07.A00() > 0) {
            cancellationSignal.throwIfCanceled();
            A02(cancellationSignal, bArr);
        }
        this.A06.A01(A0J, Boolean.toString(true));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0196 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.os.CancellationSignal r15) {
        /*
            r14 = this;
            java.lang.String r7 = "migration/enc.zip"
            java.lang.String r6 = "import/complete/enc_metadata"
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r14.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 == 0) goto L_0x01c9
            java.lang.String r9 = X.C88724az.A00(r0)
            X.1NJ r0 = r14.A03
            X.54M r13 = r0.A02()
            X.1NQ r0 = r14.A07     // Catch:{ all -> 0x01c4 }
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x01c4 }
            X.0tf r12 = r0.A01()     // Catch:{ all -> 0x01c4 }
            X.1cj r11 = r12.A00()     // Catch:{ all -> 0x01bf }
            X.1NT r0 = r14.A06     // Catch:{ all -> 0x01ba }
            r4 = 0
            boolean r0 = r0.A02(r6)     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); encryption metadata is already imported, skipping."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01ba }
            r11.close()     // Catch:{ all -> 0x01bf }
            r12.close()     // Catch:{ all -> 0x01c4 }
            r13.close()
            return
        L_0x0042:
            boolean r0 = r14.A0J()     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x01b0
            X.1NJ r0 = r14.A03     // Catch:{ all -> 0x01ba }
            android.os.ParcelFileDescriptor r10 = r0.A00(r7)     // Catch:{ all -> 0x01ba }
            java.io.FileDescriptor r0 = r10.getFileDescriptor()     // Catch:{ all -> 0x01a9 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x01a9 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a9 }
            X.1NP r0 = r14.A0A     // Catch:{ all -> 0x01a4 }
            X.4az r8 = r0.A00(r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = r8.A03     // Catch:{ all -> 0x01a4 }
            if (r5 == 0) goto L_0x0088
            boolean r0 = r5.equals(r9)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0088
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r1.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "Source id mismatch: current="
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            r1.append(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = ", expected="
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            r1.append(r9)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a4 }
            X.40S r1 = new X.40S     // Catch:{ all -> 0x01a4 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0087:
            throw r1     // Catch:{ all -> 0x01a4 }
        L_0x0088:
            java.lang.String r9 = r8.A02     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "AES-GCM-v1"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x00c7
            X.1NT r1 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "import/metadata/scheme"
            r1.A01(r0, r9)     // Catch:{ all -> 0x01a4 }
            X.1NT r2 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "import/metadata/data_id"
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x01a4 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x01a4 }
            X.1NT r1 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "import/metadata/source_id"
            r1.A01(r0, r5)     // Catch:{ all -> 0x01a4 }
            X.1NT r2 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "import/metadata/key/proto_version"
            X.4RG r5 = r8.A00     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x01a4 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x01a4 }
            X.1NT r2 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "import/metadata/key/account_hash"
            java.lang.String r0 = r5.A00     // Catch:{ all -> 0x01a4 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x01a4 }
            X.1NT r2 = r14.A06     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "import/metadata/key/server_salt"
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x01a4 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x00e0
        L_0x00c7:
            r2 = 100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r1.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "Unsupported: "
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            r1.append(r9)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a4 }
            X.40S r1 = new X.40S     // Catch:{ all -> 0x01a4 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x0087
        L_0x00e0:
            r3.close()     // Catch:{ all -> 0x01a9 }
            r10.close()     // Catch:{ all -> 0x01ba }
            X.1NJ r0 = r14.A03     // Catch:{ all -> 0x01ba }
            android.os.ParcelFileDescriptor r10 = r0.A00(r7)     // Catch:{ all -> 0x01ba }
            java.io.FileDescriptor r0 = r10.getFileDescriptor()     // Catch:{ all -> 0x01a9 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x01a9 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a9 }
            X.1NP r5 = r14.A0A     // Catch:{ all -> 0x01a4 }
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01a4 }
            r2.<init>(r3)     // Catch:{ all -> 0x01a4 }
        L_0x00fc:
            java.util.zip.ZipEntry r0 = r2.getNextEntry()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0197
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "metadata.json"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x00fc
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x019f }
            r0.<init>(r2)     // Catch:{ all -> 0x019f }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x019f }
            r1.<init>(r0)     // Catch:{ all -> 0x019f }
            X.0st r0 = r5.A00     // Catch:{ all -> 0x019f }
            X.3v4 r7 = new X.3v4     // Catch:{ all -> 0x019f }
            r7.<init>(r1, r0, r2)     // Catch:{ all -> 0x019f }
        L_0x011f:
            boolean r0 = r7.A01()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x015b
            r15.throwIfCanceled()     // Catch:{ all -> 0x0192 }
            java.lang.Object r8 = r7.A00()     // Catch:{ all -> 0x0192 }
            X.4Qv r8 = (X.C86004Qv) r8     // Catch:{ all -> 0x0192 }
            X.1NQ r2 = r14.A07     // Catch:{ all -> 0x0192 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0192 }
            r5.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "remote_file_path"
            r5.put(r0, r1)     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "enc_iv"
            r5.put(r0, r1)     // Catch:{ all -> 0x0192 }
            X.1NS r0 = r2.A00     // Catch:{ all -> 0x0192 }
            X.0tf r2 = r0.A01()     // Catch:{ all -> 0x0192 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "encrypted_files"
            r1.A02(r5, r0)     // Catch:{ all -> 0x0156 }
            r2.close()     // Catch:{ all -> 0x0192 }
            int r4 = r4 + 1
            goto L_0x011f
        L_0x0156:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x015a }
        L_0x015a:
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x015b:
            r7.close()     // Catch:{ all -> 0x01a4 }
            r3.close()     // Catch:{ all -> 0x01a9 }
            r10.close()     // Catch:{ all -> 0x01ba }
            X.1NT r1 = r14.A06     // Catch:{ all -> 0x01ba }
            r0 = 1
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x01ba }
            r1.A01(r6, r0)     // Catch:{ all -> 0x01ba }
            r11.A00()     // Catch:{ all -> 0x01ba }
            r11.close()     // Catch:{ all -> 0x01bf }
            r12.close()     // Catch:{ all -> 0x01c4 }
            r13.close()
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); imported "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " encrypted file metadata entries."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0192:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0196 }
        L_0x0196:
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x0197:
            java.lang.String r1 = "metadata.json was not found in zip file."
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x019f }
            r0.<init>(r1)     // Catch:{ all -> 0x019f }
            throw r0     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            throw r0     // Catch:{ all -> 0x01a9 }
        L_0x01a9:
            r0 = move-exception
            if (r10 == 0) goto L_0x01af
            r10.close()     // Catch:{ all -> 0x01af }
        L_0x01af:
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01b0:
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "Missing encryption metadata: migration/enc.zip"
            X.40S r0 = new X.40S     // Catch:{ all -> 0x01ba }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x01be }
        L_0x01be:
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            throw r0
        L_0x01c9:
            r2 = 301(0x12d, float:4.22E-43)
            java.lang.String r1 = "Cannot identify current logged in user."
            X.40S r0 = new X.40S
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A0C(android.os.CancellationSignal):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0112 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0117 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0123 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.os.CancellationSignal r13) {
        /*
            r12 = this;
            java.lang.String r4 = "import/complete/file_list"
            java.lang.String r0 = "xpm/file-prefetcher/importFileList(); "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NQ r0 = r12.A07
            X.1NS r0 = r0.A00
            X.0tf r11 = r0.A01()
            X.1cj r10 = r11.A00()     // Catch:{ all -> 0x0124 }
            X.1NT r0 = r12.A06     // Catch:{ all -> 0x011f }
            r7 = 0
            boolean r0 = r0.A02(r4)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "xpm/file-prefetcher/importFileList(); file list was already imported, skipping."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011f }
            r10.close()     // Catch:{ all -> 0x0124 }
            r11.close()
            return
        L_0x002a:
            X.1NJ r5 = r12.A03     // Catch:{ all -> 0x011f }
            X.34b r6 = r5.A01()     // Catch:{ Exception -> 0x0118 }
            android.os.IInterface r0 = r6.A01()     // Catch:{ all -> 0x0113 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch:{ all -> 0x0113 }
            android.os.ParcelFileDescriptor r3 = r0.ACI()     // Catch:{ all -> 0x0113 }
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x0113 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0113 }
            r1.<init>(r0)     // Catch:{ all -> 0x0113 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0113 }
            r0.<init>(r1)     // Catch:{ all -> 0x0113 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ all -> 0x0113 }
            r2.<init>(r0)     // Catch:{ all -> 0x0113 }
            X.1NW r0 = r5.A06     // Catch:{ all -> 0x0113 }
            X.0un r0 = r0.A00     // Catch:{ all -> 0x0113 }
            X.0sX r0 = r0.A01     // Catch:{ all -> 0x0113 }
            X.01L r0 = r0.AS2     // Catch:{ all -> 0x0113 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0113 }
            X.C16340ss.A01(r1)     // Catch:{ all -> 0x0113 }
            X.0st r0 = new X.0st     // Catch:{ all -> 0x0113 }
            r0.<init>(r1)     // Catch:{ all -> 0x0113 }
            X.3v3 r5 = new X.3v3     // Catch:{ all -> 0x0113 }
            r5.<init>(r3, r2, r0)     // Catch:{ all -> 0x0113 }
            r6.close()     // Catch:{ Exception -> 0x0118 }
            r3 = 0
        L_0x0068:
            boolean r0 = r5.A01()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00e0
            r13.throwIfCanceled()     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r5.A00()     // Catch:{ all -> 0x010e }
            X.4Vl r1 = (X.C87114Vl) r1     // Catch:{ all -> 0x010e }
            X.1NQ r2 = r12.A07     // Catch:{ all -> 0x010e }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x010e }
            r8.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r6 = r1.A01     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "remote_file_path"
            r8.put(r0, r6)     // Catch:{ all -> 0x010e }
            long r0 = r1.A00     // Catch:{ all -> 0x010e }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "file_size"
            r8.put(r0, r1)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "prefetched_file_path"
            r8.putNull(r0)     // Catch:{ all -> 0x010e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "required"
            r8.put(r0, r1)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "prefetched"
            r8.put(r0, r1)     // Catch:{ all -> 0x010e }
            X.1NS r0 = r2.A00     // Catch:{ all -> 0x010e }
            X.0tf r2 = r0.A01()     // Catch:{ all -> 0x010e }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "prefetched_files"
            long r8 = r1.A02(r8, r0)     // Catch:{ all -> 0x00db }
            r2.close()     // Catch:{ all -> 0x010e }
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r1.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "xpm/file-prefetcher/importFileList(); failed to import metadata for "
            r1.append(r0)     // Catch:{ all -> 0x010e }
            r1.append(r6)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010e }
            X.0so r1 = r12.A00     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "xpm-file-prefetcher-cannot-add-metadata"
            r1.AcB(r0, r6, r7)     // Catch:{ all -> 0x010e }
            goto L_0x0068
        L_0x00d8:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x00db:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00df }
        L_0x00df:
            throw r0     // Catch:{ all -> 0x010e }
        L_0x00e0:
            r5.close()     // Catch:{ all -> 0x011f }
            X.1NT r1 = r12.A06     // Catch:{ all -> 0x011f }
            r0 = 1
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x011f }
            r1.A01(r4, r0)     // Catch:{ all -> 0x011f }
            r10.A00()     // Catch:{ all -> 0x011f }
            r10.close()     // Catch:{ all -> 0x0124 }
            r11.close()
            java.lang.String r0 = "xpm/file-prefetcher/importFileList(); imported "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " entries."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x010e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0112 }
        L_0x0112:
            throw r0     // Catch:{ all -> 0x011f }
        L_0x0113:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0     // Catch:{ Exception -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011f }
            r0.<init>(r1)     // Catch:{ all -> 0x011f }
            throw r0     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0123 }
        L_0x0123:
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0128 }
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A0D(android.os.CancellationSignal):void");
    }

    public void A0E(CancellationSignal cancellationSignal) {
        if (!this.A0D.getAndSet(true)) {
            try {
                A0F(cancellationSignal);
            } finally {
                this.A0D.set(false);
            }
        } else {
            Log.e("xpm/file-prefetcher/prefetchAllFiles()concurrent prefetch requested, not supported");
            throw new IllegalStateException("Multiple concurrent operations are not supported.");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(android.os.CancellationSignal r5) {
        /*
            r4 = this;
            java.lang.String r0 = "xpm/file-prefetcher/prefetchAllFilesLocked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NT r0 = r4.A06
            java.lang.String r3 = "import/complete/all"
            boolean r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "xpm/file-prefetcher/prefetchAllFilesLocked() already marked as completed, nothing to do."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0017:
            X.1NJ r0 = r4.A03     // Catch:{ OperationCanceledException -> 0x004f }
            X.54M r2 = r0.A02()     // Catch:{ OperationCanceledException -> 0x004f }
            boolean r0 = r4.A0J()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0029
            r4.A0C(r5)     // Catch:{ all -> 0x004a }
            r4.A0A(r5)     // Catch:{ all -> 0x004a }
        L_0x0029:
            r4.A0D(r5)     // Catch:{ all -> 0x004a }
            r4.A01()     // Catch:{ all -> 0x004a }
            r4.A0B(r5)     // Catch:{ all -> 0x004a }
            X.01D r0 = r4.A0C     // Catch:{ all -> 0x004a }
            r0.get()     // Catch:{ all -> 0x004a }
            X.1NJ r0 = r4.A03     // Catch:{ all -> 0x004a }
            r0.A03()     // Catch:{ all -> 0x004a }
            X.1NT r1 = r4.A06     // Catch:{ all -> 0x004a }
            r0 = 1
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x004a }
            r1.A01(r3, r0)     // Catch:{ all -> 0x004a }
            r2.close()     // Catch:{ OperationCanceledException -> 0x004f }
            return
        L_0x004a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ OperationCanceledException -> 0x004f }
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "xpm/file-prefetcher/prefetchAllFilesLocked()cancelled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A0F(android.os.CancellationSignal):void");
    }

    public void A0G(CancellationSignal cancellationSignal, File file, String str, byte[] bArr) {
        this.A0B.A03(cancellationSignal, A06(str), file, bArr);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00d8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0035=Splitter:B:21:0x0035, B:66:0x00cc=Splitter:B:66:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.os.CancellationSignal r8, java.lang.String r9, java.lang.String r10, byte[] r11) {
        /*
            r7 = this;
            java.io.File r4 = r7.A05(r9)
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L_0x000d
            r0.mkdirs()
        L_0x000d:
            X.1NJ r0 = r7.A03     // Catch:{ OperationCanceledException -> 0x00d9 }
            android.os.ParcelFileDescriptor r5 = r0.A00(r9)     // Catch:{ OperationCanceledException -> 0x00d9 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x00d2 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x00d2 }
            r3.<init>(r0)     // Catch:{ all -> 0x00d2 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00cd }
            r2.<init>(r4)     // Catch:{ all -> 0x00cd }
            java.io.OutputStream r1 = r7.A00(r2, r9, r10)     // Catch:{ all -> 0x00c8 }
            X.C16350st.A01(r8, r3, r1, r11)     // Catch:{ all -> 0x0029 }
            goto L_0x0030
        L_0x0029:
            r0 = move-exception
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x00c8 }
        L_0x0035:
            r2.close()     // Catch:{ all -> 0x00cd }
            r3.close()     // Catch:{ all -> 0x00d2 }
            r5.close()     // Catch:{ OperationCanceledException -> 0x00d9 }
            X.1NQ r0 = r7.A07
            java.lang.String r3 = r4.getCanonicalPath()
            X.1NS r0 = r0.A00
            X.0tf r6 = r0.A01()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00c3 }
            r5.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "prefetched"
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00c3 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "prefetched_file_path"
            r5.put(r0, r3)     // Catch:{ all -> 0x00c3 }
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = "prefetched_files"
            java.lang.String r2 = "remote_file_path = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00c3 }
            r0 = 0
            r1[r0] = r9     // Catch:{ all -> 0x00c3 }
            r4.A00(r3, r5, r2, r1)     // Catch:{ all -> 0x00c3 }
            r6.close()
            X.01D r0 = r7.A0C
            r0.get()
            java.lang.String r0 = "migration/metadata.json"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00c2
            X.1NJ r0 = r7.A03
            X.34b r5 = r0.A01()     // Catch:{ Exception -> 0x00bb }
            android.os.IInterface r1 = r5.A01()     // Catch:{ all -> 0x00b6 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r1 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r1     // Catch:{ all -> 0x00b6 }
            X.4ns r1 = (X.C96154ns) r1     // Catch:{ all -> 0x00b6 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x00b6 }
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService"
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x00ae }
            r4.writeString(r9)     // Catch:{ all -> 0x00ae }
            android.os.IBinder r2 = r1.A00     // Catch:{ all -> 0x00ae }
            r1 = 3
            r0 = 0
            r2.transact(r1, r4, r3, r0)     // Catch:{ all -> 0x00ae }
            r3.readException()     // Catch:{ all -> 0x00ae }
            r3.recycle()     // Catch:{ all -> 0x00b6 }
            r4.recycle()     // Catch:{ all -> 0x00b6 }
            r5.close()     // Catch:{ Exception -> 0x00bb }
            return
        L_0x00ae:
            r0 = move-exception
            r3.recycle()     // Catch:{ all -> 0x00b6 }
            r4.recycle()     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            throw r0     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r9, r1)
            throw r0
        L_0x00c2:
            return
        L_0x00c3:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            throw r0
        L_0x00c8:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            if (r5 == 0) goto L_0x00d8
            r5.close()     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            throw r0     // Catch:{ OperationCanceledException -> 0x00d9 }
        L_0x00d9:
            r2 = move-exception
            r4.delete()
            java.lang.String r1 = "xpm/file-prefetcher/importFile(); cancelled while importing "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A0H(android.os.CancellationSignal, java.lang.String, java.lang.String, byte[]):void");
    }

    public void A0I(String str) {
        C16800tf A012 = this.A07.A00.A01();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("required", 1);
            int A002 = A012.A02.A00("prefetched_files", contentValues, "remote_file_path = ?", new String[]{str});
            A012.close();
            if (A002 <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is not present in remote sandbox.");
                throw new AnonymousClass40S(200, sb.toString());
            }
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public boolean A0J() {
        try {
            ParcelFileDescriptor A002 = this.A03.A00("migration/enc.zip");
            if (A002 != null) {
                A002.close();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
