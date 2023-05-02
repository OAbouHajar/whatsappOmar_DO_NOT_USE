package com.whatsapp.stickers;

import X.AnonymousClass000;
import X.AnonymousClass2Ur;
import X.AnonymousClass2V1;
import X.AnonymousClass2VF;
import X.AnonymousClass3H5;
import X.C102814zZ;
import X.C13680ns;
import X.C26161Mo;
import X.C26221Mu;
import X.C34151jm;
import X.C37771pi;
import X.C37781pj;
import X.C38371qg;
import X.C41781we;
import X.C41791wf;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IDxSObserverShape99S0100000_1_I0 extends C41781we {
    public Object A00;
    public final int A01;

    public IDxSObserverShape99S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        if (1 - this.A01 == 0) {
            ((C41791wf) this.A00).A02();
        }
    }

    public void A02(C37771pi r8) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                AnonymousClass2Ur r4 = (AnonymousClass2Ur) obj;
                ArrayList A0u = AnonymousClass000.A0u();
                for (C34151jm r2 : r8.A04) {
                    A0u.add(new C102814zZ(r2, r4.A0V));
                }
                Map map = r4.A0b;
                String str = r8.A0F;
                map.put(str, r8);
                r4.A0G.A01(A0u);
                r4.A0c.put(str, A0u);
                Iterator it = A0u.iterator();
                while (it.hasNext()) {
                    C102814zZ r22 = (C102814zZ) it.next();
                    r4.A0g.put(r22.AGT(), r22);
                }
                AnonymousClass2VF r42 = r4.A0J;
                LinkedHashMap linkedHashMap = r42.A03;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                r42.A03 = linkedHashMap2;
                linkedHashMap2.put(str, r42.A0F(r8));
                r42.A03.putAll(linkedHashMap);
                r42.A0H();
                r42.A01.A04((Object) null, r42.A04.size(), r42.A0C() - r42.A04.size());
                r42.A0I();
                return;
            case 1:
                C41791wf r43 = (C41791wf) obj;
                HashMap hashMap = r43.A0D;
                String str2 = r8.A0F;
                hashMap.remove(str2);
                r43.A0E.remove(str2);
                if (r43.A04 != null) {
                    int i3 = 0;
                    while (true) {
                        int size = r43.A04.size();
                        List list = r43.A04;
                        if (i3 >= size) {
                            list.add(r8);
                            Collections.sort(r43.A04, new C38371qg());
                        } else if (C37771pi.A00(str2, list, i3)) {
                            r43.A04.set(i3, r8);
                        } else {
                            i3++;
                        }
                    }
                    r43.A04(r43.A04);
                } else {
                    r43.A02();
                }
                if (r43.A01 != null) {
                    r43.A01();
                    return;
                }
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) obj;
                C37771pi r0 = stickerStorePackPreviewActivity.A0N;
                if (r0 == null) {
                    if (r8.A0Q) {
                        stickerStorePackPreviewActivity.A0O.A0E(new AnonymousClass3H5(stickerStorePackPreviewActivity), stickerStorePackPreviewActivity.A0U, true);
                        return;
                    }
                    return;
                } else if (r0.A0F.equals(r8.A0F)) {
                    StickerStorePackPreviewActivity.A02(r8, stickerStorePackPreviewActivity);
                    stickerStorePackPreviewActivity.setResult(1);
                    if (!stickerStorePackPreviewActivity.A0Z && !r8.A0Q) {
                        stickerStorePackPreviewActivity.A05.A09(R.string.str16a3, 1);
                        stickerStorePackPreviewActivity.finish();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public void A03(C37771pi r4) {
        switch (this.A01) {
            case 1:
                C41791wf r2 = (C41791wf) this.A00;
                r2.A0E.put(r4.A0F, r4);
                List list = r2.A04;
                if (list != null) {
                    r2.A04(list);
                    return;
                }
                return;
            case 2:
                if (r4.A0Q) {
                    ((StickerStorePackPreviewActivity) this.A00).A37(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A04(String str) {
        switch (this.A01) {
            case 1:
                C41791wf r1 = (C41791wf) this.A00;
                r1.A0D.remove(str);
                r1.A0E.remove(str);
                List list = r1.A04;
                if (list != null) {
                    r1.A04(list);
                    return;
                }
                return;
            case 2:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
                C37771pi r6 = stickerStorePackPreviewActivity.A0N;
                if (r6 != null && str.equals(r6.A0F)) {
                    r6.A05 = false;
                    stickerStorePackPreviewActivity.A35();
                    stickerStorePackPreviewActivity.A05.A0H(C13680ns.A0d(stickerStorePackPreviewActivity, r6.A0H, new Object[1], 0, R.string.str16d4), 1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A05(String str) {
        switch (this.A01) {
            case 0:
                AnonymousClass2Ur r9 = (AnonymousClass2Ur) this.A00;
                r9.A0b.remove(str);
                Map map = r9.A0c;
                Collection<AnonymousClass2V1> collection = (Collection) map.get(str);
                if (collection != null) {
                    C26221Mu r7 = r9.A0G;
                    synchronized (r7) {
                        for (AnonymousClass2V1 r5 : collection) {
                            for (C37781pj r1 : r5.ABx()) {
                                Collection collection2 = (Collection) r7.A04.get(r1);
                                if (collection2 != null) {
                                    collection2.remove(r5);
                                }
                            }
                        }
                    }
                }
                map.remove(str);
                r9.A0J.A0K(str);
                return;
            case 1:
                C41791wf r3 = (C41791wf) this.A00;
                if (r3.A04 != null) {
                    boolean z2 = false;
                    for (int i2 = 0; i2 < r3.A04.size(); i2++) {
                        if (C37771pi.A00(str, r3.A04, i2)) {
                            r3.A04.remove(i2);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        r3.A04(r3.A04);
                    }
                }
                if (r3.A01 != null) {
                    r3.A01();
                }
                C26161Mo r0 = r3.A01;
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
                C37771pi r02 = stickerStorePackPreviewActivity.A0N;
                if (r02 != null && r02.A0F.equals(str)) {
                    stickerStorePackPreviewActivity.A0O.A0E(new AnonymousClass3H5(stickerStorePackPreviewActivity), stickerStorePackPreviewActivity.A0U, true);
                    return;
                }
                return;
        }
    }

    public void A07(String str, String str2) {
        if (1 - this.A01 == 0) {
            ((C41791wf) this.A00).A02();
        }
    }
}
