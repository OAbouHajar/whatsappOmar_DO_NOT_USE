package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.1vL  reason: invalid class name and case insensitive filesystem */
public class C41171vL extends C41091vD {
    public final C14710pd A00;

    public C41171vL(C14710pd r1) {
        this.A00 = r1;
    }

    public void A02(Context context, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", yo.bIc());
        bundle.putInt("badgenumber", i2);
        if (this.A00.A0E(C16620tM.A02, 2337)) {
            try {
                context.getContentResolver().call(Uri.parse("content://com.hihonor.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
            } catch (Exception e2) {
                Log.e("Unexpected exception while honor badging", e2);
            }
        }
    }
}
