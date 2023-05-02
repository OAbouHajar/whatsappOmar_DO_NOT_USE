package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.4my  reason: invalid class name and case insensitive filesystem */
public class C95644my implements C12870l6 {
    public final /* synthetic */ C82074Bc A00;
    public final /* synthetic */ C805444h A01;

    public C95644my(C82074Bc r1, C805444h r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AcC(C06180Up r4, Throwable th) {
        String obj;
        Object[] objArr = new Object[4];
        AnonymousClass000.A1K(objArr, System.identityHashCode(this));
        AnonymousClass000.A1L(objArr, System.identityHashCode(r4));
        objArr[2] = AnonymousClass000.A0d(r4.A00());
        if (th == null) {
            obj = "";
        } else {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        objArr[3] = obj;
        AnonymousClass0X1.A03("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", objArr);
    }
}
