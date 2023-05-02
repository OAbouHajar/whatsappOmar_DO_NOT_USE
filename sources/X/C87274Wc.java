package X;

import java.util.Arrays;

/* renamed from: X.4Wc  reason: invalid class name and case insensitive filesystem */
public final class C87274Wc {
    public final String A00;
    public final String A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;

    public /* synthetic */ C87274Wc(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A04 = bArr;
        this.A05 = bArr2;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = bArr3;
        this.A03 = bArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87274Wc) {
                C87274Wc r5 = (C87274Wc) obj;
                if (!C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R((Object) null, (Object) null) || !C18450wi.A0R((Object) null, (Object) null)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A0B(this.A03, AnonymousClass3K4.A0B(this.A02, AnonymousClass3K2.A09(this.A00, AnonymousClass3K2.A09(this.A01, AnonymousClass3K4.A0B(this.A05, Arrays.hashCode(this.A04) * 31) * 31))) * 31) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("XFamilyCrosspostPurposeEncryptionParams(serverPublicEK=");
        A0r.append(Arrays.toString(this.A04));
        A0r.append(", serverPublicIK=");
        A0r.append(Arrays.toString(this.A05));
        A0r.append(", serverPublicIKSignature=");
        A0r.append(this.A01);
        A0r.append(", serverPublicIKCertificate=");
        A0r.append(this.A00);
        A0r.append(", dummyCiphertext=");
        A0r.append(Arrays.toString(this.A02));
        A0r.append(", dummyNonce=");
        A0r.append(Arrays.toString(this.A03));
        A0r.append(", clientPrivateKey=");
        A0r.append(Arrays.toString((byte[]) null));
        A0r.append(", clientPublicKey=");
        A0r.append(Arrays.toString((byte[]) null));
        return AnonymousClass000.A0j(A0r);
    }
}
