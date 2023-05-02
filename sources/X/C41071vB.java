package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Pair;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.SerializableLocation;
import com.obwhatsapp.SerializablePoint;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1vB  reason: invalid class name and case insensitive filesystem */
public class C41071vB {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = C28541Wm.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = AnonymousClass2L0.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e2);
            throw new AssertionError(e2);
        }
    }

    public static int A0J(Object obj) {
        try {
            return A00.getInt(A01.get(obj));
        } catch (IllegalAccessException e2) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e2);
            throw new AssertionError(e2);
        }
    }

    public static Pair A0K(DeviceJid deviceJid, Jid jid, Jid jid2) {
        if (C16030sJ.A0L(jid) || C16030sJ.A0G(jid)) {
            if (deviceJid != null) {
                jid2 = deviceJid;
            }
        } else if (C16030sJ.A0G(jid2)) {
            if (deviceJid != null) {
                jid = deviceJid;
            }
            Jid jid3 = jid2;
            jid2 = jid;
            jid = jid3;
        } else if (deviceJid != null) {
            jid = deviceJid;
        }
        return new Pair(jid, jid2);
    }

    public static List A0L(C16750ta r11) {
        int length;
        InteractiveAnnotation[] interactiveAnnotationArr = r11.A0V;
        if (interactiveAnnotationArr == null || (length = interactiveAnnotationArr.length) <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        do {
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i2];
            C28581Wr A0U = C58562th.A04.A0U();
            int i3 = 0;
            while (true) {
                SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                if (i3 < serializablePointArr.length) {
                    if (serializablePointArr[i3] != null) {
                        C28581Wr A0U2 = C58782u6.A05.A0U();
                        double d2 = interactiveAnnotation.polygonVertices[i3].f147x;
                        A0U2.A03();
                        C58782u6 r8 = (C58782u6) A0U2.A00;
                        r8.A02 |= 4;
                        r8.A00 = d2;
                        double d3 = interactiveAnnotation.polygonVertices[i3].f148y;
                        A0U2.A03();
                        C58782u6 r82 = (C58782u6) A0U2.A00;
                        r82.A02 |= 8;
                        r82.A01 = d3;
                        C28541Wm A02 = A0U2.A02();
                        A0U.A03();
                        C58562th r2 = (C58562th) A0U.A00;
                        AnonymousClass1XE r1 = r2.A02;
                        if (!((AnonymousClass1XF) r1).A00) {
                            r1 = C28541Wm.A0G(r1);
                            r2.A02 = r1;
                        }
                        r1.add(A02);
                    }
                    i3++;
                } else {
                    C28581Wr A0U3 = C58572ti.A04.A0U();
                    double d4 = interactiveAnnotation.serializableLocation.latitude;
                    A0U3.A03();
                    C58572ti r10 = (C58572ti) A0U3.A00;
                    r10.A02 |= 1;
                    r10.A00 = d4;
                    double d5 = interactiveAnnotation.serializableLocation.longitude;
                    A0U3.A03();
                    C58572ti r102 = (C58572ti) A0U3.A00;
                    r102.A02 |= 2;
                    r102.A01 = d5;
                    String str = interactiveAnnotation.serializableLocation.name;
                    A0U3.A03();
                    C58572ti r12 = (C58572ti) A0U3.A00;
                    r12.A02 |= 4;
                    r12.A03 = str;
                    C28541Wm A022 = A0U3.A02();
                    A0U.A03();
                    C58562th r13 = (C58562th) A0U.A00;
                    r13.A03 = A022;
                    r13.A00 = 2;
                    arrayList.add(A0U.A02());
                    i2++;
                }
            }
        } while (i2 < length);
        return arrayList;
    }

    public static void A0M(C16750ta r17, List list) {
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C58562th r6 = (C58562th) it.next();
                SerializablePoint[] serializablePointArr = new SerializablePoint[r6.A02.size()];
                int i2 = 0;
                while (true) {
                    if (i2 < r6.A02.size()) {
                        C58782u6 r5 = (C58782u6) r6.A02.get(i2);
                        int i3 = r5.A02;
                        if ((i3 & 1) == 1 || (i3 & 2) == 2) {
                            Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
                        } else {
                            serializablePointArr[i2] = new SerializablePoint(r5.A00, r5.A01);
                            i2++;
                        }
                    } else {
                        int i4 = r6.A00;
                        arrayList.add(new InteractiveAnnotation(new SerializableLocation((i4 == 2 ? (C58572ti) r6.A03 : C58572ti.A04).A03, (i4 == 2 ? (C58572ti) r6.A03 : C58572ti.A04).A00, (i4 == 2 ? (C58572ti) r6.A03 : C58572ti.A04).A01), serializablePointArr));
                    }
                }
                Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
            }
            r17.A0V = (InteractiveAnnotation[]) arrayList.toArray(new InteractiveAnnotation[0]);
        }
    }

    public static boolean A0N(AnonymousClass1WV r3, C16740tZ r4) {
        if (r3 != null) {
            C15830rv r1 = r4.A11.A00;
            if ((r1 instanceof UserJid) || C16030sJ.A0L(r1)) {
                return true;
            }
            if (C16030sJ.A0H(r1)) {
                return C42881yp.A02(r4.A0C, 4);
            }
        }
        return false;
    }

    public static boolean A0O(AnonymousClass1WV r2, C16740tZ r3, byte[] bArr) {
        if (r3.A0D() != null || r3.A10(1024) || r3.A10(1) || r3.A10(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) || ((!TextUtils.isEmpty(r3.A0f) && !TextUtils.isEmpty(r3.A0e)) || (!TextUtils.isEmpty(r3.A0k)) || r3.A0y() || A0N(r2, r3))) {
            return true;
        }
        if (bArr != null && C16030sJ.A0H(r3.A11.A00)) {
            return true;
        }
        AnonymousClass21U r0 = r3.A0J;
        return r0 != null && (r0 instanceof AnonymousClass21V);
    }
}
