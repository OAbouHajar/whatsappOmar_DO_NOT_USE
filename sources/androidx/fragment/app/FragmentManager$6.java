package androidx.fragment.app;

import X.AnonymousClass02C;
import X.AnonymousClass05T;
import X.AnonymousClass07E;
import X.C001300o;
import X.C009704q;
import X.C011405n;
import android.os.Bundle;
import java.util.Map;

public class FragmentManager$6 implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass02C A00;
    public final /* synthetic */ AnonymousClass07E A01;
    public final /* synthetic */ C009704q A02;
    public final /* synthetic */ String A03;

    public FragmentManager$6(AnonymousClass02C r1, AnonymousClass07E r2, C009704q r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AXa(C011405n r5, C001300o r6) {
        if (r5 == C011405n.ON_START) {
            Map map = this.A00.A0Y;
            String str = this.A03;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.A01.ARb(str, bundle);
                map.remove(str);
            }
        }
        if (r5 == C011405n.ON_DESTROY) {
            this.A02.A01(this);
            this.A00.A0X.remove(this.A03);
        }
    }
}
