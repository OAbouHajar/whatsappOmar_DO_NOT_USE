package com.facebook.redex;

import X.AnonymousClass10X;
import X.AnonymousClass1XK;
import X.AnonymousClass20K;
import X.AnonymousClass2KA;
import X.C14600pS;
import X.C16740tZ;
import X.C35541m6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class IDxFCallbackShape0S1710000_2_I0 implements AnonymousClass20K {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public boolean A08;
    public final int A09;

    public IDxFCallbackShape0S1710000_2_I0(Activity activity, Uri uri, C14600pS r3, AnonymousClass2KA r4, AnonymousClass10X r5, C35541m6 r6, String str, List list, int i2, boolean z2) {
        this.A09 = i2;
        this.A00 = r5;
        this.A08 = z2;
        this.A01 = list;
        this.A07 = str;
        this.A02 = r6;
        this.A03 = r4;
        this.A04 = uri;
        this.A05 = r3;
        this.A06 = activity;
    }

    public final void ARK(File file) {
        String str;
        int i2 = this.A09;
        AnonymousClass10X r5 = (AnonymousClass10X) this.A00;
        boolean z2 = this.A08;
        List list = (List) this.A01;
        String str2 = this.A07;
        C35541m6 r6 = (C35541m6) this.A02;
        File file2 = file;
        if (i2 != 0) {
            AnonymousClass2KA r1 = (AnonymousClass2KA) this.A03;
            Uri uri = (Uri) this.A04;
            C14600pS r2 = (C14600pS) this.A05;
            Context context = (Context) this.A06;
            try {
                r5.A07(r6, (C16740tZ) null, AnonymousClass1XK.A04, file2, str2, list, z2, true, false);
                r1.AZS(uri);
            } catch (IOException e2) {
                e = e2;
                if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                    r5.A01.A09(R.string.str15fd, 0);
                } else {
                    r5.A01.A0G(r2, context.getString(R.string.str0852));
                }
                str = "sendmedia/createconv/ioerror ";
                Log.e(str, e);
            }
        } else {
            AnonymousClass2KA r4 = (AnonymousClass2KA) this.A03;
            Uri uri2 = (Uri) this.A04;
            C14600pS r22 = (C14600pS) this.A05;
            Context context2 = (Context) this.A06;
            try {
                if (!r5.A07(r6, (C16740tZ) null, AnonymousClass1XK.A05, file2, str2, list, z2, true, false)) {
                    r4.AQs();
                }
                r4.AZS(uri2);
            } catch (IOException e3) {
                e = e3;
                if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                    r5.A01.A09(R.string.str15fd, 0);
                } else {
                    r5.A01.A0G(r22, context2.getString(R.string.str0852));
                }
                str = "sendmedia/sendaudio/ioerror ";
                Log.e(str, e);
            }
        }
    }
}
