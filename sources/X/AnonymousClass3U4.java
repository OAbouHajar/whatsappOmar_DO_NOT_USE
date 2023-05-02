package X;

import java.util.zip.ZipEntry;

/* renamed from: X.3U4  reason: invalid class name */
public final class AnonymousClass3U4 extends C31531eL implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public AnonymousClass3U4(String str, ZipEntry zipEntry, int i2) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.A01 = zipEntry;
        this.A00 = i2;
    }

    public int compareTo(Object obj) {
        return this.A01.compareTo(((C31531eL) obj).A01);
    }
}
