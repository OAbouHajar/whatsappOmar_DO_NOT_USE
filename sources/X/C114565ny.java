package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Locale;
import javax.crypto.Cipher;

/* renamed from: X.5ny  reason: invalid class name and case insensitive filesystem */
public class C114565ny extends C16690tT {
    public final C16300so A00;
    public final AnonymousClass69M A01;
    public final C18490wm A02;
    public final C224918d A03;
    public final C18280wR A04;
    public final String A05 = "initial";
    public final WeakReference A06;
    public final C118985vj A07;
    public final C116525rW A08;
    public final boolean A09;

    public C114565ny(C16300so r2, C112245iB r3, AnonymousClass69M r4, C18490wm r5, C224918d r6, C18280wR r7, C118985vj r8, C116525rW r9, boolean z2) {
        this.A04 = r7;
        this.A08 = r9;
        this.A00 = r2;
        this.A09 = z2;
        this.A01 = r4;
        this.A06 = new WeakReference(r3);
        this.A07 = r8;
        this.A03 = r6;
        this.A02 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        C116525rW r3 = this.A08;
        String str2 = this.A05;
        String A012 = this.A04.A01();
        boolean z2 = this.A09;
        synchronized (r3) {
            r3.A00.A09("onboarding", "getChallenge called", new C40001tP[]{new C40001tP("device_id", A012), new C40001tP("challenge_type", str2)});
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            String A002 = AnonymousClass5xS.A00(bArr);
            byte[] bArr2 = new byte[32];
            new SecureRandom().nextBytes(bArr2);
            String A003 = AnonymousClass5xS.A00(bArr2);
            if (C116525rW.A01 == null) {
                str = null;
            } else if (str2.equalsIgnoreCase("initial")) {
                C116525rW.A01.A07(A003, A002);
                StringBuilder A0q = AnonymousClass000.A0q(A002);
                C110115dX.A15(A0q, "|", A003);
                String A0h = AnonymousClass000.A0h(A012, A0q);
                try {
                    PublicKey publicKey = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(z2 ? "-----BEGIN CERTIFICATE-----\nMIIErDCCA5SgAwIBAgIKFzMa/spgXyVfATANBgkqhkiG9w0BAQsFADCB9zELMAkG\nA1UEBhMCSU4xRTBDBgNVBAoTPEluc3RpdHV0ZSBmb3IgRGV2ZWxvcG1lbnQgYW5k\nIFJlc2VhcmNoIGluIEJhbmtpbmcgVGVjaG5vbG9neTEdMBsGA1UECxMUQ2VydGlm\neWluZyBBdXRob3JpdHkxDzANBgNVBBETBjUwMDA1NzEXMBUGA1UECBMOQW5kaHJh\nIFByYWRlc2gxKTAnBgNVBAkTIFJvYWQgTm8uMSwgTWFzYWIgVGFuaywgSHlkZXJh\nYmFkMRUwEwYDVQQzEwxDYXN0bGUgSGlsbHMxFjAUBgNVBAMTDUlEUkJUIENBIDIw\nMTQwHhcNMTYwMzMxMTIwMzUyWhcNMTgwMzMxMTIwMzUyWjASMRAwDgYDVQQDEwd1\ncGlucGNpMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsqMattxoTibl\naGsAneFo5TgFfvRltQ2CqteIgUVJlLMz95P35Y+GQc2EOjVEO0L1OUd5IDTIBaqh\nrTqeWypOyna+CsHPqDRY0vsklCYizw/VQkdwLBZHMMhU4jL4wciE7qcf2kdyri6B\n135SzUF5IGPn4SnSkeB3IqHzneUrabP0lJweLF7IU5l9qtpPa6A5cH1iVKQT5YAI\n4NWH+3E/MRNKvdqgU1PILlOEaVB0vJZ1pBWW1aMaecoHfzC8/pTfM2PJ5s/CDbR0\n4xqX9/AYmkt34jMwBKvboyWjD1UgCkPnJd3SaZ4vDpA+nyTITM6uGOI6e6sv/b6v\ntF7nbM3H7wIDAQABo4IBHDCCARgwDgYDVR0PAQH/BAQDAgWgMB0GA1UdDgQWBBQq\nlITKolqdgylQXHZgJ1WJMLhvnDAfBgNVHSMEGDAWgBSAdQI0B9ReDs4FarWs8BBr\nQhsHxzAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwOAYDVR0gBDEwLzAt\nBgZggmRkAgMwIzAhBggrBgEFBQcCAjAVGhNDbGFzcyAzIENlcnRpZmljYXRlMBIG\nA1UdEQQLMAmCB3VwaW5wY2kwWQYDVR0fBFIwUDAkoCKgIIYeaHR0cDovLzEwLjAu\nNjUuNjUvY3JsXzI3QjAuY3JsMCigJqAkhiJodHRwOi8vaWRyYnRjYS5vcmcuaW4v\nY3JsXzI3QjAuY3JsMA0GCSqGSIb3DQEBCwUAA4IBAQB6Y1FmD1GRKdEW4GINYutM\njDxZmHy4HGFmkE3xZjQx9aDT34TpLSNpsg8jUF+nW/KUMb+nWKJuIRZESYfBSCS9\n2fP1AJAO+PKopJMep/weJ+6a0ydPeoKbqKYllTlmFy+DPC56/UuEBQ9iIX3n5RW9\nxZFTB3NFC9A8zhxCBTsxizElrP8Jd4s+I3+qzJIw9ZqGknDgipyYoi0GGx2mjfwH\npg4YQ4/2xjG2ZRQwkgEmcxy/NvbXz1NV5P5u7dit9SwX3gaAZybu2guIcLFcVEvw\n1VpioZlgPjr5RVhyGzX+tBS8rapTNG1C8A7ANLxpk3nqYzNh4XjhMm5EQ3oKDD9d\n-----END CERTIFICATE-----".getBytes(DefaultCrypto.UTF_8) : "-----BEGIN CERTIFICATE-----\nMIID9zCCAt+gAwIBAgIJAIM6xLWVJlOZMA0GCSqGSIb3DQEBCwUAMIGRMQswCQYD\nVQQGEwJJTjESMBAGA1UECAwJVGFtaWxOYWR1MRAwDgYDVQQHDAdDaGVubmFpMQ0w\nCwYDVQQKDAROUENJMQwwCgYDVQQLDANVUEkxGzAZBgNVBAMMEnVwaXVhdC5ucGNp\nLm9yZy5pbjEiMCAGCSqGSIb3DQEJARYTdmliZWV0aEBucGNpLm9yZy5pbjAeFw0x\nNzEyMDcxMDQ2MjRaFw0yNzA5MDkxMDQ2MjRaMIGRMQswCQYDVQQGEwJJTjESMBAG\nA1UECAwJVGFtaWxOYWR1MRAwDgYDVQQHDAdDaGVubmFpMQ0wCwYDVQQKDAROUENJ\nMQwwCgYDVQQLDANVUEkxGzAZBgNVBAMMEnVwaXVhdC5ucGNpLm9yZy5pbjEiMCAG\nCSqGSIb3DQEJARYTdmliZWV0aEBucGNpLm9yZy5pbjCCASIwDQYJKoZIhvcNAQEB\nBQADggEPADCCAQoCggEBALjCsVn8tFnD6ffJrgVmusoaZm+mRmRkih0SDr9OVJSD\neU21D5eshHq4e1o9Picin7Dp7UXQFYZCyRkaB8B+oBBHhTR4Hu5D3mvwd93EAG6m\nt/Zpz+RdWmmU97YyZyq3yNVrptHK3W+3QDM37eCSCzhGvrN1IeznWBJf16exIrHU\nqCd+OQo9C03y2REM0XVRqL12a3ywcicrB9dVfbQ6yFb++Qv91J3cIx7dza6szQaF\nDIeVWURZHMLnm1AJISHneYL6MrCcHdMmBqwFFza1ySQ0wI+XYgrmrFsn1mUfZbF+\nZdeIXcRfpamnUf6YCCOdw1uaBMtizF4L7drv6pkppfMCAwEAAaNQME4wHQYDVR0O\nBBYEFOMI3fS6ZLwKnCvoH1xuEIWAy3eWMB8GA1UdIwQYMBaAFOMI3fS6ZLwKnCvo\nH1xuEIWAy3eWMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQELBQADggEBAJ4YflNo\nezlsuRbr8asboMw5kH0F6VpmozNxkDGbwLFGx7cVZ5m9xpmPr2eOA4uk598mFJqv\nG+6fx3naM1s7WtaEXB4L9eHCv2nPdYKav6GrB7aabXb2Y5IasIG1aa7oX+V6aw0z\nYufLTIv3Awy7Qp6lgGDvnd0zL3wJqS3kY80CpOFhLwifpPXUA0NMBU6kg1+R0fex\njKAOiC9OkDXmj0Uljeb3AbwE3jZgonoIwcbP8rSc5hN3uxUJyIfNzEzAmHGraP0M\nTPqEocFcvnj8VFJPr94MSZ9CnVUwdLlXTiWYoGkBL6tngh9MSHEaocW1M64Wp85Y\nurWQmF18TeJcJ4k=\n-----END CERTIFICATE-----\n".getBytes(DefaultCrypto.UTF_8))).getPublicKey();
                    if (A0h.getBytes().length <= publicKey.getEncoded().length) {
                        byte[] bytes = A0h.getBytes();
                        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        instance.init(1, publicKey);
                        str = Base64.encodeToString(instance.doFinal(bytes), 2);
                    } else {
                        throw AnonymousClass000.A0T("RSA cannot encrypt data larger than key-size.");
                    }
                } catch (CertificateException e2) {
                    throw C110115dX.A0Z(e2);
                } catch (CertificateException e3) {
                    throw C110115dX.A0Z(e3);
                } catch (UnsupportedEncodingException e4) {
                    throw new Error(e4);
                } catch (Exception e5) {
                    throw C110115dX.A0Z(e5);
                }
            } else if (str2.equalsIgnoreCase("rotate")) {
                String A004 = C116525rW.A01.A00();
                StringBuilder A0q2 = AnonymousClass000.A0q(A002);
                C110115dX.A15(A0q2, "|", A003);
                str = Base64.encodeToString(AnonymousClass5xS.A04(AnonymousClass000.A0h(A012, A0q2).getBytes(), AnonymousClass5xS.A01(A004)), 0);
                C116525rW.A01.A07(A003, A002);
            } else {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Unsupported challenge type: ");
                throw new UnsupportedOperationException(AnonymousClass000.A0h(str2, A0o));
            }
        }
        return str;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
            C112245iB r8 = (C112245iB) this.A06.get();
            if (r8 != null) {
                String str2 = this.A05;
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                    Log.i("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type/challenge");
                } else {
                    Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                    if (!TextUtils.isEmpty(str)) {
                        r8.A06.AgB();
                        C17190ug r11 = r8.A02;
                        String A022 = r11.A02();
                        String A012 = r8.A07.A01();
                        String A082 = r8.A03.A08();
                        String lowerCase = str2.toLowerCase(Locale.US);
                        C51812cK r1 = new C51812cK(A022);
                        C32461gQ A0X = C110105dW.A0X();
                        C32461gQ A0Y = C110105dW.A0Y(A0X);
                        C32461gQ.A00(A0Y, "action", "upi-get-token");
                        if (C32271fx.A0D(str, 0, 1000, false)) {
                            C32461gQ.A00(A0Y, "challenge", str);
                        }
                        if (C32271fx.A0D(A012, 1, 1000, false)) {
                            C32461gQ.A00(A0Y, "device-id", A012);
                        }
                        if (A082 != null && C32271fx.A0D(A082, 1, 10, true)) {
                            C32461gQ.A00(A0Y, "provider-type", A082);
                        }
                        A0Y.A0A(lowerCase, "token-type", C115655q6.A00);
                        C28371Vv A0T = C110105dW.A0T(A0Y, A0X, r1);
                        AnonymousClass4XO r10 = r8.A00;
                        r10.A04("upi-get-token");
                        r11.A0A(new IDxNCallbackShape95S0100000_3_I1(r8.A00, r8.A01, r8, r8.A05, r10), A0T, A022, 204, 0);
                    }
                }
            }
        } else {
            AnonymousClass69M r0 = this.A01;
            if (r0 != null) {
                r0.ARm();
            }
            this.A00.AcB("payments/indiaupi", "Failed to get Challenge", true);
        }
        C118535uq.A0C = null;
    }
}
