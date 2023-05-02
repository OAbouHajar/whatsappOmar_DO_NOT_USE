package com.facebook.redex;

import X.C204310c;
import X.C204710g;
import X.C447225g;
import android.os.Message;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

public class RunnableRunnableShape0S1111000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public RunnableRunnableShape0S1111000_I0(Object obj, String str, int i2, int i3, boolean z2) {
        this.A04 = i3;
        this.A01 = obj;
        this.A03 = z2;
        this.A00 = i2;
        this.A02 = str;
    }

    public final void run() {
        if (this.A04 != 0) {
            C447225g r6 = (C447225g) this.A01;
            boolean z2 = this.A03;
            String str = this.A02;
            int i2 = this.A00;
            if (z2) {
                r6.A0V();
                r6.A2f.setRequestedCamera2SupportLevel(r6.A1j.A02(), r6.A1i);
            }
            int previewCallLink = Voip.previewCallLink(str, z2);
            if (previewCallLink == 0) {
                r6.A0q = Integer.valueOf(i2);
                return;
            }
            StringBuilder sb = new StringBuilder("voip/actionPreviewCallLink failed error: ");
            sb.append(previewCallLink);
            Log.e(sb.toString());
            return;
        }
        boolean z3 = this.A03;
        int i3 = this.A00;
        String str2 = this.A02;
        Message obtain = Message.obtain();
        obtain.arg1 = z3 ? 1 : 0;
        obtain.arg2 = i3;
        obtain.obj = str2;
        ((C204310c) this.A01).A09.A00(new C204710g(obtain, "preview_call_link"));
    }
}
