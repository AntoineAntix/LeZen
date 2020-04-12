# Conception du système initial

- Le projet est un jeu multijoueur, en ligne, dans lequel chaque joueur conduit un robot ("Rover") qui se déplace sur la planete Mars. Celle-ci correspond a une map spherique contenant des obstacles placés aléatoirement afin que chaque partie soit unique. La map a une taille de 10000 cases (100x100). Cela permet aux joueurs de ne pas etre trop proches. Le jeu est comparable à un "Word of Tanks" sur le principe ( le but etant d'etre le dernier survivant).

- Nous avons imaginé un tour de jeu semblable au jeu de guerre "Worms". Il fonctionne au tour par tour. Cela permet à chaque joueur de voir les actions des autres. Le système de tour à tour est comparable au jeu Worms. A chaque jour, le joueur peut effectuer 5 actions (cela permet de mettre en place des stratégies de jeu) parmi les suivantes :
- Avancer
- Reculer
- Tourner à gauche
- Tourner à droite
- Tirer
- (possibilité de mettre un temps de jeu pour passer automatiquement les joueurs AFK)

**********

- L'état de chaque joueur ainsi que le jeu en lui-même sont stocké sur un serveur. A chaque tour, le serveur ouvre une nouvelle instance gérant les données pour la partie en cours. Les données seront stockées sur un serveur principal et chaque partie aura une sauvegarde sur un serveur de secours dedié aux sauvegardes données.Cela evite qu'en cas de panne, les données de tous les joueurs soient perdues. Si le serveur plante, un code erreur est retournée sur l’écran. Le serveur sera rebooté et les parties reprendront là où les sauvegardes ont été effectuées.

- Pour gérer plusieurs parties en même temps, il y aura différentes instances générées sur le serveur. Chaque partie aura son système de tour à tour dans lequel le tour du joueur suivant commence quand celui du joueur actuel se finit.

- Les joueurs s’authentifient à l'aide d'un couplage utilisateur et mot de passe. Sur le serveur principal, la charge de joueurs imprévue est gérée avec une limitation de 50 joueurs par partie et de 2 parties en parallèles au maximum pour l’instant ( le nombre de parties dependra de la taille du serveur dans le futur). Le 101ème joueur ainsi que les suivants qui rejoindront le serveur auront un message d'erreur indiquant que le serveur sature.

*This documentation is written in French. 
Please contact the contributors for more informations.*
