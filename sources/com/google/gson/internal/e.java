package com.google.gson.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: XFMFile */
public final class e implements ObjectConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f397a;

    public /* synthetic */ e(int i2) {
        this.f397a = i2;
    }

    public final Object construct() {
        switch (this.f397a) {
            case 0:
                return new ConcurrentSkipListMap();
            case 1:
                return new ConcurrentHashMap();
            case 2:
                return new TreeMap();
            case 3:
                return new LinkedHashMap();
            case 4:
                return new LinkedTreeMap();
            case 5:
                return new TreeSet();
            case 6:
                return new LinkedHashSet();
            case 7:
                return new ArrayDeque();
            default:
                return new ArrayList();
        }
    }
}
