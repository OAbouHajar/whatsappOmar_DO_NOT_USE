package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: XFMFile */
public abstract class m implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public n f414a;

    /* renamed from: b  reason: collision with root package name */
    public n f415b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f416c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinkedTreeMap f417d;

    public m(LinkedTreeMap linkedTreeMap) {
        this.f417d = linkedTreeMap;
        this.f414a = linkedTreeMap.f300e.f421d;
        this.f416c = linkedTreeMap.f299d;
    }

    public final n a() {
        n nVar = this.f414a;
        LinkedTreeMap linkedTreeMap = this.f417d;
        if (nVar == linkedTreeMap.f300e) {
            throw new NoSuchElementException();
        } else if (linkedTreeMap.f299d == this.f416c) {
            this.f414a = nVar.f421d;
            this.f415b = nVar;
            return nVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f414a != this.f417d.f300e;
    }

    public final void remove() {
        n nVar = this.f415b;
        if (nVar != null) {
            LinkedTreeMap linkedTreeMap = this.f417d;
            linkedTreeMap.d(nVar, true);
            this.f415b = null;
            this.f416c = linkedTreeMap.f299d;
            return;
        }
        throw new IllegalStateException();
    }
}
