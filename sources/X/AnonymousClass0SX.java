package X;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.0SX  reason: invalid class name */
public class AnonymousClass0SX {
    public static RemoteInput A00(AnonymousClass04G r4) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(r4.A02).setLabel(r4.A01).setChoices(r4.A04).setAllowFreeFormInput(true).addExtras(r4.A00);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = r4.A03.iterator();
            while (it.hasNext()) {
                AnonymousClass0LN.A00(addExtras, AnonymousClass000.A0m(it), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass0LO.A00(addExtras, 0);
        }
        return addExtras.build();
    }

    public static Bundle A01(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
