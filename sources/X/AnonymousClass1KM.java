package X;

import android.net.Uri;
import android.os.Build;
import com.facebook.redex.IDxFunctionShape361S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import javax.crypto.AEADBadTagException;

/* renamed from: X.1KM  reason: invalid class name */
public class AnonymousClass1KM {
    public int A00;
    public final C16040sK A01;
    public final C16200sd A02;
    public final AnonymousClass12O A03;
    public final C19670yo A04;
    public final C16190sc A05;
    public final AnonymousClass12W A06;
    public final C16980tz A07;
    public final C15860rz A08;
    public final C18790xG A09;
    public final C16250si A0A;
    public final AnonymousClass12X A0B;
    public final C16990u0 A0C;
    public final AnonymousClass12V A0D;

    public AnonymousClass1KM(C16040sK r1, C16200sd r2, AnonymousClass12O r3, C19670yo r4, C16190sc r5, AnonymousClass12W r6, C16980tz r7, C15860rz r8, C18790xG r9, C16250si r10, AnonymousClass12X r11, C16990u0 r12, AnonymousClass12V r13) {
        this.A07 = r7;
        this.A0D = r13;
        this.A01 = r1;
        this.A05 = r5;
        this.A09 = r9;
        this.A02 = r2;
        this.A06 = r6;
        this.A0A = r10;
        this.A08 = r8;
        this.A0C = r12;
        this.A03 = r3;
        this.A04 = r4;
        this.A0B = r11;
    }

    public boolean A00(Uri uri) {
        try {
            File file = (File) this.A05.A03.get();
            if (file != null) {
                C16960tx r13 = C16960tx.A06;
                AnonymousClass12V r14 = this.A0D;
                C16040sK r5 = this.A01;
                C18790xG r10 = this.A09;
                return C40951ux.A00(r5, new C62663El(uri, this.A07), (C40961uy) null, this.A02, this.A06, r10, this.A0B, this.A0C, r13, r14, (Boolean) null).A05(new IDxFunctionShape361S0100000_2_I0(file, 0), true);
            }
        } catch (IOException e2) {
            if (Build.VERSION.SDK_INT < 19 || e2.getCause() == null || !(e2.getCause() instanceof AEADBadTagException)) {
                return e2.getMessage() != null && e2.getMessage().contains("mac check in GCM failed");
            }
            return true;
        } catch (Exception e3) {
            Log.e("backup-export-storage/restore/failed/", e3);
            return false;
        }
    }
}
