package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3It  reason: invalid class name and case insensitive filesystem */
public final class C63483It extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ boolean $metadataOnlyStickerPack = false;
    public final /* synthetic */ AnonymousClass22J $onError;
    public final /* synthetic */ AnonymousClass22J $onSuccess;
    public final /* synthetic */ C214214a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63483It(C214214a r2, AnonymousClass22J r3, AnonymousClass22J r4) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
        this.$onSuccess = r4;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C37781pj[] r2;
        C93444jC r3 = (C93444jC) obj;
        C18450wi.A0H(r3, 0);
        List<C93434jB> list = r3.A08;
        if (!list.isEmpty() || this.$metadataOnlyStickerPack) {
            ((C214013y) this.this$0.A02.get()).A01(this.$metadataOnlyStickerPack ? "avatar_stickerpack_metadata_generated" : "avatar_stickerpack_generated");
            this.this$0.A04.get();
            String str = r3.A03;
            String str2 = r3.A04;
            String str3 = r3.A01;
            String str4 = r3.A05;
            String str5 = r3.A07;
            String str6 = r3.A06;
            String str7 = r3.A02;
            ArrayList A0N = AnonymousClass1J9.A0N(list);
            for (C93434jB r22 : list) {
                C18450wi.A0H(r22, 0);
                C34151jm r1 = new C34151jm();
                r1.A03 = r22.A02;
                r1.A02 = r22.A01;
                r1.A0G = r22.A07;
                r1.A00 = r22.A00;
                r1.A0C = r22.A05;
                r1.A07 = r22.A03;
                r1.A0D = r22.A04;
                r1.A05 = r22.A06;
                A0N.add(r1);
            }
            Iterator it = A0N.iterator();
            while (it.hasNext()) {
                C34151jm r32 = (C34151jm) it.next();
                r32.A0F = str;
                r32.A0H = true;
                String str8 = r32.A07;
                if (str8 == null) {
                    r2 = null;
                } else {
                    if (!str8.contains(" ")) {
                        r2 = new C37781pj[]{new C37781pj(str8)};
                    } else {
                        String[] split = TextUtils.split(str8, " ");
                        int length = split.length;
                        r2 = new C37781pj[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            r2[i2] = new C37781pj(split[i2]);
                        }
                    }
                }
                r32.A04 = new AnonymousClass1XO(str, str2, str4, (String) null, (String) null, r32.A05, r2, true, false, true);
            }
            C37771pi A00 = C214814g.A00(str, str2, str4, str3, str5, str6, str7, A0N);
            ((C214013y) this.this$0.A02.get()).A01(this.$metadataOnlyStickerPack ? "avatar_stickerpack_metadata_mapped" : "avatar_stickerpack_mapped");
            C14870pt.A03(this.this$0.A00, this.$onSuccess, A00, 48);
        } else {
            C14870pt.A01(this.this$0.A00, this.$onError, 14);
        }
        return AnonymousClass22M.A00;
    }
}
