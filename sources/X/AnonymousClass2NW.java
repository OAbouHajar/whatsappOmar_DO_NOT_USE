package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2NW  reason: invalid class name */
public class AnonymousClass2NW extends AnonymousClass2NX {
    public final /* synthetic */ NewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2NW(C16440t3 r8, AnonymousClass11A r9, C16460t6 r10, C17240ul r11, NewGroup newGroup, AnonymousClass4OC r13, AnonymousClass122 r14) {
        super(r8, r9, r10, r11, r13, r14);
        this.A00 = newGroup;
    }

    public void AYI(AnonymousClass4MJ r11, C16050sL r12) {
        NewGroup newGroup = this.A00;
        newGroup.A0c.set(r12);
        File A002 = newGroup.A0A.A00(newGroup.A0b);
        if (A002 != null && A002.exists()) {
            newGroup.A05.A0K(new RunnableRunnableShape7S0200000_I0_5(this, 49, r12));
        }
        super.AYI(r11, r12);
        Map map = r11.A02;
        if (map.size() > 0) {
            Long l2 = null;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Jid jid : map.keySet()) {
                AnonymousClass4I1 r2 = (AnonymousClass4I1) map.get(jid);
                if (r2 != null) {
                    if (l2 == null) {
                        l2 = Long.valueOf(r2.A00);
                    }
                    arrayList.add(jid.getRawString());
                    arrayList2.add(r2.A01);
                }
            }
            Set keySet = map.keySet();
            Intent A0P = C14750ph.A0P(newGroup, r11.A00, l2, arrayList, arrayList2);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("jids", C16030sJ.A06(keySet));
            bundle.putParcelable("invite_intent", A0P);
            newGroup.A02 = bundle;
        }
        String A003 = AnonymousClass46M.A00(newGroup, r11);
        if (!TextUtils.isEmpty(A003)) {
            Bundle bundle2 = newGroup.A02;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                newGroup.A02 = bundle2;
            }
            bundle2.putString("error_message", A003);
        }
        newGroup.A05.A0K(new AnonymousClass55V(newGroup, r12));
    }

    public void AYu() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.AYu();
        this.A00.A05.A0K(new RunnableRunnableShape9S0100000_I0_8(this, 34));
    }
}
