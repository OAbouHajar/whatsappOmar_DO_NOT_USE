package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.3If  reason: invalid class name */
public class AnonymousClass3If extends DigestOutputStream {
    public long A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass2G5 A02;
    public final /* synthetic */ File A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3If(AnonymousClass2G5 r3, File file, OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
        this.A02 = r3;
        this.A03 = file;
    }

    public void close() {
        if (this.A01) {
            Log.i("BackupFile/get-output-stream/close/already-closed");
            return;
        }
        flush();
        byte[] digest = getMessageDigest().digest();
        StringBuilder A0r = AnonymousClass000.A0r("BackupFile/get-output-stream/close/writing-digest ");
        A0r.append(C004101u.A05(digest));
        A0r.append(" bytes written = ");
        A0r.append(this.A00);
        C13680ns.A1V(A0r);
        AnonymousClass2G5 r6 = this.A02;
        C61723Ab A09 = r6.A09(digest);
        if (A09 != null) {
            byte[] bArr = A09.A01;
            int i2 = 0;
            for (byte[] bArr2 : bArr == null ? new byte[][]{A09.A00} : new byte[][]{A09.A00, bArr}) {
                Arrays.toString(bArr2);
                i2 += bArr2.length;
                write(bArr2);
            }
            Log.i(C13680ns.A0c(i2, "BackupFile/write-backup-footer/size="));
        }
        super.close();
        this.A01 = true;
        AnonymousClass2G2 r4 = r6.A00;
        r4.A7l();
        if (r4 instanceof AnonymousClass2G1) {
            File file = this.A03;
            if (!file.renameTo(((AnonymousClass2G1) r4).A00)) {
                StringBuilder A0r2 = AnonymousClass000.A0r("File.renameTo failed: ");
                A0r2.append(file);
                A0r2.append(" ");
                A0r2.append(file.exists());
                A0r2.append(" ");
                A0r2.append(r4);
                A0r2.append(" ");
                A0r2.append(r4.A8q());
                throw new IOException(A0r2.toString());
            }
        }
    }

    public void write(int i2) {
        super.write(i2);
        this.A00++;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        super.write(bArr, i2, i3);
        this.A00 += (long) (i3 - i2);
    }
}
