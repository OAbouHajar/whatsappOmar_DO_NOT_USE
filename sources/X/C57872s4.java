package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.2s4  reason: invalid class name and case insensitive filesystem */
public final class C57872s4 extends AnonymousClass3E3 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C57872s4(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    public Uri AGo() {
        return this.A02;
    }

    public long AZr(AnonymousClass3AL r13) {
        try {
            Uri uri = r13.A04;
            this.A02 = uri;
            A01();
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, "r");
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A03 = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j2 = r13.A03;
                long skip = fileInputStream.skip(j2 + startOffset) - startOffset;
                if (skip == j2) {
                    long j3 = r13.A02;
                    if (j3 != -1) {
                        this.A00 = j3;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.A00 = -1;
                            } else {
                                long position = size - channel.position();
                                this.A00 = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j4 = length - skip;
                            this.A00 = j4;
                            if (j4 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.A04 = true;
                    A03(r13);
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(AnonymousClass000.A0e(uri, "Could not open file descriptor for: ", AnonymousClass000.A0o()));
        } catch (IOException e2) {
            throw new AnonymousClass407(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4.A04 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r1 = new X.AnonymousClass407(r0);
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
            java.io.FileInputStream r0 = r4.A03     // Catch:{ IOException -> 0x0022 }
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
            X.407 r0 = new X.407     // Catch:{ all -> 0x0029 }
            r0.<init>(r1)     // Catch:{ all -> 0x0029 }
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
            X.407 r1 = new X.407     // Catch:{ all -> 0x0047 }
            r1.<init>(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0046
        L_0x0041:
            X.407 r1 = new X.407     // Catch:{ all -> 0x0047 }
            r1.<init>(r0)     // Catch:{ all -> 0x0047 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C57872s4.close():void");
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
                    throw new AnonymousClass407(e2);
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
                throw new AnonymousClass407(new EOFException());
            }
        }
        return -1;
    }
}
