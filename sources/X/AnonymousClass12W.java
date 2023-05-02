package X;

import android.os.Build;
import android.os.Environment;
import com.facebook.redex.IDxProviderShape36S0300000_2_I0;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.12W  reason: invalid class name */
public class AnonymousClass12W {
    public final C16190sc A00;
    public final C16980tz A01;
    public final C16260sj A02;
    public final C14730pf A03;
    public final AnonymousClass12X A04;
    public final C16320sq A05;
    public final AnonymousClass01D A06;
    public final List A07 = new CopyOnWriteArrayList();

    public AnonymousClass12W(C16190sc r4, C16980tz r5, C16260sj r6, C14730pf r7, AnonymousClass12X r8, C16320sq r9) {
        this.A01 = r5;
        this.A05 = r9;
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A06 = new AnonymousClass01T((Object) null, new IDxProviderShape36S0300000_2_I0(r6, r4, r7, 2));
    }

    public AnonymousClass1XH A00() {
        return (AnonymousClass1XH) ((C40751ud) this.A06.get()).A02.get();
    }

    public File A01(File file) {
        return (this.A00.A0B(file) ? A00() : this.A04.A00).A00("");
    }

    public boolean A02() {
        AnonymousClass01D r1 = this.A06;
        return ((C40751ud) r1.get()).A00 || ((C40751ud) r1.get()).A01;
    }

    public boolean A03(C32301g2 r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            r4.AZJ(externalStorageState);
            return false;
        } else if (Build.VERSION.SDK_INT < 23 || this.A02.A04(C28971Zm.A00(this.A01.A00, false, false)) != -1) {
            return true;
        } else {
            r4.AZK();
            return false;
        }
    }

    public boolean A04(C32301g2 r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            r4.AVg(externalStorageState);
            return false;
        } else if (!"mounted".equals(externalStorageState)) {
            r4.AZJ(externalStorageState);
            return false;
        } else if (this.A02.A03("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            r4.AVh();
            return false;
        }
    }
}
