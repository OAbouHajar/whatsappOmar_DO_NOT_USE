package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.1uL  reason: invalid class name and case insensitive filesystem */
public class C40571uL {
    public static List A00;

    public static boolean A00(C14710pd r4, Jid jid) {
        if (jid != null) {
            C16620tM r2 = C16620tM.A02;
            if (r4.A0E(r2, 1377)) {
                List list = A00;
                if (list == null) {
                    String A06 = r4.A06(r2, 1607);
                    if (!TextUtils.isEmpty(A06)) {
                        AnonymousClass00B.A06(A06);
                        list = Arrays.asList(A06.split(","));
                        A00 = list;
                    }
                }
                return list.contains(jid.user);
            }
        }
        return false;
    }

    public static boolean A01(C14710pd r3, AnonymousClass1WU r4) {
        C15830rv r0 = r4.A11.A00;
        AnonymousClass00B.A06(r0);
        String rawString = r0.getRawString();
        String A06 = r3.A06(C16620tM.A02, 1924);
        return !TextUtils.isEmpty(A06) && rawString.equals(A06);
    }

    public static boolean A02(C14710pd r5, C39731sy r6) {
        if (2 == r6.A03) {
            String str = r6.A05;
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                return parse.getHost().contains("whatsapp.com") && parse.getPath().equals("/survey/") && (queryParameterNames.contains("oid") || queryParameterNames.contains("session")) && r5.A0E(C16620tM.A02, 1377);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("InAppSurveyUtils/isInAppSurveyURL/<");
                sb.append(str);
                sb.append("> is not a valid URL. Error=");
                sb.append(e2);
                Log.e(sb.toString());
            }
        }
    }
}
