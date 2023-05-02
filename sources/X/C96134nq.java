package X;

import java.io.File;
import java.util.Collection;

/* renamed from: X.4nq  reason: invalid class name and case insensitive filesystem */
public class C96134nq implements C109585Ss {
    public final AnonymousClass5UN A00;

    public C96134nq(AnonymousClass5UN r1) {
        this.A00 = r1;
    }

    public Collection A9s() {
        return this.A00.A9t();
    }

    public boolean AJq(String str) {
        File ACH = this.A00.ACH(str);
        return ACH.exists() && !ACH.canExecute();
    }

    public long AJw(String str) {
        return this.A00.AK3(str);
    }

    public long AJx(String str) {
        return this.A00.ACt(str);
    }

    public boolean Abs(String str) {
        return this.A00.Abs(str);
    }
}
