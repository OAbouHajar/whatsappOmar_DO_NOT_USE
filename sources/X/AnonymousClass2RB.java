package X;

import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2RB  reason: invalid class name */
public class AnonymousClass2RB {
    public static final Charset A00 = AnonymousClass01S.A0A;

    public static String A00(C16300so r5, AnonymousClass14A r6, String str) {
        try {
            C35811mX A002 = AnonymousClass149.A00(new JSONArray(str));
            byte[] A01 = A002 == null ? null : r6.A01(A002, AnonymousClass021.A0N);
            if (A01 != null) {
                return new String(A01, A00);
            }
            r5.AcB("BusinessDirectoryStorageUtil/decryptStringData", "Failed to decrypt string data", true);
            throw new Exception("Failed to decrypt string data");
        } catch (JSONException e2) {
            r5.AcB("BusinessDirectoryStorageUtil/decryptSearchLocation", e2.getMessage(), true);
            throw e2;
        }
    }

    public static String A01(C16300so r3, AnonymousClass14A r4, String str) {
        String A002;
        C35811mX A003 = r4.A00(AnonymousClass021.A0N, str.getBytes(A00));
        if (A003 != null && (A002 = A003.A00()) != null && str.equals(A00(r3, r4, A002))) {
            return A002;
        }
        r3.AcB("BusinessDirectoryStorageUtil/encryptStringData", "Failed to encrypt string data", true);
        throw new Exception("Failed to encrypt string data");
    }
}
