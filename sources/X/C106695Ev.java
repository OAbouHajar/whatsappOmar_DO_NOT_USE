package X;

import android.os.Bundle;

/* renamed from: X.5Ev  reason: invalid class name and case insensitive filesystem */
public final class C106695Ev extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key = "arg_is_business";
    public final /* synthetic */ AnonymousClass01A $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106695Ev(AnonymousClass01A r3) {
        super(0);
        this.$this_booleanArg = r3;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Bundle bundle = this.$this_booleanArg.A05;
        return Boolean.valueOf(bundle == null ? this.$default : Boolean.valueOf(bundle.getBoolean(this.$key, this.$default)).booleanValue());
    }
}
