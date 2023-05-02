package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: X.0NR  reason: invalid class name */
public final class AnonymousClass0NR {
    public final C13270lk A00;

    public AnonymousClass0NR(ClipData clipData, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.A00 = new AnonymousClass0b4(clipData, i2);
        } else {
            this.A00 = new AnonymousClass0b5(clipData, i2);
        }
    }

    public static C06130Uj A00(Bundle bundle, InputContentInfoCompat inputContentInfoCompat) {
        AnonymousClass0NR r2 = new AnonymousClass0NR(new ClipData(inputContentInfoCompat.mImpl.getDescription(), new ClipData.Item(inputContentInfoCompat.mImpl.getContentUri())), 2);
        Uri linkUri = inputContentInfoCompat.mImpl.getLinkUri();
        C13270lk r0 = r2.A00;
        r0.Ae6(linkUri);
        r0.setExtras(bundle);
        return r0.A5h();
    }
}
