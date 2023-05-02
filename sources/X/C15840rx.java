package X;

import android.content.ContentValues;

/* renamed from: X.0rx  reason: invalid class name and case insensitive filesystem */
public class C15840rx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A = 1;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F = Long.MIN_VALUE;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J = 1;
    public long A0K = 0;
    public long A0L = 1;
    public long A0M = Long.MIN_VALUE;
    public long A0N = 1;
    public long A0O = Long.MIN_VALUE;
    public long A0P;
    public long A0Q;
    public long A0R = 0;
    public long A0S = 1;
    public long A0T = Long.MIN_VALUE;
    public long A0U = -1;
    public long A0V;
    public long A0W;
    public AnonymousClass1WV A0X;
    public C16740tZ A0Y;
    public C16740tZ A0Z;
    public C34141jl A0a;
    public C39531sd A0b;
    public String A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final C15830rv A0i;

    public C15840rx(C15830rv r7) {
        this.A0i = r7;
        this.A0X = new AnonymousClass1WV(0, 0, 0);
        this.A0D = Long.MIN_VALUE;
        this.A0E = Long.MIN_VALUE;
        this.A0B = Long.MIN_VALUE;
        this.A0C = Long.MIN_VALUE;
    }

    public synchronized long A00() {
        return this.A0K;
    }

    public synchronized long A01() {
        return this.A0R;
    }

    public synchronized long A02() {
        return this.A0V;
    }

    public synchronized ContentValues A03() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("unseen_message_count", Integer.valueOf(this.A06));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A07));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A08));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0W));
        return contentValues;
    }

    public synchronized ContentValues A04(Long l2) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("display_message_row_id", Long.valueOf(this.A0S));
        contentValues.put("display_message_sort_id", Long.valueOf(this.A0T));
        contentValues.put("last_message_row_id", Long.valueOf(this.A0L));
        contentValues.put("last_message_sort_id", Long.valueOf(this.A0M));
        contentValues.put("last_read_message_row_id", Long.valueOf(this.A0N));
        contentValues.put("last_read_message_sort_id", Long.valueOf(this.A0O));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(this.A0P));
        contentValues.put("last_read_receipt_sent_message_sort_id", Long.valueOf(this.A0Q));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0W));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A06));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A07));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A08));
        contentValues.put("last_important_message_row_id", Long.valueOf(this.A0J));
        int i2 = 1;
        int i3 = 0;
        if (this.A0h) {
            i3 = 1;
        }
        contentValues.put("show_group_description", Integer.valueOf(i3));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0X.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0X.ephemeralSettingTimestamp));
        contentValues.put("ephemeral_disappearing_messages_initiator", Integer.valueOf(this.A0X.disappearingMessagesInitiator));
        contentValues.put("subject", this.A0d);
        if (!this.A0e) {
            i2 = 0;
        }
        contentValues.put("archived", Integer.valueOf(i2));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0V));
        contentValues.put("change_number_notified_message_row_id", Long.valueOf(this.A0A));
        contentValues.put("spam_detection", Integer.valueOf(this.A03));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A00));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A09));
        if (l2 != null) {
            contentValues.put("created_timestamp", l2);
        }
        contentValues.put("unseen_important_message_count", Integer.valueOf(this.A04));
        contentValues.put("group_type", Integer.valueOf(this.A01));
        contentValues.put("unseen_message_reaction_count", Integer.valueOf(this.A05));
        contentValues.put("last_message_reaction_row_id", Long.valueOf(this.A0K));
        contentValues.put("last_seen_message_reaction_row_id", Long.valueOf(this.A0R));
        contentValues.put("has_new_community_admin_dialog_been_acknowledged", Boolean.valueOf(this.A0f));
        contentValues.put("history_sync_progress", Integer.valueOf(this.A02));
        return contentValues;
    }

    public synchronized C15830rv A05() {
        return this.A0i;
    }

    public synchronized String A06() {
        return this.A0d;
    }

    public synchronized String A07() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.A08);
        sb.append("/");
        sb.append(this.A06);
        sb.append("/");
        sb.append(this.A07);
        sb.append("/");
        sb.append(this.A0W);
        sb.append("/");
        sb.append(this.A04);
        sb.append("/");
        sb.append(this.A0K - this.A0R);
        return sb.toString();
    }

    public synchronized void A08() {
        this.A0Z = null;
        this.A0Y = null;
        this.A0b = null;
        this.A0S = 1;
        this.A0T = Long.MIN_VALUE;
        this.A0L = 1;
        this.A0M = Long.MIN_VALUE;
        this.A0J = 1;
        this.A0N = 1;
        this.A0O = Long.MIN_VALUE;
        this.A0P = 1;
        this.A0Q = Long.MIN_VALUE;
        this.A0F = Long.MIN_VALUE;
        A0C(0, 0, 0, 0);
    }

    public synchronized void A09(int i2) {
        this.A03 = i2;
    }

    public void A0A(int i2, long j2, int i3) {
        this.A0X = new AnonymousClass1WV(i2, j2, i3);
    }

    public synchronized void A0B(long j2) {
        this.A0V = j2;
    }

    public synchronized boolean A0C(int i2, int i3, int i4, int i5) {
        boolean z2;
        if (this.A06 == i2 && this.A07 == i3 && this.A08 == i4 && this.A04 == i5) {
            z2 = false;
        } else {
            if (i2 <= 0) {
                this.A0W = 0;
            }
            this.A06 = i2;
            this.A04 = i5;
            this.A07 = i3;
            this.A08 = i4;
            z2 = true;
        }
        return z2;
    }
}
