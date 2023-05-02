package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.1SO  reason: invalid class name */
public final class AnonymousClass1SO extends HashMap<UserJid, Integer> {
    public static List A00;

    static {
        LinkedList linkedList = new LinkedList();
        List A0B = C003101j.A0B(C008203t.A03(0, 21));
        Collections.shuffle(A0B);
        linkedList.addAll(A0B);
        A00 = linkedList;
    }

    public /* bridge */ Integer A00(UserJid userJid) {
        return (Integer) super.get(userJid);
    }

    public /* bridge */ boolean A01(UserJid userJid) {
        return super.containsKey(userJid);
    }

    public void clear() {
        super.clear();
        LinkedList linkedList = new LinkedList();
        List A0B = C003101j.A0B(C008203t.A03(0, 21));
        Collections.shuffle(A0B);
        linkedList.addAll(A0B);
        A00 = linkedList;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof UserJid)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof UserJid) || !(obj2 instanceof Integer)) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }
}
