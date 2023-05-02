package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.RunnableTRunnableShape0S0100000_I0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0xU  reason: invalid class name and case insensitive filesystem */
public class C18930xU extends C18940xV implements C18950xW, C18960xX, C18970xY {
    public C28441Wc A00;
    public C28451Wd A01;
    public AnonymousClass25B A02 = null;
    public AnonymousClass1WC A03;
    public Runnable A04;
    public boolean A05;
    public final C16300so A06;
    public final C16040sK A07;
    public final C15900s5 A08;
    public final AnonymousClass1CS A09;
    public final C16600tK A0A;
    public final AnonymousClass19R A0B;
    public final AnonymousClass11Q A0C;
    public final C19540yb A0D;
    public final C23521Ch A0E;
    public final C23481Cd A0F;
    public final C23491Ce A0G;
    public final C23501Cf A0H;
    public final AnonymousClass1CY A0I;
    public final C23461Cb A0J;
    public final C23531Ci A0K;
    public final C23511Cg A0L;
    public final C33291iL A0M = new C33291iL(this);
    public final AnonymousClass19E A0N;
    public final C19360yJ A0O;
    public final AnonymousClass139 A0P;
    public final AnonymousClass1CZ A0Q;
    public final C23451Ca A0R;
    public final AnonymousClass19W A0S;
    public final C217515h A0T;
    public final AnonymousClass19I A0U;
    public final C16000sG A0V;
    public final C15800rs A0W;
    public final C222317d A0X;
    public final AnonymousClass11R A0Y;
    public final C16440t3 A0Z;
    public final C23471Cc A0a;
    public final AnonymousClass19K A0b;
    public final C19410yO A0c;
    public final AnonymousClass16Q A0d;
    public final AnonymousClass11P A0e;
    public final C20360zv A0f;
    public final AnonymousClass19J A0g;
    public final C14710pd A0h;
    public final C17190ug A0i;
    public final AnonymousClass16S A0j;
    public final C19830z4 A0k;
    public final AnonymousClass1CX A0l;
    public final AnonymousClass1WA A0m;
    public final C16320sq A0n;
    public final AnonymousClass1CW A0o;
    public final AnonymousClass11X A0p;

    public C18930xU(C16300so r4, C16040sK r5, C15900s5 r6, AnonymousClass1CS r7, C16600tK r8, AnonymousClass19R r9, AnonymousClass11Q r10, C19540yb r11, C23521Ch r12, C23481Cd r13, C23491Ce r14, C23501Cf r15, AnonymousClass1CY r16, C23461Cb r17, C23531Ci r18, C23511Cg r19, AnonymousClass19E r20, C19360yJ r21, AnonymousClass139 r22, AnonymousClass1CZ r23, C23451Ca r24, AnonymousClass19W r25, C217515h r26, AnonymousClass19I r27, C16000sG r28, C15800rs r29, C222317d r30, AnonymousClass11R r31, C16440t3 r32, C23471Cc r33, AnonymousClass19K r34, C19410yO r35, AnonymousClass16Q r36, AnonymousClass11P r37, C20360zv r38, AnonymousClass19J r39, C14710pd r40, C17190ug r41, AnonymousClass16S r42, C19830z4 r43, AnonymousClass1CX r44, C16320sq r45, AnonymousClass1CW r46, AnonymousClass11X r47) {
        this.A0Z = r32;
        this.A0h = r40;
        this.A06 = r4;
        this.A07 = r5;
        C16320sq r2 = r45;
        this.A0n = r2;
        this.A08 = r6;
        this.A0b = r34;
        this.A0o = r46;
        this.A0i = r41;
        this.A0V = r28;
        this.A0S = r25;
        this.A0T = r26;
        this.A0N = r20;
        this.A0p = r47;
        this.A0A = r8;
        this.A0j = r42;
        this.A0l = r44;
        this.A0I = r16;
        this.A0f = r38;
        this.A0Q = r23;
        this.A0W = r29;
        this.A09 = r7;
        this.A0R = r24;
        this.A0O = r21;
        this.A0e = r37;
        this.A0c = r35;
        this.A0J = r17;
        this.A0a = r33;
        this.A0P = r22;
        this.A0C = r10;
        this.A0F = r13;
        this.A0g = r39;
        this.A0d = r36;
        this.A0D = r11;
        this.A0G = r14;
        this.A0H = r15;
        this.A0L = r19;
        this.A0E = r12;
        this.A0X = r30;
        this.A0K = r18;
        this.A0U = r27;
        this.A0Y = r31;
        this.A0B = r9;
        this.A0k = r43;
        this.A0m = new AnonymousClass1WA(r2, false);
    }

    public static /* synthetic */ void A00(C18930xU r1, boolean z2) {
        synchronized (r1) {
            r1.A05 = false;
            if (z2) {
                r1.A0O();
            }
        }
    }

    public void A06(C16740tZ r4, int i2) {
        if (A0Z(1) && r4.A11.A00 != null) {
            if (i2 == -1 || i2 == 22) {
                this.A0m.execute(new RunnableRunnableShape4S0200000_I0_2(this, 22, r4));
            }
        }
    }

