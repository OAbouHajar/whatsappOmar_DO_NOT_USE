package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0b7  reason: invalid class name */
public final class AnonymousClass0b7 implements C13280ll {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    public AnonymousClass0b7(AnonymousClass0b5 r5) {
        this.A02 = r5.A02;
        this.A01 = r5.A01;
        int i2 = r5.A00;
        if ((i2 & 1) == i2) {
            this.A00 = i2;
            this.A03 = r5.A03;
            this.A04 = r5.A04;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Requested flags 0x");
        AnonymousClass000.A1J(A0r, i2);
        A0r.append(", but only 0x");
        AnonymousClass000.A1J(A0r, 1);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" are allowed", A0r));
    }

    public ClipData AAe() {
        return this.A02;
    }

    public int ACL() {
        return this.A00;
    }

    public int AGA() {
        return this.A01;
    }

    public ContentInfo AH9() {
        return null;
    }

    public String toString() {
        String A0h;
        StringBuilder A0r = AnonymousClass000.A0r("ContentInfoCompat{clip=");
        A0r.append(this.A02.getDescription());
        A0r.append(", source=");
        int i2 = this.A01;
        A0r.append(i2 != 1 ? i2 != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        A0r.append(", flags=");
        int i3 = this.A00;
        A0r.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
        Uri uri = this.A03;
        String str = "";
        if (uri == null) {
            A0h = str;
        } else {
            StringBuilder A0r2 = AnonymousClass000.A0r(", hasLinkUri(");
            A0r2.append(uri.toString().length());
            A0h = AnonymousClass000.A0h(")", A0r2);
        }
        A0r.append(A0h);
        if (this.A04 != null) {
            str = ", hasExtras";
        }
        A0r.append(str);
        return AnonymousClass000.A0h("}", A0r);
    }
}
