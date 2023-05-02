package X;

import android.content.Intent;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;

/* renamed from: X.5za  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119765za implements AnonymousClass2Su {
    public final /* synthetic */ C119965zu A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C119765za(C119965zu r1, WaBloksActivity waBloksActivity, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = waBloksActivity;
    }

    public final boolean AM4(Intent intent, int i2, int i3) {
        C119965zu r5 = this.A00;
        String str = this.A02;
        WaBloksActivity waBloksActivity = this.A01;
        if (i3 != -1 || i2 != 1) {
            return false;
        }
        List A08 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
        if (A08.isEmpty()) {
            return true;
        }
        ((AnonymousClass1KE) r5.A0L.get()).A01(new AnonymousClass62V(r5, waBloksActivity, str, A08), str);
        return true;
    }
}
