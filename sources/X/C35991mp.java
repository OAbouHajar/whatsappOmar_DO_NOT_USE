package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mp  reason: invalid class name and case insensitive filesystem */
public class C35991mp {
    public final C15900s5 A00;
    public final C31691es A01;
    public final C16440t3 A02;
    public final JniBridge A03;

    public C35991mp(C15900s5 r1, C31691es r2, C16440t3 r3, JniBridge jniBridge) {
        this.A02 = r3;
        this.A03 = jniBridge;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JniBridge jniBridge = this.A03;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, jniBridge.wajContext.get(), ((C30351cD) it.next()).A01);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            arrayList.add(jvidispatchOOO);
        }
        return arrayList;
    }
}
