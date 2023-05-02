package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.13u  reason: invalid class name and case insensitive filesystem */
public class C213613u implements C213713v {
    public final C16440t3 A00;
    public final C213213q A01;
    public final C213313r A02;
    public final AnonymousClass144 A03;
    public final C213413s A04;

    public C213613u(C16440t3 r2, C213213q r3, C213313r r4, C213413s r5) {
        AnonymousClass144 r0 = AnonymousClass147.A00;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r0;
    }

    public final String A00(C35301lh r6, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("operation", str2);
        jSONObject.put("timestamp", this.A00.A00() / 1000);
        jSONObject.put("client_pub_key", str);
        jSONObject.put("client_pub_key_type", "RSA 2048");
        jSONObject.put("password", str3);
        if (r6 != null) {
            Object obj = r6.A00;
            AnonymousClass00B.A06(obj);
            jSONObject.put("fbid", String.valueOf(((Number) obj).longValue()));
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AaU(X.AnonymousClass5SY r10, X.AnonymousClass4UI r11, java.lang.Integer r12, java.security.PublicKey r13, java.security.cert.X509Certificate r14) {
        /*
            r9 = this;
            r4 = r10
            java.security.KeyPair r8 = X.AnonymousClass3BS.A02()     // Catch:{ NoSuchAlgorithmException -> 0x002d }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass3BS.A01(r0)
            java.lang.String r7 = X.AnonymousClass3BS.A00()
            java.lang.String r1 = "CREATE_SHOPS_USER"
            r0 = 0
            r6 = r9
            java.lang.String r1 = r9.A00(r0, r2, r1, r7)     // Catch:{  }
            X.13q r0 = r9.A01     // Catch:{  }
            X.4MF r2 = r0.A00(r1, r14)     // Catch:{  }
            X.13s r1 = r9.A04
            r0 = 20
            X.3pv r3 = new X.3pv
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A01(r3, r2, r0)
            return
        L_0x002d:
            r0 = move-exception
            r10.AQa(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C213613u.AaU(X.5SY, X.4UI, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void AaV(AnonymousClass5SY r2, AnonymousClass4UI r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AaX(X.AnonymousClass28T r5, X.AnonymousClass5SY r6, X.AnonymousClass4UI r7, java.lang.Integer r8, java.security.PublicKey r9, java.security.cert.X509Certificate r10) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000d
            java.lang.String r1 = "User is null"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            r6.AQa(r0)
            return
        L_0x000d:
            X.1lh r0 = r5.A04
            java.lang.Object r3 = r0.A00
            X.AnonymousClass00B.A06(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.security.KeyPair r0 = X.AnonymousClass3BS.A02()     // Catch:{ NoSuchAlgorithmException -> 0x003d }
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r2 = X.AnonymousClass3BS.A01(r0)
            X.1lh r1 = r5.A03     // Catch:{  }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.13q r0 = r4.A01     // Catch:{  }
            X.4MF r3 = r0.A00(r1, r10)     // Catch:{  }
            X.13s r2 = r4.A04
            r1 = 19
            X.3pu r0 = new X.3pu
            r0.<init>(r6, r6, r4)
            r2.A01(r0, r3, r1)
            return
        L_0x003d:
            r0 = move-exception
            r6.AQa(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C213613u.AaX(X.28T, X.5SY, X.4UI, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AaY(X.AnonymousClass28T r10, X.AnonymousClass5SY r11, X.AnonymousClass4UI r12, java.lang.Integer r13, java.security.PublicKey r14, java.security.cert.X509Certificate r15) {
        /*
            r9 = this;
            r4 = r10
            X.1lh r0 = r10.A04
            java.lang.Object r3 = r0.A00
            X.AnonymousClass00B.A06(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = r11
            java.security.KeyPair r8 = X.AnonymousClass3BS.A02()     // Catch:{ NoSuchAlgorithmException -> 0x0034 }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass3BS.A01(r0)
            X.1lh r1 = r10.A03     // Catch:{  }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            r7 = r9
            java.lang.String r1 = r9.A00(r1, r2, r0, r3)     // Catch:{  }
            X.13q r0 = r9.A01     // Catch:{  }
            X.4MF r2 = r0.A00(r1, r15)     // Catch:{  }
            X.13s r1 = r9.A04
            r0 = 19
            X.31z r3 = new X.31z
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A01(r3, r2, r0)
            return
        L_0x0034:
            r0 = move-exception
            r11.AQa(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C213613u.AaY(X.28T, X.5SY, X.4UI, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }
}
