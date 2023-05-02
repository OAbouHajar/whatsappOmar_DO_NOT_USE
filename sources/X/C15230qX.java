package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.0qX  reason: invalid class name and case insensitive filesystem */
public class C15230qX implements C15240qY {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final C15250qZ A02;
    public final C15340qi A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Executor A05;

    public C15230qX(C15340qi r3) {
        this.A03 = r3;
        this.A02 = ((C27311Rg) r3).AGI("eviction.v2");
        this.A05 = ((C27301Rf) r3).AC5(C47742Kf.CONCURRENT);
    }

    public /* bridge */ /* synthetic */ void AUR(C29711b4 r8, C15270qb r9, File file) {
        File file2;
        C15300qe r4 = (C15300qe) r9;
        String str = r4.A00;
        if (str == null) {
            str = "wa_stash__gif_preview_cache";
        }
        r4.A00 = str;
        Map map = this.A04;
        File file3 = file;
        try {
            file2 = file.getCanonicalFile();
        } catch (IOException unused) {
            file2 = file.getAbsoluteFile();
        }
        map.put(file2, r4);
        this.A05.execute(new RunnableRunnableShape0S0400000_I0(this, r8, r4, file3, 0));
    }
}
