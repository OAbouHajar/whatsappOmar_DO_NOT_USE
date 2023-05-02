package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.4Vn  reason: invalid class name and case insensitive filesystem */
public final class C87134Vn {
    public MessageDigest A00;
    public MessageDigest A01 = null;

    public C87134Vn(String str) {
        try {
            this.A00 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass3K2.A0T(e2);
        }
    }

    public void A00(byte[] bArr) {
        if (bArr != null) {
            try {
                MessageDigest messageDigest = this.A00;
                this.A01 = (MessageDigest) messageDigest.clone();
                messageDigest.update(bArr);
            } catch (CloneNotSupportedException e2) {
                throw AnonymousClass3K2.A0T(e2);
            }
        } else {
            throw AnonymousClass3K2.A0S("Cannot add null transcript.", (byte) 80);
        }
    }

    public byte[] A01() {
        try {
            return ((MessageDigest) this.A00.clone()).digest();
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K2.A0T(e2);
        }
    }

    public byte[] A02() {
        try {
            return ((MessageDigest) this.A01.clone()).digest();
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K2.A0T(e2);
        }
    }
}
