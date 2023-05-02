package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.redex.RunnableRunnableShape0S0800000_I0;
import com.obwhatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;

/* renamed from: X.18Z  reason: invalid class name */
public class AnonymousClass18Z {
    public Handler A00;
    public C14760pi A01;
    public Runnable A02;
    public final C16040sK A03;
    public final C15800rs A04;
    public final C16980tz A05;
    public final C15810rt A06;
    public final C19780yz A07;
    public final AnonymousClass18Y A08;
    public final C16220sf A09;

    public AnonymousClass18Z(C16040sK r1, C15800rs r2, C16980tz r3, C15810rt r4, C19780yz r5, AnonymousClass18Y r6, C16220sf r7) {
        this.A05 = r3;
        this.A03 = r1;
        this.A06 = r4;
        this.A08 = r6;
        this.A07 = r5;
        this.A09 = r7;
        this.A04 = r2;
    }

    public synchronized Handler A00() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("update_widget", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public synchronized void A01() {
        C16980tz r7 = this.A05;
        Context context = r7.A00;
        Class<WidgetProvider> cls = WidgetProvider.class;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, cls));
            if (appWidgetIds != null) {
                if (appWidgetIds.length > 0) {
                    Intent intent = new Intent(context, cls);
                    intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                    intent.putExtra("appWidgetIds", appWidgetIds);
                    context.sendBroadcast(intent);
                }
            }
        } catch (RuntimeException e2) {
            Log.e("widgetprovider/getAppWidgetIds failed", e2);
        }
        AnonymousClass18Y r0 = this.A08;
        C41091vD A002 = r0.A00(context);
        if (!(A002 == null || A002 == r0.A02)) {
            if (this.A02 == null) {
                C16040sK r6 = this.A03;
                C15810rt r2 = this.A06;
                C19780yz r8 = this.A07;
                C16220sf r5 = this.A09;
                C15800rs r9 = this.A04;
                C14760pi r3 = this.A01;
                if (r3 == null) {
                    r3 = (C14760pi) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AFo.get();
                    this.A01 = r3;
                }
                this.A02 = new RunnableRunnableShape0S0800000_I0(r2, r3, A002, r5, r6, r7, r8, r9, 0);
            }
            A00().removeCallbacks(this.A02);
            A00().post(this.A02);
        }
    }
}
