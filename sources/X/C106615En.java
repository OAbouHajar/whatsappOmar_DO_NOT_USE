package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.5En  reason: invalid class name and case insensitive filesystem */
public final class C106615En extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ String $key = "arg_jid";
    public final /* synthetic */ AnonymousClass01A $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106615En(AnonymousClass01A r2) {
        super(0);
        this.$this_jidArg = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String string;
        Jid nullable;
        Bundle bundle = this.$this_jidArg.A05;
        if (bundle != null && (string = bundle.getString(this.$key)) != null && (nullable = Jid.getNullable(string)) != null) {
            return nullable;
        }
        throw AnonymousClass5Ao.A00;
    }
}
