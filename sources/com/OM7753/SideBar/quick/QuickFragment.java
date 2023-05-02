package com.OM7753.SideBar.quick;

import X.AnonymousClass01A;
import X.AnonymousClass050;
import X.C13680ns;
import X.C14530pL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.OM7753.SideBar.database.DB;
import com.OM7753.SideBar.model.Chat;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;
import java.util.List;

public class QuickFragment extends AnonymousClass01A {
    QuickAdapter mAdapter;
    public List<Chat> mChatRowsList;
    public DB mDB;
    C14530pL mHomeActivity;
    View mRootView;
    ConversationsFragment mStockConversationsFragment;
    ArrayList<Integer> numbers;

    /* JADX WARNING: type inference failed for: r3v1, types: [com.OM7753.SideBar.quick.QuickAdapter, X.01X] */
    private void initStatus() {
        String str = "";
        C14530pL r1 = this.mHomeActivity;
        if (r1 instanceof Conversation) {
            str = dep.A0X(((Conversation) r1).A00.A33);
        }
        this.numbers = new ArrayList<>();
        final RecyclerView recyclerView = (RecyclerView) this.mRootView.findViewById(yo.getID("statuses_recyclerview", "id"));
        recyclerView.setLayoutManager(new LinearLayoutManager(Edge.quickPosition()));
        ? quickAdapter = new QuickAdapter(this, str, new QuickPresenter() {
            public void getBadgeCounter(int i2, int i3) {
                QuickFragment.this.numbers.add(Integer.valueOf(i3));
                if (i3 > 0) {
                    Edge.f5mConuter.setText(String.valueOf(Edge.sumNumbers(QuickFragment.this.numbers)));
                    Edge.f5mConuter.setVisibility(0);
                } else {
                    Edge.f5mConuter.setVisibility(8);
                }
                recyclerView.setItemViewCacheSize(i2);
            }
        });
        this.mAdapter = quickAdapter;
        recyclerView.setAdapter(quickAdapter);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.mHomeActivity = (C14530pL) layoutInflater.getContext();
        this.mRootView = layoutInflater.inflate(yo.getID("IG_fragment_status", "layout"), (ViewGroup) null);
        this.mStockConversationsFragment = new ConversationsFragment();
        AnonymousClass050 A0O = C13680ns.A0O(this.mHomeActivity);
        A0O.A0F(this.mStockConversationsFragment, (String) null, yo.getID("stock_statuses_fragment", "id"), 1);
        A0O.A00(false);
        initStatus();
        return this.mRootView;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:10:0x0047
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    public java.util.ArrayList A1D() {
        /*
            r4 = this;
            com.obwhatsapp.conversationslist.ConversationsFragment r4 = r4.mStockConversationsFragment     // Catch:{ all -> 0x0032 }
            X.0rs r1 = r4.A0z     // Catch:{ all -> 0x0032 }
            X.0sf r0 = r4.A27     // Catch:{ all -> 0x0032 }
            java.util.List r1 = r1.A09(r0)     // Catch:{ all -> 0x0032 }
            int r0 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0017:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            boolean r0 = com.obwhatsapp.yo.yo.H3T((X.C15830rv) r1)
            if (r0 != 0) goto L_0x0017
            X.2Wo r0 = new X.2Wo
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0017
        L_0x0032:
            r0 = move-exception
            throw r0
            X.0rs r0 = r4.A0z
            java.util.List r1 = r0.A06()
            int r0 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0047:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.2Wo r0 = new X.2Wo
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0047
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.OM7753.SideBar.quick.QuickFragment.A1D():java.util.ArrayList");
    }

    public void chatDataSetChanged() {
        this.numbers.clear();
        this.mAdapter.A01.A00();
    }
}
