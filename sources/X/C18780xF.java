package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.0xF  reason: invalid class name and case insensitive filesystem */
public class C18780xF {
    public final HashMap A00 = new HashMap();

    public void A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        C40671uV r1 = new C40671uV(bArr, bArr3, i2);
        HashMap hashMap = this.A00;
        hashMap.put(new C40681uW(str, bArr2), r1);
        StringBuilder sb = new StringBuilder("BackupCipherKeys/updateKeyForBackupFile v=");
        sb.append(str);
        Log.i(sb.toString());
        hashMap.size();
    }
}
