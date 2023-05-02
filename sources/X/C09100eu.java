package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.redex.IDxCallableShape147S0100000_I1;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0eu  reason: invalid class name and case insensitive filesystem */
public final class C09100eu implements Closeable {
    public static final OutputStream A0E = new AnonymousClass0JB();
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName(DefaultCrypto.UTF_8);
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public long A02 = 0;
    public long A03 = 0;
    public Writer A04;
    public final int A05;
    public final int A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final LinkedHashMap A0B = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0C = new IDxCallableShape147S0100000_I1(this, 4);
    public final ThreadPoolExecutor A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C09100eu(File file, long j2) {
        this.A07 = file;
        this.A05 = 2;
        this.A08 = new File(file, "journal");
        this.A0A = new File(file, "journal.tmp");
        this.A09 = new File(file, "journal.bkp");
        this.A06 = 1;
        this.A01 = j2;
    }

    public static /* synthetic */ void A00(C05220Pt r10, C09100eu r11, boolean z2) {
        IllegalStateException illegalStateException;
        synchronized (r11) {
            AnonymousClass0QY r5 = r10.A02;
            if (r5.A01 == r10) {
                if (z2 && !r5.A02) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < r11.A06) {
                            if (!r10.A03[i2]) {
                                r10.A00();
                                StringBuilder A0o = AnonymousClass000.A0o();
                                A0o.append("Newly created entry didn't create value for index ");
                                illegalStateException = AnonymousClass000.A0V(AnonymousClass000.A0l(A0o, i2));
                                break;
                            } else if (!r5.A01().exists()) {
                                r10.A00();
                                break;
                            } else {
                                i2 = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i3 = 0; i3 < r11.A06; i3 = 1) {
                    File A012 = r5.A01();
                    if (!z2) {
                        A03(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00();
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j2 = jArr[i3];
                        long length = A002.length();
                        jArr[i3] = length;
                        r11.A03 = (r11.A03 - j2) + length;
                    }
                }
                r11.A00++;
                r5.A01 = null;
                if (r5.A02 || z2) {
                    r5.A02 = true;
                    Writer writer = r11.A04;
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    A0o2.append("CLEAN ");
                    A0o2.append(r5.A03);
                    StringBuilder A0o3 = AnonymousClass000.A0o();
                    for (long append : r5.A04) {
                        A0o3.append(' ');
                        A0o3.append(append);
                    }
                    writer.write(AnonymousClass000.A0i(A0o3.toString(), A0o2, 10));
                    if (z2) {
                        long j3 = r11.A02;
                        r11.A02 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r11.A0B;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r11.A04;
                    StringBuilder A0o4 = AnonymousClass000.A0o();
                    A0o4.append("REMOVE ");
                    writer2.write(AnonymousClass000.A0i(str, A0o4, 10));
                }
                r11.A04.flush();
                if (r11.A03 > r11.A01 || r11.A08()) {
                    r11.A0D.submit(r11.A0C);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static void A01(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A02(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    throw new IOException(AnonymousClass000.A0g("failed to delete file: ", file2));
                }
            }
            return;
        }
        throw new IOException(AnonymousClass000.A0g("not a readable directory: ", file));
    }

    public static void A03(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A04(String str) {
        if (!A0H.matcher(str).matches()) {
            StringBuilder A0r = AnonymousClass000.A0r("keys must match regex [a-z0-9_-]{1,120}: \"");
            A0r.append(str);
            throw AnonymousClass000.A0T(AnonymousClass000.A0h("\"", A0r));
        }
    }

    public final void A05() {
        while (this.A03 > this.A01) {
            A07((String) AnonymousClass000.A0z(this.A0B.entrySet().iterator()).getKey());
        }
    }

    public final synchronized void A06() {
        Writer writer = this.A04;
        if (writer != null) {
            writer.close();
        }
        File file = this.A0A;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Charset charset = A0F;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write("1");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.A05));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.A06));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            for (AnonymousClass0QY r2 : this.A0B.values()) {
                if (r2.A01 != null) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("DIRTY ");
                    bufferedWriter.write(AnonymousClass000.A0i(r2.A03, A0o, 10));
                } else {
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    A0o2.append("CLEAN ");
                    A0o2.append(r2.A03);
                    StringBuilder A0o3 = AnonymousClass000.A0o();
                    for (long append : r2.A04) {
                        A0o3.append(' ');
                        A0o3.append(append);
                    }
                    bufferedWriter.write(AnonymousClass000.A0i(A0o3.toString(), A0o2, 10));
                }
            }
            bufferedWriter.close();
            File file2 = this.A08;
            if (file2.exists()) {
                File file3 = this.A09;
                A03(file3);
                if (!file2.renameTo(file3)) {
                    th = new IOException();
                    throw th;
                }
            }
            if (file.renameTo(file2)) {
                this.A09.delete();
                this.A04 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
            } else {
                th = new IOException();
                throw th;
            }
        } catch (Throwable th) {
            th = th;
            bufferedWriter.close();
        }
    }

    public synchronized void A07(String str) {
        if (this.A04 != null) {
            A04(str);
            LinkedHashMap linkedHashMap = this.A0B;
            AnonymousClass0QY r7 = (AnonymousClass0QY) linkedHashMap.get(str);
            int i2 = 0;
            if (r7 != null) {
                if (r7.A01 == null) {
                    while (i2 < this.A06) {
                        File A002 = r7.A00();
                        if (!A002.exists() || A002.delete()) {
                            long j2 = this.A03;
                            long[] jArr = r7.A04;
                            this.A03 = j2 - jArr[i2];
                            jArr[i2] = 0;
                            i2 = 1;
                        } else {
                            throw new IOException(AnonymousClass000.A0e(A002, "failed to delete ", AnonymousClass000.A0o()));
                        }
                    }
                    this.A00++;
                    Writer writer = this.A04;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("REMOVE ");
                    A0o.append(str);
                    A0o.append(10);
                    writer.append(A0o.toString());
                    linkedHashMap.remove(str);
                    if (A08()) {
                        this.A0D.submit(this.A0C);
                    }
                }
            }
        } else {
            throw AnonymousClass000.A0V("cache is closed");
        }
    }

    public final boolean A08() {
        int i2 = this.A00;
        return i2 >= 2000 && i2 >= this.A0B.size();
    }

    public synchronized void close() {
        if (this.A04 != null) {
            Iterator it = new ArrayList(this.A0B.values()).iterator();
            while (it.hasNext()) {
                C05220Pt r0 = ((AnonymousClass0QY) it.next()).A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
            A05();
            this.A04.close();
            this.A04 = null;
        }
    }
}
