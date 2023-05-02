package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.2i7  reason: invalid class name and case insensitive filesystem */
public class C54732i7 {
    public AnonymousClass1WL A00;
    public String A01;
    public String A02;
    public byte[] A03;
    public byte[] A04;

    public C54732i7(AnonymousClass1WL r1, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = str2;
        this.A00 = r1;
        this.A04 = bArr2;
    }

    public static C54732i7 A00(String str) {
        byte[] bArr;
        AnonymousClass1WL r9;
        String str2;
        String[] split = str.split(",");
        int length = split.length;
        String str3 = null;
        if (length < 3) {
            str2 = "qrData/processQR/error/invalid_code parts";
        } else {
            boolean z2 = false;
            if (length >= 4) {
                z2 = true;
            }
            if (z2) {
                try {
                    r9 = new AnonymousClass1WL(C28851Ya.A01(C28641Wx.A04(new byte[]{5}, Base64.decode(split[2], 0))));
                    bArr = Base64.decode(split[3], 0);
                } catch (C31751ey unused) {
                    str2 = "qrData/processQR/error/invalid identity key";
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder("qrData/processQR/error/");
                    sb.append(e2);
                    str2 = sb.toString();
                }
            } else {
                r9 = null;
                bArr = null;
            }
            try {
                byte[] decode = Base64.decode(split[1], 0);
                String str4 = split[0];
                if (!z2) {
                    str3 = split[2];
                }
                return new C54732i7(r9, str4, str3, decode, bArr);
            } catch (IllegalArgumentException unused2) {
                str2 = "qrData/processQR/error/invalid public key";
            }
        }
        Log.e(str2);
        return null;
    }
}
