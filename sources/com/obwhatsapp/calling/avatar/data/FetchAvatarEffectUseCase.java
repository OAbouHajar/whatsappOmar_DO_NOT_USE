package com.obwhatsapp.calling.avatar.data;

import com.obwhatsapp.calling.avatar.PersonalizedAvatarRepositoryV2;

public final class FetchAvatarEffectUseCase {
    public final PersonalizedAvatarRepositoryV2 A00;

    public FetchAvatarEffectUseCase(PersonalizedAvatarRepositoryV2 personalizedAvatarRepositoryV2) {
        this.A00 = personalizedAvatarRepositoryV2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1UG r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C106205Cy
            if (r0 == 0) goto L_0x001e
            r4 = r6
            X.5Cy r4 = (X.C106205Cy) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.41O r2 = X.AnonymousClass41O.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r1) goto L_0x0024
            goto L_0x0039
        L_0x001e:
            X.5Cy r4 = new X.5Cy
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0024:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x002b:
            X.C813747x.A00(r3)
            com.obwhatsapp.calling.avatar.PersonalizedAvatarRepositoryV2 r0 = r5.A00     // Catch:{ 43J -> 0x003f }
            r4.label = r1     // Catch:{ 43J -> 0x003f }
            java.lang.Object r0 = r0.A00(r4)     // Catch:{ 43J -> 0x003f }
            if (r0 != r2) goto L_0x003c
            return r2
        L_0x0039:
            X.C813747x.A00(r3)     // Catch:{ 43J -> 0x003f }
        L_0x003c:
            X.3mq r0 = X.C72873mq.A00     // Catch:{ 43J -> 0x003f }
            throw r0     // Catch:{ 43J -> 0x003f }
        L_0x003f:
            r1 = move-exception
            X.3mo r0 = new X.3mo
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.avatar.data.FetchAvatarEffectUseCase.A00(X.1UG):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass1UG r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C106215Cz
            if (r0 == 0) goto L_0x0024
            r5 = r7
            X.5Cz r5 = (X.C106215Cz) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.41O r3 = X.AnonymousClass41O.COROUTINE_SUSPENDED
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r0) goto L_0x003f
            if (r2 != r1) goto L_0x002a
            X.C813747x.A00(r4)
            return r4
        L_0x0024:
            X.5Cz r5 = new X.5Cz
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x002a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0031:
            X.C813747x.A00(r4)
            r5.L$0 = r6
            r5.label = r0
            java.lang.Object r0 = r6.A00(r5)
            if (r0 != r3) goto L_0x0042
            return r3
        L_0x003f:
            X.C813747x.A00(r4)
        L_0x0042:
            java.lang.String r0 = "getHasAvatarArEffect"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.avatar.data.FetchAvatarEffectUseCase.A01(X.1UG):java.lang.Object");
    }
}
