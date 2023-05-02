package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ED  reason: invalid class name */
public final class AnonymousClass5ED extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass4WK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ED(AnonymousClass4WK r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        List<UserJid> list = this.this$0.A02;
        ArrayList A0N = AnonymousClass1J9.A0N(list);
        for (UserJid r1 : list) {
            A0N.add(new C83104Fj(r1));
        }
        AnonymousClass4WK r0 = this.this$0;
        return new C83094Fi(new C612438d(r0.A00, new C51812cK(r0.A01)), A0N);
    }
}
