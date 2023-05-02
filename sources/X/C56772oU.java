package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.obwhatsapp.group.GroupChatInfoActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2oU  reason: invalid class name and case insensitive filesystem */
public class C56772oU extends BaseAdapter implements Filterable {
    public String A00;
    public ArrayList A01;
    public List A02 = AnonymousClass000.A0u();
    public List A03 = AnonymousClass000.A0u();
    public final Filter A04 = new C56782oV(this);
    public final AnonymousClass4EJ A05;
    public final Map A06 = AnonymousClass000.A0x();
    public final /* synthetic */ GroupChatInfoActivity A07;

    public C56772oU(AnonymousClass4EJ r2, GroupChatInfoActivity groupChatInfoActivity) {
        this.A07 = groupChatInfoActivity;
        this.A05 = r2;
    }

    public void A00(List list) {
        GroupChatInfoActivity groupChatInfoActivity = this.A07;
        if (groupChatInfoActivity.A0H.A0f(groupChatInfoActivity.A0w) || groupChatInfoActivity.A1J.A00(groupChatInfoActivity.A0w)) {
            list = Collections.emptyList();
        }
        this.A02 = list;
        String str = this.A00;
        this.A00 = str;
        if (TextUtils.isEmpty(str)) {
            A01(this.A02);
        } else {
            getFilter().filter(str);
        }
    }

    public final void A01(List list) {
        GroupChatInfoActivity groupChatInfoActivity = this.A07;
        if (groupChatInfoActivity.A0H.A03(groupChatInfoActivity.A0w) == 1) {
            this.A03 = Collections.emptyList();
        } else {
            this.A03 = list;
            this.A01 = C40661uU.A02(groupChatInfoActivity.A08, this.A00);
        }
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        return this.A03.size();
    }

    public Filter getFilter() {
        return this.A04;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A03.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemViewType(int i2) {
        Object obj = this.A03.get(i2);
        if (obj instanceof AnonymousClass2OE) {
            return 0;
        }
        if ((obj instanceof AnonymousClass2OI) || (obj instanceof AnonymousClass2OH)) {
            return 1;
        }
        return obj instanceof AnonymousClass2OG ? 2 : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r1 = com.whatsapp.jid.UserJid.of(((X.AnonymousClass2OE) r3).A00.A0E);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            java.util.List r0 = r5.A03
            java.lang.Object r3 = r0.get(r6)
            X.2OF r3 = (X.AnonymousClass2OF) r3
            if (r7 != 0) goto L_0x002c
            int r1 = r5.getItemViewType(r6)
            r4 = 0
            if (r1 == 0) goto L_0x0066
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 != r0) goto L_0x007b
            com.obwhatsapp.group.GroupChatInfoActivity r2 = r5.A07
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131559120(0x7f0d02d0, float:1.8743575E38)
            android.view.View r7 = r1.inflate(r0, r8, r4)
            X.3tu r1 = new X.3tu
            r1.<init>(r7, r2)
        L_0x0029:
            r7.setTag(r1)
        L_0x002c:
            boolean r0 = r3 instanceof X.AnonymousClass2OE
            if (r0 == 0) goto L_0x0051
            r0 = r3
            X.2OE r0 = (X.AnonymousClass2OE) r0
            X.0sH r0 = r0.A00
            X.0rv r0 = r0.A0E
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)
            if (r1 == 0) goto L_0x0051
            java.util.Map r0 = r5.A06
            java.lang.Object r2 = r0.get(r1)
            X.2XQ r2 = (X.AnonymousClass2XQ) r2
        L_0x0045:
            java.lang.Object r1 = r7.getTag()
            X.4QH r1 = (X.AnonymousClass4QH) r1
            java.util.ArrayList r0 = r5.A01
            r1.A00(r3, r2, r0)
            return r7
        L_0x0051:
            r2 = 0
            goto L_0x0045
        L_0x0053:
            com.obwhatsapp.group.GroupChatInfoActivity r2 = r5.A07
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131559119(0x7f0d02cf, float:1.8743573E38)
            android.view.View r7 = r1.inflate(r0, r8, r4)
            X.3tt r1 = new X.3tt
            r1.<init>(r7, r2)
            goto L_0x0029
        L_0x0066:
            com.obwhatsapp.group.GroupChatInfoActivity r2 = r5.A07
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131559121(0x7f0d02d1, float:1.8743577E38)
            android.view.View r7 = r1.inflate(r0, r8, r4)
            X.4EJ r0 = r5.A05
            X.32R r1 = new X.32R
            r1.<init>(r7, r0, r2)
            goto L_0x0029
        L_0x007b:
            java.lang.String r0 = "Unknown type: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56772oU.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEnabled(int i2) {
        return ((AnonymousClass2OF) this.A03.get(i2)).isEnabled();
    }
}
