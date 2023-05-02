package X;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.00J  reason: invalid class name */
public final class AnonymousClass00J implements Closeable {
    public final long A00;
    public final File A01;
    public final File A02;
    public final RandomAccessFile A03;
    public final FileChannel A04;
    public final FileLock A05;

    public AnonymousClass00J(File file, File file2) {
        StringBuilder sb = new StringBuilder("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        Log.i("MultiDex", sb.toString());
        this.A02 = file;
        this.A01 = file2;
        this.A00 = A00(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.A03 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.A04 = channel;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Blocking on lock ");
            sb2.append(file3.getPath());
            Log.i("MultiDex", sb2.toString());
            this.A05 = channel.lock();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file3.getPath());
            sb3.append(" locked");
            Log.i("MultiDex", sb3.toString());
        } catch (IOException | Error | RuntimeException e2) {
            A01(this.A04);
            throw e2;
        } catch (IOException | Error | RuntimeException e3) {
            A01(this.A03);
            throw e3;
        }
    }

    /* JADX INFO: finally extract failed */
    public static long A00(File file) {
        ZipException zipException;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            long j2 = 0;
            if (length >= 0) {
                long j3 = length - 65536;
                if (j3 >= 0) {
                    j2 = j3;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L);
                        int min = (int) Math.min(16384, reverseBytes2);
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = randomAccessFile.read(bArr, 0, min);
                            if (read == -1) {
                                break;
                            }
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            min = (int) Math.min(16384, reverseBytes2);
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        return value == -1 ? value - 1 : value;
                    }
                    length--;
                } while (length >= j2);
                zipException = new ZipException("End Of Central Directory signature not found");
            } else {
                StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
                sb.append(randomAccessFile.length());
                zipException = new ZipException(sb.toString());
            }
            throw zipException;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void A01(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public final List A02() {
        AnonymousClass00L r3;
        boolean z2;
        IOException th;
        ZipOutputStream zipOutputStream;
        StringBuilder sb = new StringBuilder();
        File file = this.A02;
        sb.append(file.getName());
        sb.append(".classes");
        String obj = sb.toString();
        File file2 = this.A01;
        File file3 = file2;
        File[] listFiles = file2.listFiles(new C09130ex(this));
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder("Failed to list secondary dex dir content (");
            sb2.append(file3.getPath());
            sb2.append(").");
            Log.w("MultiDex", sb2.toString());
        } else {
            for (File file4 : listFiles) {
                StringBuilder sb3 = new StringBuilder("Trying to delete old file ");
                sb3.append(file4.getPath());
                sb3.append(" of size ");
                sb3.append(file4.length());
                Log.i("MultiDex", sb3.toString());
                if (!file4.delete()) {
                    StringBuilder sb4 = new StringBuilder("Failed to delete old file ");
                    sb4.append(file4.getPath());
                    Log.w("MultiDex", sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder("Deleted old file ");
                    sb5.append(file4.getPath());
                    Log.i("MultiDex", sb5.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("classes");
            sb6.append(2);
            sb6.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb6.toString());
            int i2 = 2;
            while (entry != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj);
                sb7.append(i2);
                sb7.append(".zip");
                r3 = new AnonymousClass00L(file3, sb7.toString());
                arrayList.add(r3);
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Extraction is needed for file ");
                sb8.append(r3);
                Log.i("MultiDex", sb8.toString());
                int i3 = 0;
                z2 = false;
                while (i3 < 3 && !z2) {
                    i3++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    StringBuilder sb9 = new StringBuilder("tmp-");
                    sb9.append(obj);
                    File createTempFile = File.createTempFile(sb9.toString(), ".zip", r3.getParentFile());
                    StringBuilder sb10 = new StringBuilder("Extracting ");
                    sb10.append(createTempFile.getPath());
                    Log.i("MultiDex", sb10.toString());
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        ZipEntry zipEntry = new ZipEntry("classes.dex");
                        zipEntry.setTime(entry.getTime());
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bArr = new byte[16384];
                        for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        zipOutputStream.close();
                        if (createTempFile.setReadOnly()) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("Renaming to ");
                            sb11.append(r3.getPath());
                            Log.i("MultiDex", sb11.toString());
                            if (createTempFile.renameTo(r3)) {
                                A01(inputStream);
                                createTempFile.delete();
                                r3.crc = A00(r3);
                                z2 = true;
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append("Extraction ");
                                sb12.append(z2 ? "succeeded" : "failed");
                                sb12.append(" '");
                                sb12.append(r3.getAbsolutePath());
                                sb12.append("': length ");
                                sb12.append(r3.length());
                                sb12.append(" - crc: ");
                                sb12.append(r3.crc);
                                Log.i("MultiDex", sb12.toString());
                                if (!z2) {
                                    r3.delete();
                                    if (r3.exists()) {
                                        StringBuilder sb13 = new StringBuilder();
                                        sb13.append("Failed to delete corrupted secondary dex '");
                                        sb13.append(r3.getPath());
                                        sb13.append("'");
                                        Log.w("MultiDex", sb13.toString());
                                    }
                                }
                            } else {
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append("Failed to rename \"");
                                sb14.append(createTempFile.getAbsolutePath());
                                sb14.append("\" to \"");
                                sb14.append(r3.getAbsolutePath());
                                sb14.append("\"");
                                th = new IOException(sb14.toString());
                            }
                        } else {
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("Failed to mark readonly \"");
                            sb15.append(createTempFile.getAbsolutePath());
                            sb15.append("\" (tmp of \"");
                            sb15.append(r3.getAbsolutePath());
                            sb15.append("\")");
                            th = new IOException(sb15.toString());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A01(inputStream);
                        createTempFile.delete();
                    }
                    throw th;
                }
                if (z2) {
                    i2++;
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("classes");
                    sb16.append(i2);
                    sb16.append(".dex");
                    entry = zipFile.getEntry(sb16.toString());
                } else {
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append("Could not create zip file ");
                    sb17.append(r3.getAbsolutePath());
                    sb17.append(" for secondary dex (");
                    sb17.append(i2);
                    sb17.append(")");
                    th = new IOException(sb17.toString());
                    throw th;
                }
            }
            try {
                zipFile.close();
                return arrayList;
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
                return arrayList;
            }
        } catch (IOException e3) {
            StringBuilder sb18 = new StringBuilder();
            sb18.append("Failed to read crc from ");
            sb18.append(r3.getAbsolutePath());
            Log.w("MultiDex", sb18.toString(), e3);
            z2 = false;
        } catch (Throwable th3) {
            try {
                zipFile.close();
                throw th3;
            } catch (IOException e4) {
                Log.w("MultiDex", "Failed to close resource", e4);
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008b, code lost:
        if (r6.getLong(r3.toString(), -1) != r18) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A03(android.content.Context r23, boolean r24) {
        /*
            r22 = this;
            java.lang.String r11 = ""
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r10 = r22
            java.io.File r0 = r10.A02
            r20 = r0
            java.lang.String r0 = r20.getPath()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r5 = r24
            r1.append(r5)
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r9 = "MultiDex"
            android.util.Log.i(r9, r0)
            java.nio.channels.FileLock r0 = r10.A05
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x028a
            r21 = r23
            if (r24 != 0) goto L_0x01b3
            long r0 = r10.A00
            r18 = r0
            r1 = 4
            java.lang.String r4 = "multidex.version"
            r0 = r21
            android.content.SharedPreferences r6 = r0.getSharedPreferences(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "timestamp"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r0 = -1
            long r12 = r6.getLong(r2, r0)
            long r7 = r20.lastModified()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x006f
            r2 = 1
            long r7 = r7 - r2
        L_0x006f:
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x008d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r2 = "crc"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            long r2 = r6.getLong(r2, r0)
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "loading existing secondary dex files"
            android.util.Log.i(r9, r0)     // Catch:{ IOException -> 0x019b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r1.<init>()     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = r20.getName()     // Catch:{ IOException -> 0x019b }
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = ".classes"
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r17 = r1.toString()     // Catch:{ IOException -> 0x019b }
            r1 = 4
            r0 = r21
            android.content.SharedPreferences r12 = r0.getSharedPreferences(r4, r1)     // Catch:{ IOException -> 0x019b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r1.<init>()     // Catch:{ IOException -> 0x019b }
            r1.append(r11)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = "dex.number"
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x019b }
            r0 = 1
            int r15 = r12.getInt(r1, r0)     // Catch:{ IOException -> 0x019b }
            int r0 = r15 + -1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IOException -> 0x019b }
            r8.<init>(r0)     // Catch:{ IOException -> 0x019b }
            r7 = 2
        L_0x00cf:
            if (r7 > r15) goto L_0x026f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r1.<init>()     // Catch:{ IOException -> 0x019b }
            r0 = r17
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            r1.append(r7)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = ".zip"
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x019b }
            java.io.File r0 = r10.A01     // Catch:{ IOException -> 0x019b }
            X.00L r6 = new X.00L     // Catch:{ IOException -> 0x019b }
            r6.<init>(r0, r1)     // Catch:{ IOException -> 0x019b }
            boolean r0 = r6.isFile()     // Catch:{ IOException -> 0x019b }
            if (r0 == 0) goto L_0x017e
            long r0 = A00(r6)     // Catch:{ IOException -> 0x019b }
            r6.crc = r0     // Catch:{ IOException -> 0x019b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r1.<init>()     // Catch:{ IOException -> 0x019b }
            r1.append(r11)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = "dex.crc."
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            r1.append(r7)     // Catch:{ IOException -> 0x019b }
            java.lang.String r2 = r1.toString()     // Catch:{ IOException -> 0x019b }
            r0 = -1
            long r4 = r12.getLong(r2, r0)     // Catch:{ IOException -> 0x019b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r3.<init>()     // Catch:{ IOException -> 0x019b }
            r3.append(r11)     // Catch:{ IOException -> 0x019b }
            java.lang.String r2 = "dex.time."
            r3.append(r2)     // Catch:{ IOException -> 0x019b }
            r3.append(r7)     // Catch:{ IOException -> 0x019b }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x019b }
            long r2 = r12.getLong(r2, r0)     // Catch:{ IOException -> 0x019b }
            long r0 = r6.lastModified()     // Catch:{ IOException -> 0x019b }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0140
            long r13 = r6.crc     // Catch:{ IOException -> 0x019b }
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x0140
            r8.add(r6)     // Catch:{ IOException -> 0x019b }
            int r7 = r7 + 1
            goto L_0x00cf
        L_0x0140:
            java.lang.String r8 = "Invalid extracted dex: "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r7.<init>(r8)     // Catch:{ IOException -> 0x019b }
            r7.append(r6)     // Catch:{ IOException -> 0x019b }
            java.lang.String r8 = " (key \""
            r7.append(r8)     // Catch:{ IOException -> 0x019b }
            r7.append(r11)     // Catch:{ IOException -> 0x019b }
            java.lang.String r8 = "\"), expected modification time: "
            r7.append(r8)     // Catch:{ IOException -> 0x019b }
            r7.append(r2)     // Catch:{ IOException -> 0x019b }
            java.lang.String r2 = ", modification time: "
            r7.append(r2)     // Catch:{ IOException -> 0x019b }
            r7.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = ", expected crc: "
            r7.append(r0)     // Catch:{ IOException -> 0x019b }
            r7.append(r4)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = ", file crc: "
            r7.append(r0)     // Catch:{ IOException -> 0x019b }
            long r0 = r6.crc     // Catch:{ IOException -> 0x019b }
            r7.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = r7.toString()     // Catch:{ IOException -> 0x019b }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x019b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x019b }
            goto L_0x019a
        L_0x017e:
            java.lang.String r0 = "Missing extracted secondary dex file '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = r6.getPath()     // Catch:{ IOException -> 0x019b }
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = "'"
            r1.append(r0)     // Catch:{ IOException -> 0x019b }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x019b }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x019b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x019b }
        L_0x019a:
            throw r1     // Catch:{ IOException -> 0x019b }
        L_0x019b:
            r1 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r9, r0, r1)
            java.util.List r8 = r10.A02()
            long r0 = r20.lastModified()
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01cf
            r2 = 1
            long r0 = r0 - r2
            goto L_0x01cf
        L_0x01b3:
            if (r24 == 0) goto L_0x0268
            java.lang.String r0 = "Forced extraction must be performed."
        L_0x01b7:
            android.util.Log.i(r9, r0)
            java.util.List r8 = r10.A02()
            long r0 = r20.lastModified()
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01cb
            r2 = 1
            long r0 = r0 - r2
        L_0x01cb:
            long r2 = r10.A00
            r18 = r2
        L_0x01cf:
            r4 = 4
            java.lang.String r3 = "multidex.version"
            r2 = r21
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r2 = "timestamp"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.putLong(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "crc"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r0 = r18
            r3.putLong(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "dex.number"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            int r0 = r8.size()
            int r0 = r0 + 1
            r3.putInt(r1, r0)
            java.util.Iterator r6 = r8.iterator()
            r5 = 2
        L_0x0225:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x026c
            java.lang.Object r4 = r6.next()
            X.00L r4 = (X.AnonymousClass00L) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "dex.crc."
            r1.append(r0)
            r1.append(r5)
            java.lang.String r2 = r1.toString()
            long r0 = r4.crc
            r3.putLong(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "dex.time."
            r1.append(r0)
            r1.append(r5)
            java.lang.String r2 = r1.toString()
            long r0 = r4.lastModified()
            r3.putLong(r2, r0)
            int r5 = r5 + 1
            goto L_0x0225
        L_0x0268:
            java.lang.String r0 = "Detected that extraction must be performed."
            goto L_0x01b7
        L_0x026c:
            r3.commit()
        L_0x026f:
            java.lang.String r0 = "load found "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = " secondary dex files"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r9, r0)
            return r8
        L_0x028a:
            java.lang.String r1 = "MultiDexExtractor was closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00J.A03(android.content.Context, boolean):java.util.List");
    }

    public void close() {
        this.A05.release();
        this.A04.close();
        this.A03.close();
    }
}
