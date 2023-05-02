package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.393  reason: invalid class name */
public class AnonymousClass393 {
    public final LinkedList A00 = new LinkedList();

    public C455829l A00(List list) {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            C89344c0 r2 = (C89344c0) linkedList.removeLast();
            r2.A01(list);
            if ((r2 instanceof C76913ut) && !linkedList.isEmpty()) {
                C89344c0 r1 = (C89344c0) linkedList.getLast();
                if ((r1 instanceof AnonymousClass332) && r1.A00 == r2.A00) {
                    A00(list);
                }
            } else if (r2 instanceof C76893ur) {
                return r2.A00;
            }
        }
        return null;
    }

    public String A01(List list) {
        JSONObject A0J = C13700nu.A0J();
        A0J.put("version", 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C89344c0 r3 = (C89344c0) it.next();
            JSONObject A0J2 = C13700nu.A0J();
            A0J2.put("shape_index", list.indexOf(r3.A00));
            A0J2.put("type", r3.A00());
            r3.A03(A0J2);
            jSONArray.put(A0J2);
        }
        A0J.put(FacebookFacade.RequestParameter.ACTIONS, jSONArray);
        return A0J.toString();
    }
}
