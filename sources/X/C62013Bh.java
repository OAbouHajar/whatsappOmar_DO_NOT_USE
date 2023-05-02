package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Bh  reason: invalid class name and case insensitive filesystem */
public final class C62013Bh {
    public static final Set A00;
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[5];
        boolean A1W = C13690nt.A1W(numArr, 401);
        numArr[1] = 402;
        numArr[2] = 403;
        numArr[3] = 419;
        A01 = Collections.unmodifiableSet(C13680ns.A0p(420, numArr, 4));
        Integer[] numArr2 = new Integer[5];
        AnonymousClass000.A1M(numArr2, 405, A1W ? 1 : 0);
        AnonymousClass000.A1M(numArr2, 416, 1);
        AnonymousClass000.A1M(numArr2, 417, 2);
        AnonymousClass000.A1M(numArr2, 418, 3);
        AnonymousClass000.A1M(numArr2, 421, 4);
        A00 = Collections.unmodifiableSet(new HashSet(Arrays.asList(numArr2)));
    }

    public static C16840tj A00(C16460t6 r9, C15830rv r10, C222517f r11, C33211iD r12, C16740tZ r13) {
        C35251lc r2;
        try {
            String A03 = C39801t5.A03(r12);
            if (A03 != null) {
                JSONObject A0K = C13700nu.A0K(A03);
                String string = A0K.getString("reference_id");
                String A02 = AnonymousClass3BX.A02(A03);
                if (A02 != null) {
                    String optString = A0K.getJSONObject("order").optString(FacebookFacade.RequestParameter.DESCRIPTION);
                    Iterator it = r9.A0I(r10).iterator();
                    while (it.hasNext()) {
                        C16740tZ A0V = C13680ns.A0V(it);
                        if (A0V instanceof C16840tj) {
                            C16840tj r1 = (C16840tj) A0V;
                            C16880tn AAt = r1.AAt();
                            if (!(AAt == null || (r2 = AAt.A01) == null || !string.equals(r2.A09))) {
                                int A002 = C35251lc.A00(r2.A05.A01);
                                int A003 = C35251lc.A00(A02);
                                Set set = (Set) AnonymousClass000.A0Y(C35251lc.A0F, A002);
                                if (set == null || !C13690nt.A1V(set, A003)) {
                                    if (r11 != null) {
                                        C19000xb r3 = r11.A00;
                                        C28381Vw r0 = r13.A11;
                                        C15830rv r22 = r0.A00;
                                        AnonymousClass00B.A06(r22);
                                        r3.A00(new SendOrderStatusUpdateFailureReceiptJob(r22, r0.A01));
                                    }
                                    throw new AnonymousClass23S(C13680ns.A0X());
                                }
                                AAt.A01.A05.A01 = A02;
                                if (!TextUtils.isEmpty(optString)) {
                                    AAt.A01.A05.A00 = optString;
                                }
                                r9.A0a((C16740tZ) r1);
                                return r1;
                            }
                        } else {
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ");
                            Log.e(C13680ns.A0j(A0o, A0V.A13));
                        }
                    }
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    A0o2.append("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage can not find origin checkout NFM with reference id: ");
                    Log.e(AnonymousClass000.A0h(string, A0o2));
                }
            }
            return null;
        } catch (JSONException e2) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage failed to parse parameters json", e2);
            return null;
        }
    }

    public static C16840tj A01(C16460t6 r12, C15830rv r13, C33211iD r14) {
        C35251lc r0;
        try {
            String A03 = C39801t5.A03(r14);
            if (A03 != null) {
                String string = C13700nu.A0K(A03).getString("reference_id");
                JSONObject A0K = C13700nu.A0K(A03);
                long optLong = A0K.optLong("payment_timestamp", 0);
                String optString = A0K.optString("payment_status");
                String optString2 = A0K.optString("payment_method");
                Iterator it = r12.A0I(r13).iterator();
                while (it.hasNext()) {
                    C16740tZ A0V = C13680ns.A0V(it);
                    if (A0V instanceof C16840tj) {
                        C16840tj r6 = (C16840tj) A0V;
                        C16880tn AAt = r6.AAt();
                        if (!(AAt == null || (r0 = AAt.A01) == null || !string.equals(r0.A09))) {
                            if (!TextUtils.isEmpty(optString)) {
                                AAt.A01.A02 = optString;
                            }
                            if (optLong > 0) {
                                AAt.A01.A00 = optLong;
                            }
                            if (!TextUtils.isEmpty(optString2)) {
                                AAt.A01.A01 = optString2;
                            }
                            r12.A0a((C16740tZ) r6);
                            return r6;
                        }
                    } else {
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ");
                        Log.e(C13680ns.A0j(A0o, A0V.A13));
                    }
                }
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage can not find origin checkout NFM with reference id: ");
                Log.e(AnonymousClass000.A0h(string, A0o2));
            }
            return null;
        } catch (JSONException e2) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage failed to parse parameters json", e2);
            return null;
        }
    }

    public static void A02(C14870pt r11, C16460t6 r12, C221116r r13, C109295Rm r14, AnonymousClass1MA r15, C16840tj r16, C16320sq r17) {
        C35251lc r0;
        Set set;
        C16840tj r8 = r16;
        C16880tn AAt = r8.AAt();
        C109295Rm r6 = r14;
        if (!(AAt == null || (r0 = AAt.A01) == null)) {
            C35221lZ r02 = r0.A05;
            C35241lb r1 = r02.A02;
            int A002 = C35251lc.A00(r02.A01);
            if (r1 != null && r1.A00 <= C13690nt.A09(System.currentTimeMillis()) && (set = (Set) AnonymousClass000.A0Y(C35251lc.A0F, A002)) != null && C13690nt.A1V(set, 4)) {
                String str = r8.AAt().A01.A03;
                C16460t6 r4 = r12;
                C16320sq r9 = r17;
                if (TextUtils.isEmpty(str)) {
                    r9.Acl(new RunnableRunnableShape14S0200000_I1_2(r8, 16, r12));
                    r14.AXi();
                    return;
                }
                r9.Acl(new AnonymousClass3I6(r11, r4, r13, r6, r15, r8, r9, str));
                return;
            }
        }
        r14.AXg();
    }
}
