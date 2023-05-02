package com.google.android.exoplayer2.upstream;

import X.AnonymousClass000;
import X.AnonymousClass3AL;
import X.AnonymousClass3E3;
import X.AnonymousClass40J;
import X.C13680ns;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends AnonymousClass3E3 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final String A06;

    public RawResourceDataSource(Context context) {
        super(false);
        this.A05 = context.getResources();
        this.A06 = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse(C13680ns.A0c(i2, "rawresource:///"));
    }

    public Uri AGo() {
        return this.A02;
    }

    public long AZr(AnonymousClass3AL r10) {
        int i2;
        Uri uri = r10.A04;
        this.A02 = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && uri.getLastPathSegment().matches("\\d+"))) {
            try {
                i2 = Integer.parseInt(uri.getLastPathSegment());
            } catch (NumberFormatException unused) {
                throw new AnonymousClass40J("Resource identifier must be an integer.");
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String path = uri.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(TextUtils.isEmpty(host) ? "" : AnonymousClass000.A0h(":", AnonymousClass000.A0q(host)));
            i2 = this.A05.getIdentifier(AnonymousClass000.A0h(path, A0o), "raw", this.A06);
            if (i2 == 0) {
                throw new AnonymousClass40J("Resource not found.");
            }
        } else {
            throw new AnonymousClass40J("URI must either use scheme rawresource or android.resource");
        }
        A01();
        AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(i2);
        this.A01 = openRawResourceFd;
        if (openRawResourceFd != null) {
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.A03 = fileInputStream;
            try {
                fileInputStream.skip(openRawResourceFd.getStartOffset());
                long j2 = r10.A03;
                if (fileInputStream.skip(j2) >= j2) {
                    long j3 = r10.A02;
                    long j4 = -1;
                    if (j3 != -1) {
                        this.A00 = j3;
                    } else {
                        long length = openRawResourceFd.getLength();
                        if (length != -1) {
                            j4 = length - j2;
                        }
                        this.A00 = j4;
                    }
                    this.A04 = true;
                    A03(r10);
                    return this.A00;
                }
                throw new EOFException();
            } catch (IOException e2) {
                throw new AnonymousClass40J(e2);
            }
        } else {
            throw new AnonymousClass40J(AnonymousClass000.A0g("Resource is compressed: ", uri));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4.A04 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r1 = new X.AnonymousClass40J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        r4.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004c, code lost:
        if (r4.A04 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004e, code lost:
        r4.A04 = false;
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0053, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x000d, B:27:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch:{ IOException -> 0x0022 }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0022 }
        L_0x000b:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x001f
            r4.A04 = r2
            r4.A00()
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            goto L_0x0041
        L_0x0022:
            r1 = move-exception
            X.40J r0 = new X.40J     // Catch:{ all -> 0x0029 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x003a }
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x003a }
        L_0x0033:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0053
            goto L_0x004e
        L_0x003a:
            r0 = move-exception
            X.40J r1 = new X.40J     // Catch:{ all -> 0x0047 }
            r1.<init>((java.io.IOException) r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0046
        L_0x0041:
            X.40J r1 = new X.40J     // Catch:{ all -> 0x0047 }
            r1.<init>((java.io.IOException) r0)     // Catch:{ all -> 0x0047 }
        L_0x0046:
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0053
        L_0x004e:
            r4.A04 = r2
            r4.A00()
        L_0x0053:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, (long) i3);
                } catch (IOException e2) {
                    throw new AnonymousClass40J(e2);
                }
            }
            int read = this.A03.read(bArr, i2, i3);
            if (read != -1) {
                long j3 = this.A00;
                if (j3 != -1) {
                    this.A00 = j3 - ((long) read);
                }
                A02(read);
                return read;
            } else if (this.A00 != -1) {
                throw new AnonymousClass40J((IOException) new EOFException());
            }
        }
        return -1;
    }
}
