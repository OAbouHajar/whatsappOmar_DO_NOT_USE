package X;

import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: X.0b6  reason: invalid class name */
public final class AnonymousClass0b6 implements C13280ll {
    public final ContentInfo A00;

    public AnonymousClass0b6(ContentInfo contentInfo) {
        this.A00 = contentInfo;
    }

    public ClipData AAe() {
        return this.A00.getClip();
    }

    public int ACL() {
        return this.A00.getFlags();
    }

    public int AGA() {
        return this.A00.getSource();
    }

    public ContentInfo AH9() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ContentInfoCompat{");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
