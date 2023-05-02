package com.obwhatsapp.settings;

import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;

public class Licenses extends C14530pL {
    public boolean A00;

    public Licenses() {
        this(0);
    }

    public Licenses(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 114);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r6, r0)
            r0 = 2131559294(0x7f0d037e, float:1.8743928E38)
            r6.setContentView((int) r0)
            r0 = 2131364288(0x7f0a09c0, float:1.8348409E38)
            android.widget.TextView r5 = X.C13680ns.A0N(r6, r0)
            r1 = 2131820559(0x7f11000f, float:1.9273836E38)
            android.content.res.Resources r0 = r6.getResources()     // Catch:{ IOException -> 0x0057 }
            java.io.InputStream r4 = r0.openRawResource(r1)     // Catch:{ IOException -> 0x0057 }
            int r0 = r4.available()     // Catch:{ all -> 0x0050 }
            if (r0 > 0) goto L_0x0029
            r0 = 32
        L_0x0029:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0050 }
            r3.<init>(r0)     // Catch:{ all -> 0x0050 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x004b }
        L_0x0032:
            int r1 = r4.read(r2)     // Catch:{ all -> 0x004b }
            r0 = -1
            if (r1 == r0) goto L_0x003e
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ all -> 0x004b }
            goto L_0x0032
        L_0x003e:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x004b }
            r3.close()     // Catch:{ all -> 0x0050 }
            r4.close()     // Catch:{ IOException -> 0x0057 }
            if (r0 != 0) goto L_0x0064
            goto L_0x005d
        L_0x004b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            if (r4 == 0) goto L_0x0056
            r4.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            java.lang.String r0 = "licenses/cannot-load "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005d:
            r0 = 2131892325(0x7f121865, float:1.9419395E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0064:
            r5.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.Licenses.onCreate(android.os.Bundle):void");
    }
}
