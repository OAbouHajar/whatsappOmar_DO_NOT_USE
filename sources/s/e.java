package s;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okio.Source;
import org.apache.commons.io.FilenameUtils;

/* compiled from: XFMFile */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2661a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2662b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f2663c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f2664d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2665e;

    /* renamed from: f  reason: collision with root package name */
    public DiskLruCache.Editor f2666f;

    /* renamed from: g  reason: collision with root package name */
    public long f2667g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f2668h;

    public e(DiskLruCache diskLruCache, String str) {
        this.f2668h = diskLruCache;
        this.f2661a = str;
        int i2 = diskLruCache.f2135h;
        this.f2662b = new long[i2];
        this.f2663c = new File[i2];
        this.f2664d = new File[i2];
        StringBuilder sb = new StringBuilder(str);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        int length = sb.length();
        for (int i3 = 0; i3 < diskLruCache.f2135h; i3++) {
            sb.append(i3);
            File[] fileArr = this.f2663c;
            String sb2 = sb.toString();
            File file = diskLruCache.f2129b;
            fileArr[i3] = new File(file, sb2);
            sb.append(".tmp");
            this.f2664d[i3] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final DiskLruCache.Snapshot a() {
        Source source;
        DiskLruCache diskLruCache = this.f2668h;
        if (Thread.holdsLock(diskLruCache)) {
            Source[] sourceArr = new Source[diskLruCache.f2135h];
            long[] jArr = (long[]) this.f2662b.clone();
            int i2 = 0;
            int i3 = 0;
            while (i3 < diskLruCache.f2135h) {
                try {
                    sourceArr[i3] = diskLruCache.f2128a.source(this.f2663c[i3]);
                    i3++;
                } catch (FileNotFoundException unused) {
                    while (i2 < diskLruCache.f2135h && (source = sourceArr[i2]) != null) {
                        Util.closeQuietly((Closeable) source);
                        i2++;
                    }
                    try {
                        diskLruCache.i(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new DiskLruCache.Snapshot(this.f2661a, this.f2667g, sourceArr, jArr);
        }
        throw new AssertionError();
    }
}
