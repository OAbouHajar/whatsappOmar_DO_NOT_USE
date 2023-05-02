package com.obwhatsapp.perf.profilo;

import X.AnonymousClass006;
import X.AnonymousClass03I;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C003901s;
import X.C15860rz;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C17130ua;
import X.C17660vR;
import X.C17670vS;
import X.C18260wP;
import X.C23401Bv;
import X.C29551ao;
import X.C29561ap;
import X.C59132uj;
import android.content.Intent;
import com.facebook.redex.IDxFFilterShape28S0000000_2_I0;
import com.facebook.redex.IDxListenerShape86S0200000_2_I0;
import com.mod2.fblibs.Facebook;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;

public class ProfiloUploadService extends AnonymousClass03I implements AnonymousClass006 {
    public C16300so A00;
    public C17130ua A01;
    public C18260wP A02;
    public C15860rz A03;
    public C17670vS A04;
    public C17660vR A05;
    public C16320sq A06;
    public boolean A07;
    public final Object A08;
    public volatile AnonymousClass54I A09;

    public ProfiloUploadService() {
        this(0);
    }

    public ProfiloUploadService(int i2) {
        this.A08 = new Object();
        this.A07 = false;
    }

    public void A05(Intent intent) {
        File[] listFiles;
        int length;
        File file = new File(getCacheDir(), "profilo/upload");
        if (file.exists() && (listFiles = file.listFiles(new IDxFFilterShape28S0000000_2_I0(4))) != null && (length = listFiles.length) != 0) {
            for (int i2 = 1; i2 < length; i2++) {
                listFiles[i2].delete();
                listFiles[i2].getPath();
            }
            File file2 = listFiles[0];
            if (this.A02.A04(true) == 1) {
                try {
                    C29551ao r7 = new C29551ao(this.A01, new IDxListenerShape86S0200000_2_I0(file2, 0, this), this.A04, "https://crashlogs.whatsapp.net/wa_profilo_data", this.A05.A00(), 7, false, false, false);
                    r7.A06(Facebook.TOKEN, "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                    r7.A06("from", this.A00.A00());
                    r7.A05(new FileInputStream(file2), "file", file2.getName(), 0, file2.length());
                    C23401Bv r3 = (C23401Bv) this.A00;
                    r7.A06("agent", r3.A0D.A01(r3.A07, C003901s.A00()));
                    r7.A06("build_id", String.valueOf(438774090));
                    r7.A06("device_id", this.A03.A0N());
                    r7.A02((C29561ap) null);
                    return;
                } catch (Exception | OutOfMemoryError e2) {
                    Log.w("ProfiloUpload/Error Uploading file", e2);
                }
            }
            if (file2 != null) {
                file2.delete();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public void onCreate() {
        if (!this.A07) {
            this.A07 = true;
            C16150sX r1 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A05 = (C17660vR) r1.APW.get();
            this.A00 = (C16300so) r1.A5p.get();
            this.A06 = (C16320sq) r1.ARB.get();
            this.A01 = (C17130ua) r1.AN9.get();
            this.A04 = (C17670vS) r1.ALM.get();
            this.A02 = (C18260wP) r1.A4p.get();
            this.A03 = (C15860rz) r1.AQh.get();
        }
        super.onCreate();
    }
}
