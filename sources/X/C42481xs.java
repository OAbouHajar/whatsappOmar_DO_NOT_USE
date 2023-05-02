package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1xs  reason: invalid class name and case insensitive filesystem */
public class C42481xs {
    public AnonymousClass283 A00;
    public C451127c A01;
    public Long A02;
    public final C16300so A03;
    public final C18930xU A04;
    public final C17030uP A05;
    public final C220516l A06;
    public final AnonymousClass167 A07;
    public final AnonymousClass12D A08;
    public final C452427q A09;
    public final AnonymousClass282 A0A;
    public final AnonymousClass281 A0B = new AnonymousClass280(this);
    public final C15800rs A0C;
    public final C16440t3 A0D;
    public final C17580vJ A0E;
    public final AnonymousClass137 A0F;
    public final C19810z2 A0G;
    public final C14710pd A0H;
    public final C17190ug A0I;
    public final C18090w8 A0J;
    public final C18290wS A0K;
    public final AnonymousClass12B A0L;
    public final Map A0M = new HashMap();
    public final Map A0N = new HashMap();
    public final Map A0O = new HashMap();
    public final Map A0P = new HashMap();

    public C42481xs(C16300so r10, C18930xU r11, C17030uP r12, C220516l r13, AnonymousClass167 r14, AnonymousClass12D r15, C452427q r16, C15800rs r17, AnonymousClass01V r18, C16440t3 r19, C16980tz r20, C16260sj r21, C15860rz r22, AnonymousClass013 r23, C17580vJ r24, AnonymousClass137 r25, C19810z2 r26, C14710pd r27, C17190ug r28, C18090w8 r29, C18290wS r30, AnonymousClass12B r31) {
        this.A0D = r19;
        C14710pd r8 = r27;
        this.A0H = r8;
        this.A03 = r10;
        this.A04 = r11;
        this.A0I = r28;
        C452427q r2 = r16;
        this.A09 = r2;
        this.A0E = r24;
        this.A0K = r30;
        this.A0G = r26;
        this.A0L = r31;
        this.A05 = r12;
        this.A0C = r17;
        this.A0F = r25;
        this.A0J = r29;
        this.A07 = r14;
        this.A08 = r15;
        this.A06 = r13;
        this.A0A = new AnonymousClass282(r15, r2, r18, r20, r21, r22, r23, r8);
    }

    public final AnonymousClass284 A00(AnonymousClass025 r6, String str) {
        AnonymousClass284 r0;
        C28921Zf r3 = new C28921Zf(str);
        try {
            r0 = (AnonymousClass284) r6.apply(str);
        } catch (RuntimeException e2) {
            Log.e("ContactSyncHelper/runAndHandleExceptions", e2);
            this.A03.AcB("ContactSyncHelper/runAndHandleExceptions", e2.getMessage(), true);
            r0 = AnonymousClass284.A02;
        } catch (Throwable th) {
            r3.A01();
            throw th;
        }
        r3.A01();
        return r0;
    }

    public final synchronized AnonymousClass283 A01() {
        AnonymousClass283 r0;
        r0 = this.A00;
        if (r0 == null) {
            C14710pd r4 = this.A0H;
            C16300so r1 = this.A03;
            C17190ug r5 = this.A0I;
            r0 = new AnonymousClass283(r1, this.A0B, this.A0E, r4, r5);
            this.A00 = r0;
        }
        return r0;
    }

