package X;

import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2ce  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51992ce implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C16040sK A01;
    public final /* synthetic */ C16440t3 A02;

    public /* synthetic */ C51992ce(Activity activity, C16040sK r2, C16440t3 r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        C16040sK r7 = this.A01;
        C16440t3 r8 = this.A02;
        Log.i("newchatnfc/createndef");
        NdefRecord[] ndefRecordArr = new NdefRecord[2];
        byte[] bytes = "application/com.obwhatsapp.chat".getBytes(Charset.forName("US-ASCII"));
        r7.A0B();
        AnonymousClass1ZT r0 = r7.A05;
        AnonymousClass00B.A06(r0);
        byte[] bytes2 = r0.getRawString().getBytes(Charset.forName("US-ASCII"));
        JSONObject jSONObject = new JSONObject();
        try {
            r7.A0B();
            AnonymousClass1ZT r02 = r7.A05;
            AnonymousClass00B.A06(r02);
            jSONObject.put("jid", r02.getRawString());
            jSONObject.put("id", C224718b.A00(r7, r8, false));
            jSONObject.put(FacebookFacade.RequestParameter.NAME, r7.A07());
        } catch (JSONException e2) {
            Log.e("newchatnfc/", e2);
        }
        ndefRecordArr[0] = new NdefRecord(2, bytes, bytes2, jSONObject.toString().getBytes(Charset.forName("US-ASCII")));
        ndefRecordArr[1] = NdefRecord.createApplicationRecord("com.obwhatsapp");
        return new NdefMessage(ndefRecordArr);
    }
}
