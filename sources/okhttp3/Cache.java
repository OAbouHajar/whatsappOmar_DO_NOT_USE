package okhttp3;

import com.google.gson.internal.bind.g;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSource;
import okio.ByteString;
import r.a;

/* compiled from: XFMFile */
public final class Cache implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public final g f1875a = new g(this);

    /* renamed from: b  reason: collision with root package name */
    public final DiskLruCache f1876b;

    /* renamed from: c  reason: collision with root package name */
    public int f1877c;

    /* renamed from: d  reason: collision with root package name */
    public int f1878d;

    /* renamed from: e  reason: collision with root package name */
    public int f1879e;

    /* renamed from: f  reason: collision with root package name */
    public int f1880f;

    /* renamed from: g  reason: collision with root package name */
    public int f1881g;

    public Cache(File file, long j2) {
        FileSystem fileSystem = FileSystem.SYSTEM;
        this.f1876b = DiskLruCache.create(fileSystem, file, 201105, 2, j2);
    }

    public static int a(BufferedSource bufferedSource) {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static String key(HttpUrl httpUrl) {
        return ByteString.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    public void close() {
        this.f1876b.close();
    }

    public void delete() {
        this.f1876b.delete();
    }

    public File directory() {
        return this.f1876b.getDirectory();
    }

    public void evictAll() {
        this.f1876b.evictAll();
    }

    public void flush() {
        this.f1876b.flush();
    }

    public synchronized int hitCount() {
        return this.f1880f;
    }

    public void initialize() {
        this.f1876b.initialize();
    }

    public boolean isClosed() {
        return this.f1876b.isClosed();
    }

    public long maxSize() {
        return this.f1876b.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.f1879e;
    }

    public synchronized int requestCount() {
        return this.f1881g;
    }

    public long size() {
        return this.f1876b.size();
    }

    public Iterator<String> urls() {
        return new a(this);
    }

    public synchronized int writeAbortCount() {
        return this.f1878d;
    }

    public synchronized int writeSuccessCount() {
        return this.f1877c;
    }
}
