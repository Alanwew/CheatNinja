package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class t implements DialogInterface.OnClickListener {
    private static int[] bb = {69795752, 16978114, 48334932, 97889761};

    /* renamed from: a  reason: collision with root package name */
    private final q f51a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(q qVar) {
        this.f51a = qVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String B(java.lang.String r11) {
        /*
        L0:
            r5 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r2 = r5.toCharArray()
            r0 = 0
        Lc:
            int r3 = r2.length
            if (r0 >= r3) goto L91
            int r3 = r0 % 4
            switch(r3) {
                case 0: goto L33;
                case 1: goto L52;
                case 2: goto L70;
                default: goto L14;
            }
        L14:
            char r3 = r2[r0]
            r3 = r3 ^ (-1)
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.t.bb
            r8 = 0
            r8 = r7[r8]
            if (r8 < 0) goto L30
            r7 = 22384945(0x1559131, float:3.922609E-38)
        L28:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L30
            goto L28
        L30:
            int r0 = r0 + 1
            goto Lc
        L33:
            char r3 = r2[r0]
            r4 = 297474(0x48a02, float:4.1685E-40)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.t.bb
            r8 = 1
            r8 = r7[r8]
            if (r8 < 0) goto L51
            r7 = 69577726(0x425abfe, float:1.9474632E-36)
        L49:
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 == 0) goto L0
            goto L51
            goto L49
        L51:
            goto L30
        L52:
            char r3 = r2[r0]
            r4 = 1485788481(0x588f5541, float:1.2607706E15)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.t.bb
            r8 = 2
            r8 = r7[r8]
            if (r8 < 0) goto L6f
        L65:
            r7 = 63466615(0x3c86c77, float:1.1779846E-36)
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 > 0) goto L6f
            goto L65
        L6f:
            goto L30
        L70:
            char r3 = r2[r0]
            r4 = -303352394(0xffffffffedeb35b6, float:-9.099239E27)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.t.bb
            r8 = 3
            r8 = r7[r8]
            if (r8 < 0) goto L90
            r7 = 31220424(0x1dc62c8, float:8.095698E-38)
            r7 = r7 ^ r8
            r7 = r8 & r7
            r8 = 67210529(0x4018d21, float:1.522868E-36)
            if (r7 != r8) goto L90
            goto L90
        L90:
            goto L30
        L91:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.t.B(java.lang.String):java.lang.String");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
    }
}
