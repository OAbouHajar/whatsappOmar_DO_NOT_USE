package X;

import android.content.Context;
import android.net.Uri;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1PN  reason: invalid class name */
public class AnonymousClass1PN {
    public final C17090uW A00;
    public final C14710pd A01;
    public final C19220xx A02;

    public AnonymousClass1PN(C17090uW r1, C14710pd r2, C19220xx r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A00(Context context, String str, Map map) {
        String str2;
        if (!str.equals("open-modal")) {
            if (!str.equals("open-link")) {
                StringBuilder sb = new StringBuilder("UserNoticeLinkActionHandler/handleAction unknown action: ");
                sb.append(str);
                sb.append(" with params: ");
                sb.append(map);
                str2 = sb.toString();
            } else {
                String str3 = (String) map.get(FacebookFacade.RequestParameter.LINK);
                if (str3 == null) {
                    str2 = "UserNoticeLinkActionHandler/handleOpenLink null url";
                } else {
                    this.A00.Act(context, Uri.parse(str3));
                    return;
                }
            }
            Log.e(str2);
            return;
        }
        A01(context, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r11, boolean r12) {
        /*
            r10 = this;
            X.0xx r5 = r10.A02
            r8 = 0
            X.13F r4 = r5.A05
            X.2Dw r7 = r4.A01()
            if (r7 == 0) goto L_0x0015
            r9 = 3
            if (r12 != 0) goto L_0x001b
            int r1 = r7.A00
            if (r1 == r9) goto L_0x001b
            r0 = 4
            if (r1 == r0) goto L_0x001b
        L_0x0015:
            java.lang.String r0 = "UserNoticeLinkActionHandler/handleOpenModal/no modal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001b:
            int r2 = r7.A01
            X.0pd r6 = r5.A03
            boolean r0 = X.AnonymousClass2E5.A00(r6, r2)
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = "UserNoticeManager/getModal/green alert disabled, notice: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x0033:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0015
        L_0x0037:
            X.13I r0 = r5.A04
            X.1jo r1 = r0.A03(r7)
            if (r1 == 0) goto L_0x0015
            r3 = 1
            if (r12 != 0) goto L_0x0057
            int r0 = r7.A00
            if (r0 == r9) goto L_0x0057
            X.2Dr r2 = r1.A03
            if (r2 != 0) goto L_0x0065
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 4"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/blockingModal/noContent"
        L_0x0053:
            r1.AcB(r0, r8, r3)
            goto L_0x0015
        L_0x0057:
            X.2Dr r2 = r1.A04
            if (r2 != 0) goto L_0x0070
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 3"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/modal/noContent"
            goto L_0x0053
        L_0x0065:
            X.2Dn r1 = r2.A00
            boolean r0 = r5.A0A(r1)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "UserNoticeManager/getModal/blocking modal not shown as per timing"
            goto L_0x0033
        L_0x0070:
            if (r12 != 0) goto L_0x0093
            X.2Dn r1 = r2.A00
            boolean r0 = r5.A0A(r1)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "UserNoticeManager/getModal/modal not shown as per timing"
            goto L_0x0033
        L_0x007d:
            boolean r0 = X.AnonymousClass2E5.A01(r6, r7)
            r5.A08(r1, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has blocking modal"
            goto L_0x0090
        L_0x0087:
            boolean r0 = X.AnonymousClass2E5.A01(r6, r7)
            r5.A08(r1, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has modal"
        L_0x0090:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0093:
            X.2Dw r0 = r4.A01()
            if (r0 == 0) goto L_0x00c2
            X.0pd r1 = r10.A01
            X.2Dw r0 = r4.A01()
            boolean r0 = X.AnonymousClass2E5.A01(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "GreenAlert/launchModal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r11.startActivity(r2)
            return
        L_0x00c2:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.A03(r0)
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = new com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment
            r1.<init>()
            r1.A0T(r0)
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r0 = X.C19980zJ.A01(r11, r0)
            X.0pN r0 = (X.C14550pN) r0
            r0.Afc(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PN.A01(android.content.Context, boolean):void");
    }
}
