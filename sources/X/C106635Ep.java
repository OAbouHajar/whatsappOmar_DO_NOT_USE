package X;

import android.os.Bundle;

/* renamed from: X.5Ep  reason: invalid class name and case insensitive filesystem */
public final class C106635Ep extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AnonymousClass01A $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106635Ep(AnonymousClass01A r2, String str) {
        super(0);
        this.$this_stringArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String string;
        Bundle bundle = this.$this_stringArg.A05;
        if (bundle != null && (string = bundle.getString(this.$key)) != null) {
            return string;
        }
        throw AnonymousClass000.A0W(C18450wi.A06("No value for ", this.$key));
    }
}
