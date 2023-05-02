package X;

import android.os.Bundle;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.5Er  reason: invalid class name and case insensitive filesystem */
public final class C106655Er extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ String $key = "group_jid";
    public final /* synthetic */ AnonymousClass01A $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106655Er(AnonymousClass01A r2) {
        super(0);
        this.$this_jidArg = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String string;
        Bundle bundle = this.$this_jidArg.A05;
        if (!(bundle == null || (string = bundle.getString(this.$key)) == null)) {
            Jid nullable = Jid.getNullable(string);
            if ((nullable instanceof GroupJid) && nullable != null) {
                return nullable;
            }
        }
        throw AnonymousClass5Ao.A00;
    }
}
