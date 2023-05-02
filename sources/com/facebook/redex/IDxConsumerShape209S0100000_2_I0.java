package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass04N;
import X.AnonymousClass0RD;
import X.AnonymousClass1GX;
import X.AnonymousClass2AS;
import X.AnonymousClass2JD;
import X.AnonymousClass4HX;
import X.AnonymousClass4HY;
import X.AnonymousClass4VP;
import X.C13690nt;
import X.C15830rv;
import X.C16010sH;
import X.C16590tJ;
import X.C19240y6;
import X.C30511cT;
import X.C42821yj;
import X.C49642Uo;
import X.C85534Ov;
import android.os.Handler;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.home.splitwindow.IDxWObserverShape84S0100000_2_I0;
import java.util.Iterator;
import java.util.List;

public class IDxConsumerShape209S0100000_2_I0 implements AnonymousClass04N {
    public Object A00;
    public final int A01;

    public IDxConsumerShape209S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass2AS r2 = (AnonymousClass2AS) this.A00;
                List list = ((AnonymousClass4HY) obj).A00;
                if (list.size() > 0) {
                    r2.A08(((AnonymousClass4HX) C13690nt.A0Z(list)).A00);
                    return;
                }
                r2.A0w.A09(Boolean.FALSE);
                r2.A0u.A09(Boolean.TRUE);
                return;
            case 1:
                ((AnonymousClass2AS) this.A00).A08(AnonymousClass000.A0D(obj));
                return;
            case 2:
                ((AnonymousClass2AS) this.A00).A00 = AnonymousClass000.A0D(obj);
                return;
            case 3:
                ((C49642Uo) this.A00).A08((C85534Ov) obj);
                return;
            case 4:
                C30511cT r0 = (C30511cT) this.A00;
                C16010sH r6 = (C16010sH) obj;
                if (r6 != null) {
                    r0.A09.setText(r0.A0W.A08(r6));
                    return;
                }
                return;
            case 5:
                C42821yj r3 = (C42821yj) this.A00;
                for (AnonymousClass0RD r22 : (List) obj) {
                    if (r22.A02.A00.contains(r3.A22)) {
                        boolean A1Q = AnonymousClass000.A1Q((r22.A00 > 0.0f ? 1 : (r22.A00 == 0.0f ? 0 : -1)));
                        C30511cT r1 = r3.A1s;
                        if (r1 != null) {
                            r1.A08(!A1Q);
                        }
                        C15830rv r23 = A1Q ? r3.A33 : null;
                        C19240y6 r12 = r3.A32;
                        if (r12.A07()) {
                            String rawString = r23 != null ? r23.getRawString() : null;
                            Iterator A002 = C16590tJ.A00(r12);
                            while (A002.hasNext()) {
                                AnonymousClass4VP r13 = (AnonymousClass4VP) A002.next();
                                if (r13 instanceof IDxWObserverShape84S0100000_2_I0) {
                                    IDxWObserverShape84S0100000_2_I0 iDxWObserverShape84S0100000_2_I0 = (IDxWObserverShape84S0100000_2_I0) r13;
                                    if (iDxWObserverShape84S0100000_2_I0.A01 == 0) {
                                        AnonymousClass2JD r02 = ((ConversationsFragment) iDxWObserverShape84S0100000_2_I0.A00).A15;
                                        r02.A01 = rawString;
                                        r02.notifyDataSetChanged();
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                ((AnonymousClass1GX) this.A00).A01((Handler) obj);
                return;
        }
    }
}
