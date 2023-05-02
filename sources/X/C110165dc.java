package X;

import android.content.BroadcastReceiver;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.5dc  reason: invalid class name and case insensitive filesystem */
public class C110165dc extends BroadcastReceiver {
    public final /* synthetic */ GetCredential A00;

    public C110165dc(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r15, android.content.Intent r16) {
        /*
            r14 = this;
            java.lang.String r0 = r16.getAction()
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = r16.getAction()
            java.lang.String r0 = "android.provider.Telephony.SMS_RECEIVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0141
            android.os.Bundle r1 = r16.getExtras()
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "pdus"
            java.lang.Object r6 = r1.get(r0)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r6 == 0) goto L_0x0141
            int r5 = r6.length
            android.telephony.SmsMessage[] r4 = new android.telephony.SmsMessage[r5]
            r3 = 0
        L_0x0026:
            if (r3 >= r5) goto L_0x0141
            r0 = r6[r3]
            byte[] r0 = (byte[]) r0
            android.telephony.SmsMessage r0 = android.telephony.SmsMessage.createFromPdu(r0)
            r4[r3] = r0
            r0 = r4[r3]
            java.lang.String r1 = r0.getOriginatingAddress()
            org.npci.commonlibrary.GetCredential r10 = r14.A00
            X.013 r0 = r10.A05
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r9 = r1.toUpperCase(r0)
            r0 = r4[r3]
            java.lang.String r1 = r0.getMessageBody()
            X.013 r0 = r10.A05
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r8 = r1.toUpperCase(r0)
            android.content.Context r0 = r10.A0G
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.lang.String r11 = "npci_otp_rules.json"
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x013b }
            r12.<init>()     // Catch:{ Exception -> 0x013b }
            android.content.res.AssetManager r2 = r0.getAssets()     // Catch:{ Exception -> 0x013b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = "npci/"
            r1.append(r0)     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r1)     // Catch:{ Exception -> 0x013b }
            java.io.InputStream r11 = r2.open(r0)     // Catch:{ Exception -> 0x013b }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x013b }
        L_0x007b:
            int r1 = r11.read(r2)     // Catch:{ Exception -> 0x013b }
            r0 = -1
            if (r1 == r0) goto L_0x0087
            r0 = 0
            r12.write(r2, r0, r1)     // Catch:{ Exception -> 0x013b }
            goto L_0x007b
        L_0x0087:
            r12.close()     // Catch:{ Exception -> 0x013b }
            r11.close()     // Catch:{ Exception -> 0x013b }
            byte[] r1 = r12.toByteArray()     // Catch:{ Exception -> 0x013b }
            if (r1 == 0) goto L_0x009d
            java.lang.String r0 = new java.lang.String     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{  }
            r7.<init>(r0)     // Catch:{  }
        L_0x009d:
            r2 = 0
        L_0x009e:
            int r0 = r7.length()     // Catch:{ JSONException -> 0x010e }
            if (r2 >= r0) goto L_0x0137
            org.json.JSONObject r1 = r7.getJSONObject(r2)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r0 = "sender"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x010b }
            r11 = 0
        L_0x00af:
            int r0 = r12.length()     // Catch:{ JSONException -> 0x010b }
            if (r11 >= r0) goto L_0x010b
            java.lang.String r13 = r12.getString(r11)     // Catch:{ JSONException -> 0x010b }
            r0 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r13, r0)     // Catch:{ JSONException -> 0x010b }
            java.util.regex.Matcher r0 = r0.matcher(r9)     // Catch:{ JSONException -> 0x010b }
            boolean r0 = r0.find()     // Catch:{ JSONException -> 0x010b }
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "message"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ JSONException -> 0x010b }
            r0 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r11, r0)     // Catch:{ JSONException -> 0x010b }
            java.util.regex.Matcher r0 = r0.matcher(r8)     // Catch:{ JSONException -> 0x010b }
            boolean r0 = r0.find()     // Catch:{ JSONException -> 0x010b }
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "otp"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x010b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x010b }
            java.util.regex.Matcher r1 = X.C110115dX.A0k(r8, r0)     // Catch:{ JSONException -> 0x010b }
            boolean r0 = r1.find()     // Catch:{ JSONException -> 0x010b }
            if (r0 == 0) goto L_0x010b
            int r0 = r1.groupCount()     // Catch:{ JSONException -> 0x010b }
            if (r0 < 0) goto L_0x010b
            r0 = 0
            java.lang.String r9 = r1.group(r0)     // Catch:{ JSONException -> 0x010b }
            org.npci.commonlibrary.NPCIFragment r8 = r10.A0D
            java.util.ArrayList r7 = r8.A0B
            int r1 = r8.A00
            X.5eG r2 = X.C110115dX.A0l(r7, r1)
            r0 = -1
            if (r1 == r0) goto L_0x0137
            goto L_0x0114
        L_0x0108:
            int r11 = r11 + 1
            goto L_0x00af
        L_0x010b:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x010e:
            java.lang.String r0 = "PAY: failed to extract otp from text"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0137
        L_0x0114:
            if (r9 == 0) goto L_0x0137
            int r1 = r2.A00
            int r0 = r9.length()
            if (r1 < r0) goto L_0x0137
            r0 = 1
            r8.A0A = r0
            r2.setText(r9)
            int r1 = r7.size()
            int r0 = r8.A00
            int r0 = r0 + 1
            if (r1 <= r0) goto L_0x0137
            java.lang.Object r0 = r7.get(r0)
            X.69X r0 = (X.AnonymousClass69X) r0
            r0.A9B()
        L_0x0137:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x013b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110165dc.onReceive(android.content.Context, android.content.Intent):void");
    }
}
