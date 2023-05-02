package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.2A0  reason: invalid class name */
public class AnonymousClass2A0 extends C38191qO {
    public String A00;
    public String A01;
    public final AnonymousClass1QV A02;
    public final Long A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass2A0(AnonymousClass1QV r2, Long l2, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        super(str, str2, str3);
        if (!z2) {
            this.A00 = this.A03;
        }
        this.A02 = r2;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = str4;
        this.A03 = l2;
    }

    public final Uri.Builder A02(C29561ap r4) {
        Uri.Builder A032 = A03(r4);
        if (this.A05) {
            A032.appendQueryParameter("stream", "1");
        }
        String str = this.A04;
        if (str != null) {
            A032.appendQueryParameter("type", str);
        }
        Long l2 = this.A03;
        if (l2 != null) {
            A032.appendQueryParameter("media_id", String.valueOf(l2));
        }
        return A032;
    }

    public final Uri.Builder A03(C29561ap r8) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.A01;
        if (str == null) {
            AnonymousClass1QV r0 = this.A02;
            AnonymousClass00B.A06(r0);
            String str2 = this.A02;
            C15860rz r4 = (C15860rz) r0.A00.get();
            String string = ((SharedPreferences) r4.A01.get()).getString("upload_token_random_bytes", (String) null);
            if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
                bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                r4.A0K().putString("upload_token_random_bytes", Base64.encodeToString(bArr, 3)).apply();
            }
            byte[] decode = Base64.decode(str2, 2);
            if (decode == null) {
                bArr2 = (byte[]) bArr.clone();
            } else {
                int length = bArr.length;
                int length2 = decode.length;
                bArr2 = new byte[(length + length2)];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                System.arraycopy(decode, 0, bArr2, length, length2);
            }
            try {
                str = AnonymousClass1ZW.A0C(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bArr2), 2));
                this.A01 = str;
            } catch (NoSuchAlgorithmException e2) {
                throw new AssertionError(e2);
            }
        }
        boolean z2 = false;
        if (str != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Upload token has not been set", z2);
        Uri.Builder A012 = A01(r8);
        A012.appendQueryParameter("token", this.A01);
        if (this.A06) {
            A012.appendQueryParameter("_nc_rmr", "1");
        }
        return A012;
    }

    public String A9R(C29561ap r2, boolean z2) {
        return A02(r2).build().toString();
    }
}
