package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2BE  reason: invalid class name */
public abstract class AnonymousClass2BE implements AnonymousClass2BF {
    public Long A00;
    public final long A01;
    public final Uri A02;
    public final C16730tY A03;
    public final File A04;

    public AnonymousClass2BE(C16730tY r7, File file, long j2) {
        this(Uri.fromFile(file), r7, file, j2);
    }

    public AnonymousClass2BE(Uri uri, C16730tY r2, File file, long j2) {
        this.A04 = file;
        this.A02 = uri;
        this.A01 = j2;
        this.A03 = r2;
    }

    public final Uri A9L() {
        return this.A02;
    }

    public final long ABe() {
        return this.A01;
    }

    public /* synthetic */ long ABq() {
        return 0;
    }

    public final long getContentLength() {
        Long l2 = this.A00;
        if (l2 == null) {
            File file = this.A04;
            l2 = Long.valueOf(file != null ? file.length() : 0);
            this.A00 = l2;
        }
        return l2.longValue();
    }
}
