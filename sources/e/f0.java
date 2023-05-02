package e;

import com.squareup.picasso.Picasso;
import java.util.concurrent.FutureTask;

/* compiled from: XFMFile */
public final class f0 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final i f1637a;

    public f0(i iVar) {
        super(iVar, (Object) null);
        this.f1637a = iVar;
    }

    public final int compareTo(Object obj) {
        i iVar = this.f1637a;
        Picasso.Priority priority = iVar.f1665s;
        i iVar2 = ((f0) obj).f1637a;
        Picasso.Priority priority2 = iVar2.f1665s;
        return priority == priority2 ? iVar.f1647a - iVar2.f1647a : priority2.ordinal() - priority.ordinal();
    }
}
