package top.oply.opuslib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: XFMFile */
public class OpusTrackInfo$AudioPlayList implements Serializable {
    public static final long serialVersionUID = 1234567890987654321L;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f137a = new ArrayList(32);

    public void add(Map<String, Object> map) {
        this.f137a.add(map);
    }

    public void clear() {
        this.f137a.clear();
    }

    public List<Map<String, Object>> getList() {
        return this.f137a;
    }

    public boolean isEmpty() {
        return this.f137a.isEmpty();
    }

    public int size() {
        return this.f137a.size();
    }
}
