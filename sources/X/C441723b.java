package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.23b  reason: invalid class name and case insensitive filesystem */
public final class C441723b {
    public static final C83814Id A00(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String A06;
        int length;
        JniBridge jniBridge2 = jniBridge;
        C18450wi.A0H(jniBridge, 0);
        C18450wi.A0H(str, 1);
        byte[] bArr4 = bArr;
        C18450wi.A0H(bArr4, 2);
        C18450wi.A0H(userJid, 4);
        int length2 = bArr4.length;
        if (length2 != 32) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageAddOnEncUtils/");
            sb.append("encryptEncReactionMessage: invalid message_secret secretSize=");
            sb.append(length2);
            A06 = sb.toString();
        } else {
            byte[] bArr5 = new byte[12];
            C003601p.A00().nextBytes(bArr5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(userJid.getRawString());
            sb2.append(userJid2.getRawString());
            sb2.append(str2);
            byte[] A00 = C40771uf.A00(bArr4, sb2.toString().getBytes(AnonymousClass4BJ.A05), 32);
            C18450wi.A0B(A00);
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = jniBridge2.WCIAPIGcmAesCreateEncryptedCiphertext(A00, bArr5, bArr3, bArr2, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext != null && (length = WCIAPIGcmAesCreateEncryptedCiphertext.length) != 0) {
                return new C83814Id(C28631Ww.A01(bArr5, 0, 12), C28631Ww.A01(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length));
            }
            A06 = C18450wi.A06("MessageAddOnEncUtils/", "encryptEncAddOnMessage encryption values are invalid");
        }
        Log.e(A06);
        return null;
    }

    public static final byte[] A01(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        StringBuilder sb;
        String str3;
        C18450wi.A0H(jniBridge, 3);
        byte[] bArr5 = bArr4;
        int length = bArr5.length;
        if (length != 32) {
            sb = new StringBuilder();
            sb.append("MessageAddOnEncUtils/");
            str3 = "decryptEncMessage: invalid message_secret secretSize=";
        } else {
            byte[] bArr6 = bArr;
            length = bArr6.length;
            if (length != 12) {
                sb.append("MessageAddOnEncUtils/");
                str3 = "decryptEncMessage: invalid encIv ivSize=";
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(userJid.getRawString());
                sb.append(userJid2.getRawString());
                sb.append(str2);
                byte[] A00 = C40771uf.A00(bArr5, sb.toString().getBytes(AnonymousClass4BJ.A05), 32);
                C18450wi.A0B(A00);
                return (byte[]) JniBridge.jvidispatchOIOOOOO(3, (long) 16, jniBridge.wajContext.get(), A00, bArr6, bArr2, bArr3);
            }
        }
        sb.append(str3);
        sb.append(length);
        Log.e(sb.toString());
        return null;
    }
}
