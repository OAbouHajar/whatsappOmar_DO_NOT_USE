package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3iD  reason: invalid class name and case insensitive filesystem */
public class C70963iD extends C70983iF {
    public int A00 = 0;
    public final /* synthetic */ AnonymousClass12M A01;
    public final /* synthetic */ C61743Ad A02;
    public final /* synthetic */ AnonymousClass38O A03;
    public final /* synthetic */ File A04;

    public C70963iD(AnonymousClass12M r2, C61743Ad r3, AnonymousClass38O r4, File file) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = file;
    }

    public /* bridge */ /* synthetic */ Object A00(int i2) {
        C100134v9 r5 = new C100134v9(this);
        try {
            Log.i("restore>RestoreAction/restore-messages/stage: save message store to device");
            AnonymousClass38O r0 = this.A03;
            AnonymousClass2GM r3 = r0.A08;
            File file = this.A04;
            if (r3.A0C(r5, r0.A07, this.A02, file)) {
                return Boolean.TRUE;
            }
        } catch (C71123iW | C71133iX e2) {
            int i3 = this.A00;
            if (i3 <= 5) {
                this.A00 = i3 + 1;
            } else {
                throw new C71173ib("Having problems with local storage during restore", e2);
            }
        }
        return null;
    }
}
