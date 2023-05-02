package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass03H;
import X.AnonymousClass1W9;
import X.C16300so;
import X.C28371Vv;
import X.C39631sn;
import X.C439922i;
import android.text.Spannable;
import com.whatsapp.jid.DeviceJid;
import java.io.File;
import java.util.AbstractMap;
import java.util.Comparator;

public class IDxComparatorShape183S0100000_2_I0 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape183S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            case 1:
                return C439922i.A01(((C439922i) obj2).A07).A01(C439922i.A01(((C439922i) obj).A07));
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.A00;
                Object obj3 = abstractMap.get(obj);
                AnonymousClass00B.A06(obj3);
                int A0D = AnonymousClass000.A0D(obj3);
                Object obj4 = abstractMap.get(obj2);
                AnonymousClass00B.A06(obj4);
                return A0D - AnonymousClass000.A0D(obj4);
            case 3:
                return AnonymousClass03H.A00(((C39631sn) obj2).A00, ((C39631sn) obj).A00);
            case 4:
                C16300so r5 = (C16300so) this.A00;
                C28371Vv r8 = (C28371Vv) obj2;
                Class<DeviceJid> cls = DeviceJid.class;
                try {
                    boolean isPrimary = ((DeviceJid) ((C28371Vv) obj).A0G(r5, cls, "jid")).isPrimary();
                    if (isPrimary != ((DeviceJid) r8.A0G(r5, cls, "jid")).isPrimary()) {
                        return isPrimary ? -1 : 1;
                    }
                    return 0;
                } catch (AnonymousClass1W9 unused) {
                    return 0;
                }
            default:
                Spannable spannable = (Spannable) this.A00;
                if (spannable.getSpanStart(obj) < spannable.getSpanStart(obj2)) {
                    return -1;
                }
                if (spannable.getSpanStart(obj) <= spannable.getSpanStart(obj2)) {
                    return AnonymousClass03H.A00(spannable.getSpanEnd(obj2), spannable.getSpanEnd(obj));
                }
                return 1;
        }
    }
}
