# Minecraft Player Crasher
Crash Minecraft Players XDD

WARNING: This plugin works only on 1.8.8 Spigot, in my case I used Paper Spigot.
It WILL NOT work on other server versions than this without recoding.
If you want I can make mutli version support, but tell me on my discord (link at the bottom)

You are here probably of this video: https://www.youtube.com/watch?v=nAnpaccFFs4

Important: Make good use of it! It's mean to crash innocents :(

Command usage: /crash (player) (method).
Available methods: explosion, position

Tested clients version 1.8.9, 1.12.2, 1.16, 1.16.4, 1.16.5;
Currently crashes any client: Forge, BLC, Lunar, BlazingPack, marCloudClient, Flux, Aristois, Huzuni, RemixClient, LiquidBounce(forge).

You can code your own methods to crash, just send a packet with giant values as args such as Double.MAX_VALUE.
This exploit technically can be patched, but probably will never be. Just make limit packet fields for example if something is bigger than Double.MAX_VALUE/2, cancel the packet. However there are other like explosion, which lag the game itself, so if someone patches the packet size, just gonna send ton of explosions so they lag out eitherway. So you can own your players omg. That sounds bad...

Support or stuff: https://discord.gg/yaftWcn/
