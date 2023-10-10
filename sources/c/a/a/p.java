package c.a.a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* loaded from: classes.dex */
class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f45a;
    private static int[] bf = {32949031};
    private static int[] be = {39544066, 17934143, 76592741, 43882355};

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(g gVar) {
        this.f45a = gVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String C(java.lang.String r11) {
        /*
        L0:
            r5 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r2 = r5.toCharArray()
            r0 = 0
        Lc:
            int r3 = r2.length
            if (r0 >= r3) goto L8f
            int r3 = r0 % 4
            switch(r3) {
                case 0: goto L32;
                case 1: goto L51;
                case 2: goto L70;
                default: goto L14;
            }
        L14:
            char r3 = r2[r0]
            r3 = r3 ^ (-1)
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.p.be
            r8 = 0
            r8 = r7[r8]
            if (r8 < 0) goto L2f
        L25:
            r7 = 43380629(0x295ef95, float:2.2031096E-37)
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 > 0) goto L2f
            goto L25
        L2f:
            int r0 = r0 + 1
            goto Lc
        L32:
            char r3 = r2[r0]
            r4 = 219123(0x357f3, float:3.07057E-40)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.p.be
            r8 = 1
            r8 = r7[r8]
            if (r8 < 0) goto L50
            r7 = 5362800(0x51d470, float:7.514883E-39)
        L48:
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 == 0) goto L0
            goto L50
            goto L48
        L50:
            goto L2f
        L51:
            char r3 = r2[r0]
            r4 = 1478456856(0x581f7618, float:7.013182E14)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.p.be
            r8 = 2
            r8 = r7[r8]
            if (r8 < 0) goto L6f
            r7 = 88975377(0x54da811, float:9.6699226E-36)
        L67:
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 == 0) goto L0
            goto L6f
            goto L67
        L6f:
            goto L2f
        L70:
            char r3 = r2[r0]
            r4 = 527634472(0x1f731028, float:5.1470616E-20)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.p.be
            r8 = 3
            r8 = r7[r8]
            if (r8 < 0) goto L8e
            r7 = 54949152(0x3467520, float:5.8321423E-37)
        L86:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L8e
            goto L86
        L8e:
            goto L2f
        L8f:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.p.C(java.lang.String):java.lang.String");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        do {
            this.f45a.startActivity(new Intent(C("垒癶၌ﾍ垜癱၌\uffd1垚癶ၜﾚ垝癬ဆﾞ垐癬၁ﾐ垝瘶ၾﾶ垶癏").intern(), Uri.parse(b.l)));
            i = bf[0];
            if (i < 0) {
                return;
            }
        } while (i % (93407413 ^ i) == 0);
    }
}
