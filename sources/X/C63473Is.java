package X;

import android.content.SharedPreferences;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Is  reason: invalid class name and case insensitive filesystem */
public final class C63473Is extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ boolean $invalidateFileCache = true;
    public final /* synthetic */ AnonymousClass22J $onError;
    public final /* synthetic */ AnonymousClass22J $onSuccess;
    public final /* synthetic */ AnonymousClass4NS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63473Is(AnonymousClass4NS r2, AnonymousClass22J r3, AnonymousClass22J r4) {
        super(1);
        this.this$0 = r2;
        this.$onSuccess = r3;
        this.$onError = r4;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C14870pt r2;
        int i2;
        C93384j6 r13 = (C93384j6) obj;
        C18450wi.A0H(r13, 0);
        AnonymousClass4NS r5 = this.this$0;
        boolean z2 = this.$invalidateFileCache;
        AnonymousClass22J r4 = this.$onSuccess;
        AnonymousClass22J r3 = this.$onError;
        List<C93394j7> list = r13.A00;
        if (list == null) {
            r2 = r5.A00;
            i2 = 13;
        } else {
            C212013e r11 = r5.A01;
            JSONArray jSONArray = new JSONArray();
            for (C93394j7 r8 : list) {
                JSONObject A0J = C13700nu.A0J();
                A0J.put("url", r8.A01);
                String str = r8.A00;
                if (str != null) {
                    A0J.put("emojis", str);
                }
                jSONArray.put(A0J);
            }
            C13680ns.A0y(((SharedPreferences) r11.A01.getValue()).edit(), "pref_avatar_profile_photo_poses", jSONArray.toString());
            List A01 = ((C212213g) r5.A03.get()).A01(list, z2);
            boolean isEmpty = A01.isEmpty();
            r2 = r5.A00;
            if (isEmpty) {
                i2 = 12;
            } else {
                C14870pt.A03(r2, r4, A01, 45);
                return AnonymousClass22M.A00;
            }
        }
        C14870pt.A01(r2, r3, i2);
        return AnonymousClass22M.A00;
    }
}
