package com.facebook.redex;

import X.AnonymousClass1XX;
import X.AnonymousClass1XY;
import com.obwhatsapp.storage.StorageUsageActivity;
import java.util.concurrent.atomic.AtomicBoolean;

public class RunnableRunnableShape11S0200000_I0_9 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape11S0200000_I0_9(AnonymousClass1XX r2, Object obj) {
        this.A02 = 19;
        this.A01 = r2;
        this.A00 = new AnonymousClass1XY(obj);
    }

    public RunnableRunnableShape11S0200000_I0_9(StorageUsageActivity storageUsageActivity) {
        this.A02 = 6;
        this.A01 = storageUsageActivity;
        this.A00 = new AtomicBoolean(false);
    }

    public RunnableRunnableShape11S0200000_I0_9(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r11v9, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r1 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0908, code lost:
        r2.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x090b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0b53, code lost:
        if (r3 == false) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0c11, code lost:
        r0.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c14, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c2e, code lost:
        android.os.Process.setThreadPriority(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c31, code lost:
        r1.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c34, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x047b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0c35;
                case 1: goto L_0x0132;
                case 2: goto L_0x0c15;
                case 3: goto L_0x0bfb;
                case 4: goto L_0x0be4;
                case 5: goto L_0x0bc5;
                case 6: goto L_0x010f;
                case 7: goto L_0x00d6;
                case 8: goto L_0x0b9b;
                case 9: goto L_0x00c3;
                case 10: goto L_0x0b32;
                case 11: goto L_0x0b19;
                case 12: goto L_0x0af0;
                case 13: goto L_0x0a90;
                case 14: goto L_0x0a61;
                case 15: goto L_0x0092;
                case 16: goto L_0x0077;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x0055;
                case 20: goto L_0x0a51;
                case 21: goto L_0x0a3c;
                case 22: goto L_0x0a12;
                case 23: goto L_0x0a06;
                case 24: goto L_0x0c24;
                case 25: goto L_0x09fa;
                case 26: goto L_0x09ee;
                case 27: goto L_0x09d5;
                case 28: goto L_0x09aa;
                case 29: goto L_0x0932;
                case 30: goto L_0x0918;
                case 31: goto L_0x090c;
                case 32: goto L_0x08f3;
                case 33: goto L_0x08de;
                case 34: goto L_0x001c;
                case 35: goto L_0x08a4;
                case 36: goto L_0x08d2;
                case 37: goto L_0x08cb;
                case 38: goto L_0x0161;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.0tT r0 = (X.C16690tT) r0
            java.lang.Object r2 = r2.A01
            X.1XZ r2 = (X.AnonymousClass1XZ) r2
            r1 = 1
            X.0tU r0 = r0.A02
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001b
            r2.A6p()
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r0 = r2.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r4 = r2.A01
            X.1AC r4 = (X.AnonymousClass1AC) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x0028:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r3.next()
            X.0tZ r2 = (X.C16740tZ) r2
            X.4aY r0 = X.C88464aY.A00
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0028
            long r0 = r2.A13
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "CrosspostMessageObserver/onMessagesDeleted message "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.LinkedHashMap r1 = r4.A02
            X.1Vw r0 = r2.A11
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x0028
        L_0x0055:
            java.lang.Object r1 = r2.A00
            X.1XY r1 = (X.AnonymousClass1XY) r1
            X.024 r3 = r1.A00
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x001b
            java.lang.Object r2 = r2.A01
            X.1XX r2 = (X.AnonymousClass1XX) r2
            X.025 r0 = r2.A02
            java.lang.Object r1 = r0.apply(r1)
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x001b
            X.026 r0 = r2.A03
            r0.A09(r1)
            return
        L_0x0077:
            java.lang.Object r3 = r2.A00
            X.18K r3 = (X.AnonymousClass18K) r3
            java.lang.Object r0 = r2.A01
            X.0rv r0 = (X.C15830rv) r0
            java.lang.Integer r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x001b
            X.1Xa r1 = new X.1Xa
            r1.<init>()
            r1.A00 = r0
            X.0t9 r0 = r3.A04
            r0.A06(r1)
            return
        L_0x0092:
            java.lang.Object r4 = r2.A00
            X.18K r4 = (X.AnonymousClass18K) r4
            java.lang.Object r1 = r2.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Integer r3 = r4.A00(r1)
            if (r3 == 0) goto L_0x001b
            X.1Xb r2 = new X.1Xb
            r2.<init>()
            X.0yz r0 = r4.A01
            X.0tZ r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x00b4
            X.1Vw r0 = r0.A11
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            r2.A01 = r3
            X.0t9 r0 = r4.A04
            r0.A06(r2)
            return
        L_0x00c3:
            java.lang.Object r0 = r2.A00
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x00d6:
            java.lang.Object r5 = r2.A00
            com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment r5 = (com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r5
            java.lang.Object r6 = r2.A01
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            X.0tb r1 = r5.A00
            r4 = 1
            r0 = 0
            r1.A0V(r6, r4, r0)
            X.1Xe r9 = r5.A01
            if (r9 == 0) goto L_0x001b
            java.util.Collection r0 = r5.A04
            java.util.Iterator r2 = r0.iterator()
            r11 = 0
        L_0x00f1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e04
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r1.A0x
            if (r0 == 0) goto L_0x0109
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x00f1
        L_0x0109:
            X.0tY r1 = (X.C16730tY) r1
            long r0 = r1.A01
            long r11 = r11 + r0
            goto L_0x00f1
        L_0x010f:
            java.lang.String r0 = "storage-usage-activity/fetch chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r2.A00
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x001b
            java.lang.Object r6 = r2.A01
            com.obwhatsapp.storage.StorageUsageActivity r6 = (com.obwhatsapp.storage.StorageUsageActivity) r6
            X.1Hm r0 = r6.A0C
            X.18c r0 = r0.A01
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.database.Cursor r9 = r0.A09()
            goto L_0x0e89
        L_0x0132:
            java.lang.Object r0 = r2.A00
            X.2Jq r0 = (X.C47602Jq) r0
            java.lang.Object r3 = r2.A01
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.util.List r0 = r0.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0140:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.5S4 r1 = (X.AnonymousClass5S4) r1
            java.lang.String r0 = r1.getId()
            java.lang.Object r0 = r3.get(r0)
            X.1pi r0 = (X.C37771pi) r0
            if (r0 == 0) goto L_0x0140
            X.35B r1 = (X.AnonymousClass35B) r1
            r1.A05(r0)
            r1.A01()
            goto L_0x0140
        L_0x0161:
            java.lang.Object r3 = r2.A01     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.Job r3 = (org.whispersystems.jobqueue.Job) r3     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r3.parameters     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r0.isPersistent     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0283
            java.lang.Object r0 = r2.A00     // Catch:{ IOException -> 0x0896 }
            X.1Xj r0 = (X.C28721Xj) r0     // Catch:{ IOException -> 0x0896 }
            X.1Xk r4 = r0.A06     // Catch:{ IOException -> 0x0896 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ IOException -> 0x0896 }
            r5.<init>()     // Catch:{ IOException -> 0x0896 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ NotSerializableException -> 0x024e }
            r1.<init>()     // Catch:{ NotSerializableException -> 0x024e }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ NotSerializableException -> 0x024e }
            r0.<init>(r1)     // Catch:{ NotSerializableException -> 0x024e }
            r0.writeObject(r3)     // Catch:{ NotSerializableException -> 0x024e }
            byte[] r6 = r1.toByteArray()     // Catch:{ NotSerializableException -> 0x024e }
            int r7 = r6.length     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            byte[] r17 = X.C28741Xl.A00     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r0 = r7 / 3
            int r1 = r0 << 2
            int r0 = r7 % 3
            if (r0 <= 0) goto L_0x0194
            int r1 = r1 + 4
        L_0x0194:
            byte[] r8 = new byte[r1]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r16 = -1
            r15 = 2
            r11 = 0
            r14 = 4
            r13 = 10
            r12 = 0
        L_0x019e:
            int r9 = r11 + 3
            if (r9 > r7) goto L_0x01ed
            byte r0 = r6[r11]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 16
            int r0 = r11 + 1
            byte r0 = r6[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r10 = r0 << 8
            r10 = r10 | r1
            int r0 = r11 + 2
            byte r0 = r6[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            int r0 = r10 >> 18
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r12] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r1 = r12 + 1
            int r0 = r10 >> 12
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r1] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r1 = r12 + 2
            int r0 = r10 >> 6
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r1] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r1 = r12 + 3
            r0 = r10 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r1] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r12 = r12 + 4
            int r16 = r16 + -1
            if (r16 != 0) goto L_0x01eb
            int r0 = r12 + 1
            r8[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r12 = r0
            r11 = r9
            r16 = 19
            goto L_0x019e
        L_0x01eb:
            r11 = r9
            goto L_0x019e
        L_0x01ed:
            int r0 = r7 + -1
            r9 = 61
            if (r11 != r0) goto L_0x0211
            byte r0 = r6[r11]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r7 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r14
            int r6 = r12 + 1
            int r0 = r7 >> 6
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r12] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r1 = r6 + 1
            r0 = r7 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r6] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r0 = r1 + 1
            r8[r1] = r9     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r0] = r9     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            goto L_0x023f
        L_0x0211:
            int r7 = r7 - r15
            if (r11 != r7) goto L_0x023f
            int r1 = r11 + 1
            byte r0 = r6[r11]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r7 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r13
            byte r0 = r6[r1]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r15
            r7 = r7 | r0
            int r1 = r12 + 1
            int r0 = r7 >> 12
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r12] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r6 = r1 + 1
            int r0 = r7 >> 6
            r0 = r0 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r1] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            int r1 = r6 + 1
            r0 = r7 & 63
            byte r0 = r17[r0]     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r6] = r0     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r8[r1] = r9     // Catch:{ UnsupportedEncodingException -> 0x0247 }
        L_0x023f:
            java.lang.String r0 = "US-ASCII"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            r1.<init>(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x0247 }
            goto L_0x0264
        L_0x0247:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ NotSerializableException -> 0x024e }
            r0.<init>(r1)     // Catch:{ NotSerializableException -> 0x024e }
            throw r0     // Catch:{ NotSerializableException -> 0x024e }
        L_0x024e:
            r4 = move-exception
            java.lang.String r1 = "Can't serialize job:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0896 }
            r0.append(r3)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0896 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0896 }
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x0896 }
            goto L_0x088f
        L_0x0264:
            java.lang.String r0 = "item"
            r5.put(r0, r1)     // Catch:{ IOException -> 0x0896 }
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "encrypted"
            r5.put(r0, r1)     // Catch:{ IOException -> 0x0896 }
            X.1Xn r0 = r4.A03     // Catch:{ IOException -> 0x0896 }
            android.database.sqlite.SQLiteDatabase r4 = r0.getWritableDatabase()     // Catch:{ IOException -> 0x0896 }
            r1 = 0
            java.lang.String r0 = "queue"
            long r0 = r4.insert(r0, r1, r5)     // Catch:{ IOException -> 0x0896 }
            r3.A02(r0)     // Catch:{ IOException -> 0x0896 }
        L_0x0283:
            java.lang.Object r1 = r2.A00     // Catch:{ IOException -> 0x0896 }
            X.1Xj r1 = (X.C28721Xj) r1     // Catch:{ IOException -> 0x0896 }
            X.1Xo r4 = r1.A05     // Catch:{ IOException -> 0x0896 }
            android.content.Context r0 = r1.A00     // Catch:{ IOException -> 0x0896 }
            r4.A00(r0, r3)     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r3 instanceof X.C28781Xp     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof X.C28801Xr     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a8
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onadded"
        L_0x02a0:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
        L_0x02a3:
            X.1Xu r4 = r1.A04     // Catch:{ IOException -> 0x0896 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0896 }
            goto L_0x087c
        L_0x02a8:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02af
            java.lang.String r0 = "SyncdDeleteAllDataForNonMdUserJob/onadded"
            goto L_0x02a0
        L_0x02af:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncProfilePictureJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02c9
            r4 = r3
            com.obwhatsapp.jobqueue.job.SyncProfilePictureJob r4 = (com.obwhatsapp.jobqueue.job.SyncProfilePictureJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SyncProfilePictureJob/onAdded/sync profile picture job added param="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
        L_0x02c1:
            r5.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a0
        L_0x02c9:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02dc
            r4 = r3
            com.obwhatsapp.jobqueue.job.SyncDevicesJob r4 = (com.obwhatsapp.jobqueue.job.SyncDevicesJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SyncDevicesJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x02dc:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02ef
            r4 = r3
            com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r4 = (com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SyncDevicesAndSendInvisibleMessageJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x02ef:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0319
            r6 = r3
            com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r6 = (com.obwhatsapp.jobqueue.job.SyncDeviceForAdvValidationJob) r6     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SyncDeviceForAdvValidationJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "; jids="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String[] r0 = r6.jids     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = X.C16030sJ.A05(r0)     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            r5.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a0
        L_0x0319:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x032c
            r4 = r3
            com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r4 = (com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x032c:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendRetryReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendReadReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0340
            r0 = r3
            com.obwhatsapp.jobqueue.job.SendReadReceiptJob r0 = (com.obwhatsapp.jobqueue.job.SendReadReceiptJob) r0     // Catch:{ IOException -> 0x0896 }
            r0.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a3
        L_0x0340:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x034c
            r0 = r3
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = (com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2) r0     // Catch:{ IOException -> 0x0896 }
            r0.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a3
        L_0x034c:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendPeerMessageJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x03dd
            r7 = r3
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r7 = (com.obwhatsapp.jobqueue.job.SendPeerMessageJob) r7     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "SendPeerMessageJob/onAdded/job added="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r7.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r0 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x0378:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r4 = r8.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r4 = (org.whispersystems.jobqueue.requirements.Requirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x03ca
            com.obwhatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.targetJidRawString     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ IOException -> 0x0896 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ IOException -> 0x0896 }
            X.0z2 r0 = r4.A01     // Catch:{ IOException -> 0x0896 }
            X.0uz r0 = r0.A06()     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r0.contains(r5)     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x03c5
            X.11s r4 = r4.A00     // Catch:{ IOException -> 0x0896 }
            X.1Yb r0 = X.C28851Ya.A02(r5)     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.A0d(r0)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x03c5
            java.util.Set r4 = java.util.Collections.singleton(r5)     // Catch:{ IOException -> 0x0896 }
        L_0x03af:
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0378
            com.whatsapp.jid.DeviceJid[] r0 = com.obwhatsapp.jobqueue.job.SendPeerMessageJob.A0D     // Catch:{ IOException -> 0x0896 }
            java.lang.Object[] r6 = r4.toArray(r0)     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid[] r6 = (com.whatsapp.jid.DeviceJid[]) r6     // Catch:{ IOException -> 0x0896 }
            X.1HD r5 = r7.A01     // Catch:{ IOException -> 0x0896 }
            r4 = 0
            r0 = 5
            r5.A04(r6, r0, r4)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0378
        L_0x03c5:
            java.util.Set r4 = java.util.Collections.emptySet()     // Catch:{ IOException -> 0x0896 }
            goto L_0x03af
        L_0x03ca:
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0378
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0378
            com.whatsapp.jid.DeviceJid r0 = r4.A01     // Catch:{ IOException -> 0x0896 }
            java.util.Set r4 = java.util.Collections.singleton(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x03af
        L_0x03dd:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x03f1
            r4 = r3
            com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob r4 = (com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "PAY: SendPaymentInviteSetupJob notif job added: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x03f1:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x044f
            r6 = r3
            com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob r6 = (com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob) r6     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "live location key notification send job added"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r6.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ IOException -> 0x0896 }
            r7.<init>()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r6.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r0 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x0422:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0744
            java.lang.Object r4 = r5.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r4 = (org.whispersystems.jobqueue.requirements.Requirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0440
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0422
            com.whatsapp.jid.DeviceJid r0 = r4.A01     // Catch:{ IOException -> 0x0896 }
        L_0x043c:
            r7.add(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0422
        L_0x0440:
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0422
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0422
            com.whatsapp.jid.DeviceJid r0 = r4.A01     // Catch:{ IOException -> 0x0896 }
            goto L_0x043c
        L_0x044f:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x04ae
            r9 = r3
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r9 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r9     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r9.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r5 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.rawDeviceJid     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "final live location notification send retry job added"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r8 = r5.iterator()     // Catch:{ IOException -> 0x0896 }
            r7 = 0
            r6 = 0
        L_0x047b:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r5 = r8.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r5 = (org.whispersystems.jobqueue.requirements.Requirement) r5     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r5 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement     // Catch:{ IOException -> 0x0896 }
            r4 = 1
            if (r0 == 0) goto L_0x0493
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r5 = (com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement) r5     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r5.AJT()     // Catch:{ IOException -> 0x0896 }
            goto L_0x049d
        L_0x0493:
            boolean r0 = r5 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x04a1
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r5 = (com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r5     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r5.AJT()     // Catch:{ IOException -> 0x0896 }
        L_0x049d:
            if (r0 != 0) goto L_0x04a1
            r6 = 1
            goto L_0x04a3
        L_0x04a1:
            if (r6 == 0) goto L_0x047b
        L_0x04a3:
            X.1HD r5 = r9.A01     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid[] r4 = new com.whatsapp.jid.DeviceJid[r4]     // Catch:{ IOException -> 0x0896 }
            r4[r7] = r10     // Catch:{ IOException -> 0x0896 }
            r0 = 3
            r5.A04(r4, r0, r7)     // Catch:{ IOException -> 0x0896 }
            goto L_0x047b
        L_0x04ae:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x04f0
            r6 = r3
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r6 = (com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r6     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r6.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r5 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "final live location notification send job added"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r6.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x04d2:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r4 = r5.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r4 = (org.whispersystems.jobqueue.requirements.Requirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x04d2
            com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x04d2
            X.0yQ r0 = r6.A04     // Catch:{ IOException -> 0x0896 }
            r0.A0b()     // Catch:{ IOException -> 0x0896 }
            goto L_0x04d2
        L_0x04f0:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendE2EMessageJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0532
            r0 = r3
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r0 = (com.obwhatsapp.jobqueue.job.SendE2EMessageJob) r0     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r0.jid     // Catch:{ IOException -> 0x0896 }
            com.obwhatsapp.yo.yo.controlReadTi(r4)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = "sende2emessagejob/e2e message send job added"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r0.A04()     // Catch:{ IOException -> 0x0896 }
            r5.append(r4)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r0.duplicate     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x0755
            java.lang.String r5 = "sende2emessagejob/e2e messasge job is duplicate, skipping requirement check"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r0.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a3
        L_0x0532:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0546
            r4 = r3
            com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob r4 = (com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "disable live location job added"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x0546:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x055f
            r4 = r3
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r4 = (com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "rotate signed pre key job added"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x055f:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.RehydrateTemplateJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x05fb
            r8 = r3
            com.obwhatsapp.jobqueue.job.RehydrateTemplateJob r8 = (com.obwhatsapp.jobqueue.job.RehydrateTemplateJob) r8     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "RehydrateTemplateJob/onAdded/info hsm rehydrate job added, loggableParam="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r8.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r0 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x0583:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r9 = r10.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r9 = (org.whispersystems.jobqueue.requirements.Requirement) r9     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r9 instanceof com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x05bc
            com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement r9 = (com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement) r9     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.UserJid r5 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            X.0uP r4 = r9.A00     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.UserJid r0 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            X.1Vq r0 = r4.A00(r0)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0583
            java.lang.String r4 = r9.jid     // Catch:{ IOException -> 0x0896 }
            java.util.concurrent.ConcurrentHashMap r0 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0583
            if (r5 == 0) goto L_0x0583
            X.0xb r4 = r8.A04     // Catch:{ IOException -> 0x0896 }
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.obwhatsapp.jobqueue.job.GetVNameCertificateJob     // Catch:{ IOException -> 0x0896 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0896 }
            r4.A00(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0583
        L_0x05bc:
            boolean r0 = r9 instanceof com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0583
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r9 = (com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement) r9     // Catch:{ IOException -> 0x0896 }
            X.0yB r4 = r8.A05     // Catch:{ IOException -> 0x0896 }
            java.util.Locale[] r6 = r9.locales     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            X.197 r5 = r4.A03     // Catch:{ IOException -> 0x0896 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0896 }
            java.util.HashMap r4 = r4.A04     // Catch:{ all -> 0x0890 }
            android.util.Pair r0 = android.util.Pair.create(r6, r0)     // Catch:{ all -> 0x0890 }
            r4.remove(r0)     // Catch:{ all -> 0x0890 }
            monitor-exit(r5)     // Catch:{ all -> 0x0890 }
            boolean r0 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0583
            java.util.Locale[] r5 = r8.locales     // Catch:{ IOException -> 0x0896 }
            X.AnonymousClass00B.A0J(r5)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.elementName     // Catch:{ IOException -> 0x0896 }
            boolean r0 = com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob.A00(r4, r0, r5)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x0583
            X.0xb r7 = r8.A04     // Catch:{ IOException -> 0x0896 }
            java.util.Locale[] r6 = r9.locales     // Catch:{ IOException -> 0x0896 }
            java.lang.String r5 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r9.elementName     // Catch:{ IOException -> 0x0896 }
            com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob r0 = new com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob     // Catch:{ IOException -> 0x0896 }
            r0.<init>(r5, r4, r6)     // Catch:{ IOException -> 0x0896 }
            r7.A00(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0583
        L_0x05fb:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.RehydrateHsmJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0694
            r8 = r3
            com.obwhatsapp.jobqueue.job.RehydrateHsmJob r8 = (com.obwhatsapp.jobqueue.job.RehydrateHsmJob) r8     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "RehydrateHsmJob/onRun/info: job added"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r8.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r0 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x061f:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r9 = r10.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r9 = (org.whispersystems.jobqueue.requirements.Requirement) r9     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r9 instanceof com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0658
            com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement r9 = (com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement) r9     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.UserJid r5 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            X.0uP r4 = r9.A00     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.UserJid r0 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            X.1Vq r0 = r4.A00(r0)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x061f
            java.lang.String r4 = r9.jid     // Catch:{ IOException -> 0x0896 }
            java.util.concurrent.ConcurrentHashMap r0 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x061f
            if (r5 == 0) goto L_0x061f
            X.0xb r4 = r8.A02     // Catch:{ IOException -> 0x0896 }
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.obwhatsapp.jobqueue.job.GetVNameCertificateJob     // Catch:{ IOException -> 0x0896 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0896 }
            r4.A00(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x061f
        L_0x0658:
            boolean r0 = r9 instanceof com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x061f
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r9 = (com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement) r9     // Catch:{ IOException -> 0x0896 }
            X.0yB r4 = r8.A03     // Catch:{ IOException -> 0x0896 }
            java.util.Locale[] r6 = r9.locales     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            X.197 r5 = r4.A03     // Catch:{ IOException -> 0x0896 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0896 }
            java.util.HashMap r4 = r4.A04     // Catch:{ all -> 0x0893 }
            android.util.Pair r0 = android.util.Pair.create(r6, r0)     // Catch:{ all -> 0x0893 }
            r4.remove(r0)     // Catch:{ all -> 0x0893 }
            monitor-exit(r5)     // Catch:{ all -> 0x0893 }
            boolean r0 = r9.A00()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x061f
            java.util.Locale[] r5 = r8.locales     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r9.elementName     // Catch:{ IOException -> 0x0896 }
            boolean r0 = com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob.A00(r4, r0, r5)     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x061f
            X.0xb r7 = r8.A02     // Catch:{ IOException -> 0x0896 }
            java.util.Locale[] r6 = r9.locales     // Catch:{ IOException -> 0x0896 }
            java.lang.String r5 = r9.namespace     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r9.elementName     // Catch:{ IOException -> 0x0896 }
            com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob r0 = new com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob     // Catch:{ IOException -> 0x0896 }
            r0.<init>(r5, r4, r6)     // Catch:{ IOException -> 0x0896 }
            r7.A00(r0)     // Catch:{ IOException -> 0x0896 }
            goto L_0x061f
        L_0x0694:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.ReceiptProcessingJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x06a8
            r4 = r3
            com.obwhatsapp.jobqueue.job.ReceiptProcessingJob r4 = (com.obwhatsapp.jobqueue.job.ReceiptProcessingJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "ReceiptProcessingJob/onAdded "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x06a8:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x06bc
            r4 = r3
            com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r4 = (com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "ReceiptMultiTargetProcessingJob/onAdded "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x06bc:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.GetVNameCertificateJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0710
            r8 = r3
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r8 = (com.obwhatsapp.jobqueue.job.GetVNameCertificateJob) r8     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "get vname certificate job added"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r8.A04()     // Catch:{ IOException -> 0x0896 }
            r4.append(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0896 }
            java.util.concurrent.ConcurrentHashMap r5 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r8.jid     // Catch:{ IOException -> 0x0896 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0896 }
            r5.put(r4, r0)     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r0 = r0.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x06e9:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r4 = r7.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r4 = (org.whispersystems.jobqueue.requirements.Requirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x06e9
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r4 = (com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement) r4     // Catch:{ IOException -> 0x0896 }
            boolean r0 = r4.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x06e9
            X.1HD r6 = r8.A00     // Catch:{ IOException -> 0x0896 }
            r0 = 1
            com.whatsapp.jid.DeviceJid[] r5 = new com.whatsapp.jid.DeviceJid[r0]     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid r0 = r4.A01     // Catch:{ IOException -> 0x0896 }
            r4 = 0
            r5[r4] = r0     // Catch:{ IOException -> 0x0896 }
            r0 = 2
            r6.A04(r5, r0, r4)     // Catch:{ IOException -> 0x0896 }
            goto L_0x06e9
        L_0x0710:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x0728
            r4 = r3
            com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob r4 = (com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "get hsm message pack job added"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x0728:
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.GenerateTcTokenJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob     // Catch:{ IOException -> 0x0896 }
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r3 instanceof com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            r4 = r3
            com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob r4 = (com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob) r4     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = "bulk get pre key job added"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0896 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0896 }
            java.lang.String r0 = r4.A04()     // Catch:{ IOException -> 0x0896 }
            goto L_0x02c1
        L_0x0744:
            X.1HD r6 = r6.A01     // Catch:{ IOException -> 0x0896 }
            r5 = 0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r5]     // Catch:{ IOException -> 0x0896 }
            java.lang.Object[] r4 = r7.toArray(r0)     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid[] r4 = (com.whatsapp.jid.DeviceJid[]) r4     // Catch:{ IOException -> 0x0896 }
            r0 = 4
            r6.A04(r4, r0, r5)     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a3
        L_0x0755:
            boolean r4 = r0.A07()     // Catch:{ IOException -> 0x0896 }
            r7 = 1
            if (r4 == 0) goto L_0x075f
            r15 = 11
            goto L_0x0766
        L_0x075f:
            int r4 = r0.retryCount     // Catch:{ IOException -> 0x0896 }
            r15 = 1
            if (r4 <= 0) goto L_0x0766
            r15 = 12
        L_0x0766:
            r6 = 0
            r0.A0k = r7     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.JobParameters r4 = r0.parameters     // Catch:{ IOException -> 0x0896 }
            java.util.List r4 = r4.requirements     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x0771:
            boolean r4 = r12.hasNext()     // Catch:{ IOException -> 0x0896 }
            r9 = 0
            if (r4 == 0) goto L_0x083e
            java.lang.Object r8 = r12.next()     // Catch:{ IOException -> 0x0896 }
            org.whispersystems.jobqueue.requirements.Requirement r8 = (org.whispersystems.jobqueue.requirements.Requirement) r8     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x078d
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r8 = (com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement) r8     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r8.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            com.whatsapp.jid.DeviceJid r6 = r8.A01     // Catch:{ IOException -> 0x0896 }
            goto L_0x0771
        L_0x078d:
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x079c
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r8 = (com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r8     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r8.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            com.whatsapp.jid.DeviceJid r6 = r8.A01     // Catch:{ IOException -> 0x0896 }
            goto L_0x0771
        L_0x079c:
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x0810
            com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r8 = (com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement) r8     // Catch:{ IOException -> 0x0896 }
            java.util.List r4 = r8.A00()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x07d7
            java.util.Set r10 = java.util.Collections.emptySet()     // Catch:{ IOException -> 0x0896 }
        L_0x07ac:
            boolean r4 = r10.isEmpty()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            com.whatsapp.jid.DeviceJid[] r4 = new com.whatsapp.jid.DeviceJid[r9]     // Catch:{ IOException -> 0x0896 }
            java.lang.Object[] r14 = r10.toArray(r4)     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid[] r14 = (com.whatsapp.jid.DeviceJid[]) r14     // Catch:{ IOException -> 0x0896 }
            r0.A0j = r7     // Catch:{ IOException -> 0x0896 }
            r0.A0k = r9     // Catch:{ IOException -> 0x0896 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x0896 }
            r0.A04 = r4     // Catch:{ IOException -> 0x0896 }
            int r9 = r10.size()     // Catch:{ IOException -> 0x0896 }
            r0.A01 = r9     // Catch:{ IOException -> 0x0896 }
            X.1HD r13 = r0.A0A     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x07ff
            X.0rv r5 = r8.A04     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r5 instanceof X.C16060sN     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x07fb
            goto L_0x07fa
        L_0x07d7:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x0896 }
            r10.<init>()     // Catch:{ IOException -> 0x0896 }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ IOException -> 0x0896 }
        L_0x07e0:
            boolean r4 = r11.hasNext()     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x07ac
            java.lang.Object r5 = r11.next()     // Catch:{ IOException -> 0x0896 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ IOException -> 0x0896 }
            X.11s r4 = r8.A01     // Catch:{ IOException -> 0x0896 }
            java.util.Set r4 = r4.A0N(r5)     // Catch:{ IOException -> 0x0896 }
            java.util.List r4 = X.C28851Ya.A04(r4)     // Catch:{ IOException -> 0x0896 }
            r10.addAll(r4)     // Catch:{ IOException -> 0x0896 }
            goto L_0x07e0
        L_0x07fa:
            r5 = 0
        L_0x07fb:
            X.AnonymousClass00B.A06(r5)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0801
        L_0x07ff:
            X.0rv r5 = r8.A04     // Catch:{ IOException -> 0x0896 }
        L_0x0801:
            int r16 = X.C18020w1.A04(r5)     // Catch:{ IOException -> 0x0896 }
            int r17 = X.C18020w1.A00(r9)     // Catch:{ IOException -> 0x0896 }
            r18 = 0
            r13.A03(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0896 }
            goto L_0x0771
        L_0x0810:
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x0823
            com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r8 = (com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement) r8     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r8.AJT()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            X.0yQ r4 = r0.A0W     // Catch:{ IOException -> 0x0896 }
            r4.A0b()     // Catch:{ IOException -> 0x0896 }
            goto L_0x0771
        L_0x0823:
            boolean r4 = r8 instanceof com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x0771
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r8 = (com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement) r8     // Catch:{ IOException -> 0x0896 }
            X.0tK r4 = r8.A00     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r4.A08()     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            r0.A0l = r7     // Catch:{ IOException -> 0x0896 }
            int r4 = r0.retryCount     // Catch:{ IOException -> 0x0896 }
            if (r4 != 0) goto L_0x0771
            X.1A4 r4 = r0.A0g     // Catch:{ IOException -> 0x0896 }
            r4.A01()     // Catch:{ IOException -> 0x0896 }
            goto L_0x0771
        L_0x083e:
            if (r6 == 0) goto L_0x085b
            r0.A0j = r7     // Catch:{ IOException -> 0x0896 }
            r0.A0k = r9     // Catch:{ IOException -> 0x0896 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x0896 }
            r0.A04 = r4     // Catch:{ IOException -> 0x0896 }
            X.1HD r13 = r0.A0A     // Catch:{ IOException -> 0x0896 }
            com.whatsapp.jid.DeviceJid[] r14 = new com.whatsapp.jid.DeviceJid[r7]     // Catch:{ IOException -> 0x0896 }
            r14[r9] = r6     // Catch:{ IOException -> 0x0896 }
            int r16 = X.C18020w1.A04(r6)     // Catch:{ IOException -> 0x0896 }
            r17 = 0
            r18 = 0
            r13.A03(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0896 }
        L_0x085b:
            X.1HD r4 = r0.A0A     // Catch:{ IOException -> 0x0896 }
            r4.A00()     // Catch:{ IOException -> 0x0896 }
            boolean r4 = r0.A0j     // Catch:{ IOException -> 0x0896 }
            if (r4 == 0) goto L_0x02a3
            X.0w1 r8 = r0.A09     // Catch:{ IOException -> 0x0896 }
            java.lang.String r4 = r0.id     // Catch:{ IOException -> 0x0896 }
            int r7 = r4.hashCode()     // Catch:{ IOException -> 0x0896 }
            int r6 = r0.messageType     // Catch:{ IOException -> 0x0896 }
            r5 = 8
            boolean r0 = r8.A0M     // Catch:{ IOException -> 0x0896 }
            if (r0 == 0) goto L_0x02a3
            X.18E r4 = r8.A0E     // Catch:{ IOException -> 0x0896 }
            r0 = -1
            r4.A05(r7, r5, r0, r6)     // Catch:{ IOException -> 0x0896 }
            goto L_0x02a3
        L_0x087c:
            java.util.LinkedList r0 = r4.A01     // Catch:{ all -> 0x088d }
            r0.add(r3)     // Catch:{ all -> 0x088d }
            r4.A01(r3)     // Catch:{ all -> 0x088d }
            X.1Xv r0 = r4.A05     // Catch:{ all -> 0x088d }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x088d }
            r0.open()     // Catch:{ all -> 0x088d }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0896 }
            return
        L_0x088d:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0896 }
        L_0x088f:
            throw r1     // Catch:{ IOException -> 0x0896 }
        L_0x0890:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0890 }
            goto L_0x0895
        L_0x0893:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0893 }
        L_0x0895:
            throw r0     // Catch:{ IOException -> 0x0896 }
        L_0x0896:
            r1 = move-exception
            java.lang.String r0 = "JobManager"
            android.util.Log.w(r0, r1)
            java.lang.Object r0 = r2.A01
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0
            r0.A00()
            return
        L_0x08a4:
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x08bd }
            java.lang.Object r1 = r2.A00     // Catch:{ Exception -> 0x08bd }
            org.wawebrtc.MediaCodecVideoEncoder r1 = (org.wawebrtc.MediaCodecVideoEncoder) r1     // Catch:{ Exception -> 0x08bd }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x08bd }
            r0.stop()     // Catch:{ Exception -> 0x08bd }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x08bd }
            r0.release()     // Catch:{ Exception -> 0x08bd }
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x08bd }
            goto L_0x08c3
        L_0x08bd:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x08c3:
            java.lang.Object r0 = r2.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x08cb:
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            goto L_0x0c2e
        L_0x08d2:
            java.lang.Object r1 = r2.A01
            X.1Z5 r1 = (X.AnonymousClass1Z5) r1
            java.lang.Object r0 = r2.A00
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0
            r1.A00(r0)
            return
        L_0x08de:
            java.lang.Object r0 = r2.A00
            X.1Jj r0 = (X.C25331Jj) r0
            java.lang.Object r2 = r2.A01
            X.1Z6 r2 = (X.AnonymousClass1Z6) r2
            X.1Jd r1 = r0.A02
            java.lang.String r0 = "extension_message_response"
            X.1Z7 r2 = r1.A00(r2, r0)
            X.1Z8 r1 = X.AnonymousClass1Z8.A00
            java.lang.String r0 = "error"
            goto L_0x0908
        L_0x08f3:
            java.lang.Object r0 = r2.A00
            X.1Jj r0 = (X.C25331Jj) r0
            java.lang.Object r2 = r2.A01
            X.1Z6 r2 = (X.AnonymousClass1Z6) r2
            X.1Jd r1 = r0.A02
            java.lang.String r0 = "extension_message_response"
            X.1Z7 r2 = r1.A00(r2, r0)
            X.1Z8 r1 = X.AnonymousClass1Z8.A00
            java.lang.String r0 = "success"
        L_0x0908:
            r2.A02(r0, r1)
            return
        L_0x090c:
            java.lang.Object r1 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            r1.A3t(r0)
            return
        L_0x0918:
            java.lang.Object r5 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.01Y r3 = r5.A0k
            r0 = 2
            com.facebook.redex.IDxCCallbackShape66S0200000_2_I1 r2 = new com.facebook.redex.IDxCCallbackShape66S0200000_2_I1
            r2.<init>(r5, r0, r4)
            r1 = 1
            X.1ZJ r0 = new X.1ZJ
            r0.<init>(r4, r1)
            r3.A0F(r5, r2, r0, r1)
            return
        L_0x0932:
            java.lang.Object r7 = r2.A00
            X.1ZK r7 = (X.AnonymousClass1ZK) r7
            java.lang.Object r10 = r2.A01
            android.view.View r10 = (android.view.View) r10
            android.animation.AnimatorSet r0 = r7.A0E
            if (r0 != 0) goto L_0x09a4
            r9 = 2
            float[] r3 = new float[r9]
            int r2 = r10.getWidth()
            X.013 r4 = r7.A11
            boolean r0 = r4.A0T()
            r1 = r0 ^ 1
            r0 = -2
            if (r1 == 0) goto L_0x0951
            r0 = 2
        L_0x0951:
            int r2 = r2 * r0
            float r0 = (float) r2
            r11 = 0
            r3[r11] = r0
            int r2 = r10.getWidth()
            boolean r0 = r4.A0T()
            r1 = r0 ^ 1
            r8 = -1
            r6 = 1
            r0 = 1
            if (r1 == 0) goto L_0x0966
            r0 = -1
        L_0x0966:
            int r2 = r2 * r0
            float r0 = (float) r2
            r3[r6] = r0
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r10, r0, r3)
            r3 = 1600(0x640, double:7.905E-321)
            r5.setDuration(r3)
            r5.setRepeatCount(r8)
            float[] r1 = new float[r9]
            r1 = {1065353216, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r10, r0, r1)
            r2.setDuration(r3)
            r2.setRepeatCount(r8)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r7.A0E = r1
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.AnimatorSet r1 = r7.A0E
            android.animation.Animator[] r0 = new android.animation.Animator[r9]
            r0[r11] = r5
            r0[r6] = r2
            r1.playTogether(r0)
        L_0x09a4:
            android.animation.AnimatorSet r0 = r7.A0E
            r0.start()
            return
        L_0x09aa:
            java.lang.Object r0 = r2.A00
            X.1ZL r0 = (X.AnonymousClass1ZL) r0
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r3 = r0.A0F
            java.util.List r0 = r3.A0K
            boolean r0 = r0.isEmpty()
            X.AnonymousClass00B.A0F(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x09c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x09d1
            java.lang.Object r1 = r2.next()
            java.util.LinkedList r0 = r3.A0I
            r0.add(r1)
            goto L_0x09c1
        L_0x09d1:
            r3.invalidate()
            return
        L_0x09d5:
            java.lang.Object r4 = r2.A00
            X.1ZL r4 = (X.AnonymousClass1ZL) r4
            java.lang.Object r0 = r2.A01
            java.io.File r0 = (java.io.File) r0
            java.util.List r3 = X.AnonymousClass1ZO.A01(r0)
            X.0pt r2 = r4.A0E
            r1 = 28
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x09ee:
            java.lang.Object r1 = r2.A00
            X.1ZP r1 = (X.AnonymousClass1ZP) r1
            java.lang.Object r0 = r2.A01
            X.1ZR r0 = (X.AnonymousClass1ZR) r0
            X.AnonymousClass1ZP.A01(r0, r1)
            return
        L_0x09fa:
            java.lang.Object r1 = r2.A00
            X.1ZP r1 = (X.AnonymousClass1ZP) r1
            java.lang.Object r0 = r2.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            ((X.C46202Cw) r1.A0C).setAuthorImage(r0)
            return
        L_0x0a06:
            java.lang.Object r1 = r2.A00
            X.1Bk r1 = (X.C23291Bk) r1
            java.lang.Object r0 = r2.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.Acl(r0)
            return
        L_0x0a12:
            java.lang.Object r3 = r2.A00
            X.1Xx r3 = (X.C28831Xx) r3
            java.lang.Object r0 = r2.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch:{ all -> 0x0a2c }
            monitor-enter(r3)
            int r0 = r3.A00     // Catch:{ all -> 0x0a29 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0a29 }
            r3.A00()     // Catch:{ all -> 0x0a29 }
            monitor-exit(r3)     // Catch:{ all -> 0x0a29 }
            return
        L_0x0a29:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0a29 }
            throw r1
        L_0x0a2c:
            r1 = move-exception
            monitor-enter(r3)
            int r0 = r3.A00     // Catch:{ all -> 0x0a39 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0a39 }
            r3.A00()     // Catch:{ all -> 0x0a39 }
        L_0x0a37:
            monitor-exit(r3)     // Catch:{ all -> 0x0a39 }
            goto L_0x0a3b
        L_0x0a39:
            r1 = move-exception
            goto L_0x0a37
        L_0x0a3b:
            throw r1
        L_0x0a3c:
            java.lang.Object r4 = r2.A01
            X.1GX r4 = (X.AnonymousClass1GX) r4
            monitor-enter(r4)
            java.util.Map r3 = r4.A0B     // Catch:{ all -> 0x0a4e }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0a4e }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x0a4e }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0a4e }
            r3.put(r1, r0)     // Catch:{ all -> 0x0a4e }
            monitor-exit(r4)     // Catch:{ all -> 0x0a4e }
            return
        L_0x0a4e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0a4e }
            throw r0
        L_0x0a51:
            java.lang.Object r3 = r2.A00
            com.whatsapp.util.MarqueeToolbar r3 = (com.whatsapp.util.MarqueeToolbar) r3
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r3.A00 = r0
            return
        L_0x0a61:
            java.lang.Object r5 = r2.A00
            com.obwhatsapp.support.faq.SearchFAQ r5 = (com.obwhatsapp.support.faq.SearchFAQ) r5
            java.lang.Object r4 = r2.A01
            X.0t7 r4 = (X.C16470t7) r4
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            java.util.HashSet r0 = r5.A0B
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "search-faq/post-event count:%d read:%d"
            java.lang.String.format(r3, r0, r2)
            X.0t9 r0 = r5.A02
            r0.A05(r4)
            return
        L_0x0a90:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.support.faq.SearchFAQ r3 = (com.obwhatsapp.support.faq.SearchFAQ) r3
            java.lang.Object r2 = r2.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r1 = "com.obwhatsapp.support.faq.SearchFAQ.showContactUs"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto L_0x0abf
            r0 = 0
            boolean r0 = r2.getBooleanExtra(r1, r0)
            if (r0 == 0) goto L_0x0abf
            X.1KO r2 = r3.A01
            X.15W r0 = r3.A03
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A06
            r4 = 0
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r5 = r4
            android.content.Intent r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3.startActivity(r0)
            return
        L_0x0abf:
            java.lang.String r0 = r3.A06
            boolean r0 = X.AnonymousClass1Y4.A00(r0)
            if (r0 == 0) goto L_0x0aee
            X.0s5 r0 = r3.A06
            X.1Y5 r1 = X.C15910s6.A2A
            java.lang.String r0 = r0.A03(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0aee
            X.0s5 r0 = r3.A06
            java.lang.String r8 = r0.A03(r1)
        L_0x0adb:
            X.1BY r2 = r3.A04
            java.lang.String r6 = r3.A06
            java.lang.String r7 = r3.A07
            java.lang.String r9 = r3.A08
            java.util.ArrayList r10 = r3.A09
            java.util.List r11 = r3.A0C
            r12 = 1
            r4 = 0
            r5 = r4
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0aee:
            r8 = 0
            goto L_0x0adb
        L_0x0af0:
            java.lang.Object r7 = r2.A00
            X.1Y6 r7 = (X.AnonymousClass1Y6) r7
            java.lang.Object r1 = r2.A01
            X.0sH r1 = (X.C16010sH) r1
            X.0pt r6 = r7.A00
            X.0tz r0 = r7.A02
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131891208(0x7f121408, float:1.941713E38)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.0sP r0 = r7.A01
            java.lang.String r1 = r0.A08(r1)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = r5.getString(r4, r2)
            r6.A0H(r0, r3)
            return
        L_0x0b19:
            java.lang.Object r1 = r2.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r2.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            r0 = 2131362267(0x7f0a01db, float:1.834431E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.setChecked(r0)
            return
        L_0x0b32:
            java.lang.Object r4 = r2.A00
            com.obwhatsapp.support.DescribeProblemActivity r4 = (com.obwhatsapp.support.DescribeProblemActivity) r4
            java.lang.Object r0 = r2.A01
            X.0pN r0 = (X.C14550pN) r0
            X.1Ms r1 = r4.A0A
            android.widget.EditText r2 = r4.A02
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r19 = r2.trim()
            androidx.appcompat.widget.AppCompatCheckBox r2 = r4.A03
            if (r2 == 0) goto L_0x0b55
            boolean r3 = r2.isChecked()
            r2 = 1
            if (r3 != 0) goto L_0x0b56
        L_0x0b55:
            r2 = 0
        L_0x0b56:
            r11 = 0
            if (r2 == 0) goto L_0x0b88
            java.lang.String r7 = r4.A0M
            java.lang.String r8 = r4.A0N
            X.1YB r2 = r4.A0D
            if (r2 == 0) goto L_0x0b65
            java.util.List r11 = r2.AEN()
        L_0x0b65:
            r6 = 0
            X.1Bb r3 = r4.A0I
            X.0pf r2 = r4.A06
            long r13 = r2.A01()
            X.0pf r2 = r4.A06
            long r15 = r2.A02()
            java.lang.String r10 = android.os.Environment.getExternalStorageState()
            X.1BY r2 = r4.A0F
            android.util.Pair r5 = r2.A00()
            r17 = 1
            r12 = r6
            r18 = 1
            r9 = r6
            java.lang.String r11 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18)
        L_0x0b88:
            r21 = 1
            X.1YC r2 = new X.1YC
            r2.<init>(r0, r4)
            r22 = 1
            r17 = r1
            r18 = r2
            r20 = r11
            r17.A00(r18, r19, r20, r21, r22)
            return
        L_0x0b9b:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.storage.StorageUsageGalleryActivity r3 = (com.obwhatsapp.storage.StorageUsageGalleryActivity) r3
            java.lang.Object r1 = r2.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r0 = "storage-usage-gallery-activity/load duplicate messages/timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A35()
            X.1YH r0 = new X.1YH
            r0.<init>(r3)
            com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment r2 = new com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment
            r2.<init>()
            r2.A04 = r1
            r2.A03 = r1
            r2.A01 = r0
            X.02C r1 = r3.AGM()
            r0 = 0
            r2.A1G(r1, r0)
            return
        L_0x0bc5:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.storage.StorageUsageActivity r3 = (com.obwhatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r2 = r2.A01
            X.1YI r2 = (X.AnonymousClass1YI) r2
            java.lang.String r0 = "storage-usage-activity/fetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1YJ r1 = r3.A0G
            r1.A02 = r2
            r0 = 1
            int r0 = r1.A0G(r0)
            r1.A02(r0)
            r0 = 0
            r3.A36(r0)
            return
        L_0x0be4:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.storage.StorageUsageActivity r3 = (com.obwhatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r1 = r2.A01
            X.1YK r1 = (X.AnonymousClass1YK) r1
            java.lang.String r0 = "storage-usage-activity/fetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r3.A36(r0)
            X.1YJ r0 = r3.A0G
            r0.A01 = r1
            goto L_0x0c11
        L_0x0bfb:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.storage.StorageUsageActivity r3 = (com.obwhatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r1 = r2.A01
            X.1YK r1 = (X.AnonymousClass1YK) r1
            java.lang.String r0 = "storage-usage-activity/fetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r3.A36(r0)
            X.1YJ r0 = r3.A0G
            r0.A00 = r1
        L_0x0c11:
            r0.A0H()
            return
        L_0x0c15:
            java.lang.Object r0 = r2.A00
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0c31
            return
        L_0x0c24:
            java.lang.Object r0 = r2.A00
            X.1Uf r0 = (X.C28061Uf) r0
            java.lang.Object r1 = r2.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            int r0 = r0.A00
        L_0x0c2e:
            android.os.Process.setThreadPriority(r0)
        L_0x0c31:
            r1.run()
            return
        L_0x0c35:
            java.lang.Object r0 = r2.A00
            r20 = r0
            r0 = r20
            X.2Jq r0 = (X.C47602Jq) r0
            r20 = r0
            java.lang.Object r0 = r2.A01
            r19 = r0
            r0 = r19
            X.1pi r0 = (X.C37771pi) r0
            r19 = r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r9 = r0.A04
            java.lang.String r1 = r0.A0D
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1jm r12 = X.AnonymousClass1MK.A00(r0, r1, r9)
            r0 = r19
            java.util.List r10 = r0.A04
            java.lang.String r2 = r0.A0C
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1jm r13 = X.AnonymousClass1MK.A00(r1, r2, r10)
            r0 = r20
            X.0pt r2 = r0.A08
            r11 = 14
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r10 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r10.<init>(r0, r12, r13, r11)
            r2.A0K(r10)
            java.util.Iterator r18 = r9.iterator()
        L_0x0c95:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0d31
            java.lang.Object r17 = r18.next()
            r0 = r17
            X.1jm r0 = (X.C34151jm) r0
            r17 = r0
            if (r0 == 0) goto L_0x0c95
            X.1XO r0 = r0.A04
            if (r0 == 0) goto L_0x0c95
            X.1pj[] r13 = r0.A09
            if (r13 == 0) goto L_0x0c95
            r0 = r20
            X.4ai r14 = r0.A0A
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r12 = r13.length
            r11 = 0
        L_0x0cba:
            if (r11 >= r12) goto L_0x0cd4
            r15 = r13[r11]
            int r11 = r11 + 1
            java.util.HashMap r0 = r14.A00
            boolean r16 = r0.containsKey(r15)
            if (r16 == 0) goto L_0x0cba
            java.lang.Object r0 = r0.get(r15)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0cba
            r10.addAll(r0)
            goto L_0x0cba
        L_0x0cd4:
            boolean r0 = r10.contains(r1)
            if (r0 == 0) goto L_0x0cdf
            r0 = r17
            r7.add(r0)
        L_0x0cdf:
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0cef
            r0 = r17
            r4.add(r0)
        L_0x0cef:
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0cff
            r0 = r17
            r6.add(r0)
        L_0x0cff:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0d0f
            r0 = r17
            r5.add(r0)
        L_0x0d0f:
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0d1f
            r0 = r17
            r3.add(r0)
        L_0x0d1f:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0c95
            r0 = r17
            r8.add(r0)
            goto L_0x0c95
        L_0x0d31:
            r1 = 28
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r7, r0)
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r4, r0)
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r6, r0)
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r3, r0)
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r0.<init>(r1)
            java.util.Collections.sort(r8, r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0 = r20
            android.content.Context r10 = r0.A07
            r0 = 2131886397(0x7f12013d, float:1.9407372E38)
            java.lang.String r12 = r10.getString(r0)
            java.lang.String r11 = "id_all"
            r0 = r19
            X.1pi r9 = X.C47602Jq.A00(r0, r11, r12, r9)
            java.lang.String r0 = r9.A0F
            r1.put(r0, r9)
            r0 = 2131886402(0x7f120142, float:1.9407382E38)
            java.lang.String r11 = r10.getString(r0)
            java.lang.String r9 = "id_love"
            r0 = r19
            X.1pi r8 = X.C47602Jq.A00(r0, r9, r11, r8)
            java.lang.String r0 = r8.A0F
            r1.put(r0, r8)
            r0 = 2131886400(0x7f120140, float:1.9407378E38)
            java.lang.String r9 = r10.getString(r0)
            java.lang.String r8 = "id_haha"
            r0 = r19
            X.1pi r7 = X.C47602Jq.A00(r0, r8, r9, r7)
            java.lang.String r0 = r7.A0F
            r1.put(r0, r7)
            r0 = 2131886404(0x7f120144, float:1.9407386E38)
            java.lang.String r8 = r10.getString(r0)
            java.lang.String r7 = "id_sad"
            r0 = r19
            X.1pi r6 = X.C47602Jq.A00(r0, r7, r8, r6)
            java.lang.String r0 = r6.A0F
            r1.put(r0, r6)
            r0 = 2131886398(0x7f12013e, float:1.9407374E38)
            java.lang.String r7 = r10.getString(r0)
            java.lang.String r6 = "id_angry"
            r0 = r19
            X.1pi r5 = X.C47602Jq.A00(r0, r6, r7, r5)
            java.lang.String r0 = r5.A0F
            r1.put(r0, r5)
            r0 = 2131886403(0x7f120143, float:1.9407384E38)
            java.lang.String r6 = r10.getString(r0)
            java.lang.String r5 = "id_reaction"
            r0 = r19
            X.1pi r4 = X.C47602Jq.A00(r0, r5, r6, r4)
            java.lang.String r0 = r4.A0F
            r1.put(r0, r4)
            r0 = 2131886401(0x7f120141, float:1.940738E38)
            java.lang.String r5 = r10.getString(r0)
            java.lang.String r4 = "id_lifestyle"
            r0 = r19
            X.1pi r3 = X.C47602Jq.A00(r0, r4, r5, r3)
            java.lang.String r0 = r3.A0F
            r1.put(r0, r3)
            r4 = 1
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r3 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0 = r20
            r3.<init>(r0, r4, r1)
            r2.A0K(r3)
            return
        L_0x0e04:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Collection r0 = r5.A03
            java.util.Iterator r7 = r0.iterator()
        L_0x0e0f:
            boolean r0 = r7.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0e38
            java.lang.Object r1 = r7.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.0tY r1 = (X.C16730tY) r1
            java.lang.String r0 = r1.A05
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.String r1 = r1.A05
            if (r0 == 0) goto L_0x0e30
            int r0 = r0.intValue()
            int r2 = r0 + 1
        L_0x0e30:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.put(r1, r0)
            goto L_0x0e0f
        L_0x0e38:
            r13 = 0
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0e7e
            java.util.Collection r0 = r5.A03
        L_0x0e40:
            java.util.Iterator r8 = r0.iterator()
        L_0x0e44:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0e81
            java.lang.Object r7 = r8.next()
            X.0tZ r7 = (X.C16740tZ) r7
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0e44
            boolean r0 = r7.A0x
            if (r0 == 0) goto L_0x0e5c
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0e44
        L_0x0e5c:
            X.0tY r7 = (X.C16730tY) r7
            java.lang.String r2 = r7.A05
            java.lang.Object r1 = r3.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0e44
            int r0 = r1.intValue()
            if (r0 != r4) goto L_0x0e75
            r3.remove(r1)
            long r0 = r7.A01
            long r13 = r13 + r0
            goto L_0x0e44
        L_0x0e75:
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r2, r0)
            goto L_0x0e44
        L_0x0e7e:
            java.util.Collection r0 = r5.A04
            goto L_0x0e40
        L_0x0e81:
            int r10 = r6.size()
            r9.APX(r10, r11, r13)
            return
        L_0x0e89:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0eee }
            if (r0 == 0) goto L_0x0ec5
            java.lang.String r0 = "jid"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0eee }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0eee }
            X.0rv r7 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0eee }
            if (r7 == 0) goto L_0x0e89
            java.lang.String r0 = "conversation_size"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0eee }
            long r4 = r9.getLong(r0)     // Catch:{ all -> 0x0eee }
            java.lang.String r0 = "conversation_message_count"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0eee }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0eee }
            X.1Xf r1 = new X.1Xf     // Catch:{ all -> 0x0eee }
            r1.<init>()     // Catch:{ all -> 0x0eee }
            r1.A0G = r4     // Catch:{ all -> 0x0eee }
            r1.A06 = r0     // Catch:{ all -> 0x0eee }
            X.1Xg r0 = new X.1Xg     // Catch:{ all -> 0x0eee }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0eee }
            r8.add(r0)     // Catch:{ all -> 0x0eee }
            goto L_0x0e89
        L_0x0ec5:
            r9.close()
            r6.A0M = r8
            r1 = 0
            r0 = 0
            com.obwhatsapp.storage.StorageUsageActivity.A03(r6, r8, r1, r0)
            java.lang.String r0 = "storage-usage-activity/fetch chats/cache completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r0 = r6.A0M
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0ee7
            r1 = 18
            com.facebook.redex.RunnableRunnableShape20S0100000_I1_3 r0 = new com.facebook.redex.RunnableRunnableShape20S0100000_I1_3
            r0.<init>(r2, r1)
            r6.A37(r0)
        L_0x0ee7:
            X.1Hm r1 = r6.A0C
            r0 = 0
            r1.A02(r0, r3)
            return
        L_0x0eee:
            r0 = move-exception
            if (r9 == 0) goto L_0x0ef4
            r9.close()     // Catch:{ all -> 0x0ef4 }
        L_0x0ef4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape11S0200000_I0_9.run():void");
    }
}
