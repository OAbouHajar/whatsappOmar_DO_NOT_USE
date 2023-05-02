package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.5uM  reason: invalid class name and case insensitive filesystem */
public class C118235uM {
    public C42001x2 A00;
    public C16980tz A01;
    public Map A02;
    public final C17020u3 A03;

    public C118235uM(C16980tz r4, C17020u3 r5) {
        this.A03 = r5;
        this.A01 = r4;
        try {
            this.A00 = C42001x2.A00(new File(r4.A00.getCacheDir(), "bk_cache_dir"), 10485760);
        } catch (IOException unused) {
            Log.e("BkCacheSaveOnDiskHelper/const unable to initialize disk cache for bk cache");
        }
        this.A02 = AnonymousClass000.A0x();
    }

    public final void A00() {
        C13680ns.A0y(this.A03.A00("bloks").edit(), "bk_cache_lookup_map", this.A02.values().toString());
    }
}
