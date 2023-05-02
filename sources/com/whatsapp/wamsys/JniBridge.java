package com.whatsapp.wamsys;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass1SU;
import X.AnonymousClass1ZX;
import X.C16490t9;
import X.C20320zr;
import X.C208211s;
import X.C23671Cx;
import X.C24261Fe;
import X.C24271Ff;
import X.C24281Fg;
import X.C24291Fh;
import X.C24301Fi;
import X.C24311Fj;
import X.C24321Fk;
import X.C24331Fm;
import X.C24351Fo;
import X.C24381Fr;
import X.C28371Vv;
import X.C28541Wm;
import X.C28861Yb;
import X.C30881d7;
import X.C30981dH;
import X.C31581eh;
import X.C31591ei;
import X.C31601ej;
import X.C31611ek;
import X.C31621el;
import X.C31631em;
import X.C31641en;
import X.C31651eo;
import X.C31661ep;
import X.C31691es;
import X.C31731ew;
import X.C31801f3;
import X.C31871fA;
import X.C31881fB;
import X.C31891fC;
import X.C31911fE;
import X.C31921fF;
import X.C31931fG;
import android.util.Base64;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.wci.IDxRListenerShape40S0100000_1_I0;
import com.facebook.redex.IDxRCallbackShape231S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0202000_I0;
import com.facebook.redex.RunnableRunnableShape0S0203000_I0;
import com.mod.bomfab.R$styleable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge {
    public static C20320zr DEPENDENCIES;
    public static volatile JniBridge INSTANCE;
    public final C24261Fe jniBridgeExceptionHandler;
    public C24381Fr jniCallbacksIJniCallbacks;
    public C24271Ff jniCallbacksIJniCallbacksAndroidRegistration;
    public final AtomicReference wajContext = new AtomicReference();

    public JniBridge(C24381Fr r2, C24271Ff r3, C24261Fe r4) {
        this.jniCallbacksIJniCallbacks = r2;
        this.jniCallbacksIJniCallbacksAndroidRegistration = r3;
        this.jniBridgeExceptionHandler = r4;
    }

    public static C28861Yb A00(String str, int i2) {
        UserJid nullable = UserJid.getNullable(str);
        AnonymousClass00B.A06(nullable);
        String str2 = nullable.user;
        int i3 = 0;
        if (nullable instanceof AnonymousClass1ZX) {
            i3 = 1;
        }
        return new C28861Yb(i3, str2, i2);
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    C20320zr r0 = DEPENDENCIES;
                    if (r0 != null) {
                        INSTANCE = new JniBridge((C24381Fr) r0.A01.get(), (C24271Ff) DEPENDENCIES.A02.get(), (C24261Fe) DEPENDENCIES.A00.get());
                    } else {
                        throw new IllegalStateException("Dependencies are not set. Call setDependencies() first.");
                    }
                }
            }
        }
        return INSTANCE;
    }

    public static long jnidispatchI(int i2) {
        if (i2 != 0) {
            return 0;
        }
        try {
            return INSTANCE.jniCallbacksIJniCallbacks.A03.A00() / 1000;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIIIIIIOOOOOOOOOO(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C31601ej r2;
        C31611ek r0;
        Object obj11 = obj;
        Object obj12 = obj2;
        Object obj13 = obj3;
        Object obj14 = obj4;
        Object obj15 = obj5;
        Object obj16 = obj6;
        Object obj17 = obj7;
        Object obj18 = obj8;
        Object obj19 = obj9;
        try {
            int i2 = (int) j2;
            MsysError msysError = (MsysError) obj10;
            int i3 = (int) j3;
            int i4 = (int) j4;
            boolean z2 = false;
            if (0 != j19) {
                z2 = true;
            }
            String str = (String) obj11;
            int i5 = (int) j5;
            int i6 = (int) j6;
            String str2 = (String) obj12;
            String str3 = (String) obj13;
            boolean z3 = false;
            if (0 != j20) {
                z3 = true;
            }
            int i7 = (int) j8;
            String str4 = (String) obj14;
            String str5 = (String) obj15;
            String str6 = (String) obj16;
            boolean z4 = false;
            if (0 != j21) {
                z4 = true;
            }
            String str7 = (String) obj17;
            int i8 = (int) j9;
            int i9 = (int) j10;
            String str8 = (String) obj18;
            int i10 = (int) j11;
            C31581eh r4 = (C31581eh) obj19;
            int code = msysError != null ? msysError.getCode() : 0;
            if (r4 instanceof IDxRListenerShape40S0100000_1_I0) {
                IDxRListenerShape40S0100000_1_I0 iDxRListenerShape40S0100000_1_I0 = (IDxRListenerShape40S0100000_1_I0) r4;
                if (iDxRListenerShape40S0100000_1_I0.A01 == 0) {
                    C31591ei r42 = (C31591ei) iDxRListenerShape40S0100000_1_I0.A00;
                    int i11 = 1;
                    if (i2 != 1) {
                        i11 = 0;
                        if (i2 != 3) {
                            i11 = -1;
                            StringBuilder sb = new StringBuilder("wamsys/registration/unknown-exist-status ");
                            sb.append(i2);
                            Log.e(sb.toString());
                        }
                    }
                    boolean z5 = false;
                    boolean z6 = true;
                    if (i11 == 1) {
                        boolean z7 = false;
                        if (i3 == 1) {
                            z7 = true;
                        }
                        if (i4 == 1) {
                            z5 = true;
                        }
                        r2 = new C31601ej(str, z7, z5, z2);
                    } else {
                        if (code == 16) {
                            r0 = C31611ek.ERROR_BAD_TOKEN;
                        } else if (code == 30) {
                            r0 = C31611ek.DEVICE_CONFIRM_OR_SECOND_CODE;
                        } else if (code != 31) {
                            switch (code) {
                                case 1:
                                    r0 = C31611ek.INCORRECT;
                                    break;
                                case 2:
                                    r0 = C31611ek.BLOCKED;
                                    break;
                                case 3:
                                    r0 = C31611ek.LENGTH_LONG;
                                    break;
                                case 4:
                                    r0 = C31611ek.LENGTH_SHORT;
                                    break;
                                case 5:
                                    r0 = C31611ek.FORMAT_WRONG;
                                    break;
                                case 6:
                                    r0 = C31611ek.TEMPORARILY_UNAVAILABLE;
                                    break;
                                case 7:
                                    r0 = C31611ek.OLD_VERSION;
                                    break;
                                default:
                                    switch (code) {
                                        case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                            r0 = C31611ek.SECURITY_CODE;
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                            r0 = C31611ek.INVALID_SKEY_SIGNATURE;
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                            r0 = C31611ek.BIZ_NOT_ALLOWED;
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                            r0 = C31611ek.LIMITED_RELEASE;
                                            break;
                                        default:
                                            r0 = C31611ek.UNKNOWN_REASON;
                                            break;
                                    }
                            }
                        } else {
                            r0 = C31611ek.SECOND_CODE;
                        }
                        r2 = new C31601ej(r0, i11);
                        r2.A08 = String.valueOf(j12);
                        r2.A03 = i5;
                        r2.A02 = i6;
                        r2.A0A = String.valueOf(j13);
                        r2.A0B = String.valueOf(j14);
                        r2.A0C = String.valueOf(j15);
                        r2.A05 = j16;
                        r2.A0E = str2;
                        r2.A0D = str3;
                        r2.A06 = j17;
                        r2.A04 = j18;
                        r2.A0F = z3;
                        r2.A01 = i7;
                        boolean z8 = false;
                        if (i8 == 1) {
                            z8 = true;
                        }
                        r2.A0G = z8;
                        r2.A07 = new C31621el(str5, str6, str7, z4);
                        r2.A09 = str8;
                        if (i10 != 1) {
                            z6 = false;
                        }
                        r2.A0H = z6;
                        if (str4 != null) {
                            r2.A0I = Base64.decode(str4, 0);
                        }
                    }
                    r2.A00 = i9;
                    r42.A02(r2);
                }
            }
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIOOOOOOOOOOOOO(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        Object obj14 = obj2;
        Object obj15 = obj3;
        Object obj16 = obj4;
        Object obj17 = obj5;
        Object obj18 = obj6;
        Object obj19 = obj7;
        Object obj20 = obj8;
        Object obj21 = obj9;
        Object obj22 = obj10;
        Object obj23 = obj11;
        Object obj24 = obj12;
        try {
            int i2 = (int) j2;
            MsysError msysError = (MsysError) obj13;
            String str = (String) obj;
            int i3 = (int) j3;
            int i4 = (int) j4;
            boolean z2 = false;
            if (0 != j13) {
                z2 = true;
            }
            String str2 = (String) obj14;
            String str3 = (String) obj15;
            String str4 = (String) obj16;
            String str5 = (String) obj17;
            int i5 = (int) j5;
            String str6 = (String) obj18;
            String str7 = (String) obj19;
            String str8 = (String) obj20;
            boolean z3 = false;
            if (0 != j14) {
                z3 = true;
            }
            long j15 = j12;
            long j16 = j11;
            long j17 = j9;
            long j18 = j7;
            String str9 = str6;
            String str10 = str7;
            String str11 = str8;
            String str12 = (String) obj21;
            String str13 = (String) obj22;
            String str14 = (String) obj23;
            C31581eh r18 = (C31581eh) obj24;
            String str15 = str;
            String str16 = str2;
            String str17 = str3;
            String str18 = str4;
            String str19 = str5;
            r18.A09(str15, str16, str17, str18, str19, str9, str10, str11, str12, str13, str14, i2, msysError != null ? msysError.getCode() : 0, i3, i4, i5, (int) j6, j18, j8, j17, j10, j16, j15, z2, z3);
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIOOOOOOOOOO(int i2, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object obj11 = obj10;
        Object obj12 = obj;
        Object obj13 = obj2;
        Object obj14 = obj3;
        Object obj15 = obj4;
        Object obj16 = obj5;
        Object obj17 = obj6;
        Object obj18 = obj7;
        Object obj19 = obj8;
        Object obj20 = obj9;
        long j14 = j10;
        long j15 = j9;
        long j16 = j7;
        long j17 = j6;
        long j18 = j5;
        long j19 = j4;
        long j20 = j8;
        int i3 = i2;
        long j21 = j2;
        long j22 = j3;
        if (i2 == 0) {
            int i4 = (int) j21;
            MsysError msysError = (MsysError) obj11;
            int i5 = (int) j22;
            int i6 = (int) j19;
            int i7 = (0 > j12 ? 1 : (0 == j12 ? 0 : -1));
            boolean z2 = false;
            if (i7 != 0) {
                z2 = true;
            }
            String str = (String) obj12;
            String str2 = (String) obj13;
            String str3 = (String) obj14;
            String str4 = (String) obj15;
            String str5 = (String) obj16;
            String str6 = (String) obj17;
            String str7 = (String) obj18;
            boolean z3 = false;
            if (0 != j13) {
                z3 = true;
            }
            ((C31581eh) obj20).A07(str, str2, str3, str4, str5, str6, str7, (String) obj19, i4, msysError != null ? msysError.getCode() : 0, i5, i6, (int) j18, (int) j17, (int) j16, j8, j9, j10, j11, z2, z3);
            return 0;
        } else if (i3 != 1) {
            return 0;
        } else {
            try {
                int i8 = (int) j21;
                MsysError msysError2 = (MsysError) obj11;
                int i9 = (int) j22;
                int i10 = (int) j19;
                boolean z4 = false;
                if (0 != j11) {
                    z4 = true;
                }
                String str8 = (String) obj12;
                int i11 = (int) j18;
                String str9 = (String) obj13;
                String str10 = (String) obj14;
                boolean z5 = false;
                if (0 != j12) {
                    z5 = true;
                }
                int i12 = (int) j17;
                String str11 = (String) obj15;
                String str12 = (String) obj16;
                String str13 = (String) obj17;
                String str14 = (String) obj18;
                boolean z6 = false;
                if (0 != j13) {
                    z6 = true;
                }
                ((C31581eh) obj20).A08(str8, str9, str10, str11, str12, str13, str14, (String) obj19, i8, msysError2 != null ? msysError2.getCode() : 0, i9, i10, i11, i12, j16, j20, j15, j14, z4, z5, z6);
                return 0;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIIIIO(long j2, long j3, long j4, long j5, long j6, Object obj) {
        Object obj2 = obj;
        try {
            C24381Fr r6 = INSTANCE.jniCallbacksIJniCallbacks;
            int i2 = (int) j2;
            byte[] bArr = (byte[]) obj2;
            int i3 = (int) j3;
            AnonymousClass00F r0 = new AnonymousClass00F((int) j4, (int) j5, (int) j6);
            C16490t9 r10 = r6.A04;
            Integer A00 = r10.A00(r0, i2, false);
            if (A00 != null) {
                int intValue = A00.intValue();
                if (i3 != 2) {
                    r10.A0J.A01.execute(new RunnableRunnableShape0S0203000_I0(r10, bArr, i3, i2, intValue, 0));
                    return 0;
                }
                r10.A0J.A02.execute(new RunnableRunnableShape0S0202000_I0((Object) r10, i2, (Object) bArr, intValue, 2));
            }
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIOOO(int i2, long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3) {
        Object obj4 = obj2;
        Object obj5 = obj;
        Object obj6 = obj3;
        long j7 = j3;
        long j8 = j5;
        if (i2 == 0) {
            int i3 = (int) j2;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj5;
            int i4 = (int) j7;
            int i5 = (int) j4;
            boolean z2 = false;
            if (0 != j6) {
                z2 = true;
            }
            ((C31581eh) obj4).A03(str, i3, msysError != null ? msysError.getCode() : 0, i4, i5, j8, z2);
            return 0;
        } else if (i2 != 1) {
            return 0;
        } else {
            try {
                int i6 = (int) j2;
                MsysError msysError2 = (MsysError) obj6;
                String str2 = (String) obj5;
                int i7 = (int) j7;
                boolean z3 = false;
                if (0 != j6) {
                    z3 = true;
                }
                ((C31581eh) obj4).A04(str2, i6, msysError2 != null ? msysError2.getCode() : 0, i7, j8, z3);
                return 0;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIIIIOOOO(long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            MsysError msysError = (MsysError) obj4;
            ((C31581eh) obj3).A02(j5, j6, (int) j2, msysError != null ? msysError.getCode() : 0, (int) j4);
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIIOOOOO(long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            int i2 = (int) j2;
            MsysError msysError = (MsysError) obj5;
            int i3 = (int) j3;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            int i4 = (int) j4;
            C31581eh r3 = (C31581eh) obj4;
            int code = msysError != null ? msysError.getCode() : 0;
            if (r3 instanceof IDxRListenerShape40S0100000_1_I0) {
                IDxRListenerShape40S0100000_1_I0 iDxRListenerShape40S0100000_1_I0 = (IDxRListenerShape40S0100000_1_I0) r3;
                if (1 - iDxRListenerShape40S0100000_1_I0.A01 == 0) {
                    C31591ei r32 = (C31591ei) iDxRListenerShape40S0100000_1_I0.A00;
                    C31631em A01 = AnonymousClass1SU.A01(i2, code);
                    if (A01 == C31631em.ERROR_UNSPECIFIED) {
                        StringBuilder sb = new StringBuilder("wamsys/registration/verify-code-status-standalone-unspecified; response-status ");
                        sb.append(i2);
                        sb.append(" failure-reason ");
                        sb.append(code);
                        Log.e(sb.toString());
                    }
                    C31641en r2 = new C31641en(A01);
                    r2.A08 = str;
                    boolean z2 = true;
                    if (i3 != 1) {
                        z2 = false;
                    }
                    r2.A0E = z2;
                    r2.A09 = String.valueOf(j5);
                    r2.A07 = str3;
                    r2.A01 = i4;
                    if (str2 != null) {
                        r2.A0F = Base64.decode(str2, 0);
                    }
                    r32.A02(r2);
                }
            }
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIIO(int i2, long j2, long j3, long j4, Object obj) {
        if (i2 == 0) {
            ((C31661ep) obj).A02.A0A(j3);
        } else if (i2 == 1) {
            try {
                ((C31651eo) obj).A02.A09(j3);
                return 0;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
        return 0;
    }

    public static long jnidispatchIIIOO(long j2, long j3, Object obj, Object obj2) {
        try {
            throw new NullPointerException("completionCallback");
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static long jnidispatchIIIOOOOO(long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            MsysError msysError = (MsysError) obj5;
            ((C31581eh) obj4).A06((String) obj, (String) obj2, (String) obj3, (int) j2, msysError != null ? msysError.getCode() : 0, j3);
            return 0;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        if (r2 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        if (r1 == 7) goto L_0x016b;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:34:0x00aa, B:41:0x0117, B:51:0x0144] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0144 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0149 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r14, long r15, java.lang.Object r17) {
        /*
            r0 = r17
            r8 = 0
            if (r14 == 0) goto L_0x014f
            r0 = 1
            if (r14 == r0) goto L_0x014c
            r0 = 2
            if (r14 == r0) goto L_0x00e0
            r0 = 3
            if (r14 == r0) goto L_0x0093
            r0 = 4
            if (r14 == r0) goto L_0x002b
            r0 = 5
            if (r14 != r0) goto L_0x0180
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            int r1 = (int) r15     // Catch:{ Exception -> 0x0181 }
            X.01D r0 = r0.A08     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.1Fo r0 = (X.C24351Fo) r0     // Catch:{ Exception -> 0x0181 }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.1es r0 = r0.A09     // Catch:{ Exception -> 0x0181 }
            r0.A02(r1)     // Catch:{ Exception -> 0x0181 }
            goto L_0x014c
        L_0x002b:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            int r2 = (int) r15     // Catch:{ Exception -> 0x0181 }
            X.01D r0 = r0.A08     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.1Fo r0 = (X.C24351Fo) r0     // Catch:{ Exception -> 0x0181 }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.1es r0 = r0.A09     // Catch:{ Exception -> 0x0181 }
            X.01d r0 = r0.A02     // Catch:{ Exception -> 0x0181 }
            X.0tf r4 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x008d }
            java.lang.String r11 = "prekeys"
            r3 = 1
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "record"
            r1 = 0
            r12[r1] = r0     // Catch:{ all -> 0x008d }
            java.lang.String r13 = "prekey_id = ?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ all -> 0x008d }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008d }
            r14[r1] = r0     // Catch:{ all -> 0x008d }
            r15 = 0
            r17 = r15
            r16 = r15
            android.database.Cursor r1 = r10.A09(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x008d }
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x0086 }
            r1.close()     // Catch:{ all -> 0x008d }
            r4.close()     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = "axolotl has a pre key with id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0181 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0181 }
            r1.append(r2)     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ Exception -> 0x0181 }
            r1.append(r5)     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0181 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0181 }
            goto L_0x014a
        L_0x0086:
            r0 = move-exception
            if (r1 == 0) goto L_0x008c
            r1.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0149 }
            goto L_0x0149
        L_0x0093:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            int r6 = (int) r15     // Catch:{ Exception -> 0x0181 }
            X.01D r0 = r0.A0D     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.1Fi r0 = (X.C24301Fi) r0     // Catch:{ Exception -> 0x0181 }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.1eu r0 = r0.A0C     // Catch:{ Exception -> 0x0181 }
            X.01d r0 = r0.A01     // Catch:{ Exception -> 0x0181 }
            X.0tf r3 = r0.A02()     // Catch:{ Exception -> 0x0181 }
            X.0tg r7 = r3.A02     // Catch:{ all -> 0x0145 }
            java.lang.String r5 = "signed_prekeys"
            java.lang.String r4 = "prekey_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0145 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0145 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0145 }
            int r0 = r7.A01(r5, r4, r2)     // Catch:{ all -> 0x0145 }
            long r4 = (long) r0     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r1.<init>()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x0145 }
            r1.append(r4)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = " signed pre keys with id "
            r1.append(r0)     // Catch:{ all -> 0x0145 }
            r1.append(r6)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0145 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0145 }
            r3.close()     // Catch:{ Exception -> 0x0181 }
            goto L_0x014c
        L_0x00e0:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            int r4 = (int) r15     // Catch:{ Exception -> 0x0181 }
            X.01D r0 = r0.A0D     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.1Fi r0 = (X.C24301Fi) r0     // Catch:{ Exception -> 0x0181 }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.1eu r0 = r0.A0C     // Catch:{ Exception -> 0x0181 }
            X.01d r0 = r0.A01     // Catch:{ Exception -> 0x0181 }
            X.0tf r3 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0tg r10 = r3.A02     // Catch:{ all -> 0x0145 }
            java.lang.String r11 = "signed_prekeys"
            r2 = 1
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "record"
            r1 = 0
            r12[r1] = r0     // Catch:{ all -> 0x0145 }
            java.lang.String r13 = "prekey_id = ?"
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0145 }
            r14[r1] = r0     // Catch:{ all -> 0x0145 }
            r15 = 0
            r17 = r15
            r16 = r15
            android.database.Cursor r2 = r10.A09(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0145 }
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r1.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "axolotl has a signed pre key with id "
            r1.append(r0)     // Catch:{ all -> 0x013e }
            r1.append(r4)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x013e }
            r1.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x013e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013e }
            r2.close()     // Catch:{ all -> 0x0145 }
            r3.close()     // Catch:{ Exception -> 0x0181 }
            goto L_0x014a
        L_0x013e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0144
            r2.close()     // Catch:{ all -> 0x0144 }
        L_0x0144:
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ Exception -> 0x0181 }
        L_0x014a:
            if (r5 == 0) goto L_0x0180
        L_0x014c:
            r8 = 1
            return r8
        L_0x014f:
            int r1 = (int) r15     // Catch:{ Exception -> 0x0181 }
            X.1eo r0 = (X.C31651eo) r0     // Catch:{ Exception -> 0x0181 }
            X.1ei r4 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ Exception -> 0x0181 }
            if (r1 == 0) goto L_0x0175
            r0 = 11
            if (r1 == r0) goto L_0x0172
            r0 = 4
            if (r1 == r0) goto L_0x016f
            r0 = 5
            if (r1 == r0) goto L_0x016b
            r0 = 6
            if (r1 == r0) goto L_0x016b
            r0 = 7
            r3 = 17
            if (r1 != r0) goto L_0x016d
        L_0x016b:
            r3 = 9
        L_0x016d:
            r2 = 0
            goto L_0x0177
        L_0x016f:
            r3 = 11
            goto L_0x016d
        L_0x0172:
            r3 = 8
            goto L_0x016d
        L_0x0175:
            r3 = 0
            r2 = 1
        L_0x0177:
            r1 = 0
            X.1et r0 = new X.1et     // Catch:{ Exception -> 0x0181 }
            r0.<init>(r3, r1, r2)     // Catch:{ Exception -> 0x0181 }
            r4.A02(r0)     // Catch:{ Exception -> 0x0181 }
        L_0x0180:
            return r8
        L_0x0181:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOO(int r11, long r12, java.lang.Object r14, java.lang.Object r15) {
        /*
            r9 = 1
            r7 = 0
            switch(r11) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00a9;
                case 2: goto L_0x0077;
                case 3: goto L_0x001f;
                case 4: goto L_0x0008;
                case 5: goto L_0x006e;
                case 6: goto L_0x011e;
                case 7: goto L_0x0130;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r7
        L_0x0008:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0142 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0142 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0142 }
            int r2 = (int) r12     // Catch:{ Exception -> 0x0142 }
            X.01D r0 = r0.A0B     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0142 }
            X.1Fm r1 = (X.C24331Fm) r1     // Catch:{ Exception -> 0x0142 }
            X.1Yb r0 = A00(r14, r2)     // Catch:{ Exception -> 0x0142 }
            r1.A00(r0)     // Catch:{ Exception -> 0x0142 }
            return r9
        L_0x001f:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0142 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0142 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0142 }
            int r1 = (int) r12     // Catch:{ Exception -> 0x0142 }
            X.01D r0 = r0.A0B     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0142 }
            X.1Fm r5 = (X.C24331Fm) r5     // Catch:{ Exception -> 0x0142 }
            X.1Yb r4 = A00(r14, r1)     // Catch:{ Exception -> 0x0142 }
            X.19U r3 = r5.A00     // Catch:{ Exception -> 0x0142 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0142 }
            X.1ev r0 = r3.A00(r4)     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.A00     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            r2 = 0
            goto L_0x0067
        L_0x0042:
            X.11s r0 = r5.A01     // Catch:{ all -> 0x006b }
            X.1ex r0 = r0.A0B     // Catch:{ all -> 0x006b }
            byte[] r1 = r0.A03(r4)     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0057
            X.1ev r0 = new X.1ev     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r3.A03(r0, r4)     // Catch:{ all -> 0x006b }
        L_0x0054:
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x011b
        L_0x0057:
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0063 }
            X.C208211s.A02(r0)     // Catch:{ IOException -> 0x0063 }
            r3.A03(r0, r4)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r5.A00(r4)     // Catch:{ all -> 0x006b }
            goto L_0x0054
        L_0x0067:
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x011b
            return r9
        L_0x006b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x0076
        L_0x006e:
            java.lang.String r0 = "socketReceiveHandler"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0142 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0142 }
        L_0x0076:
            throw r1     // Catch:{ Exception -> 0x0142 }
        L_0x0077:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0142 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0142 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x0142 }
            X.01D r0 = r0.A08     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0142 }
            X.1Fo r3 = (X.C24351Fo) r3     // Catch:{ Exception -> 0x0142 }
            int r0 = r15.size()     // Catch:{ Exception -> 0x0142 }
            int[] r2 = new int[r0]     // Catch:{ Exception -> 0x0142 }
            r1 = 0
        L_0x008c:
            int r0 = r15.size()     // Catch:{ Exception -> 0x0142 }
            if (r1 >= r0) goto L_0x00a1
            java.lang.Object r0 = r15.get(r1)     // Catch:{ Exception -> 0x0142 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0142 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0142 }
            r2[r1] = r0     // Catch:{ Exception -> 0x0142 }
            int r1 = r1 + 1
            goto L_0x008c
        L_0x00a1:
            X.11s r0 = r3.A00     // Catch:{ Exception -> 0x0142 }
            X.1es r0 = r0.A09     // Catch:{ Exception -> 0x0142 }
            r0.A03(r2)     // Catch:{ Exception -> 0x0142 }
            return r9
        L_0x00a9:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0142 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0142 }
            int r1 = (int) r12     // Catch:{ Exception -> 0x0142 }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ Exception -> 0x0142 }
            X.01D r0 = r0.A0C     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x0142 }
            X.11s r6 = (X.C208211s) r6     // Catch:{ Exception -> 0x0142 }
            X.0xT r0 = r6.A0I     // Catch:{ Exception -> 0x0142 }
            boolean r0 = r0.A06     // Catch:{ Exception -> 0x0142 }
            if (r0 != 0) goto L_0x00c3
            X.16P r0 = r6.A0H     // Catch:{ Exception -> 0x0142 }
            r0.A00()     // Catch:{ Exception -> 0x0142 }
        L_0x00c3:
            r0 = 16777214(0xfffffe, float:2.3509884E-38)
            int r1 = r1 % r0
            int r5 = r1 + 1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0142 }
            r4.<init>()     // Catch:{ Exception -> 0x0142 }
            java.util.Set r0 = r15.entrySet()     // Catch:{ Exception -> 0x0142 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0142 }
        L_0x00d6:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0142 }
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r1 = r3.next()     // Catch:{ Exception -> 0x0142 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0142 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0142 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0142 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x0142 }
            X.1ew r0 = new X.1ew     // Catch:{ Exception -> 0x0142 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0142 }
            r4.add(r0)     // Catch:{ Exception -> 0x0142 }
            goto L_0x00d6
        L_0x00fb:
            r6.A0b(r4, r5)     // Catch:{ Exception -> 0x0142 }
            goto L_0x011b
        L_0x00ff:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0142 }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0142 }
            int r2 = (int) r12     // Catch:{ Exception -> 0x0142 }
            byte[] r15 = (byte[]) r15     // Catch:{ Exception -> 0x0142 }
            X.01D r0 = r0.A0D     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0142 }
            X.1Fi r1 = (X.C24301Fi) r1     // Catch:{ Exception -> 0x0142 }
            if (r15 == 0) goto L_0x011b
            int r0 = r15.length     // Catch:{ Exception -> 0x0142 }
            if (r0 <= 0) goto L_0x011b
            X.11s r0 = r1.A00     // Catch:{ Exception -> 0x0142 }
            X.1eu r0 = r0.A0C     // Catch:{ Exception -> 0x0142 }
            r0.A00(r2, r15)     // Catch:{ Exception -> 0x0142 }
            return r9
        L_0x011b:
            r9 = 0
            return r9
        L_0x011e:
            int r1 = (int) r12     // Catch:{ Exception -> 0x0142 }
            com.facebook.msys.mcf.MsysError r15 = (com.facebook.msys.mcf.MsysError) r15     // Catch:{ Exception -> 0x0142 }
            X.1eh r14 = (X.C31581eh) r14     // Catch:{ Exception -> 0x0142 }
            if (r15 == 0) goto L_0x012d
            int r0 = r15.getCode()     // Catch:{ Exception -> 0x0142 }
        L_0x0129:
            r14.A00(r1, r0)     // Catch:{ Exception -> 0x0142 }
            goto L_0x012f
        L_0x012d:
            r0 = 0
            goto L_0x0129
        L_0x012f:
            return r7
        L_0x0130:
            int r1 = (int) r12     // Catch:{ Exception -> 0x0142 }
            com.facebook.msys.mcf.MsysError r15 = (com.facebook.msys.mcf.MsysError) r15     // Catch:{ Exception -> 0x0142 }
            X.1eh r14 = (X.C31581eh) r14     // Catch:{ Exception -> 0x0142 }
            if (r15 == 0) goto L_0x013f
            int r0 = r15.getCode()     // Catch:{ Exception -> 0x0142 }
        L_0x013b:
            r14.A01(r1, r0)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0141
        L_0x013f:
            r0 = 0
            goto L_0x013b
        L_0x0141:
            return r7
        L_0x0142:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOO(int, long, java.lang.Object, java.lang.Object):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x007e */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOO(int r12, long r13, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r6 = r17
            r10 = 1
            r8 = 0
            if (r12 == 0) goto L_0x00e1
            r0 = 1
            if (r12 == r0) goto L_0x00ae
            r0 = 2
            if (r12 == r0) goto L_0x0087
            r0 = 3
            if (r12 == r0) goto L_0x0012
            return r8
        L_0x0012:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00ed }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00ed }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ed }
            int r3 = (int) r13     // Catch:{ Exception -> 0x00ed }
            byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x00ed }
            X.01D r0 = r0.A0B     // Catch:{ Exception -> 0x00ed }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x00ed }
            X.1Fm r2 = (X.C24331Fm) r2     // Catch:{ Exception -> 0x00ed }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x007f }
            r0.<init>(r6)     // Catch:{ IOException -> 0x007f }
            X.11s r1 = r2.A01     // Catch:{ IOException -> 0x007f }
            X.C208211s.A02(r0)     // Catch:{ IOException -> 0x007f }
            X.1Yb r7 = A00(r15, r3)     // Catch:{ Exception -> 0x00ed }
            X.01d r0 = r2.A02     // Catch:{ Exception -> 0x00ed }
            X.0tf r5 = r0.A02()     // Catch:{ Exception -> 0x00ed }
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x007a }
            X.19U r3 = r2.A00     // Catch:{ all -> 0x0075 }
            monitor-enter(r3)     // Catch:{ all -> 0x0075 }
            X.1ex r0 = r1.A0B     // Catch:{ IOException -> 0x004f }
            r0.A02(r7, r6)     // Catch:{ IOException -> 0x004f }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x004f }
            r0.<init>(r6)     // Catch:{ IOException -> 0x004f }
            r3.A03(r0, r7)     // Catch:{ IOException -> 0x004f }
            r4.A00()     // Catch:{ IOException -> 0x004f }
            goto L_0x006a
        L_0x004f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "sessionStoreImpl/saveSession for "
            r1.append(r0)     // Catch:{ all -> 0x0072 }
            r1.append(r7)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = " failed to update"
            r1.append(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0072 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0072 }
        L_0x006a:
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            r4.close()     // Catch:{ all -> 0x007a }
            r5.close()     // Catch:{ Exception -> 0x00ed }
            return r10
        L_0x0072:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r0     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ Exception -> 0x00ed }
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "sessionStoreImpl/invalid-session-record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00ed }
            goto L_0x00ea
        L_0x0087:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00ed }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00ed }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ed }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00ed }
            X.01D r0 = r0.A07     // Catch:{ Exception -> 0x00ed }
            r0.get()     // Catch:{ Exception -> 0x00ed }
            X.1Yb r2 = A00(r15, r1)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = "axolotl trusting "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ed }
            r1.append(r2)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = " key pair"
            r1.append(r0)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00ed }
            return r10
        L_0x00ae:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00ed }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00ed }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ed }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00ed }
            byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x00ed }
            X.01D r0 = r0.A07     // Catch:{ Exception -> 0x00ed }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x00ed }
            X.1Fj r3 = (X.C24311Fj) r3     // Catch:{ Exception -> 0x00ed }
            X.1Yb r2 = A00(r15, r1)     // Catch:{ Exception -> 0x00ed }
            if (r6 != 0) goto L_0x00cb
            X.11s r0 = r3.A00     // Catch:{ Exception -> 0x00ed }
            r0.A0T(r2)     // Catch:{ Exception -> 0x00ed }
            return r10
        L_0x00cb:
            X.1cD r0 = X.C28851Ya.A01(r6)     // Catch:{ 1ey -> 0x00da }
            X.1WL r1 = new X.1WL     // Catch:{ 1ey -> 0x00da }
            r1.<init>(r0)     // Catch:{ 1ey -> 0x00da }
            X.11s r0 = r3.A00     // Catch:{ 1ey -> 0x00da }
            r0.A0R(r1, r2)     // Catch:{ 1ey -> 0x00da }
            return r10
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "IdentityKeyStoreImpl/Could not save the identity key."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00ed }
            goto L_0x00ea
        L_0x00e1:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00ed }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00ed }
            X.01D r0 = r0.A07     // Catch:{ Exception -> 0x00ed }
            r0.get()     // Catch:{ Exception -> 0x00ed }
        L_0x00ea:
            r10 = 0
            return r10
        L_0x00ed:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOO(int, long, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIIOOOO(int i2, long j2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj4;
            C30981dH r2 = new C30981dH(A00((String) obj2, (int) j2), (String) obj);
            C208211s r1 = ((C24321Fk) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).A00;
            if (bArr == null) {
                r1.A0g(r2, false);
                return 1;
            }
            r1.A0a(r2, bArr);
            return 1;
        } else if (i2 == 1) {
            byte[] bArr2 = (byte[]) obj4;
            C30981dH r12 = new C30981dH(A00((String) obj2, (int) j2), (String) obj);
            C208211s r0 = ((C24291Fh) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00;
            if (bArr2 == null) {
                r0.A0Y(r12);
                return 1;
            }
            r0.A0Z(r12, bArr2);
            return 1;
        } else if (i2 != 2) {
            return 0;
        } else {
            try {
                MsysError msysError = (MsysError) obj4;
                ((C31581eh) obj3).A05((String) obj, (String) obj2, (int) j2, msysError != null ? msysError.getCode() : 0);
                return 0;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r3 == 7) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOOOOOOOO(long r17, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r14 = r19
            r9 = r21
            r2 = r23
            r12 = r22
            r13 = r20
            r7 = r27
            r8 = r26
            r10 = r25
            r11 = r24
            r15 = 0
            r0 = r17
            int r3 = (int) r0     // Catch:{ Exception -> 0x009c }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x009c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x009c }
            byte[] r12 = (byte[]) r12     // Catch:{ Exception -> 0x009c }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x009c }
            byte[] r11 = (byte[]) r11     // Catch:{ Exception -> 0x009c }
            byte[] r10 = (byte[]) r10     // Catch:{ Exception -> 0x009c }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x009c }
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x009c }
            X.1ep r9 = (X.C31661ep) r9     // Catch:{ Exception -> 0x009c }
            X.1ei r0 = r9.A00     // Catch:{ Exception -> 0x009c }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x004a
            r0 = 11
            if (r3 == r0) goto L_0x0047
            r0 = 4
            if (r3 == r0) goto L_0x0044
            r0 = 5
            if (r3 == r0) goto L_0x0042
            r0 = 6
            if (r3 == r0) goto L_0x0042
            r0 = 7
            r6 = 23
            if (r3 != r0) goto L_0x004b
        L_0x0042:
            r6 = 3
            goto L_0x004b
        L_0x0044:
            r6 = 17
            goto L_0x004b
        L_0x0047:
            r6 = 19
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            X.1eq r5 = r9.A02     // Catch:{ Exception -> 0x009c }
            if (r6 != 0) goto L_0x0092
            r4 = 1
            r5.A06 = r4     // Catch:{ Exception -> 0x009c }
            X.1ez r3 = r5.A0W     // Catch:{ Exception -> 0x009c }
            r3.A07(r14)     // Catch:{ Exception -> 0x009c }
            r3.A0A(r13)     // Catch:{ Exception -> 0x009c }
            r1 = 2
            if (r12 == 0) goto L_0x0064
            java.lang.String r0 = android.util.Base64.encodeToString(r12, r1)     // Catch:{ Exception -> 0x009c }
            r3.A09(r0)     // Catch:{ Exception -> 0x009c }
        L_0x0064:
            if (r2 == 0) goto L_0x006d
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ Exception -> 0x009c }
            r3.A08(r0)     // Catch:{ Exception -> 0x009c }
        L_0x006d:
            if (r11 == 0) goto L_0x008c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009c }
            X.1XM r0 = new X.1XM     // Catch:{ Exception -> 0x009c }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x009c }
            if (r8 == 0) goto L_0x008c
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            monitor-enter(r3)     // Catch:{ Exception -> 0x009c }
            r3.A00 = r0     // Catch:{ all -> 0x0088 }
            r3.A0I = r8     // Catch:{ all -> 0x0088 }
            r3.A0K = r7     // Catch:{ all -> 0x0088 }
            r3.A0L = r10     // Catch:{ all -> 0x0088 }
            goto L_0x008b
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x009c }
            throw r0     // Catch:{ Exception -> 0x009c }
        L_0x008b:
            monitor-exit(r3)     // Catch:{ Exception -> 0x009c }
        L_0x008c:
            X.1f0 r0 = r5.A0U     // Catch:{ Exception -> 0x009c }
            X.1f1 r0 = r0.A01     // Catch:{ Exception -> 0x009c }
            r0.A00 = r4     // Catch:{ Exception -> 0x009c }
        L_0x0092:
            X.1ei r1 = r9.A00     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x009c }
            r1.A02(r0)     // Catch:{ Exception -> 0x009c }
            return r15
        L_0x009c:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOOOOOOOO(long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIO(int i2, Object obj) {
        int i3;
        Object obj2 = obj;
        switch (i2) {
            case 1:
                try {
                    C23671Cx r1 = (C23671Cx) INSTANCE.jniCallbacksIJniCallbacks.A0E.get();
                    C28371Vv r6 = (C28371Vv) obj2;
                    r1.A00.A0B(new IDxRCallbackShape231S0100000_2_I0(r1, 4), r6, r6.A0N("id", (String) null), 344, 32000);
                    return 0;
                } catch (Exception e2) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e2);
                    return 0;
                }
            case 2:
                return ((C31661ep) obj2).A02.A02.isCancelled() ? 1 : 0;
            case 3:
                return 0;
            case 4:
                i3 = ((C24311Fj) INSTANCE.jniCallbacksIJniCallbacks.A07.get()).A00.A07.A01();
                break;
            case 5:
                i3 = ((C24301Fi) INSTANCE.jniCallbacksIJniCallbacks.A0D.get()).A00.A0G().A00.A01;
                break;
            case 6:
                i3 = ((C24351Fo) INSTANCE.jniCallbacksIJniCallbacks.A08.get()).A00.A09.A00();
                break;
            case 7:
                i3 = ((C24351Fo) INSTANCE.jniCallbacksIJniCallbacks.A08.get()).A00.A07.A00();
                break;
            case 8:
                i3 = ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A09.get()).getTypeFromKeyValue(obj);
                break;
            default:
                return 0;
        }
        return (long) i3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIOO(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r2 = r17
            r14 = 1
            r12 = 0
            r0 = r16
            if (r16 == 0) goto L_0x0088
            r11 = 1
            if (r0 == r11) goto L_0x000e
            return r12
        L_0x000e:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x007f }
            X.1Fr r1 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x007f }
            r0 = 0
            X.1Yb r7 = A00(r2, r0)     // Catch:{ Exception -> 0x007f }
            X.01D r0 = r1.A0B     // Catch:{ Exception -> 0x007f }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x007f }
            X.1Fm r6 = (X.C24331Fm) r6     // Catch:{ Exception -> 0x007f }
            X.19U r5 = r6.A00     // Catch:{ Exception -> 0x007f }
            monitor-enter(r5)     // Catch:{ Exception -> 0x007f }
            X.11s r0 = r6.A01     // Catch:{ all -> 0x007c }
            X.1ex r0 = r0.A0B     // Catch:{ all -> 0x007c }
            java.lang.String r1 = X.C31811f4.A01(r7)     // Catch:{ all -> 0x007c }
            X.01d r0 = r0.A01     // Catch:{ all -> 0x007c }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x007c }
            r0 = 0
            X.1Yb r8 = A00(r1, r0)     // Catch:{ all -> 0x0077 }
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = "sessions"
            java.lang.String r3 = "recipient_id = ? AND recipient_type = ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0077 }
            r1 = 0
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0077 }
            r2[r1] = r0     // Catch:{ all -> 0x0077 }
            int r0 = r8.A01     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0077 }
            r2[r11] = r0     // Catch:{ all -> 0x0077 }
            int r0 = r10.A01(r9, r3, r2)     // Catch:{ all -> 0x0077 }
            long r2 = (long) r0     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r1.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x0077 }
            r1.append(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x0077 }
            r1.append(r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0077 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0077 }
            r4.close()     // Catch:{ all -> 0x007c }
            r6.A00(r7)     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return r14
        L_0x0077:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r12
        L_0x0088:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIOO(int, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            C30881d7 r4 = (C30881d7) obj;
            ((C24281Fg) INSTANCE.jniCallbacksIJniCallbacks.A05.get()).A00.A0H.A00();
            if (r4 == null) {
                return 0;
            }
            r4.AHO(bArr);
            return 1;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return 0;
        }
    }

    public static Object jnidispatchOI(long j2) {
        try {
            byte[] bArr = new byte[((int) j2)];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            INSTANCE.jniBridgeExceptionHandler.A00(e3);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i2, long j2, Object obj) {
        if (i2 == 0) {
            int i3 = (int) j2;
            byte[] A01 = ((C24301Fi) INSTANCE.jniCallbacksIJniCallbacks.A0D.get()).A00.A0C.A01(i3);
            if (A01 == null) {
                StringBuilder sb = new StringBuilder("no signed prekey available with id ");
                sb.append(i3);
                Log.e(sb.toString());
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("axolotl loaded a signed pre key with id ");
                sb2.append(i3);
                Log.i(sb2.toString());
                C28541Wm.A0E(C31801f3.A06, A01);
                return A01;
            } catch (IOException e2) {
                StringBuilder sb3 = new StringBuilder("failed to parse signed pre key record during load for id ");
                sb3.append(i3);
                Log.e(sb3.toString(), e2);
                return null;
            }
        } else if (i2 == 1) {
            int i4 = (int) j2;
            C31691es r3 = ((C24351Fo) INSTANCE.jniCallbacksIJniCallbacks.A08.get()).A00.A09;
            byte[] A04 = r3.A04(i4);
            if (A04 == null) {
                return null;
            }
            try {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("axolotl found a pre key with id ");
                sb4.append(i4);
                Log.i(sb4.toString());
                C208211s.A01(A04, i4);
                return A04;
            } catch (IOException e3) {
                StringBuilder sb5 = new StringBuilder("error reading prekey ");
                sb5.append(i4);
                sb5.append("; deleting");
                Log.e(sb5.toString(), e3);
                r3.A02(i4);
                return null;
            }
        } else if (i2 != 2) {
            return null;
        } else {
            try {
                int i5 = (int) j2;
                C24351Fo r0 = (C24351Fo) INSTANCE.jniCallbacksIJniCallbacks.A08.get();
                if (i5 <= 0) {
                    return null;
                }
                List<C31731ew> A012 = r0.A00.A09.A01();
                HashMap hashMap = new HashMap();
                for (C31731ew r2 : A012) {
                    hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                    if (hashMap.size() == i5) {
                        return hashMap;
                    }
                }
                return hashMap;
            } catch (Exception e4) {
                INSTANCE.jniBridgeExceptionHandler.A00(e4);
                return null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOIOO(int r11, long r12, java.lang.Object r14, java.lang.Object r15) {
        /*
            r6 = 0
            if (r11 == 0) goto L_0x007a
            r0 = 1
            if (r11 == r0) goto L_0x0056
            r0 = 2
            if (r11 == r0) goto L_0x000a
            return r6
        L_0x000a:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00dc }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00dc }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x00dc }
            int r1 = (int) r12     // Catch:{ Exception -> 0x00dc }
            X.01D r0 = r0.A0B     // Catch:{ Exception -> 0x00dc }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x00dc }
            X.1Fm r5 = (X.C24331Fm) r5     // Catch:{ Exception -> 0x00dc }
            X.1Yb r4 = A00(r14, r1)     // Catch:{ Exception -> 0x00dc }
            X.19U r3 = r5.A00     // Catch:{ Exception -> 0x00dc }
            monitor-enter(r3)     // Catch:{ Exception -> 0x00dc }
            X.1ev r0 = r3.A00(r4)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x002c
            byte[] r2 = r0.A00()     // Catch:{ all -> 0x0053 }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0050
        L_0x002c:
            X.11s r0 = r5.A01     // Catch:{ all -> 0x0053 }
            X.1ex r0 = r0.A0B     // Catch:{ all -> 0x0053 }
            byte[] r1 = r0.A03(r4)     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 != 0) goto L_0x0040
            X.1ev r0 = new X.1ev     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            r3.A03(r0, r4)     // Catch:{ all -> 0x0053 }
            goto L_0x002a
        L_0x0040:
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x004c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x004c }
            X.C208211s.A02(r0)     // Catch:{ IOException -> 0x004c }
            r3.A03(r0, r4)     // Catch:{ IOException -> 0x004c }
            goto L_0x0051
        L_0x004c:
            r5.A00(r4)     // Catch:{ all -> 0x0053 }
            goto L_0x002a
        L_0x0050:
            return r2
        L_0x0051:
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x0053:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ Exception -> 0x00dc }
        L_0x0056:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00dc }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00dc }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x00dc }
            int r1 = (int) r12     // Catch:{ Exception -> 0x00dc }
            X.01D r0 = r0.A07     // Catch:{ Exception -> 0x00dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00dc }
            X.1Fj r0 = (X.C24311Fj) r0     // Catch:{ Exception -> 0x00dc }
            X.1Yb r1 = A00(r14, r1)     // Catch:{ Exception -> 0x00dc }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x00dc }
            X.1WL r0 = r0.A0B(r1)     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x0078
            X.1cD r0 = r0.A00     // Catch:{ Exception -> 0x00dc }
            byte[] r0 = r0.A00()     // Catch:{ Exception -> 0x00dc }
            return r0
        L_0x0078:
            r0 = 0
            return r0
        L_0x007a:
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x00dc }
            int r0 = (int) r12     // Catch:{ Exception -> 0x00dc }
            X.1Ge r15 = (X.C24501Ge) r15     // Catch:{ Exception -> 0x00dc }
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0087;
                case 2: goto L_0x008a;
                case 3: goto L_0x008d;
                case 4: goto L_0x0090;
                case 5: goto L_0x0093;
                case 6: goto L_0x0096;
                case 7: goto L_0x0082;
                case 8: goto L_0x0099;
                case 9: goto L_0x009c;
                default: goto L_0x0082;
            }     // Catch:{ Exception -> 0x00dc }
        L_0x0082:
            r0 = 0
            goto L_0x009e
        L_0x0084:
            X.1XK r0 = X.AnonymousClass1XK.A0B     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x0087:
            X.1XK r0 = X.AnonymousClass1XK.A0I     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x008a:
            X.1XK r0 = X.AnonymousClass1XK.A05     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x008d:
            X.1XK r0 = X.AnonymousClass1XK.A08     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x0090:
            X.1XK r0 = X.AnonymousClass1XK.A0X     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x0093:
            X.1XK r0 = X.AnonymousClass1XK.A04     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x0096:
            X.1XK r0 = X.AnonymousClass1XK.A0S     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x0099:
            X.1XK r0 = X.AnonymousClass1XK.A0J     // Catch:{ Exception -> 0x00dc }
            goto L_0x009e
        L_0x009c:
            X.1XK r0 = X.AnonymousClass1XK.A0K     // Catch:{ Exception -> 0x00dc }
        L_0x009e:
            X.0t8 r2 = r15.A00     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00d2
            byte r0 = r0.A00     // Catch:{ Exception -> 0x00dc }
        L_0x00a4:
            r1 = 0
            X.1f5 r3 = r2.A08(r14, r0, r1)     // Catch:{ Exception -> 0x00dc }
            if (r3 == 0) goto L_0x00d4
            byte[] r10 = android.util.Base64.decode(r14, r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = r3.A03     // Catch:{ Exception -> 0x00dc }
            byte[] r11 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x00dc }
            byte r0 = r3.A00     // Catch:{ Exception -> 0x00dc }
            X.1XK r0 = X.C31831f6.A01(r0, r1)     // Catch:{ Exception -> 0x00dc }
            int r13 = X.C31841f7.A00(r0)     // Catch:{ Exception -> 0x00dc }
            X.0ta r2 = r3.A02     // Catch:{ Exception -> 0x00dc }
            byte[] r12 = r2.A0U     // Catch:{ Exception -> 0x00dc }
            long r14 = r2.A0B     // Catch:{ Exception -> 0x00dc }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            java.lang.String r8 = r2.A0G     // Catch:{ Exception -> 0x00dc }
            java.lang.String r9 = r3.A04     // Catch:{ Exception -> 0x00dc }
            X.1f8 r7 = new X.1f8     // Catch:{ Exception -> 0x00dc }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00d5
        L_0x00d2:
            r0 = -1
            goto L_0x00a4
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            if (r7 == 0) goto L_0x00da
            com.facebook.simplejni.NativeHolder r0 = r7.A00     // Catch:{ Exception -> 0x00dc }
            return r0
        L_0x00da:
            r0 = 0
            return r0
        L_0x00dc:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOIOO(int, long, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Object jnidispatchOIOOO(int i2, long j2, Object obj, Object obj2, Object obj3) {
        if (i2 == 0) {
            C31911fE A01 = ((C24321Fk) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).A00.A0A.A01(new C30981dH(A00((String) obj2, (int) j2), (String) obj));
            C31931fG r4 = null;
            if (A01 != null) {
                try {
                    byte[] bArr = A01.A01;
                    long j3 = A01.A00;
                    new C31921fF(bArr);
                    r4 = new C31931fG(bArr, j3);
                } catch (IOException e2) {
                    Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e2);
                }
            }
            if (r4 != null) {
                return r4.A00;
            }
            return null;
        } else if (i2 == 1) {
            C31871fA A00 = ((C24291Fh) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00.A06.A00(new C30981dH(A00((String) obj2, (int) j2), (String) obj));
            C31891fC r3 = null;
            if (A00 != null) {
                try {
                    byte[] bArr2 = A00.A01;
                    new C31881fB(bArr2);
                    r3 = new C31891fC(bArr2, A00.A00);
                } catch (IOException e3) {
                    Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e3);
                }
            }
            if (r3 != null) {
                return r3.A00;
            }
            return null;
        } else if (i2 != 2) {
            return null;
        } else {
            try {
                byte b2 = (byte) ((int) j2);
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A09.get()).createKeyValue((String) obj, (String) obj2, obj3, b2);
            } catch (Exception e4) {
                INSTANCE.jniBridgeExceptionHandler.A00(e4);
                return null;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOO(int r7, java.lang.Object r8) {
        /*
            r6 = 0
            switch(r7) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0046;
                case 2: goto L_0x010c;
                case 3: goto L_0x007f;
                case 4: goto L_0x0098;
                case 5: goto L_0x00a9;
                case 6: goto L_0x00c0;
                case 7: goto L_0x00d9;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00fb;
                case 10: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            return r6
        L_0x0005:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.createNewJid(r8)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x0018:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x012c }
            X.1Fq r1 = r0.A01     // Catch:{ Exception -> 0x012c }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x012c }
            r5 = 0
            if (r0 != 0) goto L_0x0045
            X.1Fp r0 = r1.A00     // Catch:{ UnknownHostException -> 0x0045 }
            X.1fJ r0 = r0.A00(r8)     // Catch:{ UnknownHostException -> 0x0045 }
            java.net.InetAddress[] r4 = r0.A04     // Catch:{ UnknownHostException -> 0x0045 }
            int r3 = r4.length     // Catch:{ UnknownHostException -> 0x0045 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ UnknownHostException -> 0x0045 }
            r2.<init>()     // Catch:{ UnknownHostException -> 0x0045 }
            r1 = 0
        L_0x0036:
            if (r1 >= r3) goto L_0x0044
            r0 = r4[r1]     // Catch:{ UnknownHostException -> 0x0045 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0045 }
            r2.add(r0)     // Catch:{ UnknownHostException -> 0x0045 }
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0044:
            return r2
        L_0x0045:
            return r5
        L_0x0046:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.1Fn r0 = r0.A00     // Catch:{ Exception -> 0x012c }
            X.1CG r2 = r0.A00     // Catch:{ Exception -> 0x012c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x012c }
            X.1fK r0 = r2.A02()     // Catch:{ all -> 0x007c }
            X.1fL r0 = r0.A01     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0074
            monitor-exit(r2)     // Catch:{ Exception -> 0x012c }
            X.1fM r0 = r0.A01     // Catch:{ Exception -> 0x012c }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x012c }
            int r2 = r1.length     // Catch:{ Exception -> 0x012c }
            r0 = 32
            if (r2 == r0) goto L_0x0073
            java.lang.String r1 = "AuthKeyStoreImpl/the key length is not expected/privateLength="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x012c }
            r0.append(r2)     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x012c }
            r1 = 0
        L_0x0073:
            return r1
        L_0x0074:
            java.lang.String r1 = "AuthKeyStore/failed to get client static key pair"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007c }
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x012c }
            throw r0     // Catch:{ Exception -> 0x012c }
        L_0x007f:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A0D     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            X.1Fi r0 = (X.C24301Fi) r0     // Catch:{ Exception -> 0x012c }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x012c }
            X.1f2 r0 = r0.A0G()     // Catch:{ Exception -> 0x012c }
            X.1f3 r0 = r0.A00     // Catch:{ Exception -> 0x012c }
            byte[] r0 = r0.A02()     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x0098:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = r0.getTagFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x00a9:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.Object[] r0 = r0.getAttributesFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x00d7
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x00c0:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.Object[] r0 = r0.getChildrenFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x00d7
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x00d7:
            r0 = 0
            return r0
        L_0x00d9:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            byte[] r0 = r0.getDataFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x00ea:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = r0.getKeyFromKeyValue(r8)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x00fb:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A09     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = r0.getValueStringFromKeyValue(r8)     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x010c:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x012c }
            X.1Fr r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x012c }
            X.01D r0 = r0.A07     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x012c }
            X.1Fj r0 = (X.C24311Fj) r0     // Catch:{ Exception -> 0x012c }
            X.11s r0 = r0.A00     // Catch:{ Exception -> 0x012c }
            X.1d4 r0 = r0.A07     // Catch:{ Exception -> 0x012c }
            X.1fH r0 = r0.A02()     // Catch:{ Exception -> 0x012c }
            byte[] r2 = r0.A01     // Catch:{ Exception -> 0x012c }
            byte[] r1 = r0.A00     // Catch:{ Exception -> 0x012c }
            X.1fI r0 = new X.1fI     // Catch:{ Exception -> 0x012c }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x012c }
            com.facebook.simplejni.NativeHolder r0 = r0.A00     // Catch:{ Exception -> 0x012c }
            return r0
        L_0x012c:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1Fe r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOO(int, java.lang.Object):java.lang.Object");
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C24331Fm r4 = (C24331Fm) INSTANCE.jniCallbacksIJniCallbacks.A0B.get();
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Object obj3 = map.get(num);
                AnonymousClass00B.A06(obj3);
                arrayList.add(A00((String) obj3, intValue));
            }
            Set<C28861Yb> A0N = r4.A01.A0N(arrayList);
            HashMap hashMap = new HashMap();
            for (C28861Yb r2 : A0N) {
                hashMap.put(Integer.valueOf(r2.A00), r2.A02);
            }
            return hashMap;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = (ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A09.get();
            Object[] objArr = null;
            Object[] array = list != null ? list.toArray() : null;
            if (list2 != null) {
                objArr = list2.toArray();
            }
            return protocolJniHelper.createProtocolTreeNode(str, array, objArr, bArr);
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static native double jvidispatchDIO(int i2, long j2, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i2, long j2, double d2, Object obj);

    public static native long jvidispatchIIIIIIOOOOOOO(long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIIIIIOOOO(long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIOOOOOOOOO(long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIIOOOOOOOOOOOO(long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static native long jvidispatchIIIO(int i2, long j2, long j3, Object obj);

    public static native long jvidispatchIIIOO(long j2, long j3, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i2, long j2, Object obj);

    public static native long jvidispatchIIOO(int i2, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i2, long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOOOO(long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIO(int i2, Object obj);

    public static native long jvidispatchIOO(int i2, Object obj, Object obj2);

    public static native long jvidispatchIOOO(Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOO(int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIOOOOOOOOO(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIOOOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static native Object jvidispatchO(int i2);

    public static native Object jvidispatchOII(long j2, long j3);

    public static native Object jvidispatchOIIIIIIIOOOOOOOOOO(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native Object jvidispatchOIIIOOOO(long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOOO(long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object jvidispatchOIIO(int i2, long j2, long j3, Object obj);

    public static native Object jvidispatchOIIOO(long j2, long j3, Object obj, Object obj2);

    public static native Object jvidispatchOIO(int i2, long j2, Object obj);

    public static native Object jvidispatchOIOO(int i2, long j2, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i2, long j2, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i2, long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i2, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i2, Object obj);

    public static native Object jvidispatchOOO(int i2, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object jvidispatchOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static void setDependencies(C20320zr r3) {
        synchronized (JniBridge.class) {
            if (DEPENDENCIES == null) {
                DEPENDENCIES = r3;
            } else {
                throw new IllegalStateException("JniBridgeDependencies are already set. Can't override them.");
            }
        }
    }

    public byte[] WCIAPIGcmAesCreateEncryptedCiphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
        return (byte[]) jvidispatchOIOOOOO(2, (long) 16, this.wajContext.get(), bArr, bArr2, bArr3, bArr4);
    }
}
