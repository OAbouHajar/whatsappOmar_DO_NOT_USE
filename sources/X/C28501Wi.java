package X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1Wi  reason: invalid class name and case insensitive filesystem */
public class C28501Wi {
    public final int A00;
    public final C28481Wg A01;
    public final AnonymousClass1WK A02;
    public final C28531Wl A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public C28501Wi(AnonymousClass1WJ r2) {
        this.A00 = r2.A03;
        this.A04 = r2.A03();
        this.A02 = r2.A00;
        this.A06 = r2.A07();
        this.A01 = r2.A05;
        this.A03 = r2.A02();
        this.A05 = r2.A02;
    }

    public C28501Wi(C28481Wg r1, AnonymousClass1WK r2, C28531Wl r3, String str, byte[] bArr, String[] strArr, int i2) {
        this.A04 = str;
        this.A00 = i2;
        this.A02 = r2;
        this.A06 = strArr;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = bArr;
    }

    public C28501Wi(C28481Wg r2, AnonymousClass1WK r3, String str, byte[] bArr, byte[] bArr2, int i2) {
        this.A00 = i2;
        this.A04 = str;
        this.A02 = r3;
        this.A06 = A01(str);
        this.A01 = r2;
        this.A03 = bArr != null ? (C28531Wl) C28541Wm.A0E(C28531Wl.A0X, bArr) : null;
        this.A05 = bArr2;
    }

    public static String A00(String str) {
        try {
            return new JSONArray(str).getString(0);
        } catch (JSONException unused) {
            throw new IllegalArgumentException("SyncMutationData/getValidMutationName: corrupt index");
        }
    }

    public static String[] A01(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            strArr[i2] = jSONArray.getString(i2);
            if (!strArr[i2].isEmpty()) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("SyncMutationData/getValidKeyArrayIndex: The key is empty in the keyArray at position: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (length > 0) {
            return strArr;
        }
        throw new IllegalArgumentException("SyncMutationData/getValidKeyArrayIndex: keyArray length should have action name");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28501Wi)) {
            return false;
        }
        C28501Wi r4 = (C28501Wi) obj;
        return this.A04.equals(r4.A04) && C34901l3.A00(this.A03, r4.A03) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A01});
    }

    public String toString() {
        return "SyncMutationData";
    }
}
