package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.0b5  reason: invalid class name */
public final class AnonymousClass0b5 implements C13270lk {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public AnonymousClass0b5(ClipData clipData, int i2) {
        this.A02 = clipData;
        this.A01 = i2;
    }

    public C06130Uj A5h() {
        return new C06130Uj(new AnonymousClass0b7(this));
    }

    public void Adw(int i2) {
        this.A00 = i2;
    }

    public void Ae6(Uri uri) {
        this.A03 = uri;
    }

    public void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
