package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.3EQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EQ implements C14280ou {
    public final /* synthetic */ AnonymousClass5UU A00;
    public final /* synthetic */ AnonymousClass4GT A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ AnonymousClass3EQ(AnonymousClass5UU r1, AnonymousClass4GT r2, byte[] bArr) {
        this.A01 = r2;
        this.A02 = bArr;
        this.A00 = r1;
    }

    public final void AYB(Object obj) {
        AnonymousClass4GT r2 = this.A01;
        byte[] bArr = this.A02;
        AnonymousClass5UU r6 = this.A00;
        Boolean bool = (Boolean) obj;
        r2.A00 = bool.booleanValue();
        Log.i(AnonymousClass000.A0g("BackupTokenUtils/setBlockStoreBytes/isE2EEAvailable ", bool));
        r2.A01 = bArr;
        AnonymousClass3X4 r5 = new AnonymousClass3X4(bArr, r2.A00);
        AnonymousClass3WU r62 = (AnonymousClass3WU) r6;
        C88714ay r4 = new C88714ay((AnonymousClass44J) null);
        r4.A03 = new AnonymousClass3Y2[]{AnonymousClass4BK.A03, AnonymousClass4BK.A05};
        r4.A01 = new C97954qr(r5, r62);
        r4.A00 = 1645;
        r4.A02 = false;
        C14210on A012 = r62.A01(r4.A00(), 1);
        C98824t2 r0 = new C98824t2();
        Executor executor = C14500pH.A00;
        A012.A06(r0, executor);
        A012.A05(new C98814t1(), executor);
    }
}
