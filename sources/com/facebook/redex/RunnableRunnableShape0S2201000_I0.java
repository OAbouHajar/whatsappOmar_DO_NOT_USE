package com.facebook.redex;

import X.AnonymousClass2Oq;
import X.C004101u;
import X.C221016q;
import com.obwhatsapp.media.download.service.MediaDownloadService;
import java.util.ArrayList;

public class RunnableRunnableShape0S2201000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public RunnableRunnableShape0S2201000_I0(Object obj, Object obj2, String str, String str2, int i2, int i3) {
        this.A05 = i3;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = str2;
        this.A02 = obj2;
    }

    public final void run() {
        int i2 = this.A05;
        Object obj = this.A01;
        if (i2 != 0) {
            int i3 = this.A00;
            ((MediaDownloadService) obj).A03(this.A03, this.A04, (ArrayList) this.A02, i3);
            return;
        }
        C221016q r4 = (C221016q) obj;
        String str = this.A03;
        int i4 = this.A00;
        String str2 = this.A04;
        Integer num = (Integer) this.A02;
        AnonymousClass2Oq r2 = new AnonymousClass2Oq();
        r2.A05 = C004101u.A03(str);
        r2.A04 = Long.valueOf(r4.A00.A00());
        r2.A00 = 1;
        r2.A01 = Integer.valueOf(i4);
        r2.A02 = 2;
        if (str2 != null) {
            r2.A06 = r4.A02.A03(str2);
        }
        r2.A03 = num;
        r4.A01.A06(r2);
    }
}
