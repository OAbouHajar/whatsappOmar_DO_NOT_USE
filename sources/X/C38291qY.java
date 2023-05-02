package X;

import com.facebook.redex.IDxDListenerShape344S0100000_2_I0;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1qY  reason: invalid class name and case insensitive filesystem */
public class C38291qY extends C38301qZ implements C38331qc, C38341qd {
    public File A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final AnonymousClass01Z A03;
    public final C14710pd A04;
    public final C209212c A05;
    public final C34151jm A06;
    public final C34421kE A07 = new C34421kE();
    public final File A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C38291qY(X.C16300so r10, X.C16180sb r11, X.C14870pt r12, X.AnonymousClass01Z r13, X.C15900s5 r14, X.C17130ua r15, X.C14730pf r16, X.C14710pd r17, X.C20330zs r18, X.C209212c r19, X.C19040xf r20, X.C34151jm r21, java.io.File r22) {
        /*
            r9 = this;
            java.util.concurrent.Executor r8 = r12.A06
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A04 = r5
            r0 = r21
            r9.A06 = r0
            r9.A01 = r10
            r9.A02 = r11
            X.1kE r0 = new X.1kE
            r0.<init>()
            r9.A07 = r0
            r0 = r22
            r9.A08 = r0
            r0 = r19
            r9.A05 = r0
            r9.A03 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38291qY.<init>(X.0so, X.0sb, X.0pt, X.01Z, X.0s5, X.0ua, X.0pf, X.0pd, X.0zs, X.12c, X.0xf, X.1jm, java.io.File):void");
    }

    public C31701et A8E() {
        C209212c r3 = this.A05;
        IDxDListenerShape344S0100000_2_I0 iDxDListenerShape344S0100000_2_I0 = new IDxDListenerShape344S0100000_2_I0(this, 1);
        C34151jm r1 = this.A06;
        if (r3.A0C(iDxDListenerShape344S0100000_2_I0, this, (C38241qT) null, (C16730tY) null, r1.A0D, false)) {
            try {
                return (C31701et) this.A07.get();
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e2);
            }
        } else {
            A4Z(this);
            C31701et r32 = A01().A00;
            if (r32.A01 == 0) {
                File file = this.A08;
                AnonymousClass1XO A002 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(file.getAbsolutePath()));
                if (!(A002 == null && (A002 = r1.A04) == null)) {
                    C37781pj[] r11 = A002.A09;
                    WebpUtils.A01(file, new AnonymousClass1XO(A002.A02, A002.A03, A002.A05, A002.A04, A002.A01, A002.A00, r11, A002.A07, A002.A08, true).A01());
                }
                try {
                    String A003 = C37981q3.A00(file);
                    r1.A0A = A003;
                    r1.A0D = A003;
                    File A032 = this.A03.A03(A003);
                    this.A00 = A032;
                    AnonymousClass1XI.A0C(this.A02.A04, file, A032);
                    return r32;
                } catch (IOException unused) {
                    return new C31701et(1);
                }
            }
            return new C31701et(1);
        }
    }

    public File ABl() {
        return this.A00;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
    }

    public void AQ4(C31701et r1, C30761cu r2) {
    }
}
