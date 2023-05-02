package X;

import android.content.Context;
import com.obwhatsapp.AlarmService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.2q3  reason: invalid class name and case insensitive filesystem */
public abstract class C57072q3 extends AnonymousClass03I implements AnonymousClass006 {
    public boolean A00 = false;
    public final Object A01 = C13690nt.A0Y();
    public volatile AnonymousClass54I A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            AlarmService alarmService = (AlarmService) this;
            C16150sX r7 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            alarmService.A00 = (WhatsAppLibLoader) r7.AR7.get();
            Context context = r7.AS2.A00;
            C16340ss.A01(context);
            AnonymousClass01J r56 = r7.AP2;
            C16440t3 r20 = (C16440t3) r56.get();
            AnonymousClass01J r55 = r7.A05;
            C14710pd r19 = (C14710pd) r55.get();
            AnonymousClass01J r54 = r7.A0V;
            C210712r r18 = (C210712r) r54.get();
            C16300so A002 = C16150sX.A00(r7);
            AnonymousClass01J r53 = r7.ADr;
            AnonymousClass01J r52 = r7.ARB;
            C16490t9 A0m = C16150sX.A0m(r7);
            AnonymousClass01J r51 = r7.AMY;
            AnonymousClass01J r50 = r7.AOi;
            Random random = new Random();
            AnonymousClass01J r49 = r7.ALm;
            C83484Gv r0 = new C83484Gv((C15900s5) r49.get(), random);
            AnonymousClass01J r48 = r7.AMX;
            AnonymousClass01J r47 = r7.ADW;
            AnonymousClass01J r46 = r7.AQh;
            AnonymousClass01J r45 = r7.A1h;
            C59302x1 r22 = new C59302x1(context, (C16570tH) r7.A0e.get(), A002, (C16180sb) r7.A8b.get(), (C16040sK) r53.get(), r0, (C210812s) r45.get(), r18, (AnonymousClass12W) r7.AEM.get(), (AnonymousClass01V) r50.get(), r20, (C15860rz) r46.get(), (C14730pf) r7.ANy.get(), (C208211s) r48.get(), (AnonymousClass16P) r51.get(), (C210912t) r47.get(), (C16900tq) r7.AFT.get(), (AnonymousClass11E) r7.A6H.get(), r19, A0m, (C16320sq) r52.get(), C17270uo.A00(r7.A6G));
            C16340ss.A01(context);
            C59312x2 r222 = new C59312x2(context, new C83484Gv((C15900s5) r49.get(), new Random()), (C19080xj) r7.A1f.get(), (C210712r) r54.get(), (AnonymousClass01V) r50.get(), (C15860rz) r46.get(), (C26531Od) r7.A6D.get(), (C20350zu) r7.AIX.get(), (AnonymousClass1SB) r7.AIh.get());
            C16340ss.A01(context);
            C18390wc builderWithExpectedSize = C17380uz.builderWithExpectedSize(3);
            Object obj = r7.APQ.get();
            Object obj2 = r7.AP3.get();
            Object obj3 = r7.AHo.get();
            Object obj4 = r47.get();
            Object obj5 = r7.A5A.get();
            Object obj6 = r7.A6e.get();
            HashSet A0o = C13680ns.A0o();
            C13700nu.A0Y(obj, obj2, obj3, A0o);
            C13700nu.A0Y(obj4, obj5, obj6, A0o);
            builderWithExpectedSize.addAll(A0o);
            Set emptySet = Collections.emptySet();
            C16340ss.A01(emptySet);
            builderWithExpectedSize.addAll(emptySet);
            builderWithExpectedSize.add((Object) new C101744xo((C210812s) r45.get(), (AnonymousClass1H9) r7.AOj.get()));
            Context context2 = context;
            AnonymousClass3hY r10 = new AnonymousClass3hY(context2, (AnonymousClass01V) r50.get(), new AnonymousClass4ED(builderWithExpectedSize.build()));
            C16340ss.A01(context);
            AnonymousClass2wy r223 = new AnonymousClass2wy(context, (AnonymousClass01V) r50.get(), (C16440t3) r56.get(), C16150sX.A0V(r7), (C24361Fp) r7.A7G.get(), (C14710pd) r55.get(), (C23051Ah) r7.AGW.get());
            C16340ss.A01(context);
            Random random2 = new Random();
            C16000sG A0M = C16150sX.A0M(r7);
            C59292x0 r224 = new C59292x0(context, (C16040sK) r53.get(), (C18020w1) r7.AF7.get(), (C19000xb) r7.AQX.get(), A0M, (C210712r) r54.get(), (AnonymousClass01V) r50.get(), (C16440t3) r56.get(), (C15860rz) r46.get(), (C208211s) r48.get(), (AnonymousClass16P) r51.get(), (C18920xT) r7.AMZ.get(), C16150sX.A0e(r7), (C16320sq) r52.get(), random2);
            C16340ss.A01(context);
            C59282wz r225 = new C59282wz(context, (C210712r) r54.get(), (C16440t3) r56.get(), (C15860rz) r46.get(), (C19090xk) r7.AF1.get(), new Random());
            C16340ss.A01(context);
            C70683hX r2 = new C70683hX(context, new AnonymousClass1TA());
            HashSet A0o2 = C13680ns.A0o();
            C13700nu.A0Y(r22, r222, r10, A0o2);
            C13700nu.A0Y(r223, r224, r225, A0o2);
            A0o2.add(r2);
            alarmService.A01 = C17380uz.copyOf((Collection) A0o2);
        }
        super.onCreate();
    }
}