    public final void A02(Collection collection, List list, Map map) {
        C34751ko r0;
        StringBuilder sb;
        String str;
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C16010sH r5 = (C16010sH) it.next();
            if (r5 == null || (r0 = r5.A0D) == null) {
                z2 = true;
            } else {
                AnonymousClass00B.A06(r0);
                String str2 = r0.A01;
                C450927a r1 = (C450927a) map.get(str2);
                if (r1 == null) {
                    sb = new StringBuilder();
                    str = "sync/phone-number/missing_response/";
                } else {
                    int i2 = r1.A04;
                    if (i2 == 0) {
                        sb = new StringBuilder();
                        str = "sync/phone-number/unassigned/";
                    } else {
                        boolean z3 = false;
                        if (i2 == 1) {
                            z3 = true;
                        }
                        UserJid userJid = r1.A0C;
                        if (r5.A0i != z3 || !C34901l3.A00(r5.A0E, userJid)) {
                            r5.A0i = z3;
                            r5.A0E = userJid;
                            if (collection != null) {
                                collection.add(r5);
                            }
                        }
                    }
                }
                sb.append(str);
                sb.append(AnonymousClass1ZW.A03(4, str2));
                Log.w(sb.toString());
            }
        }
        if (z2) {
            this.A03.AcB("sync/updateContactsFromSyncUsers/found-invalid-contacts", (String) null, false);
        }
    }

    public final boolean A03(C451027b r7, String str, Future future) {
        try {
            future.get(64000, TimeUnit.MILLISECONDS);
            if (this.A01 != null) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/no result");
            Log.i(sb.toString());
            Long l2 = this.A02;
            if (l2 != null) {
                r7.A09 = l2;
                return false;
            }
            return false;
        } catch (RuntimeException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/exception");
            Log.e(sb2.toString(), e2);
            this.A03.AcB(str, e2.getMessage(), true);
            return false;
        } catch (ExecutionException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("/exception");
            Log.e(sb3.toString(), e3);
            if ((e3.getCause() instanceof RuntimeException) || ((e3.getCause() instanceof Error) && !(e3.getCause() instanceof AssertionError) && !(e3.getCause() instanceof OutOfMemoryError))) {
                this.A03.AcB(str, e3.getMessage(), true);
            }
        } catch (InterruptedException | TimeoutException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:251|252|253|254|255) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:121|122|131|132|133|134) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:123|124|126|127|128|129) */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0375, code lost:
        if (r22 == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0377, code lost:
        r4.A00.post(new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5(r4, 48));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0387, code lost:
        if (r8.size() <= 0) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0389, code lost:
        r4.A0X(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x038c, code lost:
        r8 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0392, code lost:
        if (r34.isEmpty() == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0394, code lost:
        com.whatsapp.util.Log.i("contact-mgr-db/add contacts called without any contacts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0399, code lost:
        r25.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x039e, code lost:
        r7 = new X.C28921Zf(true);
        r7.A03();
        r2 = new android.content.ContentValues();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r4 = r8.A00.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        r3 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r12 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03be, code lost:
        if (r12.hasNext() == false) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03c0, code lost:
        r10 = (X.C16010sH) r12.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03c8, code lost:
        if (r10.A0E == null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03ca, code lost:
        X.AnonymousClass00B.A06(r10.A0D);
        r11 = r8.A0B((X.C15830rv) r10.A08(X.C15830rv.class)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e3, code lost:
        if (r11.hasNext() == false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e5, code lost:
        r9 = (X.C16010sH) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03ef, code lost:
        if (X.C224818c.A08(r9) == false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03f1, code lost:
        r0 = r9.A0D;
        X.AnonymousClass00B.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0400, code lost:
        if (r0.A01.equals(r10.A0D.A01) == false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0402, code lost:
        X.AnonymousClass00B.A0G(r3.A01());
        r0 = new X.C28921Zf(true);
        r0.A03();
        r8.A0E(r4, r3, r9);
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0419, code lost:
        r11 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0421, code lost:
        if (r11.hasNext() == false) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0423, code lost:
        r9 = (X.C16010sH) r11.next();
        r0 = r9.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x042b, code lost:
        if (r0 != null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x042d, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/skipped adding contact due to empty jid: ");
        r1.append(r9);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0442, code lost:
        r2.put("jid", r0.getRawString());
        r2.put("is_whatsapp_user", java.lang.Boolean.valueOf(r9.A0i));
        r2.put("status", r9.A0T);
        r2.put("status_timestamp", java.lang.Long.valueOf(r9.A0B));
        r2.put("number", r9.A0D.A01);
        r2.put("raw_contact_id", java.lang.Long.valueOf(r9.A0D.A00));
        r2.put("display_name", r9.A09());
        r2.put("phone_type", r9.A0I);
        r2.put("phone_label", r9.A0R);
        r2.put("given_name", r9.A0N);
        r2.put("family_name", r9.A0M);
        r2.put("sort_name", r9.A0S);
        r2.put("nickname", r9.A0Q);
        r2.put("company", r9.A0K);
        r2.put("title", r9.A0U);
        r2.put("is_spam_reported", java.lang.Boolean.valueOf(r9.A0f));
        X.AnonymousClass15L.A00(r2, r4, "wa_contacts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d8, code lost:
        if ((r9.A0E instanceof X.C16050sL) == false) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04da, code lost:
        r8.A0F(r4, r3, (X.C16050sL) r9.A08(X.C16050sL.class), r9.A0H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e9, code lost:
        r3.A00();
        r4.A03(new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2(r8, 36, r34));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r34.size();
        r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0506, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0510, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        r1 = new java.lang.StringBuilder("contact-mgr-db/unable to add ");
        r1.append(r34.size());
        r1.append(" contacts ");
        X.AnonymousClass00B.A09(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0533, code lost:
        if (r5 != false) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0540, code lost:
        r6.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0555, code lost:
        if (r34.isEmpty() == false) goto L_0x0557;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x02c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x036f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x0374 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:229:0x050a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:234:0x050f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:249:0x053a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:254:0x053f */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02db A[Catch:{ all -> 0x0374, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02fc A[Catch:{ all -> 0x0374, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0358 A[Catch:{ all -> 0x0374, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0564 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(java.util.List r36, java.util.List r37, java.util.List r38) {
        /*
            r35 = this;
            r0 = r35
            X.0xU r6 = r0.A04
            X.0sK r0 = r6.A07
            boolean r0 = r0.A0G()
            r34 = r36
            if (r0 != 0) goto L_0x0548
            monitor-enter(r6)
            r5 = 0
            boolean r0 = r6.A0Z(r5)     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0543
            X.15h r1 = r6.A0T     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "contact"
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x0545 }
            X.1Wb r0 = (X.C28431Wb) r0     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0029
            boolean r0 = r6.A0X()     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0029
            r5 = 1
        L_0x0029:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0545 }
            r3.<init>()     // Catch:{ all -> 0x0545 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0545 }
            r2.<init>()     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x008f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0545 }
            r4.<init>()     // Catch:{ all -> 0x0545 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0545 }
            r3.<init>()     // Catch:{ all -> 0x0545 }
            java.util.Iterator r2 = r34.iterator()     // Catch:{ all -> 0x0545 }
        L_0x0043:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0545 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0545 }
            boolean r0 = r1.A0i     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0043
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)     // Catch:{ all -> 0x0545 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0043
            r4.add(r0)     // Catch:{ all -> 0x0545 }
            goto L_0x0043
        L_0x0061:
            java.util.Iterator r2 = r37.iterator()     // Catch:{ all -> 0x0545 }
        L_0x0065:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0545 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0545 }
            boolean r0 = r1.A0i     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0065
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)     // Catch:{ all -> 0x0545 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x0065
            r3.add(r0)     // Catch:{ all -> 0x0545 }
            goto L_0x0065
        L_0x0083:
            android.util.Pair r0 = r6.A09(r4, r3)     // Catch:{ all -> 0x0545 }
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x0545 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x0545 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0545 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0545 }
        L_0x008f:
            X.11X r0 = r6.A0p     // Catch:{ all -> 0x0545 }
            X.0tf r24 = r0.A02()     // Catch:{ all -> 0x0545 }
            X.1cj r25 = r24.A00()     // Catch:{ all -> 0x053b }
            if (r5 == 0) goto L_0x00a7
            X.1CW r1 = r6.A0o     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A06(r0, r3)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A06(r0, r2)     // Catch:{ all -> 0x0536 }
        L_0x00a7:
            X.0sG r4 = r6.A0V     // Catch:{ all -> 0x0536 }
            X.0rs r7 = r6.A0W     // Catch:{ all -> 0x0536 }
            java.util.HashMap r26 = new java.util.HashMap     // Catch:{ all -> 0x0536 }
            r26.<init>()     // Catch:{ all -> 0x0536 }
            java.util.Iterator r3 = r37.iterator()     // Catch:{ all -> 0x0536 }
        L_0x00b4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0536 }
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ all -> 0x0536 }
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)     // Catch:{ all -> 0x0536 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x0536 }
            boolean r0 = r7.A0C(r0)     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x00d6
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0536 }
        L_0x00d0:
            r0 = r26
            r0.put(r2, r1)     // Catch:{ all -> 0x0536 }
            goto L_0x00b4
        L_0x00d6:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0536 }
            goto L_0x00d0
        L_0x00d9:
            java.util.Set r1 = r26.keySet()     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "dbinfo/manager/deleteContacts"
            X.C16000sG.A02(r0, r1)     // Catch:{ all -> 0x0536 }
            java.util.Set r0 = r26.keySet()     // Catch:{ all -> 0x0536 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0536 }
            r3.<init>()     // Catch:{ all -> 0x0536 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0536 }
        L_0x00ef:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x010d
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0536 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0536 }
            if (r1 == 0) goto L_0x00ef
            X.0rv r0 = r1.A0E     // Catch:{ all -> 0x0536 }
            boolean r0 = r0 instanceof X.C34991lC     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r1.A0J()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x00ef
            r3.add(r1)     // Catch:{ all -> 0x0536 }
            goto L_0x00ef
        L_0x010d:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0536 }
            r8.<init>()     // Catch:{ all -> 0x0536 }
            java.util.Iterator r23 = r3.iterator()     // Catch:{ all -> 0x0536 }
        L_0x0116:
            r22 = 0
        L_0x0118:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x0375
            java.lang.Object r3 = r23.next()     // Catch:{ all -> 0x0536 }
            X.0sH r3 = (X.C16010sH) r3     // Catch:{ all -> 0x0536 }
            boolean r0 = r3.A0i     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x0361
            X.18c r7 = r4.A06     // Catch:{ all -> 0x0536 }
            r2 = 1
            X.1Zf r1 = new X.1Zf     // Catch:{ all -> 0x0536 }
            r1.<init>((boolean) r2)     // Catch:{ all -> 0x0536 }
            r1.A03()     // Catch:{ all -> 0x0536 }
            X.0rv r0 = r3.A0E     // Catch:{ all -> 0x0536 }
            X.11X r9 = r7.A00     // Catch:{ all -> 0x0536 }
            X.0tf r27 = r9.get()     // Catch:{ all -> 0x0536 }
            java.lang.String r28 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r32 = X.C224818c.A09     // Catch:{ all -> 0x0370 }
            java.lang.String r29 = "wa_contacts.jid = ?"
            r15 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x0370 }
            java.lang.String r11 = X.C16030sJ.A03(r0)     // Catch:{ all -> 0x0370 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0370 }
            r2 = 0
            r10[r2] = r11     // Catch:{ all -> 0x0370 }
            r2 = 0
            java.lang.String r31 = "CONTACTS"
            r30 = r2
            r33 = r10
            android.database.Cursor r12 = X.AnonymousClass15L.A03(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0370 }
            if (r12 != 0) goto L_0x0175
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r1.<init>()     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = "contact-mgr-db/has duplicate check failed "
            r1.append(r0)     // Catch:{ all -> 0x0369 }
            r1.append(r3)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0369 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0369 }
            r27.close()     // Catch:{ all -> 0x0536 }
            goto L_0x01b8
        L_0x0175:
            boolean r10 = r12.moveToNext()     // Catch:{ all -> 0x0369 }
            if (r10 == 0) goto L_0x0195
            java.lang.String r0 = "_count"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0369 }
            long r13 = r12.getLong(r0)     // Catch:{ all -> 0x0369 }
            r10 = 1
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x018c
            r15 = 0
        L_0x018c:
            r12.close()     // Catch:{ all -> 0x0370 }
            r27.close()     // Catch:{ all -> 0x0536 }
            if (r15 != 0) goto L_0x0361
            goto L_0x01b8
        L_0x0195:
            r12.close()     // Catch:{ all -> 0x0370 }
            r27.close()     // Catch:{ all -> 0x0536 }
            java.lang.String r11 = "failed during duplicate contact detection for jid ("
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0536 }
            r10.<init>(r11)     // Catch:{ all -> 0x0536 }
            r10.append(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = ") | time: "
            r10.append(r0)     // Catch:{ all -> 0x0536 }
            long r0 = r1.A00()     // Catch:{ all -> 0x0536 }
            r10.append(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0536 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0536 }
        L_0x01b8:
            r0 = r26
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0536 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0536 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x01ff
            long r0 = r3.A09     // Catch:{ all -> 0x0536 }
            X.0t3 r10 = r4.A0A     // Catch:{ all -> 0x0536 }
            long r11 = r10.A00()     // Catch:{ all -> 0x0536 }
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x01ff
            r8.add(r3)     // Catch:{ all -> 0x0536 }
        L_0x01d5:
            X.0rv r0 = r3.A0E     // Catch:{ all -> 0x0536 }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0536 }
            X.11G r0 = r4.A0F     // Catch:{ all -> 0x0536 }
            int r2 = r0.A03(r3)     // Catch:{ all -> 0x0536 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0536 }
            r1.<init>()     // Catch:{ all -> 0x0536 }
            r1.append(r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = " status of UserJid "
            r1.append(r0)     // Catch:{ all -> 0x0536 }
            r1.append(r3)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = " deleted."
            r1.append(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0536 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0536 }
            goto L_0x0355
        L_0x01ff:
            X.1ko r0 = r3.A0D     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x01d5
            r1 = 1
            X.1Zf r21 = new X.1Zf     // Catch:{ all -> 0x0536 }
            r0 = r21
            r0.<init>((boolean) r1)     // Catch:{ all -> 0x0536 }
            r21.A03()     // Catch:{ all -> 0x0536 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0536 }
            r11.<init>()     // Catch:{ all -> 0x0536 }
            long r0 = r3.A09     // Catch:{ all -> 0x0536 }
            X.0t3 r10 = r7.A04     // Catch:{ all -> 0x0536 }
            long r12 = r10.A00()     // Catch:{ all -> 0x0536 }
            r14 = 1
            r20 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r19 = 0
            if (r10 <= 0) goto L_0x0226
            r19 = 1
        L_0x0226:
            r0 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "raw_contact_id"
            r11.put(r0, r10)     // Catch:{ all -> 0x0536 }
            if (r19 != 0) goto L_0x0237
            java.lang.String r0 = "display_name"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
        L_0x0237:
            java.lang.String r0 = "given_name"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "family_name"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "sort_name"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "phone_type"
            r11.put(r0, r10)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "phone_label"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "nickname"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "company"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = "title"
            r11.put(r0, r2)     // Catch:{ all -> 0x0536 }
            X.0rv r0 = r3.A0E     // Catch:{ all -> 0x0536 }
            X.0tf r13 = r9.A02()     // Catch:{ IllegalArgumentException -> 0x02c3 }
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x02be }
            java.lang.String r15 = "wa_contacts"
            java.lang.String r9 = "wa_contacts._id = ?"
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x02b9 }
            long r16 = r3.A05()     // Catch:{ all -> 0x02b9 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x02b9 }
            r1[r20] = r16     // Catch:{ all -> 0x02b9 }
            long r17 = X.AnonymousClass15L.A01(r11, r13, r15, r9, r1)     // Catch:{ all -> 0x02b9 }
            r15 = 1
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r15 = 0
            if (r1 != 0) goto L_0x0289
            r15 = 1
        L_0x0289:
            boolean r1 = r0 instanceof X.C16050sL     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x0293
            r1 = r0
            X.0sL r1 = (X.C16050sL) r1     // Catch:{ all -> 0x02b5 }
            r7.A0F(r13, r12, r1, r2)     // Catch:{ all -> 0x02b5 }
        L_0x0293:
            java.lang.String r11 = "wa_group_admin_settings"
            java.lang.String r9 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = X.C16030sJ.A03(r0)     // Catch:{ all -> 0x02b5 }
            r1[r20] = r0     // Catch:{ all -> 0x02b5 }
            X.AnonymousClass15L.A02(r13, r11, r9, r1)     // Catch:{ all -> 0x02b5 }
            r12.A00()     // Catch:{ all -> 0x02b5 }
            r12.close()     // Catch:{ all -> 0x02b1 }
            r13.close()     // Catch:{ IllegalArgumentException -> 0x02ad }
            goto L_0x02d7
        L_0x02ad:
            r9 = move-exception
            r20 = r15
            goto L_0x02c4
        L_0x02b1:
            r0 = move-exception
            r20 = r15
            goto L_0x02bf
        L_0x02b5:
            r0 = move-exception
            r20 = r15
            goto L_0x02ba
        L_0x02b9:
            r0 = move-exception
        L_0x02ba:
            r12.close()     // Catch:{ all -> 0x02bd }
        L_0x02bd:
            throw r0     // Catch:{ all -> 0x02be }
        L_0x02be:
            r0 = move-exception
        L_0x02bf:
            r13.close()     // Catch:{ all -> 0x02c2 }
        L_0x02c2:
            throw r0     // Catch:{ IllegalArgumentException -> 0x02c3 }
        L_0x02c3:
            r9 = move-exception
        L_0x02c4:
            java.lang.String r1 = "contact-mgr-db/unable to nullify contact android info "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0536 }
            r0.<init>(r1)     // Catch:{ all -> 0x0536 }
            r0.append(r3)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0536 }
            X.AnonymousClass00B.A09(r0, r9)     // Catch:{ all -> 0x0536 }
            r15 = r20
        L_0x02d7:
            r3.A0D = r2     // Catch:{ all -> 0x0536 }
            if (r19 == 0) goto L_0x02e1
            java.lang.String r0 = r3.A09()     // Catch:{ all -> 0x0536 }
            r3.A0J = r0     // Catch:{ all -> 0x0536 }
        L_0x02e1:
            r3.A0L = r2     // Catch:{ all -> 0x0536 }
            r3.A0I = r10     // Catch:{ all -> 0x0536 }
            r3.A0R = r2     // Catch:{ all -> 0x0536 }
            r3.A0N = r2     // Catch:{ all -> 0x0536 }
            r3.A0M = r2     // Catch:{ all -> 0x0536 }
            r3.A0S = r2     // Catch:{ all -> 0x0536 }
            r3.A0Q = r2     // Catch:{ all -> 0x0536 }
            r3.A0K = r2     // Catch:{ all -> 0x0536 }
            r3.A0U = r2     // Catch:{ all -> 0x0536 }
            X.1cF r0 = X.C30371cF.A04     // Catch:{ all -> 0x0536 }
            r3.A0H = r0     // Catch:{ all -> 0x0536 }
            r21.A00()     // Catch:{ all -> 0x0536 }
            if (r15 == 0) goto L_0x01d5
            X.1iU r0 = r7.A02     // Catch:{ all -> 0x0536 }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ all -> 0x0536 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0536 }
        L_0x0306:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0536 }
            X.1iT r1 = (X.C33371iT) r1     // Catch:{ all -> 0x0536 }
            boolean r0 = r1 instanceof X.C34741kn     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x0343
            X.1kn r1 = (X.C34741kn) r1     // Catch:{ all -> 0x0536 }
            X.18c r1 = r1.A01     // Catch:{ all -> 0x0536 }
            java.lang.Object r7 = r1.A07     // Catch:{ all -> 0x0536 }
            monitor-enter(r7)     // Catch:{ all -> 0x0536 }
            java.lang.Integer r0 = r1.A00     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0341
            int r0 = r0.intValue()     // Catch:{ all -> 0x0366 }
            int r0 = r0 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0366 }
            r1.A00 = r2     // Catch:{ all -> 0x0366 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0366 }
            r1.<init>()     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = "contact-mgr-db/onContactUnlinkedFromPhonebook individualContactCount = "
            r1.append(r0)     // Catch:{ all -> 0x0366 }
            r1.append(r2)     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0366 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0366 }
        L_0x0341:
            monitor-exit(r7)     // Catch:{ all -> 0x0366 }
            goto L_0x0306
        L_0x0343:
            X.1iS r1 = (X.C33361iS) r1     // Catch:{ all -> 0x0536 }
            X.0sG r0 = r1.A00     // Catch:{ all -> 0x0536 }
            X.1kv r2 = r0.A04     // Catch:{ all -> 0x0536 }
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r3.A08(r0)     // Catch:{ all -> 0x0536 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0536 }
            r0.remove(r1)     // Catch:{ all -> 0x0536 }
            goto L_0x0306
        L_0x0355:
            r0 = 0
            if (r2 <= 0) goto L_0x0359
            r0 = 1
        L_0x0359:
            if (r22 != 0) goto L_0x035d
            if (r0 == 0) goto L_0x0116
        L_0x035d:
            r22 = 1
            goto L_0x0118
        L_0x0361:
            r8.add(r3)     // Catch:{ all -> 0x0536 }
            goto L_0x0118
        L_0x0366:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0366 }
            throw r0     // Catch:{ all -> 0x0536 }
        L_0x0369:
            r0 = move-exception
            if (r12 == 0) goto L_0x036f
            r12.close()     // Catch:{ all -> 0x036f }
        L_0x036f:
            throw r0     // Catch:{ all -> 0x0370 }
        L_0x0370:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x0374 }
        L_0x0374:
            throw r0     // Catch:{ all -> 0x0536 }
        L_0x0375:
            if (r22 == 0) goto L_0x0383
            android.os.Handler r2 = r4.A00     // Catch:{ all -> 0x0536 }
            r1 = 48
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x0536 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0536 }
            r2.post(r0)     // Catch:{ all -> 0x0536 }
        L_0x0383:
            int r0 = r8.size()     // Catch:{ all -> 0x0536 }
            if (r0 <= 0) goto L_0x038c
            r4.A0X(r8)     // Catch:{ all -> 0x0536 }
        L_0x038c:
            X.18c r8 = r4.A06     // Catch:{ all -> 0x0536 }
            boolean r0 = r34.isEmpty()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x039e
            java.lang.String r0 = "contact-mgr-db/add contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0536 }
        L_0x0399:
            r25.A00()     // Catch:{ all -> 0x0536 }
            goto L_0x052d
        L_0x039e:
            r0 = 1
            X.1Zf r7 = new X.1Zf     // Catch:{ all -> 0x0536 }
            r7.<init>((boolean) r0)     // Catch:{ all -> 0x0536 }
            r7.A03()     // Catch:{ all -> 0x0536 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0536 }
            r2.<init>()     // Catch:{ all -> 0x0536 }
            X.11X r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x0510 }
            X.0tf r4 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0510 }
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x050b }
            java.util.Iterator r12 = r34.iterator()     // Catch:{ all -> 0x0506 }
        L_0x03ba:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x0419
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0506 }
            X.0sH r10 = (X.C16010sH) r10     // Catch:{ all -> 0x0506 }
            X.0rv r0 = r10.A0E     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x03ba
            X.1ko r0 = r10.A0D     // Catch:{ all -> 0x0506 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0506 }
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r10.A08(r0)     // Catch:{ all -> 0x0506 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x0506 }
            java.util.ArrayList r0 = r8.A0B(r0)     // Catch:{ all -> 0x0506 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0506 }
        L_0x03df:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0506 }
            X.0sH r9 = (X.C16010sH) r9     // Catch:{ all -> 0x0506 }
            boolean r0 = X.C224818c.A08(r9)     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x0402
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x0506 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0506 }
            X.1ko r0 = r10.A0D     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0506 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x03df
        L_0x0402:
            boolean r0 = r3.A01()     // Catch:{ all -> 0x0506 }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0506 }
            r1 = 1
            X.1Zf r0 = new X.1Zf     // Catch:{ all -> 0x0506 }
            r0.<init>((boolean) r1)     // Catch:{ all -> 0x0506 }
            r0.A03()     // Catch:{ all -> 0x0506 }
            r8.A0E(r4, r3, r9)     // Catch:{ all -> 0x0506 }
            r0.A00()     // Catch:{ all -> 0x0506 }
            goto L_0x03df
        L_0x0419:
            java.util.Iterator r11 = r34.iterator()     // Catch:{ all -> 0x0506 }
        L_0x041d:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x04e9
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0506 }
            X.0sH r9 = (X.C16010sH) r9     // Catch:{ all -> 0x0506 }
            X.0rv r0 = r9.A0E     // Catch:{ all -> 0x0506 }
            if (r0 != 0) goto L_0x0442
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0506 }
            r1.<init>()     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = "contact-mgr-db/skipped adding contact due to empty jid: "
            r1.append(r0)     // Catch:{ all -> 0x0506 }
            r1.append(r9)     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0506 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0506 }
            goto L_0x041d
        L_0x0442:
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "is_whatsapp_user"
            boolean r0 = r9.A0i     // Catch:{ all -> 0x0506 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "status"
            java.lang.String r0 = r9.A0T     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r10 = "status_timestamp"
            long r0 = r9.A0B     // Catch:{ all -> 0x0506 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0506 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "number"
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r10 = "raw_contact_id"
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x0506 }
            long r0 = r0.A00     // Catch:{ all -> 0x0506 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0506 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "phone_type"
            java.lang.Integer r0 = r9.A0I     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "phone_label"
            java.lang.String r0 = r9.A0R     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r9.A0N     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r9.A0M     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "sort_name"
            java.lang.String r0 = r9.A0S     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "nickname"
            java.lang.String r0 = r9.A0Q     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "company"
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "title"
            java.lang.String r0 = r9.A0U     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r1 = "is_spam_reported"
            boolean r0 = r9.A0f     // Catch:{ all -> 0x0506 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0506 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = "wa_contacts"
            X.AnonymousClass15L.A00(r2, r4, r0)     // Catch:{ all -> 0x0506 }
            X.0rv r0 = r9.A0E     // Catch:{ all -> 0x0506 }
            boolean r0 = r0 instanceof X.C16050sL     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x041d
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r1 = r9.A08(r0)     // Catch:{ all -> 0x0506 }
            X.0sL r1 = (X.C16050sL) r1     // Catch:{ all -> 0x0506 }
            X.1cF r0 = r9.A0H     // Catch:{ all -> 0x0506 }
            r8.A0F(r4, r3, r1, r0)     // Catch:{ all -> 0x0506 }
            goto L_0x041d
        L_0x04e9:
            r3.A00()     // Catch:{ all -> 0x0506 }
            r2 = 36
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2     // Catch:{ all -> 0x0506 }
            r0 = r34
            r1.<init>(r8, r2, r0)     // Catch:{ all -> 0x0506 }
            r4.A03(r1)     // Catch:{ all -> 0x0506 }
            r3.close()     // Catch:{ all -> 0x050b }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0510 }
            r34.size()     // Catch:{ all -> 0x0536 }
            r7.A00()     // Catch:{ all -> 0x0536 }
            goto L_0x0399
        L_0x0506:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x050a }
        L_0x050a:
            throw r0     // Catch:{ all -> 0x050b }
        L_0x050b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x050f }
        L_0x050f:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0510 }
        L_0x0510:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to add "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0536 }
            r1.<init>(r0)     // Catch:{ all -> 0x0536 }
            int r0 = r34.size()     // Catch:{ all -> 0x0536 }
            r1.append(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = " contacts "
            r1.append(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0536 }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x0536 }
            goto L_0x0399
        L_0x052d:
            r25.close()     // Catch:{ all -> 0x053b }
            r24.close()     // Catch:{ all -> 0x0545 }
            if (r5 == 0) goto L_0x0543
            goto L_0x0540
        L_0x0536:
            r0 = move-exception
            r25.close()     // Catch:{ all -> 0x053a }
        L_0x053a:
            throw r0     // Catch:{ all -> 0x053b }
        L_0x053b:
            r0 = move-exception
            r24.close()     // Catch:{ all -> 0x053f }
        L_0x053f:
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x0540:
            r6.A0L()     // Catch:{ all -> 0x0545 }
        L_0x0543:
            monitor-exit(r6)     // Catch:{ all -> 0x0545 }
            goto L_0x0548
        L_0x0545:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0545 }
            throw r0
        L_0x0548:
            boolean r0 = r37.isEmpty()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0557
            boolean r0 = r34.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0558
        L_0x0557:
            r1 = 1
        L_0x0558:
            r4 = r38
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0564
            r6.A0T(r4, r3)
            return r2
        L_0x0564:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481xs.A04(java.util.List, java.util.List, java.util.List):boolean");
    }
}
