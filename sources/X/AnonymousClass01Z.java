package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

/* renamed from: X.01Z  reason: invalid class name */
public class AnonymousClass01Z {
    public final C16180sb A00;
    public final C19000xb A01;
    public final C16980tz A02;
    public final C002501a A03;
    public final C221516v A04;
    public final C17020u3 A05;

    public AnonymousClass01Z(C16180sb r1, C19000xb r2, C16980tz r3, C002501a r4, C221516v r5, C17020u3 r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }

    public int A00(File file, byte b2, int i2, boolean z2, boolean z3) {
        if (!A08(file)) {
            return 0;
        }
        int A012 = this.A03.A01(file.getAbsolutePath(), i2);
        if (z2 && A012 < 0) {
            if (z3) {
                this.A01.A00(new C28801Xr(file, b2));
            } else {
                A04(file, b2);
                return A012;
            }
        }
        return A012;
    }

    public File A01() {
        return this.A00.A0B();
    }

    public File A02(String str) {
        File A032 = A03(str);
        if (!A032.exists()) {
            return null;
        }
        A06(A032, 1, true);
        return A032;
    }

    public File A03(String str) {
        File A012 = A01();
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(IOUtils.DIR_SEPARATOR_UNIX, '-'));
        sb.append(".webp");
        return new File(A012, sb.toString());
    }

    public void A04(File file, byte b2) {
        Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
        this.A04.A05(file, b2);
    }

    public void A05(File file, int i2, boolean z2) {
        if (A08(file)) {
            A06(file, i2, z2);
        }
    }

    public final void A06(File file, int i2, boolean z2) {
        if (!z2) {
            i2--;
        }
        this.A03.A02(file.getAbsolutePath(), i2);
    }

    public void A07(String str) {
        File A032 = A03(str);
        if (this.A03.A01(A032.getAbsolutePath(), 1) < 0) {
            C16180sb.A03(A032);
        }
    }

    public final boolean A08(File file) {
        try {
            C16180sb r1 = this.A00;
            return r1.A0U(file) || r1.A0T(file) || r1.A0V(file);
        } catch (IOException e2) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e2);
            return false;
        }
    }
}
