package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5u8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5u8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C110665ec A01;

    public /* synthetic */ AnonymousClass5u8(C110665ec r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void A00(AnonymousClass2HJ r9, String str) {
        C119395xh A002;
        C110665ec r4 = this.A01;
        int i2 = this.A00;
        if (r9 != null) {
            C119395xh A05 = r4.A05();
            A05.A04 = "01";
            r4.A01.A0B(A05);
        } else if (!(TextUtils.isEmpty(str) || (A002 = C119395xh.A00(Uri.parse(str), "SCANNED_QR_CODE")) == null || A002.A0I == null)) {
            r4.A01.A0B(A002);
            if (A002.A0A == null) {
                AnonymousClass60V r7 = r4.A0C;
                synchronized (r7) {
                    try {
                        C18300wT r6 = r7.A03;
                        JSONObject A0k = C110105dW.A0k(r6);
                        A0k.put("signedQrCode", str);
                        A0k.put("signedQrCodeTs", r7.A00.A00());
                        C110105dW.A1J(r6, A0k);
                    } catch (JSONException e2) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e2);
                    }
                }
            }
        }
        C110665ec.A01(r4, 0, i2);
        return;
    }
}
