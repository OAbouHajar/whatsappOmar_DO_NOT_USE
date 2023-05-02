package X;

import android.util.Base64;

/* renamed from: X.19x  reason: invalid class name and case insensitive filesystem */
public class C229519x {
    public final C15860rz A00;

    public C229519x(C15860rz r1) {
        this.A00 = r1;
    }

    public void A00(byte[] bArr) {
        if (bArr.length <= 256) {
            C15860rz r1 = this.A00;
            r1.A0K().putString("routing_info", Base64.encodeToString(bArr, 3)).apply();
            return;
        }
        throw new IllegalArgumentException("The routing info should be smaller than 256 bytes.");
    }
}
