package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.0Rw  reason: invalid class name and case insensitive filesystem */
public class C05520Rw {
    public final C001300o A00;
    public final AnonymousClass0F5 A01;

    public C05520Rw(C001300o r3, C010505a r4) {
        this.A00 = r3;
        this.A01 = (AnonymousClass0F5) new C006602z(AnonymousClass0F5.A02, r4).A01(AnonymousClass0F5.class);
    }

    public void A00(Bundle bundle, AnonymousClass04A r6) {
        String str;
        AnonymousClass0F5 r2 = this.A01;
        if (r2.A01) {
            str = "Called while creating a loader";
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            AnonymousClass0F4 r1 = (AnonymousClass0F4) r2.A00.A01(0);
            AnonymousClass0SB r0 = null;
            if (r1 != null) {
                r0 = r1.A0C(false);
            }
            A01(bundle, r6, r0);
            return;
        } else {
            str = "restartLoader must be called on the main thread";
        }
        throw AnonymousClass000.A0V(str);
    }

    public final void A01(Bundle bundle, AnonymousClass04A r8, AnonymousClass0SB r9) {
        try {
            AnonymousClass0F5 r5 = this.A01;
            r5.A01 = true;
            AnonymousClass0SB APC = r8.APC(bundle, 0);
            Class<?> cls = APC.getClass();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                AnonymousClass0F4 r3 = new AnonymousClass0F4(bundle, APC, r9);
                r5.A00.A03(0, r3);
                r5.A01 = false;
                C001300o r2 = this.A00;
                C07470bt r1 = new C07470bt(r8, r3.A04);
                r3.A0A(r2, r1);
                C07470bt r0 = r3.A01;
                if (r0 != null) {
                    r3.A08(r0);
                }
                r3.A00 = r2;
                r3.A01 = r1;
                return;
            }
            throw AnonymousClass000.A0T(AnonymousClass000.A0e(APC, "Object returned from onCreateLoader must not be a non-static inner member class: ", AnonymousClass000.A0o()));
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    public void A02(AnonymousClass04A r6) {
        String str;
        AnonymousClass0F5 r2 = this.A01;
        if (r2.A01) {
            str = "Called while creating a loader";
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            AnonymousClass0F4 r3 = (AnonymousClass0F4) r2.A00.A01(0);
            if (r3 == null) {
                A01((Bundle) null, r6, (AnonymousClass0SB) null);
                return;
            }
            C001300o r22 = this.A00;
            C07470bt r1 = new C07470bt(r6, r3.A04);
            r3.A0A(r22, r1);
            C07470bt r0 = r3.A01;
            if (r0 != null) {
                r3.A08(r0);
            }
            r3.A00 = r22;
            r3.A01 = r1;
            return;
        } else {
            str = "initLoader must be called on the main thread";
        }
        throw AnonymousClass000.A0V(str);
    }

    @Deprecated
    public void A03(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AnonymousClass07U r5 = this.A01.A00;
        if (r5.A00 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0h = AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str));
            for (int i2 = 0; i2 < r5.A00; i2++) {
                AnonymousClass0F4 r6 = (AnonymousClass0F4) r5.A02[i2];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r5.A01[i2]);
                printWriter.print(": ");
                printWriter.println(r6.toString());
                printWriter.print(A0h);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println(r6.A03);
                printWriter.print(A0h);
                printWriter.print("mLoader=");
                AnonymousClass0SB r1 = r6.A04;
                printWriter.println(r1);
                r1.A05(AnonymousClass000.A0h("  ", AnonymousClass000.A0q(A0h)), fileDescriptor, printWriter, strArr);
                if (r6.A01 != null) {
                    printWriter.print(A0h);
                    printWriter.print("mCallbacks=");
                    printWriter.println(r6.A01);
                    C07470bt r12 = r6.A01;
                    printWriter.print(AnonymousClass000.A0h("  ", AnonymousClass000.A0q(A0h)));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(r12.A00);
                }
                printWriter.print(A0h);
                printWriter.print("mData=");
                Object A012 = r6.A01();
                StringBuilder sb = new StringBuilder(64);
                C04130Lh.A00(A012, sb);
                printWriter.println(AnonymousClass000.A0h("}", sb));
                printWriter.print(A0h);
                printWriter.print("mStarted=");
                printWriter.println(AnonymousClass000.A1Q(r6.A00));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        AnonymousClass000.A1G(this, sb);
        sb.append(" in ");
        C04130Lh.A00(this.A00, sb);
        return AnonymousClass000.A0h("}}", sb);
    }
}
