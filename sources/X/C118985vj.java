package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.5vj  reason: invalid class name and case insensitive filesystem */
public class C118985vj {
    public KeyStore A00;
    public final AnonymousClass1Vo A01;
    public final C116505rU A02;

    public C118985vj(Context context, C16440t3 r7, C17020u3 r8) {
        AnonymousClass1Vo A002 = AnonymousClass1Vo.A00("CLKeyStorageManager", "onboarding", "IN");
        this.A01 = A002;
        this.A02 = new C116505rU(r8);
        C18300wT r2 = new C18300wT(r7, r8);
        if (Build.VERSION.SDK_INT >= 18 && !C110115dX.A17(r2.A01(), "psp_test_tool_enabled")) {
            try {
                A002.A06("initializing KS");
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
                A04(context);
            } catch (Exception e2) {
                this.A01.A08("onboarding", (String) null, e2);
                throw C110115dX.A0Z(e2);
            }
        }
    }

    public String A00() {
        SharedPreferences sharedPreferences = this.A02.A00;
        String string = sharedPreferences.getString("k0", "");
        return (this.A00 == null || !sharedPreferences.getBoolean("use_ks", false)) ? string : A02("k0", "aes_k0", string);
    }

    public String A01() {
        SharedPreferences sharedPreferences = this.A02.A00;
        String string = sharedPreferences.getString("token", "");
        return (this.A00 == null || !sharedPreferences.getBoolean("use_ks", false)) ? string : A02("token", "aes_token", string);
    }

    public final String A02(String str, String str2, String str3) {
        try {
            this.A01.A09("onboarding", "decrypt the key", new C40001tP[]{new C40001tP("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            byte[] decode = Base64.decode(str3, 0);
            byte[] bArr = new byte[16];
            System.arraycopy(decode, 0, bArr, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            int length = decode.length - 16;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, 16, bArr2, 0, length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                Cipher instance = Cipher.getInstance(i2 >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                instance.init(2, secretKeySpec, ivParameterSpec);
                return AnonymousClass5xS.A00(instance.doFinal(bArr2));
            }
            throw new IllegalArgumentException();
        } catch (Exception e2) {
            Log.w(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("PAY")));
            throw C110115dX.A0Z(e2);
        }
    }

    public final String A03(String str, String str2, String str3) {
        try {
            this.A01.A09("onboarding", " encrypt the key ", new C40001tP[]{new C40001tP("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                Cipher instance = Cipher.getInstance(i2 >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
                byte[] doFinal = instance.doFinal(AnonymousClass5xS.A01(str3));
                int length = doFinal.length;
                byte[] bArr2 = new byte[(length + 16)];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(doFinal, 0, bArr2, 16, length);
                return Base64.encodeToString(bArr2, 0);
            }
            throw new IllegalArgumentException();
        } catch (Exception e2) {
            this.A01.A08("onboarding", (String) null, e2);
            throw C110115dX.A0Z(e2);
        }
    }

    public final synchronized void A04(Context context) {
        SharedPreferences sharedPreferences = this.A02.A00;
        if (!sharedPreferences.getBoolean("use_ks", false)) {
            try {
                this.A00.load((KeyStore.LoadStoreParameter) null);
                A05(context, "k0");
                A05(context, "token");
                A06("aes_k0", "k0");
                A06("aes_token", "token");
                C13680ns.A0z(sharedPreferences.edit(), "use_ks", true);
            } catch (Exception e2) {
                AnonymousClass1Vo r3 = this.A01;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(" Skip Android KeyStore setup because: ");
                r3.A08("onboarding", AnonymousClass000.A0h(e2.toString(), A0o), e2);
            }
        }
        return;
    }

    public final void A05(Context context, String str) {
        try {
            this.A01.A09("onboarding", "generate rsa key pairs for", new C40001tP[]{new C40001tP("alias", str)});
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(2, 1);
            KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("CN=");
            KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(AnonymousClass000.A0h(str, A0o))).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(build);
            instance3.generateKeyPair();
        } catch (Exception e2) {
            this.A01.A08("onboarding", (String) null, e2);
            throw C110115dX.A0Z(e2);
        }
    }

    public final void A06(String str, String str2) {
        AnonymousClass1Vo r5 = this.A01;
        r5.A09("onboarding", "generate and store aes key", new C40001tP[]{new C40001tP("alias", str2)});
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str2, (KeyStore.ProtectionParameter) null);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                Cipher instance = Cipher.getInstance(i2 >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                instance.init(1, privateKeyEntry.getCertificate().getPublicKey());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
                cipherOutputStream.write(bArr);
                cipherOutputStream.close();
                C13680ns.A0y(this.A02.A00.edit(), str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                return;
            }
            throw new IllegalArgumentException();
        } catch (Exception e2) {
            r5.A08("onboarding", (String) null, e2);
            throw C110115dX.A0Z(e2);
        }
    }

    public synchronized void A07(String str, String str2) {
        if (this.A00 != null) {
            SharedPreferences sharedPreferences = this.A02.A00;
            if (sharedPreferences.getBoolean("use_ks", false)) {
                try {
                    String A03 = A03("k0", "aes_k0", str);
                    str2 = A03("token", "aes_token", str2);
                    str = A03;
                } catch (Exception e2) {
                    C13680ns.A0z(sharedPreferences.edit(), "use_ks", false);
                    AnonymousClass1Vo r3 = this.A01;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(" Skip using Android KeyStore ");
                    r3.A08("onboarding", AnonymousClass000.A0h(e2.toString(), A0o), e2);
                }
            }
        }
        SharedPreferences sharedPreferences2 = this.A02.A00;
        C13680ns.A0y(sharedPreferences2.edit(), "k0", str);
        C13680ns.A0y(sharedPreferences2.edit(), "token", str2);
    }

    public final byte[] A08(byte[] bArr, String str) {
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str, (KeyStore.ProtectionParameter) null);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                Cipher instance = Cipher.getInstance(i2 >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                instance.init(2, privateKeyEntry.getPrivateKey());
                CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), instance);
                ArrayList A0u = AnonymousClass000.A0u();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    A0u.add(Byte.valueOf((byte) read));
                }
                int size = A0u.size();
                byte[] bArr2 = new byte[size];
                for (int i3 = 0; i3 < size; i3++) {
                    bArr2[i3] = ((Byte) A0u.get(i3)).byteValue();
                }
                return bArr2;
            }
            throw new IllegalArgumentException();
        } catch (Exception e2) {
            this.A01.A08("onboarding", (String) null, e2);
            throw C110115dX.A0Z(e2);
        }
    }
}
