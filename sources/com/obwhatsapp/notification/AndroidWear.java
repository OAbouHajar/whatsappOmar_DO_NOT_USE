package com.obwhatsapp.notification;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass04E;
import X.AnonymousClass04G;
import X.AnonymousClass10Y;
import X.AnonymousClass15I;
import X.AnonymousClass1yL;
import X.C007503l;
import X.C14770pj;
import X.C14870pt;
import X.C16000sG;
import X.C16010sH;
import X.C16740tZ;
import X.C16760tb;
import X.C17020u3;
import X.C28261Vb;
import X.C28381Vw;
import X.C42341xd;
import X.C437121f;
import X.C45912Bp;
import X.C45922Bq;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.UUID;

public final class AndroidWear extends C28261Vb {
    public static C437121f A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final int[] A0D = {R.string.str1bd2, R.string.str00eb, R.string.str00e6, R.string.str00e8, R.string.str00e7, R.string.str00e9, R.string.str00e3, R.string.str00e4, R.string.str00e5, R.string.str00e2, R.string.str1bd1, R.string.str00ea};
    public C14870pt A00;
    public C16760tb A01;
    public C16000sG A02;
    public AnonymousClass10Y A03;
    public AnonymousClass15I A04;
    public AnonymousClass01V A05;
    public C14770pj A06;
    public C17020u3 A07;
    public boolean A08 = false;

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(".intent.action.MARK_AS_READ");
        A0A = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.obwhatsapp");
        sb2.append(".intent.action.REPLY");
        A0C = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("com.obwhatsapp");
        sb3.append(".intent.action.REACTION");
        A0B = sb3.toString();
    }

    public AndroidWear() {
        super("AndroidWear");
    }

    public static AnonymousClass04E A00(Context context, C16010sH r11) {
        Intent intent = new Intent(A0A, ContentUris.withAppendedId(C45912Bp.A00, r11.A05()), context, AndroidWear.class);
        int i2 = 134217728;
        if (C42341xd.A00) {
            i2 = 201326592;
        }
        PendingIntent service = PendingIntent.getService(context, 0, intent, i2);
        String string = context.getString(R.string.str0cc1);
        AnonymousClass04G[] r8 = null;
        IconCompat A022 = IconCompat.A02((Resources) null, "", R.drawable.ic_notif_mark_read);
        Bundle bundle = new Bundle();
        CharSequence A002 = C007503l.A00(string);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass04G[] r7 = null;
        if (!arrayList.isEmpty()) {
            r8 = (AnonymousClass04G[]) arrayList.toArray(new AnonymousClass04G[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            r7 = (AnonymousClass04G[]) arrayList2.toArray(new AnonymousClass04G[arrayList2.size()]);
        }
        return new AnonymousClass04E(service, bundle, A022, A002, r7, r8, 2, true, false);
    }

    public static AnonymousClass04E A01(Context context, C16010sH r10, C16740tZ r11, String str, int i2) {
        Intent intent = new Intent(A0B, ContentUris.withAppendedId(C45912Bp.A00, r10.A05()).buildUpon().fragment(UUID.randomUUID().toString()).build(), context, AndroidWear.class);
        AnonymousClass1yL.A00(intent, r11.A11);
        intent.putExtra("reaction", str);
        int i3 = 0;
        if (C42341xd.A00) {
            i3 = 67108864;
        }
        PendingIntent service = PendingIntent.getService(context, 0, intent, i3);
        AnonymousClass04G[] r8 = null;
        IconCompat A022 = IconCompat.A02((Resources) null, "", i2);
        Bundle bundle = new Bundle();
        CharSequence A002 = C007503l.A00(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass04G[] r7 = null;
        if (!arrayList.isEmpty()) {
            r8 = (AnonymousClass04G[]) arrayList.toArray(new AnonymousClass04G[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            r7 = (AnonymousClass04G[]) arrayList2.toArray(new AnonymousClass04G[arrayList2.size()]);
        }
        return new AnonymousClass04E(service, bundle, A022, A002, r7, r8, 8, true, false);
    }

    public static boolean A02() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public final void A03() {
        this.A06.A0C((C16740tZ) null, true, true, true, false, false);
    }

    public void onCreate() {
        Log.i("android-wear/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        C14870pt r2;
        int i2;
        if (intent != null) {
            Bundle A002 = AnonymousClass04G.A00(intent);
            String str = null;
            if (C45912Bp.A00(intent.getData())) {
                C16000sG r22 = this.A02;
                Uri data = intent.getData();
                AnonymousClass00B.A0F(C45912Bp.A00(data));
                C16010sH A052 = r22.A05(ContentUris.parseId(data));
                if (A052 != null) {
                    if (A002 != null) {
                        CharSequence charSequence = A002.getCharSequence("android_wear_voice_input");
                        if (charSequence != null) {
                            str = charSequence.toString().trim();
                        }
                        if (!C45922Bq.A0B(this.A05, this.A07, str)) {
                            Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                            r2 = this.A00;
                            i2 = 40;
                            r2.A0K(new RunnableRunnableShape11S0100000_I0_10((Object) this, i2));
                        }
                        this.A00.A0K(new RunnableRunnableShape0S1200000_I0(A052, str, this, 24));
                        return;
                    } else if (A0B.equals(intent.getAction())) {
                        String stringExtra = intent.getStringExtra("reaction");
                        C28381Vw A022 = AnonymousClass1yL.A02(intent);
                        if (stringExtra != null && A022 != null) {
                            this.A00.A0K(new RunnableRunnableShape0S1200000_I0(A022, stringExtra, this, 25));
                            return;
                        }
                        return;
                    } else if (A0A.equals(intent.getAction())) {
                        this.A00.A0K(new RunnableRunnableShape9S0200000_I0_7(this, 7, A052));
                        return;
                    } else {
                        return;
                    }
                }
            }
            r2 = this.A00;
            i2 = 41;
            r2.A0K(new RunnableRunnableShape11S0100000_I0_10((Object) this, i2));
        }
    }
}
