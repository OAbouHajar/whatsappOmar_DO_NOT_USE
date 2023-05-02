package X;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.050  reason: invalid class name */
public final class AnonymousClass050 implements AnonymousClass051, AnonymousClass052 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass06B A0I;
    public final AnonymousClass02C A0J;
    public final ClassLoader A0K;

    @Deprecated
    public AnonymousClass050() {
        this.A0B = new ArrayList();
        this.A0F = true;
        this.A0H = false;
        this.A0I = null;
        this.A0K = null;
    }

    public AnonymousClass050(AnonymousClass02C r4) {
        AnonymousClass06B A0C2 = r4.A0C();
        AnonymousClass061 r0 = r4.A07;
        ClassLoader classLoader = r0 != null ? r0.A01.getClassLoader() : null;
        this.A0B = new ArrayList();
        this.A0F = true;
        this.A0H = false;
        this.A0I = A0C2;
        this.A0K = classLoader;
        this.A04 = -1;
        this.A0J = r4;
    }

    public int A00(boolean z2) {
        if (!this.A0G) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder sb = new StringBuilder("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new AnonymousClass0JD());
                A0H(printWriter, "  ", true);
                printWriter.close();
            }
            this.A0G = true;
            this.A04 = this.A0E ? this.A0J.A0a.getAndIncrement() : -1;
            this.A0J.A0d(this, z2);
            return this.A04;
        }
        throw new IllegalStateException("commit already called");
    }

    public void A01() {
        A00(false);
    }

    public void A02() {
        A00(true);
    }

    public void A03() {
        if (!this.A0E) {
            this.A0F = false;
            this.A0J.A0e(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A04() {
        if (!this.A0E) {
            this.A0F = false;
            this.A0J.A0e(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A05(int i2) {
        if (this.A0E) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i2);
                Log.v("FragmentManager", sb.toString());
            }
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass0W0 r6 = (AnonymousClass0W0) arrayList.get(i3);
                AnonymousClass01A r1 = r6.A05;
                if (r1 != null) {
                    r1.A00 += i2;
                    if (AnonymousClass02C.A02(2)) {
                        StringBuilder sb2 = new StringBuilder("Bump nesting of ");
                        sb2.append(r6.A05);
                        sb2.append(" to ");
                        sb2.append(r6.A05.A00);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    public void A06(AnonymousClass01A r3) {
        AnonymousClass02C r1 = r3.A0H;
        if (r1 == null || r1 == this.A0J) {
            A0G(new AnonymousClass0W0(r3, 4));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A07(AnonymousClass01A r3) {
        AnonymousClass02C r1 = r3.A0H;
        if (r1 == null || r1 == this.A0J) {
            A0G(new AnonymousClass0W0(r3, 3));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A08(AnonymousClass01A r3) {
        AnonymousClass02C r1 = r3.A0H;
        if (r1 == null || r1 == this.A0J) {
            A0G(new AnonymousClass0W0(r3, 5));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A09(AnonymousClass01A r3, int i2) {
        A0F(r3, (String) null, i2, 1);
    }

    public void A0A(AnonymousClass01A r2, int i2) {
        A0E(r2, (String) null, i2);
    }

    public void A0B(AnonymousClass01A r4, C011005f r5) {
        AnonymousClass02C r0 = r4.A0H;
        AnonymousClass02C r2 = this.A0J;
        if (r0 != r2) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(r2);
            throw new IllegalArgumentException(sb.toString());
        } else if (r5 == C011005f.INITIALIZED && r4.A03 > -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle to ");
            sb2.append(r5);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        } else if (r5 != C011005f.DESTROYED) {
            A0G(new AnonymousClass0W0(r4, r5));
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot set maximum Lifecycle to ");
            sb3.append(r5);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public void A0C(AnonymousClass01A r3, String str) {
        A0F(r3, str, 0, 1);
    }

    public void A0D(AnonymousClass01A r2, String str, int i2) {
        A0F(r2, str, i2, 1);
    }

    public void A0E(AnonymousClass01A r3, String str, int i2) {
        if (i2 != 0) {
            A0F(r3, str, i2, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void A0F(AnonymousClass01A r5, String str, int i2, int i3) {
        Class<?> cls = r5.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            String str2 = r5.A0R;
            if (str2 == null || str.equals(str2)) {
                r5.A0R = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(r5);
                sb2.append(": was ");
                sb2.append(r5.A0R);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = r5.A02;
                if (i4 == 0 || i4 == i2) {
                    r5.A02 = i2;
                    r5.A01 = i2;
                } else {
                    StringBuilder sb3 = new StringBuilder("Can't change container ID of fragment ");
                    sb3.append(r5);
                    sb3.append(": was ");
                    sb3.append(r5.A02);
                    sb3.append(" now ");
                    sb3.append(i2);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("Can't add fragment ");
                sb4.append(r5);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        A0G(new AnonymousClass0W0(r5, i3));
        r5.A0H = this.A0J;
    }

    public void A0G(AnonymousClass0W0 r2) {
        this.A0B.add(r2);
        r2.A01 = this.A02;
        r2.A02 = this.A03;
        r2.A03 = this.A05;
        r2.A04 = this.A06;
    }

    public void A0H(PrintWriter printWriter, String str, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0A);
            printWriter.print(" mIndex=");
            printWriter.print(this.A04);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A0G);
            if (this.A07 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A07));
            }
            if (!(this.A02 == 0 && this.A03 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A02));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (!(this.A05 == 0 && this.A06 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A05));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A06));
            }
            if (!(this.A01 == 0 && this.A09 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.A01));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A09);
            }
            if (!(this.A00 == 0 && this.A08 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.A00));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A08);
            }
        }
        ArrayList arrayList = this.A0B;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0W0 r4 = (AnonymousClass0W0) arrayList.get(i2);
                int i3 = r4.A00;
                switch (i3) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(i3);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r4.A05);
                if (z2) {
                    if (!(r4.A01 == 0 && r4.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A02));
                    }
                    if (r4.A03 != 0 || r4.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A04));
                    }
                }
            }
        }
    }

    public void A0I(String str) {
        if (this.A0F) {
            this.A0E = true;
            this.A0A = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public boolean A9O(ArrayList arrayList, ArrayList arrayList2) {
        if (AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.A0E) {
            return true;
        }
        AnonymousClass02C r1 = this.A0J;
        ArrayList arrayList3 = r1.A0E;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            r1.A0E = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i2 = this.A04;
        if (i2 >= 0) {
            sb.append(" #");
            sb.append(i2);
        }
        String str = this.A0A;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }
}
