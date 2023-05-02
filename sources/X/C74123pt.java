package X;

import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.3pt  reason: invalid class name and case insensitive filesystem */
public class C74123pt extends C97644qK implements AnonymousClass1WE {
    public final AnonymousClass2JK A00;
    public final AnonymousClass1XP A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74123pt(android.content.Context r2, X.AnonymousClass2JK r3, X.AnonymousClass1XP r4) {
        /*
            r1 = this;
            X.1XS r0 = r4.A08
            java.lang.Object r0 = r0.A00()
            X.21L r0 = (X.AnonymousClass21L) r0
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0010:
            r1.<init>(r2, r0)
            r1.A01 = r4
            r1.A00 = r3
            return
        L_0x0018:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74123pt.<init>(android.content.Context, X.2JK, X.1XP):void");
    }

    public long AZr(AnonymousClass3AL r3) {
        this.A01.A08.A03(this, (Executor) null);
        return super.AZr(r3);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        File file = ((AnonymousClass21L) obj).A01;
        Uri fromFile = Uri.fromFile(file);
        synchronized (this.A04) {
            if (!fromFile.equals(this.A01)) {
                this.A01 = fromFile;
                this.A02 = true;
            }
        }
        AnonymousClass2JK r5 = this.A00;
        if (r5 != null) {
            if (!(r5.A01 == null || r5.A00 == file.length())) {
                r5.A02.A0K(new RunnableRunnableShape9S0100000_I0_8(r5, 6));
            }
            r5.A00 = file.length();
        }
    }

    public void close() {
        this.A01.A08.A02(this);
        super.close();
    }
}
