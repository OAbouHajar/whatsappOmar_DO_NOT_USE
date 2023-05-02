package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.51N  reason: invalid class name */
public final class AnonymousClass51N implements C19550yc {
    public AnonymousClass4O6 A00;
    public final UserJid A01;
    public final C17190ug A02;

    public AnonymousClass51N(UserJid userJid, C17190ug r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public final void A00() {
        AnonymousClass4O6 r1 = this.A00;
        if (r1 != null) {
            Log.e("ExtensionsConnectionManager/loadBusinessCertInfo/onGetBusinessCertInfoError");
            C439622f r0 = r1.A01;
            if (r0 != null) {
                r0.ARf("extensions-business-cert-error-response");
            }
            r1.A00.A00.AcB("extensions-business-cert-error-response", "", false);
        }
    }

    public void APb(String str) {
        A00();
    }

    public void AQe(C28371Vv r2, String str) {
        C18450wi.A0H(str, 0);
        Log.w(C18450wi.A06("GetBusinessCertInfo/delivery-error with iqId ", str));
        A00();
    }

    public void AYG(C28371Vv r16, String str) {
        C439622f r10;
        String str2;
        String str3;
        C16300so r0;
        String str4;
        C28371Vv r1 = r16;
        C18450wi.A0H(r1, 1);
        C28371Vv A0J = r1.A0J("business_cert_info");
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("ttl_timestamp");
            C28371Vv A0J3 = A0J.A0J("issuer_cn");
            C28371Vv A0J4 = A0J.A0J("business_domain");
            if (!(A0J2 == null || A0J3 == null || A0J4 == null)) {
                String A0L = A0J2.A0L();
                String A0L2 = A0J4.A0L();
                String A0L3 = A0J3.A0L();
                if (!TextUtils.isEmpty(A0L) && !TextUtils.isEmpty(A0L3) && !TextUtils.isEmpty(A0L2)) {
                    AnonymousClass4O6 r4 = this.A00;
                    if (r4 != null) {
                        UserJid userJid = this.A01;
                        C18450wi.A0F(A0L);
                        C18450wi.A0F(A0L3);
                        C18450wi.A0F(A0L2);
                        C18450wi.A0H(A0L, 1);
                        C18450wi.A0I(A0L3, 2, A0L2);
                        Log.i("ExtensionsConnectionManager/loadBusinessCertInfo/onGetBusinessCertInfoSuccess");
                        AnonymousClass16K r9 = r4.A00;
                        try {
                            Date parse = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US).parse(A0L);
                            if (parse != null) {
                                if (!A0L2.equals(r4.A02)) {
                                    Log.e("ExtensionsConnectionManager/loadBusinessCertInfo/Incorrect Business domain in certificate");
                                    r0 = r9.A00;
                                    str4 = "extensions-invalid-domain-in-certificate";
                                } else if (!A0L3.equals(r4.A04)) {
                                    Log.e("ExtensionsConnectionManager/loadBusinessCertInfo/Incorrect Issuer CN in certificate");
                                    r0 = r9.A00;
                                    str4 = "extensions-invalid-issuer-in-certificate";
                                } else {
                                    C15860rz r2 = r9.A02;
                                    String rawString = userJid.getRawString();
                                    r2.A0K().putLong(AnonymousClass000.A0h(rawString, AnonymousClass000.A0r("galaxy_business_cert_expired_timestamp_")), parse.getTime()).apply();
                                    String str5 = r4.A03;
                                    if (str5 != null && (r10 = r4.A01) != null && (str2 = r4.A06) != null && (str3 = r4.A05) != null) {
                                        r9.A00(r10, userJid, str5, str2, str3);
                                        return;
                                    }
                                    return;
                                }
                                r0.AcB(str4, "", false);
                                r9.A02.A0o(userJid.getRawString());
                                C439622f r02 = r4.A01;
                                if (r02 != null) {
                                    r02.ARf(str4);
                                    return;
                                }
                                return;
                            }
                        } catch (ParseException e2) {
                            Log.w(C18450wi.A06("ExtensionsConnectionManager/getTtlTimestampAsDate/", e2.getMessage()));
                            r9.A00.AcB("extensions-invalid-timestamp-business-cert", e2.getMessage(), true);
                        }
                        C439622f r12 = r4.A01;
                        if (r12 != null) {
                            r12.ARf("extensions-invalid-timestamp-business-cert");
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        A00();
    }
}
