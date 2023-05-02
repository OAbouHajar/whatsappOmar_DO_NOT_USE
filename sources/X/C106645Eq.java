package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.5Eq  reason: invalid class name and case insensitive filesystem */
public final class C106645Eq extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ String $key = "admin_jid";
    public final /* synthetic */ AnonymousClass01A $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106645Eq(AnonymousClass01A r2) {
        super(0);
        this.$this_jidArg = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String string;
        Bundle bundle = this.$this_jidArg.A05;
        if (!(bundle == null || (string = bundle.getString(this.$key)) == null)) {
            Jid nullable = Jid.getNullable(string);
            if ((nullable instanceof C15830rv) && nullable != null) {
                return nullable;
            }
        }
        throw AnonymousClass5Ao.A00;
    }
}
