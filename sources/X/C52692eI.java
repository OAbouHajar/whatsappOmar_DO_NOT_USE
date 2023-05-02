package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: X.2eI  reason: invalid class name and case insensitive filesystem */
public final class C52692eI implements C30881d7 {
    public final C16460t6 A00;
    public final C30161br A01;

    public C52692eI(C16460t6 r1, C30161br r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AHO(byte[] bArr) {
        String str;
        C16740tZ A02 = this.A01.A02((byte) 0);
        if (!A02.A0w()) {
            Log.i("decryptmessagerunnable/axolotl message decryption had no data; ciphertext only");
            if (bArr != null) {
                try {
                    str = new String(bArr, AnonymousClass01S.A08);
                } catch (UnsupportedEncodingException unused) {
                }
                A02.A0k(str);
            }
            str = null;
            A02.A0k(str);
        }
        this.A00.A0u(A02);
    }
}
