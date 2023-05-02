package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.obwhatsapp.R;
import com.obwhatsapp.appwidget.WidgetProvider;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3DH  reason: invalid class name */
public class AnonymousClass3DH implements RemoteViewsService.RemoteViewsFactory {
    public final Context A00;
    public final AnonymousClass15P A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final C16440t3 A04;
    public final AnonymousClass013 A05;
    public final C218415q A06;
    public final ArrayList A07 = AnonymousClass000.A0u();

    public AnonymousClass3DH(Context context, AnonymousClass15P r3, C16000sG r4, C16080sP r5, C16440t3 r6, AnonymousClass013 r7, C218415q r8) {
        this.A00 = context;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }

    public int getCount() {
        return this.A07.size();
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i2) {
        ArrayList arrayList = this.A07;
        if (i2 >= arrayList.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), R.layout.layout0629);
        AnonymousClass4N3 r5 = (AnonymousClass4N3) arrayList.get(i2);
        remoteViews.setTextViewText(R.id.heading, r5.A02);
        remoteViews.setTextViewText(R.id.content, r5.A01);
        remoteViews.setTextViewText(R.id.date, r5.A04);
        remoteViews.setContentDescription(R.id.date, r5.A03);
        Intent A09 = C13680ns.A09();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", C16030sJ.A03(r5.A00));
        A09.putExtras(A0D);
        remoteViews.setOnClickFillInIntent(R.id.widget_row, A09);
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
        Log.i("widgetviewsfactory/oncreate");
        onDataSetChanged();
    }

    public void onDataSetChanged() {
        Log.i("widgetviewsfactory/ondatasetchanged");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = WidgetProvider.A0A;
            ArrayList arrayList2 = this.A07;
            arrayList2.clear();
            if (arrayList != null && this.A01.A07()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C16740tZ A0V = C13680ns.A0V(it);
                    if (!yo.H3T(A0V)) {
                        AnonymousClass4N3 r4 = new AnonymousClass4N3();
                        C16000sG r1 = this.A02;
                        C15830rv r0 = A0V.A11.A00;
                        C16010sH A0A = r1.A0A(r0);
                        r4.A00 = r0;
                        r4.A02 = C40651uT.A03(this.A03.A08(A0A));
                        r4.A01 = Conversation.pNotifi(A0A, this.A06.A0E(A0A, A0V, false, false));
                        C16440t3 r2 = this.A04;
                        AnonymousClass013 r3 = this.A05;
                        r4.A04 = C28961Zl.A0A(r3, r2.A02(A0V.A0I), false);
                        r4.A03 = C28961Zl.A0A(r3, r2.A02(A0V.A0I), true);
                        arrayList2.add(r4);
                    }
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void onDestroy() {
        Log.i("widgetviewsfactory/ondestroy");
    }
}
