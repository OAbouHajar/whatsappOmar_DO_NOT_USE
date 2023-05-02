package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1Hb  reason: invalid class name and case insensitive filesystem */
public class C24731Hb {
    public MessageDigest A00;
    public final AnonymousClass1I8 A01;

    public C24731Hb(AnonymousClass1I8 r1) {
        this.A01 = r1;
    }

    public final synchronized MessageDigest A00() {
        MessageDigest messageDigest;
        messageDigest = this.A00;
        if (messageDigest == null) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                this.A00 = messageDigest;
            } catch (NoSuchAlgorithmException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("ABOfflineAssign assign will fail due to MD5 algorithm not found: ");
                sb.append(e2);
                throw new RuntimeException(sb.toString());
            }
        }
        return messageDigest;
    }
}
