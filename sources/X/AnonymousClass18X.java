package X;

import com.whatsapp.util.Log;

/* renamed from: X.18X  reason: invalid class name */
public class AnonymousClass18X {
    public static final byte[] A01 = {2};
    public static final byte[] A02 = {1};
    public final C17190ug A00;

    public AnonymousClass18X(C17190ug r1) {
        this.A00 = r1;
    }

    public static final void A00(C28371Vv r7, C29741b7 r8, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/processError id=");
        sb.append(str);
        Log.e(sb.toString());
        C28371Vv A0J = r7.A0J("error");
        if (A0J == null) {
            StringBuilder sb2 = new StringBuilder("EncryptedBackupProtocolHelper/processError error node is empty, id=");
            sb2.append(str);
            Log.e(sb2.toString());
            str2 = "error node is empty";
        } else {
            String A0N = A0J.A0N("text", (String) null);
            if (A0N == null) {
                StringBuilder sb3 = new StringBuilder("EncryptedBackupProtocolHelper/processError error text is empty, id=");
                sb3.append(str);
                Log.e(sb3.toString());
                str2 = "error text is empty";
            } else {
                String A0N2 = A0J.A0N("code", (String) null);
                if (A0N2 == null) {
                    StringBuilder sb4 = new StringBuilder("EncryptedBackupProtocolHelper/processError error code is empty, id=");
                    sb4.append(str);
                    Log.e(sb4.toString());
                    str2 = "error code is empty";
                } else {
                    try {
                        int parseInt = Integer.parseInt(A0N2);
                        String A0N3 = A0J.A0N("backoff", (String) null);
                        if (A0N3 == null) {
                            StringBuilder sb5 = new StringBuilder("EncryptedBackupProtocolHelper/processError timeout is empty, id=");
                            sb5.append(str);
                            Log.e(sb5.toString());
                            str2 = "timeout is empty";
                        } else {
                            try {
                                r8.AQf(parseInt, A0N, Integer.parseInt(A0N3));
                                return;
                            } catch (NumberFormatException unused) {
                                StringBuilder sb6 = new StringBuilder("EncryptedBackupProtocolHelper/processError timeout is not numerical, id=");
                                sb6.append(str);
                                sb6.append(", timeout=");
                                sb6.append(A0N3);
                                Log.e(sb6.toString());
                                str2 = "timeout is not numerical";
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb7 = new StringBuilder("EncryptedBackupProtocolHelper/processError error code is not numerical, id=");
                        sb7.append(str);
                        sb7.append(", error=");
                        sb7.append(A0N2);
                        Log.e(sb7.toString());
                        str2 = "error code is not numerical";
                    }
                }
            }
        }
        r8.AQf(1, str2, -1);
    }

    public static final byte[] A01(C28371Vv r2, C29741b7 r3, String str) {
        byte[] bArr;
        C28371Vv A0J = r2.A0J(str);
        if (A0J != null && (bArr = A0J.A01) != null) {
            return bArr;
        }
        StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/getRequiredChildData node with name=");
        sb.append(str);
        sb.append(" was empty");
        Log.e(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" was empty");
        r3.AQf(1, sb2.toString(), -1);
        return null;
    }
}
