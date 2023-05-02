package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.1un  reason: invalid class name and case insensitive filesystem */
public class C40851un implements C19550yc {
    public final /* synthetic */ C40811uj A00;
    public final /* synthetic */ C40811uj A01;
    public final /* synthetic */ C17780vd A02;
    public final /* synthetic */ C40841um A03;
    public final /* synthetic */ Runnable A04;

    public C40851un(C40811uj r1, C40811uj r2, C17780vd r3, C40841um r4, Runnable runnable) {
        this.A02 = r3;
        this.A01 = r1;
        this.A03 = r4;
        this.A04 = runnable;
        this.A00 = r2;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("GroupIqResponseUtil/add-participants/delivery fail; groupId=");
        sb.append(this.A01.A01);
        Log.i(sb.toString());
    }

    public void AQe(C28371Vv r3, String str) {
        this.A03.Ach(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r6, String str) {
        Object obj;
        C30801cy r0;
        AnonymousClass4MJ r3 = new AnonymousClass4MJ(this.A01.A01);
        C17780vd r4 = this.A02;
        C16300so r2 = r4.A00;
        Jid A0F = r6.A0F(r2, C16050sL.class, "from");
        if (A0F == null) {
            this.A03.Ach(800);
            return;
        }
        AnonymousClass3BT.A00(r2, r3, r6, "add");
        r4.A04.get();
        StringBuilder sb = new StringBuilder("groupmgr/onAddGroupParticipants/");
        sb.append(A0F);
        sb.append("/");
        Map map = r3.A03;
        sb.append(Arrays.deepToString(map.keySet().toArray()));
        sb.append("/");
        Map map2 = r3.A01;
        sb.append(Arrays.deepToString(map2.keySet().toArray()));
        Log.i(sb.toString());
        if (map2.size() > 0) {
            C17240ul.A01(3001, map2);
        }
        this.A04.run();
        C40811uj r42 = this.A00;
        if (r42 instanceof AnonymousClass32P) {
            AnonymousClass32P r43 = (AnonymousClass32P) r42;
            if (r3.A02.size() > 0) {
                r43.A00.A05.A0K(new RunnableRunnableShape14S0200000_I1_2(r43, 22, r3));
            }
            GroupChatInfoActivity groupChatInfoActivity = r43.A00;
            String A002 = AnonymousClass46M.A00(groupChatInfoActivity, r3);
            if (!TextUtils.isEmpty(A002)) {
                groupChatInfoActivity.A05.A0K(new RunnableRunnableShape1S1100000_I1(6, A002, r43));
                return;
            }
            return;
        }
        AnonymousClass32Q r44 = (AnonymousClass32Q) r42;
        if (map.size() > 0) {
            Object next = map.keySet().iterator().next();
            r0 = r44.A03;
            obj = next;
        } else {
            Map map3 = r3.A02;
            if (map3.size() > 0) {
                r0 = r44.A02;
                obj = map3;
            } else {
                obj = map2;
                if (map2.size() > 0) {
                    r0 = r44.A01;
                } else {
                    return;
                }
            }
        }
        r0.A09(obj);
    }
}
