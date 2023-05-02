package X;

import android.os.Bundle;

/* renamed from: X.5Ew  reason: invalid class name and case insensitive filesystem */
public final class C106705Ew extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ int $default = 6;
    public final /* synthetic */ String $key = "arg_entry_point";
    public final /* synthetic */ AnonymousClass01A $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106705Ew(AnonymousClass01A r3) {
        super(0);
        this.$this_intArg = r3;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Bundle bundle = this.$this_intArg.A05;
        return Integer.valueOf(bundle == null ? this.$default : Integer.valueOf(bundle.getInt(this.$key, this.$default)).intValue());
    }
}
