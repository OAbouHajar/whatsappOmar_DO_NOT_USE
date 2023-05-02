package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1ma  reason: invalid class name and case insensitive filesystem */
public abstract class C35841ma {
    public final C16300so A00;
    public final C15900s5 A01;
    public final C17020u3 A02;

    public C35841ma(C16300so r1, C15900s5 r2, C17020u3 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C35811mX A00(byte[] bArr) {
        C35811mX A002 = ((C35831mZ) this).A00.A00(AnonymousClass021.A0N, bArr);
        if (A002 == null) {
            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on encryption");
            Log.e(sb.toString());
        }
        return A002;
    }

    public void A01() {
    }

    public void A02(String str, Throwable th) {
        Log.e("EncryptedKeyHelper/reportKeystoreCriticalException/", th);
        SharedPreferences A002 = this.A02.A00("keystore");
        long j2 = A002.getLong("client_static_keypair_enc_success", 0);
        long j3 = A002.getLong("client_static_keypair_enc_failed", 0);
        C16300so r5 = this.A00;
        StringBuilder sb = new StringBuilder("keystore-error-");
        sb.append(str);
        sb.append("-");
        sb.append(th.getClass().getSimpleName());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.getMessage());
        sb2.append(String.format(Locale.US, " KS Stats OK/KO: %d/%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        r5.A03(obj, sb2.toString(), th);
    }

    public byte[] A03(C35861mc r4, C35811mX r5) {
        byte[] A012 = ((C35831mZ) this).A00.A01(r5, AnonymousClass021.A0N);
        if (A012 == null) {
            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on decryption while ");
            sb.append(r4.toString());
            Log.e(sb.toString());
        }
        return A012;
    }
}
