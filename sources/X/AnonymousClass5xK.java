package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5xK  reason: invalid class name */
public class AnonymousClass5xK {
    public final AnonymousClass1G1 A00;
    public final AnonymousClass01V A01;
    public final C16980tz A02;
    public final AnonymousClass60V A03;
    public final AnonymousClass61W A04;
    public final AnonymousClass1Vo A05;

    public AnonymousClass5xK(C16980tz r1, AnonymousClass01V r2, AnonymousClass1Vo r3, AnonymousClass1G1 r4, AnonymousClass61W r5, AnonymousClass60V r6) {
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A03 = r6;
    }

    public static SmsManager A00(int i2) {
        return SmsManager.getSmsManagerForSubscriptionId(i2);
    }

    private String A01(SubscriptionInfo subscriptionInfo) {
        boolean isEmpty;
        if (Build.VERSION.SDK_INT < 29) {
            return subscriptionInfo.getIccId();
        }
        AnonymousClass1Vo r2 = this.A05;
        StringBuilder A0r = AnonymousClass000.A0r("Sub Id : ");
        A0r.append(subscriptionInfo.getSubscriptionId());
        C110105dW.A1L(r2, A0r);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(subscriptionInfo.getSubscriptionId());
        AnonymousClass60V r4 = this.A03;
        synchronized (r4) {
            isEmpty = true ^ TextUtils.isEmpty(r4.A0U("device_binding_sim_iccid")[0]);
        }
        return AnonymousClass000.A0h(isEmpty ? "" : C110115dX.A0c(this.A02.A00), A0o);
    }

    public static List A02(Context context) {
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        ArrayList A0u = AnonymousClass000.A0u();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() == 2) {
            A0u.add(((SubscriptionInfo) C13690nt.A0Z(activeSubscriptionInfoList)).getNumber());
            A0u.add(activeSubscriptionInfoList.get(1).getNumber());
        }
        return A0u;
    }

    public int A03(C112265iD r20, String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        this.A05.A06("IndiaUpiSimSwapDetectionUtils : Check sim on version >= 22");
        SubscriptionManager A0M = this.A01.A0M();
        if (A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null || activeSubscriptionInfoList.isEmpty()) {
            this.A05.A06("IndiaUpiSimSwapDetectionUtils : No subscription info found");
            return 1;
        }
        String A0A = this.A03.A0A();
        JSONObject A0J = C13700nu.A0J();
        JSONObject A0J2 = C13700nu.A0J();
        int i2 = 1;
        boolean z2 = false;
        int i3 = 0;
        for (SubscriptionInfo next : activeSubscriptionInfoList) {
            JSONObject A0J3 = C13700nu.A0J();
            JSONObject A0J4 = C13700nu.A0J();
            String A012 = A01(next);
            String number = next.getNumber();
            AnonymousClass1Vo r1 = this.A05;
            StringBuilder A0r = AnonymousClass000.A0r("checkSimWithWaRegisteredNumberIsInstalled simId : ");
            A0r.append(AnonymousClass5x3.A01(A012));
            A0r.append(" | storedId : ");
            r1.A06(AnonymousClass000.A0h(AnonymousClass5x3.A01(A0A), A0r));
            String str2 = str;
            boolean A002 = C119295wr.A00(this.A00, this.A04, number, str2);
            AnonymousClass1Vo r13 = this.A05;
            if (A002) {
                r13.A06("Phone matched");
                return 0;
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("checkSimWithWaRegisteredNumberIsInstalled Phone number not matched | sim number : ");
            A0r2.append(number);
            A0r2.append(" | waNumber : ");
            r13.A06(AnonymousClass000.A0h(str2, A0r2));
            if (TextUtils.isEmpty(number) && (TextUtils.isEmpty(A012) || TextUtils.isEmpty(A0A) || TextUtils.equals(A012, A0A))) {
                i2 = 0;
            }
            if (!z2) {
                z2 = TextUtils.equals(A012, A0A);
            }
            try {
                A0J3.put("slotIndex", next.getSimSlotIndex());
                A0J3.put("simPhoneNumber", number);
                A0J3.put("storedId", A0A);
                A0J3.put("simId", A012);
                A0J3.put("waPhoneNumber", str2);
                A0J4.put("isSimNumberEmpty", TextUtils.isEmpty(number));
                A0J4.put("isSimIdEmpty", TextUtils.isEmpty(A012));
                A0J4.put("isStoredIdEmpty", TextUtils.isEmpty(A0A));
                A0J4.put("isSimIdMatched", TextUtils.equals(A012, A0A));
                A0J4.put("isAddPaymentAttempted", z2);
                A0J.put(AnonymousClass000.A0l(AnonymousClass000.A0q("subIndex_"), i3), A0J4);
                A0J2.put(AnonymousClass000.A0l(AnonymousClass000.A0q("subIndex_"), i3), A0J3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            i3++;
        }
        if (i2 != 0 && z2 && activeSubscriptionInfoList.size() > 1) {
            i2 = 2;
        }
        this.A05.A06(C13680ns.A0c(i2, "Fallback to ICCID match "));
        if (i2 != 0) {
            C112265iD r5 = r20;
            r5.A02 = A0J2;
            r5.A03 = A0J;
            r5.A00("SIM_SWAP", (List) null);
        }
        return i2;
    }

    public String A04(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        SubscriptionManager A0M = this.A01.A0M();
        if (!(A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null)) {
            int i2 = 0;
            int A042 = this.A03.A04();
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (A042 == next.getSubscriptionId()) {
                    i2 = next.getSimSlotIndex();
                }
                String A012 = A01(next);
                if (C119295wr.A00(this.A00, this.A04, next.getNumber(), str)) {
                    this.A05.A04("iccid matched number");
                    return A012;
                }
            }
            if (activeSubscriptionInfoList.size() > 0) {
                this.A05.A04("no matching phone number found, storing the selected iccid");
                return A01(activeSubscriptionInfoList.get(i2));
            }
        }
        return null;
    }
}
