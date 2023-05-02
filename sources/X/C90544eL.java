package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4eL  reason: invalid class name and case insensitive filesystem */
public final class C90544eL {
    public static C88854bC getFieldSetter(Class cls, String str) {
        try {
            return new C88854bC(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public static void populateMultiset(C109985Uo r3, ObjectInputStream objectInputStream, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            r3.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void writeMultimap(AnonymousClass5T4 r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.asMap().size());
        Iterator A0y = AnonymousClass000.A0y(r2.asMap());
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeInt(((Collection) A0z.getValue()).size());
            for (Object writeObject : (Collection) A0z.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static void writeMultiset(C109985Uo r2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r2.entrySet().size());
        for (C87494Wz r1 : r2.entrySet()) {
            objectOutputStream.writeObject(r1.getElement());
            objectOutputStream.writeInt(r1.getCount());
        }
    }
}
