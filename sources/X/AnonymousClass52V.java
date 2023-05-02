package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.52V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass52V implements AnonymousClass20K {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C55472jf A01;

    public /* synthetic */ AnonymousClass52V(Intent intent, C55472jf r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final void ARK(File file) {
        C55472jf r4 = this.A01;
        Intent intent = this.A00;
        try {
            AnonymousClass10X r5 = r4.A07;
            C15830rv r2 = r4.A0T;
            AnonymousClass1XK r8 = AnonymousClass1XK.A05;
            boolean booleanExtra = intent.getBooleanExtra("has_preview", true);
            AnonymousClass1yW r1 = r4.A0I;
            File file2 = file;
            r5.A07((C35541m6) null, r1.AFJ(), r8, file2, (String) null, Collections.singletonList(r2), false, booleanExtra, r4.A0e);
            r1.A5G(6);
        } catch (IOException e2) {
            r4.A05.A09(R.string.str15fd, 0);
            Log.e((Throwable) e2);
        }
    }
}
