package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity;
import com.obwhatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.util.Log;

/* renamed from: X.60h  reason: invalid class name and case insensitive filesystem */
public class C1200960h implements C227319b {
    public final AnonymousClass013 A00;
    public final C14710pd A01;
    public final C1204661t A02;
    public final C119365wy A03;
    public final AnonymousClass60V A04;

    public C1200960h(AnonymousClass013 r1, C14710pd r2, C1204661t r3, C119365wy r4, AnonymousClass60V r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static int A00(AnonymousClass4XO r3, int i2) {
        int i3;
        int i4;
        if (i2 <= 0 && r3 != null) {
            synchronized (r3) {
                i3 = r3.A01;
            }
            synchronized (r3) {
                i4 = r3.A02;
            }
            int i5 = r3.A00;
            if (i3 > 0) {
                return i3;
            }
            if (i4 > 0) {
                return i4;
            }
            if (i5 > 0) {
                return i5;
            }
        }
        return i2;
    }

    public static boolean A01(C14550pN r5, C116185qx r6, Runnable runnable, String str, int i2, boolean z2) {
        Intent A042;
        if (i2 == 404) {
            if (z2) {
                StringBuilder A0q = AnonymousClass000.A0q("PAY: ");
                A0q.append(r5);
                A0q.append(" op: ");
                A0q.append(str);
                A0q.append(" payment account error: ");
                A0q.append(i2);
                Log.e(AnonymousClass000.A0h("; restartPaymentsAccountSetupAndFinish", A0q));
                if (runnable != null) {
                    runnable.run();
                }
                A042 = C110105dW.A04(r5, IndiaUpiPaymentsAccountSetupActivity.class);
            }
            return false;
        } else if (i2 == 440) {
            StringBuilder A0q2 = AnonymousClass000.A0q("PAY: ");
            A0q2.append(r5);
            A0q2.append(" op: ");
            A0q2.append(str);
            Log.e(AnonymousClass000.A0h(" tos not accepted; showTosAndFinish", A0q2));
            A042 = C110105dW.A04(r5, IndiaUpiPaymentsTosActivity.class);
            A042.putExtra("extra_show_updated_tos", false);
            if (r6 != null) {
                r6.A00.A3M(A042);
            }
            if (runnable != null) {
                runnable.run();
            }
            r5.A2X(A042, true);
            return true;
        } else if (i2 != 442) {
            if (i2 == 443) {
                StringBuilder A0q3 = AnonymousClass000.A0q("PAY: ");
                A0q3.append(r5);
                A0q3.append(" op: ");
                A0q3.append(str);
                Log.e(AnonymousClass000.A0h(" payment unsupported for client version", A0q3));
                if (runnable != null) {
                    runnable.run();
                }
                A042 = C110105dW.A04(r5, PaymentsUpdateRequiredActivity.class);
                A042.addFlags(335544320);
            }
            return false;
        } else {
            StringBuilder A0q4 = AnonymousClass000.A0q("PAY: ");
            A0q4.append(r5);
            A0q4.append(" op: ");
            A0q4.append(str);
            Log.e(AnonymousClass000.A0h(" tos v2 not accepted; showTosAndFinish", A0q4));
            Intent A043 = C110105dW.A04(r5, IndiaUpiPaymentsTosActivity.class);
            A043.putExtra("extra_show_updated_tos", true);
            if (r6 != null) {
                r6.A00.A3M(A043);
            }
            r5.startActivityForResult(A043, 1000);
            return true;
        }
        if (r6 != null) {
            r6.A00.A3M(A042);
        }
        r5.A2X(A042, true);
        return true;
    }

    public static boolean A02(AnonymousClass5ko r2, String str, int i2, boolean z2) {
        AnonymousClass5ko r0 = r2;
        return A01(r0, new C116185qx(r2), new AnonymousClass64D(r0), str, i2, z2);
    }

    public C119265wo A03(AnonymousClass4XO r2) {
        return A04(r2, 0);
    }

    public C119265wo A04(AnonymousClass4XO r6, int i2) {
        int i3;
        int A002 = A00(r6, i2);
        String ADW = this.A01.A0C(698) ? this.A02.ADW(String.valueOf(A002)) : null;
        if (A002 == 443) {
            i3 = R.string.str1168;
        } else {
            if (!(A002 == 6 || A002 == 7)) {
                if (A002 == 405) {
                    i3 = R.string.str108e;
                } else if (A002 == 406) {
                    i3 = R.string.str108b;
                } else if (A002 == 409) {
                    i3 = R.string.str108c;
                } else if (A002 != 410) {
                    if (A002 != 21137 && A002 != 21138) {
                        switch (A002) {
                            case -2:
                                break;
                            case 400:
                            case 403:
                                i3 = R.string.str10d6;
                                break;
                            case 426:
                                i3 = R.string.str108a;
                                break;
                            case 460:
                                i3 = R.string.str108f;
                                break;
                            case 500:
                            case 4002:
                            case 11500:
                            case 2826004:
                                i3 = R.string.str1031;
                                break;
                            case 503:
                            case 10702:
                            case 11474:
                            case 11484:
                                i3 = R.string.str0fef;
                                break;
                            case 10780:
                            case 11497:
                            case 11537:
                            case 11540:
                                i3 = R.string.str1078;
                                break;
                            case 17009:
                                i3 = R.string.str1923;
                                break;
                            case 21157:
                            case 21164:
                                i3 = R.string.str0f62;
                                break;
                            default:
                                i3 = 0;
                                break;
                        }
                    } else {
                        i3 = R.string.str0f64;
                    }
                } else {
                    i3 = R.string.str108d;
                }
            }
            i3 = R.string.str0df7;
        }
        StringBuilder A0r = AnonymousClass000.A0r("PAY: getErrorString errorCode: ");
        A0r.append(A002);
        A0r.append(" states last error: ");
        A0r.append(r6 != null ? Integer.valueOf(r6.A00) : "null");
        A0r.append(" resId returned: ");
        Log.i(AnonymousClass000.A0l(A0r, i3));
        return new C119265wo(i3, ADW);
    }

    public String AB8(int i2) {
        return null;
    }

    public int AB9(AnonymousClass1ME r2, C35611mD r3, int i2) {
        return -1;
    }

    public String ABA(int i2) {
        return null;
    }

    public String ABB(int i2) {
        if (i2 != 2826003) {
            return null;
        }
        AnonymousClass013 r6 = this.A00;
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, 5, 0);
        return r6.A0J(A1b, R.plurals.plurals0105, 5);
    }

