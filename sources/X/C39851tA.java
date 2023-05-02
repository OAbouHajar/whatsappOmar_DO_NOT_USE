package X;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1tA  reason: invalid class name and case insensitive filesystem */
public class C39851tA {
    public static C93524jL A00(C26071Mf r6, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("\\D", "");
            if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
                try {
                    AnonymousClass3HS A0E = r6.A0E(replaceAll, str3.toUpperCase(Locale.US));
                    return new C93524jL(String.valueOf(A0E.countryCode_), String.valueOf(A0E.nationalNumber_), str2);
                } catch (C803443m e2) {
                    Log.w("parsePhoneNumber/exception", e2);
                }
            }
            String A02 = A02(replaceAll);
            if (A02 != null) {
                return new C93524jL(A02, replaceAll.substring(A02.length()), str2);
            }
        }
        return null;
    }

    public static String A01(AnonymousClass01V r3, C16980tz r4, C16260sj r5) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!r5.A0C()) {
            Log.i("verifynumber/getphonennumber/permission denied");
        } else {
            if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(r4.A00).getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo number : activeSubscriptionInfoList) {
                    String number2 = number.getNumber();
                    if (number2 != null) {
                        return number2;
                    }
                }
            }
            try {
                TelephonyManager A0N = r3.A0N();
                if (A0N != null) {
                    return A0N.getLine1Number();
                }
            } catch (Exception e2) {
                Log.w("verifynumber/getphonennumber/error ", e2);
                return null;
            }
        }
        return null;
    }

    public static String A02(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str.replaceAll("\\D", ""));
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static List A03(C26071Mf r6, AnonymousClass01V r7, C16260sj r8) {
        C93524jL A00;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        if (!r8.A0C()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0M = r7.A0M();
            if (!(A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null)) {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    C93524jL A002 = A00(r6, next.getNumber(), next.getCarrierName().toString(), next.getCountryIso());
                    if (A002 != null) {
                        arrayList.add(A002);
                    }
                }
            }
        } else {
            try {
                TelephonyManager A0N = r7.A0N();
                if (!(A0N == null || (A00 = A00(r6, A0N.getLine1Number(), A0N.getNetworkOperatorName(), A0N.getSimCountryIso())) == null)) {
                    arrayList.add(A00);
                    return arrayList;
                }
            } catch (Exception e2) {
                Log.w("verifynumber/getphonennumbers/error ", e2);
                return arrayList;
            }
        }
        return arrayList;
    }
}
