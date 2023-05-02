package X;

import com.obwhatsapp.data.ConversationDeleteWorker;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4xz  reason: invalid class name and case insensitive filesystem */
public class C101854xz implements AnonymousClass1yq {
    public final /* synthetic */ ConversationDeleteWorker A00;
    public final /* synthetic */ C42561y1 A01;

    public C101854xz(ConversationDeleteWorker conversationDeleteWorker, C42561y1 r2) {
        this.A00 = conversationDeleteWorker;
        this.A01 = r2;
    }

    public void ARM() {
        ConversationDeleteWorker.A0D.addAndGet(-1);
        this.A00.A06();
    }

    public void AVM(int i2, int i3) {
        this.A00.A07(this.A01.A07, i2);
    }

    public void AXP() {
        int max;
        ConversationDeleteWorker.A0D.addAndGet(1);
        C15830rv r4 = this.A01.A07;
        ConversationDeleteWorker conversationDeleteWorker = this.A00;
        ConcurrentHashMap concurrentHashMap = ConversationDeleteWorker.A0B;
        concurrentHashMap.putIfAbsent(r4, new C83674Hp());
        C83674Hp r3 = (C83674Hp) concurrentHashMap.get(r4);
        int A002 = conversationDeleteWorker.A08.A00(r4);
        synchronized (r3) {
            int i2 = r3.A01;
            max = Math.max(0, A002 - i2);
            r3.A01 = i2 + max;
        }
        ConversationDeleteWorker.A0E.addAndGet(max);
    }

    public boolean AfQ() {
        return this.A00.A03;
    }
}