    public String AC1(int i2, String str) {
        String A002 = this.A02.A00(i2);
        return A002 != null ? A002 : str;
    }

    public int AC2(AnonymousClass4XO r2, int i2) {
        return A04((AnonymousClass4XO) null, i2).A00;
    }

    public String AFX(int i2) {
        return null;
    }

    public void AHN(String str) {
        if (str.equals("11456") || str.equals("11471")) {
            Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:")));
            this.A04.A0F();
            C119365wy r1 = this.A03;
            r1.A04.A01();
            r1.A0B();
        }
    }

    public boolean AIi(int i2) {
        return AnonymousClass000.A1R(i2, 11510);
    }

    public boolean AIy(int i2) {
        return AnonymousClass000.A1R(i2, 11482);
    }

    public boolean AIz(int i2) {
        return AnonymousClass000.A1R(i2, 11459);
    }

    public boolean AJ0(int i2) {
        return AnonymousClass000.A1R(i2, 11504);
    }

    public boolean AJ1(int i2) {
        return false;
    }

    public boolean AJ2(int i2) {
        return false;
    }

    public boolean AJ3(int i2) {
        return false;
    }

    public boolean AJ4(int i2) {
        return AnonymousClass000.A1R(i2, 11503);
    }

    public boolean AJ5(int i2) {
        return false;
    }

    public boolean AJ9(int i2) {
        return false;
    }

    public boolean AJA(int i2) {
        return false;
    }

    public boolean AJB(int i2) {
        return false;
    }

    public boolean AJE(int i2) {
        return AnonymousClass000.A1R(i2, 11468);
    }

    public boolean AJF(int i2) {
        return false;
    }

    public boolean AJG(int i2) {
        return false;
    }

    public boolean AJP(int i2) {
        return false;
    }

    public boolean AJQ(int i2) {
        return false;
    }

    public boolean AJW(int i2) {
        return false;
    }

    public boolean AJm(int i2) {
        return i2 == 11455 || i2 == 11502;
    }

    public boolean AJp(int i2) {
        return false;
    }

    public int ALS() {
        return 100000;
    }

    public int ALT() {
        return 10;
    }

    public boolean AfO(int i2) {
        return (AJm(i2) || i2 == 11503 || i2 == 11504 || i2 == 11482 || i2 == 11468) ? false : true;
    }
}
