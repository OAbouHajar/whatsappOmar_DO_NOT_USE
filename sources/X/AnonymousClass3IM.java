package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3IM  reason: invalid class name */
public class AnonymousClass3IM implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final C14870pt A02;
    public final AnonymousClass15P A03;
    public final C15800rs A04;
    public final AnonymousClass013 A05;
    public final C15810rt A06;
    public final C19780yz A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final int[] A09;

    public AnonymousClass3IM(AppWidgetManager appWidgetManager, Context context, C14870pt r4, AnonymousClass15P r5, C15800rs r6, AnonymousClass013 r7, C15810rt r8, C19780yz r9, int[] iArr) {
        this.A01 = context;
        this.A02 = r4;
        this.A06 = r8;
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = appWidgetManager;
        this.A07 = r9;
        this.A04 = r6;
        this.A09 = iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r10 != 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass3IM r11, java.util.ArrayList r12) {
        /*
            com.obwhatsapp.appwidget.WidgetProvider.A0A = r12
            int[] r4 = r11.A09
            int r3 = r4.length
            r2 = 0
        L_0x0006:
            if (r2 >= r3) goto L_0x0044
            r8 = r4[r2]
            android.appwidget.AppWidgetManager r1 = r11.A00
            android.os.Bundle r5 = r1.getAppWidgetOptions(r8)
            if (r5 == 0) goto L_0x0022
            java.lang.String r0 = "appWidgetMinWidth"
            int r9 = r5.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r10 = r5.getInt(r0)
            if (r9 == 0) goto L_0x0022
            if (r10 != 0) goto L_0x0028
        L_0x0022:
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x0028:
            android.content.Context r5 = r11.A01
            X.15P r6 = r11.A03
            X.013 r7 = r11.A05
            android.widget.RemoteViews r0 = com.obwhatsapp.appwidget.WidgetProvider.A00(r5, r6, r7, r8, r9, r10)
            r1.updateAppWidget(r8, r0)
            r0 = 100
            if (r9 <= r0) goto L_0x0041
            if (r10 <= r0) goto L_0x0041
            r0 = 2131364358(0x7f0a0a06, float:1.834855E38)
            r1.notifyAppWidgetViewDataChanged(r8, r0)
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IM.A00(X.3IM, java.util.ArrayList):void");
    }

    public void run() {
        AtomicBoolean atomicBoolean = this.A08;
        if (!atomicBoolean.get()) {
            List A082 = this.A04.A08();
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = A082.iterator();
            while (it.hasNext()) {
                C15830rv A0B = C13700nu.A0B(it);
                if (!atomicBoolean.get()) {
                    int A002 = this.A06.A00(A0B);
                    if (A002 > 0) {
                        A0u.addAll(this.A07.A03(A0B, Math.min(A002, 100)));
                    }
                } else {
                    return;
                }
            }
            Collections.sort(A0u, new IDxComparatorShape19S0000000_2_I0(35));
            this.A02.A0K(new RunnableRunnableShape12S0200000_I1(this, 32, A0u));
        }
    }
}
