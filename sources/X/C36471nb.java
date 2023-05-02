package X;

/* renamed from: X.1nb  reason: invalid class name and case insensitive filesystem */
public class C36471nb {
    public final AnonymousClass5T9 A00;

    public C36471nb(AnonymousClass5T9 r1) {
        this.A00 = r1;
    }

    public static C36471nb A00() {
        String str;
        if ("native".equals("best")) {
            str = "NativeCurve25519Provider";
        } else if ("java".equals("best")) {
            str = "JavaCurve25519Provider";
        } else if ("j2me".equals("best")) {
            str = "J2meCurve25519Provider";
        } else if ("best".equals("best")) {
            str = "OpportunisticCurve25519Provider";
        } else {
            throw new AnonymousClass5Ap();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("org.whispersystems.curve25519.");
            sb.append(str);
            return new C36471nb((AnonymousClass5T9) Class.forName(sb.toString()).newInstance());
        } catch (InstantiationException e2) {
            throw new AnonymousClass5Ap(e2);
        } catch (IllegalAccessException e3) {
            throw new AnonymousClass5Ap(e3);
        } catch (ClassNotFoundException e4) {
            throw new AnonymousClass5Ap(e4);
        }
    }

    public boolean A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.A00.calculateAgreement(bArr2, bArr);
        } else {
            throw new IllegalArgumentException("Keys must be 32 bytes!");
        }
    }
}
