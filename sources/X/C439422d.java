package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.22d  reason: invalid class name and case insensitive filesystem */
public class C439422d implements C19550yc {
    public C439522e A00;
    public final UserJid A01;
    public final C17190ug A02;

    public C439422d(UserJid userJid, C17190ug r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public final void A00() {
        C439522e r2 = this.A00;
        if (r2 != null) {
            UserJid userJid = this.A01;
            Log.e("DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureError");
            AnonymousClass16N r0 = r2.A00;
            r0.A04(userJid);
            r0.A04.AcB("direct-connection-get-phone-signature-error-response", "", false);
        }
    }

    public void APb(String str) {
        A00();
    }

    public void AQe(C28371Vv r3, String str) {
        StringBuilder sb = new StringBuilder("GetPhoneNumberSignature/delivery-error with iqId ");
        sb.append(str);
        Log.w(sb.toString());
        A00();
    }

    public void AYG(C28371Vv r19, String str) {
        C16300so r1;
        String str2;
        C28371Vv A0J = r19.A0J("signed_user_info");
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("phone_number");
            C28371Vv A0J3 = A0J.A0J("ttl_timestamp");
            C28371Vv A0J4 = A0J.A0J("phone_number_signature");
            C28371Vv A0J5 = A0J.A0J("business_domain");
            if (!(A0J2 == null || A0J3 == null || A0J4 == null || A0J5 == null)) {
                String A0L = A0J2.A0L();
                String A0L2 = A0J3.A0L();
                String A0L3 = A0J4.A0L();
                String A0L4 = A0J5.A0L();
                if (!TextUtils.isEmpty(A0L) && !TextUtils.isEmpty(A0L2) && !TextUtils.isEmpty(A0L3) && !TextUtils.isEmpty(A0L4)) {
                    C439522e r10 = this.A00;
                    if (r10 != null) {
                        UserJid userJid = this.A01;
                        Log.i("DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureSuccess");
                        AnonymousClass16N r3 = r10.A00;
                        String str3 = r3.A02;
                        if (TextUtils.isEmpty(str3)) {
                            C15860rz r12 = r3.A08;
                            str3 = r12.A0R(userJid.getRawString());
                            if (TextUtils.isEmpty(str3)) {
                                String rawString = userJid.getRawString();
                                StringBuilder sb = new StringBuilder("dc_default_postcode_");
                                sb.append(rawString);
                                str3 = ((SharedPreferences) r12.A01.get()).getString(sb.toString(), (String) null);
                            }
                        }
                        if (str3 == null) {
                            r3.A04(userJid);
                            r1 = r3.A04;
                            str2 = "direct-connection-empty-postcode";
                        } else {
                            C17290uq r0 = r3.A09;
                            UserJid userJid2 = r10.A01;
                            C84694Ln r102 = (r0.A05(userJid2) || r3.A08.A0R(userJid2.getRawString()) != null) ? new C84694Ln(A0L, A0L2, A0L3, str3) : new C84694Ln((String) null, A0L2, (String) null, str3);
                            if (r3.A0A.A0E(C16620tM.A02, 1867)) {
                                C15860rz r02 = r3.A07.A00;
                                C15860rz r17 = r02;
                                String string = ((SharedPreferences) r02.A01.get()).getString("latest_biz_backend_request_id", (String) null);
                                C84694Ln r13 = null;
                                if (string != null) {
                                    if (string.equals("252")) {
                                        r13 = new C84694Ln(A0L, A0L2, A0L3, str3);
                                    }
                                    r17.A0K().remove("latest_biz_backend_request_id").apply();
                                    if (r13 != null) {
                                        r102 = r13;
                                    }
                                }
                            }
                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US);
                                String str4 = r102.A03;
                                Date parse = simpleDateFormat.parse(str4);
                                if (parse != null) {
                                    try {
                                        String str5 = r102.A02;
                                        if (TextUtils.isEmpty(str5)) {
                                            Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Empty postcode");
                                            r3.A04.AcB("direct-connection-empty-postcode", "", false);
                                        } else {
                                            String A002 = r3.A00(userJid);
                                            if (A002 == null) {
                                                Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate");
                                                r3.A04.AcB("direct-connection-failed-to-load-certificate-from-preferences", "", false);
                                            } else {
                                                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode(A002, 2)));
                                                if (!A0L4.equals(AnonymousClass16J.A00(x509Certificate.getSubjectX500Principal().getName()))) {
                                                    Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Incorrect CN in certificate");
                                                    r3.A04.AcB("direct-connection-certificate-common-name-mismatch", "", false);
                                                    r3.A08.A0n(userJid.getRawString());
                                                } else {
                                                    AnonymousClass16J r6 = r3.A06;
                                                    JSONObject jSONObject = new JSONObject();
                                                    String str6 = r102.A00;
                                                    if (str6 != null) {
                                                        jSONObject.put("phone_number", str6);
                                                    }
                                                    jSONObject.put("ttl_timestamp", str4);
                                                    String str7 = r102.A01;
                                                    if (str7 != null) {
                                                        jSONObject.put("phone_number_signature", str7);
                                                    }
                                                    jSONObject.put("postcode", str5);
                                                    String A003 = r6.A03(jSONObject.toString(), x509Certificate.getPublicKey()).A00();
                                                    if (A003 != null) {
                                                        C15860rz r62 = r3.A08;
                                                        String rawString2 = userJid.getRawString();
                                                        SharedPreferences.Editor A0K = r62.A0K();
                                                        StringBuilder sb2 = new StringBuilder("dc_business_domain_");
                                                        sb2.append(rawString2);
                                                        A0K.putString(sb2.toString(), A0L4).apply();
                                                        if (r3.A02 == null) {
                                                            String rawString3 = userJid.getRawString();
                                                            SharedPreferences.Editor A0K2 = r62.A0K();
                                                            StringBuilder sb3 = new StringBuilder("smb_business_direct_connection_enc_string_");
                                                            sb3.append(rawString3);
                                                            A0K2.putString(sb3.toString(), A003).apply();
                                                            String rawString4 = userJid.getRawString();
                                                            long time = parse.getTime();
                                                            SharedPreferences.Editor A0K3 = r62.A0K();
                                                            StringBuilder sb4 = new StringBuilder("smb_business_direct_connection_enc_string_expired_timestamp_");
                                                            sb4.append(rawString4);
                                                            A0K3.putLong(sb4.toString(), time).apply();
                                                        } else {
                                                            r3.A01 = A003;
                                                            r3.A00 = parse.getTime();
                                                        }
                                                        r3.A05(userJid);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (IllegalArgumentException | GeneralSecurityException | JSONException e2) {
                                        Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/", e2);
                                        r3.A04.AcB("direct-connection-fail-to-generate-encryption-string", e2.toString(), false);
                                    }
                                    r3.A04(userJid);
                                    return;
                                }
                            } catch (ParseException e3) {
                                Log.e("DirectConnectionManager/getExpirationDateFromSignedUserInfo/Invalid timestamp", e3);
                            }
                            r3.A04(userJid);
                            r1 = r3.A04;
                            str2 = "direct-connection-invalid-expiration-date";
                        }
                        r1.AcB(str2, "", false);
                        return;
                    }
                    return;
                }
            }
        }
        A00();
    }
}
