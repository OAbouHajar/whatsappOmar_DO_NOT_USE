package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.13z  reason: invalid class name and case insensitive filesystem */
public final class C214113z implements C213713v {
    public final C213213q A00;
    public final C213313r A01;
    public final C214013y A02;
    public final C213913x A03;
    public final C213813w A04;
    public final AtomicInteger A05 = new AtomicInteger(0);

    public C214113z(C213213q r3, C213313r r4, C214013y r5, C213913x r6, C213813w r7) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r5, 5);
        this.A00 = r3;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
    }

    /* renamed from: A01 */
    public void AaV(AnonymousClass5SY r21, AnonymousClass4UI r22, AnonymousClass2HX r23, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18450wi.A0H(x509Certificate2, 1);
        AnonymousClass5SY r5 = r21;
        C18450wi.A0H(r5, 4);
        AnonymousClass4UI r11 = r22;
        C18450wi.A0H(r11, 5);
        this.A02.A01(C18450wi.A06("perform_backup_restore_", Integer.valueOf(this.A05.getAndIncrement())));
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            r5.AQa(new IllegalArgumentException("passwordPublicKey is null"));
            return;
        }
        Integer num2 = num;
        if (num == null) {
            r5.AQa(new IllegalArgumentException("passwordKeyId is null"));
            return;
        }
        AnonymousClass2HX r10 = r23;
        if (r23 == null) {
            r5.AQa(new IllegalArgumentException("avatar user backup data is null"));
            return;
        }
        try {
            KeyPair A022 = AnonymousClass3BS.A02();
            C18450wi.A0B(A022);
            String A012 = AnonymousClass3BS.A01(A022.getPublic());
            C18450wi.A0B(A012);
            Object obj = r10.A01.A00;
            AnonymousClass00B.A06(obj);
            C18450wi.A0B(obj);
            String str = (String) obj;
            try {
                C213813w r4 = this.A04;
                String obj2 = r4.A01(A012, r4.A00(str, publicKey2, num2.intValue())).toString();
                C18450wi.A0B(obj2);
                AnonymousClass4MF A002 = this.A00.A00(obj2, x509Certificate2);
                String A023 = r4.A02.A02();
                C18450wi.A0B(A023);
                AnonymousClass4FW r14 = new AnonymousClass4FW(A002.A01, A002.A02, A002.A00, A002.A03);
                Long valueOf = Long.valueOf(r4.A00.A00() / 1000);
                Object obj3 = r10.A00.A00;
                AnonymousClass00B.A06(obj3);
                AnonymousClass2HX r16 = r10;
                AnonymousClass4UI r142 = r11;
                AnonymousClass5SY r13 = r5;
                r4.A02(r5, new AnonymousClass38J(r14, new AnonymousClass2BJ(A023), valueOf, String.valueOf(((Number) obj3).longValue())).A00, A023, new C106855Fl(r5, this, str, A022), new C106895Fp(r13, r142, this, r16, num2, publicKey2, x509Certificate2));
            } catch (IOException e2) {
                Log.e("Password encryption IOException:", e2);
                r5.AQa(e2);
            } catch (GeneralSecurityException e3) {
                Log.e("Password encryption GeneralSecurityException:", e3);
                r5.AQa(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            Log.e("Error generating key pair:", e4);
            r5.AQa(e4);
        }
    }

    public void AaU(AnonymousClass5SY r25, AnonymousClass4UI r26, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18450wi.A0H(x509Certificate2, 0);
        AnonymousClass5SY r10 = r25;
        C18450wi.A0H(r10, 3);
        AnonymousClass4UI r18 = r26;
        C18450wi.A0H(r18, 4);
        this.A02.A01(C18450wi.A06("perform_user_creation_", Integer.valueOf(this.A05.getAndIncrement())));
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            r10.AQa(new IllegalArgumentException("passwordPublicKey is null"));
            return;
        }
        Integer num2 = num;
        if (num == null) {
            r10.AQa(new IllegalArgumentException("passwordKeyId is null"));
            return;
        }
        try {
            KeyPair A022 = AnonymousClass3BS.A02();
            C18450wi.A0B(A022);
            String A012 = AnonymousClass3BS.A01(A022.getPublic());
            C18450wi.A0B(A012);
            String A002 = AnonymousClass3BS.A00();
            C18450wi.A0B(A002);
            try {
                C213813w r7 = this.A04;
                String obj = r7.A01(A012, r7.A00(A002, publicKey2, num2.intValue())).toString();
                C18450wi.A0B(obj);
                AnonymousClass4MF A003 = this.A00.A00(obj, x509Certificate2);
                String A023 = r7.A02.A02();
                C18450wi.A0B(A023);
                AnonymousClass4FW r14 = new AnonymousClass4FW(A003.A01, A003.A02, A003.A00, A003.A03);
                Long valueOf = Long.valueOf(r7.A00.A00() / 1000);
                AnonymousClass2BJ r4 = new AnonymousClass2BJ(A023);
                C32461gQ r3 = new C32461gQ("iq");
                r3.A02(new C35081lL("xmlns", "avatars"));
                r3.A02(new C35081lL("smax_id", 100));
                r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
                C32461gQ r1 = new C32461gQ("encryption_metadata");
                C28371Vv r13 = r14.A00;
                r1.A05(r13, new ArrayList());
                List list = Collections.EMPTY_LIST;
                r1.A07(r13, list, new ArrayList());
                r3.A03(r1.A01());
                C32461gQ r132 = new C32461gQ("timestamp");
                if (C32271fx.A0B(valueOf, 1, false)) {
                    r132.A08(String.valueOf(valueOf));
                }
                r3.A03(r132.A01());
                r3.A05(r4.A00, new ArrayList());
                r4.A00(r3, list);
                AnonymousClass5SY r182 = r10;
                r7.A02(r10, r3.A01(), A023, new C106845Fk(r10, this, A002, A022), new C63493Iu(r182, r18, this, num2, publicKey2, x509Certificate2));
            } catch (IOException e2) {
                Log.e("Password encryption IOException:", e2);
                r10.AQa(e2);
            } catch (GeneralSecurityException e3) {
                Log.e("Password encryption GeneralSecurityException:", e3);
                r10.AQa(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            Log.e("Error generating key pair:", e4);
            r10.AQa(e4);
        }
    }

    public void AaX(AnonymousClass28T r19, AnonymousClass5SY r20, AnonymousClass4UI r21, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18450wi.A0H(x509Certificate2, 0);
        AnonymousClass4UI r7 = r21;
        C18450wi.A0H(r7, 5);
        this.A02.A01(C18450wi.A06("perform_user_deletion_", Integer.valueOf(this.A05.getAndIncrement())));
        C213813w r12 = this.A04;
        String A022 = r12.A02.A02();
        C18450wi.A0B(A022);
        AnonymousClass2BJ r5 = new AnonymousClass2BJ(A022);
        C32461gQ r4 = new C32461gQ("iq");
        r4.A02(new C35081lL("xmlns", "avatars"));
        r4.A02(new C35081lL("smax_id", 102));
        r4.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r4.A05(r5.A00, new ArrayList());
        r5.A00(r4, Collections.EMPTY_LIST);
        AnonymousClass5SY r6 = r20;
        r12.A02(r6, r4.A01(), A022, new AnonymousClass5FR(r6), new C106905Fq(r19, r6, r7, this, num, publicKey, x509Certificate2));
    }

    public void AaY(AnonymousClass28T r21, AnonymousClass5SY r22, AnonymousClass4UI r23, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18450wi.A0H(x509Certificate2, 0);
        AnonymousClass28T r11 = r21;
        C18450wi.A0H(r11, 1);
        AnonymousClass5SY r5 = r22;
        C18450wi.A0H(r5, 4);
        AnonymousClass4UI r10 = r23;
        C18450wi.A0H(r10, 5);
        this.A02.A01(C18450wi.A06("perform_token_refresh_", Integer.valueOf(this.A05.getAndIncrement())));
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            r5.AQa(new IllegalArgumentException("passwordPublicKey is null"));
            return;
        }
        Integer num2 = num;
        if (num == null) {
            r5.AQa(new IllegalArgumentException("passwordKeyId is null"));
            return;
        }
        try {
            KeyPair A022 = AnonymousClass3BS.A02();
            C18450wi.A0B(A022);
            String A012 = AnonymousClass3BS.A01(A022.getPublic());
            C18450wi.A0B(A012);
            Object obj = r11.A04.A00;
            AnonymousClass00B.A06(obj);
            C18450wi.A0B(obj);
            String str = (String) obj;
            try {
                C213813w r4 = this.A04;
                String obj2 = r4.A01(A012, r4.A00(str, publicKey2, num2.intValue())).toString();
                C18450wi.A0B(obj2);
                AnonymousClass4MF A002 = this.A00.A00(obj2, x509Certificate2);
                String A023 = r4.A02.A02();
                C18450wi.A0B(A023);
                AnonymousClass4FW r14 = new AnonymousClass4FW(A002.A01, A002.A02, A002.A00, A002.A03);
                Long valueOf = Long.valueOf(r4.A00.A00() / 1000);
                Object obj3 = r11.A03.A00;
                AnonymousClass00B.A06(obj3);
                AnonymousClass4UI r15 = r10;
                AnonymousClass5SY r142 = r5;
                AnonymousClass28T r13 = r11;
                r4.A02(r5, new AnonymousClass38J(r14, new AnonymousClass2BJ(A023), valueOf, String.valueOf(((Number) obj3).longValue())).A00, A023, new C106875Fn(r5, this, str, A022), new C106915Fr(r13, r142, r15, this, num2, publicKey2, x509Certificate2));
            } catch (IOException e2) {
                Log.e("Password encryption IOException:", e2);
                r5.AQa(e2);
            } catch (GeneralSecurityException e3) {
                Log.e("Password encryption GeneralSecurityException:", e3);
                r5.AQa(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            Log.e("Error generating key pair:", e4);
            r5.AQa(e4);
        }
    }
}
