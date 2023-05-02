package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.4Y6  reason: invalid class name */
public class AnonymousClass4Y6 {
    public static Drawable A00(Context context, C38631rA r6) {
        String str = r6.A06;
        String A14 = r6.A14();
        String A00 = C221516v.A00(str);
        Locale locale = Locale.US;
        String upperCase = A00.toUpperCase(locale);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(A14)) {
            upperCase = AnonymousClass1XI.A08(A14).toUpperCase(locale);
        }
        return A01(context, str, upperCase, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2 = X.C221516v.A00(r5).toUpperCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_ppt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_ppt_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007c, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_doc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_doc_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_xls;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        r0 = com.obwhatsapp.R.drawable.icon_file_xls_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        return X.AnonymousClass00T.A04(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A01(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            if (r5 != 0) goto L_0x0023
            r3 = 2131232007(0x7f080507, float:1.8080111E38)
            if (r7 == 0) goto L_0x000a
            r3 = 2131232008(0x7f080508, float:1.8080113E38)
        L_0x000a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x009a
            java.lang.String r2 = ""
        L_0x0012:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167198(0x7f0707de, float:1.7948663E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.2nX r0 = new X.2nX
            r0.<init>(r4, r2, r3, r1)
            return r0
        L_0x0023:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0043;
                case -1248332507: goto L_0x0054;
                case -1073633483: goto L_0x0057;
                case -1071817359: goto L_0x005a;
                case -1050893613: goto L_0x006b;
                case -1004732798: goto L_0x006e;
                case -366307023: goto L_0x0071;
                case 904647503: goto L_0x0074;
                case 1993842850: goto L_0x0085;
                default: goto L_0x002a;
            }
        L_0x002a:
            r3 = 2131232007(0x7f080507, float:1.8080111E38)
            if (r7 == 0) goto L_0x0032
            r3 = 2131232008(0x7f080508, float:1.8080113E38)
        L_0x0032:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x009a
        L_0x0038:
            java.lang.String r1 = X.C221516v.A00(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r0)
            goto L_0x0012
        L_0x0043:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r3 = 2131232003(0x7f080503, float:1.8080103E38)
            if (r7 == 0) goto L_0x0038
            r3 = 2131232004(0x7f080504, float:1.8080105E38)
            goto L_0x0038
        L_0x0054:
            java.lang.String r0 = "application/rtf"
            goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x005c:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232005(0x7f080505, float:1.8080107E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232006(0x7f080506, float:1.808011E38)
            goto L_0x0095
        L_0x006b:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto L_0x0076
        L_0x006e:
            java.lang.String r0 = "text/rtf"
            goto L_0x0076
        L_0x0071:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x0087
        L_0x0074:
            java.lang.String r0 = "application/msword"
        L_0x0076:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232001(0x7f080501, float:1.8080099E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232002(0x7f080502, float:1.80801E38)
            goto L_0x0095
        L_0x0085:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x0087:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232009(0x7f080509, float:1.8080115E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232010(0x7f08050a, float:1.8080117E38)
        L_0x0095:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r4, r0)
            return r0
        L_0x009a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toUpperCase(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Y6.A01(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}
