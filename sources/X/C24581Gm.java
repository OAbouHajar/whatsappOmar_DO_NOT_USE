package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Gm  reason: invalid class name and case insensitive filesystem */
public class C24581Gm extends C20380zx {
    public final C16040sK A00;
    public final AnonymousClass11R A01;
    public final C16440t3 A02;
    public final C14710pd A03;

    public C24581Gm(C16040sK r1, AnonymousClass11R r2, C16440t3 r3, C20360zv r4, C14710pd r5) {
        super(r4);
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A0A() {
        C14710pd r2 = this.A03;
        C16620tM r1 = C16620tM.A02;
        boolean A0E = r2.A0E(r1, 1312);
        boolean z2 = false;
        if (r2.A03(r1, 1829) >= 2) {
            z2 = true;
        }
        boolean A0E2 = r2.A0E(r1, 2775);
        boolean A0E3 = r2.A0E(r1, 1710);
        boolean A0E4 = r2.A0E(r1, 2156);
        boolean A0E5 = r2.A0E(r1, 1394);
        boolean A0E6 = r2.A0E(r1, 2194);
        boolean A0E7 = r2.A0E(r1, 2738);
        ArrayList arrayList = new ArrayList();
        if (A0E) {
            arrayList.add("ddm_settings");
        }
        if (z2) {
            arrayList.add("recent_sticker");
        }
        if (A0E3) {
            arrayList.add("vo_sp_receiver");
        }
        if (A0E2) {
            arrayList.add("favorite_sticker");
        }
        if (A0E4) {
            arrayList.add("link_preview");
        }
        if (A0E5) {
            arrayList.add("poll_creation_group");
        }
        if (A0E6) {
            arrayList.add("poll_creation_on_one_one");
        }
        if (A0E7) {
            arrayList.add("poll_creation_cag");
        }
        arrayList.add("reactions_send");
        arrayList.add("contact_except");
        return arrayList;
    }
}
