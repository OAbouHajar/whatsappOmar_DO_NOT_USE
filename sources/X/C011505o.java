package X;

import java.util.Iterator;

/* renamed from: X.05o  reason: invalid class name and case insensitive filesystem */
public class C011505o implements Iterator, C011605p {
    public AnonymousClass060 A00;
    public boolean A01 = true;
    public final /* synthetic */ AnonymousClass03P A02;

    public C011505o(AnonymousClass03P r2) {
        this.A02 = r2;
    }

    public void AgW(AnonymousClass060 r3) {
        AnonymousClass060 r0 = this.A00;
        if (r3 == r0) {
            AnonymousClass060 r1 = r0.A01;
            this.A00 = r1;
            boolean z2 = false;
            if (r1 == null) {
                z2 = true;
            }
            this.A01 = z2;
        }
    }

    public boolean hasNext() {
        AnonymousClass060 r0;
        if (this.A01) {
            r0 = this.A02.A02;
        } else {
            AnonymousClass060 r02 = this.A00;
            if (r02 == null) {
                return false;
            }
            r0 = r02.A00;
        }
        return r0 != null;
    }

    public /* bridge */ /* synthetic */ Object next() {
        AnonymousClass060 r0;
        if (this.A01) {
            this.A01 = false;
            r0 = this.A02.A02;
        } else {
            AnonymousClass060 r02 = this.A00;
            r0 = r02 != null ? r02.A00 : null;
        }
        this.A00 = r0;
        return r0;
    }
}
