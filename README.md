# OptimaMC
There are alot of things in the Minecraft 1.8.9 source code that dont need to be there, or no longer need to be there.
This modification aims to remove those, and add other needed fixes to the code for peak performance and behavior.

Some of these enhancements include : <br>
  - OptiFine M6 pre2 Source integration
  - Removing unused variables and fields (Such as ```AtomicInteger field_175373_f``` in ```GuiMainMenu```)
  - Removing all traces of Twitch, Realms, and Demo from the client (Twitch never worked, noone uses realms, and who the hell is gonna play a 7 year old demo)
  - Adding nullchecks to the Scoreboard class to remove the annoying log spam
  - Removing all of OptiFine's Reflector Forge checks
  - Removing the ```net.minecraftforge``` package and all references
  - Fixing the Mouse Delay
  - Removing the annoying "Needed to grow BufferBuilder buffer" log spam (This is not an error but rather a debug message that doesn't need to be seen)
  - Removing "Item entity XXX has no item?" (Once again a debug message)
  - Very badly removing the error caused by ```NetHandlerPlayClient.handleSpawnPlayer``` (It seems very hacky)
  - Fixed Third-Person Camera colliding with non-full blocks (Grass, Dead Bushes, etc.)
  - Removed the chunk of code that is responsible for the black box rendering when in the void, and above the void (The sky is actually a sky)
  - Fixed ```ServerPinger``` so it doesnt take 3000 years to load more than 6 servers and also doesnt ddos anymore
  - Better controls menu with search bar
  - COMPLETELY removed anything relating to Demo, and Stream
  - Removing all snooper mechanics (0.0001% faster)
  - Reimplemented the Loading Bar on world creation because it was always there, it just needed some motivation to get working

Some planned enhancements include :
  - The use of LWJGLX
  - Fixing the scrollbar offseting in ```GuiNewChat```
  - Fix the player not rendering when looking in certain directions of below a certain Y-Level
  - Updating libraries
  - Fixing the glitch where your arm moves up and to the left randomly
  - Async screenshot
  - Multithreaded chunk loading
</br>
