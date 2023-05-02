package X;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.5wR  reason: invalid class name */
public class AnonymousClass5wR {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C18310wU A02;

    public AnonymousClass5wR(C16040sK r1, C16440t3 r2, C18310wU r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static byte[] A00(Boolean bool, Object obj, String str, String str2, byte[] bArr, Object[] objArr, long j2) {
        Object obj2;
        String str3 = bool == null ? null : bool.booleanValue() ? "PIN" : "BIO";
        int length = objArr.length;
        int i2 = length + 6;
        Object[] objArr2 = new Object[i2];
        C13690nt.A1L(str, str3, objArr2);
        objArr2[2] = obj;
        objArr2[3] = Long.valueOf(j2);
        AnonymousClass3K4.A12(str2, bArr, objArr2);
        System.arraycopy(objArr, 0, objArr2, 6, length);
        Object[] objArr3 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr2[i3] == null) {
                obj2 = "";
            } else {
                boolean z2 = objArr2[i3] instanceof String;
                obj2 = objArr2[i3];
                if (z2) {
                    continue;
                } else if ((obj2 instanceof Long) || (objArr2[i3] instanceof Integer)) {
                    obj2 = String.valueOf(objArr2[i3]);
                } else if (objArr2[i3] instanceof byte[]) {
                    obj2 = Base64.encodeToString((byte[]) objArr2[i3], 2);
                } else {
                    throw AnonymousClass000.A0T(AnonymousClass1Vo.A01("PinActions", "getPinNode: should only accept long, int, byte[], and String args"));
                }
            }
            objArr3[i3] = obj2;
        }
        try {
            return TextUtils.join("|", objArr3).getBytes(AnonymousClass01S.A08);
        } catch (UnsupportedEncodingException e2) {
            C110105dW.A1O("PinActions", AnonymousClass000.A0g("constructPayload: UTF-8 not supported: ", e2));
            throw new Error(e2);
        }
    }
}
