package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.33y  reason: invalid class name and case insensitive filesystem */
public class C605533y extends AnonymousClass51O {
    public final C82954Eu A00 = new C82954Eu(this);
    public final AnonymousClass38K A01;
    public final /* synthetic */ C34591kW A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C605533y(UserJid userJid, C34591kW r4, AnonymousClass38K r5) {
        super(r4.A02, userJid, r4.A04);
        this.A02 = r4;
        this.A01 = r5;
    }

    public int A00() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r0 > 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r1 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r19, java.lang.String r20) {
        /*
            r18 = this;
            r1 = r18
            X.38K r5 = r1.A01
            X.1kW r0 = r1.A02
            X.0so r4 = r0.A00
            X.4Eu r2 = r1.A00
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r6 = r19
            X.4Ua r0 = new X.4Ua     // Catch:{ 1W9 -> 0x00ff }
            r0.<init>(r4, r6, r5)     // Catch:{ 1W9 -> 0x00ff }
            X.1Vv r11 = r0.A00     // Catch:{ 1W9 -> 0x00ff }
            r7 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = r0.A02     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            org.json.JSONObject r10 = X.C13700nu.A0K(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.String r0 = "errors"
            org.json.JSONArray r8 = r10.optJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.String r9 = "data"
            org.json.JSONObject r1 = r10.optJSONObject(r9)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r8 != 0) goto L_0x002e
            goto L_0x0054
        L_0x002e:
            int r0 = r8.length()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r0 <= 0) goto L_0x0058
            r0 = 0
            org.json.JSONObject r1 = r8.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "extensions"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "error_code"
            int r0 = r1.optInt(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r0 <= 0) goto L_0x0058
        L_0x004b:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r17 = 0
            if (r0 == r7) goto L_0x005d
            goto L_0x005b
        L_0x0054:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L_0x004b
        L_0x0058:
            r0 = 417(0x1a1, float:5.84E-43)
            goto L_0x004b
        L_0x005b:
            r17 = 1
        L_0x005d:
            r14 = 0
            r0 = 0
            if (r17 != 0) goto L_0x00bb
            r8 = 0
            org.json.JSONObject r10 = r10.getJSONObject(r9)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl r9 = new com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r9.<init>(r10)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            X.1kb r10 = r9.getXwa2UsersUpdatesSince()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r10 == 0) goto L_0x00c6
            int r9 = r10.size()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r9 <= r8) goto L_0x00c6
            java.lang.Object r9 = r10.get(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse$Xwa2UsersUpdatesSince r9 = (com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse.Xwa2UsersUpdatesSince) r9     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            X.1kb r10 = r9.getUpdates()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r10 == 0) goto L_0x00bb
            int r9 = r10.size()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r9 <= r8) goto L_0x00bb
            java.lang.Object r9 = r10.get(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse$Xwa2UsersUpdatesSince$Updates r9 = (com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse.Xwa2UsersUpdatesSince.Updates) r9     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r9 == 0) goto L_0x00c6
            com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate r9 = r9.asInlineXWA2UserStatusUpdate()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r9 == 0) goto L_0x00bb
            java.lang.String r8 = r9.getDhash()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            long r0 = X.C29501aj.A01(r8, r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.String r14 = r9.getText()     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            boolean r8 = android.text.TextUtils.isEmpty(r14)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            if (r8 == 0) goto L_0x00bb
            X.33y r8 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            X.1kW r8 = r8.A02     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            X.0tz r8 = r8.A01     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            android.content.res.Resources r9 = X.C16980tz.A00(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r8 = 2131887708(0x7f12065c, float:1.941003E38)
            java.lang.String r14 = r9.getString(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
        L_0x00bb:
            X.33y r10 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r15 = r0
            r10.A02(r11, r12, r13, r14, r15, r17)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            return
        L_0x00c6:
            java.lang.String r0 = "Unable to find status update at ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r1.append(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.String r0 = ","
            r1.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r1.append(r8)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            java.lang.String r0 = ") in response data."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
            throw r0     // Catch:{ NullPointerException | JSONException -> 0x00ea, all -> 0x00e3 }
        L_0x00e3:
            r1 = move-exception
            X.1W9 r0 = new X.1W9     // Catch:{ 1W9 -> 0x00ff }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 1W9 -> 0x00ff }
            throw r0     // Catch:{ 1W9 -> 0x00ff }
        L_0x00ea:
            X.33y r10 = r2.A00     // Catch:{ 1W9 -> 0x00ff }
            r17 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ 1W9 -> 0x00ff }
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ 1W9 -> 0x00ff }
            r14 = 0
            r15 = 0
            r10.A02(r11, r12, r13, r14, r15, r17)     // Catch:{ 1W9 -> 0x00ff }
            return
        L_0x00ff:
            r7 = move-exception
            java.lang.String r0 = "QueryResponseSuccess: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r3.add(r0)
            X.4UZ r0 = new X.4UZ     // Catch:{ 1W9 -> 0x0122 }
            r0.<init>(r4, r6, r5)     // Catch:{ 1W9 -> 0x0122 }
            X.33y r7 = r2.A00     // Catch:{ 1W9 -> 0x0122 }
            X.1Vv r1 = r0.A00     // Catch:{ 1W9 -> 0x0122 }
            int r0 = X.C34451kH.A00(r1)     // Catch:{ 1W9 -> 0x0122 }
            r7.A01(r1, r0)     // Catch:{ 1W9 -> 0x0122 }
            return
        L_0x0122:
            r7 = move-exception
            java.lang.String r0 = "QueryResponseRequestError: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r3.add(r0)
            X.4Uo r0 = new X.4Uo     // Catch:{ 1W9 -> 0x0145 }
            r0.<init>(r4, r6, r5)     // Catch:{ 1W9 -> 0x0145 }
            X.33y r2 = r2.A00     // Catch:{ 1W9 -> 0x0145 }
            X.1Vv r1 = r0.A00     // Catch:{ 1W9 -> 0x0145 }
            int r0 = X.C34451kH.A00(r1)     // Catch:{ 1W9 -> 0x0145 }
            r2.A01(r1, r0)     // Catch:{ 1W9 -> 0x0145 }
            return
        L_0x0145:
            r2 = move-exception
            java.lang.String r0 = "QueryResponseServerError: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r3.add(r0)
            java.lang.String r0 = "Could not parse stanza into valid response class, encountered the following errors for each possible response:\n"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.AnonymousClass1ZW.A0A(r0, r3)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605533y.AYG(X.1Vv, java.lang.String):void");
    }
}
