package com.google.gson.internal;

import android.animation.Animator;
import android.app.ProgressDialog;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity;
import com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu;
import com.obwhatsapp.youbasha.ui.views.YoFABView;
import com.obwhatsapp.youbasha.ui.views.q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: XFMFile */
public final class i implements ObjectConstructor, Callback, FloatingActionsMenu.OnFloatingActionsMenuUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f407a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f408b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f409c;

    public /* synthetic */ i(Object obj, Object obj2, int i2) {
        this.f407a = i2;
        this.f409c = obj;
        this.f408b = obj2;
    }

    public i(String str) {
        this.f407a = 3;
        this.f408b = str;
        this.f409c = new ArrayList();
    }

    public final Object construct() {
        Object obj = this.f408b;
        try {
            return ((Constructor) obj).newInstance(new Object[0]);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + ((Constructor) obj) + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + ((Constructor) obj) + " with no args", e3.getTargetException());
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void onFailure(Call call, IOException iOException) {
        Object obj = this.f409c;
        int i2 = this.f407a;
        Object obj2 = this.f408b;
        switch (i2) {
            case 2:
                ProgressDialog progressDialog = (ProgressDialog) obj2;
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                ((OnThemesActivity) obj).runOnUiThread(new d(this, 13));
                return;
            case 5:
                ((RealWebSocket) obj).failWebSocket(iOException, (Response) null);
                return;
            default:
                Conversation conversation = (Conversation) obj2;
                conversation.runOnUiThread(new d(conversation, 17));
                return;
        }
    }

    public final void onMenuCollapsed() {
        YoFABView yoFABView = (YoFABView) this.f409c;
        Animator duration = ViewAnimationUtils.createCircularReveal((ImageView) this.f408b, yoFABView.f1403b, yoFABView.f1404c, (float) ((int) yoFABView.f1405d), 0.0f).setDuration(700);
        duration.addListener(new q(this));
        duration.start();
    }

    public final void onMenuExpanded() {
        Object obj = this.f408b;
        ((ImageView) obj).setVisibility(0);
        Object obj2 = this.f409c;
        ViewAnimationUtils.createCircularReveal((ImageView) obj, ((YoFABView) obj2).f1403b, ((YoFABView) obj2).f1404c, 0.0f, (float) ((int) ((YoFABView) obj2).f1405d)).setDuration(700).start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|24|25|(2:27|(2:29|(2:31|32))(1:(2:34|(1:36)(2:37|(1:39)(2:40|(1:42))))))(4:43|(1:45)|46|(2:48|49))|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x011d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResponse(okhttp3.Call r12, okhttp3.Response r13) {
        /*
            r11 = this;
            int r0 = r11.f407a
            r1 = 0
            java.lang.Object r2 = r11.f409c
            java.lang.Object r3 = r11.f408b
            r4 = 0
            switch(r0) {
                case 2: goto L_0x0070;
                case 5: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0147
        L_0x000d:
            java.lang.String r0 = "OkHttp WebSocket "
            r5 = r2
            okhttp3.internal.ws.RealWebSocket r5 = (okhttp3.internal.ws.RealWebSocket) r5     // Catch:{ ProtocolException -> 0x0066 }
            r5.a(r13)     // Catch:{ ProtocolException -> 0x0066 }
            okhttp3.internal.Internal r5 = okhttp3.internal.Internal.instance
            okhttp3.internal.connection.StreamAllocation r12 = r5.streamAllocation(r12)
            r12.noNewStreams()
            okhttp3.internal.connection.RealConnection r5 = r12.connection()
            okhttp3.internal.ws.RealWebSocket$Streams r5 = r5.newWebSocketStreams(r12)
            r6 = r2
            okhttp3.internal.ws.RealWebSocket r6 = (okhttp3.internal.ws.RealWebSocket) r6     // Catch:{ Exception -> 0x005f }
            okhttp3.WebSocketListener r6 = r6.f2296b     // Catch:{ Exception -> 0x005f }
            r7 = r2
            okhttp3.internal.ws.RealWebSocket r7 = (okhttp3.internal.ws.RealWebSocket) r7     // Catch:{ Exception -> 0x005f }
            r6.onOpen(r7, r13)     // Catch:{ Exception -> 0x005f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
            r13.<init>(r0)     // Catch:{ Exception -> 0x005f }
            okhttp3.Request r3 = (okhttp3.Request) r3     // Catch:{ Exception -> 0x005f }
            okhttp3.HttpUrl r0 = r3.url()     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = r0.redact()     // Catch:{ Exception -> 0x005f }
            r13.append(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x005f }
            r0 = r2
            okhttp3.internal.ws.RealWebSocket r0 = (okhttp3.internal.ws.RealWebSocket) r0     // Catch:{ Exception -> 0x005f }
            r0.initReaderAndWriter(r13, r5)     // Catch:{ Exception -> 0x005f }
            okhttp3.internal.connection.RealConnection r12 = r12.connection()     // Catch:{ Exception -> 0x005f }
            java.net.Socket r12 = r12.socket()     // Catch:{ Exception -> 0x005f }
            r12.setSoTimeout(r4)     // Catch:{ Exception -> 0x005f }
            r12 = r2
            okhttp3.internal.ws.RealWebSocket r12 = (okhttp3.internal.ws.RealWebSocket) r12     // Catch:{ Exception -> 0x005f }
            r12.loopReader()     // Catch:{ Exception -> 0x005f }
            goto L_0x006f
        L_0x005f:
            r12 = move-exception
            okhttp3.internal.ws.RealWebSocket r2 = (okhttp3.internal.ws.RealWebSocket) r2
            r2.failWebSocket(r12, r1)
            goto L_0x006f
        L_0x0066:
            r12 = move-exception
            okhttp3.internal.ws.RealWebSocket r2 = (okhttp3.internal.ws.RealWebSocket) r2
            r2.failWebSocket(r12, r13)
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r13)
        L_0x006f:
            return
        L_0x0070:
            boolean r12 = r13.isSuccessful()
            if (r12 == 0) goto L_0x0146
            okhttp3.ResponseBody r12 = r13.body()
            java.lang.String r12 = r12.string()
            if (r12 == 0) goto L_0x012f
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x012f
            com.google.gson.internal.i r13 = new com.google.gson.internal.i
            r13.<init>(r12)
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x0122 }
            r5 = 1
            r0.setNamespaceAware(r5)     // Catch:{ Exception -> 0x0122 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ Exception -> 0x0122 }
            java.io.StringReader r6 = new java.io.StringReader     // Catch:{ Exception -> 0x0122 }
            r6.<init>(r12)     // Catch:{ Exception -> 0x0122 }
            r0.setInput(r6)     // Catch:{ Exception -> 0x0122 }
            int r12 = r0.getEventType()     // Catch:{ Exception -> 0x0122 }
            java.lang.String r6 = ""
            r7 = 0
        L_0x00a6:
            if (r12 == r5) goto L_0x0122
            java.lang.String r8 = r0.getName()     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "theme"
            r10 = 2
            if (r12 == r10) goto L_0x00f4
            r10 = 3
            if (r12 == r10) goto L_0x00be
            r8 = 4
            if (r12 == r8) goto L_0x00b8
            goto L_0x011d
        L_0x00b8:
            java.lang.String r12 = r0.getText()     // Catch:{ Exception -> 0x0122 }
            r6 = r12
            goto L_0x011d
        L_0x00be:
            if (r7 == 0) goto L_0x011d
            boolean r12 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0122 }
            if (r12 == 0) goto L_0x00cf
            java.lang.Object r12 = r13.f409c     // Catch:{ Exception -> 0x0122 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ Exception -> 0x0122 }
            r12.add(r1)     // Catch:{ Exception -> 0x0122 }
            r7 = 0
            goto L_0x011d
        L_0x00cf:
            java.lang.String r12 = "title"
            boolean r12 = r8.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0122 }
            if (r12 == 0) goto L_0x00e9
            r1.f2381a = r6     // Catch:{ Exception -> 0x0122 }
            r8 = -27550560910785(0xffffe6f1629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)     // Catch:{ Exception -> 0x0122 }
            r6.contains(r12)     // Catch:{ Exception -> 0x0122 }
            r1.a()     // Catch:{ Exception -> 0x0122 }
            goto L_0x011d
        L_0x00e9:
            java.lang.String r12 = "date"
            boolean r12 = r8.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0122 }
            if (r12 == 0) goto L_0x011d
            r1.f2382b = r6     // Catch:{ Exception -> 0x0122 }
            goto L_0x011d
        L_0x00f4:
            boolean r12 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0122 }
            if (r12 == 0) goto L_0x0100
            q.b r1 = new q.b     // Catch:{ Exception -> 0x0122 }
            r1.<init>()     // Catch:{ Exception -> 0x0122 }
            r7 = 1
        L_0x0100:
            java.lang.String r12 = "data"
            boolean r12 = r8.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0122 }
            if (r12 == 0) goto L_0x011d
            java.lang.String r12 = r0.getAttributeValue(r4)     // Catch:{ Exception -> 0x011d }
            java.lang.String r8 = r0.getAttributeValue(r5)     // Catch:{ Exception -> 0x011d }
            java.lang.String r9 = r0.getAttributeValue(r10)     // Catch:{ Exception -> 0x011d }
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.setScreensServer(r9)     // Catch:{ Exception -> 0x011d }
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.setWallServer(r8)     // Catch:{ Exception -> 0x011d }
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.setXmlServer(r12)     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            int r12 = r0.next()     // Catch:{ Exception -> 0x0122 }
            goto L_0x00a6
        L_0x0122:
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity r2 = (com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity) r2
            com.obwhatsapp.yo.p r12 = new com.obwhatsapp.yo.p
            r0 = 9
            r12.<init>(r11, r13, r0)
            r2.runOnUiThread(r12)
            goto L_0x013b
        L_0x012f:
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity r2 = (com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity) r2
            com.obwhatsapp.yo.d r12 = new com.obwhatsapp.yo.d
            r13 = 13
            r12.<init>(r11, r13)
            r2.runOnUiThread(r12)
        L_0x013b:
            android.app.ProgressDialog r3 = (android.app.ProgressDialog) r3
            boolean r12 = r3.isShowing()
            if (r12 == 0) goto L_0x0146
            r3.dismiss()
        L_0x0146:
            return
        L_0x0147:
            boolean r12 = r13.isSuccessful()
            if (r12 == 0) goto L_0x0187
            okhttp3.ResponseBody r12 = r13.body()
            java.lang.String r12 = r12.string()
            if (r12 == 0) goto L_0x0187
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x0187
            com.google.gson.JsonElement r12 = com.google.gson.JsonParser.parseString(r12)
            boolean r13 = r12.isJsonObject()
            if (r13 == 0) goto L_0x0187
            boolean r13 = r12.isJsonNull()
            if (r13 != 0) goto L_0x0187
            com.google.gson.JsonObject r12 = r12.getAsJsonObject()
            java.lang.String r13 = "text"
            com.google.gson.JsonElement r12 = r12.get(r13)
            java.lang.String r12 = r12.getAsString()
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3
            com.obwhatsapp.yo.p r13 = new com.obwhatsapp.yo.p
            r0 = 10
            r13.<init>(r3, r12, r0)
            r3.runOnUiThread(r13)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.i.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
