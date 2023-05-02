package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5uA  reason: invalid class name and case insensitive filesystem */
public class C118115uA {
    public final String A00;
    public final AnonymousClass5wB A01;

    public C118115uA(String str, AnonymousClass5wB r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public AnonymousClass636 A00(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            String string = jSONObject2.getString("txnId");
            String string2 = jSONObject2.getString("credential");
            Matcher A0k = C110115dX.A0k(str, "\\{([^}]*)\\}");
            StringBuffer stringBuffer = new StringBuffer();
            AnonymousClass636 r3 = null;
            if (A0k.find()) {
                String group = A0k.group();
                String substring = group.substring(1, group.length() - 1);
                try {
                    AnonymousClass5wB r8 = this.A01;
                    String str5 = this.A00;
                    if (str5 == null || !str5.isEmpty()) {
                        ArrayList A0u = AnonymousClass000.A0u();
                        for (C117155sX r1 : AnonymousClass5wB.A01) {
                            if (r1.A00.equals(str5)) {
                                A0u.add(r1);
                            }
                        }
                        if (A0u.size() != 0) {
                            C117155sX r7 = (C117155sX) A0u.get(new SecureRandom().nextInt(A0u.size()));
                            r8.A00 = r7.A02;
                            StringBuilder sb = new StringBuilder(500);
                            String encodeToString = Base64.encodeToString(AnonymousClass5xS.A04(AnonymousClass5xS.A02(substring), AnonymousClass5xS.A01(str4)), 2);
                            sb.append(string2);
                            C110115dX.A15(sb, "|", string);
                            sb.append(encodeToString);
                            byte[] bytes = sb.toString().getBytes();
                            PublicKey A0h = C110115dX.A0h(Base64.decode(r8.A00.getBytes("utf-8"), 2));
                            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                            instance.init(1, A0h);
                            AnonymousClass636 r0 = new AnonymousClass636(new AnonymousClass637(r7.A01, r7.A00, Base64.encodeToString(instance.doFinal(bytes), 2)));
                            r3 = r0;
                            r0.type = str2;
                            r0.subType = str3;
                            AnonymousClass637 r2 = r0.data;
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("2.0|");
                            r2.encryptedBase64String = AnonymousClass000.A0h(r2.encryptedBase64String, A0o);
                            A0k.appendReplacement(stringBuffer, Matcher.quoteReplacement(r3.data.encryptedBase64String.replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "")));
                        } else {
                            throw new C115065p3(C114785ob.KEY_CODE_INVALID);
                        }
                    } else {
                        throw new C115065p3(C114785ob.KEY_CODE_EMPTY);
                    }
                } catch (Exception unused) {
                    throw new C115065p3(C114785ob.UNKNOWN_ERROR);
                } catch (Exception e2) {
                    throw C110115dX.A0Z(e2);
                } catch (C115065p3 e3) {
                    Log.e(AnonymousClass000.A0h(e3.toString(), AnonymousClass000.A0r("PAY: ")));
                }
            }
            if (stringBuffer.length() > 0) {
                A0k.appendTail(stringBuffer);
            }
            if (r3 != null) {
                r3.data.encryptedBase64String = stringBuffer.toString();
            }
            return r3;
        } catch (JSONException e4) {
            throw C110115dX.A0Z(e4);
        }
    }
}
