class Bot {
    constructor(username, target) {
        this.target = target;
        this.username = username;
        this.targethost = target.split(":")[0];
        this.targetport = target.split(":")[1];
        this.password = null;
        this.bot = null;
        this.lastspam = 0;
        this.spamming = false;
        this.spamdelaymin = 0;
        this.spamdelaymax = 0;
        this.spammessage = "";
        this.registerstate = 0;
        this.loginstate = 0;
        this.stopped = false;
        this.proxies = {};
        this.init();
    }

    async getRandomProxy() {
        const proxyList = await util.readLinesFromFile("proxies.txt");
        const randomProxy = proxyList[Math.floor(Math.random() * proxyList.length)];
        return randomProxy;
    }

    async join() {
        if (this.stopped) {
            return;
        }
        console.log(`[${this.username}] Joining`);
        const mineflayer = require('mineflayer');

        const proxy = await this.getRandomProxy();
        const proxyOptions = {};
        if (proxy.includes("@")) {
            const proxyParts = proxy.split("@");
            proxyOptions.host = proxyParts[1].split(":")[0];
            proxyOptions.port = proxyParts[1].split(":")[1];
            proxyOptions.username = proxyParts[0];
            proxyOptions.password = proxyParts[0];
        } else {
            proxyOptions.host = proxy.split(":")[0];
            proxyOptions.port = proxy.split(":")[1];
        }

        this.bot = mineflayer.createBot({
            host: this.targethost,
            port: this.targetport,
            username: this.username,
            auth: 'offline',
            proxy: proxyOptions,
        });

        // ... rest of the code remains the same ...
    }

    // ... other methods remain the same ...
}
