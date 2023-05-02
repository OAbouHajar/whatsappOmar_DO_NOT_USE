package X;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.File;
import javax.crypto.Cipher;

/* renamed from: X.56H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56H implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CancellationSignal A01;
    public final /* synthetic */ ParcelFileDescriptor A02;
    public final /* synthetic */ C16380sw A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ Cipher A05;

    public /* synthetic */ AnonymousClass56H(CancellationSignal cancellationSignal, ParcelFileDescriptor parcelFileDescriptor, C16380sw r3, File file, Cipher cipher, long j2) {
        this.A03 = r3;
        this.A00 = j2;
        this.A04 = file;
        this.A05 = cipher;
        this.A02 = parcelFileDescriptor;
        this.A01 = cancellationSignal;
    }

    public final void run() {
        C16380sw r4 = this.A03;
        File file = this.A04;
        Cipher cipher = this.A05;
        C16380sw.A02(this.A01, this.A02, r4, file, cipher);
    }
}
