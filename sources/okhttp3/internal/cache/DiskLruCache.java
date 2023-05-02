package okhttp3.internal.cache;

import e.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;
import s.b;
import s.c;
import s.d;
import s.e;

/* compiled from: XFMFile */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f2127u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a  reason: collision with root package name */
    public final FileSystem f2128a;

    /* renamed from: b  reason: collision with root package name */
    public final File f2129b;

    /* renamed from: c  reason: collision with root package name */
    public final File f2130c;

    /* renamed from: d  reason: collision with root package name */
    public final File f2131d;

    /* renamed from: e  reason: collision with root package name */
    public final File f2132e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2133f;

    /* renamed from: g  reason: collision with root package name */
    public long f2134g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2135h;

    /* renamed from: i  reason: collision with root package name */
    public long f2136i = 0;

    /* renamed from: j  reason: collision with root package name */
    public BufferedSink f2137j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f2138k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    public int f2139l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2140m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2141n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2142o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2143p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2144q;

    /* renamed from: r  reason: collision with root package name */
    public long f2145r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final Executor f2146s;

    /* renamed from: t  reason: collision with root package name */
    public final g f2147t = new g(this, 4);

    /* compiled from: XFMFile */
    public final class Editor {

        /* renamed from: a  reason: collision with root package name */
        public final e f2148a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f2149b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2150c;

        public Editor(e eVar) {
            this.f2148a = eVar;
            this.f2149b = eVar.f2665e ? null : new boolean[DiskLruCache.this.f2135h];
        }

        public final void a() {
            e eVar = this.f2148a;
            if (eVar.f2666f == this) {
                int i2 = 0;
                while (true) {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (i2 < diskLruCache.f2135h) {
                        try {
                            diskLruCache.f2128a.delete(eVar.f2664d[i2]);
                        } catch (IOException unused) {
                        }
                        i2++;
                    } else {
                        eVar.f2666f = null;
                        return;
                    }
                }
            }
        }

        public void abort() {
            synchronized (DiskLruCache.this) {
                if (!this.f2150c) {
                    if (this.f2148a.f2666f == this) {
                        DiskLruCache.this.b(this, false);
                    }
                    this.f2150c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void abortUnlessCommitted() {
            /*
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r3.f2150c     // Catch:{ all -> 0x0015 }
                if (r1 != 0) goto L_0x0013
                s.e r1 = r3.f2148a     // Catch:{ all -> 0x0015 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.f2666f     // Catch:{ all -> 0x0015 }
                if (r1 != r3) goto L_0x0013
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x0013 }
                r2 = 0
                r1.b(r3, r2)     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.abortUnlessCommitted():void");
        }

        public void commit() {
            synchronized (DiskLruCache.this) {
                if (!this.f2150c) {
                    if (this.f2148a.f2666f == this) {
                        DiskLruCache.this.b(this, true);
                    }
                    this.f2150c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public Sink newSink(int i2) {
            synchronized (DiskLruCache.this) {
                if (!this.f2150c) {
                    e eVar = this.f2148a;
                    if (eVar.f2666f != this) {
                        Sink blackhole = Okio.blackhole();
                        return blackhole;
                    }
                    if (!eVar.f2665e) {
                        this.f2149b[i2] = true;
                    }
                    try {
                        d dVar = new d(this, DiskLruCache.this.f2128a.sink(eVar.f2664d[i2]));
                        return dVar;
                    } catch (FileNotFoundException unused) {
                        return Okio.blackhole();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public okio.Source newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r4.f2150c     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0025
                s.e r1 = r4.f2148a     // Catch:{ all -> 0x002b }
                boolean r2 = r1.f2665e     // Catch:{ all -> 0x002b }
                r3 = 0
                if (r2 == 0) goto L_0x0023
                okhttp3.internal.cache.DiskLruCache$Editor r2 = r1.f2666f     // Catch:{ all -> 0x002b }
                if (r2 == r4) goto L_0x0013
                goto L_0x0023
            L_0x0013:
                okhttp3.internal.cache.DiskLruCache r2 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ FileNotFoundException -> 0x0021 }
                okhttp3.internal.io.FileSystem r2 = r2.f2128a     // Catch:{ FileNotFoundException -> 0x0021 }
                java.io.File[] r1 = r1.f2663c     // Catch:{ FileNotFoundException -> 0x0021 }
                r5 = r1[r5]     // Catch:{ FileNotFoundException -> 0x0021 }
                okio.Source r5 = r2.source(r5)     // Catch:{ FileNotFoundException -> 0x0021 }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r5
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r3
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r3
            L_0x0025:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002b }
                r5.<init>()     // Catch:{ all -> 0x002b }
                throw r5     // Catch:{ all -> 0x002b }
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):okio.Source");
        }
    }

    /* compiled from: XFMFile */
    public final class Snapshot implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final String f2152a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2153b;

        /* renamed from: c  reason: collision with root package name */
        public final Source[] f2154c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f2155d;

        public Snapshot(String str, long j2, Source[] sourceArr, long[] jArr) {
            this.f2152a = str;
            this.f2153b = j2;
            this.f2154c = sourceArr;
            this.f2155d = jArr;
        }

        public void close() {
            for (Source closeQuietly : this.f2154c) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        @Nullable
        public Editor edit() {
            String str = this.f2152a;
            return DiskLruCache.this.c(this.f2153b, str);
        }

        public long getLength(int i2) {
            return this.f2155d[i2];
        }

        public Source getSource(int i2) {
            return this.f2154c[i2];
        }

        public String key() {
            return this.f2152a;
        }
    }

    public DiskLruCache(FileSystem fileSystem, File file, int i2, int i3, long j2, ThreadPoolExecutor threadPoolExecutor) {
        this.f2128a = fileSystem;
        this.f2129b = file;
        this.f2133f = i2;
        this.f2130c = new File(file, "journal");
        this.f2131d = new File(file, "journal.tmp");
        this.f2132e = new File(file, "journal.bkp");
        this.f2135h = i3;
        this.f2134g = j2;
        this.f2146s = threadPoolExecutor;
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new DiskLruCache(fileSystem, file, i2, i3, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static void k(String str) {
        if (!f2127u.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            s.e r0 = r10.f2148a     // Catch:{ all -> 0x010a }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.f2666f     // Catch:{ all -> 0x010a }
            if (r1 != r10) goto L_0x0104
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f2665e     // Catch:{ all -> 0x010a }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f2135h     // Catch:{ all -> 0x010a }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f2149b     // Catch:{ all -> 0x010a }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010a }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.io.FileSystem r3 = r9.f2128a     // Catch:{ all -> 0x010a }
            java.io.File[] r4 = r0.f2664d     // Catch:{ all -> 0x010a }
            r4 = r4[r2]     // Catch:{ all -> 0x010a }
            boolean r3 = r3.exists(r4)     // Catch:{ all -> 0x010a }
            if (r3 != 0) goto L_0x002a
            r10.abort()     // Catch:{ all -> 0x010a }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.abort()     // Catch:{ all -> 0x010a }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r11.<init>()     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010a }
            r11.append(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010a }
            r10.<init>(r11)     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x0047:
            r10 = 0
        L_0x0048:
            int r2 = r9.f2135h     // Catch:{ all -> 0x010a }
            if (r10 >= r2) goto L_0x0080
            java.io.File[] r2 = r0.f2664d     // Catch:{ all -> 0x010a }
            r2 = r2[r10]     // Catch:{ all -> 0x010a }
            if (r11 == 0) goto L_0x0078
            okhttp3.internal.io.FileSystem r3 = r9.f2128a     // Catch:{ all -> 0x010a }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x010a }
            if (r3 == 0) goto L_0x007d
            java.io.File[] r3 = r0.f2663c     // Catch:{ all -> 0x010a }
            r3 = r3[r10]     // Catch:{ all -> 0x010a }
            okhttp3.internal.io.FileSystem r4 = r9.f2128a     // Catch:{ all -> 0x010a }
            r4.rename(r2, r3)     // Catch:{ all -> 0x010a }
            long[] r2 = r0.f2662b     // Catch:{ all -> 0x010a }
            r4 = r2[r10]     // Catch:{ all -> 0x010a }
            okhttp3.internal.io.FileSystem r2 = r9.f2128a     // Catch:{ all -> 0x010a }
            long r2 = r2.size(r3)     // Catch:{ all -> 0x010a }
            long[] r6 = r0.f2662b     // Catch:{ all -> 0x010a }
            r6[r10] = r2     // Catch:{ all -> 0x010a }
            long r6 = r9.f2136i     // Catch:{ all -> 0x010a }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r9.f2136i = r6     // Catch:{ all -> 0x010a }
            goto L_0x007d
        L_0x0078:
            okhttp3.internal.io.FileSystem r3 = r9.f2128a     // Catch:{ all -> 0x010a }
            r3.delete(r2)     // Catch:{ all -> 0x010a }
        L_0x007d:
            int r10 = r10 + 1
            goto L_0x0048
        L_0x0080:
            int r10 = r9.f2139l     // Catch:{ all -> 0x010a }
            r2 = 1
            int r10 = r10 + r2
            r9.f2139l = r10     // Catch:{ all -> 0x010a }
            r10 = 0
            r0.f2666f = r10     // Catch:{ all -> 0x010a }
            boolean r10 = r0.f2665e     // Catch:{ all -> 0x010a }
            r10 = r10 | r11
            r3 = 32
            r4 = 10
            if (r10 == 0) goto L_0x00ca
            r0.f2665e = r2     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            java.lang.String r2 = "CLEAN"
            okio.BufferedSink r10 = r10.writeUtf8(r2)     // Catch:{ all -> 0x010a }
            r10.writeByte(r3)     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            java.lang.String r2 = r0.f2661a     // Catch:{ all -> 0x010a }
            r10.writeUtf8(r2)     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            long[] r2 = r0.f2662b     // Catch:{ all -> 0x010a }
            int r5 = r2.length     // Catch:{ all -> 0x010a }
        L_0x00ab:
            if (r1 >= r5) goto L_0x00b9
            r6 = r2[r1]     // Catch:{ all -> 0x010a }
            okio.BufferedSink r8 = r10.writeByte(r3)     // Catch:{ all -> 0x010a }
            r8.writeDecimalLong(r6)     // Catch:{ all -> 0x010a }
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00b9:
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            r10.writeByte(r4)     // Catch:{ all -> 0x010a }
            if (r11 == 0) goto L_0x00e8
            long r10 = r9.f2145r     // Catch:{ all -> 0x010a }
            r1 = 1
            long r1 = r1 + r10
            r9.f2145r = r1     // Catch:{ all -> 0x010a }
            r0.f2667g = r10     // Catch:{ all -> 0x010a }
            goto L_0x00e8
        L_0x00ca:
            java.util.LinkedHashMap r10 = r9.f2138k     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r0.f2661a     // Catch:{ all -> 0x010a }
            r10.remove(r11)     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            java.lang.String r11 = "REMOVE"
            okio.BufferedSink r10 = r10.writeUtf8(r11)     // Catch:{ all -> 0x010a }
            r10.writeByte(r3)     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r0.f2661a     // Catch:{ all -> 0x010a }
            r10.writeUtf8(r11)     // Catch:{ all -> 0x010a }
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            r10.writeByte(r4)     // Catch:{ all -> 0x010a }
        L_0x00e8:
            okio.BufferedSink r10 = r9.f2137j     // Catch:{ all -> 0x010a }
            r10.flush()     // Catch:{ all -> 0x010a }
            long r10 = r9.f2136i     // Catch:{ all -> 0x010a }
            long r0 = r9.f2134g     // Catch:{ all -> 0x010a }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00fb
            boolean r10 = r9.d()     // Catch:{ all -> 0x010a }
            if (r10 == 0) goto L_0x0102
        L_0x00fb:
            java.util.concurrent.Executor r10 = r9.f2146s     // Catch:{ all -> 0x010a }
            e.g r11 = r9.f2147t     // Catch:{ all -> 0x010a }
            r10.execute(r11)     // Catch:{ all -> 0x010a }
        L_0x0102:
            monitor-exit(r9)
            return
        L_0x0104:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010a }
            r10.<init>()     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x010a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.b(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor c(long r6, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0074 }
            r5.a()     // Catch:{ all -> 0x0074 }
            k(r8)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap r0 = r5.f2138k     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0074 }
            s.e r0 = (s.e) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f2667g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.internal.cache.DiskLruCache$Editor r6 = r0.f2666f     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r6 = r5.f2143p     // Catch:{ all -> 0x0074 }
            if (r6 != 0) goto L_0x006b
            boolean r6 = r5.f2144q     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            okio.BufferedSink r6 = r5.f2137j     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = "DIRTY"
            okio.BufferedSink r6 = r6.writeUtf8(r7)     // Catch:{ all -> 0x0074 }
            r7 = 32
            okio.BufferedSink r6 = r6.writeByte(r7)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r6 = r6.writeUtf8(r8)     // Catch:{ all -> 0x0074 }
            r7 = 10
            r6.writeByte(r7)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r6 = r5.f2137j     // Catch:{ all -> 0x0074 }
            r6.flush()     // Catch:{ all -> 0x0074 }
            boolean r6 = r5.f2140m     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            s.e r0 = new s.e     // Catch:{ all -> 0x0074 }
            r0.<init>(r5, r8)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap r6 = r5.f2138k     // Catch:{ all -> 0x0074 }
            r6.put(r8, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f2666f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f2146s     // Catch:{ all -> 0x0074 }
            e.g r7 = r5.f2147t     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.c(long, java.lang.String):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public synchronized void close() {
        if (this.f2141n) {
            if (!this.f2142o) {
                for (e eVar : (e[]) this.f2138k.values().toArray(new e[this.f2138k.size()])) {
                    Editor editor = eVar.f2666f;
                    if (editor != null) {
                        editor.abort();
                    }
                }
                j();
                this.f2137j.close();
                this.f2137j = null;
                this.f2142o = true;
                return;
            }
        }
        this.f2142o = true;
    }

    public final boolean d() {
        int i2 = this.f2139l;
        return i2 >= 2000 && i2 >= this.f2138k.size();
    }

    public void delete() {
        close();
        this.f2128a.deleteContents(this.f2129b);
    }

    public final void e() {
        File file = this.f2131d;
        FileSystem fileSystem = this.f2128a;
        fileSystem.delete(file);
        Iterator it = this.f2138k.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Editor editor = eVar.f2666f;
            int i2 = this.f2135h;
            int i3 = 0;
            if (editor == null) {
                while (i3 < i2) {
                    this.f2136i += eVar.f2662b[i3];
                    i3++;
                }
            } else {
                eVar.f2666f = null;
                while (i3 < i2) {
                    fileSystem.delete(eVar.f2663c[i3]);
                    fileSystem.delete(eVar.f2664d[i3]);
                    i3++;
                }
                it.remove();
            }
        }
    }

    @Nullable
    public Editor edit(String str) {
        return c(-1, str);
    }

    public synchronized void evictAll() {
        initialize();
        for (e i2 : (e[]) this.f2138k.values().toArray(new e[this.f2138k.size()])) {
            i(i2);
        }
        this.f2143p = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r11.f2139l = r0 - r11.f2138k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r4.exhausted() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r11.f2137j = okio.Okio.buffer((okio.Sink) new s.b(r11, r3.appendingSink(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0085=Splitter:B:23:0x0085, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            java.io.File r2 = r11.f2130c
            okhttp3.internal.io.FileSystem r3 = r11.f2128a
            okio.Source r4 = r3.source(r2)
            okio.BufferedSource r4 = okio.Okio.buffer((okio.Source) r4)
            java.lang.String r5 = r4.readUtf8LineStrict()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = r4.readUtf8LineStrict()     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = r4.readUtf8LineStrict()     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r4.readUtf8LineStrict()     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = r10.equals(r5)     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x0085
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r6)     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x0085
            int r10 = r11.f2133f     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x00ae }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x0085
            int r7 = r11.f2135h     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ae }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x0085
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x0085
            r0 = 0
        L_0x0055:
            java.lang.String r1 = r4.readUtf8LineStrict()     // Catch:{ EOFException -> 0x005f }
            r11.g(r1)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap r1 = r11.f2138k     // Catch:{ all -> 0x00ae }
            int r1 = r1.size()     // Catch:{ all -> 0x00ae }
            int r0 = r0 - r1
            r11.f2139l = r0     // Catch:{ all -> 0x00ae }
            boolean r0 = r4.exhausted()     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x0072
            r11.h()     // Catch:{ all -> 0x00ae }
            goto L_0x0081
        L_0x0072:
            okio.Sink r0 = r3.appendingSink(r2)     // Catch:{ all -> 0x00ae }
            s.b r1 = new s.b     // Catch:{ all -> 0x00ae }
            r1.<init>(r11, r0)     // Catch:{ all -> 0x00ae }
            okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r1)     // Catch:{ all -> 0x00ae }
            r11.f2137j = r0     // Catch:{ all -> 0x00ae }
        L_0x0081:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r4)
            return
        L_0x0085:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r3.<init>(r1)     // Catch:{ all -> 0x00ae }
            r3.append(r5)     // Catch:{ all -> 0x00ae }
            r3.append(r0)     // Catch:{ all -> 0x00ae }
            r3.append(r6)     // Catch:{ all -> 0x00ae }
            r3.append(r0)     // Catch:{ all -> 0x00ae }
            r3.append(r8)     // Catch:{ all -> 0x00ae }
            r3.append(r0)     // Catch:{ all -> 0x00ae }
            r3.append(r9)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ae }
            r2.<init>(r0)     // Catch:{ all -> 0x00ae }
            throw r2     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.f():void");
    }

    public synchronized void flush() {
        if (this.f2141n) {
            a();
            j();
            this.f2137j.flush();
        }
    }

    public final void g(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            LinkedHashMap linkedHashMap = this.f2138k;
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            e eVar = (e) linkedHashMap.get(str2);
            if (eVar == null) {
                eVar = new e(this, str2);
                linkedHashMap.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.f2665e = true;
                eVar.f2666f = null;
                if (split.length == eVar.f2668h.f2135h) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            eVar.f2662b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f2666f = new Editor(eVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.initialize()     // Catch:{ all -> 0x0050 }
            r3.a()     // Catch:{ all -> 0x0050 }
            k(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap r0 = r3.f2138k     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            s.e r0 = (s.e) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f2665e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f2139l     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f2139l = r1     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r1 = r3.f2137j     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r4 = r1.writeUtf8(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.d()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f2146s     // Catch:{ all -> 0x0050 }
            e.g r1 = r3.f2147t     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public File getDirectory() {
        return this.f2129b;
    }

    public synchronized long getMaxSize() {
        return this.f2134g;
    }

    public final synchronized void h() {
        BufferedSink bufferedSink = this.f2137j;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink buffer = Okio.buffer(this.f2128a.sink(this.f2131d));
        try {
            buffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
            buffer.writeUtf8("1").writeByte(10);
            buffer.writeDecimalLong((long) this.f2133f).writeByte(10);
            buffer.writeDecimalLong((long) this.f2135h).writeByte(10);
            buffer.writeByte(10);
            Iterator it = this.f2138k.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar.f2666f != null) {
                    buffer.writeUtf8("DIRTY").writeByte(32);
                    buffer.writeUtf8(eVar.f2661a);
                } else {
                    buffer.writeUtf8("CLEAN").writeByte(32);
                    buffer.writeUtf8(eVar.f2661a);
                    for (long writeDecimalLong : eVar.f2662b) {
                        buffer.writeByte(32).writeDecimalLong(writeDecimalLong);
                    }
                }
                buffer.writeByte(10);
            }
            buffer.close();
            if (this.f2128a.exists(this.f2130c)) {
                this.f2128a.rename(this.f2130c, this.f2132e);
            }
            this.f2128a.rename(this.f2131d, this.f2130c);
            this.f2128a.delete(this.f2132e);
            this.f2137j = Okio.buffer((Sink) new b(this, this.f2128a.appendingSink(this.f2130c)));
            this.f2140m = false;
            this.f2144q = false;
        } finally {
            buffer.close();
        }
    }

    public final void i(e eVar) {
        Editor editor = eVar.f2666f;
        if (editor != null) {
            editor.a();
        }
        for (int i2 = 0; i2 < this.f2135h; i2++) {
            this.f2128a.delete(eVar.f2663c[i2]);
            long j2 = this.f2136i;
            long[] jArr = eVar.f2662b;
            this.f2136i = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f2139l++;
        BufferedSink writeByte = this.f2137j.writeUtf8("REMOVE").writeByte(32);
        String str = eVar.f2661a;
        writeByte.writeUtf8(str).writeByte(10);
        this.f2138k.remove(str);
        if (d()) {
            this.f2146s.execute(this.f2147t);
        }
    }

    public synchronized void initialize() {
        if (!this.f2141n) {
            if (this.f2128a.exists(this.f2132e)) {
                if (this.f2128a.exists(this.f2130c)) {
                    this.f2128a.delete(this.f2132e);
                } else {
                    this.f2128a.rename(this.f2132e, this.f2130c);
                }
            }
            if (this.f2128a.exists(this.f2130c)) {
                try {
                    f();
                    e();
                    this.f2141n = true;
                    return;
                } catch (IOException e2) {
                    Platform platform = Platform.get();
                    platform.log(5, "DiskLruCache " + this.f2129b + " is corrupt: " + e2.getMessage() + ", removing", e2);
                    delete();
                    this.f2142o = false;
                } catch (Throwable th) {
                    this.f2142o = false;
                    throw th;
                }
            }
            h();
            this.f2141n = true;
        }
    }

    public synchronized boolean isClosed() {
        return this.f2142o;
    }

    public final void j() {
        while (this.f2136i > this.f2134g) {
            i((e) this.f2138k.values().iterator().next());
        }
        this.f2143p = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean remove(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0027 }
            r5.a()     // Catch:{ all -> 0x0027 }
            k(r6)     // Catch:{ all -> 0x0027 }
            java.util.LinkedHashMap r0 = r5.f2138k     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0027 }
            s.e r6 = (s.e) r6     // Catch:{ all -> 0x0027 }
            r0 = 0
            if (r6 != 0) goto L_0x0017
            monitor-exit(r5)
            return r0
        L_0x0017:
            r5.i(r6)     // Catch:{ all -> 0x0027 }
            long r1 = r5.f2136i     // Catch:{ all -> 0x0027 }
            long r3 = r5.f2134g     // Catch:{ all -> 0x0027 }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0024
            r5.f2143p = r0     // Catch:{ all -> 0x0027 }
        L_0x0024:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public synchronized void setMaxSize(long j2) {
        this.f2134g = j2;
        if (this.f2141n) {
            this.f2146s.execute(this.f2147t);
        }
    }

    public synchronized long size() {
        initialize();
        return this.f2136i;
    }

    public synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new c(this);
    }
}
