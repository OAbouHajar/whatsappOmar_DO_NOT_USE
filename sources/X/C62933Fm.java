package X;

import android.content.SharedPreferences;
import com.mod2.fblibs.Facebook;
import com.obwhatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Fm  reason: invalid class name and case insensitive filesystem */
public final class C62933Fm implements C448025p {
    public final /* synthetic */ AnonymousClass4LD A00;

    public C62933Fm(AnonymousClass4LD r1) {
        this.A00 = r1;
    }

    public void A5s(AnonymousClass2JT r12) {
        String str;
        AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity;
        AnonymousClass4VU r1;
        String A002;
        byte[] A01;
        C18450wi.A0H(r12, 0);
        if (!AnonymousClass01E.A01()) {
            if (r12.A00 != 0 || (r1 = (AnonymousClass4VU) r12.A02.A00) == null) {
                accountLinkingNativeAuthActivity = this.A00.A02.A00;
                accountLinkingNativeAuthActivity.A05.A05();
                accountLinkingNativeAuthActivity.setResult(0);
            } else {
                AnonymousClass4LD r5 = this.A00;
                AnonymousClass1AJ r4 = r5.A00.A01;
                if (r4 != null) {
                    C35301lh r3 = r1.A00;
                    C93424jA r0 = r5.A01;
                    AnonymousClass4W9 r13 = new AnonymousClass4W9(r3, r0.A01, r0.A02);
                    AnonymousClass1AI r8 = r4.A00;
                    Object obj = r13.A00.A00;
                    Object obj2 = r13.A01.A00;
                    Object obj3 = r13.A02.A00;
                    JSONObject A0J = C13700nu.A0J();
                    A0J.put(Facebook.TOKEN, obj);
                    A0J.put("full_name", obj2);
                    A0J.put("profile_pic_url", obj3);
                    String obj4 = A0J.toString();
                    C18450wi.A0B(obj4);
                    AnonymousClass1AH r2 = r8.A00;
                    AnonymousClass14A r10 = r2.A02;
                    Charset charset = AnonymousClass01S.A0A;
                    C18450wi.A0D(charset);
                    byte[] bytes = obj4.getBytes(charset);
                    C18450wi.A0B(bytes);
                    String str2 = AnonymousClass021.A0N;
                    C35811mX A003 = r10.A00(str2, bytes);
                    if (!(A003 == null || (A002 = A003.A00()) == null)) {
                        try {
                            C35811mX A004 = AnonymousClass149.A00(new JSONArray(A002));
                            if (A004 == null || (A01 = r10.A01(A004, str2)) == null) {
                                r2.A00.AcB("XFamilyEncryptionHelper/decryptFbUserEntityJson", "Failed to decrypt fb users", true);
                                throw AnonymousClass000.A0V("Failed to decrypt fb users");
                            } else if (obj4.equals(new String(A01, charset))) {
                                AnonymousClass1AG r32 = r8.A01;
                                if (r32.A00 == null) {
                                    synchronized (AnonymousClass1AG.class) {
                                        if (r32.A00 == null) {
                                            r32.A00 = r32.A01.A00("xfamily_fb_account_file");
                                        }
                                    }
                                }
                                SharedPreferences sharedPreferences = r32.A00;
                                if (sharedPreferences != null) {
                                    C13680ns.A0y(sharedPreferences.edit(), "pref_xfamily_fb_account_info", A002);
                                    accountLinkingNativeAuthActivity = r5.A02.A00;
                                    accountLinkingNativeAuthActivity.setResult(-1);
                                    accountLinkingNativeAuthActivity.A05.A05();
                                } else {
                                    str = "Required value was null.";
                                }
                            }
                        } catch (JSONException e2) {
                            r2.A00.AcB("XFamilyAccountStore/decryptFbUsers", e2.getMessage(), true);
                            throw new IllegalStateException("Failed to decrypt fb users", e2);
                        }
                    }
                    str = "Failed to encrypt fb users";
                    r2.A00.AcB("XFamilyEncryptionHelper/encryptFbUserEntityJson", str, true);
                } else {
                    throw C18450wi.A03("fbAccountManager");
                }
            }
            accountLinkingNativeAuthActivity.finish();
            return;
        }
        str = "Check failed.";
        throw AnonymousClass000.A0V(str);
    }

    public void APZ(IOException iOException) {
        AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = this.A00.A02.A00;
        accountLinkingNativeAuthActivity.A05.A05();
        accountLinkingNativeAuthActivity.setResult(0);
        accountLinkingNativeAuthActivity.finish();
    }

    public void AQa(Exception exc) {
        AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = this.A00.A02.A00;
        accountLinkingNativeAuthActivity.A05.A05();
        accountLinkingNativeAuthActivity.setResult(0);
        accountLinkingNativeAuthActivity.finish();
    }
}
