package X;

import android.os.Environment;
import com.facebook.redex.IDxProviderShape13S0400000_2_I0;
import com.whatsapp.util.Log;

/* renamed from: X.1ud  reason: invalid class name and case insensitive filesystem */
public class C40751ud {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass01D A02;

    public C40751ud(C16190sc r9, C16260sj r10, C14730pf r11) {
        String obj;
        this.A02 = new AnonymousClass01T((Object) null, new IDxProviderShape13S0400000_2_I0(r9, r10, this, r11, 1));
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
            return;
        }
        if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            obj = "media-state-manager/main/media/read-only";
        } else {
            this.A00 = true;
            this.A01 = false;
            StringBuilder sb = new StringBuilder("media-state-manager/main/media/unavailable ");
            sb.append(externalStorageState);
            obj = sb.toString();
        }
        Log.i(obj);
    }
}
