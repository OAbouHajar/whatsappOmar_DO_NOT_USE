package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* renamed from: X.5pN  reason: invalid class name and case insensitive filesystem */
public final class C115225pN {
    public static String A00(C117365ss r9, String str) {
        if (TextUtils.isEmpty(str) || r9 == null) {
            return null;
        }
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[] array = allocate.array();
        byte[] bytes = "cd7962b7".getBytes();
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(r9.A02);
        byte[] array2 = allocate2.array();
        ByteBuffer allocate3 = ByteBuffer.allocate(8);
        allocate3.putLong(r9.A03);
        byte[] array3 = allocate3.array();
        byte[][] bArr2 = new byte[6][];
        bArr2[0] = bytes;
        bArr2[1] = array3;
        bArr2[2] = array2;
        bArr2[3] = array;
        AnonymousClass3K4.A12(r9.A01, bArr, bArr2);
        return Base64.encodeToString(C28641Wx.A04(C28641Wx.A04(bArr2), C46872Gp.A01(C46862Go.A01(r9.A04, r9.A00), bArr, str.getBytes())), 0);
    }
}
