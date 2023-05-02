package com.obwhatsapp.appwidget;

import X.AnonymousClass013;
import X.AnonymousClass01F;
import X.AnonymousClass15P;
import X.AnonymousClass18Z;
import X.AnonymousClass22U;
import X.AnonymousClass2IF;
import X.AnonymousClass3IM;
import X.C14750ph;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C16150sX;
import X.C19780yz;
import X.C42341xd;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.widget.RemoteViews;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0A;
    public C14870pt A00;
    public AnonymousClass3IM A01;
    public AnonymousClass18Z A02;
    public AnonymousClass15P A03;
    public C15800rs A04;
    public AnonymousClass013 A05;
    public C15810rt A06;
    public C19780yz A07;
    public final Object A08;
    public volatile boolean A09;

    public WidgetProvider() {
        this(0);
    }

    public WidgetProvider(int i2) {
        this.A09 = false;
        this.A08 = new Object();
    }

    public static RemoteViews A00(Context context, AnonymousClass15P r10, AnonymousClass013 r11, int i2, int i3, int i4) {
        String str;
        boolean A042 = r10.A04();
        if (i3 <= 100 || i4 <= 100) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout062a);
            ArrayList arrayList = A0A;
            if (arrayList != null) {
                int size = arrayList.size();
                remoteViews.setTextViewText(R.id.count, Integer.toString(size));
                float f2 = 30.0f;
                if (i3 < 100) {
                    if (size > 99) {
                        f2 = 14.0f;
                    } else if (size > 9) {
                        f2 = 20.0f;
                    }
                }
                remoteViews.setFloat(R.id.count, "setTextSize", f2);
            }
            remoteViews.setOnClickPendingIntent(R.id.header, C42341xd.A00(context, 1, A042 ? C14750ph.A04(context) : C14750ph.A02(context), 134217728));
            return remoteViews;
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.layout0628);
        ArrayList arrayList2 = A0A;
        if (arrayList2 == null) {
            str = "";
        } else if (arrayList2.size() > 0) {
            str = r11.A0J(new Object[]{Integer.valueOf(arrayList2.size())}, R.plurals.plurals0175, (long) arrayList2.size());
            remoteViews2.setViewVisibility(R.id.subtitle, 0);
        } else {
            str = context.getString(R.string.str1d27);
            remoteViews2.setViewVisibility(R.id.subtitle, 8);
        }
        remoteViews2.setTextViewText(R.id.subtitle, str);
        Intent intent = new Intent(context, WidgetService.class);
        intent.putExtra("appWidgetId", i2);
        intent.setData(Uri.parse(intent.toUri(1)));
        remoteViews2.setRemoteAdapter(i2, R.id.list_view_widget, intent);
        com.obwhatsapp.yo.WidgetProvider.refreshBtn(context, remoteViews2);
        com.obwhatsapp.yo.WidgetProvider.setMOD(context, remoteViews2, WidgetProvider.class);
        Intent A082 = C14750ph.A08(context, 0);
        A082.setAction("android.intent.action.VIEW");
        AnonymousClass22U.A01(A082, "WidgetProvider");
        int i5 = 134217728;
        if (C42341xd.A01) {
            i5 = 167772160;
        }
        remoteViews2.setPendingIntentTemplate(R.id.list_view_widget, PendingIntent.getActivity(context, 1, yo.notifIn(A082), i5));
        remoteViews2.setOnClickPendingIntent(R.id.header, C42341xd.A00(context, 1, A042 ? C14750ph.A04(context) : C14750ph.A02(context), 134217728));
        remoteViews2.setEmptyView(R.id.list_view_widget, R.id.empty_view);
        boolean A072 = r10.A07();
        int i6 = R.string.str1d27;
        if (!A072) {
            i6 = R.string.str1b9a;
        }
        remoteViews2.setTextViewText(R.id.empty_view, context.getString(i6));
        return remoteViews2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r5 != 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x002d
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.String r0 = "widgetprovider/onappwidgetoptionschanged "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "x"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x002d
            if (r5 != 0) goto L_0x0033
        L_0x002d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0033:
            X.15P r1 = r6.A03
            X.013 r2 = r6.A05
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (!this.A09) {
                synchronized (this.A08) {
                    if (!this.A09) {
                        C16150sX r2 = (C16150sX) ((AnonymousClass01F) AnonymousClass2IF.A01(context));
                        this.A00 = (C14870pt) r2.AB3.get();
                        this.A06 = (C15810rt) r2.A43.get();
                        this.A02 = (AnonymousClass18Z) r2.ARC.get();
                        this.A03 = (AnonymousClass15P) r2.A0b.get();
                        this.A05 = (AnonymousClass013) r2.AR8.get();
                        this.A07 = (C19780yz) r2.ADI.get();
                        this.A04 = (C15800rs) r2.A5c.get();
                        this.A09 = true;
                    }
                }
            }
            super.onReceive(context, intent);
        } catch (BadParcelableException unused) {
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder sb = new StringBuilder("widgetprovider/update ");
        int[] iArr2 = iArr;
        sb.append(iArr.length);
        Log.i(sb.toString());
        AnonymousClass3IM r0 = this.A01;
        if (r0 != null) {
            r0.A08.set(true);
            this.A02.A00().removeCallbacks(this.A01);
        }
        C14870pt r4 = this.A00;
        C15810rt r8 = this.A06;
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        this.A01 = new AnonymousClass3IM(appWidgetManager2, context2, r4, this.A03, this.A04, this.A05, r8, this.A07, iArr2);
        this.A02.A00().post(this.A01);
        super.onUpdate(context, appWidgetManager, iArr);
        com.obwhatsapp.yo.WidgetProvider.updateYoWAWidget(context);
    }
}
