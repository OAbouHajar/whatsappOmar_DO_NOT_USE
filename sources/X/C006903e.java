package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public final class C006903e extends C007003f {
    public C006903e(Class cls) {
        super(cls);
        this.A00.A0F = OverwritingInputMerger.class.getName();
    }

    public /* bridge */ /* synthetic */ AnonymousClass03k A01() {
        if (!this.A02 || Build.VERSION.SDK_INT < 23 || !this.A00.A0A.A00()) {
            return new AnonymousClass043(this);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
