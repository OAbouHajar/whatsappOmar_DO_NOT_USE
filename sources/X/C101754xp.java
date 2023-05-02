package X;

import com.whatsapp.util.Log;

/* renamed from: X.4xp  reason: invalid class name and case insensitive filesystem */
public class C101754xp implements AnonymousClass5PT {
    public final AnonymousClass1XK A00;

    public C101754xp(AnonymousClass1XK r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public C43061zH A7u(byte[] bArr) {
        try {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets start)");
            C43061zH A002 = C61873At.A00(C40771uf.A00(bArr, this.A00.A03, 80));
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            return A002;
        } catch (Throwable th) {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            throw th;
        }
    }
}
