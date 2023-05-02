package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.3td  reason: invalid class name and case insensitive filesystem */
public final class C76263td extends AnonymousClass37N {
    public final C16180sb A00;

    public C76263td(C16300so r11, C16180sb r12, Mp4Ops mp4Ops, C17130ua r14, AnonymousClass12W r15, C16440t3 r16, C37661pW r17, AnonymousClass20R r18, String str) {
        super(r11, mp4Ops, r14, r15, r16, r18, r17, str, true);
        this.A00 = r12;
    }

    public File A0C() {
        C16180sb r2 = this.A00;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C17970vw.A0H());
        return r2.A0N(AnonymousClass000.A0h(".mp4", A0o));
    }
}
