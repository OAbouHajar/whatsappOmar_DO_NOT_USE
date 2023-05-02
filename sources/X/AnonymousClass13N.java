package X;

import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.13N  reason: invalid class name */
public class AnonymousClass13N implements C19420yP {
    public final AnonymousClass135 A00;

    public AnonymousClass13N(AnonymousClass135 r1) {
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{249};
    }

    public boolean AHS(Message message, int i2) {
        if (i2 != 249) {
            return false;
        }
        Object obj = message.obj;
        AnonymousClass00B.A06(obj);
        ArrayList arrayList = new ArrayList();
        for (C28371Vv A0N : ((C28371Vv) obj).A0O("notice")) {
            String A0N2 = A0N.A0N("id", (String) null);
            if (!TextUtils.isEmpty(A0N2)) {
                arrayList.add(A0N2);
            }
        }
        this.A00.A03(arrayList, 0);
        return true;
    }
}
