package androidx.activity.result;

import X.AnonymousClass05R;
import X.AnonymousClass05T;
import X.AnonymousClass05g;
import X.AnonymousClass05h;
import X.AnonymousClass07N;
import X.AnonymousClass0YD;
import X.C001300o;
import X.C011405n;
import android.os.Bundle;
import java.util.Map;

public class ActivityResultRegistry$1 implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass05R A00;
    public final /* synthetic */ AnonymousClass05g A01;
    public final /* synthetic */ AnonymousClass05h A02;
    public final /* synthetic */ String A03;

    public ActivityResultRegistry$1(AnonymousClass05R r1, AnonymousClass05g r2, AnonymousClass05h r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AXa(C011405n r7, C001300o r8) {
        if (C011405n.ON_START.equals(r7)) {
            AnonymousClass05R r5 = this.A00;
            Map map = r5.A07;
            String str = this.A03;
            AnonymousClass05g r3 = this.A01;
            AnonymousClass05h r2 = this.A02;
            map.put(str, new AnonymousClass07N(r3, r2));
            Map map2 = r5.A05;
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                r3.AM3(obj);
            }
            Bundle bundle = r5.A02;
            AnonymousClass0YD r0 = (AnonymousClass0YD) bundle.getParcelable(str);
            if (r0 != null) {
                bundle.remove(str);
                r3.AM3(r2.A02(r0.A01, r0.A00));
            }
        } else if (C011405n.ON_STOP.equals(r7)) {
            this.A00.A07.remove(this.A03);
        } else if (C011405n.ON_DESTROY.equals(r7)) {
            this.A00.A04(this.A03);
        }
    }
}
