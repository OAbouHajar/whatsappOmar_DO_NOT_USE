package com.obwhatsapp.data;

import X.AnonymousClass013;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass0RE;
import X.AnonymousClass11A;
import X.C007503l;
import X.C15810rt;
import X.C15830rv;
import X.C16070sO;
import X.C16150sX;
import X.C16300so;
import X.C16460t6;
import X.C16920ts;
import X.C19380yL;
import X.C218415q;
import X.C221616w;
import X.C24841Hm;
import X.C29951bV;
import X.C29981bY;
import X.C83674Hp;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConversationDeleteWorker extends Worker {
    public static final ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static final AtomicInteger A0C = new AtomicInteger();
    public static final AtomicInteger A0D = new AtomicInteger();
    public static final AtomicInteger A0E = new AtomicInteger();
    public static final AtomicLong A0F = new AtomicLong();
    public final Context A00;
    public final C16300so A01;
    public final C19380yL A02;
    public final AnonymousClass013 A03;
    public final C16920ts A04;
    public final C15810rt A05;
    public final AnonymousClass11A A06;
    public final C16460t6 A07;
    public final C221616w A08;
    public final C16070sO A09;
    public final C24841Hm A0A;

    public ConversationDeleteWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A00 = context;
        C16150sX r1 = (C16150sX) r2;
        this.A04 = (C16920ts) r1.A40.get();
        this.A01 = r2.A6q();
        this.A05 = (C15810rt) r1.A43.get();
        this.A03 = r2.Ai9();
        this.A07 = (C16460t6) r1.A5k.get();
        this.A08 = (C221616w) r1.A6b.get();
        this.A0A = (C24841Hm) r1.ANv.get();
        this.A06 = (AnonymousClass11A) r1.A5U.get();
        this.A02 = (C19380yL) r1.AQd.get();
        this.A09 = (C16070sO) r1.ABY.get();
    }

    public C29981bY A00() {
        Notification A052 = A05(this.A00.getString(R.string.str06b7), "", 2, 0);
        C29951bV r2 = new C29951bV();
        r2.A04(new AnonymousClass0RE(13, A052, 0));
        return r2;
    }

    public void A03() {
        A0D.addAndGet(-1);
        A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r0 = new java.lang.StringBuilder("conversation-delete-worker/handle-intent invalid action=");
        r0.append(r6);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0154, code lost:
        if (r3.A00 <= 5) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0156, code lost:
        r14.A01.AcB("ConversationDeleteWorker/Deletion failed", (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0163, code lost:
        return new X.C02890Gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0169, code lost:
        return new X.AnonymousClass02P();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0146 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0170 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r14 = this;
            androidx.work.WorkerParameters r3 = r14.A01
            X.03h r8 = r3.A01
            java.lang.String r1 = "job_id"
            java.util.Map r0 = r8.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x001f
            java.lang.Number r1 = (java.lang.Number) r1
            long r9 = r1.longValue()
        L_0x0016:
            X.16w r2 = r14.A08
            X.0tq r0 = r2.A02
            X.0tf r7 = r0.get()
            goto L_0x0022
        L_0x001f:
            r9 = -1
            goto L_0x0016
        L_0x0022:
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0171 }
            java.lang.String r5 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE _id= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0171 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0171 }
            r4[r1] = r0     // Catch:{ all -> 0x0171 }
            android.database.Cursor r4 = r6.A08(r5, r4)     // Catch:{ all -> 0x0171 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0045
            X.1y1 r1 = r2.A02(r4)     // Catch:{ all -> 0x016a }
            r4.close()     // Catch:{ all -> 0x0171 }
            r7.close()
            goto L_0x004c
        L_0x0045:
            r4.close()     // Catch:{ all -> 0x0171 }
            r7.close()
            r1 = 0
        L_0x004c:
            if (r1 == 0) goto L_0x006f
            X.0rv r4 = r1.A07
            java.lang.String r0 = "delete_action"
            java.lang.String r6 = r8.A03(r0)
            int r0 = r6.hashCode()
            r5 = 0
            switch(r0) {
                case 893674186: goto L_0x0074;
                case 1096596436: goto L_0x0086;
                case 1835767556: goto L_0x010c;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.String r1 = "conversation-delete-worker/handle-intent invalid action="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006f:
            X.02Q r0 = X.AnonymousClass02Q.A00()
            return r0
        L_0x0074:
            java.lang.String r0 = "action_singular_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r14.A08(r1)
            if (r0 == 0) goto L_0x0151
            r2.A05(r1)
            goto L_0x006f
        L_0x0086:
            java.lang.String r0 = "action_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r14.A08(r1)
            if (r0 == 0) goto L_0x0151
            X.0rt r0 = r14.A05
            boolean r0 = r0.A0I(r4)
            if (r0 == 0) goto L_0x006f
            r2.A05(r1)
            boolean r0 = r4 instanceof X.C16060sN
            if (r0 == 0) goto L_0x0100
            X.0sO r10 = r14.A09
            r6 = r4
            X.0sN r6 = (X.C16060sN) r6
            X.0tq r0 = r10.A06
            X.0tf r13 = r0.A02()
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x014c }
            X.0us r11 = r10.A07     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "participant-user-store/updateGroupParticipants/deleteParticipants/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r0.<init>(r1)     // Catch:{ all -> 0x0147 }
            r0.append(r6)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0147 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0147 }
            X.0tq r0 = r11.A09     // Catch:{ all -> 0x0147 }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x0147 }
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = "group_participant_user"
            java.lang.String r3 = "group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0142 }
            X.14v r0 = r11.A08     // Catch:{ all -> 0x0142 }
            long r0 = r0.A01(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r2[r5] = r0     // Catch:{ all -> 0x0142 }
            r8.A01(r7, r3, r2)     // Catch:{ all -> 0x0142 }
            r9.close()     // Catch:{ all -> 0x0147 }
            X.192 r3 = r10.A08     // Catch:{ all -> 0x0147 }
            X.0pd r2 = r3.A02     // Catch:{ all -> 0x0147 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0147 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x00f7
            r3.A02(r6)     // Catch:{ all -> 0x0147 }
        L_0x00f7:
            r12.A00()     // Catch:{ all -> 0x0147 }
            r12.close()     // Catch:{ all -> 0x014c }
            r13.close()
        L_0x0100:
            X.0ts r0 = r14.A04
            r0.A0F(r4)
            X.11A r0 = r14.A06
            r0.A07(r4)
            goto L_0x006f
        L_0x010c:
            java.lang.String r0 = "action_clear"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r14.A08(r1)
            if (r0 == 0) goto L_0x0151
            r2.A05(r1)
            X.0t6 r0 = r14.A07
            r0.A0t(r4, r5)
            r0.A0U(r4, r5)
            X.11A r0 = r14.A06
            X.AnonymousClass00B.A06(r4)
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0132:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.next()
            X.1ig r0 = (X.C33501ig) r0
            r0.A04(r4)
            goto L_0x0132
        L_0x0142:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0146 }
        L_0x0146:
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x014b }
        L_0x014b:
            throw r0     // Catch:{ all -> 0x014c }
        L_0x014c:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0175 }
            throw r0
        L_0x0151:
            int r1 = r3.A00
            r0 = 5
            if (r1 <= r0) goto L_0x0164
            X.0so r2 = r14.A01
            r1 = 0
            java.lang.String r0 = "ConversationDeleteWorker/Deletion failed"
            r2.AcB(r0, r1, r5)
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            return r0
        L_0x0164:
            X.02P r0 = new X.02P
            r0.<init>()
            return r0
        L_0x016a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0170
            r4.close()     // Catch:{ all -> 0x0170 }
        L_0x0170:
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0175 }
        L_0x0175:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.ConversationDeleteWorker.A04():X.02Q");
    }

    public final Notification A05(String str, String str2, int i2, int i3) {
        C007503l A002 = C218415q.A00(this.A00);
        A002.A0J = "other_notifications@1";
        A002.A03 = -1;
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A0I = "progress";
            A002.A06 = -1;
        }
        if (i2 != 2) {
            A002.A03(100, i3, false);
        } else {
            A002.A03(100, i3, true);
        }
        A002.A0D(false);
        A002.A0E(true);
        A002.A0A(str);
        A002.A09(str2);
        return A002.A01();
    }

    public final void A06() {
        AtomicInteger atomicInteger = A0D;
        if (atomicInteger.get() <= 0) {
            A0C.set(0);
            A0E.set(0);
            A0F.set(0);
            atomicInteger.set(0);
            A0B.clear();
            this.A02.A03(13, (String) null);
        }
    }

    public void A07(C15830rv r14, int i2) {
        int max;
        C83674Hp r2 = (C83674Hp) A0B.get(r14);
        synchronized (r2) {
            int i3 = r2.A00;
            max = Math.max(0, i2 - i3);
            r2.A00 = i3 + max;
            r2.A01 -= max;
        }
        AtomicInteger atomicInteger = A0C;
        atomicInteger.addAndGet(max);
        AtomicInteger atomicInteger2 = A0E;
        if (atomicInteger2.get() == 0 || atomicInteger.get() > atomicInteger2.get()) {
            Log.w("conversation-delete-worker/delete-progress/totalMessagesAllJids not updated.");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = A0F;
        if (uptimeMillis - atomicLong.get() >= 250) {
            atomicLong.set(uptimeMillis);
            int i4 = (atomicInteger.get() * 100) / atomicInteger2.get();
            Context context = this.A00;
            this.A02.A02(13, A05(context.getString(R.string.str06b7), context.getString(R.string.str06b8, new Object[]{Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), this.A03.A0L().format(((double) i4) / 100.0d)}), 3, i4));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x02d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0312 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x031e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x0323 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0169 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x016e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.C42561y1 r36) {
        /*
            r35 = this;
            r9 = r36
            X.0rv r8 = r9.A07
            r7 = r35
            X.4xz r5 = new X.4xz     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r5.<init>(r7, r9)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0rt r0 = r7.A05     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0C()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.Object r6 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0rx r6 = (X.C15840rx) r6     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            if (r6 == 0) goto L_0x0174
            long r1 = r6.A0B     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            java.lang.String r0 = r6.A0c     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            if (r0 != 0) goto L_0x0174
            X.1Hm r11 = r7.A0A     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r4 = r8.getRawString()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0rz r0 = r11.A03     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.01D r3 = r0.A01     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.Object r2 = r3.get()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r1 = "storage_usage_deletion_jid"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r3.get()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = "storage_usage_deletion_all_msg_cnt"
            r2 = 0
            int r4 = r1.getInt(r0, r2)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.Object r1 = r3.get()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = "storage_usage_deletion_current_msg_cnt"
            int r3 = r1.getInt(r0, r2)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.1Hl r2 = r11.A07     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.4Hr r0 = new X.4Hr     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r0.<init>(r5, r11)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.C24831Hl.A00(r0, r8, r4, r3)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0t6 r1 = r2.A01     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r1.A0P(r8)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.4y0 r10 = new X.4y0     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r11 = r9
            r12 = r0
            r13 = r2
            r14 = r3
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r0 = 0
            boolean r4 = r1.A0q(r9, r10, r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            return r4
        L_0x0081:
            X.1Hl r10 = r11.A07     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.4Hr r6 = new X.4Hr     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r6.<init>(r5, r11)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = "storageUsageMsgStore/deleteMessagesForJid"
            X.1Zf r5 = new X.1Zf     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r5.<init>((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.17H r0 = r10.A04     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r0.A01(r8)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0t6 r4 = r10.A01     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r11 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8')"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0ts r0 = r4.A0N     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            long r0 = r0.A02(r8)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r0 = 0
            r3[r0] = r1     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = "CoreMessageStore/getMessageCountForJid"
            X.1Zf r1 = new X.1Zf     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r1.<init>((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0tq r0 = r4.A0v     // Catch:{ all -> 0x016f }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x016f }
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x016a }
            android.database.Cursor r3 = r0.A08(r11, r3)     // Catch:{ all -> 0x016a }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0163 }
            long r11 = r3.getLong(r0)     // Catch:{ all -> 0x0163 }
            r3.close()     // Catch:{ all -> 0x016a }
            r2.close()     // Catch:{ all -> 0x016f }
            r1.A01()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0121
            long r0 = r9.A06     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r22 = r0
            long r0 = r9.A01     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r24 = r0
            int r0 = r9.A00     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r19 = r0
            long r13 = r9.A04     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            long r11 = r9.A05     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            boolean r0 = r9.A0C     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r32 = r0
            boolean r0 = r9.A0B     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r33 = r0
            long r2 = r9.A02     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            long r0 = r9.A03     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            boolean r15 = r9.A0A     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r34 = r15
            java.lang.String r15 = r9.A08     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r17 = r15
            java.util.List r9 = r9.A09     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r18 = r9
            X.1y1 r9 = new X.1y1     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r15 = r9
            r16 = r8
            r20 = r22
            r22 = r24
            r24 = r13
            r26 = r11
            r28 = r2
            r30 = r0
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26, r28, r30, r32, r33, r34)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            goto L_0x0125
        L_0x0118:
            r3.close()     // Catch:{ all -> 0x016a }
            r2.close()     // Catch:{ all -> 0x016f }
            r1.A01()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
        L_0x0121:
            r0 = 0
            r4.A0s(r8, r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
        L_0x0125:
            X.16w r0 = r10.A02     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.0rv r3 = r9.A07     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            int r2 = r0.A00(r3)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r1 = 0
            X.C24831Hl.A00(r6, r3, r2, r1)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r4.A0P(r3)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            X.4y0 r0 = new X.4y0     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r15 = 0
            r11 = r0
            r12 = r9
            r13 = r6
            r14 = r10
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            boolean r4 = r4.A0q(r9, r0, r1)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = "storageUsageMsgStore/deleteMessagesForJid "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r2.<init>(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r2.append(r3)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = " success:true time spent:"
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            long r0 = r5.A01()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            return r4
        L_0x0163:
            r0 = move-exception
            if (r3 == 0) goto L_0x0169
            r3.close()     // Catch:{ all -> 0x0169 }
        L_0x0169:
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x016e }
        L_0x016e:
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            r1.A01()     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            throw r0     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
        L_0x0174:
            X.0t6 r1 = r7.A07     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            r0 = 0
            boolean r0 = r1.A0q(r9, r5, r0)     // Catch:{ IllegalStateException -> 0x0183, all -> 0x017c }
            return r0
        L_0x017c:
            r1 = move-exception
            java.lang.String r0 = "conversation-delete-worker/delete/exception"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        L_0x0183:
            r1 = move-exception
            java.lang.String r0 = "Error while deleting messages in batches, switching to old way of deleting..."
            com.whatsapp.util.Log.e(r0, r1)
            X.16w r0 = r7.A08
            int r19 = r0.A00(r8)
            X.0t6 r2 = r7.A07
            X.AnonymousClass00B.A00()
            java.lang.String r0 = "msgstore/deletemsgs/fallback"
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            java.lang.String r0 = "msgstore/deletemedia"
            X.1Zf r12 = new X.1Zf
            r12.<init>((java.lang.String) r0)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r3 = 1
            X.0tq r11 = r2.A0v     // Catch:{ SQLiteDiskIOException -> 0x0324 }
            X.0tf r6 = r11.get()     // Catch:{ SQLiteDiskIOException -> 0x0324 }
            X.0tg r13 = r6.A02     // Catch:{ all -> 0x031f }
            java.lang.String r4 = X.C42951yy.A02     // Catch:{ all -> 0x031f }
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x031f }
            X.0ts r15 = r2.A0N     // Catch:{ all -> 0x031f }
            long r16 = r15.A02(r8)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x031f }
            r9 = 0
            r1[r9] = r0     // Catch:{ all -> 0x031f }
            android.database.Cursor r13 = r13.A08(r4, r1)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = "remove_files"
            int r14 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0318 }
        L_0x01cb:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x01ef
            X.0th r0 = r2.A0K     // Catch:{ all -> 0x0318 }
            X.0tZ r4 = r0.A02(r13, r8, r3)     // Catch:{ all -> 0x0318 }
            X.0tY r4 = (X.C16730tY) r4     // Catch:{ all -> 0x0318 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0318 }
            int r0 = r13.getInt(r14)     // Catch:{ all -> 0x0318 }
            r1 = 0
            if (r0 != r3) goto L_0x01e4
            r1 = 1
        L_0x01e4:
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x01eb
            r10.add(r0)     // Catch:{ all -> 0x0318 }
        L_0x01eb:
            r2.A0j(r4, r1, r9)     // Catch:{ all -> 0x0318 }
            goto L_0x01cb
        L_0x01ef:
            r13.close()     // Catch:{ all -> 0x031f }
            r6.close()     // Catch:{ SQLiteDiskIOException -> 0x0324 }
            java.lang.String r0 = "msgstore/deletemedia "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r8)
            java.lang.String r4 = " timeSpent:"
            r6.append(r4)
            long r0 = r12.A01()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tf r6 = r11.A02()
            X.1cj r18 = r6.A00()     // Catch:{ all -> 0x0313 }
            X.17H r0 = r2.A0n     // Catch:{ all -> 0x030e }
            r0.A01(r8)     // Catch:{ all -> 0x030e }
            r11.A04()     // Catch:{ all -> 0x030e }
            X.1jC r0 = r11.A04     // Catch:{ all -> 0x030e }
            X.0tg r14 = r6.A02     // Catch:{ all -> 0x030e }
            boolean r0 = r0.A0E(r14)     // Catch:{ all -> 0x030e }
            if (r0 == 0) goto L_0x0259
            java.lang.String r12 = "message"
            java.lang.String r11 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id= ?)"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x030e }
            long r15 = r15.A02(r8)     // Catch:{ all -> 0x030e }
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x030e }
            r1[r9] = r0     // Catch:{ all -> 0x030e }
            int r11 = r14.A01(r12, r11, r1)     // Catch:{ all -> 0x030e }
        L_0x0240:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x030e }
            r1.<init>()     // Catch:{ all -> 0x030e }
            java.lang.String r0 = "msgstore/deletemsgs/count:"
            r1.append(r0)     // Catch:{ all -> 0x030e }
            r1.append(r11)     // Catch:{ all -> 0x030e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x030e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x030e }
            X.0xN r12 = r2.A1N     // Catch:{ all -> 0x030e }
            r17 = 0
            goto L_0x026e
        L_0x0259:
            java.lang.String r13 = "messages"
            java.lang.String r12 = "media_wa_type != 8 AND _id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id= ?)"
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ all -> 0x030e }
            long r0 = r15.A02(r8)     // Catch:{ all -> 0x030e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x030e }
            r11[r9] = r0     // Catch:{ all -> 0x030e }
            int r11 = r14.A01(r13, r12, r11)     // Catch:{ all -> 0x030e }
            goto L_0x0240
        L_0x026e:
            X.0tq r0 = r12.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x02d1 }
            X.0tf r14 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02d1 }
            X.11I r1 = r12.A03     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = "thumbnail_ready"
            int r1 = r1.A00(r0, r9)     // Catch:{ all -> 0x02cc }
            r0 = 2
            if (r1 != r0) goto L_0x02b5
            X.0tg r13 = r14.A02     // Catch:{ all -> 0x02cc }
            java.lang.String r11 = "message_thumbnail"
            java.lang.String r9 = "message_row_id IN (SELECT _id FROM message WHERE chat_row_id = ?)"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x02cc }
            X.0ts r0 = r12.A00     // Catch:{ all -> 0x02cc }
            long r15 = r0.A02(r8)     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x02cc }
            r1[r17] = r0     // Catch:{ all -> 0x02cc }
            int r9 = r13.A01(r11, r9, r1)     // Catch:{ all -> 0x02cc }
        L_0x0298:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cc }
            r1.<init>()     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = "msgstore/deleteAllMessageThumbnailsFor-jid/"
            r1.append(r0)     // Catch:{ all -> 0x02cc }
            r1.append(r8)     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x02cc }
            r1.append(r9)     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02cc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02cc }
            goto L_0x02c8
        L_0x02b5:
            X.0tg r13 = r14.A02     // Catch:{ all -> 0x02cc }
            java.lang.String r11 = "message_thumbnails"
            java.lang.String r9 = "key_remote_jid = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x02cc }
            r1[r17] = r0     // Catch:{ all -> 0x02cc }
            int r9 = r13.A01(r11, r9, r1)     // Catch:{ all -> 0x02cc }
            goto L_0x0298
        L_0x02c8:
            r14.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02d1 }
            goto L_0x02d7
        L_0x02cc:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x02d0 }
        L_0x02d0:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x02d1 }
        L_0x02d1:
            r1 = move-exception
            java.lang.String r0 = "msgstore/deleteAllMessageThumbnailsFor-jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x030e }
        L_0x02d7:
            r12.A06(r10)     // Catch:{ all -> 0x030e }
            X.151 r0 = r2.A0Z     // Catch:{ all -> 0x030e }
            r0.A04(r8)     // Catch:{ all -> 0x030e }
            X.0wt r0 = r2.A0S     // Catch:{ all -> 0x030e }
            r0.A00()     // Catch:{ all -> 0x030e }
            r18.A00()     // Catch:{ all -> 0x030e }
            r18.close()     // Catch:{ all -> 0x0313 }
            r6.close()
            java.lang.String r0 = "msgstore/deletemsgs/fallback "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r8)
            r2.append(r4)
            long r0 = r5.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r19
            r7.A07(r8, r0)
            return r3
        L_0x030e:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0312 }
        L_0x0312:
            throw r0     // Catch:{ all -> 0x0313 }
        L_0x0313:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0317 }
        L_0x0317:
            throw r0
        L_0x0318:
            r0 = move-exception
            if (r13 == 0) goto L_0x031e
            r13.close()     // Catch:{ all -> 0x031e }
        L_0x031e:
            throw r0     // Catch:{ all -> 0x031f }
        L_0x031f:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0323 }
        L_0x0323:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x0324 }
        L_0x0324:
            r1 = move-exception
            X.0y0 r0 = r2.A0t
            r0.A00(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.ConversationDeleteWorker.A08(X.1y1):boolean");
    }
}