    public final Pair A09(Collection collection, Collection collection2) {
        Class<UserJid> cls = UserJid.class;
        AnonymousClass1CW r2 = this.A0o;
        List A082 = C16030sJ.A08(cls, r2.A04("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        List A083 = C16030sJ.A08(cls, r2.A04("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A082);
        collection2.addAll(A083);
        HashSet hashSet = new HashSet();
        C16030sJ.A0E(collection, hashSet);
        HashSet hashSet2 = new HashSet();
        C16030sJ.A0E(collection2, hashSet2);
        return new Pair(hashSet, hashSet2);
    }

    public final synchronized C28451Wd A0A() {
        C28451Wd r15;
        synchronized (this) {
            r15 = this.A01;
            if (r15 == null) {
                C16440t3 r21 = this.A0Z;
                C14710pd r20 = this.A0h;
                C16300so r19 = this.A06;
                C16040sK r18 = this.A07;
                AnonymousClass19K r17 = this.A0b;
                AnonymousClass19W r16 = this.A0S;
                C217515h r14 = this.A0T;
                AnonymousClass19E r13 = this.A0N;
                C19830z4 r12 = this.A0k;
                C20360zv r11 = this.A0f;
                C23451Ca r10 = this.A0R;
                AnonymousClass11P r9 = this.A0e;
                C19410yO r8 = this.A0c;
                C23471Cc r6 = this.A0a;
                AnonymousClass139 r5 = this.A0P;
                C23481Cd r4 = this.A0F;
                C23501Cf r3 = this.A0H;
                AnonymousClass11R r2 = this.A0Y;
                C40761ue r1 = new C40761ue(new Random());
                C16300so r162 = r19;
                C16040sK r172 = r18;
                C23481Cd r182 = r4;
                C23501Cf r192 = r3;
                AnonymousClass25D r202 = new AnonymousClass25D(this);
                AnonymousClass19E r212 = r13;
                r15 = new C28451Wd(r162, r172, r182, r192, r202, r212, r5, r10, r16, r14, r2, r21, r6, r17, r8, r9, r11, r20, r12, r1);
                this.A01 = r15;
            }
        }
        return r15;
    }

    public Set A0B(C15830rv r11, long j2, boolean z2) {
        C33611ir r0 = (C33611ir) this.A0T.A02("mute");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A0I(Collections.singletonList(new C37121oe((AnonymousClass1WK) null, r11, (String) null, j2, r0.A00.A00(), z2, false)));
    }

    public Set A0C(C15830rv r11, boolean z2) {
        AnonymousClass19F r2;
        C217515h r1 = this.A0T;
        C33621is r5 = (C33621is) r1.A02("archive");
        if (r5 != null) {
            C16040sK r0 = this.A07;
            r0.A0B();
            if (r0.A05 != null && A0X()) {
                ArrayList arrayList = new ArrayList();
                C15830rv r6 = r11;
                boolean z3 = z2;
                if (z2 && (r2 = (AnonymousClass19F) r1.A02("pin_v1")) != null) {
                    r2.A01.A06(1);
                    arrayList.add(new C37211on(r11, r2.A03.A00(), false));
                }
                arrayList.add(new C37191ol(r5.A00.A04(r11, false), r6, r5.A04.A00(), z3));
                return A0I(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A0D(C15830rv r11, boolean z2) {
        C33621is r1;
        C217515h r12 = this.A0T;
        AnonymousClass19F r2 = (AnonymousClass19F) r12.A02("pin_v1");
        if (r2 != null) {
            C16040sK r0 = this.A07;
            r0.A0B();
            if (r0.A05 != null && A0X()) {
                ArrayList arrayList = new ArrayList();
                C15830rv r6 = r11;
                if (z2 && (r1 = (C33621is) r12.A02("archive")) != null) {
                    arrayList.add(new C37191ol(r1.A00.A04(r11, false), r6, r1.A04.A00(), false));
                }
                r2.A01.A06(1);
                arrayList.add(new C37211on(r11, r2.A03.A00(), z2));
                return A0I(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A0E(C15830rv r11, boolean z2) {
        C217515h r3 = this.A0T;
        C33641iu r2 = (C33641iu) r3.A02("deleteChat");
        if (r2 == null || !A0X()) {
            return Collections.emptySet();
        }
        C15830rv r4 = r11;
        Set A0D2 = A0D(r11, false);
        synchronized (r3) {
            r3.A03.A0H(A0D2);
        }
        r2.A02.A06(3);
        return A0I(Collections.singletonList(new C36811o9((AnonymousClass1WK) null, r2.A01.A03(r11), r4, (String) null, r2.A03.A00(), z2, true)));
    }

    public Set A0F(C15830rv r10, boolean z2) {
        C33651iv r1 = (C33651iv) this.A0T.A02("markChatAsRead");
        if (r1 == null) {
            return Collections.emptySet();
        }
        long A002 = r1.A02.A00();
        return A0I(Collections.singletonList(new C37011oT((AnonymousClass1WK) null, r1.A00.A04(r10, false), r10, (String) null, A002, z2, false)));
    }

    public Set A0G(C15830rv r11, boolean z2, boolean z3) {
        C33681iy r2 = (C33681iy) this.A0T.A02("clearChat");
        if (r2 != null) {
            C16040sK r0 = this.A07;
            r0.A0B();
            if (r0.A05 != null) {
                AnonymousClass19E r1 = r2.A02;
                int i2 = 5;
                boolean z4 = z2;
                if (z2) {
                    i2 = 4;
                }
                r1.A06(i2);
                long A002 = r2.A03.A00();
                return A0I(Collections.singletonList(new C37231op((AnonymousClass1WK) null, r2.A01.A03(r11), r11, (String) null, A002, z4, z3, true)));
            }
        }
        return Collections.emptySet();
    }

    public Set A0H(C34151jm r20, long j2, boolean z2) {
        List singletonList;
        C217515h r0 = this.A0T;
        AnonymousClass1j1 r2 = (AnonymousClass1j1) r0.A02("favoriteSticker");
        if (r2 != null && A0X()) {
            C34151jm r3 = r20;
            if (!r3.A0H) {
                if (TextUtils.isEmpty(r3.A0D)) {
                    Log.e("FavoriteStickerHandler/empty sticker fileHash");
                    singletonList = Collections.emptyList();
                } else {
                    int A002 = r2.A01.A00();
                    String str = r3.A0D;
                    AnonymousClass00B.A06(str);
                    singletonList = Collections.singletonList(new C36931oL(new C36921oK(str, r3.A0G, r3.A08, r3.A0B, r3.A0C, r3.A06, r3.A03, r3.A02, (long) r3.A00), (AnonymousClass1WK) null, (String) null, A002, j2, z2, false));
                }
                return r0.A04(singletonList);
            }
        }
        return Collections.emptySet();
    }

    public final Set A0I(Collection collection) {
        return !A0X() ? Collections.emptySet() : this.A0T.A04(collection);
    }

    public Set A0J(Collection collection, boolean z2) {
        C33631it r1 = (C33631it) this.A0T.A02("star");
        if (r1 != null) {
            C16040sK r0 = this.A07;
            r0.A0B();
            if (r0.A05 != null) {
                long A002 = r1.A02.A00();
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C16740tZ r2 = (C16740tZ) it.next();
                    C28381Vw r8 = r2.A11;
                    C15830rv r12 = r8.A00;
                    arrayList.add(new C37101oc((AnonymousClass1WK) null, (C16030sJ.A0L(r12) || C16030sJ.A0G(r12)) ? r2.A0B() : null, r8, (String) null, A002, z2, false));
                }
                return A0I(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public void A0K() {
        C24581Gm r3;
        List singletonList;
        C28531Wl A022;
        if (A0X() && !this.A07.A0G() && (r3 = (C24581Gm) this.A0T.A02("primary_feature")) != null) {
            AnonymousClass00B.A0G(!r3.A00.A0G());
            List A0A2 = r3.A0A();
            C20360zv r2 = r3.A00;
            List A092 = r2.A09("primary_feature", true);
            if (A092.isEmpty()) {
                A092 = r2.A09("primary_feature", false);
            }
            if (!A092.isEmpty() && (A022 = ((AnonymousClass1WJ) A092.get(0)).A02()) != null) {
                C37241oq r0 = A022.A0K;
                if (r0 == null) {
                    r0 = C37241oq.A01;
                }
                if (!(!A0A2.equals(r0.A00))) {
                    singletonList = Collections.emptyList();
                    A0S(singletonList);
                }
            }
            singletonList = Collections.singletonList(new C37251or((AnonymousClass1WK) null, (String) null, A0A2, r3.A02.A00()));
            A0S(singletonList);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:167|168|169|170|171) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x036e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x0373 */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e7 A[Catch:{ all -> 0x0373 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ec A[Catch:{ all -> 0x0373 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.A0X()     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x037c
            X.0sK r0 = r11.A07     // Catch:{ all -> 0x037e }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x00a2
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            X.1CW r4 = r11.A0o     // Catch:{ all -> 0x037e }
            java.lang.String r3 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            java.util.Set r0 = r4.A04(r3)     // Catch:{ all -> 0x037e }
            java.util.List r5 = X.C16030sJ.A08(r1, r0)     // Catch:{ all -> 0x037e }
            java.lang.String r2 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            java.util.Set r0 = r4.A04(r2)     // Catch:{ all -> 0x037e }
            java.util.List r7 = X.C16030sJ.A08(r1, r0)     // Catch:{ all -> 0x037e }
            X.15h r1 = r11.A0T     // Catch:{ all -> 0x037e }
            java.lang.String r0 = "contact"
            java.lang.Object r6 = r1.A02(r0)     // Catch:{ all -> 0x037e }
            X.1Wb r6 = (X.C28431Wb) r6     // Catch:{ all -> 0x037e }
            r5.size()     // Catch:{ all -> 0x037e }
            r7.size()     // Catch:{ all -> 0x037e }
            if (r6 == 0) goto L_0x009b
            X.0sK r0 = r6.A02     // Catch:{ all -> 0x037e }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x037e }
            r1 = r0 ^ 1
            java.lang.String r0 = "Companion cannot create contact mutations"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x037e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x037e }
            r8.<init>(r5)     // Catch:{ all -> 0x037e }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x037e }
            r5.<init>()     // Catch:{ all -> 0x037e }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x037e }
        L_0x0054:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x037e }
            X.0rv r7 = (X.C15830rv) r7     // Catch:{ all -> 0x037e }
            boolean r0 = r8.contains(r7)     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0054
            X.0sG r1 = r6.A03     // Catch:{ all -> 0x037e }
            r0 = 0
            X.0sH r1 = r1.A0B(r7, r0)     // Catch:{ all -> 0x037e }
            if (r1 == 0) goto L_0x007d
            boolean r0 = X.C224818c.A08(r1)     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1.A0i     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x007d
            r8.add(r7)     // Catch:{ all -> 0x037e }
            goto L_0x0054
        L_0x007d:
            r5.add(r7)     // Catch:{ all -> 0x037e }
            goto L_0x0054
        L_0x0081:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x037e }
            r1.<init>()     // Catch:{ all -> 0x037e }
            X.1Wg r0 = X.C28481Wg.A03     // Catch:{ all -> 0x037e }
            java.util.List r0 = r6.A0A(r0, r8)     // Catch:{ all -> 0x037e }
            r1.addAll(r0)     // Catch:{ all -> 0x037e }
            X.1Wg r0 = X.C28481Wg.A02     // Catch:{ all -> 0x037e }
            java.util.List r0 = r6.A0A(r0, r5)     // Catch:{ all -> 0x037e }
            r1.addAll(r0)     // Catch:{ all -> 0x037e }
            r11.A0I(r1)     // Catch:{ all -> 0x037e }
        L_0x009b:
            r0 = 0
            r4.A05(r3, r0)     // Catch:{ all -> 0x037e }
            r4.A05(r2, r0)     // Catch:{ all -> 0x037e }
        L_0x00a2:
            X.15h r3 = r11.A0T     // Catch:{ all -> 0x037e }
            monitor-enter(r3)     // Catch:{ all -> 0x037e }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0374 }
            r2.<init>()     // Catch:{ all -> 0x0374 }
            X.01D r0 = r3.A05     // Catch:{ all -> 0x0374 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0374 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0374 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0374 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0374 }
        L_0x00ba:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0374 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0374 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0374 }
            java.lang.Object r0 = r3.A02(r0)     // Catch:{ all -> 0x0374 }
            X.0zx r0 = (X.C20380zx) r0     // Catch:{ all -> 0x0374 }
            if (r0 == 0) goto L_0x00ba
            r2.add(r0)     // Catch:{ all -> 0x0374 }
            goto L_0x00ba
        L_0x00d2:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0376 }
        L_0x00d6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x00e0
            r1.next()     // Catch:{ all -> 0x0376 }
            goto L_0x00d6
        L_0x00e0:
            monitor-exit(r3)     // Catch:{ all -> 0x0376 }
            X.0zv r6 = r11.A0f     // Catch:{ all -> 0x037e }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x037e }
            r5.<init>()     // Catch:{ all -> 0x037e }
            X.19K r0 = r6.A01     // Catch:{ all -> 0x037e }
            X.0tf r4 = r0.get()     // Catch:{ all -> 0x037e }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x036f }
            java.lang.String r1 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 0  ORDER BY _id ASC "
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x036f }
        L_0x00f7:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0368 }
            if (r0 == 0) goto L_0x0105
            X.1WJ r0 = r6.A03(r1)     // Catch:{ all -> 0x0368 }
            r5.add(r0)     // Catch:{ all -> 0x0368 }
            goto L_0x00f7
        L_0x0105:
            r1.close()     // Catch:{ all -> 0x036f }
            r4.close()     // Catch:{ all -> 0x037e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037e }
            r1.<init>()     // Catch:{ all -> 0x037e }
            java.lang.String r0 = "sync-manager/handleNotReadyToSyncPendingMutations count: "
            r1.append(r0)     // Catch:{ all -> 0x037e }
            int r0 = r5.size()     // Catch:{ all -> 0x037e }
            r1.append(r0)     // Catch:{ all -> 0x037e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x037e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037e }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ all -> 0x037e }
        L_0x0128:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0379
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x037e }
            X.1WJ r4 = (X.AnonymousClass1WJ) r4     // Catch:{ all -> 0x037e }
            X.0zx r5 = r3.A00(r4)     // Catch:{ all -> 0x037e }
            if (r5 == 0) goto L_0x0128
            boolean r0 = r5 instanceof X.C33731j4     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0155
            X.1j4 r5 = (X.C33731j4) r5     // Catch:{ all -> 0x037e }
            X.1oP r4 = (X.C36971oP) r4     // Catch:{ all -> 0x037e }
            boolean r2 = r4.A01     // Catch:{ all -> 0x037e }
            X.0sf r1 = r5.A01     // Catch:{ all -> 0x037e }
            com.whatsapp.jid.UserJid r0 = r4.A00     // Catch:{ all -> 0x037e }
            if (r2 == 0) goto L_0x0151
            r1.A0U(r0)     // Catch:{ all -> 0x037e }
        L_0x014d:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0151:
            r1.A0T(r0)     // Catch:{ all -> 0x037e }
            goto L_0x014d
        L_0x0155:
            boolean r0 = r5 instanceof X.C33701j0     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.AnonymousClass19G     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.C33631it     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x017e
            X.1it r5 = (X.C33631it) r5     // Catch:{ all -> 0x037e }
            X.1oc r4 = (X.C37101oc) r4     // Catch:{ all -> 0x037e }
            X.0t6 r0 = r5.A04     // Catch:{ all -> 0x037e }
            X.1Vw r1 = r4.A01     // Catch:{ all -> 0x037e }
            X.0th r0 = r0.A0K     // Catch:{ all -> 0x037e }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0178
            r5.A0B(r4, r0)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0178:
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x017e:
            boolean r0 = r5 instanceof X.C33691iz     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0128
            boolean r0 = r5 instanceof X.C33721j3     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x01b6
            X.1j3 r5 = (X.C33721j3) r5     // Catch:{ all -> 0x037e }
            X.1oi r4 = (X.C37161oi) r4     // Catch:{ all -> 0x037e }
            X.13k r9 = r5.A01     // Catch:{ all -> 0x037e }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x037e }
            android.util.Pair r8 = r9.A0A(r0)     // Catch:{ all -> 0x037e }
            if (r8 == 0) goto L_0x01b1
            java.lang.Object r0 = r8.second     // Catch:{ all -> 0x037e }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x037e }
            long r6 = r0.longValue()     // Catch:{ all -> 0x037e }
            long r1 = r4.A00     // Catch:{ all -> 0x037e }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01b1
            java.lang.Object r2 = r8.first     // Catch:{ all -> 0x037e }
            X.1jm r2 = (X.C34151jm) r2     // Catch:{ all -> 0x037e }
            r1 = 1
            com.facebook.redex.IDxCallbackShape70S0200000_2_I0 r0 = new com.facebook.redex.IDxCallbackShape70S0200000_2_I0     // Catch:{ all -> 0x037e }
            r0.<init>(r5, r1, r4)     // Catch:{ all -> 0x037e }
            r9.A0F(r0, r2)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x01b1:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x01b6:
            boolean r0 = r5 instanceof X.C33661iw     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x01dd
            X.1iw r5 = (X.C33661iw) r5     // Catch:{ all -> 0x037e }
            X.1oa r4 = (X.C37081oa) r4     // Catch:{ all -> 0x037e }
            X.0sK r0 = r5.A00     // Catch:{ all -> 0x037e }
            java.lang.String r7 = r4.A00     // Catch:{ all -> 0x037e }
            r0.A0F(r7)     // Catch:{ all -> 0x037e }
            X.0ug r6 = r5.A02     // Catch:{ all -> 0x037e }
            r2 = 0
            r1 = 0
            r0 = 3
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r0, r1, r7)     // Catch:{ all -> 0x037e }
            X.0tK r0 = r6.A02     // Catch:{ all -> 0x037e }
            boolean r0 = r0.A05     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x01d8
            r0 = 0
            r6.A09(r1, r0)     // Catch:{ all -> 0x037e }
        L_0x01d8:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x01dd:
            boolean r0 = r5 instanceof X.AnonymousClass19H     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.C24581Gm     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.C20370zw     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x01f2
            r0 = 0
            X.C18450wi.A0H(r4, r0)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x01f2:
            boolean r0 = r5 instanceof X.AnonymousClass19F     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0209
            X.19F r5 = (X.AnonymousClass19F) r5     // Catch:{ all -> 0x037e }
            X.0zv r2 = r5.A06     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "pin_v1"
            r0 = 1
            java.util.List r0 = r2.A09(r1, r0)     // Catch:{ all -> 0x037e }
            r5.A0A(r0)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0209:
            boolean r0 = r5 instanceof X.C217715j     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.C33611ir     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x022e
            X.1ir r5 = (X.C33611ir) r5     // Catch:{ all -> 0x037e }
            X.1oe r4 = (X.C37121oe) r4     // Catch:{ all -> 0x037e }
            X.0rt r1 = r5.A01     // Catch:{ all -> 0x037e }
            X.0rv r0 = r4.A01     // Catch:{ all -> 0x037e }
            boolean r0 = r1.A0F(r0)     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0227
            r5.A0A(r4)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0227:
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x022e:
            boolean r0 = r5 instanceof X.C33651iv     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x024f
            X.1iv r5 = (X.C33651iv) r5     // Catch:{ all -> 0x037e }
            X.1oT r4 = (X.C37011oT) r4     // Catch:{ all -> 0x037e }
            X.0rt r1 = r5.A03     // Catch:{ all -> 0x037e }
            X.0rv r0 = r4.A01     // Catch:{ all -> 0x037e }
            X.0rx r0 = r1.A06(r0)     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0247
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0247:
            r5.A0B(r4)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x024f:
            boolean r0 = r5 instanceof X.AnonymousClass1WG     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0363
            boolean r0 = r5 instanceof X.AnonymousClass1j1     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x027a
            X.1j1 r5 = (X.AnonymousClass1j1) r5     // Catch:{ all -> 0x037e }
            X.1oL r4 = (X.C36931oL) r4     // Catch:{ all -> 0x037e }
            X.1oK r0 = r4.A01     // Catch:{ all -> 0x037e }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x037e }
            boolean r0 = r4.A02     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x026b
            r5.A0C(r1)     // Catch:{ all -> 0x037e }
        L_0x0266:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x026b:
            X.1Go r0 = r5.A06     // Catch:{ all -> 0x037e }
            X.1jm r0 = r0.A00(r1)     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0266
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x027a:
            boolean r0 = r5 instanceof X.C33671ix     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x029c
            X.1ix r5 = (X.C33671ix) r5     // Catch:{ all -> 0x037e }
            X.1oD r4 = (X.C36851oD) r4     // Catch:{ all -> 0x037e }
            X.0t6 r2 = r5.A01     // Catch:{ all -> 0x037e }
            X.1Vw r1 = r4.A02     // Catch:{ all -> 0x037e }
            X.0th r0 = r2.A0K     // Catch:{ all -> 0x037e }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0297
            boolean r1 = r4.A03     // Catch:{ all -> 0x037e }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x037e }
            r2.A0m(r0, r1)     // Catch:{ all -> 0x037e }
        L_0x0297:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x029c:
            boolean r0 = r5 instanceof X.C33641iu     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x02bd
            X.1iu r5 = (X.C33641iu) r5     // Catch:{ all -> 0x037e }
            X.1o9 r4 = (X.C36811o9) r4     // Catch:{ all -> 0x037e }
            X.0rt r1 = r5.A04     // Catch:{ all -> 0x037e }
            X.0rv r0 = r4.A01     // Catch:{ all -> 0x037e }
            X.0rx r0 = r1.A06(r0)     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x02b5
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x02b5:
            r5.A0A(r4)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x02bd:
            boolean r0 = r5 instanceof X.C28431Wb     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x030e
            X.1Wb r5 = (X.C28431Wb) r5     // Catch:{ all -> 0x037e }
            X.1oR r4 = (X.C36991oR) r4     // Catch:{ all -> 0x037e }
            X.0sG r2 = r5.A03     // Catch:{ all -> 0x037e }
            com.whatsapp.jid.UserJid r1 = r4.A01     // Catch:{ all -> 0x037e }
            r0 = 0
            X.0sH r6 = r2.A0B(r1, r0)     // Catch:{ all -> 0x037e }
            if (r6 == 0) goto L_0x02e0
            boolean r0 = X.C224818c.A08(r6)     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x02e0
            r2 = 1
            boolean r0 = r6.A0i     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x02e1
            X.1Wg r1 = r4.A05     // Catch:{ all -> 0x037e }
            X.1Wg r0 = X.C28481Wg.A03     // Catch:{ all -> 0x037e }
            goto L_0x02e5
        L_0x02e0:
            r2 = 0
        L_0x02e1:
            X.1Wg r1 = r4.A05     // Catch:{ all -> 0x037e }
            X.1Wg r0 = X.C28481Wg.A02     // Catch:{ all -> 0x037e }
        L_0x02e5:
            if (r1 != r0) goto L_0x02ec
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x02ec:
            java.lang.String r0 = "contact-mutation-handler/handleNotReadyToSyncPendingMutation delete mutation isValidWhatsAppContact = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037e }
            r1.<init>(r0)     // Catch:{ all -> 0x037e }
            r1.append(r2)     // Catch:{ all -> 0x037e }
            java.lang.String r0 = "; WAState="
            r1.append(r0)     // Catch:{ all -> 0x037e }
            boolean r0 = r6.A0i     // Catch:{ all -> 0x037e }
            r1.append(r0)     // Catch:{ all -> 0x037e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x037e }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x037e }
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x030e:
            boolean r0 = r5 instanceof X.C33681iy     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x032f
            X.1iy r5 = (X.C33681iy) r5     // Catch:{ all -> 0x037e }
            X.1op r4 = (X.C37231op) r4     // Catch:{ all -> 0x037e }
            X.0rt r1 = r5.A04     // Catch:{ all -> 0x037e }
            X.0rv r0 = r4.A01     // Catch:{ all -> 0x037e }
            X.0rx r0 = r1.A06(r0)     // Catch:{ all -> 0x037e }
            if (r0 != 0) goto L_0x0327
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0327:
            r5.A0A(r4)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x032f:
            boolean r0 = r5 instanceof X.C33621is     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x0128
            X.1is r5 = (X.C33621is) r5     // Catch:{ all -> 0x037e }
            X.1ol r4 = (X.C37191ol) r4     // Catch:{ all -> 0x037e }
            X.0rt r1 = r5.A07     // Catch:{ all -> 0x037e }
            X.0rv r0 = r4.A01     // Catch:{ all -> 0x037e }
            X.0rx r2 = r1.A06(r0)     // Catch:{ all -> 0x037e }
            if (r2 != 0) goto L_0x0348
            X.0zv r0 = r5.A00     // Catch:{ all -> 0x037e }
            r0.A0E(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0348:
            java.lang.String r0 = "ArchiveChatHandler/handleNotReadyToSyncPendingMutation/setArchivedState - "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037e }
            r1.<init>(r0)     // Catch:{ all -> 0x037e }
            boolean r0 = r4.A02     // Catch:{ all -> 0x037e }
            r1.append(r0)     // Catch:{ all -> 0x037e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x037e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037e }
            r5.A0A(r2, r4)     // Catch:{ all -> 0x037e }
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0363:
            r5.A05(r4)     // Catch:{ all -> 0x037e }
            goto L_0x0128
        L_0x0368:
            r0 = move-exception
            if (r1 == 0) goto L_0x036e
            r1.close()     // Catch:{ all -> 0x036e }
        L_0x036e:
            throw r0     // Catch:{ all -> 0x036f }
        L_0x036f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0373 }
        L_0x0373:
            throw r0     // Catch:{ all -> 0x037e }
        L_0x0374:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0376 }
        L_0x0376:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0376 }
            throw r0     // Catch:{ all -> 0x037e }
        L_0x0379:
            r11.A0N()     // Catch:{ all -> 0x037e }
        L_0x037c:
            monitor-exit(r11)     // Catch:{ all -> 0x037e }
            return
        L_0x037e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x037e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930xU.A0L():void");
    }

    public void A0M() {
        AnonymousClass139 r3 = this.A0P;
        if (r3.A01().getBoolean("syncd_one_time_cleanup_for_non_md_user", false) && r3.A01().getInt("syncd_bootstrap_state", 0) == 0 && this.A08.A05(C15910s6.A0Y) && !A0Y() && !this.A07.A0G()) {
            C20360zv r1 = this.A0f;
            if (r1.A0J() || r1.A0I()) {
                A0P(7);
            }
        }
        if (r3.A01().getBoolean("syncd_one_time_cleanup_for_non_md_user", false) && this.A08.A05(C15910s6.A0Y)) {
            r3.A08(false);
        }
    }

    public void A0N() {
        synchronized (this) {
            Runnable runnable = this.A04;
            if (runnable != null) {
                this.A0n.Ac3(runnable);
                this.A04 = null;
                Log.i("sync-manager/forceSync removed scheduled sync");
            }
            A0O();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:84|85) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r0 != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0176 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O() {
        /*
            r10 = this;
            boolean r0 = r10.A0Y()
            if (r0 != 0) goto L_0x017e
            monitor-enter(r10)
            boolean r0 = r10.A05     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0179
            X.11P r0 = r10.A0e     // Catch:{ all -> 0x017b }
            X.19K r0 = r0.A00     // Catch:{ all -> 0x017b }
            X.0tf r3 = r0.get()     // Catch:{ all -> 0x017b }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = "SELECT collection_name FROM collection_versions WHERE dirty_version = 0 OR dirty_version > version"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x0172 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x016b }
            r5.<init>()     // Catch:{ all -> 0x016b }
        L_0x0021:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "collection_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x016b }
            r5.add(r0)     // Catch:{ all -> 0x016b }
            goto L_0x0021
        L_0x0035:
            r1.close()     // Catch:{ all -> 0x0172 }
            r3.close()     // Catch:{ all -> 0x017b }
            X.0zv r7 = r10.A0f     // Catch:{ all -> 0x017b }
            boolean r0 = r7.A0J()     // Catch:{ all -> 0x017b }
            r0 = r0 ^ 1
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x0071
            java.util.Set r0 = X.AnonymousClass1WJ.A09     // Catch:{ all -> 0x017b }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x017b }
            r1.<init>(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "critical_unblock_low"
            r1.remove(r0)     // Catch:{ all -> 0x017b }
            java.util.List r4 = r7.A0A(r1, r9)     // Catch:{ all -> 0x017b }
            java.util.Set r2 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x017b }
            X.0s5 r1 = r10.A08     // Catch:{ all -> 0x017b }
            X.0tC r0 = X.C15910s6.A1S     // Catch:{ all -> 0x017b }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x017b }
            java.util.List r0 = r7.A0A(r2, r0)     // Catch:{ all -> 0x017b }
            r4.addAll(r0)     // Catch:{ all -> 0x017b }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00b0
        L_0x0071:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            X.19K r0 = r7.A01     // Catch:{ all -> 0x017b }
            X.0tf r8 = r0.get()     // Catch:{ all -> 0x017b }
            X.0tg r6 = r8.A02     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00a7 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a7 }
            r2[r1] = r0     // Catch:{ all -> 0x00a7 }
            android.database.Cursor r1 = r6.A08(r3, r2)     // Catch:{ all -> 0x00a7 }
        L_0x008e:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009c
            X.1WJ r0 = r7.A03(r1)     // Catch:{ all -> 0x00a0 }
            r4.add(r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x008e
        L_0x009c:
            r1.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ad
        L_0x00a0:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0176 }
            goto L_0x0176
        L_0x00ad:
            r8.close()     // Catch:{ all -> 0x017b }
        L_0x00b0:
            java.lang.String r0 = "sync-manager/prepareAndSendRequest loaded "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r1.<init>(r0)     // Catch:{ all -> 0x017b }
            int r0 = r4.size()     // Catch:{ all -> 0x017b }
            r1.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " pending mutation(s)"
            r1.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x017b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017b }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x017b }
            r1 = 0
        L_0x00d0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x00d0
            r2.remove()     // Catch:{ all -> 0x017b }
            r1 = 1
            goto L_0x00d0
        L_0x00e1:
            if (r1 == 0) goto L_0x00eb
            X.19E r2 = r10.A0N     // Catch:{ all -> 0x017b }
            r1 = 12
            r0 = 0
            r2.A07(r1, r0)     // Catch:{ all -> 0x017b }
        L_0x00eb:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00f8
            goto L_0x0169
        L_0x00f8:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x017b }
            r3.<init>()     // Catch:{ all -> 0x017b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x017b }
        L_0x0101:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0123
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x017b }
            X.1WJ r2 = (X.AnonymousClass1WJ) r2     // Catch:{ all -> 0x017b }
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x017b }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x017b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x011f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r0.<init>()     // Catch:{ all -> 0x017b }
            r3.put(r1, r0)     // Catch:{ all -> 0x017b }
        L_0x011f:
            r0.add(r2)     // Catch:{ all -> 0x017b }
            goto L_0x0101
        L_0x0123:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x017b }
        L_0x0127:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x017b }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0127
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x017b }
            r3.put(r1, r0)     // Catch:{ all -> 0x017b }
            goto L_0x0127
        L_0x013f:
            X.19W r0 = r10.A0S     // Catch:{ all -> 0x017b }
            java.util.Set r0 = r0.A04()     // Catch:{ all -> 0x017b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x017b }
        L_0x0149:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x017b }
            r3.remove(r0)     // Catch:{ all -> 0x017b }
            goto L_0x0149
        L_0x0157:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0169
            X.0sq r1 = r10.A0n     // Catch:{ all -> 0x017b }
            com.whatsapp.util.RunnableTRunnableShape1S0200000_I0 r0 = new com.whatsapp.util.RunnableTRunnableShape1S0200000_I0     // Catch:{ all -> 0x017b }
            r0.<init>((X.C18930xU) r10, (java.util.Map) r3)     // Catch:{ all -> 0x017b }
            r1.Acl(r0)     // Catch:{ all -> 0x017b }
            r0 = 1
            goto L_0x0177
        L_0x0169:
            r0 = 0
            goto L_0x0177
        L_0x016b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0171
            r1.close()     // Catch:{ all -> 0x0171 }
        L_0x0171:
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0176 }
        L_0x0176:
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0177:
            r10.A05 = r0     // Catch:{ all -> 0x017b }
        L_0x0179:
            monitor-exit(r10)     // Catch:{ all -> 0x017b }
            return
        L_0x017b:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x017b }
            throw r0
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930xU.A0O():void");
    }

    public void A0P(int i2) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/deleteAllSyncdData: isSyncing = ");
            sb.append(this.A05);
            Log.i(sb.toString());
            this.A02 = new AnonymousClass25C(this, i2);
            if (!this.A05) {
                A0W();
            }
        }
    }

    public void A0Q(Integer num) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/handleFatalFailure: errorCode = ");
            sb.append(num);
            sb.append("; isSyncing = ");
            sb.append(this.A05);
            Log.i(sb.toString());
            this.A02 = new AnonymousClass25E(this, num);
            if (!this.A05) {
                A0W();
            }
        }
    }

    public void A0R(String str) {
        C217515h r2 = this.A0T;
        if (r2.A02("removeRecentSticker") != null && A0X()) {
            StringBuilder sb = new StringBuilder("[\"removeRecentSticker\",\"");
            sb.append(str);
            sb.append("\"]");
            r2.A07(sb.toString());
        }
    }

    public void A0S(Collection collection) {
        if (A0X()) {
            this.A0T.A09(collection);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:93|94|95|96|97) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0215 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x021a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(java.util.Collection r23, boolean r24) {
        /*
            r22 = this;
            r12 = r22
            X.0sK r0 = r12.A07
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0223
            monitor-enter(r12)
            r11 = 0
            boolean r0 = r12.A0Z(r11)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x021e
            X.15h r1 = r12.A0T     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "contact"
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x0220 }
            X.1Wb r0 = (X.C28431Wb) r0     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r12.A0X()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0025
            r11 = 1
        L_0x0025:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0220 }
            r3.<init>()     // Catch:{ all -> 0x0220 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0220 }
            r2.<init>()     // Catch:{ all -> 0x0220 }
            r13 = r23
            if (r11 == 0) goto L_0x006f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0220 }
            r5.<init>()     // Catch:{ all -> 0x0220 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0220 }
            r4.<init>()     // Catch:{ all -> 0x0220 }
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x0220 }
        L_0x0041:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0220 }
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ all -> 0x0220 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A08(r0)     // Catch:{ all -> 0x0220 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0220 }
            if (r1 == 0) goto L_0x0041
            boolean r0 = r2.A0i     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x005f
            r5.add(r1)     // Catch:{ all -> 0x0220 }
            goto L_0x0041
        L_0x005f:
            r4.add(r1)     // Catch:{ all -> 0x0220 }
            goto L_0x0041
        L_0x0063:
            android.util.Pair r0 = r12.A09(r5, r4)     // Catch:{ all -> 0x0220 }
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x0220 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x0220 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0220 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0220 }
        L_0x006f:
            X.11X r0 = r12.A0p     // Catch:{ all -> 0x0220 }
            X.0tf r21 = r0.A02()     // Catch:{ all -> 0x0220 }
            X.1cj r20 = r21.A00()     // Catch:{ all -> 0x0216 }
            X.1CW r1 = r12.A0o     // Catch:{ all -> 0x0211 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A06(r0, r3)     // Catch:{ all -> 0x0211 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A06(r0, r2)     // Catch:{ all -> 0x0211 }
            if (r24 == 0) goto L_0x0089
            goto L_0x0200
        L_0x0089:
            X.0sG r10 = r12.A0V     // Catch:{ all -> 0x0211 }
            X.18c r9 = r10.A06     // Catch:{ all -> 0x0211 }
            r0 = 1
            X.1Zf r8 = new X.1Zf     // Catch:{ all -> 0x0211 }
            r8.<init>((boolean) r0)     // Catch:{ all -> 0x0211 }
            r8.A03()     // Catch:{ all -> 0x0211 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0211 }
            r7.<init>()     // Catch:{ all -> 0x0211 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0211 }
            r6.<init>()     // Catch:{ all -> 0x0211 }
            X.11X r0 = r9.A00     // Catch:{ IllegalArgumentException -> 0x01d8 }
            X.0tf r5 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x01d8 }
            X.1cj r4 = r5.A01()     // Catch:{ all -> 0x01d3 }
            java.util.Iterator r19 = r13.iterator()     // Catch:{ all -> 0x01ce }
        L_0x00ae:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r3 = r19.next()     // Catch:{ all -> 0x01ce }
            X.0sH r3 = (X.C16010sH) r3     // Catch:{ all -> 0x01ce }
            X.0rv r2 = r3.A0E     // Catch:{ all -> 0x01ce }
            if (r2 != 0) goto L_0x00d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r1.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "contact-mgr-db/update or add contact skipped for jid="
            r1.append(r0)     // Catch:{ all -> 0x01ce }
            r1.append(r2)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01ce }
            goto L_0x00ae
        L_0x00d3:
            java.lang.String r14 = r2.getRawString()     // Catch:{ all -> 0x01ce }
            r7.add(r3)     // Catch:{ all -> 0x01ce }
            r6.clear()     // Catch:{ all -> 0x01ce }
            long r17 = r3.A05()     // Catch:{ all -> 0x01ce }
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            java.lang.String r1 = "_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
        L_0x00f0:
            java.lang.String r0 = "jid"
            r6.put(r0, r14)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "is_whatsapp_user"
            boolean r0 = r3.A0i     // Catch:{ all -> 0x01ce }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "status"
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r14 = "status_timestamp"
            long r0 = r3.A0B     // Catch:{ all -> 0x01ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r14, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r14 = "number"
            X.1ko r0 = r3.A0D     // Catch:{ all -> 0x01ce }
            r1 = 0
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x01ce }
        L_0x011d:
            r6.put(r14, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r14 = "raw_contact_id"
            X.1ko r0 = r3.A0D     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x012c
            long r0 = r0.A00     // Catch:{ all -> 0x01ce }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ce }
        L_0x012c:
            r6.put(r14, r1)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r3.A09()     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "phone_type"
            java.lang.Integer r0 = r3.A0I     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "phone_label"
            java.lang.String r0 = r3.A0R     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r3.A0N     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r3.A0M     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "sort_name"
            java.lang.String r0 = r3.A0S     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "photo_ts"
            int r0 = r3.A04     // Catch:{ all -> 0x01ce }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "thumb_ts"
            int r0 = r3.A05     // Catch:{ all -> 0x01ce }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r14 = "photo_id_timestamp"
            long r0 = r3.A0A     // Catch:{ all -> 0x01ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r14, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "history_sync_initial_phash"
            java.lang.String r0 = r3.A0O     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r3.A0W     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "nickname"
            java.lang.String r0 = r3.A0Q     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "company"
            java.lang.String r0 = r3.A0K     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "title"
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "is_spam_reported"
            boolean r0 = r3.A0f     // Catch:{ all -> 0x01ce }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r6.put(r1, r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "wa_contacts"
            X.AnonymousClass15L.A04(r6, r5, r0)     // Catch:{ all -> 0x01ce }
            boolean r0 = r2 instanceof X.C16050sL     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x00ae
            X.0sL r2 = (X.C16050sL) r2     // Catch:{ all -> 0x01ce }
            X.1cF r0 = r3.A0H     // Catch:{ all -> 0x01ce }
            r9.A0F(r5, r4, r2, r0)     // Catch:{ all -> 0x01ce }
            goto L_0x00ae
        L_0x01c1:
            r0 = r1
            goto L_0x011d
        L_0x01c4:
            r4.A00()     // Catch:{ all -> 0x01ce }
            r4.close()     // Catch:{ all -> 0x01d3 }
            r5.close()     // Catch:{ IllegalArgumentException -> 0x01d8 }
            goto L_0x01df
        L_0x01ce:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01d2 }
        L_0x01d2:
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            throw r0     // Catch:{ IllegalArgumentException -> 0x01d8 }
        L_0x01d8:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update or add contacts "
            X.AnonymousClass00B.A09(r0, r1)     // Catch:{ all -> 0x0211 }
            goto L_0x01ea
        L_0x01df:
            X.1iU r0 = r9.A02     // Catch:{ all -> 0x0211 }
            r0.A04(r7)     // Catch:{ all -> 0x0211 }
            r13.size()     // Catch:{ all -> 0x0211 }
            r8.A00()     // Catch:{ all -> 0x0211 }
        L_0x01ea:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0211 }
        L_0x01ee:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x0205
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0211 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0211 }
            X.1kv r0 = r10.A04     // Catch:{ all -> 0x0211 }
            r0.A00(r1)     // Catch:{ all -> 0x0211 }
            goto L_0x01ee
        L_0x0200:
            X.0sG r0 = r12.A0V     // Catch:{ all -> 0x0211 }
            r0.A0V(r13)     // Catch:{ all -> 0x0211 }
        L_0x0205:
            r20.A00()     // Catch:{ all -> 0x0211 }
            r20.close()     // Catch:{ all -> 0x0216 }
            r21.close()     // Catch:{ all -> 0x0220 }
            if (r11 == 0) goto L_0x021e
            goto L_0x021b
        L_0x0211:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0215 }
        L_0x0215:
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x021a }
        L_0x021a:
            throw r0     // Catch:{ all -> 0x0220 }
        L_0x021b:
            r12.A0L()     // Catch:{ all -> 0x0220 }
        L_0x021e:
            monitor-exit(r12)     // Catch:{ all -> 0x0220 }
            return
        L_0x0220:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0220 }
            throw r0
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930xU.A0T(java.util.Collection, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(java.util.Set r6) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x003a
            X.15h r4 = r5.A0T
            monitor-enter(r4)
            X.0zv r0 = r4.A03     // Catch:{ all -> 0x0037 }
            X.19K r0 = r0.A01     // Catch:{ all -> 0x0037 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0037 }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0032 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x002d }
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x002d }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x002d }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x002d }
            X.C20360zv.A01(r1, r0)     // Catch:{ all -> 0x002d }
            r2.A00()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ all -> 0x0032 }
            r3.close()     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return
        L_0x002d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930xU.A0U(java.util.Set):void");
    }

    public void A0V(Set set) {
        if (!set.isEmpty()) {
            C217515h r1 = this.A0T;
            synchronized (r1) {
                r1.A03.A0H(set);
            }
            A0N();
        }
    }

    public boolean A0W() {
        boolean z2;
        synchronized (this) {
            AnonymousClass25B r2 = this.A02;
            if (r2 == null) {
                z2 = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("sync-manager/handleSyncdStateIfRequired: syncdState = ");
                sb.append(r2);
                Log.i(sb.toString());
                AnonymousClass25B r1 = this.A02;
                if (r1 instanceof AnonymousClass25E) {
                    AnonymousClass25E r12 = (AnonymousClass25E) r1;
                    r12.A01.A0A().A03(r12.A00, (String) null);
                } else {
                    ((AnonymousClass25C) r1).A00.A0D.A00();
                }
                this.A02 = null;
                z2 = true;
            }
        }
        return z2;
    }

    public boolean A0X() {
        if (A0Y() || !A0Z(1)) {
            return false;
        }
        C20360zv r1 = this.A0f;
        return r1.A0J() || r1.A0I();
    }

    public boolean A0Y() {
        if (this.A0D.A03()) {
            return true;
        }
        C23491Ce r1 = this.A0G;
        return r1.A00.A0G() && r1.A03.A00().getBoolean("companion_syncd_dirty", false);
    }

    public boolean A0Z(int i2) {
        boolean A1d = this.A0j.A01.A1d();
        if (i2 != 0) {
            return A1d || this.A07.A0G();
        }
        if (!A1d || this.A07.A0G()) {
            return false;
        }
    }

    public void AQq(C29861bL r4) {
        if (r4 instanceof C37571pN) {
            try {
                AnonymousClass19W r2 = this.A0S;
                C37571pN r42 = (C37571pN) r4;
                if (r42.A01 && !r2.A0A()) {
                    r2.A07();
                    r2.A09(new HashSet(r42.A12().values()));
                    this.A0n.Acl(new RunnableTRunnableShape0S0100000_I0(this));
                }
            } catch (AnonymousClass1X9 e2) {
                A0Q(Integer.valueOf(e2.errorCode));
            }
        }
    }

    public void ARy() {
        this.A0n.Acm(new RunnableRunnableShape6S0100000_I0_5(this, 29), "SyncManager/onHandlerConnected");
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }

    public void AW1() {
    }

    public void AYd() {
        AnonymousClass19I r1 = this.A0U;
        synchronized (r1) {
            Set set = r1.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0b.A04();
        SharedPreferences.Editor edit = this.A0P.A01().edit();
        for (String remove : AnonymousClass139.A03) {
            edit.remove(remove);
        }
        edit.apply();
        AnonymousClass1CW r2 = this.A0o;
        r2.A05("SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
        r2.A05("SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
    }

    public void AYe() {
    }
}
