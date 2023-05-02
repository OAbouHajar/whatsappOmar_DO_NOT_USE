package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0sd  reason: invalid class name and case insensitive filesystem */
public class C16200sd {
    public static final byte[] A09 = "backup encryption".getBytes();
    public static final byte[] A0A = "metadata authentication".getBytes();
    public static final byte[] A0B = "metadata encryption".getBytes();
    public final C19000xb A00;
    public final C16270sk A01;
    public final AnonymousClass12W A02;
    public final C15860rz A03;
    public final C14710pd A04;
    public final AnonymousClass18X A05;
    public final C40761ue A06 = new C40761ue(new Random(), 3, 200);
    public final C16320sq A07;
    public final JniBridge A08;

    public C16200sd(C19000xb r6, C16270sk r7, AnonymousClass12W r8, C15860rz r9, C14710pd r10, AnonymousClass18X r11, C16320sq r12, JniBridge jniBridge) {
        this.A04 = r10;
        this.A07 = r12;
        this.A08 = jniBridge;
        this.A00 = r6;
        this.A02 = r8;
        this.A01 = r7;
        this.A03 = r9;
        this.A05 = r11;
    }

    public String A00(String str) {
        if (!TextUtils.isEmpty(str) && this.A03.A1f()) {
            try {
                C16270sk r4 = this.A01;
                byte[] A032 = r4.A03();
                boolean z2 = false;
                if (A032 != null) {
                    z2 = true;
                }
                AnonymousClass00B.A0D("root key is not defined", z2);
                byte[] A002 = C40771uf.A00(A032, A0B, 32);
                byte[] A033 = r4.A03();
                boolean z3 = false;
                if (A033 != null) {
                    z3 = true;
                }
                AnonymousClass00B.A0D("root key is not defined", z3);
                byte[] A003 = C40771uf.A00(A033, A0A, 32);
                boolean z4 = true;
                boolean z5 = false;
                if (A002.length == 32) {
                    z5 = true;
                }
                AnonymousClass00B.A0C("wrong length of enc key", z5);
                boolean z6 = false;
                if (A003.length == 32) {
                    z6 = true;
                }
                AnonymousClass00B.A0C("wrong length of auth key", z6);
                ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 2));
                int i2 = wrap.get();
                boolean z7 = false;
                if (i2 == 16) {
                    z7 = true;
                }
                StringBuilder sb = new StringBuilder("unexpected size of iv (");
                sb.append(i2);
                sb.append(")");
                AnonymousClass00B.A0C(sb.toString(), z7);
                byte[] bArr = new byte[i2];
                wrap.get(bArr);
                int i3 = wrap.get();
                if (i3 != 32) {
                    z4 = false;
                }
                StringBuilder sb2 = new StringBuilder("unexpected size of mac (");
                sb2.append(i3);
                sb2.append(")");
                AnonymousClass00B.A0C(sb2.toString(), z4);
                byte[] bArr2 = new byte[i3];
                wrap.get(bArr2);
                byte[] bArr3 = new byte[wrap.remaining()];
                wrap.get(bArr3);
                Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                instance.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
                instance.update(bArr);
                instance.update(bArr3);
                if (MessageDigest.isEqual(instance.doFinal(), bArr2)) {
                    Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance2.init(2, new SecretKeySpec(A002, "AES"), new IvParameterSpec(bArr));
                    return new String(instance2.doFinal(bArr3));
                }
                throw new SecurityException("cannot authenticate");
            } catch (SecurityException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                Log.e("EncBackupManager/failed to decrypt backup metadata", e2);
            }
        }
        return null;
    }

    public String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.A03.A1f()) {
            return str;
        }
        try {
            C16270sk r4 = this.A01;
            byte[] A032 = r4.A03();
            boolean z2 = false;
            if (A032 != null) {
                z2 = true;
            }
            AnonymousClass00B.A0D("root key is not defined", z2);
            byte[] A002 = C40771uf.A00(A032, A0B, 32);
            byte[] A033 = r4.A03();
            boolean z3 = false;
            if (A033 != null) {
                z3 = true;
            }
            AnonymousClass00B.A0D("root key is not defined", z3);
            byte[] A003 = C40771uf.A00(A033, A0A, 32);
            byte[] A0E = C004101u.A0E(16);
            boolean z4 = false;
            boolean z5 = false;
            if (A002.length == 32) {
                z5 = true;
            }
            AnonymousClass00B.A0C("wrong length of enc key", z5);
            boolean z6 = false;
            if (A003.length == 32) {
                z6 = true;
            }
            AnonymousClass00B.A0C("wrong length of auth key", z6);
            int length = A0E.length;
            if (length == 16) {
                z4 = true;
            }
            AnonymousClass00B.A0C("wrong length of iv", z4);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(A002, "AES"), new IvParameterSpec(A0E));
            byte[] doFinal = instance.doFinal(str.getBytes());
            Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance2.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
            instance2.update(A0E);
            instance2.update(doFinal);
            byte[] doFinal2 = instance2.doFinal();
            int length2 = doFinal2.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 1 + 1 + length2 + doFinal.length);
            allocate.put((byte) length);
            allocate.put(A0E);
            allocate.put((byte) length2);
            allocate.put(doFinal2);
            allocate.put(doFinal);
            return Base64.encodeToString(allocate.array(), 2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Log.e("EncBackupManager/failed to encrypt backup metadata", e2);
            return null;
        }
    }

    public void A02() {
        C15860rz r3 = this.A03;
        r3.A1O(false);
        r3.A1P(false);
        r3.A0K().putInt("encrypted_backup_fleet_migration_state", 0).apply();
        r3.A0K().putBoolean("encrypted_backup_show_forced_reg_after_logout", false).apply();
        AnonymousClass1XI.A0N(new File(this.A01.A00.A00.getFilesDir(), "encrypted_backup.key"));
        Log.i("EncBackupManager/encrypted backup has been disabled");
    }

    public void A03(String str) {
        byte[] bytes = str.getBytes();
        byte[] A0E = C004101u.A0E(64);
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = (char) bytes[i2];
        }
        try {
            this.A01.A01(new C16950tw(C004101u.A06("PBKDF2WithHmacSHA512", A0E, cArr, 100000, 512).getEncoded(), A0E, 100000));
            this.A03.A0K().putInt("encrypted_backup_num_attempts_remaining", 5).apply();
        } catch (IOException e2) {
            Log.e("EncBackupManager/storePasswordHash failed", e2);
        }
    }

    public boolean A04() {
        return this.A04.A0E(C16620tM.A02, 576) || this.A03.A1f();
    }
}
