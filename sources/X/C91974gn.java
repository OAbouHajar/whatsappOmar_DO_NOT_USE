package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.obwhatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* renamed from: X.4gn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91974gn implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public /* synthetic */ C91974gn(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A0I == null) {
            Log.w("idverification/createndef/no-fingerprint");
            return null;
        }
        return new NdefMessage(new NdefRecord[]{new NdefRecord(2, "application/com.obwhatsapp.identity".getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A01.A05().getRawString().getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A0I.A01.A02()), NdefRecord.createApplicationRecord("com.obwhatsapp")});
    }
}
