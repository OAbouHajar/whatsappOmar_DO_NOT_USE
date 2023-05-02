package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1P7  reason: invalid class name */
public class AnonymousClass1P7 extends AnonymousClass1GE {
    public long A00 = -1;
    public final C19980zJ A01;

    public AnonymousClass1P7(C19980zJ r10, AnonymousClass16R r11, C16040sK r12, AnonymousClass01V r13, C16440t3 r14, C16980tz r15, C15860rz r16) {
        super(r11, r12, r13, r14, r15, r16);
        this.A01 = r10;
    }

    public void A06(Activity activity, C15830rv r7) {
        boolean A05 = A05(activity);
        Context applicationContext = activity.getApplicationContext();
        String rawString = r7.getRawString();
        Intent intent = new Intent();
        intent.putExtra("jid", rawString);
        intent.putExtra("live_location_mode", true);
        intent.setClassName(applicationContext.getPackageName(), A05 ? "com.obwhatsapp.location.LocationPicker2" : "com.obwhatsapp.location.LocationPicker");
        activity.startActivityForResult(intent, 100);
    }

    public void A07(Context context, C15830rv r7, UserJid userJid) {
        boolean A05 = A05(context);
        String rawString = r7.getRawString();
        String A03 = C16030sJ.A03(userJid);
        Intent intent = new Intent();
        intent.putExtra("jid", rawString);
        intent.putExtra("target", A03);
        intent.setClassName(context.getPackageName(), A05 ? "com.obwhatsapp.location.GroupChatLiveLocationsActivity2" : "com.obwhatsapp.location.GroupChatLiveLocationsActivity");
        context.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        if (r7 >= 702000000) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Context r18, java.lang.String r19, java.lang.String r20, double r21, double r23) {
        /*
            r17 = this;
            java.lang.String r10 = "android.intent.action.VIEW"
            r3 = r23
            r5 = r21
            r12 = r19
            r13 = r20
            r11 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x009c }
            r2.<init>()     // Catch:{ ActivityNotFoundException -> 0x009c }
            r2.append(r5)     // Catch:{ ActivityNotFoundException -> 0x009c }
            java.lang.String r1 = ","
            r2.append(r1)     // Catch:{ ActivityNotFoundException -> 0x009c }
            r2.append(r3)     // Catch:{ ActivityNotFoundException -> 0x009c }
            java.lang.String r0 = "?q="
            r2.append(r0)     // Catch:{ ActivityNotFoundException -> 0x009c }
            java.lang.String r2 = r2.toString()     // Catch:{ ActivityNotFoundException -> 0x009c }
            if (r20 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x003d }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x003d }
            r1.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x003d }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x003d }
            java.lang.String r0 = java.net.URLEncoder.encode(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x003d }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x003d }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x003d }
            goto L_0x0058
        L_0x003d:
            java.lang.String r0 = "app/failed-url-encode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ActivityNotFoundException -> 0x009c }
            goto L_0x0058
        L_0x0043:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.append(r2)     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.append(r3)     // Catch:{ ActivityNotFoundException -> 0x009c }
            java.lang.String r2 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x009c }
        L_0x0058:
            if (r19 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x007a }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007a }
            r1.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r0 = "("
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r0 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r1 = move-exception
            java.lang.String r0 = "LocationUtils/failed-url-encode"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x009c }
        L_0x0080:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ ActivityNotFoundException -> 0x009c }
            r1.<init>()     // Catch:{ ActivityNotFoundException -> 0x009c }
            java.lang.String r0 = "geo"
            android.net.Uri$Builder r0 = r1.scheme(r0)     // Catch:{ ActivityNotFoundException -> 0x009c }
            android.net.Uri$Builder r0 = r0.encodedOpaquePart(r2)     // Catch:{ ActivityNotFoundException -> 0x009c }
            android.net.Uri r1 = r0.build()     // Catch:{ ActivityNotFoundException -> 0x009c }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x009c }
            r0.<init>(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x009c }
            r11.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x009c }
            return
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = "LocationUtils/open-map/start-activity "
            com.whatsapp.util.Log.w(r0, r1)
            r14 = r17
            X.0zJ r9 = r14.A01
            long r7 = r14.A00
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c0
            java.lang.String r2 = "com.google.android.apps.maps"
            long r7 = X.AnonymousClass01R.A00(r11, r2)
            r14.A00 = r7
            r15 = -1
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x00c0
            r14.A00 = r0
            r7 = 0
        L_0x00c0:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DecimalFormatSymbols r0 = java.text.DecimalFormatSymbols.getInstance(r0)
            char r1 = r0.getDecimalSeparator()
            r0 = 44
            if (r1 != r0) goto L_0x00df
            r1 = 700000000(0x29b92700, double:3.45845952E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00df
            r1 = 702000000(0x29d7ab80, double:3.468340834E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r14 = 1
            if (r0 < 0) goto L_0x00e0
        L_0x00df:
            r14 = 0
        L_0x00e0:
            java.lang.String r7 = "maps"
            java.lang.String r2 = "maps.google.com"
            java.lang.String r1 = "https"
            java.lang.String r15 = ","
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r0 = r0.authority(r2)
            android.net.Uri$Builder r8 = r0.path(r7)
            if (r14 == 0) goto L_0x0129
            java.lang.String r1 = "q=loc:("
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            r0.append(r15)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.net.Uri$Builder r2 = r8.encodedQuery(r0)
            java.lang.String r1 = "z"
            java.lang.String r0 = "16"
            android.net.Uri$Builder r8 = r2.appendQueryParameter(r1, r0)
        L_0x011c:
            android.net.Uri r1 = r8.build()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r10, r1)
            r9.A06(r11, r0)
            return
        L_0x0129:
            java.lang.String r14 = ")"
            java.lang.String r7 = "("
            java.lang.String r0 = ""
            java.lang.String r2 = "q"
            if (r20 == 0) goto L_0x0173
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            if (r19 == 0) goto L_0x014f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
        L_0x014f:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri$Builder r2 = r8.appendQueryParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "sll"
            r2.appendQueryParameter(r0, r1)
            goto L_0x011c
        L_0x0173:
            java.lang.String r13 = "loc:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r1.append(r5)
            r1.append(r15)
            r1.append(r3)
            if (r19 == 0) goto L_0x0197
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
        L_0x0197:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.appendQueryParameter(r2, r0)
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P7.A08(android.content.Context, java.lang.String, java.lang.String, double, double):void");
    }
}
