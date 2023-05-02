package X;

/* renamed from: X.38L  reason: invalid class name */
public final class AnonymousClass38L {
    public String A00;
    public final AnonymousClass41K A01;
    public final AnonymousClass41L A02;
    public final C797341b A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if (r8.equals("close") != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r2 == r1) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass38L(java.util.Map r10) {
        /*
            r9 = this;
            r9.<init>()
            r4 = 0
            if (r10 != 0) goto L_0x0139
            r2 = r4
        L_0x0007:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x0136
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0136
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r1 = "type"
            java.lang.Object r0 = r2.get(r1)
            r5.put(r1, r0)
            java.lang.String r1 = "modal_type"
            java.lang.Object r0 = r2.get(r1)
            r5.put(r1, r0)
            java.lang.String r0 = "leading_button_config"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            r3 = 0
            if (r0 == 0) goto L_0x0133
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
        L_0x0035:
            if (r1 == 0) goto L_0x012f
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "FcsStateMachine/extractPresentationStyle/unexpected format for presentation.style.leading_button_config: "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0042:
            r0 = 2
            X.1Jq[] r2 = new X.C25401Jq[r0]
            r1 = 0
            java.lang.String r0 = "button_style"
            X.C25401Jq.A00(r0, r3, r2, r1)
            r1 = 1
            java.lang.String r0 = "on_back"
            X.C25401Jq.A00(r0, r3, r2, r1)
            java.util.Map r0 = X.C25411Jr.A05(r2)
        L_0x0055:
            r5.putAll(r0)
        L_0x0058:
            java.lang.String r6 = "on_back_params"
            java.lang.String r7 = "modal_type"
            java.lang.String r3 = "on_back"
            java.lang.String r2 = "type"
            java.lang.String r8 = "button_style"
            if (r5 != 0) goto L_0x0080
            r0 = 5
            X.1Jq[] r1 = new X.C25401Jq[r0]
            r0 = 0
            X.C25401Jq.A00(r2, r4, r1, r0)
            r0 = 1
            X.C25401Jq.A00(r8, r4, r1, r0)
            r0 = 2
            X.C25401Jq.A00(r3, r4, r1, r0)
            r0 = 3
            X.C25401Jq.A00(r7, r4, r1, r0)
            r0 = 4
            X.C25401Jq.A00(r6, r4, r1, r0)
            java.util.Map r5 = X.C25411Jr.A05(r1)
        L_0x0080:
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r0 = "modal"
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x012b
            X.41L r2 = X.AnonymousClass41L.MODAL
        L_0x008e:
            r9.A02 = r2
            X.41L r1 = X.AnonymousClass41L.MODAL
            if (r2 != r1) goto L_0x0128
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = X.C18450wi.A0R(r7, r0)
            if (r0 == 0) goto L_0x0124
            X.41K r0 = X.AnonymousClass41K.BOTTOMSHEET
        L_0x00a2:
            r9.A01 = r0
            if (r2 != r1) goto L_0x00e0
            java.lang.Object r7 = r5.get(r8)
            java.lang.String r0 = "back"
            boolean r0 = X.C18450wi.A0R(r7, r0)
            if (r0 == 0) goto L_0x00e0
        L_0x00b2:
            X.41b r1 = X.C797341b.CLOSE
        L_0x00b4:
            r9.A03 = r1
            X.41b r0 = X.C797341b.BACK
            if (r1 != r0) goto L_0x00be
            java.lang.String r4 = X.C13690nt.A0e(r3, r5)
        L_0x00be:
            r9.A04 = r4
            java.lang.Object r1 = r5.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00df
            boolean r0 = r1 instanceof X.C23861Dq
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r1 instanceof X.AnonymousClass28m
            if (r0 == 0) goto L_0x00df
        L_0x00d0:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00df
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            r9.A00 = r0
        L_0x00df:
            return
        L_0x00e0:
            java.lang.String r8 = X.C13690nt.A0e(r8, r5)
            if (r8 == 0) goto L_0x0101
            int r7 = r8.hashCode()
            r0 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r7 == r0) goto L_0x010f
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r7 == r0) goto L_0x0104
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r7 != r0) goto L_0x0101
            java.lang.String r0 = "close"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00b2
        L_0x0101:
            if (r2 != r1) goto L_0x0121
            goto L_0x00b2
        L_0x0104:
            java.lang.String r0 = "none"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0101
            X.41b r1 = X.C797341b.NONE
            goto L_0x00b4
        L_0x010f:
            java.lang.String r0 = "back"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0101
            if (r2 != r1) goto L_0x0121
            java.lang.String r1 = "Modal presentation should not handle back navigation"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0121:
            X.41b r1 = X.C797341b.BACK
            goto L_0x00b4
        L_0x0124:
            X.41K r0 = X.AnonymousClass41K.FULL_SCREEN
            goto L_0x00a2
        L_0x0128:
            r0 = r4
            goto L_0x00a2
        L_0x012b:
            X.41L r2 = X.AnonymousClass41L.PUSH
            goto L_0x008e
        L_0x012f:
            if (r0 != 0) goto L_0x0055
            goto L_0x0042
        L_0x0133:
            r0 = r3
            goto L_0x0035
        L_0x0136:
            r5 = r4
            goto L_0x0058
        L_0x0139:
            java.lang.String r0 = "style"
            java.lang.Object r2 = r10.get(r0)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass38L.<init>(java.util.Map):void");
    }
}
