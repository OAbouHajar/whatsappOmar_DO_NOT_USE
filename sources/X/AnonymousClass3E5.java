package X;

import android.net.Uri;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3E5  reason: invalid class name */
public class AnonymousClass3E5 implements C48612Oe {
    public long A00 = 0;
    public AnonymousClass3AV A01;
    public FileInputStream A02;
    public boolean A03;
    public final AnonymousClass5US A04;
    public final C16300so A05;
    public final Mp4Ops A06;
    public final C16980tz A07;
    public final File A08;

    public AnonymousClass3E5(C16300so r4, Mp4Ops mp4Ops, C16980tz r6, String str) {
        this.A07 = r6;
        this.A06 = mp4Ops;
        this.A05 = r4;
        C97624qI r0 = new C97624qI(str);
        this.A04 = new C57882s6(r0.A00, r0.A01);
        this.A08 = C13700nu.A0C(r6.A00.getExternalCacheDir(), UUID.randomUUID().toString());
    }

    public void A4k(AnonymousClass5LZ r1) {
    }

    public /* synthetic */ Map AFZ() {
        return Collections.emptyMap();
    }

    public Uri AGo() {
        return this.A04.AGo();
    }

    public long AZr(AnonymousClass3AL r25) {
        long j2;
        AnonymousClass3AL r5 = r25;
        long j3 = r5.A03;
        this.A00 = j3;
        if (this.A03) {
            File file = this.A08;
            long length = file.length();
            if (this.A00 < length) {
                FileInputStream fileInputStream = new FileInputStream(file);
                this.A02 = fileInputStream;
                fileInputStream.skip(this.A00);
                j2 = (length - this.A00) + 0;
                Uri uri = r5.A04;
                byte[] bArr = r5.A07;
                String str = r5.A05;
                int i2 = r5.A00;
                int i3 = 1;
                if (bArr != null) {
                    i3 = 2;
                }
                r5 = new AnonymousClass3AL(uri, str, Collections.emptyMap(), bArr, i3, i2, length - length, length, -1);
            }
            j2 = 0;
        } else {
            if (j3 != 0) {
                Uri uri2 = r5.A04;
                byte[] bArr2 = r5.A07;
                String str2 = r5.A05;
                int i4 = r5.A00;
                int i5 = 1;
                if (bArr2 != null) {
                    i5 = 2;
                }
                r5 = new AnonymousClass3AL(uri2, str2, Collections.emptyMap(), bArr2, i5, i4, 0, 0, -1);
            }
            j2 = 0;
        }
        long AZr = j2 + this.A04.AZr(r5);
        if (AZr >= 0 && !this.A03) {
            C16980tz r4 = this.A07;
            Mp4Ops mp4Ops = this.A06;
            this.A01 = new AnonymousClass3AV(this.A05, mp4Ops, r4, this.A08, AZr);
        }
        return AZr;
    }

    public void close() {
        this.A04.close();
        FileInputStream fileInputStream = this.A02;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.A02 = null;
        }
        this.A00 = 0;
    }

    public int read(byte[] bArr, int i2, int i3) {
        FileInputStream fileInputStream;
        if (this.A01 != null) {
            if (!this.A03) {
                byte[] bArr2 = new byte[256];
                File file = this.A08;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (this.A01.A00 == 0) {
                    try {
                        fileOutputStream.write(bArr2, 0, this.A04.read(bArr2, 0, 256));
                        fileOutputStream.flush();
                        if (!this.A01.A02(file.length())) {
                            this.A03 = C13690nt.A1R(this.A01.A00);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (this.A03) {
                    fileOutputStream.close();
                } else {
                    throw new IOException("Mp4StreamCheckedDataSource/Mp4StreamCheck not successful");
                }
            }
            File file2 = this.A08;
            long length = file2.length();
            if (length <= 0) {
                throw new IOException("Mp4StreamCheckedDataSource/videoHeadForStreamCheck is empty");
            } else if (this.A00 < length) {
                FileInputStream fileInputStream2 = this.A02;
                if (fileInputStream2 == null) {
                    fileInputStream2 = new FileInputStream(file2);
                    this.A02 = fileInputStream2;
                }
                int read = fileInputStream2.read(bArr, i2, i3);
                long j2 = this.A00 + ((long) read);
                this.A00 = j2;
                if (j2 >= length && (fileInputStream = this.A02) != null) {
                    fileInputStream.close();
                    this.A02 = null;
                }
                return read;
            } else {
                int read2 = this.A04.read(bArr, i2, i3);
                this.A00 += (long) read2;
                return read2;
            }
        } else {
            throw new IOException("Mp4StreamCheckedDataSource/Mp4StreamCheck not initialized");
        }
        throw th;
    }
}
