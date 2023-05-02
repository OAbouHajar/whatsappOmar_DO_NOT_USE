package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape0S1410000_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Jl  reason: invalid class name and case insensitive filesystem */
public final class C25351Jl implements C25301Jg {
    public final C25341Jk A00;
    public final C14870pt A01;
    public final C17130ua A02;
    public final C25271Jd A03;
    public final C18260wP A04;
    public final C15860rz A05;
    public final C16460t6 A06;
    public final C14710pd A07;
    public final C18720x9 A08;
    public final C17190ug A09;
    public final C16320sq A0A;

    public C25351Jl(C25341Jk r2, C14870pt r3, C17130ua r4, C25271Jd r5, C18260wP r6, C15860rz r7, C16460t6 r8, C14710pd r9, C18720x9 r10, C17190ug r11, C16320sq r12) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r12, 2);
        C18450wi.A0H(r8, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r11, 5);
        C18450wi.A0H(r6, 6);
        C18450wi.A0H(r9, 7);
        C18450wi.A0H(r4, 8);
        C18450wi.A0H(r2, 9);
        C18450wi.A0H(r10, 10);
        C18450wi.A0H(r7, 11);
        this.A03 = r5;
        this.A0A = r12;
        this.A06 = r8;
        this.A01 = r3;
        this.A09 = r11;
        this.A04 = r6;
        this.A07 = r9;
        this.A02 = r4;
        this.A00 = r2;
        this.A08 = r10;
        this.A05 = r7;
    }

    public final void A00(Activity activity, AnonymousClass1Z6 r11, String str, Map map, boolean z2) {
        Map map2 = map;
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    AnonymousClass1JB.A0V(new C25401Jq(entry.getKey(), entry.getValue()));
                } else {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new C25401Jq(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new C25401Jq(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                }
            }
        }
        this.A01.A0K(new RunnableRunnableShape0S1410000_I0(activity, this, r11, map2, str, 1, z2));
    }

    public void AaS(Activity activity, AnonymousClass1Z6 r23, Map map) {
        Intent intent;
        Bundle extras;
        boolean z2;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            UserJid nullable = UserJid.getNullable(extras.getString("chat_id"));
            AnonymousClass1Z6 r13 = r23;
            if (nullable != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("catalog_id") && map2.containsKey("retailer_ids")) {
                    Object obj = map2.get("retailer_ids");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    } else if (!(obj instanceof C23861Dq) || (obj instanceof C52192dI)) {
                        try {
                            List list = (List) obj;
                            Object obj2 = map2.get("catalog_id");
                            if (obj2 != null) {
                                String str = (String) obj2;
                                Object obj3 = "360";
                                Object obj4 = map2.containsKey("height") ? map2.get("height") : obj3;
                                if (map2.containsKey("width")) {
                                    obj3 = map2.get("width");
                                }
                                if (map2.containsKey("show_full_screen_error")) {
                                    Object obj5 = map2.get("show_full_screen_error");
                                    if (obj5 != null) {
                                        z2 = ((Boolean) obj5).booleanValue();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                    }
                                } else {
                                    z2 = false;
                                }
                                C55222j6 r11 = new C55222j6(nullable, String.valueOf(obj3), String.valueOf(obj4), list);
                                if (this.A07.A0E(C16620tM.A02, 2411)) {
                                    this.A0A.Acl(new RunnableRunnableShape0S1410000_I0(this, r11, activity2, r13, str, 0, z2));
                                    return;
                                }
                                C86104Rf r5 = new C86104Rf(activity2, r13, this, z2);
                                C63133Gg r15 = new C63133Gg(r11, this.A04, this.A08, this.A09, r5);
                                C18450wi.A0H(str, 0);
                                if (!r15.A01.A0A()) {
                                    r15.A04.A00();
                                    return;
                                }
                                String A022 = r15.A03.A02();
                                C18450wi.A0B(A022);
                                C18720x9 r4 = r15.A02;
                                C55222j6 r112 = r15.A00;
                                ArrayList arrayList = new ArrayList();
                                for (String r6 : r112.A03) {
                                    arrayList.add(new C28371Vv(new C28371Vv("retailer_id", r6, (C35081lL[]) null), "product", (C35081lL[]) null));
                                }
                                arrayList.add(new C28371Vv("width", r112.A02, (C35081lL[]) null));
                                arrayList.add(new C28371Vv("height", r112.A01, (C35081lL[]) null));
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new C28371Vv("id", str, (C35081lL[]) null));
                                Object[] array = arrayList2.toArray(new C28371Vv[0]);
                                if (array != null) {
                                    arrayList.add(new C28371Vv("catalog", (C35081lL[]) null, (C28371Vv[]) array));
                                    C35081lL[] r9 = {new C35081lL((Jid) r112.A00, "jid")};
                                    Object[] array2 = arrayList.toArray(new C28371Vv[0]);
                                    if (array2 != null) {
                                        r4.A02(r15, new C28371Vv(new C28371Vv("product_list", r9, (C28371Vv[]) array2), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:biz:catalog"), new C35081lL("type", "get"), new C35081lL("smax_id", 24), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 196);
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        } catch (ClassCastException e2) {
                            C18450wi.A0P(C90284dt.class.getName(), e2);
                            throw e2;
                        }
                    } else {
                        C90284dt.A02(obj, "kotlin.collections.MutableList");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                }
            }
            A00(activity2, r13, "error", AnonymousClass1Z8.A00, true);
        }
    }
}
