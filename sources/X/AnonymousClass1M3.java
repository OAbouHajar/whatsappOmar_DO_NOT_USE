package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1M3  reason: invalid class name */
public class AnonymousClass1M3 {
    public static final Set A05 = new HashSet(Arrays.asList(new String[]{"authentication_token", "vcard_array_str", "contact_out_address_book", "added_by_qr_code", "wa_type", "confirm", "iq_code", "entry_point_conversion_app", "entry_point_conversion_source", "skip_preview", "fromCallNotification", "fromNotification", "group_reply_parent_group_jid", "group_reply_subject", "number_from_url", "has_share", "text_from_url", "origin", "extra_quoted_message_row_id", "group_reply_jid", "share_msg", "sms_body", "vcard_name", "vcard_str", "business_jid", "jid", "_ci_", "args_conversation_screen_entry_point", "last_notification_keep_in_chat", "android.intent.extra.TEXT"}));
    public final C16300so A00;
    public final C14710pd A01;
    public final C16510tB A02;
    public final C15950sB A03;
    public final List A04 = new ArrayList();

    public AnonymousClass1M3(C16300so r3, C16980tz r4, C14710pd r5, C16510tB r6) {
        C15950sB r0 = new C15950sB(r4, new C79123zE());
        this.A01 = r5;
        this.A00 = r3;
        this.A02 = r6;
        this.A03 = r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.content.Intent r8) {
        /*
            r7 = this;
            java.util.List r5 = r7.A04
            r5.clear()
            X.0pd r2 = r7.A01
            r1 = 2377(0x949, float:3.331E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0158
            java.lang.String r6 = "_ci_"
            boolean r4 = r8.hasExtra(r6)
            java.lang.String r1 = "authentication_token"
            boolean r0 = r8.hasExtra(r1)
            if (r4 != 0) goto L_0x004f
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "noCallerInfo"
        L_0x0023:
            r5.add(r0)
        L_0x0026:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.os.Bundle r0 = r8.getExtras()
            if (r0 == 0) goto L_0x0158
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0039:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = A05
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0039
            r3.add(r1)
            goto L_0x0039
        L_0x004f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            java.lang.String r3 = "]"
            if (r2 >= r0) goto L_0x0069
            java.lang.String r1 = "apiVersionTooLow["
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0023
        L_0x0069:
            if (r4 == 0) goto L_0x0072
            android.os.Parcelable r0 = r8.getParcelableExtra(r6)     // Catch:{ BadParcelableException -> 0x00b2 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x00b2 }
            goto L_0x0078
        L_0x0072:
            android.os.Parcelable r0 = r8.getParcelableExtra(r1)     // Catch:{ BadParcelableException -> 0x00b2 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x00b2 }
        L_0x0078:
            java.lang.String r2 = r0.getCreatorPackage()
            X.0sB r0 = r7.A03     // Catch:{ NameNotFoundException -> 0x009f }
            X.0s3 r0 = r0.A01(r2)     // Catch:{ NameNotFoundException -> 0x009f }
            boolean r0 = r0.A03     // Catch:{ NameNotFoundException -> 0x009f }
            if (r0 != 0) goto L_0x0158
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x009f }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.String r0 = "untrustedPackage["
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x009f }
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x009f }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x009f }
            r5.add(r0)     // Catch:{ NameNotFoundException -> 0x009f }
            goto L_0x0026
        L_0x009f:
            java.lang.String r1 = "invalidPackage["
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0023
        L_0x00b2:
            java.lang.String r0 = "badParcelable"
            goto L_0x0023
        L_0x00b6:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = "notWhitelistedExtraKey"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Object[] r0 = r3.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.add(r0)
            java.util.ArrayList r1 = X.AnonymousClass3Bv.newArrayList()
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r8.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x00e4
            r1.addAll(r0)
        L_0x00e4:
            android.net.Uri r0 = r8.getData()
            r1.add(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L_0x00f5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r2 = r4.next()
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x00f5
            java.io.File r1 = X.AnonymousClass1XI.A03(r2)
            if (r1 == 0) goto L_0x00f5
            int r3 = r3 + 1
            X.0tB r0 = r7.A02     // Catch:{ IOException -> 0x0111 }
            r0.A04(r1)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00f5
        L_0x0111:
            java.lang.String r0 = "notExternalIntentUri["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.add(r0)
            goto L_0x00f5
        L_0x0128:
            if (r3 == 0) goto L_0x0133
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0158
            r5.addAll(r6)
        L_0x0133:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = " "
            java.lang.String r3 = X.AnonymousClass1ZW.A0A(r0, r5)
            X.0so r2 = r7.A00
            r1 = 0
            java.lang.String r0 = "ConversationIntentValidator/verifyIntent"
            r2.AcB(r0, r3, r1)
            java.lang.String r1 = "ConversationIntentValidator/verifyIntent "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M3.A00(android.content.Intent):void");
    }
}
