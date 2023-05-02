package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2s3  reason: invalid class name and case insensitive filesystem */
public final class C57862s3 extends AnonymousClass3E3 {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public C57862s3(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    public Uri AGo() {
        return this.A01;
    }

    public long AZr(AnonymousClass3AL r9) {
        try {
            Uri uri = r9.A04;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A01();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j2 = r9.A03;
            if (open.skip(j2) >= j2) {
                long j3 = r9.A02;
                if (j3 != -1) {
                    this.A00 = j3;
                } else {
                    long available = (long) this.A02.available();
                    this.A00 = available;
                    if (available == 2147483647L) {
                        this.A00 = -1;
                    }
                }
                this.A03 = true;
                A03(r9);
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new AnonymousClass406(e2);
        }
    }

    public void close() {
        this.A01 = null;
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e2) {
            throw new AnonymousClass406(e2);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
            throw th;
        }
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
                    throw new AnonymousClass406(e2);
                }
            }
            int read = this.A02.read(bArr, i2, i3);
            if (read != -1) {
                long j3 = this.A00;
                if (j3 != -1) {
                    this.A00 = j3 - ((long) read);
                }
                A02(read);
                return read;
            } else if (this.A00 != -1) {
                throw new AnonymousClass406(new EOFException());
            }
        }
        return -1;
    }
}
