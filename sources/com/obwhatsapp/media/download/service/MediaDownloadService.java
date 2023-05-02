package com.obwhatsapp.media.download.service;

import X.AnonymousClass00B;
import X.AnonymousClass01D;
import X.AnonymousClass01T;
import X.AnonymousClass1WA;
import X.AnonymousClass1WE;
import X.AnonymousClass22U;
import X.AnonymousClass3HI;
import X.C007503l;
import X.C14750ph;
import X.C15830rv;
import X.C16000sG;
import X.C16080sP;
import X.C16320sq;
import X.C16730tY;
import X.C16750ta;
import X.C16980tz;
import X.C209212c;
import X.C218415q;
import X.C28291Vi;
import X.C42341xd;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.redex.IDxProviderShape34S0000000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class MediaDownloadService extends C28291Vi {
    public C16000sG A00;
    public C16080sP A01;
    public C16980tz A02;
    public C209212c A03;
    public AnonymousClass1WA A04;
    public C16320sq A05;
    public AnonymousClass1WE A06;
    public boolean A07 = false;
    public boolean A08;
    public final AnonymousClass01D A09 = new AnonymousClass01T((Object) null, new IDxProviderShape34S0000000_2_I0(2));

    public MediaDownloadService() {
        super("media-download-service", true);
    }

    public final void A03(String str, String str2, ArrayList arrayList, int i2) {
        C16730tY r3;
        C15830rv r1;
        C007503l A002 = C218415q.A00(this);
        A002.A0J = "sending_media@1";
        A002.A0I = "progress";
        A002.A05(System.currentTimeMillis());
        A002.A0B(str);
        A002.A0A(str);
        A002.A09(str2);
        boolean z2 = false;
        if (!(arrayList == null || (r3 = (C16730tY) arrayList.get(0)) == null || (r1 = r3.A11.A00) == null)) {
            Intent A0v = new C14750ph().A0v(this, this.A00.A0A(r1));
            AnonymousClass22U.A01(A0v, "MediaDownloadService");
            A002.A09 = C42341xd.A00(this, 5, A0v, 134217728);
            C16750ta r0 = r3.A02;
            AnonymousClass00B.A06(r0);
            int i3 = (int) r0.A0C;
            if (i3 >= 0) {
                if (arrayList.size() > 1) {
                    z2 = true;
                }
                A002.A03(100, i3, z2);
            }
        }
        A002.A07.icon = 17301633;
        A01(i2, A002.A01(), 230176004);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("media-download-service/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("media-download-service/onDestroy");
        AnonymousClass1WE r1 = this.A06;
        if (r1 != null) {
            this.A03.A0D.A02(r1);
            this.A06 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        StringBuilder sb = new StringBuilder("media-download-service/onStartCommand:");
        sb.append(intent);
        sb.append("; startId: ");
        sb.append(i3);
        sb.append(" largeMediaDownloadsInProgress=");
        sb.append(this.A08);
        Log.i(sb.toString());
        if (intent != null) {
            if ("com.obwhatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED".equals(intent.getAction())) {
                this.A08 = true;
            } else if ("com.obwhatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED".equals(intent.getAction())) {
                this.A08 = false;
            }
        }
        A03(getString(R.string.str1bd4), getResources().getQuantityString(R.plurals.plurals0041, 1, new Object[]{1}), (ArrayList) null, i3);
        if (!this.A08) {
            this.A01.A01(this.A02.A00, MediaDownloadService.class);
            return 2;
        } else if (this.A06 != null) {
            return 2;
        } else {
            this.A06 = new AnonymousClass3HI(this, i3);
            AnonymousClass1WA r2 = this.A04;
            if (r2 == null) {
                r2 = new AnonymousClass1WA(this.A05, false);
                this.A04 = r2;
            }
            C209212c r0 = this.A03;
            r0.A0D.A03(this.A06, r2);
            return 2;
        }
    }
}
