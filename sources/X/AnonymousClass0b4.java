package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0b4  reason: invalid class name */
public final class AnonymousClass0b4 implements C13270lk {
    public final ContentInfo.Builder A00;

    public AnonymousClass0b4(ClipData clipData, int i2) {
        this.A00 = new ContentInfo.Builder(clipData, i2);
    }

    public C06130Uj A5h() {
        return new C06130Uj(new AnonymousClass0b6(this.A00.build()));
    }

    public void Adw(int i2) {
        this.A00.setFlags(i2);
    }

    public void Ae6(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }
}
