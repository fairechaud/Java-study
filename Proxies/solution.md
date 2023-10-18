To change the script to use random SOCKS5 proxies from a file called proxies.txt in the format of hostname:port or username:password@host:port, you can do the following:

Add a new class variable called proxies and initialize it to an empty dictionary.
Add a new method called getRandomProxy(), which will randomly select a proxy from the proxies dictionary and return it.
Update the join() method to use the getRandomProxy() method to select a proxy before connecting to the Minecraft server.

To use the updated script, you will need to create a file called proxies.txt and add a list of SOCKS5 proxies to it, in the format of hostname:port or username:password@host:port. Once you have created the file, you can start the script as usual. The script will now randomly select a proxy from the file before connecting to the Minecraft server.