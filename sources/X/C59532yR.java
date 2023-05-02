package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2yR  reason: invalid class name and case insensitive filesystem */
public class C59532yR extends C59562yU {
    public final C17150uc A00;
    public final AnonymousClass16N A01;
    public final AnonymousClass4D5 A02;
    public final AnonymousClass5RW A03;
    public final C17190ug A04;
    public final C18750xC A05;
    public final String A06;

    public C59532yR(C17150uc r1, AnonymousClass16N r2, AnonymousClass4D5 r3, AnonymousClass5RW r4, UserJid userJid, C17190ug r6, C18750xC r7, String str) {
        super(r1, userJid);
        this.A06 = str;
        this.A04 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r7;
    }

    public void A06() {
        AnonymousClass16N r3 = this.A01;
        UserJid userJid = this.A00;
        String str = this.A06;
        synchronized (r3) {
            r3.A02 = str;
            Map map = r3.A03;
            List list = (List) map.get(userJid);
            if (list != null) {
                list.add(this);
            } else {
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.add(this);
                map.put(userJid, A0u);
                if (C13700nu.A0E(C13680ns.A0B(r3.A08), C13680ns.A0h("smb_business_direct_connection_public_key_", userJid.getRawString())) == null) {
                    new C439122a(userJid, r3.A0B).A00(new C439222b(r3));
                } else {
                    r3.A03(userJid);
                }
            }
        }
    }

    public void A07(String str) {
        AnonymousClass16N r2 = this.A01;
        synchronized (r2) {
            r2.A02 = null;
            r2.A01 = null;
            r2.A00 = 0;
        }
        this.A03.AV3(str);
    }

    public void APb(String str) {
        this.A05.A01(str);
        A07("error");
    }

    public void AYG(C28371Vv r11, String str) {
        boolean z2;
        String str2;
        String A0L;
        UserJid userJid = this.A00;
        AnonymousClass4D5 r2 = this.A02;
        C28371Vv A0J = r11.A0J("result_code");
        String A0L2 = (A0J == null || A0J.A0L() == null) ? "invalid_postcode" : A0J.A0L();
        C28371Vv A0J2 = r11.A0J("encrypted_location_name");
        String str3 = null;
        if (!(A0J2 == null || (A0L = A0J2.A0L()) == null)) {
            AnonymousClass16J r7 = r2.A00;
            byte[] decode = Base64.decode(A0L, 0);
            try {
                byte[] bArr = r7.A00;
                if (bArr != null) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, 0, bArr.length, "AES");
                    byte[] bArr2 = r7.A01;
                    if (bArr2 != null) {
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                        instance.init(2, secretKeySpec, ivParameterSpec);
                        String str4 = new String(instance.doFinal(decode));
                        r7.A00 = null;
                        r7.A01 = null;
                        str3 = str4;
                    }
                }
            } catch (GeneralSecurityException e2) {
                Log.e(e2.getMessage());
            }
            A0L2 = "error";
        }
        AnonymousClass4H6 r8 = new AnonymousClass4H6(A0L2, str3);
        if (r8.A00 == null) {
            this.A05.A01(str);
            str2 = r8.A01;
        } else {
            AnonymousClass16N r72 = this.A01;
            synchronized (r72) {
                String str5 = r72.A01;
                if (str5 == null || r72.A00 == 0) {
                    z2 = false;
                } else {
                    C15860rz r5 = r72.A08;
                    C13680ns.A0y(r5.A0K(), C13680ns.A0h("smb_business_direct_connection_enc_string_", userJid.getRawString()), str5);
                    C13680ns.A0x(r5.A0K(), C13680ns.A0h("smb_business_direct_connection_enc_string_expired_timestamp_", userJid.getRawString()), r72.A00);
                    r72.A02 = null;
                    r72.A01 = null;
                    r72.A00 = 0;
                    z2 = true;
                }
            }
            C18750xC r0 = this.A05;
            if (z2) {
                r0.A02(str);
                this.A03.AV4(r8);
                return;
            }
            r0.A01(str);
            str2 = "error";
        }
        A07(str2);
    }
}
