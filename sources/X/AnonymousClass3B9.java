package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3B9  reason: invalid class name */
public class AnonymousClass3B9 {
    public static final Set A06;
    public String A00;
    public String A01;
    public JSONObject A02;
    public JSONObject A03;
    public final String A04;
    public final String A05;

    static {
        String[] strArr = new String[2];
        strArr[0] = "NONE";
        A06 = C13680ns.A0p("ES256", strArr, 1);
    }

    public AnonymousClass3B9(String str) {
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(46);
        if (!(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
            int i2 = indexOf + 1;
            if (str.indexOf(46, i2) == lastIndexOf) {
                String substring = str.substring(0, indexOf);
                this.A04 = substring;
                String substring2 = str.substring(i2, lastIndexOf);
                this.A05 = substring2;
                this.A01 = str.substring(lastIndexOf + 1);
                try {
                    byte[] decode = Base64.decode(substring, 8);
                    byte[] decode2 = Base64.decode(substring2, 8);
                    Base64.decode(this.A01, 8);
                    JSONObject A0K = C13700nu.A0K(new String(decode));
                    this.A02 = A0K;
                    this.A00 = A0K.getString("alg").toUpperCase(Locale.US);
                    this.A03 = C13700nu.A0K(new String(decode2));
                    if (!A06.contains(this.A00)) {
                        throw new AnonymousClass43R("JWT algorithm not supported");
                    }
                    return;
                } catch (JSONException e2) {
                    throw new AnonymousClass43R(e2.getMessage());
                } catch (IllegalArgumentException unused) {
                    throw new AnonymousClass43R("Wrong Base64 encoding.");
                }
            }
        }
        throw new AnonymousClass43R("Invalid JWT Token");
    }

    public static byte[] A00(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 < length && bArr[i2] == 0) {
                i2++;
            }
        }
        if (i2 == length) {
            return new byte[]{0};
        }
        int i3 = length - i2;
        if ((bArr[i2] & 255) > Byte.MAX_VALUE) {
            byte[] bArr2 = new byte[(i3 + 1)];
            System.arraycopy(bArr, i2, bArr2, 1, i3);
            return bArr2;
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr, i2, bArr3, 0, i3);
        return bArr3;
    }

    public boolean A01(PublicKey publicKey) {
        byte[] bArr;
        int i2;
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initVerify(publicKey);
            instance.update(TextUtils.join(".", new String[]{this.A04, this.A05}).getBytes(AnonymousClass01S.A08));
            byte[] decode = Base64.decode(this.A01, 8);
            int length = decode.length;
            if (length % 2 == 0) {
                int i3 = length / 2;
                byte[][] A052 = C28641Wx.A05(decode, i3, i3);
                byte[] A002 = A00(A052[0]);
                byte[] A003 = A00(A052[1]);
                int length2 = A002.length;
                int length3 = A003.length;
                int i4 = length2 + 4 + length3;
                if (i4 <= 255) {
                    if (i4 > 127) {
                        bArr = new byte[(i4 + 3)];
                        bArr[0] = 48;
                        bArr[1] = -127;
                        bArr[2] = (byte) i4;
                        i2 = 3;
                    } else {
                        bArr = new byte[(i4 + 2)];
                        bArr[0] = 48;
                        bArr[1] = (byte) i4;
                        i2 = 2;
                    }
                    int i5 = i2 + 1;
                    bArr[i2] = 2;
                    int i6 = i5 + 1;
                    bArr[i5] = (byte) length2;
                    System.arraycopy(A002, 0, bArr, i6, length2);
                    int i7 = i6 + length2;
                    int i8 = i7 + 1;
                    bArr[i7] = 2;
                    bArr[i8] = (byte) length3;
                    System.arraycopy(A003, 0, bArr, i8 + 1, length3);
                    return instance.verify(bArr);
                }
                throw new AnonymousClass43R("Invalid JWT Signature");
            }
            throw new AnonymousClass43R("Invalid JWT Signature");
        } catch (UnsupportedEncodingException e2) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("JWT: ");
            Log.w(AnonymousClass000.A0e(e2, ": getSigningPayload threw ", A0o));
            throw new Error(e2);
        } catch (Exception e3) {
            Log.w(AnonymousClass000.A0h(": Can't verify signature ", AnonymousClass000.A0r("JWT: ")), e3);
            return false;
        }
    }
}
