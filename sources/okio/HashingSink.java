package okio;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import z.i;
import z.m;

/* compiled from: XFMFile */
public final class HashingSink extends ForwardingSink {

    /* renamed from: b  reason: collision with root package name */
    public final MessageDigest f2346b;

    /* renamed from: c  reason: collision with root package name */
    public final Mac f2347c;

    public HashingSink(Sink sink, String str) {
        super(sink);
        try {
            this.f2346b = MessageDigest.getInstance(str);
            this.f2347c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public HashingSink(Sink sink, ByteString byteString, String str) {
        super(sink);
        try {
            Mac instance = Mac.getInstance(str);
            this.f2347c = instance;
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.f2346b = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA1");
    }

    public static HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, DefaultCrypto.HMAC_SHA256);
    }

    public static HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA512");
    }

    public static HashingSink md5(Sink sink) {
        return new HashingSink(sink, "MD5");
    }

    public static HashingSink sha1(Sink sink) {
        return new HashingSink(sink, "SHA-1");
    }

    public static HashingSink sha256(Sink sink) {
        return new HashingSink(sink, "SHA-256");
    }

    public static HashingSink sha512(Sink sink) {
        return new HashingSink(sink, "SHA-512");
    }

    public ByteString hash() {
        MessageDigest messageDigest = this.f2346b;
        return ByteString.of(messageDigest != null ? messageDigest.digest() : this.f2347c.doFinal());
    }

    public void write(Buffer buffer, long j2) {
        m.b(buffer.f2324b, 0, j2);
        i iVar = buffer.f2323a;
        long j3 = 0;
        while (j3 < j2) {
            int min = (int) Math.min(j2 - j3, (long) (iVar.f2843c - iVar.f2842b));
            byte[] bArr = iVar.f2841a;
            MessageDigest messageDigest = this.f2346b;
            if (messageDigest != null) {
                messageDigest.update(bArr, iVar.f2842b, min);
            } else {
                this.f2347c.update(bArr, iVar.f2842b, min);
            }
            j3 += (long) min;
            iVar = iVar.f2846f;
        }
        super.write(buffer, j2);
    }
}
