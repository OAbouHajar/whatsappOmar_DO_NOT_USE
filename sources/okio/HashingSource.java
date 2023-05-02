package okio;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import z.i;

/* compiled from: XFMFile */
public final class HashingSource extends ForwardingSource {

    /* renamed from: b  reason: collision with root package name */
    public final MessageDigest f2348b;

    /* renamed from: c  reason: collision with root package name */
    public final Mac f2349c;

    public HashingSource(Source source, String str) {
        super(source);
        try {
            this.f2348b = MessageDigest.getInstance(str);
            this.f2349c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public HashingSource(Source source, ByteString byteString, String str) {
        super(source);
        try {
            Mac instance = Mac.getInstance(str);
            this.f2349c = instance;
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.f2348b = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static HashingSource hmacSha1(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, "HmacSHA1");
    }

    public static HashingSource hmacSha256(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, DefaultCrypto.HMAC_SHA256);
    }

    public static HashingSource md5(Source source) {
        return new HashingSource(source, "MD5");
    }

    public static HashingSource sha1(Source source) {
        return new HashingSource(source, "SHA-1");
    }

    public static HashingSource sha256(Source source) {
        return new HashingSource(source, "SHA-256");
    }

    public ByteString hash() {
        MessageDigest messageDigest = this.f2348b;
        return ByteString.of(messageDigest != null ? messageDigest.digest() : this.f2349c.doFinal());
    }

    public long read(Buffer buffer, long j2) {
        long read = super.read(buffer, j2);
        if (read != -1) {
            long j3 = buffer.f2324b;
            long j4 = j3 - read;
            i iVar = buffer.f2323a;
            while (j3 > j4) {
                iVar = iVar.f2847g;
                j3 -= (long) (iVar.f2843c - iVar.f2842b);
            }
            while (j3 < buffer.f2324b) {
                int i2 = (int) ((((long) iVar.f2842b) + j4) - j3);
                byte[] bArr = iVar.f2841a;
                MessageDigest messageDigest = this.f2348b;
                if (messageDigest != null) {
                    messageDigest.update(bArr, i2, iVar.f2843c - i2);
                } else {
                    this.f2349c.update(bArr, i2, iVar.f2843c - i2);
                }
                j4 = ((long) (iVar.f2843c - iVar.f2842b)) + j3;
                iVar = iVar.f2846f;
                j3 = j4;
            }
        }
        return read;
    }
}
