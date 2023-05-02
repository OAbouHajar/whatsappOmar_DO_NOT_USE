package X;

import com.obwhatsapp.AsyncInitCoroutineKt$runAsyncInit$1;
import com.obwhatsapp.calling.avatar.CallAvatarViewModel;
import com.obwhatsapp.calling.avatar.CallAvatarViewModel$onSwitchToAvatarTapped$1;
import com.obwhatsapp.calling.avatar.CallAvatarViewModel$onSwitchToVideoTapped$1;
import com.obwhatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* renamed from: X.1UF  reason: invalid class name */
public abstract class AnonymousClass1UF implements AnonymousClass1UG, AnonymousClass1UH, Serializable {
    public final AnonymousClass1UG completion;

    public AnonymousClass1UF(AnonymousClass1UG r1) {
        this.completion = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r1 = (java.lang.Integer) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement A00() {
        /*
            r10 = this;
            java.lang.Class r7 = r10.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r0 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r4 = r7.getAnnotation(r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r4 = (kotlin.coroutines.jvm.internal.DebugMetadata) r4
            if (r4 != 0) goto L_0x0010
            r4 = 0
            return r4
        L_0x0010:
            int r3 = r4.v()
            r2 = 1
            if (r3 > r2) goto L_0x00da
            java.lang.String r0 = "label"
            java.lang.reflect.Field r0 = r7.getDeclaredField(r0)     // Catch:{ Exception -> 0x0031 }
            r0.setAccessible(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ Exception -> 0x0031 }
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0033
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r1 = -1
            goto L_0x0035
        L_0x0033:
            r1 = 0
        L_0x0034:
            int r1 = r1 - r2
        L_0x0035:
            if (r1 >= 0) goto L_0x003e
            r3 = -1
        L_0x0038:
            r6 = 0
            X.4LE r8 = X.C81964Am.A00
            if (r8 != 0) goto L_0x007f
            goto L_0x0045
        L_0x003e:
            int[] r0 = r4.l()
            r3 = r0[r1]
            goto L_0x0038
        L_0x0045:
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x007b }
            java.lang.reflect.Method r9 = r2.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x007b }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ Exception -> 0x007b }
            java.lang.String r0 = "java.lang.Module"
            java.lang.Class r2 = r1.loadClass(r0)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = "getDescriptor"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x007b }
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x007b }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ Exception -> 0x007b }
            java.lang.String r0 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r2 = r1.loadClass(r0)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = "name"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x007b }
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x007b }
            X.4LE r8 = new X.4LE     // Catch:{ Exception -> 0x007b }
            r8.<init>(r9, r5, r0)     // Catch:{ Exception -> 0x007b }
            X.C81964Am.A00 = r8     // Catch:{ Exception -> 0x007b }
            goto L_0x007f
        L_0x007b:
            X.4LE r8 = X.C81964Am.A01
            X.C81964Am.A00 = r8
        L_0x007f:
            X.4LE r0 = X.C81964Am.A01
            r5 = 0
            if (r8 == r0) goto L_0x00a6
            java.lang.reflect.Method r1 = r8.A01
            if (r1 == 0) goto L_0x00a6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object r2 = r1.invoke(r7, r0)
            if (r2 == 0) goto L_0x00a6
            java.lang.reflect.Method r1 = r8.A00
            if (r1 == 0) goto L_0x00a6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object r2 = r1.invoke(r2, r0)
            if (r2 == 0) goto L_0x00a6
            java.lang.reflect.Method r1 = r8.A02
            if (r1 != 0) goto L_0x00d3
            r1 = r5
        L_0x00a1:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00a6
            r5 = r1
        L_0x00a6:
            if (r5 != 0) goto L_0x00ba
            java.lang.String r2 = r4.c()
        L_0x00ac:
            java.lang.String r1 = r4.m()
            java.lang.String r0 = r4.f()
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            r4.<init>(r2, r1, r0, r3)
            return r4
        L_0x00ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r4.c()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            goto L_0x00ac
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object r1 = r1.invoke(r2, r0)
            goto L_0x00a1
        L_0x00da:
            java.lang.String r0 = "Debug metadata version mismatch. Expected: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ", got "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Please update the Kotlin standard library."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UF.A00():java.lang.StackTraceElement");
    }

    public void A01() {
        AnonymousClass5GN r1;
        if (this instanceof AnonymousClass1UE) {
            AnonymousClass1UE r3 = (AnonymousClass1UE) this;
            AnonymousClass1UG r2 = r3.A00;
            if (!(r2 == null || r2 == r3)) {
                C18450wi.A0F(r3.AAx().get(AnonymousClass5VC.A00));
                AnonymousClass5GM r22 = (AnonymousClass5GM) r2;
                do {
                } while (r22._reusableCancellableContinuation == C81984Ao.A00);
                Object obj = r22._reusableCancellableContinuation;
                if ((obj instanceof AnonymousClass5GN) && (r1 = (AnonymousClass5GN) obj) != null) {
                    r1.A05();
                }
            }
            r3.A00 = new C1051158g();
        }
    }

    /* JADX INFO: finally extract failed */
    public Object A04(Object obj) {
        if (this instanceof CallAvatarViewModel$onSwitchToVideoTapped$1) {
            CallAvatarViewModel$onSwitchToVideoTapped$1 callAvatarViewModel$onSwitchToVideoTapped$1 = (CallAvatarViewModel$onSwitchToVideoTapped$1) this;
            AnonymousClass41O r3 = AnonymousClass41O.COROUTINE_SUSPENDED;
            int i2 = callAvatarViewModel$onSwitchToVideoTapped$1.label;
            if (i2 == 0) {
                C813747x.A00(obj);
                C004001t r1 = callAvatarViewModel$onSwitchToVideoTapped$1.this$0.A00;
                if (r1 != null) {
                    callAvatarViewModel$onSwitchToVideoTapped$1.label = 1;
                    r1.A62((CancellationException) null);
                    Object AK0 = r1.AK0(callAvatarViewModel$onSwitchToVideoTapped$1);
                    if (AK0 != r3) {
                        AK0 = AnonymousClass22M.A00;
                    }
                    if (AK0 == r3) {
                        return r3;
                    }
                }
            } else if (i2 == 1) {
                C813747x.A00(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CallAvatarViewModel callAvatarViewModel = callAvatarViewModel$onSwitchToVideoTapped$1.this$0;
            callAvatarViewModel.A00 = null;
            callAvatarViewModel.A04.A0B(new C72903mt((AnonymousClass5B7) null, 1, callAvatarViewModel$onSwitchToVideoTapped$1.$currentState instanceof C72893ms));
            return AnonymousClass22M.A00;
        } else if (this instanceof CallAvatarViewModel$onSwitchToAvatarTapped$1) {
            CallAvatarViewModel$onSwitchToAvatarTapped$1 callAvatarViewModel$onSwitchToAvatarTapped$1 = (CallAvatarViewModel$onSwitchToAvatarTapped$1) this;
            AnonymousClass41O r2 = AnonymousClass41O.COROUTINE_SUSPENDED;
            int i3 = callAvatarViewModel$onSwitchToAvatarTapped$1.label;
            if (i3 == 0) {
                C813747x.A00(obj);
                callAvatarViewModel$onSwitchToAvatarTapped$1.this$0.A04.A0B(C72893ms.A00);
                try {
                    FetchAvatarEffectUseCase fetchAvatarEffectUseCase = callAvatarViewModel$onSwitchToAvatarTapped$1.this$0.A02;
                    callAvatarViewModel$onSwitchToAvatarTapped$1.label = 1;
                    obj = fetchAvatarEffectUseCase.A01(callAvatarViewModel$onSwitchToAvatarTapped$1);
                    if (obj == r2) {
                        return r2;
                    }
                } catch (AnonymousClass5B7 e2) {
                    callAvatarViewModel$onSwitchToAvatarTapped$1.this$0.A04.A0B(new C72903mt(e2, 4, true));
                }
            } else if (i3 == 1) {
                C813747x.A00(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            callAvatarViewModel$onSwitchToAvatarTapped$1.this$0.A04.A0B(new C72883mr((C52002cn) obj));
            return AnonymousClass22M.A00;
        } else {
            AsyncInitCoroutineKt$runAsyncInit$1 asyncInitCoroutineKt$runAsyncInit$1 = (AsyncInitCoroutineKt$runAsyncInit$1) this;
            if (asyncInitCoroutineKt$runAsyncInit$1.label == 0) {
                C813747x.A00(obj);
                AnonymousClass1U7 A00 = asyncInitCoroutineKt$runAsyncInit$1.$perfTimerFactory.A00(C20350zu.A01, "async-init");
                try {
                    asyncInitCoroutineKt$runAsyncInit$1.$asyncInitExecutor.A00();
                    A00.A00();
                    return AnonymousClass22M.A00;
                } catch (Throwable th) {
                    A00.A00();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public AnonymousClass1UG A05(Object obj, AnonymousClass1UG r5) {
        if (this instanceof CallAvatarViewModel$onSwitchToVideoTapped$1) {
            CallAvatarViewModel$onSwitchToVideoTapped$1 callAvatarViewModel$onSwitchToVideoTapped$1 = (CallAvatarViewModel$onSwitchToVideoTapped$1) this;
            return new CallAvatarViewModel$onSwitchToVideoTapped$1(callAvatarViewModel$onSwitchToVideoTapped$1.this$0, callAvatarViewModel$onSwitchToVideoTapped$1.$currentState, r5);
        } else if (this instanceof CallAvatarViewModel$onSwitchToAvatarTapped$1) {
            return new CallAvatarViewModel$onSwitchToAvatarTapped$1(((CallAvatarViewModel$onSwitchToAvatarTapped$1) this).this$0, r5);
        } else {
            if (this instanceof AsyncInitCoroutineKt$runAsyncInit$1) {
                AsyncInitCoroutineKt$runAsyncInit$1 asyncInitCoroutineKt$runAsyncInit$1 = (AsyncInitCoroutineKt$runAsyncInit$1) this;
                return new AsyncInitCoroutineKt$runAsyncInit$1(asyncInitCoroutineKt$runAsyncInit$1.$asyncInitExecutor, asyncInitCoroutineKt$runAsyncInit$1.$perfTimerFactory, r5);
            }
            throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
        }
    }

    public AnonymousClass1UH AAO() {
        AnonymousClass1UG r1 = this.completion;
        if (r1 instanceof AnonymousClass1UH) {
            return (AnonymousClass1UH) r1;
        }
        return null;
    }

    public final void Acd(Object obj) {
        AnonymousClass1UG r2 = this;
        while (true) {
            AnonymousClass1UF r22 = (AnonymousClass1UF) r2;
            AnonymousClass1UG r1 = r22.completion;
            C18450wi.A0F(r1);
            try {
                obj = r22.A04(obj);
                if (obj == AnonymousClass41O.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C41211vQ(th);
            }
            r22.A01();
            if (r1 instanceof AnonymousClass1UF) {
                r2 = r1;
            } else {
                r1.Acd(obj);
                return;
            }
        }
    }

    public String toString() {
        Object A00 = A00();
        if (A00 == null) {
            A00 = getClass().getName();
        }
        return C18450wi.A06("Continuation at ", A00);
    }
}
