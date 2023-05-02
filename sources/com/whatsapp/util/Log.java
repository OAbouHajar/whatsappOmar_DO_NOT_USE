package com.whatsapp.util;

import X.AnonymousClass00D;
import X.AnonymousClass02N;
import X.C003801r;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

public class Log {
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);
    public static final AnonymousClass00D LOGGER_THREAD;
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static FileChannel channel = null;
    public static final Object compressFileLock = new Object();
    public static C003801r connectivityInfoProvider = null;
    public static int level = 5;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static File logFile;
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static File logTempFile;
    public static final Object tempFileLock = new Object();
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);

    static {
        AnonymousClass00D r0 = new AnonymousClass00D();
        r0.start();
        LOGGER_THREAD = r0;
    }

    public static int A00(File file, File file2) {
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i2 = 0;
        for (File name2 : listFiles) {
            String name3 = name2.getName();
            if (name3.startsWith(name) && length2 < (length = name3.length())) {
                try {
                    int parseInt = Integer.parseInt(name3.substring(length2, length));
                    if (parseInt > i2) {
                        i2 = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return i2;
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void a(boolean z2) {
        if (!z2) {
            log("LL_A ", "Assertion Failed");
        }
    }

    public static String adorn(String str, StringBuilder sb) {
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        C003801r r0 = connectivityInfoProvider;
        sb3.append(r0 != null ? r0.A9a() : "D");
        sb3.append(" ");
        String obj = sb3.toString();
        if (level < 5) {
            int length = obj.length() + 20 + name.length() + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(length + sb.length());
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str2 = "";
        String str3 = str2;
        int i2 = 5;
        while (true) {
            if (i2 >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    str2 = stackTraceElement.getFileName();
                    str3 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                str3 = String.valueOf(stackTraceElement.getLineNumber());
                str2 = "(null)";
            } else if (i2 == 5) {
                str2 = stackTraceElement.getFileName();
                str3 = "native";
            }
            i2++;
        }
        StringBuilder sb4 = new StringBuilder(obj.length() + 1 + 20 + 1 + name.length() + 1 + str2.length() + 1 + str3.length() + 1 + sb.length());
        sb4.append(obj);
        sb4.append('[');
        sb4.append(id);
        sb4.append(':');
        sb4.append(name);
        sb4.append(']');
        sb4.append(str2);
        sb4.append(':');
        sb4.append(str3);
        sb4.append(' ');
        sb4.append(sb);
        return sb4.toString();
    }

    public static void blockingLog(int i2, String str) {
        if (i2 <= level) {
            String adorn = adorn(getLogPrefix(i2), new StringBuilder(str));
            logAdorned(adorn, true);
            if (level == 5) {
                logToLogcat(i2, adorn);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010b, code lost:
        if (r3.exists() == false) goto L_0x011e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0106 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0107 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compress() {
        /*
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.Object r16 = compressFileLock
            monitor-enter(r16)
            java.lang.Object r15 = tempFileLock     // Catch:{ all -> 0x014e }
            monitor-enter(r15)     // Catch:{ all -> 0x014e }
            r14 = 0
            java.io.File r0 = logFile     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r6 = logTempFile     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException | SecurityException -> 0x0144 }
            r5.<init>()     // Catch:{ IOException | SecurityException -> 0x0144 }
            int r4 = A00(r0, r6)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r3 = r0.getParent()     // Catch:{ IOException | SecurityException -> 0x0144 }
            r2 = 1
        L_0x001e:
            if (r2 > r4) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = r6.getName()     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.append(r2)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.<init>(r3, r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            boolean r0 = r1.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x0046
            r5.add(r1)     // Catch:{ IOException | SecurityException -> 0x0144 }
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0049:
            java.util.Iterator r13 = r5.iterator()     // Catch:{ IOException | SecurityException -> 0x0144 }
        L_0x004d:
            boolean r0 = r13.hasNext()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r5 = r13.next()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r2 = logFile     // Catch:{ IOException | SecurityException -> 0x0144 }
            boolean r0 = r5.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x0125
            java.util.Date r1 = new java.util.Date     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = ".gz"
            java.lang.String r3 = X.AnonymousClass02N.A00(r2, r0, r1)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r0 = r2.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0144 }
            r4.<init>(r0, r3)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r2 = r2.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0144 }
            r1.append(r3)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException | SecurityException -> 0x0144 }
            r3.<init>(r2, r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            r0 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0107, all -> 0x012b }
            r7.<init>(r3, r0)     // Catch:{ FileNotFoundException -> 0x0107, all -> 0x012b }
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0102 }
            r8.<init>(r7)     // Catch:{ all -> 0x0102 }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r9 = new byte[r10]     // Catch:{ all -> 0x00fd }
            long r11 = r4.length()     // Catch:{ all -> 0x00fd }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00fd }
            r1.<init>(r4)     // Catch:{ all -> 0x00fd }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00fd }
            r0.<init>(r1)     // Catch:{ all -> 0x00fd }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00fd }
            r6.<init>(r0)     // Catch:{ all -> 0x00fd }
            r2 = 0
            int r1 = r6.read(r9, r2, r10)     // Catch:{ all -> 0x00f8 }
        L_0x00bd:
            r0 = -1
            if (r1 == r0) goto L_0x00c8
            r8.write(r9, r2, r1)     // Catch:{ all -> 0x00f8 }
            int r1 = r6.read(r9, r2, r10)     // Catch:{ all -> 0x00f8 }
            goto L_0x00bd
        L_0x00c8:
            r6.close()     // Catch:{ all -> 0x00fd }
        L_0x00cb:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00fd }
            r0.<init>(r5)     // Catch:{ all -> 0x00fd }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00fd }
            r6.<init>(r0)     // Catch:{ all -> 0x00fd }
            r2 = 0
            int r1 = r6.read(r9, r2, r10)     // Catch:{ all -> 0x00f8 }
        L_0x00da:
            r0 = -1
            if (r1 == r0) goto L_0x00e5
            r8.write(r9, r2, r1)     // Catch:{ all -> 0x00f8 }
            int r1 = r6.read(r9, r2, r10)     // Catch:{ all -> 0x00f8 }
            goto L_0x00da
        L_0x00e5:
            r6.close()     // Catch:{ all -> 0x00fd }
            r8.close()     // Catch:{ all -> 0x0102 }
            r3.renameTo(r4)     // Catch:{ all -> 0x0102 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x0107, all -> 0x012b }
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x011e
            goto L_0x010d
        L_0x00f8:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0101 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0106 }
        L_0x0106:
            throw r0     // Catch:{ FileNotFoundException -> 0x0107, all -> 0x012b }
        L_0x0107:
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x011e
        L_0x010d:
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0144 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 != 0) goto L_0x011e
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0144 }
        L_0x011e:
            boolean r0 = r4.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            r14 = r4
            if (r0 != 0) goto L_0x0126
        L_0x0125:
            r14 = 0
        L_0x0126:
            r5.delete()     // Catch:{ IOException | SecurityException -> 0x0144 }
            goto L_0x004d
        L_0x012b:
            r2 = move-exception
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0144 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0144 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0144 }
            if (r0 != 0) goto L_0x0143
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0144 }
        L_0x0143:
            throw r2     // Catch:{ IOException | SecurityException -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            e((java.lang.Throwable) r0)     // Catch:{ all -> 0x014b }
        L_0x0148:
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            monitor-exit(r16)     // Catch:{ all -> 0x014e }
            return r14
        L_0x014b:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x014e:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x014e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void d(String str) {
        int i2 = level;
        if (i2 == 5) {
            logToLogcat(4, log("LL_D ", str));
        } else if (i2 >= 4) {
            log("LL_D ", str);
        }
    }

    public static void d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i2 = level;
        if (i2 == 5) {
            logToLogcat(4, log("LL_D ", obj, getStackTraceString(th)));
        } else if (i2 >= 4) {
            log("LL_D ", obj, getStackTraceString(th));
        }
    }

    public static void d(Throwable th) {
        int i2 = level;
        if (i2 == 5) {
            logToLogcat(4, log("LL_D ", getStackTraceString(th)));
        } else if (i2 >= 4) {
            log("LL_D ", getStackTraceString(th));
        }
    }

    public static void doLogToFile(String str) {
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        sb.append(instance.get(1));
        sb.append('-');
        if (instance.get(2) < 9) {
            sb.append('0');
        }
        sb.append(instance.get(2) + 1);
        sb.append('-');
        if (instance.get(5) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(5));
        sb.append(' ');
        if (instance.get(11) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(11));
        sb.append(':');
        if (instance.get(12) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(12));
        sb.append(':');
        if (instance.get(13) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(13));
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        if (instance.get(14) < 10) {
            sb.append("00");
        } else if (instance.get(14) < 100) {
            sb.append('0');
        }
        sb.append(instance.get(14));
        sb.append(' ');
        ReentrantLock reentrantLock = writeFileLock;
        reentrantLock.lock();
        try {
            if (initialize()) {
                FileChannel fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.position(fileChannel.size());
                    FileChannel fileChannel2 = channel;
                    CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                    ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                    encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, sb);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, str);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, IOUtils.LINE_SEPARATOR_UNIX);
                } else {
                    throw new NullPointerException();
                }
            }
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IOException on ");
            sb2.append(str);
            android.util.Log.e("OBWhatsApp", sb2.toString(), e2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        reentrantLock.unlock();
    }

    public static void doLogToLogcat(int i2, String str) {
        if (i2 == 0 || i2 == 5) {
            android.util.Log.v("OBWhatsApp", str);
        } else if (i2 == 4) {
            android.util.Log.d("OBWhatsApp", str);
        } else if (i2 == 3) {
            android.util.Log.i("OBWhatsApp", str);
        } else if (i2 == 2) {
            android.util.Log.w("OBWhatsApp", str);
        } else {
            android.util.Log.e("OBWhatsApp", str);
        }
    }

    public static void e(String str) {
        if (level == 5) {
            logToLogcat(1, log("LL_E ", str));
        } else {
            log("LL_E ", str);
        }
    }

    public static void e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(1, log("LL_E ", obj, stackTraceString));
        } else {
            log("LL_E ", obj, stackTraceString);
        }
    }

    public static void e(Throwable th) {
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(1, log("LL_E ", stackTraceString));
        } else {
            log("LL_E ", stackTraceString);
        }
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            AnonymousClass00D r4 = LOGGER_THREAD;
            if (Thread.currentThread() == r4) {
                int size = r4.A02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    r4.A00();
                }
            } else {
                FutureTask futureTask = new FutureTask(AnonymousClass00D.A05, (Object) null);
                r4.A01(futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            ReentrantLock reentrantLock = writeFileLock;
            reentrantLock.lock();
            FileChannel fileChannel = channel;
            if (fileChannel != null && fileChannel.isOpen()) {
                channel.force(true);
            }
            reentrantLock.unlock();
            blockingLog(5, "log/flush/end");
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("log/flush/failed");
            sb.append("; exception=");
            sb.append(e2);
            String obj = sb.toString();
            String stackTraceString = getStackTraceString(e2);
            StringBuilder sb2 = new StringBuilder(obj.length() + 1 + stackTraceString.length());
            sb2.append(obj);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb2.append(stackTraceString);
            String adorn = adorn("LL_E ", sb2);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        } catch (Throwable th) {
            writeFileLock.unlock();
            throw th;
        }
    }

    public static ArrayList getLatestLogs(int i2) {
        File file = logFile;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A02 = AnonymousClass02N.A02(file.getName(), ".gz");
        String A01 = AnonymousClass02N.A01(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A01) && name.endsWith(A02)) {
                    int length = A01.length();
                    try {
                        if ((date.getTime() - simpleDateFormat.parse(name.substring(length, pattern.length() + length)).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i2)) {
                            arrayList.add(file2);
                        }
                    } catch (ParseException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getLogPrefix(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "LL_V " : "LL_D " : "LL_I " : "LL_W " : "LL_E " : "LL_A ";
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceStartPhrase());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        sb.append("### end stack trace");
        return sb.toString();
    }

    public static void i(String str) {
        if (level == 5) {
            logToLogcat(3, log("LL_I ", str));
        } else {
            log("LL_I ", str);
        }
    }

    public static void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(3, log("LL_I ", obj, stackTraceString));
        } else {
            log("LL_I ", obj, stackTraceString);
        }
    }

    public static void i(Throwable th) {
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(3, log("LL_I ", stackTraceString));
        } else {
            log("LL_I ", stackTraceString);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean initialize() {
        /*
            java.nio.channels.FileChannel r0 = channel
            r3 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x000c
            return r3
        L_0x000c:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x002a
            java.util.concurrent.CountDownLatch r0 = logFileLatch
            long r4 = r0.getCount()
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002a
            java.lang.String r1 = "If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand."
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x002a:
            r6 = 0
            java.util.concurrent.CountDownLatch r0 = logFileLatch     // Catch:{ InterruptedException -> 0x00fa }
            r0.await()     // Catch:{ InterruptedException -> 0x00fa }
            java.util.concurrent.atomic.AtomicReference r0 = logDirRef
            java.lang.Object r1 = r0.get()
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x0046
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            java.io.File r1 = logFile     // Catch:{  }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{  }
            r0.<init>(r1, r3)     // Catch:{  }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{  }
            channel = r0     // Catch:{  }
            java.io.PrintStream r5 = java.lang.System.err
            java.io.PrintStream r0 = ORIGINAL_SYSTEM_ERR
            r4 = 0
            if (r5 == r0) goto L_0x005c
            r4 = 1
        L_0x005c:
            X.00I r2 = new X.00I
            r2.<init>(r0)
            java.nio.channels.FileChannel r0 = channel
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r0)
            X.00K r1 = new X.00K
            r1.<init>(r2, r0)
            java.io.PrintStream r0 = new java.io.PrintStream
            r0.<init>(r1, r3)
            java.lang.System.setErr(r0)
            if (r4 == 0) goto L_0x00f4
            r5.close()
        L_0x0079:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 15
            int r5 = r1.get(r0)
            r0 = 16
            int r0 = r1.get(r0)
            int r5 = r5 + r0
            r0 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 / r0
            int r1 = r5 / 60
            java.util.Locale r4 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 43
            if (r1 >= 0) goto L_0x009b
            r0 = 45
        L_0x009b:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r2[r6] = r0
            int r0 = java.lang.Math.abs(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            r1 = 2
            int r0 = r5 % 60
            int r0 = java.lang.Math.abs(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "%c%02d%02d"
            java.lang.String r2 = java.lang.String.format(r4, r0, r2)
            java.lang.String r0 = "==== logfile level="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = level
            r1.append(r0)
            java.lang.String r0 = " tz="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ===="
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "LL_I "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r0 = adorn(r1, r0)
            logAdorned(r0, r3)
            java.nio.channels.FileChannel r0 = channel
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x00f8
            return r3
        L_0x00f4:
            r5.flush()
            goto L_0x0079
        L_0x00f8:
            r3 = 0
            return r3
        L_0x00fa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.initialize():boolean");
    }

    public static String log(String str, String str2) {
        String adorn = adorn(str, new StringBuilder(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str3.length());
        sb.append(str2);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void log(int i2, String str) {
        if (i2 <= level) {
            String log = log(getLogPrefix(i2), str);
            if (level == 5) {
                logToLogcat(i2, log);
            }
        }
    }

    public static String logAdorned(String str, boolean z2) {
        Thread currentThread;
        AnonymousClass00D r0;
        if (!z2 && (currentThread = Thread.currentThread()) != (r0 = LOGGER_THREAD)) {
            if (currentThread == r0) {
                blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
            } else {
                r0.A01(str);
                return str;
            }
        }
        doLogToFile(str);
        return str;
    }

    public static void logToLogcat(int i2, String str) {
        int length = str.length();
        if (length > 4000) {
            StringBuilder sb = new StringBuilder(4006);
            int i3 = 0;
            while (length - i3 > 4000) {
                if (i3 > 0) {
                    sb.append("...");
                }
                sb.append(str.substring(i3, (i3 + 4000) - 3));
                sb.append("...");
                doLogToLogcat(i2, sb.toString());
                i3 += 3997;
                sb.setLength(0);
            }
            StringBuilder sb2 = new StringBuilder(4006);
            if (i3 > 0) {
                sb2.append("...");
            }
            sb2.append(str.substring(i3));
            str = sb2.toString();
        }
        doLogToLogcat(i2, str);
    }

    public static boolean rotate() {
        NullPointerException th;
        boolean z2;
        synchronized (tempFileLock) {
            ReentrantLock reentrantLock = writeFileLock;
            reentrantLock.lock();
            try {
                if (initialize()) {
                    FileChannel fileChannel = channel;
                    if (fileChannel != null) {
                        fileChannel.close();
                        channel = null;
                        File file = logFile;
                        File file2 = logTempFile;
                        if (file.exists()) {
                            int A00 = A00(file, file2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(file2.getPath());
                            sb.append(".");
                            sb.append(A00 + 1);
                            try {
                                z2 = file.renameTo(new File(sb.toString()));
                            } catch (SecurityException unused) {
                            }
                            initialize();
                            reentrantLock.unlock();
                            return z2;
                        }
                        z2 = false;
                        initialize();
                        reentrantLock.unlock();
                        return z2;
                    }
                    th = new NullPointerException();
                    throw th;
                }
            } catch (IOException unused2) {
                channel = null;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
            reentrantLock.unlock();
            return false;
        }
    }

    public static String stackTraceStartPhrase() {
        StringBuilder sb = new StringBuilder();
        sb.append("2.23.1.76");
        sb.append("(");
        sb.append(438774090);
        sb.append(")");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("### begin stack trace ");
        sb2.append(obj);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb2.toString();
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; exception=");
            sb.append(th);
            logToLogcat(5, log("LL_V ", sb.toString(), getStackTraceString(th)));
        }
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(String str) {
        if (level == 5) {
            logToLogcat(2, log("LL_W ", str));
        } else {
            log("LL_W ", str);
        }
    }

    public static void w(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(2, log("LL_W ", obj, stackTraceString));
        } else {
            log("LL_W ", obj, stackTraceString);
        }
    }

    public static void w(Throwable th) {
        int i2 = level;
        String stackTraceString = getStackTraceString(th);
        if (i2 == 5) {
            logToLogcat(2, log("LL_W ", stackTraceString));
        } else {
            log("LL_W ", stackTraceString);
        }
    }
}
