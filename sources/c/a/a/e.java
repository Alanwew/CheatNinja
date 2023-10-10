package c.a.a;
/* loaded from: classes.dex */
class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f31a;
    private static int[] X = {39169045, 53512616, 65488758, 37960489, 56927048, 24459029, 40865666};
    private static int[] W = {93435310, 73901731, 52000223, 43529553};

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar) {
        this.f31a = cVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String n(java.lang.String r11) {
        /*
        L0:
            r5 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r2 = r5.toCharArray()
            r0 = 0
        Lc:
            int r3 = r2.length
            if (r0 >= r3) goto L94
            int r3 = r0 % 4
            switch(r3) {
                case 0: goto L35;
                case 1: goto L56;
                case 2: goto L75;
                default: goto L14;
            }
        L14:
            char r3 = r2[r0]
            r3 = r3 ^ (-1)
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.e.W
            r8 = 0
            r8 = r7[r8]
            if (r8 < 0) goto L32
        L25:
            r7 = 53410801(0x32efbf1, float:5.142322E-37)
            r7 = r7 ^ r8
            int r7 = r8 % r7
            r8 = 93435310(0x591b5ae, float:1.3702473E-35)
            if (r7 == r8) goto L32
            goto L25
        L32:
            int r0 = r0 + 1
            goto Lc
        L35:
            char r3 = r2[r0]
            r4 = 282428(0x44f3c, float:3.95766E-40)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.e.W
            r8 = 1
            r8 = r7[r8]
            if (r8 < 0) goto L55
            r7 = 78551896(0x4ae9b58, float:4.1049864E-36)
            r7 = r7 ^ r8
            r7 = r8 & r7
            r8 = 4269219(0x4124a3, float:5.98245E-39)
            if (r7 != r8) goto L55
            goto L55
        L55:
            goto L32
        L56:
            char r3 = r2[r0]
            r4 = 1484715854(0x587ef74e, float:1.1213525E15)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.e.W
            r8 = 2
            r8 = r7[r8]
            if (r8 < 0) goto L74
            r7 = 36170169(0x227e9b9, float:1.2336297E-37)
        L6c:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L74
            goto L6c
        L74:
            goto L32
        L75:
            char r3 = r2[r0]
            r4 = -1197406341(0xffffffffb8a1077b, float:-7.6784716E-5)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.e.W
            r8 = 3
            r8 = r7[r8]
            if (r8 < 0) goto L93
            r7 = 72232070(0x44e2c86, float:2.4235628E-36)
        L8b:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L93
            goto L8b
        L93:
            goto L32
        L94:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.e.n(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r9 = this;
        L0:
            r3 = r9
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> Lde
            java.lang.String r1 = c.a.a.b.k     // Catch: java.io.IOException -> Lde
            r0.<init>(r1)     // Catch: java.io.IOException -> Lde
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> Lde
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> Lde
            java.lang.String r1 = "佻\uf70bܯ"
            java.lang.String r1 = n(r1)     // Catch: java.io.IOException -> Lde
            java.lang.String r1 = r1.intern()     // Catch: java.io.IOException -> Lde
            r0.setRequestMethod(r1)     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 0
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto L32
            r5 = 25356968(0x182eaa8, float:4.8091173E-38)
            r5 = r5 ^ r6
            int r5 = r6 % r5
            r6 = 39169045(0x255ac15, float:1.5698154E-37)
            if (r5 != r6) goto L32
            goto L32
        L32:
            r1 = 1
            r0.setInstanceFollowRedirects(r1)     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 1
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto L4a
            r5 = 80906312(0x4d28848, float:4.9495917E-36)
        L42:
            r5 = r5 ^ r6
            r5 = r6 & r5
            if (r5 == 0) goto L0
            goto L4a
            goto L42
        L4a:
            r1 = 100
            r0.setConnectTimeout(r1)     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 2
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto L65
        L58:
            r5 = 69366892(0x422746c, float:1.9096467E-36)
            r5 = r5 ^ r6
            r5 = r6 & r5
            r6 = 63243026(0x3c50312, float:1.1579324E-36)
            if (r5 == r6) goto L65
            goto L58
        L65:
            r1 = 100
            r0.setReadTimeout(r1)     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 3
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto L7e
            r5 = 24293777(0x172b191, float:4.4575778E-38)
        L76:
            r5 = r5 ^ r6
            int r5 = r6 % r5
            if (r5 == 0) goto L0
            goto L7e
            goto L76
        L7e:
            java.lang.String r1 = "使\uf721ܕﾑ余\uf72d\u070fﾖ体\uf720"
            java.lang.String r1 = n(r1)     // Catch: java.io.IOException -> Lde
            java.lang.String r1 = r1.intern()     // Catch: java.io.IOException -> Lde
            java.lang.String r2 = "佟\uf722ܔﾌ余"
            java.lang.String r2 = n(r2)     // Catch: java.io.IOException -> Lde
            java.lang.String r2 = r2.intern()     // Catch: java.io.IOException -> Lde
            r0.setRequestProperty(r1, r2)     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 4
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto Lab
            r5 = 52921845(0x32785f5, float:4.9230664E-37)
            r5 = r5 ^ r6
            r5 = r6 & r5
            r6 = 4203016(0x402208, float:5.88968E-39)
            if (r5 != r6) goto Lab
            goto Lab
        Lab:
            r0.connect()     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 5
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto Lc4
        Lb7:
            r5 = 12413344(0xbd69a0, float:1.73948E-38)
            r5 = r5 ^ r6
            r5 = r6 & r5
            r6 = 20977173(0x1401615, float:3.5280674E-38)
            if (r5 == r6) goto Lc4
            goto Lb7
        Lc4:
            r0.disconnect()     // Catch: java.io.IOException -> Lde
            int[] r5 = c.a.a.e.X     // Catch: java.io.IOException -> Lde
            r6 = 6
            r6 = r5[r6]     // Catch: java.io.IOException -> Lde
            if (r6 < 0) goto Ldd
        Ld0:
            r5 = 92209110(0x57effd6, float:1.1990012E-35)
            r5 = r5 ^ r6
            r5 = r6 & r5
            r6 = 33619968(0x2010000, float:9.477423E-38)
            if (r5 == r6) goto Ldd
            goto Ld0
        Ldd:
            return
        Lde:
            r0 = move-exception
            goto Ldd
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.e.run():void");
    }
}
