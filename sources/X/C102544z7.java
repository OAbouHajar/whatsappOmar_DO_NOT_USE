package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.4z7  reason: invalid class name and case insensitive filesystem */
public class C102544z7 implements C29541an {
    public final /* synthetic */ C205510p A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;

    public C102544z7(C205510p r1, File file, File file2, File file3) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = file2;
        this.A01 = file3;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public void APP(long j2) {
        this.A03.delete();
        this.A02.delete();
        this.A01.delete();
    }

    public void AQb(String str) {
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("MemoryExceptionsUploadHelper/Error: ")));
    }

    public void AWH(String str, Map map) {
    }
}
