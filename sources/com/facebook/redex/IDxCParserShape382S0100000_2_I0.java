package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass5PV;
import X.C217015c;
import X.C75193rl;
import X.C75443sA;
import X.C75723sc;
import android.database.Cursor;
import com.whatsapp.jid.Jid;

public class IDxCParserShape382S0100000_2_I0 implements AnonymousClass5PV {
    public Object A00;
    public final int A01;

    public IDxCParserShape382S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object AaB(Cursor cursor) {
        switch (this.A01) {
            case 0:
                C75193rl r5 = new C75193rl();
                Jid A03 = ((C217015c) this.A00).A00.A03(cursor.getLong(cursor.getColumnIndexOrThrow("jid_row_id")));
                if (A03 == null) {
                    return null;
                }
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("home_group_discovery_count");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("home_view_count");
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("home_group_join_count");
                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("home_group_navigation_count");
                r5.A04 = A03.user;
                r5.A03 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow2);
                r5.A00 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow);
                r5.A01 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow3);
                r5.A02 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow4);
                return r5;
            case 1:
                C75443sA r52 = new C75443sA();
                int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("community_id");
                int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("type_of_subgroup");
                int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("reaction_open_tray_count");
                int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("reaction_delete_count");
                int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("pnh_indicator_clicks_info_screen");
                int columnIndex = cursor.getColumnIndex("pnh_indicator_clicks_chat");
                r52.A05 = cursor.getString(columnIndexOrThrow5);
                r52.A00 = Integer.valueOf(cursor.getInt(columnIndexOrThrow6));
                r52.A04 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow7);
                r52.A03 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow8);
                r52.A02 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow9);
                r52.A01 = AnonymousClass3K3.A0h(cursor, columnIndex);
                return r52;
            default:
                C75723sc r53 = new C75723sc();
                int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("poll_id");
                int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("poll_votes");
                int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("poll_votes_changed");
                int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("poll_vote_deletes");
                int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("option_count");
                int columnIndex2 = cursor.getColumnIndex("users_participated");
                int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("poll_creation_ds");
                int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("is_a_group_flag");
                int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("group_size_bucket");
                r53.A04 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow10);
                r53.A06 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow11);
                r53.A07 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow12);
                r53.A05 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow13);
                r53.A02 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow14);
                r53.A08 = AnonymousClass3K3.A0h(cursor, columnIndex2);
                r53.A03 = AnonymousClass3K3.A0h(cursor, columnIndexOrThrow15);
                boolean A1O = AnonymousClass000.A1O(cursor.getInt(columnIndexOrThrow16));
                r53.A00 = Boolean.valueOf(A1O);
                r53.A01 = A1O ? Integer.valueOf(cursor.getInt(columnIndexOrThrow17)) : null;
                return r53;
        }
    }
}
