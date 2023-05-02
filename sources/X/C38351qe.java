package X;

import com.facebook.redex.IDxDListenerShape344S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1qe  reason: invalid class name and case insensitive filesystem */
public class C38351qe extends C38361qf implements C38331qc, C38341qd {
    public final AnonymousClass01Z A00;
    public final C209212c A01;
    public final C34151jm A02;
    public final C34421kE A03 = new C34421kE();
    public final File A04;

    public C38351qe(C14870pt r10, AnonymousClass01Z r11, C15900s5 r12, C17130ua r13, C14730pf r14, C14710pd r15, C20330zs r16, C209212c r17, C19040xf r18, C34151jm r19, File file) {
        super(r12, r13, r14, r15, r16, r18, r10.A06);
        this.A02 = r19;
        this.A04 = file;
        this.A01 = r17;
        this.A00 = r11;
    }

    public C31701et A8E() {
        if (this.A01.A0C(new IDxDListenerShape344S0100000_2_I0(this, 2), this, (C38241qT) null, (C16730tY) null, this.A02.A0D, false)) {
            try {
                return (C31701et) this.A03.get();
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e2);
                return new C31701et(1);
            }
        } else {
            A4Z(this);
            return A01().A00;
        }
    }

    public File ABl() {
        return this.A04;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
    }

    public void AQ4(C31701et r1, C30761cu r2) {
    }
}
